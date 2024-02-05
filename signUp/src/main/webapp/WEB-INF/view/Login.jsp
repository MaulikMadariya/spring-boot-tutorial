<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="navbar.jsp"></jsp:include>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #2779e2;">
	<section class="vh-100 gradient-custom" >
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-white text-dark" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
						<c:if test="${param.error != null}">
				<div style="color: Red; font-weight: bold;">User Not Found</div>
			</c:if>
					<form action="/login" method="post">
							<div class="mb-0 md-5 mt-md-4 pb-5">

								<h2 class="fw-bold mb-2 text-uppercase">Login</h2>
								<p class="text-dark-50 mb-5">Please enter your login and
									password!</p>
					<hr class="mx-n3">
								<div class="form-outline form-dark mb-4">
								<label
										class="form-label" for="typeEmailX">Username</label>
									<input type="text" id="typeEmailX" name="username"
										class="form-control form-control-lg" placeholder="example" /> 
								</div>

								<div class="form-outline form-dark mb-4">
								<label
										class="form-label" for="typePasswordX">Password</label>
									<input type="password" id="typePasswordX" name="password"
										class="form-control form-control-lg" placeholder="example@123" /> 
								</div>

								<p class="small mb-1 pb-lg-2">
									<a class="text-dark-50" href="#!">Forgot password?</a>
								</p>
								<hr class="mx-n3">
								<button class="btn btn-primary btn-lg px-5 mt-5" type="submit">Login</button>

								

							</div>

							<div>
								<p class="mb-0">
									Don't have an account? <a href="signup"
										class="text-dark-50 fw-bold">Sign Up</a>
								</p>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
