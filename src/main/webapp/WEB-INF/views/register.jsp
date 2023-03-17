<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="common/header.jsp"%>

<body>

	<div class="container" style="margin-top: 20%;">
		
		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<!-- <div class="col-lg-5 d-none d-lg-block bg-register-image"></div> -->
					<div class="col-lg-7" align="center">
						<div class="p-5">
							<div class="text-center">
								<h4 class="h4 text-gray-900 mb-4">
									<strong>환영합니다!</strong>
								</h4>
								<h6  class="h6 text-gray-900 mb-4">회원 유형을 선택해 주세요</h6>
							</div>
							
							<form id="form" action="/register" method="post" >
								<input id="crewBtn" type="button" value="크루" class="btn btn-secondary btn-user btn-block"  style="font-size: 1.1rem; padding: 0.2rem"> 
								<input id="memberBtn" type="button" value="회원" class="btn btn-secondary btn-user btn-block"  style="font-size: 1.1rem; padding: 0.2rem"> 
								<input id="role" type="hidden" name="role" /> 
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							</form>
														
							<hr>
							<div class="text-center">
								<a class="small" href="/">Already have an account? Login!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="common/footer.jsp"%>
	
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
			
			$('#crewBtn').on("click", function(){
				
				$('#role').attr("value", "ROLE_CREW");
				$('#form').submit();
			});
			
			$('#memberBtn').on("click", function(){
				
				$('#role').attr("value", "ROLE_MEMBER");
				$('#form').submit();
			});
			
		})
		
	</script>
</body>
</html>

