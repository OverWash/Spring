<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<%@ include file="../common/sidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<%@ include file="../common/navbar.jsp"%>

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<div class="row">
						<h3 class="font-weight-bold"> 영수증 No. </h3>
						<h3 id=id class="font-weight-bold"></h3>
					</div>
					<hr>
					<!-- Content Row -->
					<div class="row">
						<div class="col-xl-12 mb-4">	
							
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">결제 금액</h5>
								</div>
								<div id="price" class="card-body"></div>
							</div>
					
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">결제 수단</h5>
								</div>
								<div id="paymentMethod" class="card-body"></div>
							</div>
							
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">예약일</h5>
								</div>
								<div id="rDate" class="card-body"></div>
							</div>
							
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">예약 확정일</h5>
								</div>
								<div id="rcDate" class="card-body"></div>
							</div>
							
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">담당 크루 연락처</h5>
								</div>
								<div id="crewContact" class="card-body"></div>
							</div>
							
							<!-- 검수내역 모달창에 띄우기? 추가할 것 -->
							<div class="my-2"></div>
							<a href="#" class="btn btn-primary btn-icon-split btn-lg">
								<span class="icon text-white-50"> <i class="fas fa-arrow-right"></i>
								</span> <span class="text">상세보기</span>
							</a>
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
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/js/payment.js"></script>
	<script type="text/javascript">
		$(function() {
			// 1을 현재 영수증 rid 로 변경하기
			paymentService.getReceipt(1, function(data) {
				console.log(data); // object
				
				$('#id').text(data.receiptId);
				$('#price').text(data.pr.prPrice);
				$('#paymentMethod').text(data.paymentMethod);
				$('#rDate').text(data.pr.confirm.reservation.reservationDate);
				$('#rcDate').text(data.pr.confirm.confirmDate);
				// 정규식으로 연락처에 하이픈 추가
				const crewContact = data.pr.confirm.crew.crewContact;
				const formatTel = crewContact.replace(/^(\d{2,3})(\d{3,4})(\d{4})$/, `$1-$2-$3`);
				$('#crewContact').text(formatTel);
			});
	
			
			
		});
	
	</script>
</body>
</html>