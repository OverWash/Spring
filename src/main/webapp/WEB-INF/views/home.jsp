<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<%@ include file="common/header.jsp"%>
	<section class="content">
		<div>${members[0].memberAddress} </div>
	</section>
	<%@ include file="common/footer.jsp"%>
</body>
</html>
