<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>aasdsa</div>
	<form action="/admin/request" method="post">
		<c:forEach items="${laundryList}" var="laundry" >
			<c:if test="${laundry.type eq 'c'}">
				<div>
					<input type="checkbox" name="laundryList" value="${laundry}" />
					${laundry.name}${laundry.type}${laundry.laundryPrice.price} 원
				</div>
			</c:if>
		</c:forEach>
		<input type="submit" />
	</form>
	<script>
		// var laundry = ${ laundry };
		// console.log(typeof laundry);
	</script>
</body>
</html>