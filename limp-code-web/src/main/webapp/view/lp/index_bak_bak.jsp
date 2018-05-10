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
								<a class="page-scroll" href="#features">独有特点</a>
							</li>
							<li>
								<a class="page-scroll" href="#services">服务类型</a>
							</li>
							<li>
								<a class="page-scroll" href="#portfolio">必备技能</a>
							</li>
							<li>
								<a class="page-scroll" href="#prize-list">选择魔板</a>
							</li>
							<li>
								<a class="page-scroll" href="#team">我们团队</a>
							</li>
							<li>
								<a class="page-scroll" href="#contact">联系我们</a>
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
		
		<!-- ****** History Section ****** -->
		<section class="history">
			<div class="section-padding">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>拒绝“遗憾"，传递您的“祝福”</h2>
							</div><!-- section-title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">其实高中时听朋友告诉我你喜欢我，当时我是震惊的，因为那时小学毕业时你在我小心翼翼递给你的同学录上乱涂乱画，当时的我其实就是想毕业了哪怕留下你的字也好，可是却被你毁了，我一直以为你是讨厌我的。所以后来初中三年即使是在路上遇见我都是避着你的，我认为你是讨厌我的。直到高二那年，遇到一个小学时的好朋友，我知道她当年很喜欢你，她让我猜你喜欢的是谁，我说不知道，她告诉我其实你喜欢的是我，直到那时我才回忆起以前的一点一滴，只是那么难以置信。可是这时的我已经没有了当初的感觉了，再也不可能回到过去了，而你也永远不会知道我也曾喜欢着你这一事实，你是我这辈子第一个喜欢的人，我永远都不会告诉你，在这里说，你肯定也不会看到。有些事情错过了，就让它过去吧。
							</div><!-- subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row -->
				</div><!--//container-->
				<div class="container">				
					<div class="row">
						<div class="col-md-6 col-sm-6 col-xs-12"> 
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="${ctx}/view/lp/img/ap_1.png" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">Single Party</h3>
									<p class="text-left"> 过了零点 ， 勉强算今天， 今天是我的生日， 除了父母， 身边确没一个人记得。</p>
								</div><!-- //media body -->
							</div><!-- //media -->
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="${ctx}/view/lp/img/ap_3.png" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">Only me</h3>
									<p class="text-left"> 永远忘不掉,那一夜一个人,对着洒水车大声喊着,谢谢你,原来车放的音乐,是生日快乐。</p>
								</div><!-- //media body -->
							</div><!-- //media -->
							<div class="media wow fadeInLeft"> 
								<a class="pull-left" href="#"> <img class="media-object img-rounded" src="${ctx}/view/lp/img/ap_2.png" alt="..."/></a>
								<div class="media-body">
									<h3 class="media-heading">No Body</h3>
									<p class="text-left">去年夏天一个人, 去重庆旅游, 遇见一个女孩儿, 全程一个人过生日, 点蜡烛、吹蜡烛, 许愿、切蛋糕, 忍不住买了把心形气球, 送给她, 说了句生日快乐, 转身就走, 不忍心再看下去...</p>
                                </div>
                                <!-- //media body -->
							</div><!-- //media -->
						</div><!-- //column -->              
						<div class="col-md-6 col-sm-6 col-xs-12 text-center" data-wow-delay="0.5s">			    
							<h3 class="wow fadeInRight" data-wow-duration="1000ms" data-wow-delay="300ms">一个人的城市 </h3>
							<p class="wow fadeInRight" data-wow-duration="1000ms" data-wow-delay="300ms">
                                您在这座城市，做过最孤独的事是什么？<br></p>
						    <img src="${ctx}/view/lp/img/0.png" class="iphone-apps img-responsive wow fadeInRightBig" data-wow-duration="2000ms" data-wow-delay="300ms" alt="iphone image"/>
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
								<h2>移动设备 </h2>
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
											<h3>Youth positive energy</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i> Youth, is to run crazy, and then gorgeous fall. Run, is to go out of their own small world, to the outside world, not afraid of toss, the courage to pass their own positive energy..
                                                    <%--青春，就是要疯狂的奔跑，然后华丽的跌倒。奔跑，就是走出自己的小世界，走向外边的大世界，不怕折腾，勇于传递自己的正能量。
                                                跌倒，就是有屡败屡战的勇气，和一分青春永恒的冲动，青春，需要我们大步的奔跑。--%><span> </span></div>
										</div><!-- //carousel-caption -->
									</div><!-- //item column -->
									<div class="item">
										<div class="carousel-caption">
											<i class="fa fa-windows fa-5x"></i><br><br>
											<h3>Windows new version coming</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i>The new version of the project is about to go online, rich functionality to meet the majority of users, to bring convenience to the service, please look forward to<span> - shinian</span></div>
										</div><!-- //carousel-caption -->
									</div><!-- //item column -->
									<div class="item">
										<div class="carousel-caption">
											<i class="fa fa-apple fa-5x"></i><br><br>
											<h3>Apple new version coming</h3>
											<div class="about-details"><i class="fa fa-quote-left fa-2x"></i> The platform is fully compatible with mobile devices, can be fast platform, good user experience, the product is constantly optimized, thank you for your support
                                                <span> - Apple</span></div>
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
								<h2>About my project</h2>
							</div><!--//title -->
							<div class="subtitle wow fadeInUp" >
                                您在这座城市，我们能帮你做什么？<br/><br/>
                                1) 喜欢，就是淡淡的爱。爱，就是深深的喜欢。我希望以后可以不用帮您传递幸福，而是帮您们见证您们的幸福-爱的传递者。<br/><br/>
                                2)没有播种，何来收获;没有辛苦，何来成功;没有磨难，何来荣耀;没有黯淡，何来辉煌。希望能陪您一起见证您的成功。 </div>
                            <!--//subtitle -->
						</div><!--//column -->
					</div><!--//row -->
					<div class="row destacados">
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInLeftBig" data-wow-duration="2s">
								<img src="${ctx}/view/lp/img/ap_4.png" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>生日祝福</h3>
								<p class="text-p">
                                    电话铃响起的时候，请接受我真诚的祝福。这是属于我们的热线，无论是生日还是其他时刻，两颗火热的心都将在这里得到充分的表达：生日快乐！</p>
								<button class="btn btn-primary">Read more</button>                   
							</div>
						</div>      
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInLeftBig" data-wow-duration="1s">
								<img src="${ctx}/view/lp/img/ap_5.png" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3 >浪漫情人节</h3>
								<p class="text-p">虽我再身边、 虽我能陪着、 知道我刻刻都想着 我嘚身边、要记、远我直都想念着、 所要快快乐乐嘚、我怀揣着 我其实都直陪身边、七夕快乐<%--不管七夕那天夜晚有星月，还是雷电、风雨，我都会在去年的葡萄架下等你，不见不归。--%></p>
								<button class="btn btn-primary">Read more</button>
							</div>
						</div>	
							
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInRightBig" data-wow-duration="1s">
								<img src="${ctx}/view/lp/img/ap_8.png" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3 >表白墙</h3>
								<p class="text-p">鸟儿恋上了白云，不再贪恋树阴凉。一滴水恋上了大海,努力汇入河流。小鸡恋上老鹰，从此有了飞翔欲望。你恋上了那个谁，始终执着追逐与守候...<%--祝早觅所深情相拥快乐相守--%></p>
								<button class="btn btn-primary">Read more</button>
							</div>
						</div>					  
						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="wow fadeInRightBig" data-wow-duration="2s">
								<img src="${ctx}/view/lp/img/ap_7.png" alt="Texto Alternativo" class="img-circle img-thumbnail">
								<h3>大数据研究</h3>
								<p class="text-p">除了表白外，对女生喜欢什么，关注什么，最忌讳什么也要了解，下面的数据是采集于各个网站做的分析，大家可要注意了哦.</p>
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
									<h2>必备技能</h2>
								</div><!-- //title -->
								<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
									<%--Lorem ipsum dolor sit amet, consectetur Morbi sagittis, sem quis lacinia faucibus, orci ipsum gravida<br> tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi sagittis, sem quis lacinia.--%>
								</div><!-- //subtitle --> 					
							</div><!-- //column -->
					</div><!-- //row -->
					<div class="row margin">
						<div class="col-md-12 col-sm-12 col-xs-12">			
							<ul class="cbp-ig-grid">
								<li class="wow flipInX" data-wow-delay="200ms" data-wow-duration="1500ms">						
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-1.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>										
									</span>
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="400ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-2.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="600ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-3.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                      
								</li>
								<li class="wow flipInX" data-wow-delay="800ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-4.jpg" alt=""/></span>
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
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-5.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="400ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-6.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li>
								<li class="wow flipInX" data-wow-delay="600ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-7.jpg" alt=""/></span>
									<span class="cbp-ig-category">
										<a href="#"> <i class="fa fa-plus fa-1x portfolio-icon"></i></a>
										<a href="#"><i class="fa fa-cog fa-lx portfolio-icon"></i></a>
									</span>                  
								</li><!-- scroll animation -->
								<li class="wow flipInX" data-wow-delay="800ms" data-wow-duration="1500ms">
									<span><img src="${ctx}/view/lp/img/portfolio/portfolio-8.jpg" alt=""/></span>
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
								<h2>选择您的服务</h2>
							</div><!-- //title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								可制作传递祝福的魔板....
							</div><!-- //subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row --> 
					<div class="row margin">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow rotateInDownLeft" data-wow-duration="1000ms" data-wow-delay="500ms">
								<li class="list-group-item plan-name basic-color-2">
									传信鸽
								</li>
								<li class="list-group-item plan-prize basic-color-1"> 
									<sup>￥</sup> <span> 0.75元/ </span><sub> 个</sub>
								</li>
								<li class="list-group-item plan-features">
									<i class="fa fa-check"></i> 一个月保质期<br/>
									<i class="fa fa-times"></i> 可定制访问地址<br/>
									<i class="fa fa-times"></i> 可下载<br/>
									<i class="fa fa-times"></i>可留言
								</li>
								<li class="list-group-item plan-buy-link basic-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group -->
						</div><!-- //column -->
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow flipInY" data-wow-duration="1000ms" data-wow-delay="1200ms">
								<li class="list-group-item plan-name popular-color-2">
									流行传递
								</li>
								<li class="list-group-item plan-prize  popular-color-1"> 
									<sup>￥ </sup> <span> 7.5元/</span><sub> 个</sub>
								</li>
								<li class="list-group-item plan-features">
                                    <i class="fa fa-check"></i> 一年保质期<br/>
                                    <i class="fa fa-check"></i> 可定制访问地址<br/>
                                    <i class="fa fa-times"></i> 可下载<br/>
                                    <i class="fa fa-times"></i>可留言
								</li>
								<li class="list-group-item plan-buy-link popular-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group --> 
						</div><!-- //column -->
						<div class="col-md-4 col-sm-6 col-xs-12">
							<ul class="list-group wow rotateInDownRight" data-wow-duration="1000ms" data-wow-delay="500ms">
								<li class="list-group-item plan-name company-color-2">
									私人定制
								</li>
								<li class="list-group-item plan-prize company-color-1"> 
									<sup>￥ </sup> <span> 75元/ </span><sub> 个</sub>
								</li>
								<li class="list-group-item plan-features">
                                    <i class="fa fa-check"></i> 一年保质期<br/>
                                    <i class="fa fa-check"></i> 可定制访问地址<br/>
                                    <i class="fa fa-check"></i> 可下载<br/>
                                    <i class="fa fa-check"></i>可留言
                                </li>
								<li class="list-group-item plan-buy-link company-color-2"><a href="#" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Choose plan </a></li>
							</ul><!-- //list group -->  
						</div><!-- //column -->					
					</div><!-- //row --> 
				</div><!--//container--> 
			</div><!--//section padding-->
		</section><!--//prizing list section --> 	

		<!-- ****** Team Section****** -->
	<%--	<section id="team" class="team demo-4">
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
								<div class="text-center"><img src="${ctx}/view/lp/img/member/member-1.jpg" alt="Team Member 1"/></div>
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
								<div class="text-center"><img src="${ctx}/view/lp/img/member/member-2.jpg" alt="Team Member 2" class=""/></div>
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
								<div class="text-center"><img src="${ctx}/view/lp/img/member/member-3.jpg" alt="Team Member 3"/></div>
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
								<div class="text-center"><img src="${ctx}/view/lp/img/member/member-4.jpg" alt="Team Member 4"/></div>
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
		</section>--%><!--//team section -->
		
		<!-- ****** Contact Section****** -->	
		<section id="contact" class="contact">
			<div class="section-padding">
				<div class="container margin">
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="section-title wow bounceIn">
								<h2>联系我们</h2>
							</div><!-- //title -->
							<div class="subtitle wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="300ms">
								如您有什么需要帮助的、或者有好的建议都可以联系我们。
							</div><!-- //subtitle --> 					
						</div><!-- //column -->
					</div><!-- //row -->
					<div class="row">
						<div class="col-md-6 col-sm-6 col-xs-12">
							<div class="clearfix wow fadeInUp">
								<h3 class="pull-right">联系方式如下.</h3>
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
									<i class="fa fa-road location-icon"></i> QQ:201676554<br />
									<i class="fa fa-home location-icon"></i> WeiXin：shiniandate<br/>
									<i class="fa fa-envelope location-icon"></i>Email: shiniandate@163.com <br/>
									<%--<i class="fa fa-phone location-icon"></i> +40 (0) 231 1234 567<br/>--%>
									<%--<i class="fa fa-mobile-phone fa-lg location-icon"></i> +222 (0) 23 1264 548<br/>--%>
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