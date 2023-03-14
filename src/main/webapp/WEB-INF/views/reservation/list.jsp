<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%@ include file="../common/header.jsp"%>
<head>
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

					<!-- Page Heading -->
					<h3 class="h3 mb-2 text-gray-800 font-weight-bold">예약 현황</h3>
					<p class="mb-4">${username}님의 예약 목록입니다. 예약 상태로 진행 상황을 실시간으로 확인하실 수 있습니다.</p>

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">예약 목록</h6>
						</div>
						<div class="card-body">
							<table id="reservationTable" class="table table-striped table-bordered" style="width: 100%">
								<thead>
									<tr>
										<th>No</th>
										<th>수거일</th>
										<th>예약일</th>
										<th>예약 상태</th>
										<th>요청 사항</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${reservationList}" var="reservationList">
										<tr>
											<td>${reservationList.reservationId}</td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${reservationList.collectDate}" /></td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${reservationList.reservationDate}" /></td>
											<td>${reservationList.reservationStatus} </td>
											<td class="checkInput"><button class="btn btn-dark detailBtn" value="${reservationList.request}">상세보기</button></td>
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

			<!-- 검수 내역 모달창 -->
			<div class="modal fade" id="checkListModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="font-weight-bold">예약 No.</h5>
							<h5 id="rIdText" class="font-weight-bold"></h5>
							<button class="close" type="button" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">
							<hr>
							<!-- Content Row -->
							<div class="row">
								<div class="col-xl-12 mb-4">
									<div class="card shadow mb-4">
										<div class="card-header py-3">
											<h6 class="m-0 font-weight-bold text-primary">요청사항</h6>
										</div>
										<!-- 요청사항 상세보기 -->
										<div id="request" class="card-body">
											<p id="requestText"></p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button class="btn btn-primary" type="button" data-dismiss="modal">돌아가기</button>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="../common/copyright.jsp"%>
		</div>
		<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->

	<%@ include file="../common/footer.jsp"%>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#reservationTable').DataTable(); // table 띄우기
			
		});

		$(".detailBtn").on('click', function() {
			event.preventDefault(); // 버블링 방지
			$('#checkListModal').modal("show");
			
			
			if (this.value == "") {
				$('#request').text("요청사항이 없습니다.");
			} else {
				$('#request').text(this.value);
			} 			
		})
		
	</script>
</body>
</html>