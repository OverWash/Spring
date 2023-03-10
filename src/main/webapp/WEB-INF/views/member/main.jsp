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
					<!-- Content Row -->
					<div class="row">
						<!-- 세탁 버튼 -->
						<div class="col-xl-6 col-lg-7">
							<div class="card shadow mb-4">
								<div class="card-body">
									<a href="request">
										<img class="img-fluid px-3 px-sm-4 mt-3 mb-4" src="/resources/img/wash-icon.png">
									</a>
								</div>
							</div>
						</div>
						<!-- 세탁 버튼 -->
						<div class="col-xl-6 col-md-6 mb-4">
							<div class="temporary1">
								<div class="card shadow mb-4">
									<!-- Card Header - Dropdown -->
									<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
										<h6 class="m-0 font-weight-bold text-primary">최근예약현황</h6>
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
									<!-- Card Body -->
									<div class="card-body">
										<div class="mt-4 text-center small">
											${reservations[0].collectDate}
										</div>
									</div>
								</div>
							</div>
							<div class="temporary2">
								<div class="card shadow mb-4">
									<!-- Card Header - Dropdown -->
									<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
										<h6 class="m-0 font-weight-bold text-primary">이벤트</h6>
									</div>
									<!-- Card Body -->
									<div class="card-body">
										<div class="mt-4 text-center small"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- End Content Row -->

					<!-- Content Row -->
					<div class="row">
						<!-- Content Column -->
						<div class="col-xl-12 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">예약리스트</h5>
								</div>
								<div class="card-body">

									<c:forEach items="${reservations}" var="reservations">
											<div class="reservations">
												<h4 class="small font-weight-bold">                                                                
													<a class="dropdown-item" href="/reservations/getdetail?=${reservations.reservationId}" id="reservationDetailLink" data-toggle="modal" data-target="#reservationDetailModal">
														${reservations.collectDate} | ${reservations.reservationStatus}
													</a>
													<span class="float-right"></span>
												</h4>
												
												<div class="progress progress-sm mb-4">
													<div class="progress-bar bg-danger" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
												</div>
											</div>
									</c:forEach>

								</div>
							</div>

						</div>

						<div class="col-xl-12 mb-4">

							<!-- 검수완료리스트(결제연결) -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-primary">검수완료내역</h5>
								</div>
								<div class="card-body">
									<c:forEach items="${reservations}" var="checkCompletes">
										<div class="reservationList">
											<h5 class="middle font-weight-light">
												{reservations.collectDate} 
												<span class="float-right"> 
													<a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
														<span class="icon text-gray-600"> <i class="fas fa-arrow-right"> </i></span> 
														<span class="text font-weight-bold">결제하기</span>
													</a>
												</span>
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
    
   	<!-- 예약상세 Modal-->
    <div class="modal fade" id="reservationDetailModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">예약상세</h5>
                </div>
                <div class="modal-body">
                	Select "Logout" below if you are ready to end your current session.
                </div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">돌아가기</button>
                </div>
            </div>
        </div>
    </div>
    <!-- 예약상세 Modal-->
    
	<%@ include file="../common/footer.jsp"%>
	<script>
	$('#reservationDetailLink').on('click', function(){
		$.ajax({
			type:'GET',
			url:'/reservations/getdetail',
			data:{
				
			},
			beforeSend: function(){
				$.loading(true);
			},
			success: function (data){
				$.modal(data, 'l');
			},
			complete: function(){
				$.loading(false);
			},
			error: function(e){
				
			}
		
		})
	})
		
	</script>
</body>
</html>