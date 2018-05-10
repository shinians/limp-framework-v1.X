<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017年8月16日
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>培训主题分析</title>
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
<body>
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
            <div id="dowebok">
                <div id="section1" class="section active">
                   <div class="bi-item item1" data-to="0">
                 <div class="row">
                    <div class="col-sm-12">
                        <div class="row bi-box1-img1">
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg01">
                                    <p><b class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'));"></b></p>
                                    <div class="box-num">
                                        <num id="trainingNum">&nbsp;</num>
                                        <span class="box-num-unit">人次</span>
                                    </div>
                                    <div class="box-text"><span>累计培训总人次</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg02">
                                    <%--<p><b class="icon-more"></b></p>--%>
                                    <div class="box-num">
                                        <num id="countPersonNum">&nbsp;</num>
                                        <span class="box-num-unit">人</span></div>
                                    <div class="box-text"><span>培训需求总人数</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg03">
                                    <%--<p><b class="icon-more"></b></p>--%>
                                    <div class="box-num">
                                        <num id="percent">0</num>
                                        <span class="box-num-unit">%</span></div>
                                    <div class="box-text"><span>培训平均完成率</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg04">
                                    <%--<p><b class="icon-more"></b></p>--%>
                                    <div class="box-num">
                                        <num id="planNum">0</num>
                                        <span class="box-num-unit">人</span></div>
                                    <div class="box-text"><span>年度培训计划人数</span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <h3 class="bi-box2-title">培训人次
                                <a href="javascript:;" id="trainingNumStatisticsFilter"
                                   class="biorgChoose glyphicon glyphicon-filter"></a>
                            </h3>
                            <div id="TRAINING_NUM_BOX" style="width: 100%;height: 260px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <p><b class="icon-more"
                                  onclick="modalShow('#common-win', '', train.trainRateStatisticsFilter());"></b>
                                <input type="hidden" id="trainRateIds" value="">
                            </p>
                            <h3 class="bi-box2-title">培训执行进度</h3>
                            <div id="TRAIN_RATE_BOX" style="width: 100%;height: 260px"></div>
                        </div>
                    </div>
                </div>
            </div>
                </div>
                <div id="section2" class="section">
                   <div class="bi-item item2" data-to="1">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<p><img onclick="train.percentStatisticsTab();"--%>
                                    <%--src="/resources/style/img/theme.png"--%>
                                    <%--style="width: 20px;height: 20px;cursor: pointer;position: absolute;top:20px;right:5%;" title="正序"/></b>--%>
                                <%--<input id="percentStatisticsTab" type="hidden" value="asc"/>--%>
                            <%--</p>--%>
                            <h3 class="bi-box2-title">培训完成率</h3>
                            <div id="PERCENT_BOX" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <p>
                                <%--<b class="icon-more"--%>
                                   <%--onclick="modalShow('#common-win', '', train.trainingNumStatisticsByYearAndNamesFilter());"></b>--%>
                                <%--<input type="hidden" id="trainingNumIds" value="">--%>
                            </p>
                            <h3 class="bi-box2-title">实际培训
                                <input type="hidden" id="trainingNumYear" value="">
                                <a href="javascript:;" id="trainingNumStatisticsByYearFilter"
                                   class="biorgChoose glyphicon glyphicon-filter"></a>
                            </h3>
                            <div id="TRAINING_NUM_BY_YEAR_BOX" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                </div>
                </div>
                <div id="section3" class="section">
                   <div class="bi-item item3" data-to="2">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2" style="min-height: 270px;">
                            <h3 class="bi-box2-title">培训基地培训人次
                                <a href="javascript:;" id="srcByTrainplaceAndYearFilter"
                                   class="biorgChoose glyphicon glyphicon-filter"></a>
                            </h3>
                            <div id="SRC_TRAINPLACE_YEAR_BOX" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2" style="min-height: 270px;">
                            <h3 class="bi-box2-title">培训基地教师
                                <a href="javascript:;" id="teacherNumFilter"
                                   class="biorgChoose glyphicon glyphicon-filter"></a>
                            </h3>
                            <div id="TEACHER_NUM_BOX" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">验船师缺口</h3>
                            <div id="SURVEYOR_GAP_BOX" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
                </div>
                </div>
                <div id="section4" class="section">
                   <div class="bi-item item4" data-to="3">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2" style="min-height: 240px;">
                            <p>
                                <b class="icon-more"
                                   onclick="modalShow('#common-win', '', train.trainEvaluateStatisticsByNamesFilter());"></b>
                                <input type="hidden" id="trainEvaluateIds" value="">
                            </p>
                            <h3 class="bi-box2-title">培训评价分析</h3>
                            <div id="TRAIN_EVALUATE_BOX" style="width: 100%;height: 240px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2" style="min-height: 240px;">
                            <h3 class="bi-box2-title">培训规划</h3>
                            <div id="TRAIN_PLANNING_BOX" style="width: 100%;height:240px"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">培训需求分析</h3>
                            <div id="TRAIN_DEMAND_ANALYSIS_BOX" style="width: 100%;height: 220px"></div>
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
                        <li class="active" data-to="0"></li>
                        <li data-to="1"></li>
                        <li data-to="2"></li>
                        <li data-to="3"></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!---------------------------------------点击弹框信息展示------------------------------------------------>
