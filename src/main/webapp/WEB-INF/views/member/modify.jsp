<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta name="_csrf" th:content="${_csrf.token}" />
<meta name="_csrf_header" th:content="${_csrf.headerName}" />
</head>
<script src="${contextPath}/resources/js/jquery-3.6.0.min.js"></script>

<script type="text/javascript">
	const token = $("meta[name='_csrf']").attr("th:content");
	const header = $("meta[name='_csrf_header']").attr("th:content");
	$(function() {
		$('#modify').click(function() {
			var data = {
				memberId : $("#memberId").val(),
				memberAddress : $("#memberAddress").val(),
				nickname : $("#nickname").val(),
				user : {
					userId : $("#userId").val(),
					password : $("#password").val()
				}
			};

			$.ajax({
				type : "patch",
				contentType : "application/json; charset=UTF-8",
				data : JSON.stringify(data),
				url : "/member/modify",
				beforeSend : function(xhr) { //데이터를 전송하기 전에 헤더에 csrf값을 설정한다
					xhr.setRequestHeader(header, token);
				},
				success : function(res) {
					alert("정보가 수정되었습니다.");
					 window.location = "/member/main" ;
				}
			});
		});
	})
</script>


<body>

	<input type="hidden" value="${memberInfo.memberId}" id="memberId">
	<input type="hidden" value="${memberInfo.user.userId}" id="userId">
	<input type="text" value="${memberInfo.memberAddress}" id="memberAddress">
	<input type="text" value="${memberInfo.nickname}" id="nickname">
	<input type="password" value="${memberInfo.user.password}" id="password">
	<button id="modify">수정</button>



</body>
</html>