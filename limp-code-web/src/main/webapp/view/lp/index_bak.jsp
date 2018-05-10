<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<!--Title And Meta -->
		<title>LP框架 官网-LP旨在打造超速Web开发平台框架之利器,开发集成插件配套方案，免费技术支持服务，让框架"小白"3分钟超速搭建自己的专有服务</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="keywords" content="LP官网,LP,LP框架,LP协同办公,limp,Java应用开源框架, Java EE(J2EE)快速开发框架,JAVA开发框架,java" />
		<meta name="description" content="LP框架是一款极速 web开发框架平台（有3分钟速成之神速美称），由十年同学倾心打造,配有成熟的解决方案，以及相关插件供开发者使用，最重要的是免费，提供技术支持【QQ交流群：369022804 加群备注:LP官网】" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="author" content="十年,shiniandate@163.com">


			<!-- Global css -->
		<link rel="stylesheet" href="${ctx}/view/lp/bootstrap/css/bootstrap.min.css">
		<!-- Custom css -->
		<link rel="stylesheet" type="text/css" href="${ctx}/view/lp/css/lp-style.css" media="screen"/>
		<!-- Favicon for Tab logo -->
		<!-- Font awesome for icons -->
		<link rel="stylesheet" type="text/css" href="${ctx}/view/lp/css/font-awesome.css" media="screen"/>
		<!-- Wow animated css  -->
		<link rel="stylesheet" type="text/css" href="${ctx}/view/lp/css/animate.css" media="screen"/>
		<!-- Protfolio css  -->
		<link rel="stylesheet" type="text/css" href="${ctx}/view/lp/css/portfolio.css" media="screen"/>
		<link rel="stylesheet" type="text/css" href="${ctx}/view/lp/css/lp-index.css" media="screen"/>
		<%--layui--%>
		<link rel="stylesheet" type="text/css" href="${ctx}/systemsite/plug/layui-v2.2.6/css/layui.css" media="screen"/>
		<!-- Google web fonts -->

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
						 <img src="${ctx}/view/lp/img/logo/logo2.png" class="img-circle logo" alt="Logo"/> <span class="light"> 年</span>
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
								<a class="page-scroll" href="#features">LP介绍</a>
							</li>
							<li>
								<a class="page-scroll"  href="javascript:void(0)">在线文档</a>
							</li>
							<li>
								<a class="page-scroll" href="javascript:void(0)">在线演示</a>
							</li>
							<li>
								<a class="page-scroll" href="javascript:void(0)">协同办公</a>
							</li>

							<li>
								<a class="page-scroll" href="javascript:void(0)">知识库</a>
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
								<h1 class="brand-heading intro-padding-top wow fadeInDown" data-wow-delay="800ms"
									data-wow-duration="1s" ><span   data-toggle="tooltip"  data-placement="bottom"  title="Let internet more populor">LIMP</span></h1>

								<p class="intro-text wow fadeInDown margin" data-wow-duration="1s" data-wow-delay="2s">
									超速Web开发平台框架,企业协同办公开发之利器<br><span>
