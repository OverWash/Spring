<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%@ include file="../common/header.jsp"%>

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
					<h3 class="h3 mb-2 text-gray-800 font-weight-bold">지난 예약 내역</h3>
					<p class="mb-4">${username}님의 지난 예약 목록입니다.</p>

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">예약 목록</h6>
						</div>
						<div class="card-body">
							<table id="receiptTable" class="table table-striped table-bordered" style="width: 100%">
								<thead>
									<tr>
										<th>No</th>
										<th>결제 금액</th>
										<th>결제 수단</th>
										<th>예약일</th>
										<th>예약 확정일</th>
										<th>담당크루 연락처</th>
										<th>검수 내역</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${receipts}" var="receipts">
										<tr>
											<td>${receipts.receiptId}</td>
											<td><fmt:formatNumber type="number" maxFractionDigits="3" value="${receipts.pr.prPrice}" /></td>
											<td>${receipts.paymentMethod}</td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${receipts.pr.confirm.reservation.reservationDate}" /></td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${receipts.pr.confirm.confirmDate}" /></td>
											<td>${receipts.pr.confirm.crew.crewContact}</td>
											<td><input id="detailReceiptBtn" class="btn btn-primary" type="button" value="상세보기"></td>
										</tr>
										<input id="receiptId" type="text" value="<c:out value='${receipts.receiptId}' />"   >
										<input id="confirmId" type="text" value="<c:out value='${receipts.pr.confirm.confirmId}' />" >
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->

			<!-- 상세 영수증 모달창 -->
			<div class="modal fade" id="detailReceiptModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" >
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="font-weight-bold">영수증 No.</h5>
							<h5 id="receiptIdText" class="font-weight-bold"></h5>
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
											<h6 class="m-0 font-weight-bold text-primary">검수 내역</h6>
										</div>
										<!-- 검수 내역 테이블로 가져오기 (restful) -->
										<div id="price" class="card-body">
											<table id="checkTable" class="table table-striped table-bordered" style="width: 100%">
												<thead>
													<tr>
														<th>품목</th>
														<th>가격</th>
													</tr>
												</thead>
												<tbody>
													<%-- <c:forEach items="${checks}" var="receipts"> --%>
														<tr>
															<td></td>
															<td></td>
														
														</tr>
													<%-- </c:forEach> --%>
												</tbody>
											</table>
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
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/css/dataTables.bootstrap4.min.css"></script>
	<script type="text/javascript" src=https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css></script>

	<script type="text/javascript">
		$(function() {
			$('#receiptTable').DataTable(); // table 띄우기
			$('#receiptId').hide();
			$('#confirmId').hide();

			// modal 띄우기
			$('#detailReceiptBtn').on("click", function(e) {
				$('#detailReceiptModal').modal("show");				
				const receiptId = $('#receiptId').val();
				const confirmId = $('#confirmId').val();
				
				$('#receiptIdText').text(receiptId);
				// ajax 호출

			});

		});
	</script>
</body>
</html>