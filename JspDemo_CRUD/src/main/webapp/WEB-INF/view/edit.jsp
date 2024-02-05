<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Stock Treading</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarScroll"
				aria-controls="navbarScroll" aria-expanded="false"
				aria-label="Toggle navigation">
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
<section class="vh-100 bg-image"
	style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
	<div class="mask d-flex align-items-center h-100 gradient-custom-3">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-9 col-lg-7 col-xl-6">
					<div class="card" style="border-radius: 15px;">
						<div class="card-body p-5">
							<h2 class="text-uppercase text-center mb-5">Edit Stock</h2>
					
							<form action="/addStock" method="post">
									<input type="hidden" name="id" value="${name.id}" />
								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example1cg">Stock
										Name</label> <input type="text" id="form3Example1cg" name="name" value="${name.name }"
										class="form-control form-control-lg" required />
								</div>

								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example3cg">Stock
										Price</label> <input type="text" id="form3Example3cg" name="price" value="${name.Price }"
										class="form-control form-control-lg" required />
								</div>

								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example4cg">Stock
										Department</label> <input type="text" id="form3Example4cg" value="${name.department }"
										name="department" class="form-control form-control-lg"
										required />
								</div>

								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example4cdg">Stock
										OpeningPrice</label> <input type="text" id="form3Example4cdg" value="${name.OpeningPrice }"
										name="openingPrice" class="form-control form-control-lg"
										required />
								</div>

								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example4cdg">Stock
										ClosingPrice</label> <input type="text" id="form3Example4cdg" value="${name.CloseingPrice }"
										name="closeingPrice" class="form-control form-control-lg"
										required />
								</div>

								<div class="form-outline mb-4">
									<label class="form-label" for="form3Example4cdg">Stock
										Price prediction</label> <input type="text" id="form3Example4cdg" value="${name.predation }"
										name="predation" class="form-control form-control-lg" required />
								</div>



								<div class="d-flex justify-content-center">
									<input type="submit"
										class="btn btn-success btn-block btn-lg gradient-custom-4 text-body"
										value="Add Stock">
								</div>



							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
</head>
<body>
<section class="">
		<!-- Footer -->
		<footer class="text-center text-white"
			style="background-color: #202020;">
			<!-- Grid container -->
			<div class="container p-4 pb-0">
				<!-- Section: CTA -->
				<section class="">
					<p class="d-flex justify-content-center align-items-center">
						<span class="me-3">Register for free</span>
						<a href="#" class="fa fa-google btn btn-secondary  btn-lg me-2"></a>
            	<a href="#" class="fa fa-facebook btn btn-secondary  btn-lg me-2"></a>
            	<a href="#" class="fa fa-twitter btn btn-secondary  btn-lg me-2"></a>
					</p>
				</section>
				<!-- Section: CTA -->
			</div>
			<!-- Grid container -->

			<!-- Copyright -->
			<div class="text-center p-3" style="background-color: #000000">
				© 2020 Copyright: <a class="text-white"
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