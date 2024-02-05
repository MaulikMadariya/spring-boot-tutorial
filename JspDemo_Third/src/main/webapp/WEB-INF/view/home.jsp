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
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>



	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-2">
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
						aria-current="page" href="#">HOME</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">STOCK</a></li>
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
					aria-current="page" href="#">LOG IN</a>


				</span> <span class="navbar-text"><a class="nav-link active"
					aria-current="page" href="#">SIGN UP</a></span>
			</div>
		</div>
	</nav>


	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="container-fluid mb-2" >
		<div class="carousel-inner " style="height:20%;">
			
			<div class="carousel-item active">
				<img src="https://e0.pxfuel.com/wallpapers/305/208/desktop-wallpaper-forex-trading-top-5-brokers-in-full-stock-market.jpg" class="d-block w-100" style="height:350px; alt="abc">
			</div>
			<div class="carousel-item">
				<img src="https://www.canstar.co.nz/wp-content/uploads/2021/02/Investing-in-US-shares.jpg" class="d-block w-100" style="height:350px; alt="...">
			</div>
			<div class="carousel-item ">
				<img src="https://www.bankrate.com/2019/03/22142110/How-to-trade-stocks.jpg" class="d-block w-100" style="height:350px; alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	</div>

	<div class="container-fluid">
		<table border="1" class="table table-success table-striped "
			style="width: 100%">

			<tr>
				<th>Stock Id</th>
				<th>Stock Name</th>
				<th>Stock Price</th>
				<th>Stock Department</th>
				<th>Stock OpeningPrice</th>
				<th>Stock ClosingPrice</th>
				<th>Stock Price prediction</th>
			</tr>
			<c:forEach var="s" items="${name}">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.price}</td>
					<td>${s.department}</td>
					<td>${s.openingPrice}</td>
					<td>${s.closeingPrice}</td>
					<td>${s.predation}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<section class="">
  <!-- Footer -->
  <footer class="text-center text-white" style="background-color: #202020;">
    <!-- Grid container -->
    <div class="container p-4 pb-0">
      <!-- Section: CTA -->
      <section class="">
        <p class="d-flex justify-content-center align-items-center">
          <span class="me-3">Register for free</span>
          <button data-mdb-ripple-init type="button" class="btn btn-outline-light btn-rounded">
            Sign up!
          </button>
        </p>
      </section>
      <!-- Section: CTA -->
    </div>
    <!-- Grid container -->

    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: #000000">
      © 2020 Copyright:
      <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
    </div>
    <!-- Copyright -->
  </footer>
  <!-- Footer -->
</section>
</body>
</html>