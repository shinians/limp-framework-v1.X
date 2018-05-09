<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en" style = 'overflow: hidden'>
<head>
    <meta charset="utf-8">
    <title>检验管理专题分析</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${bt}/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">
    <link rel="stylesheet" href="${ctx}/resources/style/css/theme-layout.css">
    <link rel="stylesheet" href="${ctx}/resources/style/css/common-utils.css">
    <link rel="stylesheet" href="${style}/css/animate.min.css">
    <link rel="stylesheet" href="${style}/css/jquery.fullPage.css">
    <style>
        #fp-nav ul li a span, .fp-slidesNav ul li a span { background-color: #fff;}
    </style>
</head>

<body >
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
            <div id="dowebok">
                 <div id="section1"  class="section active"><div class="bi-item" data-to="0">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="row bi-box1-img1">
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg01">
                                   <p ><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'));"  id="USR_NUM_PAGE"></b></p>
                                    <div class="box-num">
                                        <num id="checkShips">&nbsp;</num><span class="box-num-unit">艘次</span>
                                    </div>
                                    <div class="box-text"><span id="checkShipsText">渔船检验量</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg02">
                                    <p><b  class="icon-more" id="commonPersonLessWin" onclick="modalShow('#common-win', '', modalDataInit('1'));" ></b></p>
                                    <p class="box-num"><num id="buildShips">&nbsp;</num><span class="box-num-unit">艘</span></p>
                                    <div class="box-text"><span id="buildShipsText">新建渔船数量</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg03">
                                    <p><b  class="icon-more" id="commonOrgNumWin" onclick="modalShow('#common-win', '', modalDataInit('2'));"></b></p>
                                    <p class="box-num"><num id="checkWorkRate">&nbsp;</num><span class="box-num-unit">%</span></p>
                                    <div class="box-text"><span id="checkWorkRateText">检验工作完成率</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg04">
                                    <p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('3'));"></b></p>
                                    <p class="box-num"><num id="yyShipFirtPassRate">&nbsp;</num><span class="box-num-unit">%</span></p>
                                    <div class="box-text"><span>远洋渔船一次检验合格率</span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-1-1" class="biorgChoose glyphicon glyphicon-filter"></a>
                            <h3 class="bi-box2-title">渔船拥有量</h3>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#checkManage-1-1-1" aria-controls="#checkManage-1-1-1" role="tab" data-toggle="tab">登记渔船总数</a></li>
                                <li role="presentation"><a href="#checkManage-1-1-2" aria-controls="#checkManage-1-1-2" role="tab" data-toggle="tab">登记渔船总吨位</a></li>
                                <li role="presentation"><a href="#checkManage-1-1-3" aria-controls="#checkManage-1-1-3" role="tab" data-toggle="tab">登记渔船总功率</a></li>
                            </ul>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="checkManage-1-1-1" style="width: 100%;height:240px">

                                </div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-1-1-2" style="width: 100%;height:240px">

                                </div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-1-1-3" style="width: 100%;height:240px">

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-1-2" class="biorgChoose glyphicon glyphicon-filter"></a>
                            <h3 class="bi-box2-title">渔船检验工作量</h3>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#checkManage-1-2-1" aria-controls="#checkManage-1-2-1" role="tab" data-toggle="tab">实检渔船总数</a></li>
                                <li role="presentation"><a href="#checkManage-1-2-2" aria-controls="#checkManage-1-2-2" role="tab" data-toggle="tab">实检渔船总吨位</a></li>
                                <li role="presentation"><a href="#checkManage-1-2-3" aria-controls="#checkManage-1-2-3" role="tab" data-toggle="tab">实检渔船总功率</a></li>
                            </ul>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="checkManage-1-2-1" style="width: 100%;height:240px">

                                </div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-1-2-2" style="width: 100%;height: 240px">

                                </div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-1-2-3" style="width: 100%;height: 240px">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div></div>
                <div id="section2" class="section"><div class="bi-item" data-to="1">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('2'));"></b></p>--%>
                            <h3 class="bi-box2-title">新建渔船检验<a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-2-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="checkManage-2-1" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">渔船船龄统计<a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-2-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="checkManage-2-2" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
            </div></div>
                <div id="section3" class="section"><div class="bi-item" data-to="2">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box22">
                            <h3 class="bi-box2-title">检验工作完成率</h3>

                            <div id="checkManage-3-1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box22">
                            <a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-3-2" class="biorgChoose glyphicon glyphicon-filter"></a>
                            <h3 class="bi-box2-title">渔船一次检验合格率</h3>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#checkManage-3-2" aria-controls="#checkManage-3-2" role="tab" data-toggle="tab">远洋渔船</a></li>
                                <li role="presentation"><a href="#checkManage-3-22" aria-controls="#checkManage-3-22" role="tab" data-toggle="tab">国内渔船</a></li>
                            </ul>
                            <div class="tab-content">
                                <%--远洋船：3-2； 国内船：3-22--%>
                                <div role="tabpanel" class="tab-pane active" id="checkManage-3-2" style="width: 100%;height: 220px"></div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-3-22" style="width: 100%;height: 220px"></div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box22" style="margin-bottom:0px;">
                            <a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-3-3" class="biorgChoose glyphicon glyphicon-filter"></a>
                            <h3 class="bi-box2-title">渔船企业一次检验合格率</h3>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#checkManage-3-3" aria-controls="#checkManage-3-3" role="tab" data-toggle="tab">远洋渔船</a></li>
                                <li role="presentation"><a href="#checkManage-3-33" aria-controls="#checkManage-3-33" role="tab" data-toggle="tab">国内渔船</a></li>
                            </ul>
                            <div class="tab-content">
                                <%--远洋船：3-3； 国内船：3-33--%>
                                <div role="tabpanel" class="tab-pane active" id="checkManage-3-3" style="width: 100%;height: 210px"></div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-3-33" style="width:100%;height:210px"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div></div>
                <div id="section4" class="section"><div class="bi-item" data-to="3">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box22">
                            <%--<a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-4-1" class="biorgChoose glyphicon glyphicon-filter"></a>--%>
                            <h3 class="bi-box2-title">渔船安全指数</h3>
                                <ul class="nav nav-tabs" role="tablist" class="Tab">
                                    <li role="presentation" class="active"><a href="#checkManage-4-1" aria-controls="#checkManage-4-1" role="tab" data-toggle="tab">远洋渔船</a></li>
                                    <li role="presentation"><a href="#checkManage-4-11" aria-controls="#checkManage-4-11" role="tab" data-toggle="tab">国内渔船</a></li>
                                </ul>
                                <div class="tab-content">
                                    <%--远洋船：4-1； 国内船：4-11--%>
                                    <div role="tabpanel" class="tab-pane active" id="checkManage-4-1" style="width: 559px;height: 220px"></div>
                                    <div role="tabpanel" class="tab-pane" id="checkManage-4-11" style="width:559px;height: 220px"></div>
                                </div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box22">
                            <%--<a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-4-2" class="biorgChoose glyphicon glyphicon-filter"></a>--%>
                            <h3 class="bi-box2-title">渔船安全指数高位分布</h3>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#checkManage-4-2" aria-controls="#checkManage-4-2" role="tab" data-toggle="tab">远洋渔船</a></li>
                                <li role="presentation"><a href="#checkManage-4-22" aria-controls="#checkManage-4-22" role="tab" data-toggle="tab">国内渔船</a></li>
                            </ul>
                            <div class="tab-content">
                                <%--远洋船：4-2； 国内船：4-22--%>
                                <div role="tabpanel" class="tab-pane active" id="checkManage-4-2" style="width:100%;height: 220px"></div>
                                <div role="tabpanel" class="tab-pane" id="checkManage-4-22" style="width: 460px;height: 220px"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<a href="javascript:;" style="top: 10px;right: 19px;" id="time-checkManage-4-3" class="biorgChoose glyphicon glyphicon-filter"></a>--%>
                            <h3 class="bi-box2-title">渔业船舶拥有量</h3>
                                <div id="checkManage-4-3" style="width: 100%;height: 220px">
                                </div>
                        </div>
                    </div>
                </div>
            </div></div>
            </div>
            <div class="row">
                <div class="col-sm-5">
                </div>

                <div class="col-sm-2" style="margin-bottom: 30px">
                    <ul class="bi-ul-slide">
                        <li  class="active" data-to="0"></li>
                        <li   data-to="1"></li>
                        <li   data-to="2"></li>
                        <li   data-to="3"></li>
                        <%--     <li  data-to="2"></li>
                             <li data-to="3"></li>--%>
                    </ul>
                </div>

            </div>
        </div>
    </div>
