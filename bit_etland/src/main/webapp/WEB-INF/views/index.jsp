<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
	@Author :서동준 dongjun8983@gmail.com
	@Date : 2019. 3. 12. 오후 4:49:04
	@File Name : {*}.jsp
	@Desc :
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bit Retail</title>
<meta name="description" content="">
<meta name="author" content="">
<link href="${css}bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${css}fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="${css}magnific-popup/magnific-popup.css" rel="stylesheet"
	type="text/css">
<link href="${css}home/freelancer.min.css" rel="stylesheet">
<link href="${css}index.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="${js}/app.js"></script>
</head>
<body>
	<div class="item1" id="nav">
		<nav
			class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase"
			id="mainNav">
			<div class="container">
				<a class="navbar-brand js-scroll-trigger" href="#page-top">BIT
					ETLAND</a>
				<button
					class="navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded"
					type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					Menu <i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item mx-0 mx-lg-1"><a
							class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
							href="#login">Login Select</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div class="item2" id="header">
		<header class="masthead bg-primary text-white text-center">
			<div class="container">
				<img class="img-fluid mb-5 d-block mx-auto" src="${img}profile.png">
				<h1 class="text-uppercase mb-0">BIT ETLAND</h1>
				<hr class="star-light">
				<h2 class="font-weight-light mb-0">로그인을 선택해주세요!!!!</h2>
			</div>
		</header>
	</div>
	
	<div class="item3" id="main">
		<section class="login" id="login">
			<div class="container">
				<h2 class="text-center text-uppercase text-secondary mb-0">Login
					Select</h2>
				<hr class="star-dark mb-5">
				<div class="grid-container">
					<div class="grid-item" id="left">
						고객 전용<br />
						<br /> <a href="#" id="cust_join">회원가입</a><br /> <a href="#"
							id="cust_login">로 그 인</a>
					</div>
					<div class="grid-item" id="right">
						직원 전용<br />
						<br /> <a href="#" id="emp_register">사원등록</a><br /> <a href="#"
							id="emp_access">접속승인</a>
					</div>
				</div>
			</div>
		</section>
	</div>
	<div class="item5" id="footer">
		<div class="copyright py-4 text-center text-white">
			<div class="container">
				<small>Copyright &copy; My DongJun 2019-03-12</small>
			</div>
		</div>
	</div>
</body>
<script>
app.path.init('${ctx}')
</script>
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.bundle.min.js"></script>

<!-- Plugin JavaScript -->
<script src="${js}/jquery.easing.min.js"></script>
<script src="${js}/jquery.magnific-popup.min.js"></script>

<!-- Contact Form JavaScript -->
<script src="${js}/jqBootstrapValidation.js"></script>
<script src="${js}/contact_me.js"></script>

<!-- Custom scripts for this template -->
<script src="${js}/freelancer.min.js"></script>


</html>

