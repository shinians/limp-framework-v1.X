<%--
  Created by IntelliJ IDEA.
  User: icss
  Date: 2017/8/30
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<link rel="stylesheet" href="${plug}/js-utils/ssmk.css">
<link rel="stylesheet" href="${ctx}/resources/style/css/panel-searchindex.css">
<link rel="stylesheet" href="${ctx}/resources/style/css/panel-searchResult.css">
<style>
    /*定义选中的样式*/
    .r-active{
        color:#086a9d;
        font-weight: bold;
        border-bottom: 1px solid #086a9d;
    }

    .nameTit{
        font-weight: bold;
    }
    /*分页选中事件*/
    .page-active{
        background-color: #009CFF !important;
        color: #fff !important;
    }
    /*ssmk1样式*/
    #foraspcn1{
        width: 82% !important;
        left: -27px !important;
        top: 37px !important;
        border: 1px solid #e5e5e5;
        box-shadow: 2px 3px 8px rgba(224,225,223,1);
    }
    #foraspcn1 li:first-child{
        -webkit-border-radius:0px;
        -moz-border-radius:0px;
        border-radius:0px;
    }
</style>
<div class="container searchResult">

    <div class="row">
        <%--左侧logo取消 revised on 10.12--%>
        <div class="col-sm-3" style="padding-right: 0px;">
            <%--局徽--%>
            <div class="row">
                <div class="col-sm-3" style="text-align: left;    padding-right: 0px;">
                    <img src="${ctx}/resources/style/images/juhui02.png" alt="船检局徽" class="shipSearchIcon" style="margin: 26px auto 0px;">
                </div>
                <div class="col-sm-7" style="padding: 0px 0px 0px 5px;">
                    <h1 class="searchTit" >智慧船检</h1>
                </div>
            </div>
        </div>
        <div class="col-sm-7 zhihui" >
            <div class="row" style="margin:10px 0px 0px -53px;">
              <%--  <div class="searchResAll" style="width: 11%;">
                    <div class="radioBox radioOn">
                        <input type="radio" value="">
                    </div>
                    <span class="radioName searchWord r-active" data-type=" ">全部</span>
                </div>--%>
                <div class="searchResKeyWords" style="width: 82%;">
                  <div class="col-sm-2" style="text-align: right;"><span class="searchWord r-active" data-type="">全部</span></div>
                    <%--   <div class="col-sm-2"><span class="searchWord" data-type="1">检验机构</span></div>
                     <div class="col-sm-2"><span class="searchWord"data-type="3">企业信息</span></div>
                     <div class="col-sm-2"><span class="searchWord"data-type="4">渔船信息</span></div>
                     <div class="col-sm-2"><span class="searchWord"data-type="2">验船师</span></div>
                     <div class="col-sm-2"><span class="searchWord"data-type="5">产品信息</span></div>--%>

                    <div class="col-sm-2"><span class="searchWord" data-type="1">检验机构</span></div>
                    <div class="col-sm-2"><span class="searchWord"data-type="2">验船师</span></div>
                    <div class="col-sm-2"><span class="searchWord"data-type="4">渔业船舶</span></div>
                    <div class="col-sm-2"><span class="searchWord"data-type="5">船用产品</span></div>
                    <div class="col-sm-2"><span class="searchWord"data-type="6">设计图纸</span></div>
                    <%--<div class="col-sm-2"><span class="searchWord"data-type="3">涉渔企业</span></div>--%>
                </div>
                <div class="searchResKeyWords sheyu"data-type="3" style="width:70px; line-height: 18px;">涉渔企业</div>
            </div>
            <div class="row">
                <%--<div class="col-sm-2"></div>--%>
                <div class="col-sm-11 searchBox">
                    <span  id="ssxlmk1">
                        <input id="keyWord1" name="key"  type="text" placeholder="" class="findResBox" autocomplete="off">
                        <button class="find" id="btn_submit"></button>
                        <%--<span class="input-group-btn">--%>
                          <%--<button class="btn btn-default btn-search" type="submit">搜索</button>--%>
                        <%--</span>--%>
                    </span>

                </div>

                <%--<div class="col-sm-2"></div>--%>
            </div>
        </div>
    </div>
    <%--搜索内容--%>
    <div class="row">
        <div class="col-sm-9">
            <div class="detailRes">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="detailTit">
                            <div class="matchNum">
                                <i class="matchDown"></i>找到相关结果 <span id="result-num">1200</span> 个
                            </div>
                            <div class="clickRate">
                                <i class="rate"></i> | <span>点击率</span>
                            </div>
                            <div class="collect">
                                <i class="collectIcon"></i> | <span>收藏</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row" style=" padding: 12px 33px;">
                    <ul class="detailList" id="detailList">
                        <%--机构展示--%>
                        <li class="detailLis">
                            <ul class="inspection">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</span><span class="conWidth1">05225927</span>
                                </li>
                                <li>
                                    <%--<i class="insProvince"></i>--%>
                                    <span class="nameTit">地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：</span><span class="conWidth2">浙江省宁波市</span>
                                </li>
                                <li>
                                    <%--<i class="insFax"></i>--%>
                                    <span class="nameTit">传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;真：</span><span class="conWidth3">05225927</span>
                                </li>
                                <li>
                                    <%--<i class="insGrade"></i>--%>
                                    <span class="nameTit">能力得分：</span><span class="conWidth4">89分</span>
                                </li>
                            </ul>
                        </li>
                            <%--验船师检验--%>
                        <li class="detailLis">
                            <ul class="checker">
                                <li class="keyAttr">
                                    <%--男：male 女：female--%>
                                    <i class="checkerFemale"></i>
                                    <span>朱发银</span>
                                </li>
                                <li>
                                    <%--<i class="checkerAdress"></i>--%>
                                    <span class="nameTit">工作单位：</span><span class="conWidth1">浙江省渔业船舶检验局 </span>
                                </li>
                                <li>
                                    <%--<i class="checkerLevel"></i>--%>
                                    <span class="nameTit">级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</span><span class="levels conWidth2" title="">高级验船师、中级验船师</span>
                                </li>
                                <li>
                                    <%--<i class="insGrade"></i>--%>
                                    <span class="nameTit">能力得分：</span><span class="conWidth3">89分</span>
                                </li>
                            </ul>
                        </li>
                        <%--渔船展示--%>
                        <li class="detailLis">
                            <ul class="shipShow">
                                <li class="keyAttr">
                                    <i class="shipName"></i>
                                    <span>浙岱渔4566</span>
                                </li>
                                <li>
                                    <%--<i class="thisNmuber"></i>--%>
                                    <span class="nameTit">渔船编码：</span><span class="conWidth1">3310811994120004</span>
                                </li>
                                <li>
                                    <%--<i class="insSite"></i>--%>
                                    <span class="nameTit">渔船归属：</span><span class="conWidth2">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <%--<i class="checkerFemale checkerMale"></i>--%>
                                    <span class="nameTit">渔船船东：</span><span class="conWidth3">企业/个人 </span>
                                </li>
                                <li>
                                    <%--<i class="insGrade"></i>--%>
                                    <%--名称待定--%>
                                    <span class="nameTit">安全指数：</span><span class="conWidth4">90 </span>
                                </li>

                            </ul>
                        </li>
                        <%--产品展示--%>
                        <li class="detailLis">
                            <ul class="productShow">
                                <li class="keyAttr">
                                    <i class="productName"></i>
                                    <span>气胀式救生筏</span>
                                </li>
                                <li>
                                    <%--<i class="insSite"></i>--%>
                                    <span class="nameTit">制造企业：</span><span class="conWidth1">宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <%--<i class="thisNmuber"></i>--%>
                                    <span class="nameTit">产品编号：</span><span class="conWidth2">7842229382</span>
                                </li>
                                <li>
                                    <%--<i class="thisNmuber"></i>--%>
                                    <span class="nameTit">证书编号：</span><span class="conWidth3">ZT849322</span>
                                </li>

                            </ul>
                        </li>
                        <%--企业展示--%>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                        <li class="detailLis">
                            <ul class="companyShow">
                                <li class="keyAttr">
                                    <i class="insSite"></i>
                                    <span>宁波振华救生设备有限公司</span>
                                </li>
                                <li>
                                    <span class="nameTit">所属机构：</span><span class="conWidth1">浙江渔业船舶检验局</span>
                                </li>
                                <li>
                                    <span class="nameTit">认可截止：</span><span class="conWidth2">2019年12月4日</span>
                                </li>
                                <li>
                                    <span class="nameTit">负责人：</span><span class="conWidth3">吴迪</span>
                                </li>
                                <li>
                                    <span class="nameTit">联系电话：</span><span class="conWidth4">13345783343 </span>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <%--分页--%>
                <div class="row" style="padding-right: 33px;margin-top: -5px;">
                    <div id="paging">
                        <div class="layui-box layui-laypage layui-laypage-default" id="paging-list">

                            <a href="javascript:;"class="page-active" data-page="1">1</a>
                            <a href="javascript:;" data-page="2">2</a>
                            <a href="javascript:;" data-page="3">3</a>
                            <a href="javascript:;" data-page="4">4</a>
                            <a href="javascript:;" data-page="5">5</a>
                            <a href="javascript:;" data-page="5">…</a>
                            <a href="javascript:;" data-page="5">尾页</a>
                        </div>
                    </div>
                </div>
                <input type="hidden" id="pageId" value="1"/>
            </div>
        </div>
        <div class="col-sm-3">
            <div class="ranking">
                <div class="row">
                    <%--最新能力评估排名--%>
                    <div class="col-sm-12">
                        <div class="newRanking">
                            <div class="newTit">
                                <i class="newTitIcon"></i>
                                <h4>最新能力评估排名</h4>
                            </div>
                            <ul class="newRankingItem">
                                <%--<li>--%>
                                    <%--<span class="rankingNum">1</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">2</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">3</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">4</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                            </ul>
                            <div class="moreRanking"><a href="#"></a></div>
                        </div>
                    </div>
                    <%--最热门搜索排名--%>
                    <div class="col-sm-12">
                        <div class="hotRanking">
                            <div class="hotTit">
                                <i class="newTitIcon"></i>
                                <h4>最新热门搜索排名</h4>
                            </div>
                            <ul class="hotRankingItem">
                                <%--<li>--%>
                                    <%--<span class="rankingNum">1</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">2</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">3</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<span class="rankingNum">4</span>--%>
                                    <%--<span class="rankingCon">能力评估第一名能力评估第一名</span>--%>
                                <%--</li>--%>
                            </ul>
                            <div class="moreRanking"><a href="#"></a></div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</div>
<script>
//    $('.container').css('height',$(window).height()-100);
   var  key='${key}';
   var type='${type}';
    $('#footer').css('display','none');
    $('.container').css('min-height',$(window).height());
</script>
<script src='${script}/chinasofti/search/search_result.js'></script>
<script type="text/javascript" src="${plug}/js-utils/ssmk.js"></script>

