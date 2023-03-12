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
						<h1 class="font-weight-bold">예약이 완료되었습니다.</h1>
					</div>
					<hr>
					<!-- Content Row -->
					<div class="row">
						<div class="col-xl-12 mb-4">
							<div class="my-2"></div>
							<a href="main" class="btn btn-primary btn-icon-split btn-lg">
								<span class="icon text-white-50"> <i class="fas fa-arrow-right"></i>
								</span> <span class="text">메인 페이지로</span>
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

</body>
</html>