<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/common.js"></script>
<script type="text/javascript">
	$(function() {
		// 이메일 체크 결과 초기에 hide로 설정
		$('#impossibleEmail').hide();
		$('#possibleEmail').hide();
		var emailChecked = false;

		// 연락처 체크 결과 초기에 hide로 설정
		$('#impossibleContact').hide();
		$('#possibleContact').hide();
		var contactChecked = false;
		
		// 이메일 중복 검사
		$('#emailCheckBtn').on("click", function() {
			const email = $('#email').val();
			
			// 아무것도 입력하지 않았으면 ajax 호출 취소
			if (email == "") {
				alert("이메일을 입력하세요.");
				return false;
			}

			commonService.checkEmail(email, function(result) {
				if (result == "impossible") {
					$('#impossibleEmail').show();
					$('#possibleEmail').hide();
					emailChecked = false;
				} else {
					$('#impossibleEmail').hide();
					$('#possibleEmail').show();
					emailChecked = true;
				}
			});

		});
		
		
		// 연락처 중복 검사
		$('#contactCheckBtn').on('click', function(){	
			const contact = $('#contact').val();
			const type = $('input[name=type]').val();
			
			// 아무것도 입력하지 않았으면 ajax 호출 취소
			if (contact == "") {
				alert("연락처를 입력하세요.");
				return false;
			}
			
			commonService.checkContact(contact, type, function(result){
				if (result == "impossible") {
					$('#possibleContact').hide();
					$('#impossibleContact').show();
					contactChecked = false;
				} else {
					$('#possibleContact').show();
					$('#impossibleContact').hide();
					contactChecked = true;
				}
			});				
		});
		
		
		$('#form').on("submit", function(e) {
			
			$(':required', this).parent().show();

			var invalidInputs = $(":invalid", this);

			// 입력되지 않은 required input이 있으면 form submit event 취소
			if (invalidInputs.length > 0) return;

			// form submit event 취소
			if (event.originalEvent) return false;

			// 이메일, 연락처 중복 검사를 모두 완료해야 회원가입 등록 가능
			if (emailChecked && contactChecked) {
				alert("회원가입이 완료되었습니다");
				$('form').submit();
			} else {
				if (!emailChecked) alert('이메일 중복 검사를 완료해 주세요.');
				if (!contactChecked) alert('연락처 중복 검사를 완료해 주세요.');
				return false;
			}
		});
	});
</script>