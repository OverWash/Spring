var paymentService = (function() {

    function getReceipt(rid, callback) {
        console.log("getReceipt() called...");
       
        $.getJSON("/payment/receipt/" + rid, function(result){
            console.log("영수증 가져오기 성공: " + result);
            if (callback) callback(result);
        });

        // $.ajax({
        //     type : 'GET',
        //     url : "/payment/receipt/" + rid,
        //     success : function(result) {
        //         console.log("영수증 가져오기 성공: " + result);
        //         if (callback) callback(result);
        //     }
        // })
    };

    function getReceiptList(callback) {
        console.log("getReceiptList() called...");

        $.ajax({
            type : 'GET',
            url : "/payment/receipt/list",
            success : function(result) {
                if (callback) callback(result);
            }
        });
    };

    function getCheckList(confirmId, callback) {
        console.log("getCheckList() called...");

        $.ajax({
            type : 'GET',
            url : "/check/" + confirmId,
            success: function(result) {
                if (callback) callback(result);
            }
        })

    }


    return {
        getReceipt : getReceipt,
        getReceiptList : getReceiptList,
        getCheckList : getCheckList
    };

})();