<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../../common/header.jsp"%>

<body id="page-top">
	<!-- Page Wrappe r -->
	<div id="wrapper">
			<%@ include file="../../common/sidebar.jsp"%>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<%@ include file="../../common/navbar.jsp"%>
				<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">테이블</h1>
                    <p class="mb-4">데이터테이블 </p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                        </div>
                        <div class="card-body">
                            <table id="example" class="table table-striped table-bordered" style="width:100%">
						        <thead>
						        </thead>
						        <tbody>
						        </tbody>
						    </table>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->
			<%@ include file="../../common/copyright.jsp"%>
		</div>
		<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->

	<%@ include file="../../common/footer.jsp"%>

</body>
</html>