<div class="modal bs-example-modal-lg" onclick="modalHide('#common-win', '');" id="common-win">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" onclick="modalHide('#common-win', '');" class="close" data-dismiss="modal"><span
                        aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">选择需要展示的培训班</h4>
            </div>
            <div class="modal-body">
                <iframe src="" id="open-iframe" frameborder="0" height="360" width="100%"></iframe>
            </div>
        </div>
    </div>
</div>

<script>
    //animate.css动画触动一次方法
    $.fn.extend({
        animateCss: function (animationName) {
            var animationEnd = 'webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend';
            this.addClass('animated ' + animationName).one(animationEnd, function () {
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
    var i = 0;
    var modalShow = function (targetModel, animateName, callback) {
        console.log("callback")
        console.log(callback)
        var animationIn = ["bounceIn", "bounceInDown", "bounceInLeft", "bounceInRight", "bounceInUp",
            "fadeIn", "fadeInDown", "fadeInLeft", "fadeInRight", "fadeOutUp",
            "fadeInDownBig", "fadeInLeftBig", "fadeOutRightBig", "fadeOutUpBig", "flipInX", "flipInY",
            "lightSpeedIn", "rotateIn", "rotateInDownLeft", "rotateInDownRight", "rotateInUpLeft", "rotateInUpRight",
            "zoomIn", "zoomInDown", "zoomInLeft", "zoomInRight", "zoomInUp", "slideInDown", "slideInLeft",
            "slideInRight", "slideInUp", "rollIn"];
        if (!animateName || animationIn.indexOf(animateName) == -1) {
            console.log(animationIn.length);
            var intRandom = Math.floor(Math.random() * animationIn.length);
            i += 1;
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
    var modalHide = function (targetModel, animateName, callback) {
        var animationOut = ["bounceOut", "bounceOutDown", "bounceOutLeft", "bounceOutRight", "bounceOutUp",
            "fadeOut", "fadeOutDown", "fadeOutLeft", "fadeOutRight", "fadeOutUp",
            "fadeOutDownBig", "fadeOutLeftBig", "fadeOutRightBig", "fadeOutUpBig", "flipOutX", "flipOutY",
            "lightSpeedOut", "rotateOut", "rotateOutDownLeft", "rotateOutDownRight", "rotateOutUpLeft", "rotateOutUpRight",
            "zoomOut", "zoomOutDown", "zoomOutLeft", "zoomOutRight", "zoomOutUp",
            "zoomOut", "zoomOutDown", "zoomOutLeft", "zoomOutRight", "zoomOutUp", "slideOutDown", "slideOutLeft",
            "slideOutRight", "slideOutUp", "rollOut"];
        if (!animateName || animationOut.indexOf(animateName) == -1){
            console.log(animationOut.length);
            var intRandom = Math.floor(Math.random() * animationOut.length);
            animateName = animationOut[intRandom];
        }
        $(targetModel).children().click(function (e) {
            e.stopPropagation()
        });
        $(targetModel).animateCss(animateName);
        $(targetModel).delay(900).hide(1, function () {
            $(this).removeClass('animated ' + animateName);
        });
//        callback.call(this);
    }
    var modalDataInit = function(index){
        var titleArr=["累计培训总人次"]
//        var arrUrl=[get_root+"/ship/bi/ycsNumGroupByYearIndex",get_root+"/ship/bi/ycsXLGroupIndex"
//            ,get_root+"/ship/bi/ycsCateIndex?typeStr=1"]

        var arrUrl=["http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_3_1LJPXZRC&original=true"]

        $("#open-iframe").attr("src",arrUrl[index]);
        $(".modal-title").html(titleArr[index]);
        //填充数据，对弹出模态框数据样式初始化或修改
    }
    $(window).resize(function () {
        //窗口发生变化则 重置一次
        console.log("resize")
    });

</script>

<!--通用-->
<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>

<script type="text/javascript" src="${script}/chinasofti/bi/bi_train.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/jquery.fullPage.js"></script>
<%--<script type="text/javascript" src="${ctx}/plug/layui/lay/modules/layer.js"></script>--%>
<script>
    train.dataTo0Onclick();
</script>
</body>
</html>
