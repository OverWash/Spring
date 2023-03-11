<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/common.js"></script>
<script type="text/javascript">
	$(function() {
		// 이메일 체크 결과 란은 초기에 hide로 설정
		$('#impossibleEmail').hide();
		$('#possibleEmail').hide();
		
		$('#impossibleContact').hide();
		$('#possibleContact').hide();

		var emailChecked = false;
		var contactChecked = false;
		
		
		// 이메일 중복 검사
		$('#emailCheckBtn').on("click", function() {
			// console.log('emailCheckBtn clicked');

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
			
			// 아무것도 입력하지 않았으면 ajax 호출 취소
			if (contact == "") {
				alert("연락처를 입력하세요.");
				return false;
			}
			
			const type = $('input[name=type]').val();
			
			// js 서비스에 type 넘겨줘서 거기서 판단하고 ajax 요청 경로를 바꾸는 걸로 수정하기
			
			if (type == "member") {
				commonService.checkMemberContact(contact, function(result){
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
			}
			
			if (type == "crew") {
				commonService.checkCrewContact(contact, function(result){
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
			}
		});
		
		

		
		
		
		
		
		$('#form').on("submit", function(e) {
			// e.preventDefault();

			$(':required', this).parent().show();

			var invalidInputs = $(":invalid", this);

			// console.log(invalidInputs);

			// 입력되지 않은 required input이 있으면 form submit event 취소
			if (invalidInputs.length > 0) return;

			if (event.originalEvent) return false;

			// 이메일 중복이 아니어야 submit 가능
			// 핸드폰 중복 검사도 추가하기
			if (emailChecked && contactChecked) {
				$('form').submit();
			} else {
				if (!emailChecked) alert('이메일 중복 검사를 완료해 주세요.');
				if (!contactChecked) alert('연락처 중복 검사를 완료해 주세요.');
				return false;
			}
		});

	});
</script>