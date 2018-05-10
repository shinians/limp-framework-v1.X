<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>

<style type="text/css">
    <%--2017.8.16 by meng--%>
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
    .kaishi, .jieshu {
        float: left;
        color:#5CB4EC;
    }
    #jianyan_datetimepicker1, #jianyan_datetimepicker2 {
        width: 80px;
    }
    #jianyan_datetimepicker1 .form-control, #jianyan_datetimepicker2 .form-control {
        width: 32px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #jianyan_datetimepicker1 .input-group-addon, #jianyan_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
    }
    #chouchaTab .active{
        margin-right:-1px;
    }
    /*2017.8.21 by meng*/
    .shijianduan{
        /*padding-left:35px;*/
        position: absolute;
        top: 5px;
        right: 35px;
    }
    #fishinspection_datetimepicker1, #fishinspection_datetimepicker2 {
        width: 110px;
    }
    #fishinspection_datetimepicker1 .form-control, #fishinspection_datetimepicker2 .form-control {
        width: 70px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #fishinspection_datetimepicker1 .input-group-addon, #fishinspection_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
    }
    #orgTimePageing,#orgShipPageing,#orgFacPageing,#orgRipPageing{
        text-align: right;
    }
    .layui-form-label{
        width:145px;
        color:#fff;
    }
    /*2017824 by mengnalisha*/
    .xiangqingTitle{
        width: 99px;
        text-align: right;
        display: inline-block;
    }
    .xiangqingCon{
        display: inline-block;
        width: 300px;
        vertical-align: top;
    }
    .layui-input{
        height:25px;
    }
    .xiangqing td{
        line-height:45px;
        width: 49.95%;
    }

    #communicateMsg , #nature,#personMsg,#diplomaMsg,#shipCompany,#communicateMsg{
        width:100%;
    }
    #communicateMsg tr td, #nature tr td ,#personMsg tr td,#diplomaMsg tr td,#shipCompany tr td,#communicateMsg tr td{
        border:1px solid #fff;
        padding: 15px;
        color: #fff;
    }
    .tdName{
        width:20%;
        color:#57BBED !important;
        text-align: right;
    }

    .layui-tab-title{
        border:0;
    }
    .layui-tab-card>.layui-tab-title .layui-this:after{
        border:0;
    }
    .layui-tab-title{
        border:0;
    }
    table tbody tr:nth-child(even){
        background: #294B6C;
    }
    .layui-tab-card{
        border:0;
    }
    .layui-tab-card>.layui-tab-title .layui-this{
        border-right: 1px solid #fff;
    }
    /*时间样式  改  by  段云红   20170823*/
    .biorgChoose{
        color: #0B61A4;
        font-size: 20px;
        float:right;
    }
    .biorgChoose:hover,.biorgChoose:link,.biorgChoose:active{text-decoration: none;}
    .kaishi, .jieshu {
        float: left;
        color:#5CB4EC;
    }
    #datetimepicker1, #datetimepicker2 {
        width: 83px;
    }
    #datetimepicker1 .form-control, #datetimepicker2 .form-control {
        width:37px;
        height: 25px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #datetimepicker1 .input-group-addon, #datetimepicker2 .input-group-addon {
        width: 25px;
        height: 25px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../resources/style/images/date.png)no-repeat;
        border: 0px;
    }
    .shijianduan span {
        float: left;
        font-size: 16px;
        line-height: 20px;
        margin: auto;
        width: 100%;
        height: 100%;
    }
    /*tip 背景色  by  段云红*/
    .layui-layer-tips .layui-layer-content{background-color: #122C5B!important;}
    .form-control{border:none!important;}
    .layui-layer-tips .layui-layer-setwin .layui-layer-close1 {
        background-position: -188px -39px;
        cursor: pointer;
    }
    .layui-layer-tips .layui-layer-setwin a{
        width: 13px;
        height: 13px;
    }
    
    .layui-layer-tips i.layui-layer-TipsL, .layui-layer-tips i.layui-layer-TipsR {
        border-bottom-color:#122C5B!important;
    }
    .layui-layer-setwin{
        top: 7px!important;
    }
    input::-webkit-input-placeholder{
        color: #00CCCC !important;
    }
    input:-moz-placeholder{
        color: #00CCCC !important;
    }
    input::-moz-placeholder{
        color: #00CCCC !important;
    }
    input:-ms-input-placeholder{
        color: #00CCCC !important;
    }
    .sure{
        width: 40px;
        height: 23px;
        margin-left: 10px;
        /* margin-top: 2px; */
        padding: 0px 5px;
        line-height: 23px;
    }
    .carousel-indicators .active{
        width:10px;
        height: 10px;
        margin: 0px 5px;
    }
    /*pdf*/
    .lightbox{
        position: fixed;
        top: 0px;
        left: 0px;
        height: 100%;
        width: 100%;
        z-index: 7;
        opacity: 0.3;
        display: block;
        background-color: rgb(0, 0, 0);
        display: none;
    }
    .pop,.pop iframe{
        position: absolute;
        /*left: 20%;*/
        top:0;
        width: 790px;
        height: 100%;
        /*margin-left: -446.5px;*/
        z-index: 9;
    }
    .pop a{
        position: absolute;
        right: -21%;
        top: 6%;
        display: inline-block;
        width: 35px;
        height: 30px;
        color: #ffa200;
        font-weight: bold;
    }


    #orgDate, #GMDSS_datetimepicker2 {
        width: 110px;
    }
    #orgDate .form-control, #GMDSS_datetimepicker2 .form-control {
        width: 75px;                                        
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #orgDate .input-group-addon, #GMDSS_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
    }
    /*table显示省略号*/
    table{
        table-layout: fixed;
    }
    /*table tr td{*/
        /*overflow:hidden;*/
        /*text-overflow:ellipsis;*/
        /*white-space: nowrap;*/
    /*}*/
    /*业务范围*/
    .ywfw{
        height: 195px;
        width: 100%;
        overflow-y: scroll;
    }
    /*下拉多选框*/
    ul li{
        list-style: none;
    }
    .shipInput{
        color:#000;
    }
    .hide{display: none}
    .width150{
        width: 115px;
    }
    .width150 input[type="text"]{
        width: 100%;
        height: 32px;
        border: 1px solid #ccc;
        border-radius: 4px;
        padding-left: 12px;
    }
    .width150 ul{
        width: 99%;
        padding: 0 0 0 20px;
        margin: 0;
        border: 1px solid #ccc;
        position: absolute;
        z-index: 9999;
        background-color:#5676d6;
    }
    .width150 li{
        padding: 5px;
    }
    .width150 li+li{
        border-top: 1px solid #ccc;
    }
    #orgNameSearch{
        margin-left: 5px;
        padding: 0px 20px !important;
        height: 30px;
        line-height: 32px;
    }
    .totalNum p{
        color:#fff;
        font-size:16px;
    }
    .totalNum p>span{
        color:#F0FF00;
    }
    .shipPowerStart,.shipPowerEnd{
        width: 70px;
        height: 30px;
        border-radius: 3px;
    }

    /*2017.12.12 for pdf window skin*/
    .lis2 .layui-layer-setwin .layui-layer-ico{
        background: url('/resources/style/img/close.png');
    }
    .lis2 .layui-layer-setwin .layui-layer-close2{
        right: 3px;
        top: 0px;
        width: 20px;
        height: 20px;
    }
    .lis2 .layui-layer-setwin .layui-layer-close2:hover{
        background-position:-180px -40px !important;
    }

