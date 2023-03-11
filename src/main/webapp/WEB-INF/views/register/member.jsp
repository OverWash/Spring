<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member register page</title>
</head>
<body>
	<h1>member register page</h1>
	<form action="/register/member" method="post">
		<input type="submit" value="가입" name="ROLE_MEMBER"> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>