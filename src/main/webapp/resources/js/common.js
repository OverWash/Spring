// js module

var commonService = (function(){

	// 이메일 중복 검사
	// users 테이블의 email을 get 해서 결과를 리턴
    function checkEmail(email, callback) {
    
        console.log("checkEmail function called...");

        var request = "/check?email=" + email; 

        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
                console.log("id 중복 체크 결과: " + result);
               	if (callback) callback(result);
            }
        })

    }
  
    
    // member 가입 시 전화번호 중복 검사
    // member 테이블의 contact를 get 해서 결과를 리턴
    function checkMemberContact(contact, callback) {
    
        console.log("checkMemberContact function called...");

        var request = "/check/member/" + contact; 
		console.log(request)
        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
                console.log("회원 전화번호 중복 체크 결과: " + result);
                if (callback) callback(result);
            }
        })
    }
    
    
    // crew 가입 시 전화번호 중복 검사
    function checkCrewContact(contact, callback) {
    
        console.log("checkCrewContact function called...");

        var request = "/check/crew/" + contact; 
		console.log(request)
        $.ajax({
            type : 'GET',
            url : request,
            success : function(result){
                console.log("크루 전화번호 중복 체크 결과: " + result);
                if (callback) callback(result);
            }
        })
    }

    return {
        checkEmail : checkEmail,
        checkMemberContact : checkMemberContact,
        checkCrewContact : checkCrewContact
    };

})();