</style>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
    var orgName="${org.orgname}";
    var orgCode="${org.orgcode}";
</script>
    <%--/***************************/--%>
    <%--<div class="container" style="width: 90% !important;">--%>
    <div class="container">
        <div style="margin:20px 0px;" class="row">
            <div class="col-md-12">
                <%--duanyunhong面包屑--%>
                <div class="layui-breadcrumb" id="bread">
                    <%--<a href="">1页</a>--%>
                    <%--<a href="http://www.baidu.com">2页</a>--%>
                    <%--<a><cite>此页</cite></a>--%>
                </div>
            </div>
            <div class="col-md-12" style="padding-left:0;">
                <h3 class="title2 jianyan_company headerTxt" style="font-size:26px;">${org.orgname}</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b  class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span id="WORK_RATE" class="number repairCount">0</span>%</p>
                            <p class="textSum"><span>检验工作完成率</span></p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b  class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span  id="SUR_MATCH" class="number repairCount">0</span>%</p>
                            <p class="textSum"><span>验船师匹配度</span></p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b  class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span id="ORG_NUM" class="number repairCount">0</span>个</p>
                            <p class="textSum"><span>辖区内机构总数</span></p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b  class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span id="ORG_POINT" class="number repairCount">92</span>分</p>
                            <p class="textSum"><span>检验机构能力评估(分)</span></p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="common-box2">
                    <h3 class="box2-title">关键指标</h3>
                    <div class="row">
                        <div class="col-sm-6">

                            <p class="numberColor numberStyle"  id="shipNumber">
                                <span class="number ">${KV.SHIPNUM}</span>艘</p>
                            <p class="textSum">渔船数量</p>

                        </div>
                        <div class="col-sm-6">

                                <p class="numberColor numberStyle" id="ycsrs">
                                    <span class="number">${KV.SURNUM}</span>人</p>
                                 <p class="textSum">验船师人数</p>

                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">

                                <p class="numberColor numberStyle" id="xzqysl">
                                    <span class="number">${KV.ENT3NUM}</span>家</p>
                            <p class="textSum">修造企业数量</p>

                        </div>
                        <div class="col-sm-6">
                            <p class="numberColor numberStyle" id="cpjxjcjgsl"><span class="number">${KV.ENT4NUM}</span>个</p>
                            <p class="textSum">产品检测（维修）机构</p>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="box repairBox" style="height: 320px;">
                    <p class="margin35"><b  class="iconSum"></b></p>
                    <h3 class="box2-title">机构信息</h3>
                    <div>
                        <ul class="box2-ul" id="org-info">
                            <li><b>机构名称：</b><span>${org.orgname}</span></li>
                            <li><b>地址：</b><span>${org.orgaddr}</span></li>
                            <li><b>电话：</b><span>${org.contactphone}</span></li>
                            <li><b>传真：</b><span>${org.contactfax}</span></li>
                            <li><b>邮箱：</b><span>${org.contactemail}</span></li>
                            <li><b>职能类型：</b><span>${empty  org.funtype ? "--":org.funtype}</span></li>
                            <li><b>业务类型：</b><span>${empty  org.bustype ? "--":org.bustype}</span></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="box repairBox" style="height: 320px;">
                    <h3 class="box2-title">机构展示</h3>
                    <div class="vendor" style="width: 70%;height: 200px;margin: 0 auto">
                        <div data-ride="carousel" class="carousel slide" id="carousel-example-generic">
                            <ol class="carousel-indicators" id="jianyan_img-ol">
                                <%--<li class="" data-slide-to="0" data-target="#carousel-example-generic"></li>--%>
                                <%--<li data-slide-to="1" data-target="#carousel-example-generic" class="active"></li>
                                <li data-slide-to="2" data-target="#carousel-example-generic" class=""></li>
                                <li data-slide-to="3" data-target="#carousel-example-generic" class=""></li>
                                <li data-slide-to="4" data-target="#carousel-example-generic" class=""></li>
                                <li data-slide-to="5" data-target="#carousel-example-generic" class=""></li>--%>
                            </ol>
                            <div class="carousel-inner" id="jianyan_img-list">
                                <div class="item active">
                                    <img class="img-responsive-media" alt="Second slide" src="${ctx}/resources/style/images/jiance.png">
                                </div>
                                <%--  <div class="item">
                                    <img class="img-responsive-media" alt="First slide" src="${ctx}/resources/style/images/ins01.jpg">
                                </div>
                                <div class="item active">
                                    <img class="img-responsive-media" alt="Second slide" src="${ctx}/resources/style/images/ins02.jpg">
                                </div>
                                <div class="item">
                                    <img class="img-responsive-media" alt="Third slide" src="${ctx}/resources/style/images/ins01.jpg">
                                </div>--%>
                            </div>
                         <%--   <a data-slide="prev" href="#carousel-example-generic" class="left carousel-control">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a data-slide="next" href="#carousel-example-generic" class="right carousel-control">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>--%>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="time" id="jyjgTime" style="margin:0px -10px 20px 0px;">
                    <div class="box3-title">认可历程</div>
                    <div class="wrapper-t">
                        <div class="content-t">
                            <div class="content-t1 ccc" style="left: 10px;">
                                <h4 class="content-t1-name">首次核定</h4>
                                <div class="content-con">
                                    <p>认可时间：<time>2006.08.22</time></p>
                                    <button class="aa btn-time">查看详情</button>
                                </div>
                            </div>
                            <div class="content-t2 ccc" style="left: 247.656px;">
                                <h4 class="content-t2-name">复核换证</h4>
                                <div class="content-con2">
                                    <p>认可时间：<time>2010.08.22</time></p>
                                    <button class="btn-time">查看详情</button>
                                </div>
                            </div>
                            <div class="content-t1 ccc" style="left: 505.313px;">
                                <h4 class="content-t1-name">机构信息变更</h4>
                                <div class="content-con">
                                    <p>认可时间：<time>2014.08.22</time></p>
                                    <button class="btn-time">查看详情</button>
                                </div>
                            </div>
                            <div class="content-t2 ccc" style="left: 247.656px;">
                                <h4 class="content-t2-name">注销</h4>
                                <div class="content-con2">
                                    <p>认可时间：<time>2018.08.22</time></p>
                                    <button class="btn-time">查看详情</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="t-back"></div>
                    <div class="t-go"></div>
                </div>
            </div>
            <!--查看详情弹出窗-->
            <script type="text/template" id="timeDetail">
                <div class="xiangqing">
                    <%--<p><span class="xiangqingTitle">申请单位：</span><span class="xiangqingCon">{{orgname}}</span></p>--%>
                    <%--<p><span class="xiangqingTitle">核定单位：</span><span class="xiangqingCon">{{checkunit}}</span></p>--%>
                    <%--<p><span class="xiangqingTitle">审批人：</span><span class="xiangqingCon">{{checkperson}}</span></p>--%>
                    <%--<p><span class="xiangqingTitle">审批意见：</span><span class="xiangqingCon">{{checkoptions}}</span></p>--%>
                    <%--<p><span class="xiangqingTitle" title="{{scope}}">业务核定范围：</span><span class="xiangqingCon">{{scope}}</span></p>--%>
                    <%--<p><span class="xiangqingTitle">下次核定时间：</span><span class="xiangqingCon">{{checktimenext}}</span></p>--%>
                    <table style="width: 100%;">
                        <tr>
                            <td>
                                <span class="xiangqingTitle">申请单位：</span><span class="xiangqingCon">{{orgname}}</span>
                            </td>
                            <td>
                                <span class="xiangqingTitle">核定单位：</span><span class="xiangqingCon">{{checkunit}}</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="xiangqingTitle">审批人：</span><span class="xiangqingCon">{{checkperson}}</span>
                            </td>
                            <td>
                                <span class="xiangqingTitle">审批意见：</span><span class="xiangqingCon">{{checkoptions}}</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="xiangqingTitle">下次核定时间：</span><span class="xiangqingCon">{{checktimenext}}</span></p>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                <span class="xiangqingTitle" >业务核定范围：</span><span class="xiangqingCon ywfw" style="width:845px;height: 320px;">{{scope}}</span>
                            </td>
                        </tr>
                    </table>
                </div>
            </script>
        </div>
        <div class="row">
            <div class="col-sm-7">
                <div class="box repairBox shipSituation">
                    <h3 class="box2-title">检验工作情况<a href="javascript:;" id="time-org-2-1" class="biorgChoose glyphicon glyphicon-filter"></a></h3>
                    <ul class="nav nav-tabs" id="shipCheckTab">
                        <li class="active">
                            <a href="#tab_jd_1" data-toggle="tab">渔业船舶检验</a>
                        </li>
                        <li>
                            <a href="#tab_jd_2" data-toggle="tab">图纸审查<span></span></a>
                        </li>
                        <li>
                            <a href="#tab_jd_3" data-toggle="tab">船用产品检验<span></span></a>
                        </li>
                    </ul>
                    <%--添加时间筛选--%>

                    <div class="tab-content">
                        <div class="tab-pane in active" id="tab_jd_1">
                            <div id="checkType" style="width:100%;height: 260px"> </div>
                        </div>
                        <div class="tab-pane" id="tab_jd_2">
                            <div id="paperCheck" style="width: 100%;height: 260px"></div>
                        </div>
                        <div class="tab-pane" id="tab_jd_3">
                            <div id="goodsCheck" style="width: 100%;;height: 260px"></div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="col-sm-5">
                <div class="repairBox box" id="file-list">
                    <h3 class="box2-title">工作报告列表</h3>
                    <div>
                        <ul class="box2-ul">
                            <li><span>《2017年年度工作报告》</span><div style="float: right;margin-right: 20px"><a href="javascript:;" target="pdfContainer" onclick="readPdf()"><i class="glyphicon glyphicon-eye-open" title="预览"></i></a>&nbsp;&nbsp;&nbsp;<a href="shipcheckreport.pdf" download="shipcheckreport.pdf"><i class="glyphicon glyphicon-download-alt" title="下载"></i></a></div></li>
                            <li><span>《2016年年度工作报告》</span><div style="float: right;margin-right: 20px"><a href="shipcheckreport.pdf" target="pdfContainer" onclick="readPdf()"><i class="glyphicon glyphicon-eye-open" title="预览"></i></a>&nbsp;&nbsp;&nbsp;<a href="shipcheckreport.pdf" download="shipcheckreport.pdf"><i class="glyphicon glyphicon-download-alt" title="下载"></i></a></div></li>
                            <li><span>《2015年年度工作报告》</span><div style="float: right;margin-right: 20px"><a href="shipcheckreport.pdf" target="pdfContainer" onclick="readPdf()"><i class="glyphicon glyphicon-eye-open" title="预览"></i></a>&nbsp;&nbsp;&nbsp;<a href="shipcheckreport.pdf" download="shipcheckreport.pdf"><i class="glyphicon glyphicon-download-alt" title="下载"></i></a></div></li>
                            <li><span>《2014年年度工作报告》</span><div style="float: right;margin-right: 20px"><a href="shipcheckreport.pdf" target="pdfContainer" onclick="readPdf()"><i class="glyphicon glyphicon-eye-open" title="预览"></i></a>&nbsp;&nbsp;&nbsp;<a href="shipcheckreport.pdf" download="shipcheckreport.pdf"><i class="glyphicon glyphicon-download-alt" title="下载"></i></a></div></li>
                        </ul>

                    </div>
                </div>
            </div>
        </div>
        <%--pdf展示块--%>
        <%--<div class="lightbox" id="lightbox"></div>--%>
        <%--<div id="pop" class="pop" style="display: none;">--%>
            <%--<a href="javascript:close()" id="close">关闭</a>--%>
            <%--<iframe src="" frameborder="0" id="pdfContainer" name="pdfContainer"></iframe>--%>
        <%--</div>--%>
        <%--new iframe to show pdf--%>
        <%--<iframe src="" frameborder="0" id="ifr"></iframe>--%>
    </div>


    <!-- 机构检验完成率 -->

    <%--/***************************/--%>
    <div id='view1' class='hide'></div>
    <ul class="lay">
    <script type="text/template" id='layOne'>
        <li class="lis1" id="lisOne">
            <!--弹出层1 检验完成工作率-->
            <%--<div class="layer-tit">${org.orgname}</div>--%>
            <div class="line-chart">
                <div class="shijianduan" style="margin-bottom:-20px;">
                    <!--起止时间-->
                    <div class="kaishi form-group">
                        <%--<label>选择开始时间：</label>--%>
                        <!--指定 date标记-->
                        <div class='input-group date' id='jianyan_datetimepicker1'>
                            <input type='text' class="form-control" value="" placeholder="开始" id="jianyan_startT" style="height: 34px !important;" />
                            <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                        </div>
                    </div>
                    <!--结束时间-->
                    <div class="jieshu">
                        <%--<label>选择结束时间：</label>--%>
                        <div class='input-group date' id='jianyan_datetimepicker2'>
                            <input type='text' class="form-control" value="" placeholder="结束" style="height: 34px !important;" id="jianyan_endT" />
                            <span class="input-group-addon">
                                <span class="glyphicon-calendar"></span>
                            </span>
                        </div>
                    </div>
                </div>
                <div id="org-work-rate" style="width: 100%;height: 360px;background:transparent;"></div>
            </div>
        </li>
    </script>
    <script type="text/template" id="layTwo" >

        <li class="lis1" id="lisTwo">
            <a href="javascript:void(0);" style="position: absolute;z-index: 99999;right:5%;" id="org-work-jsf20" class="biorgChoose glyphicon glyphicon-filter"></a>

            <!--弹出层2 检验师匹配度-->

            <div class="row">

                <%--<div class="layer-tit tit-click" >验船师人员缺口</div>--%>

                <div id="org-work-jsf2" style="width:100%;height:360px;"></div>
            </div>
        </li>
    </script>
    <script type="text/template" id="layThree">

        <label>请选择筛选时间：</label>
        <!--指定 date标记-->
        <div class='input-group date' id="orgDate">
            <input type='text' class="form-control" value="2015" id="org_DatePicker" />
            <span class="input-group-addon">
                    <span class="glyphicon-calendar"></span>
            </span>
        </div>
        <li class="lis1" id="lisThree">
            <!--弹出层3 监督抽查合格率-->
            <div class="portlet">
                <div class="choucha">
                    <ul class="nav" id="chouchaTab">
                        <li class="active" data-value="1">
                            <a href="#tab_org_1" data-toggle="tab">机构管理比例图</a>
                        </li>
                        <li data-value="2">
                            <a href="#tab_org_2" data-toggle="tab">机构拨款方式比例图<span></span></a>
                        </li>
                        <li data-value="3">
                            <a href="#tab_org_3" data-toggle="tab">机构设置方式比例图<span></span></a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="tab_org_1">
                            <div id="org-num" style="height: 323px"></div>
                        </div>
                        <div class="tab-pane" id="tab_org_2">
                            <div id="org-money" style="height:323px;width:891px"></div>
                        </div>
                        <div class="tab-pane" id="tab_org_3">
                            <div id="org-setmethod" style="height: 323px;width:891px"></div>
                        </div>
                    </div>
                </div>
            </div>
        </li>
    </script>
    <script type="text/template" id="layFour">
        <li class="lis1 act" id="lisFour">
            <!--弹出层4 企业能力评估-->
            <div class="row">
                <div class="span6">
                    <div class="line-chart" style="position: relative;">
                        <div id="nenglipinggu" style="width:100%;height:320px;"></div>
                        <div class="fenshu"><strong><?= score ?></strong>分</div>
                    </div>
                </div>
                <div class="span6">
                    <div class="panel-group"  id="qingkuang">

                        <span></span>

                        <div class="panel panel-default">
                        <? for(var i = 0;i<arr.length;i++) { ?>

                            <? if(arr[i].remark != '无') { ?>
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#qingkuang"><i class="glyphicon glyphicon-hand-down"></i> <?=arr[i].name ?>( <?= arr[i].score ?> /<?= (arr[i].total * arr[i].weight).toFixed(2) ?> &nbsp;&nbsp; (<span class="remark"><?= arr[i].remark  ?></span>)</a>
                                    </h4>
                                </div>

                            <? } else if(arr[i].remark == '无') { ?>
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="#<?= arr[i].id ?>"data-toggle="collapse" data-parent="#qingkuang"><i class="glyphicon glyphicon-hand-down"></i> <?=arr[i].name ?>( <?= arr[i].score ?> /<?= (arr[i].total * arr[i].weight).toFixed(2) ?>)</a>
                                    </h4>
                                </div>

                           <? } ?>

                            <div id="<?= arr[i].id ?>" class="panel-collapse collapse">
                                <div class="panel-body">


                                    <? for(var k = 0;k<arr[i].child.length;k++){ ?>
                                    <p>
                                        <span> <?= arr[i].child[k].name  ?> ：<?= arr[i].child[k].score ?>/ <?= arr[i].child[k].totalScore * arr[i].child[k].weight ?> </span>
                                    </p>
                                    <? } ?>
                                </div>
                            </div>
                        <? } ?>

                        </div>
                    </div>
                </div>
            </div>
        </li>
    </script>
    </ul>
    <!--end 弹出层-->
    <!--查看详情弹出窗-->
    <script type="text/template" id="inspectionDetial">
        <div class="layui-tab layui-tab-card" lay-filter="demo" id="inspection">
            <ul class="layui-tab-title" style="left: 10px;width: 99.9%;">
                <li class="layui-this">通信信息</li>
                <li>机构性质</li>
                <li>人员信息</li>
                <li>证书信息</li>
                <li>船舶及企业</li>
                <li>业务核定范围</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <table id="communicateMsg">
                        <tr>
                            <td class="tdName">机构名称</td>
                            <td>${org.orgname}</td>
                            <td class="tdName">单位地址</td>
                            <td>${org.orgaddr}</td>
                        </tr>
                        <tr>
                            <td class="tdName">邮编</td>
                            <td>${org.orgpostcode}</td>
                            <td class="tdName">办公电话</td>
                            <td>${org.contactphone}</td>
                        </tr>
                        <tr>
                            <td class="tdName">手机</td>
                            <td>${org.contacttel}</td>
                            <td class="tdName">办公邮件</td>
                            <td>${empty  org.contactemail ? "--":org.contactemail}</td>
                        </tr>
                        <tr>
                            <td class="tdName">办公用地(平方米)</td>
                            <td>${org.officearea}</td>
                            <td class="tdName">检验检测设备(台)</td>
                            <td>${org.device}</td>
                        </tr>
                        <tr>
                            <td class="tdName">公务用车(辆)</td>
                            <td>${org.carnum}</td>
                            <td class="tdName">办公电脑(台)</td>
                            <td>${org.compunum}</td>
                        </tr>
                    </table>
                </div>
                <div class="layui-tab-item">
                    <table id="nature">
                        <tr>
                            <td class="tdName">单位性质</td>
                            <td>
                               <%-- <c:if test="${org.parttype==1}">
                                    公务员管理
                                </c:if><c:if test="${org.parttype==2}">
                                参照公务员管理
                            </c:if><c:if test="${org.parttype==3}">
                                事业机构
                            </c:if>--%>

                            </td>
                            <td class="tdName">机构职能类型</td>
                            <td><%--<c:if test="${org.funtype==1}">
                                独立机构
                              </c:if>
                                <c:if test="${org.funtype==2}">
                                    二合一机构
                                </c:if>
                                <c:if test="${org.bustype==3}">
                                    三合一机构
                                </c:if>--%>
                            </td>
                        </tr>
                        <tr>
                            <td class="tdName">机构职能范围</td>
                            <td>${org.funscope}</td>
                            <td class="tdName">机构业务类别</td>
                            <td> <%--<c:if test="${org.bustype==1}">
                                沿海机构
                            </c:if>
                                <c:if test="${org.bustype==2}">
                                    内河机构
                                </c:if>--%>
                                </td>
                        </tr>
                        <tr>
                            <td class="tdName">是否边境</td>
                            <td>${org.bodertype}</td>
                            <td class="tdName">是否带中华人民共和国字头</td>
                            <td>${org.headhas}</td>
                        </tr>
                        <tr>
                            <td class="tdName">经费来源</td>
                            <td>${org.finasource}</td>
                            <td class="tdName">机构负责人</td>
                            <td>${org.respperson}</td>
                        </tr>
                        <tr>
                            <td class="tdName">法定代表人</td>
                            <td>${org.legalperson}</td>
                            <td class="tdName">隶属（同级行政主管部门）</td>
                            <td>${empty  org.subjection ? "--":org.subjection}</td>
                        </tr>
                        <tr>
                            <td class="tdName">行政级别</td>
                            <td>${empty  org.naturetype ? "--":org.naturetype}</td>
                            <td class="tdName">当地编委批复文号</td>
                            <td>${empty  org.apprnum ? "--":org.apprnum}</td>
                        </tr>
                    </table>
                </div>
                <div class="layui-tab-item">
                    <table id="personMsg">
                        <tr>
                            <td class="tdName">现有人数</td>
                            <td>${org.pertotalnum}</td>
                            <td class="tdName">高级验船师持证人数</td>
                            <td>${org.persurlv3}</td>
                        </tr>
                        <tr>
                            <td class="tdName">中级验船师持证人数</td>
                            <td>${org.persurlv2}</td>
                            <td class="tdName">初级验船师持证人数</td>
                            <td>${org.persurlv1}</td>
                        </tr>
                        <tr>
                            <td class="tdName">远洋验船师持证人数</td>
                            <td>${org.persurocean}</td>
                            <td class="tdName">图纸审查验船师持证人数</td>
                            <td>${org.persurdraw}</td>
                        </tr>
                        <tr>
                            <td class="tdName">产品检验验船师持证人数</td>
                            <td>${org.persurproduct}</td>
                            <td class="tdName">博士研究生人数</td>
                            <td>${org.headhas}</td>
                        </tr>
                        <tr>
                            <td class="tdName">硕士研究生人数</td>
                            <td>${org.graduateup}</td>
                            <td class="tdName">本科生人数</td>
                            <td>${org.bachelorup}</td>
                        </tr>
                        <tr>
                            <td class="tdName">专科科生人数</td>
                            <td>${org.juniorup}</td>
                            <td class="tdName">中专高中及以下人数</td>
                            <td>${org.juniordown}</td>
                        </tr>
                    </table>
                </div>
                <div class="layui-tab-item">
                    <table id="diplomaMsg">
                        <tr>
                            <td class="tdName">证书编号</td>
                            <td>${cert.cerno}</td>
                            <td class="tdName">认可状态</td>
                            <td>${cert.acceptstatus}</td>
                        </tr>
                        <tr>
                            <td class="tdName">本次核定日期</td>
                            <td>${cert.checktime}</td>
                            <td class="tdName">证书有效期</td>
                            <td>${cert.endtime}</td>
                        </tr>
                        <tr>
                            <td class="tdName">首次核定日期</td>
                            <td>${cert.firsttime}</td>
                            <td class="tdName">机构代码</td>
                            <td>${org.orgcode}</td>
                        </tr>
                        <tr>
                            <td class="tdName">上级机构代码</td>
                            <td>${org.orgcodeup}</td>
                            <td class="tdName">本机构所属地区</td>
                            <td>${org.orgareaname}</td>
                        </tr>
                    </table>
                </div>
                <div class="layui-tab-item">
                    <table id="shipCompany">
                        <tr>
                            <td class="tdName">辖区内渔业船舶数7m以下(内河船)</td>
                            <td>${org.shipnum7}</td>
                            <td class="tdName">辖区内渔业船舶数7m-12m以下(内河船)</td>
                            <td>${org.shipnum7to12}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内渔业船舶数12m-24m以下(内河船)</td>
                            <td>${org.shipnum12to24}</td>
                            <td class="tdName">辖区内渔业船舶数24m以上(内河船)</td>
                            <td>${org.shipnum24}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内渔业船舶数5m以下(海洋船)</td>
                            <td>${org.oceshipnum5}</td>
                            <td class="tdName">辖区内渔业船舶数5m-12m以下(海洋船)</td>
                            <td>${org.oceshipnum5to12}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内渔业船舶数12m-24m以下(海洋船)</td>
                            <td>${org.oceshipnum12to24}</td>
                            <td class="tdName">辖区内渔业船舶数24m-45m以下(海洋船)</td>
                            <td>${org.oceshipnum24to45}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内渔业船舶数45m以上(海洋船)</td>
                            <td>${org.oceshipnum45}</td>
                            <td class="tdName">辖区内远洋渔业船舶数</td>
                            <td>${org.oceanboatnum}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内船舶修造企业数</td>
                            <td>${org.entreparenum}</td>
                            <td class="tdName">辖区内船用产品企业数</td>
                            <td>${org.entproductnum}</td>
                        </tr>
                        <tr>
                            <td class="tdName">辖区内船舶设计单位数</td>
                            <td colspan="3">${org.entdesinum}</td>
                        </tr>
                    </table>
                </div>
                <div class="layui-tab-item">
                    <table id="communicateMsg">
                        <tr>
                            <td class="tdName">检验地区范围</td>
                            <td>${org.provname}</td>
                        </tr>
                        <tr>
                            <td class="tdName">检验业务范围</td>
                            <td>
                                <div class="ywfw">${org.orgscope}</div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </script>



