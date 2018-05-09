<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en" style = 'overflow: hidden'>
<head>
    <meta charset="utf-8">
    <title>检验机构主题分析</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${bt}/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">
    <link rel="stylesheet" href="${ctx}/resources/style/css/theme-layout.css">
    <link rel="stylesheet" href="${ctx}/resources/style/css/common-utils.css">
    <link rel="stylesheet" href="${style}/css/animate.min.css">
    <link rel="stylesheet" href="${style}/css/jquery.fullPage.css">
</head>
<style type="text/css">
    <%--2017.8.16 by meng--%>
    #fp-nav ul li a span, .fp-slidesNav ul li a span { background-color: #fff;}
    .carousel-indicators{
        bottom:-30px;
    }
    .carousel-inner>.item{
        height: 220px;;
    }
    .carousel-inner>.item>a>img, .carousel-inner>.item>img{
        height:100%;
        width:100%;
    }

    #chouchaTab .active{
        margin-right:-1px;
    }
    .modal-lg{
        width:1120px;
    }
    .modal-content{
        background-color: transparent;
    }

</style>

<body >
<input type="hidden" id="orgcode" value="${org.orgcode}"/>
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
          <div id="dowebok">
              <div id="section1" class="section active">
                 <div class="bi-item" data-to="0">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="row bi-box1-img1">
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg01">
                                    <p >
                                        <b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit(0));" ></b>
                                        <%--<b  class="icon-more"></b>--%>
                                    </p>
                                    <div class="box-num">
                                        <num id="ORG_KV1">&nbsp;</num><span class="box-num-unit">个</span>
                                    </div>

                                    <div class="box-text"><span>机构总数</span></div>
                                    <%--<script type="text/template" id="orgnums">--%>
                                        <%--<div class="row orgBox">--%>
                                            <%--<table class="orgBItable">--%>
                                                <%--<thead>--%>
                                                <%--<tr>--%>
                                                    <%--<th>河北渔业船舶检验局</th>--%>
                                                    <%--<th>检验处</th>--%>
                                                    <%--<th>检验站</th>--%>
                                                    <%--<th>渔船拥有量</th>--%>
                                                    <%--<th>检验工作完成率</th>--%>
                                                    <%--<th>机构能力得分</th>--%>
                                                <%--</tr>--%>
                                                <%--</thead>--%>
                                                <%--<tbody>--%>
                                                    <%--{{each th}}--%>
                                                        <%--<tr>--%>
                                                            <%--<td>{{$value}}</td>--%>
                                                            <%--<td>检验处</td>--%>
                                                            <%--<td>检验站</td>--%>
                                                            <%--<td>渔船拥有量</td>--%>
                                                            <%--<td>检验工作完成率</td>--%>
                                                            <%--<td>机构能力得分</td>--%>
                                                        <%--</tr>--%>
                                                    <%--{{/each}}--%>
                                                <%--</tbody>--%>
                                            <%--</table>--%>
                                        <%--</div>--%>
                                    <%--</script>--%>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg02">
                                   <p>
                                        <b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit(1));"></b>
                                        <%--&lt;%&ndash;<b  class="icon-more" id="commonPersonLessWin"></b>&ndash;%&gt;--%>
                                    </p>
                                    <div class="box-num"><num style="font-size: 38px;"><span id="ORG_KV2">&nbsp;</span>/<span id="ORG_KV22">&nbsp;</span></num><span class="box-num-unit">个</span></div>
                                    <div class="box-text"><span>待复核/年度复核总数</span></div>
                                    <%--<script type="text/template" id="orgservice">--%>
                                        <%--<div class="row orgBox">--%>
                                            <%--<table class="orgBItable">--%>
                                                <%--<thead>--%>
                                                <%--<tr>--%>
                                                    <%--<th>河北渔业船舶检验局</th>--%>
                                                    <%--<th>检验处</th>--%>
                                                    <%--<th>检验站</th>--%>
                                                    <%--<th>渔船拥有量</th>--%>
                                                    <%--<th>检验工作完成率</th>--%>
                                                    <%--<th>机构能力得分</th>--%>
                                                <%--</tr>--%>
                                                <%--</thead>--%>
                                                <%--<tbody>--%>
                                                <%--{{each th}}--%>
                                                <%--<tr>--%>
                                                    <%--<td>{{$value}}</td>--%>
                                                    <%--<td>检验处</td>--%>
                                                    <%--<td>检验站</td>--%>
                                                    <%--<td>渔船拥有量</td>--%>
                                                    <%--<td>检验工作完成率</td>--%>
                                                    <%--<td>机构能力得分</td>--%>
                                                <%--</tr>--%>
                                                <%--{{/each}}--%>
                                                <%--</tbody>--%>
                                            <%--</table>--%>
                                        <%--</div>--%>
                                    <%--</script>--%>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg03">
                                    <p>
                                        <b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit(0));"></b>
                                        <%--<b  class="icon-more" id="commonOrgNumWin"></b>--%>
                                    </p>
                                    <div class="box-num"><num id="ORG_KV3">&nbsp;</num><span class="box-num-unit">%</span></div>
                                    <div class="box-text"><span>检验工作完成率</span></div>
                                    <%--<script type="text/template" id="orgcomplete">--%>
                                        <%--<div class="row orgBox">--%>
                                            <%--<table class="orgBItable">--%>
                                                <%--<thead>--%>
                                                <%--<tr>--%>
                                                    <%--<th>河北渔业船舶检验局</th>--%>
                                                    <%--<th>检验处</th>--%>
                                                    <%--<th>检验站</th>--%>
                                                    <%--<th>渔船拥有量</th>--%>
                                                    <%--<th>检验工作完成率</th>--%>
                                                    <%--<th>机构能力得分</th>--%>
                                                <%--</tr>--%>
                                                <%--</thead>--%>
                                                <%--<tbody>--%>
                                                <%--{{each th}}--%>
                                                <%--<tr>--%>
                                                    <%--<td>{{$value}}</td>--%>
                                                    <%--<td>检验处</td>--%>
                                                    <%--<td>检验站</td>--%>
                                                    <%--<td>渔船拥有量</td>--%>
                                                    <%--<td>检验工作完成率</td>--%>
                                                    <%--<td>机构能力得分</td>--%>
                                                <%--</tr>--%>
                                                <%--{{/each}}--%>
                                                <%--</tbody>--%>
                                            <%--</table>--%>
                                        <%--</div>--%>
                                    <%--</script>--%>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg04">

                                    <%--暂时屏蔽--%>
                                    <%--<p><b  class="icon-more"></b></p>--%>
                                    <%--暂时写死  11/20 by Liangpeng 最终解释权归清华所有--%>
                                    <p>
                                        <b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit(2));"></b>
                                        <%--<b  class="icon-more"></b>--%>
                                    </p>
                                    <div class="box-num"><num id="ORG_KV4">&nbsp;</num><span class="box-num-unit">分</span></div>
                                    <div class="box-text"><span>机构能力平均分</span></div>
                                    <%--<script type="text/template" id="orgability">--%>
                                        <%--<div class="row orgBox">--%>
                                            <%--<table class="orgBItable">--%>
                                                <%--<thead>--%>
                                                    <%--<tr>--%>
                                                        <%--<th>机构名称</th>--%>
                                                        <%--<th>机构负责人</th>--%>
                                                        <%--<th>业务复核时间</th>--%>
                                                        <%--<th>业务符合状态</th>--%>
                                                        <%--<th>联系电话</th>--%>
                                                    <%--</tr>--%>
                                                <%--</thead>--%>
                                                <%--<tbody>--%>
                                                    <%--{{each th}}--%>
                                                    <%--<tr>--%>
                                                        <%--<td>{{$value}}</td>--%>
                                                        <%--<td>检验处</td>--%>
                                                        <%--<td>检验站</td>--%>
                                                        <%--<td>渔船拥有量</td>--%>
                                                        <%--<td>检验工作完成率</td>--%>
                                                    <%--</tr>--%>
                                                    <%--{{/each}}--%>
                                                <%--</tbody>--%>
                                            <%--</table>--%>
                                        <%--</div>--%>
                                    <%--</script>--%>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'));" ></b></p>--%>
                            <%--2017.12.1 add time filter by meng--%>
                                <h3 class="bi-box2-title">机构数量 <span id="yearOrgNums" class="yearNum"></span><a href="javascript:;" id="time-org-1-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="ORG-1-1" style="width: 100%;height: 300px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('1'));"></b></p>--%>
                            <h3 class="bi-box2-title">机构类型 <span class="yearNum" id="yearTypeSy"></span><a href="javascript:;" id="time-org-1-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <ul style="margin-left: 20px;" class="nav nav-tabs" role="tablist" class="Tab" id="orgTypeSys">
                                <li role="presentation" class='active' id="ORG-1-2-1"><a href="#contour" aria-controls="contour"
                                                                                     role="tab" data-toggle="tab">管理方式比例</a></li>
                                <li role="presentation" id="ORG-1-2-2"><a href="#headSculpture" aria-controls="headSculpture"
                                                                      role="tab" data-toggle="tab">设置方式比例</a></li>
                                <li role="presentation" id="ORG-1-2-3"><a href="#lable" aria-controls="lable" role="tab"
                                                                      data-toggle="tab">拨款方式比例</a></li>
                            </ul>

                            <div id="ORG-1-2" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
            </div>
              </div>
              <div id="section2" class="section">
                 <div class="bi-item" data-to="1">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">机构数量和能力<a href="javascript:;"id="time-org-2-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <ul style="margin-left: 20px;" class="nav nav-tabs" role="tablist" class="Tab" id="orgabilityAver">
                                <li role="presentation" class='active' id="2-1"><a href="#contour" aria-controls="contour"
                                                                                     role="tab" data-toggle="tab">机构数量</a></li>
                                <li role="presentation" id="2-2"><a href="#headSculpture" aria-controls="headSculpture"
                                                                      role="tab" data-toggle="tab">机构能力</a></li>
                            </ul>
                            <div id="ORG-2-1" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">机构数量和能力（按地区）<span class="yearNum" id="yearOrgAbil"></span><a href="javascript:;"id="time-org-2-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="ORG-2-2" style="width:100%;height: 220px"></div>
                        </div>
                    </div>
                    <%--<div class="col-sm-6">--%>
                    <%--<div class="bi-box2-4">--%>
                    <%--<p><b  class="icon-more"></b></p>--%>
                    <%--<h3 class="bi-box2-title">近五年检验工作完成率走势图</h3>--%>
                    <%--<div id="ORG-2-3" style="width: 100%;height: 220px"></div>--%>

                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-sm-6">--%>
                    <%--<div class="bi-box2-4">--%>
                    <%--<p><b  class="icon-more"></b></p>--%>
                    <%--<h3 class="bi-box2-title">全国一次统计合格率</h3>--%>
                    <%--<div id="ORG-2-4" style="width: 100%;height: 220px"></div>--%>

                </div>
            </div>
              </div>
              <div id="section3" class="section">
                 <div class="bi-item" data-to="2">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">检验工作完成率 <span class="nowYear yearNum"></span></h3>

                            <div id="ORG-3-1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <%--修改较大，优先级滞后--%>
                            <h3 class="bi-box2-title">检验工作完成率 <span id="yearSpace" class="yearNum"></span><a href="javascript:;"id="time-org-3-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="ORG-3-2" style="width: 98%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">检验工作完成率（按地区）<span class="nowYear yearNum" id="currYear"></span><a href="javascript:;" id="time-org-3-3" class="biorgChoose glyphicon glyphicon-filter"></a>
                            </h3>

                            <div id="ORG-3-3" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
            </div>
              </div>
              <div id="section4" class="section">
                 <div class="bi-item" data-to="3">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">机构业务复核数量（按地区）<span class="nowYear yearNum" id="orgCurYear"></span></h3>

                            <div id="ORG-4-1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">机构业务复核数量预测 <span class="yearNum" id="futureYear"></span><a href="javascript:;" id="time-org-3-4" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="ORG-4-2" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <%--<div class="row">--%>
                <%--<div class="col-sm-12">--%>
                <%--<div class="bi-box2-4">--%>
                <%--&lt;%&ndash;<p><b  class="icon-more"></b></p>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<h3 class="bi-box2-title">demo</h3>&ndash;%&gt;--%>

                <%--<div id="ORG-4-3" style="width: 100%;height: 220px"></div>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
            </div>
              </div>
          </div>
            
            <div class="row">
                <div class="col-sm-5">
                </div>

                <div class="col-sm-2" style="margin-top:-10px;margin-bottom: 30px">
                    <ul class="bi-ul-slide">
                        <li  class="active" data-to="0"></li>
                        <li   data-to="1"></li>
                        <li   data-to="2"></li>
                        <li   data-to="3"></li>

                    </ul>
                </div>

            </div>
        </div>
    </div>
