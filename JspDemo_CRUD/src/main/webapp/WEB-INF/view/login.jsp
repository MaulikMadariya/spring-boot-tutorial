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
	<style>
	.divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
.h-custom {
height: calc(100% - 73px);
}
@media (max-width: 450px) {
.h-custom {
height: 100%;
}
}
	</style>
	</head>
	<body>
	<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form>
          <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
            <p class="lead fw-normal mb-0 me-3">Sign in with</p>
            
              <a href="#" class="fa fa-google btn btn-primary btn-lg me-2"></a>
            	<a href="#" class="fa fa-facebook btn btn-primary btn-lg me-2"></a>
            	<a href="#" class="fa fa-twitter btn btn-primary btn-lg me-2"></a>

            

            
          </div>

          <div class="divider d-flex align-items-center my-4">
            <p class="text-center fw-bold mx-3 mb-0">Or</p>
          </div>

          <!-- Email input -->
          <div class="form-outline mb-4">
            <input type="email" id="form3Example3" class="form-control form-control-lg"
              placeholder="Enter a valid email address" />
            <label class="form-label" for="form3Example3">Email address</label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-3">
            <input type="password" id="form3Example4" class="form-control form-control-lg"
              placeholder="Enter password" />
            <label class="form-label" for="form3Example4">Password</label>
          </div>

          <div class="d-flex justify-content-between align-items-center">
            <!-- Checkbox -->
            <div class="form-check mb-0">
              <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
              <label class="form-check-label" for="form2Example3">
                Remember me
              </label>
            </div>
            <a href="#!" class="text-body">Forgot password?</a>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
            <button type="button" class="btn btn-primary btn-lg"
              style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="#!"
                class="link-danger">Register</a></p>
          </div>

        </form>
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
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
		

</body>
</html>