<script type="text/javascript" src="${ctx}/systemsite/plug/js-utils/count-number.js"></script>

<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script type="text/javascript" src="${script}/chinasofti/org/org_index.js"></script>
<%--<script type="text/javascript" src='${ctx}/plug/layui/lay/modules/layer.js'></script>--%>


<%--for reading pdf--%>
<script type="text/javascript" src="${ctx}/plug/pdf/pdf.js"></script>
<script type="text/javascript" src="${ctx}/plug/pdf/pdf.worker.js"></script>

<script type="text/javascript">

    function initCheckBox(dataArr,idName,inputName,signName){
        var str = '';
        var arr = dataArr;
        for (var x in arr){
            str += "<li><label><input type='checkbox' value='"+arr[x].id+"' data-name='"+arr[x].name+"'>"+arr[x].name+"</label></li>";
        }

        $('#'+idName).html(str);

        $("#"+idName).mouseover(function() {
            if (!$("#"+idName).hasClass('hover')){//类hover在下面用来验证是否需要隐藏下拉，没有其他用途。
                $("#"+idName).addClass('hover');
            }
        }).mouseout(function(){
            $("#"+idName).removeClass('hover');
        });

        $(document).on('click',function() {
            if (!$("#"+inputName).is(":focus") && !$("#"+idName).hasClass('hover')) {//如果没有选中输入框且下拉不在hover状态。
                var name = '';
                $('#'+idName+ ' input').each(function () {//遍历checkbox
                    var check = $(this).is(':checked');//判断是否选中
                    if (check) {
                        name += $(this).attr('data-name') + ',';
                        $(this).attr('name', signName);
                    } else {
                        $(this).attr('name', "");
                    }
                });
                $("#"+inputName).val(name.slice(0, -1));//去除最后的逗号
                $("#"+idName).addClass('hide');
            } else {
                $("#"+idName).removeClass('hide');
            }
        });
    }


    $('#shipNumber').on('click',function(){

        $.ajax({
            url : get_root + "/system/dict/getDicByCate?cates=13,24",
            type : 'get',
            dataType : 'json',
            success : function(data){
                crossPageJump('本机构所有渔船列表','/ship/getShipListByOrgcode','${org.orgcode}',1,5,data);
            }
        })

    })
    
    $('#ycsrs').on('click',function(){
        system.post(
            get_root + '/ship/sur/getSurveyorList',
            {
                page:1,
                rows:5,
                id: ${org.orgcode}
            },
            function (data) {
                if(data.code == '200'){
                    var result = data.result.dataList;
                    console.log(result);
                    ClickTabs.openLayer("本机构所有验船师列表","org_num",result);
                    
                    var arr = {
                        0 : {name:'验船员',id:"0"},
                        1 : {name:'初级验船师',id:"1"},
                        2 : {name:'中级验船师',id:"2"},
                        3 : {name:'高级验船师',id:"3"}
                    };
                    initCheckBox(arr,"levelId","levelInput","shipLevel");

                    var arr2 = {
                        0 : {name:'远洋验船师',id:"远洋"},
                        1 : {name:'境外验船师',id:"境外"},
                        2 : {name:'审图验船师',id:"审图"},
                        3 : {name:'产品验船师',id:"产品"}
                    };
                    initCheckBox(arr2,"zzId","zzInput","shipZz");

                    var arr3 = {
                        0 : {name:'小型渔业船舶检验',id:"小型渔业"},
                        1 : {name:'渔业船舶检验管理',id:"渔业船舶"},
                        2 : {name:'船体',id:"船体"},
                        3 : {name:'轮机',id:"轮机"},
                        4 : {name:'电气',id:"电气"}
                    };
                    initCheckBox(arr2,"zyId","zyInput","shipZy");

                    var rowCount = data.result.rowCount;
                    var nums = data.result.rows;
                    ClickTabs.paging("orgShipPageing",rowCount,nums,function(obj,first,str){
                        if(obj.curr == 1){
                            ClickTabs.tbodyHtml('org_ship_tbody',"org_ship_table_body",result);
                        }else{
                            system.post(
                                get_root + '/ship/sur/getSurveyorList',
                                {
                                    page:obj.curr,
                                    rows:nums,
                                    id: ${org.orgcode}
                                },
                                function (data) {
                                    var result = data.result.dataList;
                                    ClickTabs.tbodyHtml('org_ship_tbody',"org_ship_table_body",result);
                                })
                        }
                    });
                    
                    $('#searchShipName').on('click',function(){
                        var shipName = $('#searchShipId').val();
                        var shipId = $('#orgShipName').val();
                        system.post(
                            get_root + '/ship/sur/getSurveyorList',
                            {
                                page:1,
                                rows:5,
                                id: ${org.orgcode},
                                sname:shipName,
                                sid:shipId
                            },
                            function (data) {
                                var result = data.result.dataList;
                                console.log(data)
                                var nums = data.result.rows;
                                var rowCount = data.result.rowCount;

                                ClickTabs.search("org_ship_tbody","org_table_body","orgShipPageing",result,nums,rowCount,function(obj,first){
                                      if(obj.curr == '1'){
                                          ClickTabs.tbodyHtml('org_ship_tbody',"org_ship_table_body",result);
                                      }else {
                                          system.post(
                                              get_root + '/ship/sur/getSurveyorList',
                                              {
                                                  page:obj.curr,
                                                  rows:nums,
                                                  id: ${org.orgcode},
                                                  sname:shipName,
                                                  sid:shipId
                                              },
                                              function (data) {
                                                  var result = data.result.dataList;
                                                  ClickTabs.tbodyHtml('org_ship_tbody',"org_ship_table_body",result);
                                              })
                                      }

                                })
                            })
                    })
                } else{
                    layer.msg("请联系管理员！");
                    console.log('错误代码' + data.code);
                }
            })
        //CliackTabs.openLayer("本机构所有渔船列表","org_num");
    })
    $('#xzqysl').on('click',function(){
        //crossPageJump('本机构所有修造企业列表','/ship/ent/getEnt3List','${org.orgcode}',1,5);
        system.post(
            get_root + '/ship/ent/getEnt3List',
            {
                page:1,
                rows:5,
                id: ${org.orgcode}
            },
            function (data) {
                if(data.code == '200'){
                    var result = data.result.dataList;
                    ClickTabs.openLayer("本机构所有修造企业列表","org_fac_num",result);
                    var arr = {
                        0 : {name:'远洋验船师',id:"远洋"},
                        1 : {name:'初级验船师',id:"初级"},
                        2 : {name:'中级验船师',id:"中级"},
                        3 : {name:'高级验船师',id:"高级"}
                    };
                    initCheckBox(arr,"levelId","levelInput","shipLevel");
                    var rowCount = data.result.rowCount;
                    var nums = data.result.rows;
                    ClickTabs.paging("orgFacPageing",rowCount,nums,function(obj,first,str){
                        if(obj.curr == 1){
                            ClickTabs.tbodyHtml('org_fac_tbody',"org_fac_table_body",result);
                        }else{
                            system.post(
                                get_root + '/ship/ent/getEnt3List',
                                {
                                    page:obj.curr,
                                    rows:nums,
                                    id: ${org.orgcode}
                                },
                                function (data) {
                                    var result = data.result.dataList;
                                    ClickTabs.tbodyHtml('org_fac_tbody',"org_fac_table_body",result);
                                })
                        }
                    });

                    $('#searchFacName').on('click',function(){
                        var eId = $('#orgFacName').val();
                        var eName = $('#orgFacId').val();
                        system.post(
                            get_root + '/ship/ent/getEnt3List',
                            {
                                page:1,
                                rows:5,
                                id: ${org.orgcode},
                                ename:eName,
                                eid:eId
                            },
                            function (data) {
                                var result = data.result.dataList;
                                var nums = data.result.rows;
                                var rowCount = data.result.rowCount;
                                ClickTabs.search('org_fac_tbody','org_fac_table_body','orgFacPageing',result,nums,rowCount,function(obj,first){
                                    if(obj.curr == 1){
                                        ClickTabs.tbodyHtml('org_fac_tbody',"org_fac_table_body",result);
                                    }else{
                                        system.post(
                                            get_root + '/ship/ent/getEnt3List',
                                            {
                                                page:obj.curr,
                                                rows:nums,
                                                id: ${org.orgcode}
                                            },
                                            function (data) {
                                                var result = data.result.dataList;
                                                ClickTabs.tbodyHtml('org_fac_tbody',"org_fac_table_body",result);
                                            })
                                    }
                                })
                            })
                    })
                } else{
                    layer.msg("请联系管理员！");
                    console.log('错误代码' + data.code);
                }
            })
    })
    $('#cpjxjcjgsl').on('click',function(){
        //crossPageJump('本机构所有检修检测机构列表','/ship/ent/getEnt7List','${org.orgcode}',1,5);
        system.post(
            get_root + '/ship/ent/getEnt7List',
            {
                page:1,
                rows:5,
                id: ${org.orgcode}
            },
            function (data) {
                if(data.code == '200'){
                    var result = data.result.dataList;
                    
                    ClickTabs.openLayer("本机构所有产品检修检测机构列表","org_repir_num",result);
                    var rowCount = data.result.rowCount;
                    var nums = data.result.rows;
                    ClickTabs.paging("orgRipPageing",rowCount,nums,function(obj,first,str){
                        if(obj.curr == 1){
                            ClickTabs.tbodyHtml('org_Rip_tbody',"org_Rip_table_body",result);
                        }else{
                            system.post(
                                get_root + '/ship/ent/getEnt7List',
                                {
                                    page:obj.curr,
                                    rows:nums,
                                    id: ${org.orgcode}
                                },
                                function (data) {
                                    var result = data.result.dataList;
                                    ClickTabs.tbodyHtml('org_Rip_tbody',"org_Rip_table_body",result);
                                })
                        }
                    });
                    $('#searchRipName').on('click',function(){
                        var eId = $('#orgRepId').val();
                        var eName = $('#orgRepName').val();
                        system.post(
                            get_root + '/ship/ent/getEnt7List',
                            {
                                page:1,
                                rows:5,
                                id: ${org.orgcode},
                                ename:eName,
                                eid:eId
                            },
                            function (data) {
                                var result = data.result.dataList;
                                var nums = data.result.rows;
                                var rowCount = data.result.rowCount;
                                ClickTabs.search('org_Rip_tbody','org_Rip_table_body','orgRipPageing',result,nums,rowCount,function(obj,first){
                                    if(obj.curr == 1){
                                        ClickTabs.tbodyHtml('org_Rip_tbody',"org_Rip_table_body",result);
                                    }else{
                                        system.post(
                                            get_root + '/ship/ent/getEnt7List',
                                            {
                                                page:obj.curr,
                                                rows:nums,
                                                id: ${org.orgcode}
                                            },
                                            function (data) {
                                                var result = data.result.dataList;
                                                ClickTabs.tbodyHtml('org_Rip_tbody',"org_Rip_table_body",result);
                                            })
                                    }
                                })
                            })
                    })

                } else{
                    layer.msg("请联系管理员！");
                    console.log('错误代码' + data.code);
                }

            })
    })
  /*  $("#fishinspection_datetimepicker1").datetimepicker({
        format: "yyyy",
        linkField: "mirror_field",
        linkFormat: "yyyy"
    });*/


    $('#fishinspection_datetimepicker1').datetimepicker({
        format: "yyyy",
        autoclose: true,
        startView: 4,
        minView: 4,
        todayHighlight: true,
        language: 'zh-CN'
    }).on('changeDate',function(e){
        startTime = e.date.getFullYear();
    });



