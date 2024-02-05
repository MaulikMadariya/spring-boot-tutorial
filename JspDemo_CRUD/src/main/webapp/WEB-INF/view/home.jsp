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
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html, body, .intro {
	height: 100%;
}

table td, table th {
	text-overflow: ellipsis;
	white-space: nowrap;
	overflow: hidden;
}

.card {
	border-radius: .5rem;
}
</style>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
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

	<section class="intro">
		<div class="bg-image h-100"
			style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
			<div class="mask d-flex align-items-center h-100"
				style="background-color: rgba(25, 185, 234, .25);">
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-12">
							<div class="card">
								<div class="card-body">
								<a class="btn btn-outline-dark btn-lg rounded-pill";  href="/add"
		role="button">Add Stock</a>
									<div class="table-responsive">
										<table class="table table-hover mb-0">
											<thead>
												<tr>
													<th scope="col">Stock Id</th>
													<th scope="col">Stock Name</th>
													<th scope="col">Stock Price</th>
													<th scope="col">Stock Department</th>
													<th scope="col">Stock OpeningPrice</th>
													<th scope="col">Stock ClosingPrice</th>
													<th scope="col">prediction</th>
													<th scope="col">Action</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="s" items="${name}">
													<tr>
														<td>${s.id}</td>
														<td>${s.name}</td>
														<td style="color:blue;"><b>${s.price}</b></td>
														<td>${s.department}</td>
											
														<td style="color: green;"><span
															class="material-symbols-outlined"
															style="color: green; ">
																arrow_drop_up </span> ${s.openingPrice}</td>
														<td style="color: red;"><span
															class="material-symbols-outlined"
															style="color: Red; ">
																arrow_drop_down </span> ${s.closeingPrice}</td>
														<td>${s.predation}</td>
														<td ><span class="material-symbols-outlined">

<a style="text-decoration: none; color:Red;" href="delete?id=${s.id }">delete</a></span> | <span class="material-symbols-outlined">
<a style="text-decoration: none; color:blue;" href="/edit?id=${s.id }">border_color</a>
</span></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
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
</body>
</html>