由"十年"倾情打造，面向所有Java开发者，3分速成快速搭建企业框架,配备丰富插件及集成解决方案</span><br/>
									<%--<a href="http://www.shinians.com"> <span>www.shinians.com</span></a>--%>
								</p>
								<div class="wow fadeInDown" data-wow-duration="1s" data-wow-delay="3s">
									<form class="form-inline" role="form">
										<%--<div class="form-group">
											<label class="sr-only">Email address</label>
											<input type="email" class="form-control input-lg"  placeholder="Enter Your Email" required/>
										</div>	--%>
										<style>

											/*.lp-xin3*/
										</style>

											<div type="submit" class="btn-lg lp-down"><a href="#" target="_blank">
												<i class="glyphicon glyphicon-download"></i>&nbsp;立即下载 </a></div>
									</form>
									<div class="wow fadeInUp lp-version"  data-wow-delay="500ms" data-wow-duration="2s">
										当前版本：V1.1.3 &nbsp;<a href="#">更新日志</a> &nbsp;集成项目数量：30<br />
									</div><!-- //animation -->
								</div>

								<a href="#features" class="btn btn-circle page-scroll wow fadeInDown" data-wow-delay="4s" data-wow-duration="1s">
									<i class="fa fa-angle-double-down animated"></i>
								</a>
								<div class="xin">
									<div class="lp-xin1"></div>
									<div class="lp-xin2"></div>
									<div class="lp-xin3"></div>
								</div>
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
								<i class="fa fa-rocket fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">极速开发</h3>
							<p class="text-p" >LP框架拥有3分钟速成神速之美称,快速框架搭建,分分钟钟完成模块的增删改查简单逻辑，彻底解放双手【神速利器】</p>
						</div>

						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="text-center">
								<i class="fa fa-paint-brush fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">网站设计</h3>
							<p class="text-p">采用主流前端框架:Bootstrap+LayUI+Vue+其它封装插件无缝结合,以及前沿的网站设计,力求带来震撼【精美包装】</p>
						</div><!-- //item column -->
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="900ms">
							<div class="text-center">
								<i class="fa fa-css3 fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">资源中心</h3>
							<p class="text-p">十年开发数据资源,主题模块化整理，只为让开发者便于查找，增加开发效率.【海量知识库】</p>
						</div><!-- //item column -->
					</div>
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="400ms">
							<div class="text-center">
								<i class="fa fa-code fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">协同编码</h3>
							<p class="text-p">LP协同办公继承开发者编程习惯,简化编码流程,协同开发者编码,缩减开发时长，【LP实习小生】</p>
						</div><!-- //item column -->
						<!-- //item column -->
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="600ms">
							<div class="text-center">
								<i class="fa fa-cloud fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">网络云</h3>
							<p class="text-p">微视频授课,在线辅助,海量技能点在线培训,尽在LP网络云【云服务】</p>
						</div><!-- //item column -->
						<div class="col-md-4 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="900ms">
							<div class="text-center">
								<i class="fa fa-gears fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">系统管理</h3>
							<p class="text-p" >数据同步、账号登陆、角色授权...一键化管理,超多管理模块协助开发者场景切换【系统管理】</p>
						</div><!-- //item column -->
						<%--<div class="col-md-3 col-sm-6 col-xs-12 wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="1200ms">
							<div class="text-center">
								<i class="fa fa-flask fa-3x project-icon"></i>
							</div><!-- //icon -->
							<h3 class="text-center">www.shinians.com</h3>
							<p class="text-p">“十年”</p>
						</div>--%>
						<!-- //item column -->
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding--> 			
		</section><!--//features section end-->

		<!-- ****** Footer ****** -->
		<section class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">				    
						<div class="footer-line">
							<a href="#home" class="page-scroll"><i class="fa fa-angle-double-up fa-2x scroll-up"></i></a><br>LP企业极速开发平台框架官方网站<br>
                           <br>Copyright &copy; 2018 本站由LP团队原创出品，禁止模仿，违者必究| All Rights Reserved
						</div>
					</div><!-- //column --> 
				</div><!-- //row -->
			</div><!--//container-->		
		</section><!--//contact section -->

		<!--///////////////////////////////////// End here all the Section////////////////////////////////////////////-->
						
		<!-- All Java scripts and Plugins --> 
		<!-- Compulsory Need plugin jquery jQuery (necessary for Bootstrap's JavaScript plugins)-->
		<script type="text/javascript" src="${ctx}/view/lp/js/jquery-1.11.0.js"></script>

		<script type="text/javascript" src="${ctx}/systemsite/plug/layui-v2.2.6/layui.all.js"></script>
		<!-- Bootstrap js plugin -->
		<script type="text/javascript" src="${ctx}/view/lp/bootstrap/js/bootstrap.min.js"></script>
		<!-- Javascript Plugin For Navigation -->
		<script type="text/javascript" src="${ctx}/view/lp/js/scrolling-nav.js"></script>
		<!-- Jquery easing plugin -->
		<script type="text/javascript" src="${ctx}/view/lp/js/jquery.easing.min.js"></script>
		<!-- wow On Scroll Animation plugins -->
		<script type="text/javascript" src="${ctx}/view/lp/js/wow.js"></script>
		<script type="text/javascript" src="${ctx}/view/lp/js/wow-id.js"></script>
		<!-- Nice scroll plugins -->
		<script type="text/javascript" src="${ctx}/view/lp/js/jquery.nicescroll.js"></script>
		<script type="text/javascript" src="${ctx}/view/lp/js/lp-index.js"></script>

		<script>


			$(function(){

			})


		</script>
	</body>
</html>