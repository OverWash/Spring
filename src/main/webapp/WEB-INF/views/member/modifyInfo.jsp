<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>
<head>
<meta name="_csrf" th:content="${_csrf.token}" />
<meta name="_csrf_header" th:content="${_csrf.headerName}" />
</head>
<script src="/resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	const token = $("meta[name='_csrf']").attr("th:content");
	const header = $("meta[name='_csrf_header']").attr("th:content");
	
	$(function() {
		$('#modify').click(function() {
			alert('click');
			var data = {
				memberId 	  : $("#memberId").val(),
				memberAddress : $("#memberAddress").val(),
				memberContact : $("#memberContact").val(),
				nickname      : $("#nickname").val(),
				user : {
					userId   : $("#userId").val(),
					email    : $("#email").val(),
					password : $("#password").val()
				}
			};
			
			$.ajax({
				type : "patch",
				contentType : "application/json; charset=UTF-8",
				data : JSON.stringify(data),
				url : "/member/modify",
				beforeSend : function(xhr) { //데이터를 전송하기 전에 헤더에 csrf값을 설정한다
					xhr.setRequestHeader(header, token);
				},
				success : function(res) {
					alert("정보가 수정되었습니다.");
					 window.location = "/member/main" ;
				}
			});
		});
		
		$("#confirmPw").hide();
		$("#check").hide();
		
		$("#remove").click(function() {
			$("#confirmPw").show();
			$("#check").show();
		});
		
		$("#check").click(function () {
			var data = {
					userId   : $("#userId").val(),
					email    : $("#email").val(),
					password : $("#confirmPw").val(),
			}
			
			$.ajax({
				type        : "post",
				contentType : "application/json; charset=UTF-8",
				data        : JSON.stringify(data),
				url         : "/member/checkpw",
				beforeSend  : function(xhr) { //데이터를 전송하기 전에 헤더에 csrf값을 설정한다
					xhr.setRequestHeader(header, token);
				},
				success : function (data) {
					if (data === "success") {
						remove();
					}else {
						alert("비밀번호가 틀렸습니다.");
					}
				}
			});
		})
		
		function remove() {
			var memberId = $("#memberId").val();
			$.ajax({
				type        : "patch",
				contentType : "application/json; charset=UTF-8",
				data        : memberId,
				url         : "/member/remove" + "/" + memberId,
				beforeSend  : function(xhr) { //데이터를 전송하기 전에 헤더에 csrf값을 설정한다
					xhr.setRequestHeader(header, token);
				},
				success : function(data) {
					if (data === "success") {
						alert("탈퇴가 완료되었습니다.");
						window.location = "/login" ;
					}else {
						alert("비밀번호가 틀렸습니다.");
					}
				}
			})
		}
	})
</script>
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
							<!-- 최근 예약 내역 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">회원정보 수정</h4>
								</div>
								<div class="card-body">
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											이메일 : <input type="text" value="${memberDTO.user.email }" readonly id="email">
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											비밀번호 : <input type="password" value="${memberDTO.user.password }" id="password">
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											주소 : <input type="text" value="${memberDTO.memberAddress }" id="memberAddress">
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											연락처 : <input type="text" value="${memberDTO.memberContact }" id="memberContact" readonly>
										</h4>
									</div>
									<div class="reservationList">
										<h4 class="middle font-weight-bold">
											닉네임 : <input type="text" value="${memberDTO.nickname }" id="nickname">
										</h4>
									</div>
									<input type="hidden" value="${memberDTO.memberId}" id="memberId">
									<input type="hidden" value="${memberDTO.user.userId}" id="userId">
									<button id="modify">수정</button>
									<button id="remove">탈퇴</button><br>
									<input type="password" id="confirmPw" placeholder="비밀번호를 입력하세요">
									<button id="check">확인</button>
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