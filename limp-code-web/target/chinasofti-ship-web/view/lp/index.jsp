<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<!--Title And Meta -->  
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">
		<title>十年+约定=？</title>
		 
		<!-- Global css -->
		<link rel="stylesheet" href="${model}/mone/bootstrap/css/bootstrap.min.css">
		<!-- Custom css -->
		<link rel="stylesheet" type="text/css" href="css/style.css" media="screen"/>
		<!-- Favicon for Tab logo -->
		<link rel="icon" type="image/x-icon" href="${model}/mone/img/favicon/favicon.ico"/>
		<!-- Font awesome for icons -->
		<link rel="stylesheet" type="text/css" href="${model}/mone/css/font-awesome.css" media="screen"/>
		<!-- Wow animated css  -->
		<link rel="stylesheet" type="text/css" href="${model}/mone/css/animate.css" media="screen"/>
		<!-- Protfolio css  -->
		<link rel="stylesheet" type="text/css" href="${model}/mone/css/portfolio.css" media="screen"/>
		<!-- Google web fonts -->
		<link  rel="stylesheet" type="text/css" href='http://fonts.googleapis.com/css?family=Roboto:400,300,900,700,500,100'>
				
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->		
	</head>
	<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
		<!-- ****** Home Section****** -->
		<section id="home" class="home">
			<!-- Navigation -->
			<nav  class="navbar navbar-custom navbar-fixed-top" role="navigation" >
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
							<i class="fa fa-bars"></i>
						</button><!--//Toggle navbar header button-->
						<a class="navbar-brand page-scroll" href="#page-top">
						
						<!--Logo-->
						 <img src="${model}/mone/img/logo/logo.png" class="img-circle logo" alt="Logo"/> <span class="light"> Design</span>
						</a>
					</div><!--//Toggle navbar header-->

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-right text-left navbar-main-collapse">
						<ul class="nav navbar-nav">
							<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
							<li class="hidden">
								<a class="page-scroll" href="#page-top"></a>
							</li>
							<li>
								<a class="page-scroll" href="#features">features</a>
							</li>
							<li>
								<a class="page-scroll" href="#services">Services</a>
							</li>
							<li>
								<a class="page-scroll" href="#portfolio">Portfolio</a>
							</li>
							<li>
								<a class="page-scroll" href="#prize-list">Prizing</a>
							</li>
							<li>
								<a class="page-scroll" href="#team">Team</a>
							</li>
							<li>
								<a class="page-scroll" href="#contact">Contact</a>
							</li>
						</ul><!--//nav-->
					</div><!-- /Navbar-collapse -->
				</div><!-- //Container -->	
			</nav><!-- // Navigation -->
		
			<!--intro Header -->
			<header class="intro">
				<div class="intro-body">
					<div class="container margin">
						<div class="row">
							<div class="col-sm-12 col-xs-12">
								<h1 class="brand-heading intro-padding-top wow fadeInDown" data-wow-delay="800ms" data-wow-duration="1s">Coming Soon</h1>						
								<p class="intro-text wow fadeInDown margin" data-wow-duration="1s" data-wow-delay="2s">We love to share our recent theme & Need help, we love to help, Design is a fully responsive Theme, Use it where you need, Thanks so much for visiting.<br><span>Let Us Know When Website Lunch</span> </p>
								<div class="wow fadeInDown" data-wow-duration="1s" data-wow-delay="3s">
									<form class="form-inline" role="form">
										<div class="form-group">
											<label class="sr-only">Email address</label>
											<input type="email" class="form-control input-lg"  placeholder="Enter Your Email" required/>
										</div>										
										<button type="submit" class="btn btn-primary btn-lg">Notify Me</button>
									</form>
								</div>	
								<a href="#features" class="btn btn-circle page-scroll wow fadeInDown" data-wow-delay="4s" data-wow-duration="1s">
									<i class="fa fa-angle-double-down animated"></i>
								</a>
							</div><!-- //column -->
						</div><!-- //row -->
					</div><!-- //container --> 
				</div><!-- //intro body --> 
			</header><!-- //intro header --> 
		</section><!-- //home section -->
		
		<!-- ******Features section****** -->
		<section id="features" class="features">
			<div class="section-padding">
				<div class="container">      	
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="400ms"> 
							<div class="text-center">
								<i class="fa fa-code fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Web Code</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p> 					
						</div><!-- //item column -->
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="text-center">
								<i class="fa fa-paint-brush fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Web Design</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
						</div><!-- //item column -->
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="900ms">
							<div class="text-center">
								<i class="fa fa-css3 fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">CSS3 version</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed eiusmod tempor incididunt ut labore et.</p> 
						</div><!-- //item column -->
					</div>
					<div class="row">
						<div class="col-md-3 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="400ms"> 
							<div class="text-center">
								<i class="fa fa-rocket fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Flying rocket</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed eiusmod tempor.</p> 					
						</div><!-- //item column -->
						<div class="col-md-3 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="text-center">
								<i class="fa fa-cloud fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Cloudy sky</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed eiusmod tempor.</p> 					
						</div><!-- //item column -->
						<div class="col-md-3 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="900ms">
							<div class="text-center">
								<i class="fa fa-gears fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Settings</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed eiusmod tempor.</p> 					
						</div><!-- //item column -->
						<div class="col-md-3 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="1200ms">
							<div class="text-center">
								<i class="fa fa-flask fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">Thick flask</h3>
							<p class="text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed eiusmod tempor.</p> 				    
						</div><!-- //item column -->
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding--> 			
		</section><!--//features section end-->
		
		<!-- ****** History Section ****** -->
		<section class="history">
			<div class="section-padding">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>Developing Applications </h2>
							</div><!-- section-title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor,ulla varius consequat magna.   
							</div><!-- subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row -->
				</div><!--//container-->
				<div class="container">				
					<div class="row">
						<div class="col-md-6 col-sm-6 col-xs-12"> 
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="img/developer-1.jpg" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">Andoid Apps</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.Ullamco laboris nisi ut aliquip.</p>
								</div><!-- //media body -->
							</div><!-- //media -->
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="img/developer-2.jpg" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">Apple Apps</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.Ullamco laboris nisi ut aliquip.</p>
								</div><!-- //media body -->
							</div><!-- //media -->
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="img/developer-3.jpg" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">Windows Apps</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.Ullamco laboris nisi ut aliquip.</p>
								</div><!-- //media body --> 
							</div><!-- //media -->
						</div><!-- //column -->              
						<div class="col-md-6 col-sm-6 col-xs-12 text-center" data-wow-delay="0.5s">			    
							<h3 class="wow fadeInRight" data-wow-duration="1000ms" data-wow-delay="300ms"> Progressing App </h3>
							<p class="wow fadeInRight" data-wow-duration="1000ms" data-wow-delay="300ms">Lorem ipsum dolor sit amet, consectetur adipisicing elit,<br>do eiusmod tempor incididunt ut labore et dolore magna<br> Aliqua. amet consectetur adipisicing elit</p>
						    <img src="img/iphone.png" class="iphone-apps img-responsive wow fadeInRightBig" data-wow-duration="2000ms" data-wow-delay="300ms" alt="iphone image"/>
						</div><!-- //column -->
					</div><!-- //row -->                 				
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//history section -->
		
		<!-- ****** Testimonials Section ****** -->
		<section class="testimonial">
			<div class="section-padding">
				<div class="container ">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceInUp">
								<h2>Awesome Testimonials </h2>
								<div class="border"></div>
							</div>							
							
							<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">						  
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
									<li data-target="#carousel-example-generic" data-slide-to="1"></li>
									<li data-target="#carousel-example-generic" data-slide-to="2"></li>
								</ol><!-- carousel Indicators -->
								<div class="carousel-inner wow fadeInUpBig" data-wow-delay="1s">
									<div class="item active">
										<div class="carousel-caption">
											<i class="fa fa-android fa-5x"></i><br><br>
											<h3>Android new version coming</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i> Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
											sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
											Ut enim ad minim veniam, quis nostrud exercitation.magna aliqua. 
											enim ad minim veniam, quis nostrud sed do eiusmod tempor incididunt labore, <span> - Ted Mosby</span></div>
										</div><!-- //carousel-caption -->
									</div><!-- //item column -->
									<div class="item">
										<div class="carousel-caption">
											<i class="fa fa-windows fa-5x"></i><br><br>
											<h3>Windows new version coming</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i> Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
											sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
											Ut enim ad minim veniam, quis nostrud exercitation.magna aliqua. 
											enim ad minim veniam, quis nostrud sed do eiusmod tempor incididunt labore, <span> - Md Shaifuddin</span></div>
										</div><!-- //carousel-caption -->
									</div><!-- //item column -->
									<div class="item">
										<div class="carousel-caption">
											<i class="fa fa-apple fa-5x"></i><br><br>
											<h3>Apple new version coming</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i> Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
											sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
											Ut enim ad minim veniam, quis nostrud exercitation.magna aliqua. 
											enim ad minim veniam, quis nostrud sed do eiusmod tempor incididunt labore, <span> - SMA Rayhan</span></div>						
										</div><!-- //carousel-caption -->
									</div><!-- //item column -->
								</div><!-- //carousel-inner -->
								<!-- Controls -->
								<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
									<i class="fa fa-angle-left fa-2x"></i>
								</a>
								<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
									<i class="fa fa-angle-right fa-2x"></i>
								</a>
							</div><!-- //slider -->
						</div><!-- //column -->
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//testimonial section end-->
				
		<!-- ****** Service Section ****** -->
		<section id="services">
			<div class="section-padding">
				<div class="container">
					<div class="row margin">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn" data-wow-duration="1000ms" data-wow-delay="300ms">
								<h2>About recent project</h2>
							</div><!--//title -->
							<div class="subtitle wow fadeInUp" >
								Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor,ulla varius consequat magna.
							</div><!--//subtitle --> 					
						</div><!--//column -->
					</div><!--//row -->
					<div class="row destacados">
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInLeftBig" data-wow-duration="2s">
								<img src="img/service/img-1.jpg" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>Latest Collection</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
								tempor incididunt ut labore et dolore magna aliqua.</p>
								<button class="btn btn-primary">Read more</button>                   
							</div>
						</div>      
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInLeftBig" data-wow-duration="1s">
								<img src="${model}/mone/img/service/img-2.jpg" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>Latest Style</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
								tempor incididunt ut labore et dolore magna aliqua.</p>						  							  
								<button class="btn btn-primary">Read more</button>
							</div>
						</div>	
							
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInRightBig" data-wow-duration="1s">
								<img src="${model}/mone/img/service/img-3.jpg" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>Latest HTML5</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
								tempor incididunt ut labore et dolore magna aliqua.</p>
								<button class="btn btn-primary">Read more</button>
							</div>
						</div>					  
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInRightBig" data-wow-duration="2s">
								<img src="${model}/mone/img/service/img-4.jpg" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>Latest CSS3</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
								tempor incididunt ut labore et dolore magna aliqua.</p>
								<button class="btn btn-primary">Read more</button>
							</div>
						</div><!-- //column -->
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//service section -->
		
		<!-- ****** Portfolio Section****** -->
		<section id="portfolio">
			<div class="section-padding">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="section-title wow bounceIn">
									<h2>Amazing Portfolio </h2>
								</div><!-- //title -->
								<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
									Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida<br> tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia.
								</div><!-- //subtitle --> 					
							</div><!-- //column -->
					</div><!-- //row -->
					<div class="row margin">
						<div class="col-md-12 col-sm-12 col-xs-12">			
							<ul class="cbp-ig-grid">
								<li class="wow flipInX" data-wow-delay="200ms" data-wow-duration="1500ms">						
									<span><img src="${model}/mone/img/portfolio/portfolio-1.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>										
									</span>
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="400ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-2.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="600ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-3.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li>
								<li class="wow flipInX" data-wow-delay="800ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-4.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li><!-- scroll animation -->
							</ul>
						</div><!-- //column -->
					</div><!-- //row --> 
					<div class="row margin">
						<div class="col-sm-col-md-12 col-sm-12 col-xs-12">		
							<ul class="cbp-ig-grid"> 						
								<li class="wow flipInX" data-wow-delay="200ms" data-wow-duration="1500ms">					    
									<span><img src="${model}/mone/img/portfolio/portfolio-5.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="400ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-6.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li>
								<li class="wow flipInX" data-wow-delay="600ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-7.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="800ms" data-wow-duration="1500ms">
									<span><img src="${model}/mone/img/portfolio/portfolio-8.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li><!-- scroll animation -->
							</ul><!--//portfolio images -->
						</div><!-- //column -->
					</div><!-- //row -->
				</div><!--//container-->	
			</div><!--//section padding-->	
		</section><!--//portfolio section -->

		<!-- ****** Prize-List Section****** -->
		<section id="prize-list" class="prize-list">
			<div class="section-padding">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>Choose Your Plan </h2>
							</div><!-- //title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor,ulla varius consequat magna.
							</div><!-- //subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row --> 
					<div class="row margin">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow rotateInDownLeft" data-wow-duration="1000ms" data-wow-delay="500ms">
								<li class="list-group-item plan-name basic-color-2">
									Basic
								</li>
								<li class="list-group-item plan-prize basic-color-1"> 
									<sup>$ </sup> <span> 30/- </span><sub> Month</sub>
								</li>
								<li class="list-group-item plan-features">
									<i class="fa fa-check"></i> 5 Team Members<br/>
									<i class="fa fa-check"></i> 10 MySql database<br/>
									<i class="fa fa-check"></i> 100 GB Bandwith<br/>
									<i class="fa fa-times"></i> 10 GB Storage						
								</li>
								<li class="list-group-item plan-buy-link basic-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group -->
						</div><!-- //column -->
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow flipInY" data-wow-duration="1000ms" data-wow-delay="1200ms">
								<li class="list-group-item plan-name popular-color-2">
									Popular
								</li>
								<li class="list-group-item plan-prize  popular-color-1"> 
									<sup>$ </sup> <span> 150/- </span><sub> Month</sub>
								</li>
								<li class="list-group-item plan-features">
									<i class="fa fa-check"></i> 50 Team Members<br/>
									<i class="fa fa-check"></i> 100 MySql database<br/>
									<i class="fa fa-check"></i> 1000 GB Bandwith<br/>
									<i class="fa fa-check"></i> 50 GB Storage    						
								</li>
								<li class="list-group-item plan-buy-link popular-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group --> 
						</div><!-- //column -->
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow rotateInDownRight" data-wow-duration="1000ms" data-wow-delay="500ms">
								<li class="list-group-item plan-name company-color-2">
									Company
								</li>
								<li class="list-group-item plan-prize company-color-1"> 
									<sup>$ </sup> <span> 500/- </span><sub> Month</sub>
								</li>
								<li class="list-group-item plan-features">
									<i class="fa fa-check"></i> Unlimited Team Members<br/>
									<i class="fa fa-times"></i> Unlimited MySql database<br/>
									<i class="fa fa-check"></i> Unlimited GB Bandwith<br/>				  
									<i class="fa fa-check"></i> Unlimited GB Storage
								</li>
								<li class="list-group-item plan-buy-link company-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group -->  
						</div><!-- //column -->					
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//prizing list section --> 	

		<!-- ****** Team Section****** -->
		<section id="team" class="team demo-4">
			<div class=" section-padding">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>About our genius </h2>
							</div><!-- //title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor,ulla varius consequat magna.
							</div><!-- //subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row -->   
					<div class="row margin">	
						<div class="col-md-3 col-sm-6 col-xs-12 text-center wow slideInLeft" data-wow-duration="1.5s" data-wow-delay="1.5s">
							<div class="box">
								<div class="text-center"><img src="${model}/mone/img/member/member-1.jpg" alt="Team Member 1"/></div>
								<h3 class="text-center">Jackson</h3>
								<div class="text-center"><strong>Web Designer, AMD</strong></div>
								<p class="description text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
								<div class="text-center">
									<a href="#"><i class="fa fa-google-plus fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-twitter fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-linkedin fa-1x social-icon"></i></a> 
								</div>									
							</div><!-- //box -->
						</div><!-- //column -->                     
						<div class="col-md-3 col-sm-6 col-xs-12 text-center wow slideInLeft" data-wow-duration="1.5s" data-wow-delay="1s">
							<div class="box">
								<div class="text-center"><img src="${model}/mone/img/member/member-2.jpg" alt="Team Member 2" class=""/></div>
								<h3 class="text-center">Thomas</h3>
								<div class="text-center"><strong>Web Master, CEO</strong></div>							
								<p class="description text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
								<div class="text-center">
									<a href="#"><i class="fa fa-google-plus fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-twitter fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-linkedin fa-1x social-icon"></i></a>
								</div>	
							</div><!-- //box -->
						</div><!-- //column -->
						<div class="col-md-3 col-sm-6 col-xs-12 text-center wow slideInLeft" data-wow-duration="1.5s" data-wow-delay="0.5s">
							<div class="box">
								<div class="text-center"><img src="${model}/mone/img/member/member-3.jpg" alt="Team Member 3"/></div>
								<h3 class="text-center">Barnny</h3>
								<div class="text-center"><strong>Editor, AMD</strong></div>	
								<p class="description text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
								<div class="text-center">
									<a href="#"><i class="fa fa-google-plus fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-twitter fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-linkedin fa-1x social-icon"></i></a>
								</div>	 									
							</div><!-- //box -->
						</div><!-- //column -->	
						<div class="col-md-3 col-sm-6 col-xs-12 text-center wow slideInLeft" data-wow-duration="1.5s" data-wow-delay="0s">
							<div class="box" >
								<div class="text-center"><img src="${model}/mone/img/member/member-4.jpg" alt="Team Member 4"/></div>
								<h3 class="text-center">Eyrshan</h3>
								<div class="text-center"><strong>Developer, SEO</strong></div>								
								<p class="description text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
								<div class="text-center">
									<a href="#"><i class="fa fa-google-plus fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-twitter fa-1x social-icon"></i></a>
									<a href="#"><i class="fa fa-linkedin fa-1x social-icon"></i></a>
								</div>							
							</div><!-- //box -->
						</div><!-- //column --> 
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//team section -->
		
		<!-- ****** Contact Section****** -->	
		<section id="contact" class="contact">
			<div class="section-padding">
				<div class="container margin">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>Contact us to suggest you</h2>
							</div><!-- //title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia.
							</div><!-- //subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row -->
					<div class="row">
						<div class="col-md-6 col-sm-6 col-xs-12">
							<div class="clearfix wow fadeInUp">
								<h3 class="pull-right">Feel free to drop a couple lines</h3>
							</div>
							
							<!-- ****** Contact Form****** -->
							<form class="form" role="form">
								<div class="form-group form-group-lg wow fadeInUp" data-wow-delay="500ms" data-wow-duration="1s">
									<label class="sr-only">Your Name</label>
									<input type="text" class="form-control" placeholder="Enter Name" required/>
								</div>
								<div class="form-group form-group-lg wow fadeInUp" data-wow-delay="700ms" data-wow-duration="1s">
									<label class="sr-only">Your Email</label>
									<input type="email" class="form-control" placeholder="Enter email" required/>
								</div>
								<div class="form-group wow fadeInUp" data-wow-delay="1000ms" data-wow-duration="1s">
									<label class="sr-only">Your Massage</label>
									<textarea class="form-control" rows="5"  placeholder="Message" required></textarea>
								</div>
								<button type="submit" class="btn btn-primary pull-right wow fadeInUp" data-wow-delay="1200ms" data-wow-duration="1s">Send Us</button>
							</form> 
						</div>
						<div class="col-md-6 col-sm-6 col-xs-12">							
							<h3 class="wow fadeInUp">Our Location</h3> 
							<div class="location">
								<div class="wow fadeInUp"  data-wow-delay="500ms" data-wow-duration="2s">
									<i class="fa fa-road location-icon"></i> 25th Street, Suite 2<br /> 
									<i class="fa fa-home location-icon"></i> New York NY 10887<br/>
									<i class="fa fa-envelope location-icon"></i> infoemail@domain.com <br/> 
									<i class="fa fa-phone location-icon"></i> +40 (0) 231 1234 567<br/>
									<i class="fa fa-mobile-phone fa-lg location-icon"></i> +222 (0) 23 1264 548<br/>
								</div><!-- //animation -->						
							</div>
								<h3 class="wow fadeInUp">Be Social</h3>	
								<a href="#" class="wow flipInY"  data-wow-delay="200ms" data-wow-duration="1s"><i class="fa fa-google-plus fa-1x social-icon"></i></a>
								<a href="#" class="wow flipInY"  data-wow-delay="400ms" data-wow-duration="1s"><i class="fa fa-twitter fa-1x social-icon"></i></a>
								<a href="#" class="wow flipInY"  data-wow-delay="600ms" data-wow-duration="1s"><i class="fa fa-linkedin fa-1x social-icon"></i></a> 
								<a href="#" class="wow flipInY"  data-wow-delay="800ms" data-wow-duration="1s"><i class="fa fa-pinterest fa-1x social-icon"></i></a>
								<a href="#" class="wow flipInY"  data-wow-delay="1000ms" data-wow-duration="1s"><i class="fa fa-dribbble fa-1x social-icon"></i></a>							
						</div><!-- //column --> 
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//contact section -->
		
		<!-- ****** Footer ****** -->	
		<section class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">				    
						<div class="footer-line">
							<a href="#home" class="page-scroll"><i class="fa fa-angle-double-up fa-2x scroll-up"></i></a><br>Copyright &copy; 2014 Design Theme | All Rights Reserved
						</div>
					</div><!-- //column --> 
				</div><!-- //row -->
			</div><!--//container-->		
		</section><!--//contact section -->
		
		<!--///////////////////////////////////// End here all the Section////////////////////////////////////////////-->
						
		<!-- All Java scripts and Plugins --> 
		<!-- Compulsory Need plugin jquery jQuery (necessary for Bootstrap's JavaScript plugins)-->
		<script type="text/javascript" src="${model}/mone/js/jquery-1.11.0.js"></script>
		<!-- Bootstrap js plugin -->
		<script type="text/javascript" src="${model}/mone/bootstrap/js/bootstrap.min.js"></script>
		<!-- Javascript Plugin For Navigation -->
		<script type="text/javascript" src="${model}/mone/js/scrolling-nav.js"></script>
		<!-- Jquery easing plugin -->
		<script type="text/javascript" src="${model}/mone/js/jquery.easing.min.js"></script>
		<!-- wow On Scroll Animation plugins -->
		<script type="text/javascript" src="${model}/mone/js/wow.js"></script>
		<script type="text/javascript" src="${model}/mone/js/wow-id.js"></script>
		<!-- Nice scroll plugins -->
        <script type="text/javascript" src="${model}/mone/js/jquery.nicescroll.js"></script>
	</body>
</html>