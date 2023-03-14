<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>
<head>
	<link href="${pageContext.request.contextPath }/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">
</head>
<body id="page-top">
	<!-- Page Wrappe r -->
	<div id="wrapper">
			<%@ include file="../common/sidebar.jsp"%>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<%@ include file="../common/navbar.jsp"%>
				<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">테이블</h1>
                    <p class="mb-4">가격표 </p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                        </div>
                        <div class="card-body">   	
                            <table id="example" class="table table-striped table-bordered" style="width:100%">
						        <thead>
						            <tr>
						                <th>이름</th>
						                <th>가격</th>
						                <th>타입</th>
						            </tr>
						        </thead>
						        <tbody>
						        	<c:forEach items="${laundrylist}" var="laundrylist">
						            <tr>
						                <td>${laundrylist.name}</td>
						                <td>${laundrylist.laundryPrice.price}</td>
						                <td>
							                <c:if test="${laundrylist.type eq 'c'}" var="c" scope="session">
							            		의류
							            	</c:if>
							            	<c:if test="${laundrylist.type eq 's'}" var="s" scope="session">
							            		신발
							            	</c:if>
							            	<c:if test="${laundrylist.type eq 'b'}" var="b" scope="session">
							            		침구류
							            	</c:if>
						                </td>
						            </tr>
						            </c:forEach>
						        </tbody>
						    </table>
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

	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function () {
		    /* $('#example').DataTable(); */
		    
			var table = new DataTable('#example', {
		        columnDefs: [
		            {
		                target: 0,
		                type: 'anti-the',
		            },
		        ],
		    });
		});
	</script>
</body>
</html>