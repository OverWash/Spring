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
									<img class="img-fluid px-3 px-sm-4 mt-3 mb-4" src="/resources/img/wash-icon.png">
								</div>
							</div>
						</div>
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
											<span class="mr-2"> <i class="fas fa-circle text-primary"></i> Direct
											</span> <span class="mr-2"> <i class="fas fa-circle text-success"></i> Social
											</span> <span class="mr-2"> <i class="fas fa-circle text-info"></i> Referral
											</span>
										</div>
									</div>
								</div>
							</div>
							<div class="temporary2">
								<div class="card shadow mb-4">
									<!-- Card Header - Dropdown -->
									<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
										<h6 class="m-0 font-weight-bold text-primary">예약현황</h6>
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
									<div class="reservationList">
										<h4 class="small font-weight-bold">
											{reservationlist 차례로 출력} <span class="float-right">예약접수</span>
										</h4>
										<div class="progress mb-4">
											<div class="progress-bar bg-danger" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
									<div class="reservationList">
										<h4 class="small font-weight-bold">
											{reservationlist 차례로 출력} <span class="float-right">예약완료</span>
										</h4>
										<div class="progress mb-4">
											<div class="progress-bar bg-warning" role="progressbar" style="width: 40%" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
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
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{check.list[1]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">결제하기</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{check.list[2]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">결제하기</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{check.list[3]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">결제하기</span>
												</a>
											</span>
										</h4>
									</div>
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

</body>
</html>