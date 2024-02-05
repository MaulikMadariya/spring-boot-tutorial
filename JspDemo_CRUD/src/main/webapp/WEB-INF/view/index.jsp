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

<style>
/* Demo Code: */
body {
	font-family: 'Open Sans', arial, sans-serif;
	color: #333;
	font-size: 14px;
}
.projcard-container {
	margin: 50px 0;
}

/* Actual Code: */
.projcard-container,
.projcard-container * {
	box-sizing: border-box;
}
.projcard-container {
	margin-left: auto;
	margin-right: auto;
	width: 1000px;
}
.projcard {
	position: relative;
	width: 100%;
	height: 300px;
	margin-bottom: 40px;
	border-radius: 10px;
	background-color: #fff;
	border: 2px solid #ddd;
	font-size: 18px;
	overflow: hidden;
	cursor: pointer;
	box-shadow: 0 4px 21px -12px rgba(0, 0, 0, .66);
	transition: box-shadow 0.2s ease, transform 0.2s ease;
}
.projcard:hover {
	box-shadow: 0 34px 32px -33px rgba(0, 0, 0, .18);
	transform: translate(0px, -3px);
}
.projcard::before {
	content: "";
	position: absolute;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	background-image: linear-gradient(-70deg, #424242, transparent 50%);
	opacity: 0.07;
}
.projcard:nth-child(2n)::before {
	background-image: linear-gradient(-250deg, #424242, transparent 50%);
}
.projcard-innerbox {
	position: absolute;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
}
.projcard-img {
	position: absolute;
	height: 300px;
	width: 400px;
	top: 0;
	left: 0;
	transition: transform 0.2s ease;
}
.projcard:nth-child(2n) .projcard-img {
	left: initial;
	right: 0;
}
.projcard:hover .projcard-img {
	transform: scale(1.05) rotate(1deg);
}
.projcard:hover .projcard-bar {
	width: 70px;
}
.projcard-textbox {
	position: absolute;
	top: 7%;
	bottom: 7%;
	left: 430px;
	width: calc(100% - 470px);
	font-size: 17px;
}
.projcard:nth-child(2n) .projcard-textbox {
	left: initial;
	right: 430px;
}
.projcard-textbox::before,
.projcard-textbox::after {
	content: "";
	position: absolute;
	display: block;
	background: #ff0000bb;
	background: #fff;
	top: -20%;
	left: -55px;
	height: 140%;
	width: 60px;
	transform: rotate(8deg);
}
.projcard:nth-child(2n) .projcard-textbox::before {
	display: none;
}
.projcard-textbox::after {
	display: none;
	left: initial;
	right: -55px;
}
.projcard:nth-child(2n) .projcard-textbox::after {
	display: block;
}
.projcard-textbox * {
	position: relative;
}
.projcard-title {
	font-family: 'Voces', 'Open Sans', arial, sans-serif;
	font-size: 24px;
}
.projcard-subtitle {
	font-family: 'Voces', 'Open Sans', arial, sans-serif;
	color: #888;
}
.projcard-bar {
	left: -2px;
	width: 50px;
	height: 5px;
	margin: 10px 0;
	border-radius: 5px;
	background-color: #424242;
	transition: width 0.2s ease;
}
.projcard-blue .projcard-bar { background-color: #0088FF; }
.projcard-blue::before { background-image: linear-gradient(-70deg, #0088FF, transparent 50%); }
.projcard-blue:nth-child(2n)::before { background-image: linear-gradient(-250deg, #0088FF, transparent 50%); }
.projcard-red .projcard-bar { background-color: #D62F1F; }
.projcard-red::before { background-image: linear-gradient(-70deg, #D62F1F, transparent 50%); }
.projcard-red:nth-child(2n)::before { background-image: linear-gradient(-250deg, #D62F1F, transparent 50%); }
.projcard-green .projcard-bar { background-color: #40BD00; }
.projcard-green::before { background-image: linear-gradient(-70deg, #40BD00, transparent 50%); }
.projcard-green:nth-child(2n)::before { background-image: linear-gradient(-250deg, #40BD00, transparent 50%); }
.projcard-yellow .projcard-bar { background-color: #F5AF41; }
.projcard-yellow::before { background-image: linear-gradient(-70deg, #F5AF41, transparent 50%); }
.projcard-yellow:nth-child(2n)::before { background-image: linear-gradient(-250deg, #F5AF41, transparent 50%); }
.projcard-orange .projcard-bar { background-color: #FF5722; }
.projcard-orange::before { background-image: linear-gradient(-70deg, #FF5722, transparent 50%); }
.projcard-orange:nth-child(2n)::before { background-image: linear-gradient(-250deg, #FF5722, transparent 50%); }
.projcard-brown .projcard-bar { background-color: #C49863; }
.projcard-brown::before { background-image: linear-gradient(-70deg, #C49863, transparent 50%); }
.projcard-brown:nth-child(2n)::before { background-image: linear-gradient(-250deg, #C49863, transparent 50%); }
.projcard-grey .projcard-bar { background-color: #424242; }
.projcard-grey::before { background-image: linear-gradient(-70deg, #424242, transparent 50%); }
.projcard-grey:nth-child(2n)::before { background-image: linear-gradient(-250deg, #424242, transparent 50%); }
.projcard-customcolor .projcard-bar { background-color: var(--projcard-color); }
.projcard-customcolor::before { background-image: linear-gradient(-70deg, var(--projcard-color), transparent 50%); }
.projcard-customcolor:nth-child(2n)::before { background-image: linear-gradient(-250deg, var(--projcard-color), transparent 50%); }
.projcard-description {
	z-index: 10;
	font-size: 15px;
	color: #424242;
	height: 125px;
	overflow: hidden;
	text-overflow: ellipsis;
}
.projcard-tagbox {
	position: absolute;
	bottom: 3%;
	font-size: 14px;
	cursor: default;
	user-select: none;
	pointer-events: none;
}
.projcard-tag {
	display: inline-block;
	background: #E0E0E0;
	color: #777;
	border-radius: 3px 0 0 3px;
	line-height: 26px;
	padding: 0 10px 0 23px;
	position: relative;
	margin-right: 20px;
	cursor: default;
	user-select: none;
	transition: color 0.2s;
}
.projcard-tag::before {
	content: '';
	position: absolute;
	background: #fff;
	border-radius: 10px;
	box-shadow: inset 0 1px rgba(0, 0, 0, 0.25);
	height: 6px;
	left: 10px;
	width: 6px;
	top: 10px;
}
.projcard-tag::after {
	content: '';
	position: absolute;
	border-bottom: 13px solid transparent;
	border-left: 10px solid #E0E0E0;
	border-top: 13px solid transparent;
	right: -10px;
	top: 0;
}

</style>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>



	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-1">
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
					aria-current="page" href="login">LOG IN</a>


				</span> <span class="navbar-text"><a class="nav-link active"
					aria-current="page" href="/signup">SIGN UP</a></span>
			</div>
		</div>
	</nav>

<section class="intro">
		<div class="bg-image h-100"
			style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
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
		<div class="container-fluid">
			<div class="carousel-inner " style="height: 20%;">

				<div class="carousel-item active">
					<img
						src="https://e0.pxfuel.com/wallpapers/305/208/desktop-wallpaper-forex-trading-top-5-brokers-in-full-stock-market.jpg"
						class="d-block w-100" style="height: 350px;"abc">
				</div>
				<div class="carousel-item">
					<img
						src="https://www.canstar.co.nz/wp-content/uploads/2021/02/Investing-in-US-shares.jpg"
						class="d-block w-100" style="height: 350px;"...">
				</div>
				<div class="carousel-item ">
					<img
						src="https://www.bankrate.com/2019/03/22142110/How-to-trade-stocks.jpg"
						class="d-block w-100" style="height: 350px;"...">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>
	
	<div class="projcard-container">
		
	<div class="projcard projcard-blue">
		<div class="projcard-innerbox">
			<img class="projcard-img" src="https://thumbs.dreamstime.com/b/financial-graph-stock-market-chart-forex-investment-business-internet-technology-concept-100369152.jpg" />
			<div class="projcard-textbox">
				<div class="projcard-title">Nifty Bank</div>
				<div class="projcard-subtitle">The Nifty Bank index comprises banking stocks listed on the NSE.</div>
				<div class="projcard-bar"></div>
				<div class="projcard-description">It's important to note that the information provided here is based on the understanding as of my last knowledge update in January 2022. For the most current and specific details about the Nifty Bank index, you may want to refer to the latest financial news, market reports, and official sources from the NSE.</div>
				<div class="projcard-tagbox">
					<span class="projcard-tag">Nifty</span>
					<span class="projcard-tag">Bank</span>
				</div>
			</div>
		</div>
	</div>
	
	<div class="projcard projcard-red">
		<div class="projcard-innerbox">
			<img class="projcard-img" src="https://static4.depositphotos.com/1008939/320/i/450/depositphotos_3208371-stock-photo-exchange.jpg" />
			<div class="projcard-textbox">
				<div class="projcard-title">Sensex</div>
				<div class="projcard-subtitle">The Sensex represents a diverse set of sectors, including finance, information </div>
				<div class="projcard-bar"></div>
				<div class="projcard-description">It's important to note that financial markets are dynamic, and the information provided here is based on my last training data in January 2022. </div>
				<div class="projcard-tagbox">
					<span class="projcard-tag">Nifty 50</span>
					<span class="projcard-tag">Nifty 100</span>
					<span class="projcard-tag">Nifty 200</span>
				</div>
			</div>
		</div>
	</div>
	
	<div class="projcard projcard-green">
		<div class="projcard-innerbox">
			<img class="projcard-img" src="https://bsmedia.business-standard.com/_media/bs/img/misc/2023-03/21/full/market-stocks-stock-market-trading-stock-market-1679390510-62072620.jpg?im=FeatureCrop,size=(826,465)" />
			<div class="projcard-textbox">
				<div class="projcard-title">Nifty 50</div>
				<div class="projcard-subtitle">is the flagship stock market index of the National Stock Exchange of India (NSE).</div>
				<div class="projcard-bar"></div>
				<div class="projcard-description">It's crucial to note that financial markets are dynamic, and the information provided here is based on my last training data in January 2022. For the most up-to-date information on the Nifty 50, including its constituents and performance. </div>
				<div class="projcard-tagbox">
					<span class="projcard-tag">SBI</span>
					<span class="projcard-tag">BOB</span>
				</div>
			</div>
		</div>
	</div>
	
	<div class="projcard projcard-customcolor" style="--projcard-color: #F5AF41;">
		<div class="projcard-innerbox">
			<img class="projcard-img" src="https://www.bankrate.com/2023/06/23124314/Stock-market-basics.jpeg" />
			<div class="projcard-textbox">
				<div class="projcard-title">Nifty 100</div>
				<div class="projcard-subtitle">This index includes 100 stocks from the Nifty 100 index.</div>
				<div class="projcard-bar"></div>
				<div class="projcard-description">or a broader representation of the market, you may want to consider the Nifty 100 Equal Weight Index, which was launched by the NSE. This index includes 100 stocks from the Nifty 100 index, and each stock is assigned an equal weight. </div>
				<div class="projcard-tagbox">
					<span class="projcard-tag">IEX</span>
					<span class="projcard-tag">CDSL</span>
					<span class="projcard-tag">NSDL</span>
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