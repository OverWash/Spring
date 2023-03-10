<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="common/header.jsp"%>

<body>

	<div class="container" style="margin-top: 20%;">
		<form action="/register" method="post">
			<input type="submit" value="크루회원가입" name="ROLE_CREW"> <input type="submit" value="멤버회원가입" name="ROLE_MEMBER"> <input type="hidden" value="ROLE_MEMBER" name="role" /> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">
									<strong>환영합니다!</strong>
								</h1>
							</div>
							<form class="user">
								<div class="form-group">
									<input type="text" class="form-control form-control-user" id="nickname" placeholder="NickName">
								</div>
								<div class="form-group">
									<input type="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Email Address">
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
									</div>
									<div class="col-sm-6">
										<input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Repeat Password">
									</div>
								</div>
								<a href="login.html" class="btn btn-primary btn-user btn-block"> Register Account </a>
							</form>
							<hr>
							<div class="text-center">
								<a class="small" href="login.html">Already have an account? Login!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="common/footer.jsp"%>

	>>>>>>> refs/remotes/origin/feature/bootstrap_reset
</body>
</html>