</script>
<script id="org_table" type="text/template">

    <%--此处只有html样式具体结果还没添加--%>
    <span style="color:#fff;">船长：</span>
    <div class="layui-inline" style="color:#fff;">
        <div class="width150">
          <input type="text" id="yearInput" class="shipInput" placeholder="请选择船长" readonly>
            <ul id="yearId" class="hide">
            </ul>
        </div>
    </div>
  
    <span style="color:#fff;">船体材质：</span>
    <div class="layui-inline" style="color:#fff;" >
        <div class="width150" style="display: inline-block;">
            <input type="text" id="czInput" class="shipInput" placeholder="请选择材质" readonly>
            <ul id="czId" class="hide">
            </ul>
        </div>
    </div>

    <span style="color:#fff;">作业区域：</span>
    <div class="layui-inline" style="color:#fff;">
        <div class="width150" style="display: inline-block;">
            <input type="text" id="areaInput" class="shipInput" placeholder="请选择区域" readonly>
            <ul id="areaId" class="hide">
            </ul>
        </div>
    </div>
    <span style="color:#fff;">主机功率：</span>
    <div class="layui-inline" style="color:#000;">
        <input type="text" class="shipPowerStart"><span style="color:#fff;">Kw</span>
        <span style="color:#fff;">——</span>
        <input type="text" class="shipPowerEnd"><span style="color:#fff;">Kw</span>
    </div>

    <button class="layui-btn layui-btn-normal" data-type="reload" id="orgNameSearch">搜索</button>

    <br>
    <br>


    <table id="org_tableContent">
            <thead>
                <tr>
                    <td>序号</td>
                    <td>船名</td>
                    <td>主机功率</td>
                    <td>船体材质</td>
                    <td>船长</td>
                    <td>作业区域</td>
                    <td>船东</td>
                </tr>
            </thead>

            <tbody id="org_table_body">

            </tbody>
    </table>
    <div id="orgTimePageing"></div>
    <div class="totalNum">
         <p>当前查询渔船总数为: <span class="searchNum"></span> &nbsp;&nbsp;&nbsp;&nbsp;  机构渔船登记总数为: <span class="djShip"></span> &nbsp;&nbsp;&nbsp;&nbsp; 查询渔船占比为: <span class="searchZb"></span> </p>
    </div>
