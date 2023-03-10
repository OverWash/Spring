<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/common.js"></script>
<script type="text/javascript">
	$(function() {
		// 이메일 체크 결과 란은 초기에 hide로 설정
		$('#impossible').hide();
		$('#possible').hide();

		var checked = false;

		$('#emailCheckBtn').on("click", function() {
			// console.log('emailCheckBtn clicked');

			var email = $('#email').val();

			commonService.checkEmail(email, function(result) {
				if (result == "impossible") {
					$('#possible').hide();
					$('#impossible').show();

				} else {
					$('#impossible').hide();
					$('#possible').show();

					checked = true;
				}
			});

		});

		$('#form').on("submit", function(e) {
			//e.preventDefault();

			$(':required', this).parent().show();

			var invalidInputs = $(":invalid", this);

			console.log(invalidInputs);

			if (invalidInputs.length > 0)
				return;

			if (event.originalEvent)
				return false;

			if (checked) {
				$('form').submit();
			} else {
				alert('이메일 중복 검사를 완료해 주세요.');
				return false;
			}
		});

	});
</script>