</div>

<!---------------------------------------点击弹框信息展示------------------------------------------------>
<div class="modal bs-example-modal-lg"  onclick="modalHide('#common-win', '');" id="common-win">
    <div class="modal-dialog modal-lg" style="width: 1120px;">
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
        //console.log("callback")
        //console.log(callback)
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
        var titleArr=["2017年渔船检验量","2017年新建渔船数量","2017年受检率","远洋一次检验合格率"]
//        var arrUrl=[get_root+"/ship/bi/ycsNumGroupByYearIndex",get_root+"/ship/bi/ycsXLGroupIndex"
//            ,get_root+"/ship/bi/ycsCateIndex?typeStr=1"]

        var arrUrl=["http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_4_1_2017NYCJYL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_4_2_2017NXJYCSL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_4_1_2017NYCJYL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_4_4YYYCJYHGL&original=true"]

        $("#open-iframe").attr("src",arrUrl[index]);
        $(".modal-title").html(titleArr[index]);
        //填充数据，对弹出模态框数据样式初始化或修改
    }

    $(window).resize(function(){
        //窗口发生变化则 重置一次

        console.log("resize")
    });

</script>

<!--通用-->
<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>

<script type="text/javascript" src="${script}/chinasofti/bi/bi_checkManage.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script type="text/javascript" src="${plug}/js-utils/count-number.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/jquery.fullPage.js"></script>
<%--<script type="text/javascript" src="${ctx}/plug/layui/lay/modules/layer.js"></script>--%>
</body>
</html>


