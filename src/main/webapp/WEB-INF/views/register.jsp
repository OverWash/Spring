<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register main</title>
</head>
<body>
	<h1>main register page</h1>
	<form action="/register" method="post">
		<input type="submit" value="크루회원가입" name="ROLE_CREW">
		<input type="submit" value="멤버회원가입" name="ROLE_MEMBER">
		<input type="hidden" value="ROLE_MEMBER" name="role" />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form> 
</body>
</html>