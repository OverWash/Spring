<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="../common/header.jsp"%>
<head>
<meta name="_csrf" th:content="${_csrf.token}" />
<meta name="_csrf_header" th:content="${_csrf.headerName}" />
<link href="${pageContext.request.contextPath }/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">

</head>
<body id="page-top">
	<!-- Page Wrappe r -->
	<div id="wrapper">

		<%@ include file="../common/sidebar.jsp"%>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">

				<%@ include file="../common/navbar.jsp"%>
				<!-- Begin Page Content -->
				<div class="container-fluid">
					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h1 class="m-0 font-weight-bold text-primary">세탁 예정 목록</h1>
						</div>
						<div class="card-body">
							<table id="completedTable" class="table table-striped table-bordered" style="width: 100%">
								<thead>
									<tr>
										<th>No</th>
										<th>고객닉네임</th>
										<th>고객번호</th>
										<th>요청사항</th>
										<th>완료</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${completeList}" var="complete" varStatus="i">
										<tr>
											<td>${complete.confirmId}</td>
											<td>${complete.reservation.member.nickname}</td>
											<td>${complete.reservation.member.memberContact}</td>
											<c:if test="${ complete.reservation.request != null}">
												<td>${complete.reservation.request}</td>
											</c:if>
											<c:if test="${ complete.reservation.request == null}">
												<td>요청사항 없음</td>
											</c:if>
											<td>
												<button class="btn btn-primary completeBtn" value= "${complete.confirmId}">세탁완료</button>
												<input type="hidden" value="${complete.reservation.reservationId}">
											</td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->


			<%@ include file="../common/copyright.jsp"%>
		</div>
		<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->

	<%@ include file="../common/footer.jsp"%>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap4.min.js"></script>
	<script src="/resources/js/admin.js"></script>
	<script>
		$('.completeBtn').on('click', function() {
			const confirmId = parseInt(this.value);
			reservationId= $(this).next()[0].value;
			 api.washingComplete({
				confirmId : confirmId,
				reservation : {
					reservationId :reservationId,
					reservationStatus : "세탁완료",
				},
			},function(data){
				
				alert("세탁완료 처리 하였습니다.");
			})
		})
	</script>

</body>
</html>