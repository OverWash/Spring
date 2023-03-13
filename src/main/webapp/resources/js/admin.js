var token = $("meta[name='_csrf']").attr("th:content");
var header = $("meta[name='_csrf_header']").attr("th:content");
// $.ajax({
//   type: "get",
//   url: "/admin/payment",
//   dataType: "JSON",
//   complete: (res) => {
//     jQuery.ajaxSetup({
//       beforeSend: function (xhr) {
//         xhr.setRequestHeader(header, token);
//       },
//     });
//   },
//   success: (res) => {
//     console.log(res);
//   },
// });

const api = (function () {
  const getPayment = (callback) => {
    $.ajax({
      type: "GET",
      url: "/admin/payment",
      dataType: "JSON",
      success: function (result) {
        if (callback) callback(result);
      },
    });
  };

  const getComplete = (callback) => {
    $.ajax({
      type: "GET",
      url: "/admin/confirmed",
      dataType: "JSON",
      success: function (result) {
        if (callback) callback(result);
      },
    });
  };
  // 세탁완료 처리
  const washingComplete = (data, callback) => {
    $.ajax({
      type: "post",
      url: "/admin/complete",
      dataType: "JSON",
      contentType: "application/json;charset=utf-8",
      complete: (res) => {
        jQuery.ajaxSetup({
          beforeSend: function (xhr) {
            xhr.setRequestHeader(header, token);
          },
        });
      },
      data: JSON.stringify(data),
      success: function (result) {
        if (callback) callback(result);
      },
    });
  };
  return {
    getPayment: getPayment,
    getComplete: getComplete,
    washingComplete: washingComplete,
  };
})();

api.getPayment(
  (res = (data) => {
    var html = "";
    console.log(data);
    if (data.paymentRequests) {
      $(data.paymentRequests).each((confirm) => {
        html += "<tr>";
        html += "<td>" + confirm.confirmId + "</td>";
        html += "<td>" + confirm.reservation.member.nickname + "</td>";
        html += "<td>" + confirm.confirmDate + "</td>";
        html += "<td>" + confirm.reservation.reservationStatus + "</td>";
        html += "</tr>";
      });
    } else {
      html += "<div>데이터가 존재하지 않습니다.</div>";
    }
    $(".reservationList").empty();
    $(".reservationList").append(html);
  })
);

api.getComplete(
  (res = (data) => {
    if (data.reservationConfirmedPaging.total !== 0) {
      var html = "";
      const result = data.reservationConfirmeds;
      console.log(result)
      $(result).each(function (i) {
        html += "<div class='item-flexBox'>";
        html += "<span> No." + result[i].confirmId + "&nbsp</span>";
        html +=
          "<span>" + result[i].reservation.member.nickname + "&nbsp</span>";
        html += "<span>" + result[i].confirmDate + "&nbsp</span>";
        html +=
          "<span>" + result[i].reservation.reservationStatus + "&nbsp</span>";
        html += "<span>" + result[i].reservation.reservationId + "&nbsp</span>";
        html +=
          "<span><button class='laundry-complete' value="+i+">세탁완료</button></span>";
        html +=
          "<input type='hidden' value= "+ result[i].confirmId +" id='confirmId"+i+"'/>";
        html +=
          "<input type='hidden' value= "+ result[i].reservation.reservationId +" id='reservationId"+i+"'/>";
        html += "</div>";
      });
    } else {
      html += "<div>데이터가 존재하지 않습니다.</div>";
    }
    $(".reservationList").empty();
    $("#reservationList").append(html);
    $(".item-flexBox").css({
      display: "flex",
      "place-content": "space-around",
    });

    $(".laundry-complete").on("click", function(){
      let idx = parseInt(this.value);
      api.washingComplete(
        {
          confirmId: $("#confirmId" + idx).val(),
          reservation: {
            reservationId: $("#reservationId" + idx).val(),
            reservationStatus: "세탁완료",
          },
        }
      );
    });
  })
);
