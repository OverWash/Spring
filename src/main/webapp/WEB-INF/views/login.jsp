<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>

<%@ include file="common/header.jsp"%>

<body>

	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9" style="margin-top: 20%;">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">
											<strong>overWash</strong>
										</h1>
									</div>
									<!-- Login Form -->
									<h2>
										<c:out value="${error}" />
									</h2>
									<h2>
										<c:out value="${logout}" />
									</h2>
									<form class="user" action="/login" method="post">
										<div class="form-group">
											<input type="text" name='username' value='member' class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address...">
										</div>





										<div class="form-group">
											<input type='password' name='password' value='1234' class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
										</div>
										<div class="form-group">
											<div class="custom-control custom-checkbox small">
												<input type="checkbox" class="custom-control-input" id="customCheck"> <label class="custom-control-label" for="customCheck">Remember Me</label>
											</div>
										</div>
										<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> <input type='submit'>
										<a href="/" class="btn btn-secondary btn-user btn-block" style="font-size: 1.2rem; padding: 0.2rem"> Login </a>
										<p></p>
										<a href="#" class="btn btn-secondary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-flag"></i>
											</span> <span class="text">For Crew</span>
										</a>

										<a href="#" class="btn btn-secondary btn-icon-split">
											<span class="icon text-white-50"> <i class="fas fa-info"></i>
											</span> <span class="text">For Manager</span>
										</a>
									</form>
									<!-- Login Form -->
									<hr>
									<div class="text-center">
										<a class="small" href="register.html">Create an Account!</a>
									</div>
								</div>
							</div>
						</div>
						<!-- Nested Row within Card Body -->
					</div>
				</div>
			</div>
		</div>
		<!-- Outer Row -->
	</div>
	<!-- Container -->
</body>
</html>