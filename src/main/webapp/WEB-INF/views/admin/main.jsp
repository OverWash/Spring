<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>
<meta name="_csrf" th:content="${_csrf.token}" />
<meta name="_csrf_header" th:content="${_csrf.headerName}" />

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
							<!-- 검수예정목록 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h5 class="m-0 font-weight-bold text-gray-900">검수예정목록</h5>
								</div>
								<div class="card-body border-bottom-info">

									<div id="reservationList">
										<!-- 검수예정에 대한 데이터 삽입!! -->
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
									<div id="complete-list">
										<!-- 세탁예정목록에 대한 데이터 삽입!! -->
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
			</div>
			<!-- End of Content Wrapper -->
				<%@ include file="../common/copyright.jsp"%>
		</div>
		<!-- End of Page Wrapper -->

		<%@ include file="../common/footer.jsp"%>
		<script src="/resources/js/admin.js"></script>
</body>

</html>