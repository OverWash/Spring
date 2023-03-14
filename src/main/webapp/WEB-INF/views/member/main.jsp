<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="../common/header.jsp"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

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
					<!-- Content Row -->
					<div class="row">
						<!-- 세탁 버튼 -->
						<div class="col-xl-6 col-lg-7">
							<div class="card shadow mb-4">
								<div class="card-body">
									<a class="btn" onclick="fnModuleInfo()">
										<img class="img-fluid px-3 px-sm-4 mt-3 mb-4" src="${pageContext.request.contextPath }/resources/img/booking.svg">
									</a>
									<h4 class="float-right m-0 font-weight-bold text-dark">+예약하기</h4>
								</div>
							</div>
						</div>
						<!-- End of 세탁 버튼 -->
						<div class="col-xl-6 col-md-6 mb-4">
							<!-- 최근예약현황 -->
							<div class="lastReservation">
								<div class="card shadow mb-4">
									<!-- Card Header - Dropdown -->
									<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
										<div class="row no-gutters align-items-center">
											<div class="col mr-2">
												<div class="h5 mb-0 font-weight-bold text-gray-800">최근 예약 내역</div>
												<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">가장 최근 예약 내역입니다</div>
											</div>
											<div class="col-auto">
												<i class="fas fa-calendar fa-1x text-gray-300"></i>
											</div>
										</div>
									</div>
									<!-- Card Body -->
									<div class="card-body">
										<div class="mt-4">
											<div id="lastReservation">
												<h5 class="h1 mb-2 font-weight-bold text-dark">No. ${reservations[0].reservationId}</h5>
												예약일자 :
												<fmt:formatDate pattern="yyyy.MM.dd HH:mm" value="${reservations[0].reservationDate}" />
												<br /> 수거희망날짜 :
												<fmt:formatDate pattern="yyyy.MM.dd" value="${reservations[0].collectDate}" />
												<br />예약상태 : ${reservations[0].reservationStatus}<br /> <input type="hidden" id="lastResStatus" name="lastResStatus" value="${reservations[0].reservationStatus}">
												<div class="progress mb-4">
												<div class="progress-bar" id="lastResStatProgressBar" role="progressbar" style="width: 16%"></div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End of 최근예약현황 -->
					</div>
					<!-- End Content Row -->

					<!-- Content Row -->
					<div class="row">
						<!-- 예약리스트 Content Column -->
						<div class="col-xl-12 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">예약리스트</h5>
									<input type="hidden" id="reservationListSize" name="reservationListSize" value="${fn:length(reservations)}">
								</div>
								<div class="card-body">	
									<c:forEach items="${reservations}" var="reservations" begin="1" end="5" varStatus="status">
										<div class="reservations">
											<h4 class="small font-weight-bold">
												<span>No. ${reservations.reservationId}</span> 예약날짜 :
												<fmt:formatDate pattern="yyyy.MM.dd HH:mm" value="${reservations.reservationDate}" />
												<span class="float-right">${reservations.reservationStatus}</span> <span class="float-right"></span>
											</h4>
											<div class="progress progress-sm mb-4">
												<div class="progress-bar" role="progressbar" id="ResStatProgressBar${status.count}" style="width: 10%">
													<input type="hidden" id="resListNum${status.count}" value="${reservations.reservationId}"> <input type="hidden" id="resListStatus${status.count}" value="${reservations.reservationStatus}">
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
						</div>
						<!-- End of 예약리스트 Content Column -->
						<div class="col-xl-12 mb-4">
							<!-- 결제완료리스트 top 5 (결제연결) -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">결제요청내역</h5>
								</div>
								<div id="ajax-pr-list"></div>
								<div class="card-body">						
									<c:forEach items="${prList}" var="prList" begin="1" end="5" varStatus="status">
										<div class="paymentRequestList">
											<h5 class="middle font-weight-light">
												<input type="hidden" id="prListPrId" value="${prList.prId}">
												<input type="hidden" id="prListConfirmId" value="${prList.confirm.confirmId}">
												<span class="middle font-weight-bold">no.${prList.confirm.reservation.reservationId}</span>&nbsp 예약날짜 :
												<fmt:formatDate pattern="yyyy.MM.dd HH:mm" value="${prList.confirm.reservation.reservationDate}" />
												결제요청금액 : ${prList.prPrice}원 
												<!-- 결제버튼 -->
												<span class="float-right"> 
													<a onclick="payModuleInfo(
														${prList.prId},
														${prList.confirm.confirmId}	
													)" 
														class="btn btn-light btn-icon-split" style="line-height: 1;">
														<span class="icon text-gray-600"> <i class="fas fa-arrow-right"> </i></span> 
														<span class="text font-weight-bold">결제하기</span>
													</a>
												</span>
												<!-- 결제버튼 -->
											</h5>
										</div>
									</c:forEach>
								</div>
							</div>
							<!-- 검수완료리스트(결제연결) -->
						</div>
					</div>
					<!-- End Content Row -->
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
	<!-- Reservation request Modal-->
	<div class="modal fade" id="MoaModal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<form id="requestForm" class="user" action="/reservation/request" method="POST">
					<div class="col-sm-12 mb-4">
						<!-- 수거 날짜 선택 -->
						<div class="card shadow mb-4">
							<div class="card-header py-3">
								<h6 class="m-0 font-weight-bold text-primary">수거일을 선택하세요</h6>
							</div>
							<div class="card-body">
								<input type="date" id="collectDate" name="collectDate" value="2023-01-01" min="2018-01-01" max="2023-12-31">
							</div>
						</div>
						<!-- End 수거 날짜 선택 -->

						<!-- 요청사항 입력 -->
						<div class="card shadow mb-4">
							<div class="card-header py-3">
								<h6 class="m-0 font-weight-bold text-primary">요청사항을 입력해 주세요</h6>
							</div>
							<div class="card-body">
								<div class="input-group">
									<input type="text" id="request" name="request" class="form-control bg-light border-0 large" placeholder="요청사항을 입력하세요">
								</div>
							</div>
						</div>

						<!-- a 태그 누르면 form 리턴해서 전송  -->
						<div class="my-2"></div>
						<a href="#" onclick="return chk_form()" class="btn btn-primary btn-icon-split btn-sm">
							<span class="icon text-white-60"> <i class="fas fa-check"></i>
							</span> <span class="text">신청하기</span>
						</a>
					</div>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>
	<!-- Reservation request Modal-->
	
	<!-- Payment Request Modal-->
	<div class="modal fade" id="payModal" tabindex="-1" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="col-sm-12 mb-4">
					<!-- 수거 날짜 선택 -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h4 class="m-0 font-weight-bold text-primary">결제 수단을 선택하세요</h4>
						</div>
							<div class="card-body">
								<form id="paymentForm" class="user" action="/payment/process" method="POST">
									<select name="paymentMethod" class="custom-select custom-select-sm form-control form-control-sm">
										<option value="문화상품권">문화상품권</option>
										<option value="모바일결제">모바일결제</option>
										<option value="신용카드">신용카드</option>
										<option value="토스">토스</option>
										<option value="PAYCO">PAYCO</option>
										<option value="KakaoPay">KakaoPay</option>
									</select>
									<input type="hidden" id="payModalPrId" name="prId" value="" >
									<input type="hidden" id="payModalConfirmId" name="confirmId" value="" >
 									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
									<button class="btn btn-primary" type="button" onclick="return paychk_form()">결제하기</button>
								</form>
							</div>
						</div>
					</div>
				</div>
		</div>
	</div>
	<!-- Payment Request Modal-->
	
	<input type="hidden" id="username" value="${member.user.email}" />
	<script type="text/javascript">
		/* 예약신청 모달*/
		function fnModuleInfo() {
			event.preventDefault();
			$('#MoaModal').modal();
		}
		function chk_form() {
			$("#requestForm").submit().console.log("예약이 완료되었습니다.");
		}
		
 		/* 결제요청 모달 */
		function payModuleInfo(prId, confirmId){
			$('#payModal').modal("show");
			$('#payModalPrId').val(prId);
			$('#payModalConfirmId').val(confirmId);
		}
		
 		/* 결제요청 제출 */
		function paychk_form() {
			$("#paymentForm").submit();
		}
		
		/* 최근예약내역 progressBar */
		let lastResStatus = $('#lastResStatus').val();
		let resListLength = $('#reservationListSize').val();

		progressBar(lastResStatus, "lastResStatProgressBar");

		/* 예약리스트 progressBar */
		for (let i = 1; i < 6; i++) {
			let resStat = $("#resListStatus" + i).val();
			let resProgressBarId = "ResStatProgressBar" + i;

			progressBar(resStat, resProgressBarId);
		}

		/* progressBar */
		function progressBar(resStat, resProgressBarId) {
			if (resStat === "예약확정") {
				$('#' + resProgressBarId).css("width", "20%");
			} else if (resStat === "검수완료") {
				$('#' + resProgressBarId).css("width", "40%");
			} else if (resStat === "결제완료") {
				$('#' + resProgressBarId).addClass("bg-info").css("width",
						"50%");
			} else if (resStat === "세탁완료") {
				$('#' + resProgressBarId).addClass("bg-info").css("width",
						"75%");
			} else if (resStat === "배달완료") {
				$('#' + resProgressBarId).addClass("bg-success").css("width", "100%");
			} else if (resStat === "예약취소") {
				$('#' + resProgressBarId).addClass("bg-dark").css("width", "100%");
			}
		}
		// Date 시간 설정
		var now_utc = Date.now()
		var timeOff = new Date().getTimezoneOffset()*60000;
		var today = new Date(now_utc-timeOff).toISOString().split("T")[0];
		$('#collectDate').val(today).attr("min", today);
		
		
		
	</script>
</body>
</html>