</script>

<script id='org_tbody' type="text/template">

    <? for(var i = 0 ;i<content.length;i++){ ?>
    <tr>
        <td><?= content[i].rownum_ ?></td>
        <td><span  style="cursor: pointer;" onClick=crossLoad(get_root+"/index/main?loadUrl=/ship/org/index?uid=${org.orgcode}&hideType=1",'/ship/index?shipcode=<?=content[i].shipcode?>','<?=content[i].shipname?>')><?= content[i].shipname  ?></span>  </td>
        <td><?= content[i].hostpower1 ?></td>
        <td><?= content[i].shipmaterial ?></td>
        <td><?= content[i].shiplength ?></td>
        <td><?= content[i].jobarea ?></td>
        <td><?= content[i].ownername ?></td>
    </tr>
    <? } ?>
</script>

<script id="org_num" type="text/template">
    <span style="color:#fff;">根据级别查询：</span>
    <div class="layui-inline" style="color:#fff;">
        <div class="width150" style="display: inline-block;">
            <input type="text" id="levelInput" class="shipInput" placeholder="请选择级别" readonly>
            <ul id="levelId" class="hide">
            </ul>
        </div>
    </div>

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="color:#fff;">根据特殊资质查询：</span>
    <div class="layui-inline" style="color:#fff;">
        <div class="width150" style="display: inline-block;">
            <input type="text" id="zzInput" class="shipInput" placeholder="请选择资质" readonly>
            <ul id="zzId" class="hide">
            </ul>
        </div>
    </div>

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="color:#fff;">专业：</span>
    <div class="layui-inline" style="color:#fff;">
        <div class="width150" style="display: inline-block;">
            <input type="text" id="zyInput" class="shipInput" placeholder="请选择资质" readonly>
            <ul id="zyId" class="hide">
            </ul>
        </div>
    </div>

    <button class="layui-btn layui-btn-normal" data-type="reload" id="searchShipName">搜索</button>

    <table id="org_shipContent"  style="table-layout:fixed;font-size:12px;">
        <thead>
        <tr>
            <td>序号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>级别</td>
            <td>证书专业</td>
            <td>特殊资格</td>
            <td>相关学历</td>
        </tr>
        </thead>

        <tbody id="org_ship_table_body">

        </tbody>
    </table>
    <div id="orgShipPageing"></div>
