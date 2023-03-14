<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="../common/header.jsp"%>
<script src="/resources/js/jquery-3.6.0.min.js"></script>
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
						<div class="col-xl-12 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between"">
									<h5 class="m-0 font-weight-bold text-gray-900">${member.crewName }님, 배달 현황</h5>
									<div class="dropdown no-arrow">
										<a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
											<i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
										</a>
										<div class="dropdown-menu dropdown-menu-right shadow animated--fade-in" aria-labelledby="dropdownMenuLink">
											<div class="dropdown-header">Dropdown Header:</div>
											<a class="dropdown-item" href="#">Action</a>
											<a class="dropdown-item" href="#">Another action</a>
											<div class="dropdown-divider"></div>
											<a class="dropdown-item" href="#">Something else here</a>
										</div>
									</div>
								</div>
								<div class="card-body">
									<div class="reservationList">
										<h6>배달 중 (${deliveringCnt }개)</h6>
										<div class="progress mb-4">
											<div class="progress-bar bg-danger" role="progressbar" style="width: ${deliveringCnt * 5}%" aria-valuenow="${deliveringCnt * 5}" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
									<div class="reservationList">
										<h6>배달 완료 (${doneDeliverCnt }개)</h6>
										<div class="progress mb-4">
											<div class="progress-bar bg-warning" role="progressbar" style="width: ${doneDeliverCnt * 5}%" aria-valuenow="${doneDeliverCnt * 5}" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
								</div>
							</div>

							<!-- 수거예정목록 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-gray-900">수거예정목록</h5>
								</div>
								<div class="card-body border-bottom-success">
									<c:set var="doneLoopC" value="false" />
									<c:forEach var="collect" items="${collectList }" varStatus="i">
										<c:if test="${not doneLoopC }">
											<form action="/crew/collect/${collect.reservationId}" method="post" id="collectForm">
												<div class="reservationList">
													<h4 class="middle font-weight-bold">
														${collect.member.memberAddress} <span class="float-right"> <button class="btn btn-secondary btn-icon-split" class="collect" id="collect" style="line-height: 1;">
																<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i></span> <span class="text font-weight-bold">수거하기</span>
															</button>
														</span>
													</h4>
												</div>
												<input type="hidden" value="${member.crewId }" name="crewId">
												<input type="hidden" name="flag" value="main">
												<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
											</form>
											<c:if test="${i.count eq 5 }">
												<c:set var="doneLoopC" value="true" />
											</c:if>
										</c:if>
									</c:forEach>
								</div>
							</div>
							<!-- 수거예정목록 -->

							<!-- 수거예정목록 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-gray-900">배달예정목록</h5>
								</div>
								<c:set var="doneLoopD" value="false" />
									<c:forEach var="delivery" items="${deliveryList }" varStatus="k">
										<c:if test="${not doneLoopD }">
												<form action="/crew/delivery/${delivery.confirm.reservation.reservationId}" method="post" id="deliveryForm">
													<div class="reservationList">
														<h4 class="middle font-weight-bold">
															${delivery.confirm.reservation.member.memberAddress} <span class="float-right"> <button class="btn btn-secondary btn-icon-split" id="delivery" style="line-height: 1;">
																	<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i></span> <span class="text font-weight-bold">배달하기</span>
																</button>
															</span>
														</h4>
													</div>
													<input type="hidden" value="${delivery.confirm.reservation.reservationId}" name="reservationId">
													<input type="hidden" name="flag" value="main">
													<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
												</form>
											
											<c:if test="${k.count eq 5 }">
												<c:set var="doneLoopD" value="true" />
											</c:if>
											
										</c:if>
									</c:forEach>
								</div>
							</div>
							<!-- 수거예정목록 -->
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
</body>

<script>
	$(function(){
		 $("#collect").click(function(e){
			e.preventDefault();
			alert("수거를 진행합니다.");
			$("#collectForm").submit();		
		});
		
		$("#delivery").click(function(e){
			e.preventDefault();
			alert("배송을 진행합니다.");
			$("#deliveryForm").submit();		
		});
		
	})


</script>
</html>