var token = $("meta[name='_csrf']").attr("th:content");
var header = $("meta[name='_csrf_header']").attr("th:content");

const api = (function () {
  // 결제요청 리스트
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
  //검수완료
  const checkComplete = (value,rcno,callback) => {
    $.ajax({
      type: "post",
      url: "/admin/payment/request/"+rcno,
     contentType: "application/json; UTF-8;",
      complete: (res) => {
        jQuery.ajaxSetup({
          beforeSend: function (xhr) {
            xhr.setRequestHeader(header, token);
          },
        });
      },
      data: JSON.stringify(value),
      success: function (result) {
        if (callback) callback(result);
      },
    })
  }

  // 완료요청
  const getRcCompletePayment = (callback) => {
    $.ajax({
      type: "Get",
      url: "/admin/rc/list",
      dataType: "JSON",
      success: function (result) {
        if (callback) callback(result);
      },
    });
  };
  // 검수예정목록
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
    getRcCompletePayment: getRcCompletePayment,
    checkComplete:checkComplete
  };
})();

/******************api 호출 ********************** */
// api.getPayment(
//   (res = (data) => {
//     var html = "";
//     if (data.paymentRequests) {
//       $(data.paymentRequests).each((confirm) => {
//         html += "<tr>";
//         html += "<td>" + confirm.confirmId + "</td>";
//         html += "<td>" + confirm.reservation.member.nickname + "</td>";
//         html += "<td>" + confirm.confirmDate + "</td>";
//         html += "<td>" + confirm.reservation.reservationStatus + "</td>";
//         html += "</tr>";
//       });
//     } else {
//       html += "<div>데이터가 존재하지 않습니다.</div>";
//     }
//     $(".reservationList").empty();
//     $(".reservationList").append(html);
//   })
// );

api.getComplete(
  (res = (data) => {
    var html = "";
    data.reservationConfirmedPaging;
    if (data.reservationConfirmedPaging.total !== 0) {
    } else {
      html += "<div>검수예정목록이 없습니다.</div>";
    }
  })
);

api.getComplete(
  (res = (data) => {
    var html = "";
    if (data.reservationConfirmedPaging.total !== 0) {
      const result = data.reservationConfirmeds;
      $(result).each(function (i) {
        var no = parseInt(i) + 1;
        html += "<div class='item-flexBox'>";
        html += "<span> No." + result[i].confirmId + "&nbsp</span>";
        html += "<span>" + result[i].reservation.member.nickname + "&nbsp</span>";
        html += "<span>" + result[i].confirmDate + "&nbsp</span>";
        html += "<span>" + result[i].reservation.reservationStatus + "&nbsp</span>";
        html +=
          "<form action=/admin/check/" +
          no +
          " method='get'><span><input type='submit' class='laundry-check' value='검수하기'></input></span></form>";
        html += "<input type='hidden' value= " + result[i].confirmId + " name='confirmId" + i + "'/>";
        html += "<input type='hidden' value= " + result[i].reservation.reservationId + " name='reservationId" + i + "'/>";
        html += "</div>";
      });
    } else {
      html += "<div>세탁 예정 목록이 없습니다.</div>";
    }
    $(".reservationList").empty();
    $("#reservationList").append(html);
    $(".item-flexBox").css({
      display: "flex",
      "place-content": "space-around",
    });
  })
);

api.getRcCompletePayment((result) => {
  var html = "";
  if (result.length !== 0) {
    
    $(result).each(function (i) {
      console.log(i);
      console.log(result[i])
    html += "<div class='item-flexBox'>";
    html += "<span> No." + result[i].confirmId + "&nbsp</span>";
    html += "<span>" + result[i].confirmDate + "&nbsp</span>";
    html += "<span>" + result[i].reservation.reservationStatus + "&nbsp</span>";
    html += "<span><button  class='laundry-complete' value="+ i +">세탁완료하기</button></span>";
    html += "<input type='hidden' value= " + result[i].confirmId + " id='confirmId" + i + "'/>";
    html += "<input type='hidden' value= " + result[i].reservation.reservationId + " id='reservationId" + i + "'/>";
    html += "</div>";
  });
  } else {
    html+="<div>세탁내역이 존재하지 않습니다.</div>"
  }
  
     $("#complete-list").empty();
     $("#complete-list").append(html);
     $(".item-flexBox").css({
       display: "flex",
       "place-content": "space-around",
     });
  
  $(".laundry-complete").on("click", function () {
    let idx = parseInt(this.value);
    console.log($("#confirmId" + idx).val());
    console.log($("#reservationId" + idx).val());

    api.washingComplete({
      confirmId: $("#confirmId" + idx).val(),
      reservation: {
        reservationId: $("#reservationId" + idx).val(),
        reservationStatus: "세탁완료",
      },
    });
  });
});
