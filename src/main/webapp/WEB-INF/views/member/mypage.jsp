<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<div class="col-xl-6 col-lg-7">
							<h1>회원정보</h1>
							<h2>{member.정보1}</h2>
							<h2>{member.정보2}</h2>
						</div>	
						<!-- 세탁 버튼 -->
						<div class="col-xl-6 col-lg-7">
							<div class="card shadow mb-4">
								<div class="card-body">
									<img class="img-fluid px-3 px-sm-4 mt-3 mb-4" src="/resources/img/wash-icon.png">
								</div>
							</div>
						</div>
					</div>
					
					<!-- Content Row -->
					<div class="row">

						<div class="col-xl-12 mb-4">
							<!-- 최근 예약 내역 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">최근예약내역</h4>
								</div>
								<div class="card-body">
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{reservation.list[1]}
											<span class="float-right">
												<a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
			                                        <span class="icon text-gray-600">
			                                            <i class="fas fa-arrow-right"></i>
			                                        </span>
			                                        <span class="text font-weight-bold">상세보기</span>
	                                    		</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{reservation.list[2]}
											<span class="float-right">
												<a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
			                                        <span class="icon text-gray-600">
			                                            <i class="fas fa-arrow-right"></i>
			                                        </span>
			                                        <span class="text font-weight-bold">상세보기</span>
	                                    		</a>
											</span>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											{reservation.list[3]}
											<span class="float-right">
												<a href="#" class="btn btn-light btn-icon-split" style="line-height: 1;">
			                                        <span class="icon text-gray-600">
			                                            <i class="fas fa-arrow-right"></i>
			                                        </span>
			                                        <span class="text font-weight-bold">상세보기</span>
	                                    		</a>
											</span>
										</h4>
									</div>									
								</div>
							</div>
							<!-- 최근 예약 내역 -->
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

</body>
</html>