<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<%@ include file="common/header.jsp"%>

<head>
<style type="text/css">
.custom-error {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}
</style>
</head>
<body>

	<div class="custom-error">
		<!-- Begin Page Content -->
		<div class="container-fluid">
			<!-- 404 Error Text -->
			<div class="text-center">
				<div class="error mx-auto" data-text="403">403</div>
				<p class="lead text-gray-800 mb-5">${msg}</p>
				<a href="#" onClick="history.back()">&larr; 돌아가기</a>
			</div>
		</div>
		<!-- /.container-fluid -->
	</div>

</body>