</script>

<script id='org_ship_tbody' type="text/template">
    <? for(var i = 0 ;i<content.length;i++){ ?>
    <tr>
        <td><?= content[i].rownum ?></td>
        <td><span style="cursor: pointer;"onClick  = crossLoad(get_root+"/index/main?loadUrl=/ship/org/index?uid=${org.orgcode}&hideType=1",'/ship/sur/toindex?ycscertnum=<?=content[i].uid?>','<?=content[i].ycsname?>')><?= content[i].ycsname?></span></td>
        <td><?= content[i].birthdate ?></td>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].certMap.level ?>"><?= content[i].certMap.level ?></td>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].certMap.major ?>"><?= content[i].certMap.major ?></td>
        <?  if(content[i].certMap.zxzg == ""){ ?>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].certMap.zxzg ?>">—</td>
        <? } else { ?>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].certMap.zxzg ?>"><?= content[i].certMap.zxzg ?></td>
        <? } ?>
        <?  if(content[i].educertcode1 == ""){ ?>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].educertcode1 ?>">—</td>
        <? } else { ?>
        <td nowrap style="overflow:hidden;text-overflow:ellipsis;" title="<?= content[i].educertcode1 ?>"><?= content[i].certMap.educertcode1 ?></td>
        <? } ?>
    </tr>
    <? } ?>
