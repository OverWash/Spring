<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%@ include file="../../common/header.jsp"%>
<head>
<meta name="_csrf" th:content="${_csrf.token}" />
<meta name="_csrf_header" th:content="${_csrf.headerName}" />
<link href="${pageContext.request.contextPath }/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">
</head>
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

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h1 class="m-0 font-weight-bold text-primary check-id">검수내역번호</h1>
						</div>

						<div class="card-body ">
							신발
							<input type="radio" value="신발" name="type" id="shoes" onchange="setDisplay()">
							의류
							<input type="radio" value="의류" name="type" id="clothes" onchange="setDisplay()">
							침구
							<input type="radio" value="침구" name="type" id="bedding" onchange="setDisplay()">
							<!-- display-container -->
							<div class="display-container-list">
								<div>리스트</div>
								<div>현재검수내역</div>
							</div>

							<div class="display-container ">
								<div>
									<div class="clothes display-item card-body-scroll">
										<c:forEach items="${laundryList}" var="laundry">
											<c:if test="${laundry.type eq 'c'}">
												<div class="display-flex click-motion add-motion">
													<input type="hidden" value="${laundry.laundryId}" name="laundryId" />
													<input type="hidden" value="${laundry.laundryPrice.priceId}" name="priceId" />
													<span>${laundry.name}</span> <span>${laundry.laundryPrice.price}원</span>
												</div>
											</c:if>
										</c:forEach>
									</div>
									<div class="shoes display-item card-body-scroll" style="display: none">
										<c:forEach items="${laundryList}" var="laundry">
											<c:if test="${laundry.type eq 's'}">
												<div class="display-flex click-motion add-motion">
													<input type="hidden" value="${laundry.laundryId}" name="laundryId" />
													<input type="hidden" value="${laundry.laundryPrice.priceId}" name="priceId" />
													<span>${laundry.name}</span> <span>${laundry.laundryPrice.price}원</span>
												</div>
											</c:if>
										</c:forEach>
									</div>
									<div class="bedding display-item card-body-scroll" style="display: none">
										<c:forEach items="${laundryList}" var="laundry">
											<c:if test="${laundry.type eq 'b'}">
												<div class="display-flex click-motion add-motion">
													<input type="hidden" value="${laundry.laundryId}" name="laundryId" />
													<input type="hidden" value="${laundry.laundryPrice.priceId}" name="priceId" />
													<span>${laundry.name}</span> <span>${laundry.laundryPrice.price}원</span>
												</div>
											</c:if>
										</c:forEach>
									</div>
								</div>
								<hr class="perpendicular" />

								<div class="check-laundry card-body-scroll" id="checkLaundry"></div>
								<!-- display-container -->
							</div>
						</div>
					</div>
				</div>
				<div class="confirm-btn">
					<input type="button" value="검수완료" id="checkConfirm">

				</div>
			</div>
			<!-- /.container-fluid -->
			<%@ include file="../../common/copyright.jsp"%>
		</div>
		<!-- End of Main Content -->
	</div>
	<!-- End of Page Wrapper -->

	<%@ include file="../../common/footer.jsp"%>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap4.min.js"></script>
	<script src="/resources/js/admin.js"></script>
	<script>
			$('.clothes').show();
			$('.bedding').hide();
			$('.shoes').hide();
			function setDisplay() {
				if ($('input:radio[id=clothes]').is(':checked')) {
					$('.clothes').show();
					$('.bedding').hide();
					$('.shoes').hide();
				} else if ($('input:radio[id=shoes]').is(':checked')) {
					$('.bedding').hide();
					$('.shoes').show();
					$('.clothes').hide();
				} else {
					$('.clothes').hide();
					$('.shoes').hide();
					$('.bedding').show();
				}
			}

			var checkLaundryList = new Array();
			$('.add-motion').on('click', function (e) {
				let html = "";
				const tag = $(this)[0];
				const name = $(tag).find('span')[0];
				const price = $(tag).find('span')[1];
				const laundryId = $(tag).find('input')[0].value;
				const priceId = $(tag).find('input')[1].value;

				const checkLaundry = {
					laundryId: parseInt(laundryId),
					name: $(name).text(),
					laundryPrice: {
						priceId: parseInt(priceId),
						price: parseInt($(price).text())
					}
				}
				checkLaundryList.push(checkLaundry);
				$(checkLaundryList).each((idx) => {
					html += "<div class='display-flex click-motion result-laundry'>\
						<input type = 'hidden' value ='" + checkLaundryList[idx].laundryId + "'name = 'resultLaundryId' />\
						<input type='hidden' value='"+ checkLaundryList[idx].laundryPrice.priceId + "' name='resultPriceId'/>\
						<span>" + checkLaundryList[idx].name + "</span> \
						<span>"+ checkLaundryList[idx].laundryPrice.price + " </span>\
						</div > "
				})

				$("#checkLaundry").empty();
				$("#checkLaundry").append(html);

				$(".result-laundry").on('click', function () {
					/* $("#checkLaundry").empty(); */
					const laundryId = $(this).find('input')[0].value;
					var index = 0;
					var check = true;
					checkLaundryList.map((data, idx) => {
						if (data.laundryId === laundryId && check) {
							index = idx;
							check = false;
						}
						return false;
					})
					$(this).remove();
					checkLaundryList.splice(index, 1);
				})
			})
			
			$('#checkConfirm').click(function(){
				if(checkLaundryList.length !==0){
					const rcNo= location.href.split('/')[5].split('?')[0];		
					api.checkComplete(checkLaundryList,rcNo,function(s){
						alert("결제 요청서 등록이 완료되었습니다.");
						location.replace('/admin/main')
					})
				}
			})
			$('.check-id').append(":"+ location.href.split('/')[5].split('?')[0]);
		</script>

</body>

</html>