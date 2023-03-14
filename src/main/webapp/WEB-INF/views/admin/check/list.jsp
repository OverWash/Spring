<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%@ include file="../../common/header.jsp"%>
<head>
	<link href="${pageContext.request.contextPath }/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">
</head>

<body id="page-top">
	<!-- Page Wrappe r -->
	<div id="wrapper">
		<%@ include file="../../common/sidebar.jsp"%>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<%@ include file="../../common/navbar.jsp"%>
				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">검수 예약 목록</h6>
						</div>
						<div class="card-body">

							<table id="completedTable" class="table table-striped table-bordered" style="width: 100%">
								<thead>
									<tr>
										<th>No</th>
										<th>예약확정일</th>
										<th>닉네임</th>
										<th>고객번호</th>
										<th>예약상태</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${rclist.reservationConfirmeds}" var="data">
										<tr>
											<td>${data.confirmId}</td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${data.confirmDate}"/></td>
											<td>${data.reservation.member.nickname}</td>
											<td>${data.reservation.member.memberContact}</td>
											<td>${data.reservation.reservationStatus}</td>
											<td>
												<form action="/admin/check/${data.confirmId}" method="get">
													<input type="submit"  class="btn btn-primary" value="검수하기"/>
												</form>
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
			<%@ include file="../../common/copyright.jsp"%>
		</div>
		<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->

	<%@ include file="../../common/footer.jsp"%>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap4.min.js"></script>
	<script src="/resources/js/admin.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.table-bordered').DataTable(); // table 띄우기
		});
	</script>
</body>
</html>