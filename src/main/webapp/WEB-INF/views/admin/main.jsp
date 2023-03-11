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
						<div class="col-xl-12 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3 d-flex flex-row align-items-center justify-content-between"">
									<h5 class="m-0 font-weight-bold text-gray-900">매니저뭔가정보</h5>
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
										<div class="progress mb-4">
											<div class="progress-bar bg-danger" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
									<div class="reservationList">
										<div class="progress mb-4">
											<div class="progress-bar bg-warning" role="progressbar" style="width: 40%" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"></div>
										</div>
									</div>
								</div>
							</div>

							<!-- 검수예정목록 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-gray-900">검수예정목록</h5>
								</div>
								<div class="card-body border-bottom-info">
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{soogu.list[1]} <span class="float-right"> <a href="#" class="btn btn-secondary btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">검수완료</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{soogu.list[2]} <span class="float-right"> <a href="#" class="btn btn-secondary btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">검수완료</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{v.list[3]} <span class="float-right"> <a href="#" class="btn btn-secondary btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">검수완료</span>
												</a>
											</span>
										</h4>
									</div>
								</div>
							</div>
							<!-- 검수예정목록 -->

							<!-- 세탁예정목록 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-gray-900">세탁예정목록</h5>
								</div>
								<div class="card-body border-bottom-info">
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{soogu.list[1]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">세탁완료</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{soogu.list[2]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">세탁완료</span>
												</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{v.list[3]} <span class="float-right"> <a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
													<span class="icon text-gray-600"> <i class="fas fa-arrow-right"></i>
													</span> <span class="text font-weight-bold">세탁완료</span>
												</a>
											</span>
										</h4>
									</div>
								</div>
							</div>
							<!-- 세탁예정목록 -->
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