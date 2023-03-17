var paymentService = (function() {

    function getReceipt(rid, callback) {
       
        $.getJSON("/payment/receipt/" + rid, function(result){
            if (callback) callback(result);
        });

        // $.ajax({
        //     type : 'GET',
        //     url : "/payment/receipt/" + rid,
        //     success : function(result) {
        //         if (callback) callback(result);
        //     }
        // })
    };

    function getReceiptList(callback) {

        $.ajax({
            type : 'GET',
            url : "/payment/receipt/list",
            success : function(result) {
                if (callback) callback(result);
            }
        });
    };

    function getCheckList(confirmId, callback) {

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