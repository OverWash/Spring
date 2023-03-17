// js module

var commonService = (function(){

	/* 이메일 중복 검사
	   users 테이블의 email을 get 해서 결과를 리턴 */
    function checkEmail(email, callback) {

        var request = "/check?email=" + email; 
        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
               	if (callback) callback(result);
            }
        })

    }
    
    /* 가입 시 연락처 중복 검사
       crew.jsp, member.jsp에 hidden input의 type으로 get 요청을 다르게 함 */
    function checkContact(contact, type, callback) {
        
        var request = "/check/" + type + "/" + contact; 
        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
                if (callback) callback(result);
            }
        })
    }
  
    return {
        checkEmail : checkEmail,
        checkContact : checkContact
    };

})();