<%---------------------------测试弹框-----------------------------------------%>
<%--http://www.jq22.com/demo/BootstrapModal20161123/--%>
<%--<button type="button" class="btn btn-primary  test-btn" onclick="modalShow('#bigModal', '', modalDataInit('test'));">模态框测试</button>--%>
<div class="modal bs-example-modal-lg"  onclick="modalHide('#bigModal', '');" id="bigModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" onclick="modalHide('#bigModal', '');" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span  class="sr-only">Close</span></button>
                <h4 class="modal-title">模态框标题</h4>
            </div>
            <div class="modal-body">
               <pre class="text-left">
                        modalShow('#bigModal', '', modalDataInit('test'));
                        animateName可为空，或填写对应的animateIn或者animateOut数组中的对应参数
                        显示参数
                        animationIn = ["bounceIn","bounceInDown","bounceInLeft","bounceInRight","bounceInUp",
                                          "fadeIn", "fadeInDown", "fadeInLeft", "fadeInRight", "fadeOutUp",
                                        "fadeInDownBig", "fadeInLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipInX","flipInY",
                                    "lightSpeedIn","rotateIn","rotateInDownLeft","rotateInDownRight","rotateInUpLeft","rotateInUpRight",
                                    "zoomIn","zoomInDown","zoomInLeft","zoomInRight","zoomInUp","slideInDown","slideInLeft",
                                    "slideInRight", "slideInUp","rollIn"];
                        隐藏参数
                        animationOut = ["bounceOut","bounceOutDown","bounceOutLeft","bounceOutRight","bounceOutUp",
                                        "fadeOut", "fadeOutDown", "fadeOutLeft", "fadeOutRight", "fadeOutUp",
                                         "fadeOutDownBig", "fadeOutLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipOutX","flipOutY",
                                    "lightSpeedOut","rotateOut","rotateOutDownLeft","rotateOutDownRight","rotateOutUpLeft","rotateOutUpRight",
                                        "zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp",
                                        "zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp","slideOutDown","slideOutLeft",
                                        "slideOutRight", "slideOutUp","rollOut"];
                                       </pre>
            </div>
        </div>
    </div>
</div>


