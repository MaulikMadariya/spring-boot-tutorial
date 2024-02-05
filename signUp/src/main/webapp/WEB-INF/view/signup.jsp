<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="navbar.jsp"></jsp:include>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>

</head>
<body>

	<section class="vh-100" style="background-color: #2779e2;">
	
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-xl-9">

					<h1 class="text-white mb-4">Student Registration</h1>

					<div class="card" style="border-radius: 15px;">
						<div class="card-body">
						<div class="text-center">
			<c:if test="${param.success != null}">
				<div style="color: green; font-weight: bold;">${param.body}</div>
			</c:if>
 
			<c:if test="${param.error != null}">
				<div style="color: red; font-weight: bold;">${param.body}</div>
			</c:if>
		</div>
					<form method="post" action="/student/addUser">
							<div class="row align-items-center pt-4 pb-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">User Name</h6>

								</div>
								<div class="col-md-9 pe-5">

									<input type="text" class="form-control form-control-lg"
										placeholder="example" name="username" required="required"/>

								</div>
							</div>

							<hr class="mx-n3">
							
							<div class="row align-items-center pt-4 pb-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">Password</h6>

								</div>
								<div class="col-md-9 pe-5">

									<input type="text" class="form-control form-control-lg"
										placeholder="example@123" name="password" required="required"/>

								</div>
							</div>

							<hr class="mx-n3">

							<div class="row align-items-center py-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">Email address</h6>
								</div>
								<div class="col-md-9 pe-5">
									<input type="email" class="form-control form-control-lg"
										placeholder="example@example.com" name="email"  required="required"/>

								</div>
							</div>

							<hr class="mx-n3">

							<div class="row align-items-center py-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">Roll</h6>

								</div>
								<div class="col-md-9 pe-5">

									<select class="form-control form-control-lg" name="role" required="required">
										<option selected value="user">Select Role</option>
										<option  value="user">USER</option>
										<option  value="admin">ADMIN</option>
									</select>

								</div>
							</div>

							

							<hr class="mx-n3">

							<div class="px-5 py-4">
								<button type="submit" class="btn btn-primary btn-lg">Send
									application</button>
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