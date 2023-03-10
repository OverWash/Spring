<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../common/header.jsp"%>

<body>

	<div class="container" style="margin-top: 20%;">
		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h4 class="h4 text-gray-900 mb-4">
									<strong>멤버 회원가입</strong>
								</h4>
							</div>
							<form id="form" class="user" action="/register/member" method="post" accept-charset="UTF-8">
								<!-- user info (email, password) -->
								<!-- user info (email, password) -->
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="email" class="form-control form-control-user" id="email" name="email" placeholder="이메일 주소" required="required">
									</div>

									<div class="col-sm-6">
										<input type="button" class="btn btn-secondary btn-user btn-block" id="emailCheckBtn" name="emailCheckBtn" value="중복체크">
									</div>

									<div class="text-center">
										<span id="impossible">이미 존재하는 아이디입니다.</span> <span id="possible">생성 가능한 아이디입니다.</span>
									</div>

								</div>
								
								<div class="form-group">
									<input type="password" class="form-control form-control-user" id="password" name="password" placeholder="비밀번호" required="required">
								</div>
							
								<!-- member info -->
								<div class="form-group">
									<input type="text" class="form-control form-control-user" id="nickname" name="nickname" placeholder="닉네임" required="required">
								</div>
								<div class="form-group">
									<input type="tel" class="form-control form-control-user" id="memberContact" name="memberContact" placeholder="연락처(숫자만 입력)" required="required">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-user" id="memberAddress" name="memberAddress" placeholder="주소" required="required">
								</div>
				
								<input id="submitBtn" type="submit" class="btn btn-primary btn-user btn-block" value="Register Account"> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
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
	<%@ include file="../common/footer.jsp"%>
	<%@ include file="../common/checkEmail.jsp" %>

</body>
</html>