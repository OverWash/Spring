<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>

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
					<h1 class="h1 mb-2 font-weight-bold text-dark">이용 가이드</h1>
					<p>OVERWASH 이용 방법 안내입니다.</p>
					<p>&nbsp</p>
					
					<div class="row">
						<div class="col-xl-12 col-md-12 mb-12">
							<div class="card shadow">
								<div class="card-body">							
									<div class="col-md-7 mb-6">
										<!-- <div class="embed-responsive embed-responsive-4by3"> -->
											<img src="${pageContext.request.contextPath }/resources/img/booking.svg" class="card-img-top embed-responsive-item" alt="tree">
										<!-- </div> -->
									</div>
									<div class="md-5 mb-6">
										<h1 class="float-right m-0 font-weight-bold text-dark">STEP 1</h1>	
										<p>&nbsp</p>
										<p>&nbsp</p>						
										<h3 class="float-right m-0 font-weight-bold text-dark">세탁 신청하기</h3>
										<p>&nbsp</p>
										<h6 class="float-right"> 메인 페이지 화면 상단 메뉴에서 [예약하기] 버튼을 눌러 예약을 진행해 주세요.</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xl-12 col-md-12 mb-12">
							<div class="card shadow">
								<div class="card-body">							
									<div class="col-md-7 mb-6">
										<!-- <div class="embed-responsive embed-responsive-4by3"> -->
											<img src="${pageContext.request.contextPath }/resources/img/pickup.svg" class="card-img-top embed-responsive-item" alt="tree">
										<!-- </div> -->
									</div>
									<div class="md-5 mb-6">
										<h1 class="float-right m-0 font-weight-bold text-dark">STEP 2</h1>	
										<p>&nbsp</p>
										<p>&nbsp</p>						
										<h3 class="float-right m-0 font-weight-bold text-dark">수거</h3>
										<p>&nbsp</p>
										<h6 class="float-right"> 세탁물은 밤 11시까지 문 앞에 두시면 수거합니다. 어디든 편한 곳에 담아주세요. 
										에코백, 타포린백 등 다회용 가방의 경우, 배송 시 돌려드려요.</h6>
										<p>&nbsp</p>
										<h6 class="float-right text-xs">! 세탁물에 세탁특공대 표시를 해주시면 더 안전하게 수거할게요.</h6>	
									</div>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xl-12 col-md-12 mb-12">
							<div class="card shadow">
								<div class="card-body">							
									<div class="col-md-7 mb-6">
										<!-- <div class="embed-responsive embed-responsive-4by3"> -->
											<img src="${pageContext.request.contextPath }/resources/img/status_check.svg" class="card-img-top embed-responsive-item" alt="tree">
										<!-- </div> -->
									</div>
									<div class="md-5 mb-6">
										<h1 class="float-right m-0 font-weight-bold text-dark">STEP 3</h1>	
										<p>&nbsp</p>
										<p>&nbsp</p>						
										<h3 class="float-right m-0 font-weight-bold text-dark">결제</h3>
										<p>&nbsp</p>
										<h6 class="float-right"> 좌측 메뉴에서 현황을 확인하실 수 있어요.
										세탁물 내역이 담긴 인수증을 보내드리니 내가 맡긴 세탁물과 요금을 확인 후, 원하는 방식으로 결제해 주세요.</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xl-12 col-md-12 mb-12">
							<div class="card shadow">
								<div class="card-body">							
									<div class="col-md-7 mb-6">
										<!-- <div class="embed-responsive embed-responsive-4by3"> -->
											<img src="${pageContext.request.contextPath }/resources/img/booking.svg" class="card-img-top embed-responsive-item" alt="tree">
										<!-- </div> -->
									</div>
									<div class="md-5 mb-6">
										<h1 class="float-right m-0 font-weight-bold text-dark">STEP 4</h1>	
										<p>&nbsp</p>
										<p>&nbsp</p>						
										<h3 class="float-right m-0 font-weight-bold text-dark">문 앞 배송</h3>
										<p>&nbsp</p>
										<h6 class="float-right"> 완료된 세탁물은 아침 7시 전 문 앞에 배송합니다.</h6>
										<p>&nbsp</p>
										<h6 class="float-right text-xs">! 간혹 세탁물이 양이 많은 경우 문 앞에 놓아 드리나 밀봉되어 있으니 걱정마세요.</h6>
									</div>
								</div>
							</div>
						</div>
					</div>																
										
										<!-- 예전 템플릿 -->
<%-- 					<div class="row">				
						<div class="col-xl-7 col-md-6 mb-6">
							<div class="card shadow mb-4">
								<div class="card-body">
									<div class="embed-responsive embed-responsive-4by3">
										<img src="${pageContext.request.contextPath }/resources/img/delivery.svg" class="card-img-top embed-responsive-item" alt="tree">
									</div>
								</div>
							</div>
						</div>
						<div class="col-xl-5 col-md-6 mb-6">
							<div class="card shadow mb-4">
								<div class="card-body">
									<h1 class="float-right m-0 font-weight-bold text-dark">STEP 4</h1>
									<p>&nbsp</p>
									<p>&nbsp</p>
									<h3 class="float-right m-0 font-weight-bold text-dark">문 앞 배송</h3>
									<p>&nbsp</p>									
									<h6 class="float-right"> 완료된 세탁물은 아침 7시 전 문 앞에 배송합니다.
									</h6>
									<h6 class="float-right text-xs">! 간혹 세탁물이 양이 많은 경우 문 앞에 놓아 드리나 밀봉되어 있으니 걱정마세요.</h6>
								</div>
							</div>
						</div>							
					</div>	 --%>														
				<!-- /.container-fluid -->
				<%@ include file="../common/copyright.jsp"%>
				</div>
			</div><!-- End of Main Content -->
		</div><!-- End of Content Wrapper -->
	</div><!-- End of Page Wrapper -->
	

	<%@ include file="../common/footer.jsp"%>
	
	<script type="text/javascript">
		$("#sampleDiv").hide();
	
	</script>
</body>
</html>