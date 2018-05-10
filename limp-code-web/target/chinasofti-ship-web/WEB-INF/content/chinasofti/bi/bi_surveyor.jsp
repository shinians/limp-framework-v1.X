
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en" style = 'overflow: hidden'>
<head>
    <meta charset="utf-8">
    <title>验船师主题分析</title>
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

  <%--新增树形插件js--%>
    <link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>
    <%--<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/demo.css" type="text/css">--%>
    <link rel="stylesheet" href="${style}/css/jquery.fullPage.css">
    <style>
        #fp-nav ul li a span, .fp-slidesNav ul li a span { background-color: #fff;}
        #menuContent{
            position: absolute;
            left:1%;
            height:15%;
        }
    </style>

</head>

<body >
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
            <div  id="dowebok">
                <div id="section1" class="section active">
                    <div class="bi-item item1" data-to="0">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="row bi-box1-img1">
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg01">
                                    <p ><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'));"  id="USR_NUM_PAGE"></b></p>
                                    <div class="box-num">
                                        <num id="SUR_NUM">&nbsp;</num><span class="box-num-unit">人</span>
                                    </div>
                                    <div class="box-text"><span>验船师总人数</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg02">
                                    <p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('1'));"   id="commonPersonLessWin"></b></p>
                                    <p class="box-num"><num id="SUR_POINT">&nbsp;</num><span class="box-num-unit">分</span></p>
                                    <div class="box-text"><span>验船师能力平均分</span></div>
                                </div>
                            </div>
                            <div onload="showChange()" class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg03 surChange1">
                                    <p><b  class="icon-more"  onclick="modalShow('#common-win', '', modalDataInit('2'));" id="commonOrgNumWin"></b></p>
                                    <p class="box-num"><num id="SUR_WORK_NUM">&nbsp;</num><span class="box-num-unit">艘</span></p>
                                    <div class="box-text"><span>验船师年均检验渔船数量</span></div>
                                </div>
                                <div class="common-box1 bi-box1-img shipIconBg03 surChange2">
                                    <%--<p><b  class="icon-more" id="commonOrgNumWin"></b></p>--%>
                                    <p class="box-num"><num id="SUR_WORK_NUM02">&nbsp;</num><span class="box-num-unit">台/件/个/套</span></p>
                                    <div class="box-text"><span>验船师年均检验产品数量</span></div>
                                </div>
                                <div class="common-box1 bi-box1-img shipIconBg03 surChange3">
                                    <%--<p><b  class="icon-more" id="commonOrgNumWin"></b></p>--%>
                                    <p class="box-num"><num id="SUR_WORK_NUM01">&nbsp;</num><span class="box-num-unit">套</span></p>
                                    <div class="box-text"><span>验船师年均审查图纸数量</span></div>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="common-box1 bi-box1-img shipIconBg04">
                                    <p><b  class="icon-more"  onclick="modalShow('#common-win', '', modalDataInit('3'));"></b></p>
                                    <p class="box-num"><num id="SUR_MATCH_NUM">&nbsp;</num><span class="box-num-unit">%</span></p>
                                    <div class="box-text"><span>验船师人员匹配度</span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('0'));" ></b></p>--%>
                            <h3 class="bi-box2-title">验船师人数<a href="javascript:;" id="time-sur-1-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_1_1" style="width: 100%;height:260px"></div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('1'));"></b></p>--%>
                            <h3 class="bi-box2-title">验船师级别学历<a href="javascript:;" id="time-sur-1-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_1_2" style="width: 100%;height:260px"></div>
                        </div>
                    </div>
                </div>
            </div>
                </div>
                <div id="section2" class="section">
                  <div class="bi-item item2" data-to="1">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more" onclick="modalShow('#common-win', '', modalDataInit('2'));"></b></p>--%>
                            <h3 class="bi-box2-title">验船师结构（按级别）<a href="javascript:;" id="time-sur-2-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_2_1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">验船师结构（按学历）<a href="javascript:;" id="time-sur-2-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_2_2" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">验船师结构（按证书专业）<a href="javascript:;" id="time-sur-2-3" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_2_3" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">验船师结构（按特殊资质）<a href="javascript:;" id="time-sur-2-4" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                            <div id="SUR_2_4" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
            </div>
                </div>
                <div id="section3" class="section">
                  <div class="bi-item item3" data-to="2">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">验船师能力得分趋势 <span class="yearNum" id="startYear"></span>-<span class="yearNum" id="overYear"></span><a href="javascript:;" id="time-sur-3-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="sur_3_1" style="width: 100%;height: 220px"></div>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <%--<p><b  class="icon-more"></b></p>--%>
                            <h3 class="bi-box2-title">验船师评分<a href="javascript:;" id="time-sur-3-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="sur_3_2" style="width: 100%;height: 220px"></div>
                        </div>
                    </div>
                </div>
            </div>
                </div>
                <div id="section4" class="section">
                  <div class="bi-item item4" data-to="3">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="bi-box2-4">
                            <h3 class="bi-box2-title">验船师匹配度 <span class="yearNum" id="start01"></span>- <span class="yearNum" id="start02"></span><a href="javascript:void(0);" id="time-sur-4-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>

                            <div id="4-1-1" style="width: 100%;height: 500px"></div>

                        </div>
                    </div>
                </div>
            </div>
                </div>
                <div id="section5" class="section">
                    <div class="bi-item item5" data-to="4">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="bi-box2-4">
                                    <h3 class="bi-box2-title">各类人员缺口<a href="javascript:void(0);" id="time-sur-4-2" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                                    <div id="4-2-1" style="width: 100%;height: 450px"></div>
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
                        <li   data-to="3"></li>
                        <%--<li   data-to="4"onclick="javascript:void (0)"></li>--%>
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
                <h4 class="modal-title">近5年渔业船舶验船师人数走势图</h4>
            </div>
            <div class="modal-body">
                <iframe src="" id="open-iframe"frameborder="0"  height="300" width="100%"></iframe>
            </div>
        </div>
    </div>
