<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.gradient-custom-3 {
	/* fallback for old browsers */
	background: #84fab0;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 0.5),
		rgba(143, 211, 244, 0.5));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	background: linear-gradient(to right, rgba(132, 250, 176, 0.5),
		rgba(143, 211, 244, 0.5))
}

.gradient-custom-4 {
	/* fallback for old browsers */
	background: #84fab0;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 1),
		rgba(143, 211, 244, 1));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	background: linear-gradient(to right, rgba(132, 250, 176, 1),
		rgba(143, 211, 244, 1))
}
</style>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<section class="vh-100 bg-image"
		style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
		<div class="mask d-flex align-items-center h-100 gradient-custom-3">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<h2 class="text-uppercase text-center mb-5">Create an
									account</h2>

								<form action="/addCar" method="post">
									<input type="hidden" name="id" value="${name.id }" />
									<div class="form-outline mb-4">
										<label class="form-label" for="form3Example1cg">Car
											Name</label> <input type="text" id="form3Example1cg" name="name"
											value="${name.name }" class="form-control form-control-lg" />
									</div>

									<div class="form-outline mb-4">
										<label class="form-label" for="form3Example3cg">Company
											Name</label> <input type="text" id="form3Example3cg" name="company"
											value="${name.company}" class="form-control form-control-lg" />
									</div>

									<div class="form-outline mb-4">
										<label class="form-label" for="form3Example4cg">Car
											Type</label> <input type="text" id="form3Example4cg" name="type"
											value="${name.type }" class="form-control form-control-lg" />
									</div>

									<div class="form-outline mb-4">
										<label class="form-label" for="form3Example4cdg">Car
											Price</label> <input type="text" id="form3Example4cdg" name="price"
											value="${name.price }" class="form-control form-control-lg" />
									</div>


									<div class="d-flex justify-content-center">
										<button type="submit"
											class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Add
											Car</button>
									</div>


								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>