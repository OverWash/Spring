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
						<h1 class="font-weight-bold">예약신청</h1>
					</div>
					<hr>
					<!-- Form Row -->
					<form class="user" action="request" method=POST>
						<div class="col-xl-12 mb-4">
							<!-- 수거 날짜 선택 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">수거일을 선택하세요</h4>
								</div>
								<div class="card-body">
									<input type="date" id="collectDate" name="collectDate" value="2023-01-01" min="2018-01-01" max="2023-12-31">
								</div>
							</div>
							<!-- End 수거 날짜 선택 -->
							<!-- 요청사항 입력 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">요청사항을 입력해 주세요</h4>
								</div>
								<div class="card-body">
									<div class="input-group">
										<input type="text" id="laundryRequest" name="laundryRequest" class="form-control bg-light border-0 large" placeholder="요청사항을 입력하세요" aria-label="Search" aria-describedby="basic-addon2">
									</div>
								</div>
							</div>
							<input type='submit'>
							<!-- End of 요청사항 입력 -->
							<div class="my-2"></div>
							<a href="#" class="btn btn-primary btn-icon-split btn-lg">
								<span class="icon text-white-50"> <i class="fas fa-check"></i>
								</span> <span class="text">예약 신청하기</span>
							</a>
						</div>
					</form>
					<!-- End of Form -->
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