</div>
<script>
    //********************** 关键指标翻页**********************************************//

    var NowDiv=1;//表示当前显示的div
    var MaxDiv=3;//表示div的个数
    function showChange(){
        for(var i=1;i<=MaxDiv;i++){
            if(NowDiv==i)
                $(".surChange"+NowDiv).slideDown();//当前显示的div
            else
                $(".surChange"+i).css({display:"none"});
        }
        if(NowDiv==MaxDiv)//判断当前div是否是最后一个，如果是则从第一个重新轮回显示
            NowDiv=1;
        else
            NowDiv++;//下一个
    }
    theTimer=setInterval("showChange()",5000);//设置定时器，显示下一个div

    //*******************************************************************//
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
            console.log(animationIn.length);
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
        if(!animateName || animationOut.indexOf(animateName)==-1){
            console.log(animationOut.length);
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
        var titleArr=["验船师持证总人数","验船师能力平均分","验船师年均检验渔船数量","验船师匹配度"]
//        var arrUrl=[get_root+"/ship/bi/ycsNumGroupByYearIndex",get_root+"/ship/bi/ycsXLGroupIndex"
//            ,get_root+"/ship/bi/ycsCateIndex?typeStr=1"]

        var arrUrl=["http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=YCSFX&original=true&calnow=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=3_2_2YCSNLPG&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=XZSPXF&original=true","http://202.127.45.164:8090/bi/esmain/login.do?id=admin&pw=ifvSBi001$&url=../esmain/portal/portal.do?id=XZSPXF&original=true"]

        $("#open-iframe").attr("src",arrUrl[index]);
        $(".modal-title").html(titleArr[index]);
        //填充数据，对弹出模态框数据样式初始化或修改
    }



</script>
<style>

</style>
<!--通用-->

