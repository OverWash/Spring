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
					<h3 class="h3 mb-2 text-gray-800 font-weight-bold">배송 예정 목록</h3>
					<p class="mb-4">${username} 님, 배송 예정 내역입니다. 배송을 진행해 주세요.</p>
					<!-- 수거시 collect date update-->
					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">배송 예정 목록</h6>
						</div>
						<div class="card-body">
							<table id="collectTable" class="table table-striped table-bordered" style="width: 100%">
								<thead>
									<tr>
										<th>No</th>
										<th>세탁 완료 날짜</th>
										<th>예약상태</th>
										<th>배달지 주소</th>
										<th>고객 연락처</th>
										<th>고객 닉네임</th>
										<th>배달하기</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${deliveryList}" var="delivery" varStatus="i">
										<tr>
											<td>${i.count}</td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${delivery.wcDate}" /></td>
											<td>${delivery.confirm.reservation.reservationStatus}</td>
											<td>${delivery.confirm.reservation.member.memberAddress}</td>
											<td>${delivery.confirm.reservation.member.memberContact}</td>
											<td>${delivery.confirm.reservation.member.nickname}</td>
											<td>
												<form action="/crew/delivery/${delivery.confirm.reservation.reservationId}" method="post" id="deliveryForm">
													<button id="deliveryBtn" class="btn btn-primary">배달하기</button>
													<input type="hidden" value="${member.crewId }" name="crewId">
													<input type="hidden" name="flag" value="table">
													<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
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
			$('#collectTable').DataTable(); // table 띄우기
		
		});
		
		
		  function checkList(event, receiptId, confirmId) {
		         event.preventDefault(); // 버블링 방지
		         $('#checkListModal').modal("show"); // modal 띄우기
		         $('#receiptIdText').text(receiptId);
		         
		        
		      }

	</script>
</body>
</html>