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
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Stock Treading</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarScroll" aria-controls="navbarScroll"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarScroll">
			<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll ms-5"
				style="--bs-scroll-height: 100px;">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="/index">HOME</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="/">STOCK</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">SIP</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">ABOUT US</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">CONTACT US</a></li>
			</ul>

			<form class="d-flex">

				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-primary" type="submit">Search</button>

			</form>
			<span class="navbar-text ms-3"> <a class="nav-link active"
				aria-current="page" href="/login">LOG IN</a>


			</span> <span class="navbar-text"><a class="nav-link active"
				aria-current="page" href="/signup">SIGN UP</a></span>
		</div>
	</div>
</nav>

</head>
<body>
	<section class="vh-100" style="background-color: #eee;">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-12 col-xl-11">
					<div class="card text-black" style="border-radius: 25px;">
						<div class="card-body p-md-5">
							<div class="row justify-content-center">
								<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

									<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
										up</p>

									<form class="mx-1 mx-md-4">

										<div class="d-flex flex-row align-items-center mb-4">
											<span class="material-symbols-outlined me-3">
												contacts_product </span>
											<div class="form-outline flex-fill mb-0">
												<label class="form-label" for="form3Example1c">Your
													Name</label> <input type="text" id="form3Example1c"
													class="form-control" />

											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<span class="material-symbols-outlined me-3"> mail </span>
											<div class="form-outline flex-fill mb-0">
												<label class="form-label" for="form3Example3c">Your
													Email</label> <input type="email" id="form3Example3c"
													class="form-control" />

											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<span class="material-symbols-outlined me-3"> lock </span>
											<div class="form-outline flex-fill mb-0">
												<label class="form-label" for="form3Example4c">Password</label>
												<input type="password" id="form3Example4c"
													class="form-control" />
											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<span class="material-symbols-outlined me-3"> lock_reset </span>
											<div class="form-outline flex-fill mb-0">
												<label class="form-label" for="form3Example4cd">Repeat
													your password</label> <input type="password" id="form3Example4cd"
													class="form-control" />
											</div>
										</div>

										<div class="form-check d-flex justify-content-center mb-5">
											<input class="form-check-input me-2" type="checkbox" value=""
												id="form2Example3c" /> <label class="form-check-label"
												for="form2Example3"> I agree all statements in <a
												href="#!">Terms of service</a>
											</label>
										</div>

										<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
											<button type="button" class="btn btn-primary btn-lg">Register</button>
										</div>

									</form>

								</div>
								<div
									class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

									<img
										src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
										class="img-fluid" alt="Sample image">

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="">
		<!-- Footer -->
		<footer class="text-center text-white"
			style="background-color: #202020;">
			<!-- Grid container -->
			<div class="container p-4 pb-0">
				<!-- Section: CTA -->
				<section class="">
					<p class="d-flex justify-content-center align-items-center">
						<span class="me-3">Register for free</span> <a href="#"
							class="fa fa-google btn btn-secondary  btn-lg me-2"></a> <a
							href="#" class="fa fa-facebook btn btn-secondary  btn-lg me-2"></a>
						<a href="#" class="fa fa-twitter btn btn-secondary  btn-lg me-2"></a>
					</p>
				</section>
				<!-- Section: CTA -->
			</div>
			<!-- Grid container -->

			<!-- Copyright -->
			<div class="text-center p-3" style="background-color: #000000">
				� 2020 Copyright: <a class="text-white"
					href="https://mdbootstrap.com/">MDBootstrap.com</a>
			</div>
			<!-- Copyright -->
		</footer>
		<!-- Footer -->
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>
</html>