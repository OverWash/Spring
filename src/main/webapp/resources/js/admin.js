var token = $("meta[name='_csrf']").attr("content");
var header = $("meta[name='_csrf_header']").attr("content");
$.ajax({
  type: "get",
  url: "/admin/payment",
  complete: (res) => {
    jQuery.ajaxSetup({
      beforeSend: function (xhr) {
        xhr.setRequestHeader(header, token);
      },
    });
  },
  success: (res) => {
    console.log(res);
  },
});
