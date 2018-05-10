<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页面</title>
    <link href="${bt}/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${style}/chinasofti/css/theme.css" />
    <script src='${echarts}/echarts.min.js'></script>
    <link rel="stylesheet" href="${style}/chinasofti/css/mainPanel.css">
</head>
<body style="background:url('${ctx}/resources/style/images/bg.png') top center no-repeat; ">
    <div class="container-fluid">
    <div style="height: 90px;margin-top: 30px;" class="row" >
        <div class="col-md-12">
            <div class="col-md-3">
                <h3 style="margin-left: 0px" class="title01">河北渔业船舶检验局</h3>
            </div>
            <div class="col-md-9">
                <div class="col-md-4">
                    <b class="searchIcon"></b>
                    <input class="search" placeholder="请输入搜索内容" type="search">
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="col-md-6 box01 box">
                <p class="margin35"><b class="iconSum"></b></p>
                <p class="numberColor"><span class="number">98</span>%</p>
                <p class="textSum">检验工作完成率</p>
            </div>
            <div class="col-md-6 box01 box">
                <p class="margin35"><b class="iconSum"></b></p>
                <p class="numberColor"><span class="number">89</span>%</p>
                <p class="textSum">验船师匹配度</p>
            </div>
            <div class="col-md-6 box01 box">
                <p class="margin35"><b class="iconSum"></b></p>
                <p class="numberColor"><span class="number">56</span></p>
                <p class="textSum">辖区内机构总数</p>
            </div>
            <div class="col-md-6 box01 box">
                <p class="margin35"><b class="iconSum"></b></p>
                <p class="numberColor"><span class="number">88</span></p>
                <p class="textSum">检验机构能力评估(分)</p>
            </div>
        </div>
        <div  class="col-md-6">
            <div class="col-md-12 box02 box">
                <h3 class="title01">机构关键指标</h3><b class="iconBig"></b>
                <div class="col-md-6">
                    <p class="numberColor"><span class="number">143</span>艘</p>
                    <p class="textSum">渔船数量</p>
                </div>
                <div class="col-md-6">
                    <p class="numberColor"><span class="number">56</span>人</p>
                    <p class="textSum">验船师人数</p>
                </div>
                <div class="col-md-6">
                    <p class="numberColor"><span class="number">12</span>家</p>
                    <p class="textSum">修造企业数量</p>
                </div>
                <div class="col-md-6">
                    <p class="numberColor"><span class="number">34</span>家</p>
                    <p class="textSum">产品维修机构数量</p>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="col-md-12 box box02">
                <h3 class='title01'>检验机构信息</h3><b class="iconBig"></b>
                <div>
                    <ul class="information" id="org-info">
                        <li><b>机构名称：</b><span>河北省渔业船舶检验局</span></li>
                        <li><b>单位性质：</b><span>参照公务员管理</span></li>
                        <li><b>职能类型：</b><span>独立机构</span></li>
                        <li><b>业务类别：</b><span>内核机构</span></li>
                        <li><b>是否边境：</b><span>否</span></li>
                        <li><b>是否"中"字头：</b><span>否</span></li>
                        <li><b>批复文号：</b><span>35658555</span></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="col-md-12 box box02">
                <h3 class='title01'>机构展示</h3><b class="iconBig"></b>
                <div class="banner">
                    <ul class="banList">
                        <li class="active"><img src="${style}/images/ins01.jpg"/></li>
                        <li><img src="${style}/images/ins02.jpg"/></li>
                        <li><img src="${style}/images/ins01.jpg"/></li>
                        <li><img src="${style}/images/ins02.jpg"/></li>
                    </ul>
                    <div class="fomW">
                        <div class="jsNav">
                            <a href="javascript:;" class="trigger current"></a>
                            <a href="javascript:;" class="trigger"></a>
                            <a href="javascript:;" class="trigger"></a>
                            <a href="javascript:;" class="trigger"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">

        </div>
    </div>
</div>
<script src='${script}/chinasofti/org/mainPanel.js'></script>
<script src='${script}/chinasofti/org/org_index.js'></script>
<script type="text/javascript">
    $(function(){
        $(".banner").swBanner();
    });

</script>
</body>
</html>