<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<%--<script type="text/javascript" src="${bt}/js/bootstrap.js"></script>--%>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script type="text/javascript" src="${plug}/js-utils/count-number.js"></script>
<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/jquery.mousewheel.js'></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_sur.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/jquery.fullPage.js"></script>
<script>
    /***************************************************/
    var setting = {
        check: {
            enable: true,
            chkboxType: {"Y":"", "N":""}
        },
        view: {
            dblClickExpand: false,
            showLine:false,//是否显示连接线
            showIcon:false //是否显示图标
        },
        data: {
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeClick: beforeClick,
            onCheck: onCheck
        }
    };
    var zNodes =[
        {id:1, pId:0, name:"北京"},
        {id:2, pId:0, name:"天津"},
        {id:3, pId:0, name:"上海"},
        {id:3, pId:0, name:"广州"},
        {id:3, pId:0, name:"深圳"},
        {id:3, pId:0, name:"澳门"},
        {id:6, pId:0, name:"重庆"}

    ];
    function beforeClick(treeId, treeNode) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.checkNode(treeNode, !treeNode.checked, null, true);
        return false;
    }

    function onCheck(e, treeId, treeNode) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
                nodes = zTree.getCheckedNodes(true),
                v = "";
        vKey = "";
        for (var i=0, l=nodes.length; i<l; i++) {
            v += nodes[i].name + ",";
            vKey += nodes[i].id + ",";
        }
        if (v.length > 0 ) v = v.substring(0, v.length-1);
        if (vKey.length > 0 ) vKey = vKey.substring(0, vKey.length-1);
        var cityObj = $("#citySel");
        cityObj.attr("value", v);
        cityObj.attr("data-checkbox", vKey);
    }

    function showMenu() {
//        var cityObj = $("#citySel");
//        var cityOffset = $("#citySel").offset();
       // $("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"});
     $("#menuContent").css({display:"block"});
      $("body").bind("mousedown", onBodyDown);
    }
    function hideMenu() {
        $("#menuContent").fadeOut("fast");
        $("body").unbind("mousedown", onBodyDown);
    }
    function onBodyDown(event) {
        if (!(event.target.id == "menuBtn" || event.target.id == "citySel" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
            hideMenu();
        }
    }
    /***************************************************/
</script>




<%--<script type="text/javascript" src="${ctx}/plug/layui/lay/modules/layer.js"></script>--%>
</body>
</html>


<%---------------------------测试弹框-----------------------------------------%>
<%--http://www.jq22.com/demo/BootstrapModal20161123/--%>
<%--<button type="button" class="btn btn-primary  test-btn" onclick="modalShow('#bigModal', '', modalDataInit('test'));">模态框测试</button>--%>
<%--<div class="modal bs-example-modal-lg"  onclick="modalHide('#bigModal', '');" id="bigModal">--%>
    <%--<div class="modal-dialog modal-lg">--%>
        <%--<div class="modal-content">--%>
            <%--<div class="modal-header">--%>
                <%--<button type="button" onclick="modalHide('#bigModal', '');" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span  class="sr-only">Close</span></button>--%>
                <%--<h4 class="modal-title">模态框标题</h4>--%>
            <%--</div>--%>
            <%--<div class="modal-body">--%>
               <%--<pre class="text-left">--%>
                        <%--modalShow('#bigModal', '', modalDataInit('test'));--%>
                        <%--//animateName可为空，或填写对应的animateIn或者animateOut数组中的对应参数--%>
                        <%--//显示参数--%>
                        <%--animationIn = ["bounceIn","bounceInDown","bounceInLeft","bounceInRight","bounceInUp",--%>
                                          <%--"fadeIn", "fadeInDown", "fadeInLeft", "fadeInRight", "fadeOutUp",--%>
                                        <%--"fadeInDownBig", "fadeInLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipInX","flipInY",--%>
                                    <%--"lightSpeedIn","rotateIn","rotateInDownLeft","rotateInDownRight","rotateInUpLeft","rotateInUpRight",--%>
                                    <%--"zoomIn","zoomInDown","zoomInLeft","zoomInRight","zoomInUp","slideInDown","slideInLeft",--%>
                                    <%--"slideInRight", "slideInUp","rollIn"];--%>
                        <%--//隐藏参数--%>
                        <%--animationOut = ["bounceOut","bounceOutDown","bounceOutLeft","bounceOutRight","bounceOutUp",--%>
                                        <%--"fadeOut", "fadeOutDown", "fadeOutLeft", "fadeOutRight", "fadeOutUp",--%>
                                         <%--"fadeOutDownBig", "fadeOutLeftBig", "fadeOutRightBig", "fadeOutUpBig","flipOutX","flipOutY",--%>
                                    <%--"lightSpeedOut","rotateOut","rotateOutDownLeft","rotateOutDownRight","rotateOutUpLeft","rotateOutUpRight",--%>
                                        <%--"zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp",--%>
                                        <%--"zoomOut","zoomOutDown","zoomOutLeft","zoomOutRight","zoomOutUp","slideOutDown","slideOutLeft",--%>
                                        <%--"slideOutRight", "slideOutUp","rollOut"];--%>
                                       <%--</pre>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

