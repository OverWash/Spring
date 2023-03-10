// js module

var commonService = (function(){

    function checkEmail(email, callback) {
        console.log("checkEmail function called...");

        var request = "/user?email=" + email; 

        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
            
                console.log("id 중복 체크 결과: " + result);
                callback(result);
     
            }
        })

    }

    return {
        checkEmail : checkEmail
    };

})();