</script>

<script id="org_fac_num" type="text/template">
    <span style="color:#fff;">根据企业名称查询：</span>
    <div class="layui-inline">
        <input class="layui-input" name="id" id="orgFacId">
        </div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="color:#fff;">根据企业工商注册号查询：</span>
    <div class="layui-inline">
        <input class="layui-input " name="name" id="orgFacName">
        </div>
        <button class="layui-btn layui-btn-normal" data-type="reload" id="searchFacName">搜索</button>

        <table id="org_FacContent"  style="table-layout:fixed;font-size:12px;">
        <thead>
        <tr>
        <td>序号</td>
        <td>名称</td>
        <td>类型</td>
        <td>法人</td>
        <td>成立时间</td>
        <td>注册资金(万元)</td>
        <td>占地面积(亩)  </td>
        </tr>
        </thead>

        <tbody id="org_fac_table_body">

        </tbody>
        </table>
        <div id="orgFacPageing"></div>
</script>
<script id="org_fac_tbody" type="text/template">     2
    <? for(var i = 0 ;i<content.length;i++){ ?>
          <tr>
                <td title='<?= content[i].ROWNUM ?>'><?= content[i].ROWNUM_ ?></td>
                <td title='<?= content[i].ENAME ?>' style="text-align: left !important;"><span style="cursor: pointer" onClick  = crossLoad(get_root+"/index/main?loadUrl=/ship/org/index?uid=${org.orgcode}&hideType=1",'/ship/ent/index?pid=<?=content[i].EID?>','<?= content[i].ENAME ?>')><?= content[i].ENAME ?></span> </td>
                <td title='<?= content[i].ELEVEL ?>'><?= content[i].ELEVEL ?></td>
                <td title='<?= content[i].ELEGAL ?>'><?= content[i].ELEGAL ?></td>
                <td title='<?= content[i].EDATE ?>'><?= content[i].EDATE ?></td>
                <td title='<?= content[i].EMONEY ?>'><?= content[i].EMONEY ?></td>
                <td title='<?= content[i].EAREA ?>'><?= content[i].EAREA ?></td>
          </tr>
    <? } ?>
