<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

	<input id="role" type="text" value="<sec:authentication property='principal.role' />"> 
	
	<!-- Sidebar - Brand -->
	<a class="sidebar-brand d-flex align-items-center justify-content-center">
		<div class="sidebar-brand-text mx-3">overWash</div>
	</a>

	<div id="member">

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link" href="/member/main">
				<i class="fas fa-fw fa-tachometer-alt"></i> <span>멤버 홈</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">메뉴</div>

		<!-- Nav Item - Pages Collapse Menu -->

		<!-- Nav Item - Charts -->
		<li class="nav-item"><a class="nav-link" href="/payment/receipts">
				<i class="fas fa-fw fa-table"></i> <span>결제완료내역</span>
			</a></li>

		<!-- Nav Item - Tables -->
		<li class="nav-item"><a class="nav-link" >
				<i class="fas fa-fw fa-table"></i> <span>Tables</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>
	</div>

	<div id="admin">

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link" href="/admin/main">
				<i class="fas fa-fw fa-tachometer-alt"></i> <span>관리자 홈</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">메뉴</div>

		<!-- Nav Item - Pages Collapse Menu -->

		<!-- Nav Item - Charts -->
		<li class="nav-item"><a class="nav-link" href="/payment/receipts">
				<i class="fas fa-fw fa-table"></i> <span>관리자</span>
			</a></li>

		<!-- Nav Item - Tables -->
		<li class="nav-item"><a class="nav-link" >
				<i class="fas fa-fw fa-table"></i> <span><sec:authentication property="principal.role" /></span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>
	</div>

	<div id="crew">

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link" href="/crew/main">
				<i class="fas fa-fw fa-tachometer-alt"></i> <span>크루 홈</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">메뉴</div>

		<!-- Nav Item - Pages Collapse Menu -->

		<!-- Nav Item - Charts -->
		<li class="nav-item"><a class="nav-link" >
				<i class="fas fa-fw fa-table"></i> <span>크루</span>
			</a></li>

		<!-- Nav Item - Tables -->
		<li class="nav-item"><a class="nav-link" >
				<i class="fas fa-fw fa-table"></i> <span>Tables</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>
	</div>


</ul>
<!-- End of Sidebar -->

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#admin").hide();
		$("#member").hide();
		$("#crew").hide();
		
		$("#role").hide();
		const role = $("#role").val();
		
		if (role == "ROLE_ADMIN") {
			$("#admin").show();
		} else if (role == "ROLE_MEMBER") {
			$("#member").show();
		} else {
			$("#crew").show();
		}
		
	});
</script>