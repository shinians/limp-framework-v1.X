<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>技术发展专题分析</title>
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
        .common-boxTech{margin:10px 5px 20px 0px;}
        .box-num{
            font-size: 48px;
        }
    </style>
</head>
<body >
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
            <div id="dowebok">
                <div id="section1" class="section active">
                    <div class="bi-item" data-to="0">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="common-box1 bi-box1-img common-boxTech">
                            <p ><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'))"  id="USR_NUM_PAGE"></b></p>
                            <div class="box-num">
                                <num id="drawNums">&nbsp;</num><span class="box-num-unit">套</span>
                            </div>
                            <div class="box-text"><span>渔船图纸审查数量</span></div>
                        </div>
                        <div style="left: 5px;" class="common-box1 bi-box1-img common-boxTech">
                            <p ><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('1'))"></b></p>
                            <p class="box-num"><num id="drawEntNums">&nbsp;</num><span class="box-num-unit">家</span></p>
                            <div class="box-text"><span>渔船设计单位数量</span></div>
                        </div>

                        <div style="left: 9px;" class="common-box1 bi-box1-img  common-boxTech">
                            <p><b  class="icon-more" id="commonOrgNumWin" onclick="modalShow('#common-win', '', modalDataInit('2'))"></b></p>
                            <p class="box-num"><num id="repairBuidlEntNums">&nbsp;</num><span class="box-num-unit">家</span></p>
                            <div class="box-text"><span>渔船修造企业数量</span></div>
                        </div>

                        <div style="left: 12px;" class="common-box1 bi-box1-img  common-boxTech">
                            <p><b  class="icon-more" onclick="modalShow('#common-win','',modalDataInit('3'))"></b></p>
                            <p class="box-num"><num id="repairEntNums">&nbsp;</num><span class="box-num-unit">家</span></p>
                            <div class="box-text"><span>全国渔船维修企业数量</span></div>
                        </div>

                        <div  style="left: 15px;" class="common-box1 bi-box1-img  common-boxTech">
                           <%-- <p><b  class="icon-more" onclick="modalShow('#common-win','',modalDataInit('4'))"></b></p>--%>
                            <p class="box-num"><num id="standardScore">&nbsp;</num><span class="box-num-unit">分</span></p>
                            <div class="box-text"><span>标准化程度平均分</span></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6" style="width:49%;">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '');" ></b></p>--%>
                            <h3 class="bi-box2-title tzsc">年各省图纸审查数量<span class="yearNum" id="provincePaperNum"></span> <a href="javascript:;" id="time-techDevelop-1-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="techDevelop-1-1" style="width: 100%;height:260px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6" style="width:49%;">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('1'));"></b></p>--%>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <h3 class="bi-box2-title">图纸审查数量<a href="javascript:;" id="time-techDevelop-1-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            </ul>

                            <div id="techDevelop-1-2" style="width: 100%;height: 260px"></div>
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
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('2'));"></b></p>--%>
                            <h3 class="bi-box2-title">设计单位数量 <a href="javascript:;" id="time-techDevelop-2-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="techDevelop-2-1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">新建渔船标准化 <a href="javascript:;" id="time-techDevelop-2-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="techDevelop-2-2" style="width: 100%;height: 220px"></div>

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
                            <h3 class="bi-box2-title">图纸审查一次合格率 <a href="javascript:;" id="time-techDevelop-3-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="techDevelop-3-1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">图纸审查数量<a href="javascript:;" id="time-techDevelop-3-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="techDevelop-3-2" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <a href="javascript:;" style="top: 10px;right: 19px;" id="time-techDevelop-3-3" class="biorgChoose glyphicon glyphicon-filter"></a>
                            <ul class="nav nav-tabs" role="tablist" class="Tab">
                                <li role="presentation" class="active"><a href="#techDevelop-3-3" aria-controls="techDevelop-3-3" role="tab" data-toggle="tab">渔船修造企业数量</a></li>
                                <li role="presentation"><a href="#techDevelop-3-4" aria-controls="techDevelop-3-4" role="tab" data-toggle="tab">渔船维修企业数量</a></li>

                            </ul>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="techDevelop-3-3" style="width: 100%;height: 220px">

                                </div>
                                <div role="tabpanel" class="tab-pane" id="techDevelop-3-4" style="width: 100%;height: 220px">

                                </div>
                            </div>
                            <%--<p><b  class="icon-more"></b></p>
                            <h3 class="bi-box2-title">渔船修造企业数量分析图<a href="javascript:;" id="time-techDevelop-3-3" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="techDevelop-3-3" style="width: 100%;height: 220px"></div>--%>
                        </div>
                    </div>
                </div>
            </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-5">
                </div>

                <div class="col-sm-2" style="margin-bottom: 30px">
                    <ul class="bi-ul-slide">
                        <li  class="active" data-to="0"></li>
                        <li   data-to="1"></li>
                        <li   data-to="2"></li>
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
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" onclick="modalHide('#common-win', '');" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span  class="sr-only">Close</span></button>
                <h4 class="modal-title">各省图纸审查数量分析图</h4>
            </div>
            <div class="modal-body">
                <iframe src="" id="open-iframe"frameborder="0"  height="300" width="100%"></iframe>
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
        var titleArr=["渔船图纸审查数量","渔船设计单位数量","渔船修造企业数量","全国渔船维修企业数量","标准化程度平均"]
        var arrUrl=["http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_6_1YCTZSCSL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_6_2YCSJDWSL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_6_3YCXZQYSL&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_6_4QGYCWXQYSL&original=true"]
        console.log("-------modalDataInit---------");
        console.log(index);
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

<script type="text/javascript" src="${script}/chinasofti/bi/bi_techDevelop.js"></script>
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