</div>

<!---------------------------------------点击弹框信息展示------------------------------------------------>
<div class="modal bs-example-modal-lg"  onclick="modalHide('#common-win', '');" id="common-win">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" onclick="modalHide('#common-win', '');" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span  class="sr-only">Close</span></button>
                <h4 class="modal-title"></h4>
            </div>
            <div class="modal-body">
                <iframe src="" id="open-iframe" frameborder="0"  height="500" width="100%"></iframe>
            </div>
        </div>
    </div>
</div>
<script>

//    $(document).ready(
//        function() {
//            function test(data) {
//                console.log("run test")
//                console.log(data)
//            }
//
//            //            $("#time-org-2-1").initDateFilter(test);
//            //            $("#time-org-2-2").initDateFilter(test);
//            }
//        )
    //animate.css动画触动一次方法
    $.fn.extend({
        animateCss: function (animationName) {
            var animationEnd = 'webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend';
            this.addClass('animated ' + animationName).one(animationEnd, function() {
                $(this).removeClass('animated ' + animationName);
            });
        }
    });
    /**
    * 显示模态框方法
    * @param targetModel 模态框选择器，jquery选择器
    * @param animateName 弹出动作
    * @ callback 回调方法
    */
    var i=0;
    var modalShow = function(targetModel, animateName, callback){
        var animationIn = ["bounceIn","bounceInDown","bounceInLeft","bounceInRight","bounceInUp",
        "fadeIn", "fadeInDown", "fadeInLeft", "fadeInRight", "fadeOutUp",
        "fadeInDownBig", "fadeInLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipInX","flipInY",
        "lightSpeedIn","rotateIn","rotateInDownLeft","rotateInDownRight","rotateInUpLeft","rotateInUpRight",
        "zoomIn","zoomInDown","zoomInLeft","zoomInRight","zoomInUp","slideInDown","slideInLeft",
        "slideInRight", "slideInUp","rollIn"];
        if(!animateName || animationIn.indexOf(animateName)==-1){
            //console.log(animationIn.length);
            var intRandom =  Math.floor(Math.random()*animationIn.length);
            i+=1;
            animateName = "zoomIn";//animationIn[intRandom];
        }
        console.log(targetModel + " " + animateName);
        $(targetModel).show().animateCss(animateName);
        //        callback;
        //        callback.call(this);
    }
    /**
    * 隐藏模态框方法
    * @param targetModel 模态框选择器，jquery选择器
    * @param animateName 隐藏动作
    * @ callback 回调方法
    */
    var modalHide = function(targetModel, animateName, callback){
        var animationOut = ["bounceOut","bounceOutDown","bounceOutLeft","bounceOutRight","bounceOutUp",
        "fadeOut", "fadeOutDown", "fadeOutLeft", "fadeOutRight", "fadeOutUp",
        "fadeOutDownBig", "fadeOutLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipOutX","flipOutY",
        "lightSpeedOut","rotateOut","rotateOutDownLeft","rotateOutDownRight","rotateOutUpLeft","rotateOutUpRight",
        "zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp",
        "zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp","slideOutDown","slideOutLeft",
        "slideOutRight", "slideOutUp","rollOut"];
        console.log(!animateName)
        if(!animateName || animationOut.indexOf(animateName)==-1){
            //console.log(animationOut.length);
            var intRandom =  Math.floor(Math.random()*animationOut.length);
            animateName = animationOut[intRandom];
        }
        $(targetModel).children().click(function(e){e.stopPropagation()});
        $(targetModel).animateCss(animateName);
        $(targetModel).delay(900).hide(1,function(){
            $(this).removeClass('animated ' + animateName);
        });
        //        callback.call(this);
    }

    var modalDataInit = function(index){
        var titleArr=["机构总数","机构复核信息","机构能力得分"];
        var arrUrl=["http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=JGFXnew&original=true&calnow=true",
            "http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=JGFHXX&original=true&calnow=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_1_4JGNLDF&original=true"
           ];
//        console.log("-------modalDataInit---------");
        $(".modal-title").html(titleArr[index]);
        $("#open-iframe").attr("src",arrUrl[index]);
        //填充数据，对弹出模态框数据样式初始化或修改
    }

//    $(window).resize(function(){
//        //窗口发生变化则 重置一次
//
//        console.log("resize")
//    });

</script>

<!--通用-->
<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>

<script type="text/javascript" src='${script}/js/template-web.js'></script>
<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/layui.all.js'></script>

<%--<script type="text/javascript" src="${script}/chinasofti/bi/bi-utils.js"></script>--%>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_org.js"></script>

<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/jquery.mousewheel.js'></script>
<script type="text/javascript" src="${script}/chinasofti/bi/jquery.fullPage.js"></script>

<%--<script type="text/javascript" src="${ctx}/plug/layui/lay/modules/layer.js"></script>--%>
</body>
</html>