</script>

<script id="org_repir_num" type="text/template">
    <span style="color:#fff;">根据检测机构名称查询：</span>
    <div class="layui-inline">
        <input class="layui-input" name="id" id="orgRepName">
    </div>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="color:#fff;">根据检测机构注册号查询：</span>
    <div class="layui-inline">
        <input class="layui-input " name="name" id="orgRepId">
    </div>
    <button class="layui-btn layui-btn-normal" data-type="reload" id="searchRipName">搜索</button>
    <table id="org_RipContent"  style="table-layout:fixed;font-size:12px;">
        <thead>
        <tr>
            <td>序号</td>
            <td>名称</td>
            <td>类型</td>
            <td>法人</td>
            <td>成立时间</td>
            <td>注册资金(万元)</td>
            <td>占地面积(亩)</td>
        </tr>
        </thead>
        <tbody id="org_Rip_table_body">

        </tbody>
    </table>
    <div id="orgRipPageing"></div>
</script>
<script id="org_Rip_tbody" type="text/template">
    <? for(var i = 0 ;i<content.length;i++){ ?>
    <tr>
        <td><?= content[i].ROWNUM_ ?></td>
        <td> <span style="cursor: pointer" onClick= crossLoad(get_root+"/index/main?loadUrl=/ship/org/index?uid=${org.orgcode}&hideType=1",'/ship/ent/index?pid=<?=content[i].EID?>','<?= content[i].ENAME ?>')><?= content[i].ENAME ?></span></td>
        <td><?= content[i].ETYPE ?></td>
        <td><?= content[i].ELEGAL ?></td>
        <td><?= content[i].EDATE ?></td>
        <td><?= content[i].EMONEY ?></td>
        <td><?= content[i].EAREA ?></td>
    </tr>
    <? } ?>
</script>

