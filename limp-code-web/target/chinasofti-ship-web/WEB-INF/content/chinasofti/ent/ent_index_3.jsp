
<%--
   菜单管理
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<link rel="stylesheet" href="${style}/css/panel-buildCompany.css" />
<style>
    #nav_intro{
        height:1800px;
    }
    .qylevel{
        margin-top: 34px;
    }

</style>
<div class="container">
    <input type="hidden" class="registnumval" value="${pid}">
    <div style="margin:20px 0px;" class="row">
        <div class="col-md-12">
            <h3 class="title2 company headerTxt" style="font-size:26px;" id="entTitle"></h3>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle qylevel">
                            <span style="font-size: 35px;margin-left: 10%;" class="number" id="entLevel"></span>
                        </p>
                        <p class="textSum" style="margin-top: 10px;">企业分级</p>
                    </div>
                </div>
                <script id="repairBuildCompany" type="text/template">
                    <table id="checkTime" class="inforTable">
                        <thead>
                            <th>标准内容</th>
                            <th>标准</th>
                            <th>评价</th>
                        </thead>
                        <tbody id="tableBody">
                        {{each th1}}
                        <tr>
                            <td>{{$value.detail}}</td>
                            <td>{{$value.standart}}</td>
                            <td>{{$value.entvalue}}</td>
                        </tr>
                        {{/each}}
                        </tbody>
                    </table>
                    <div id="paging"></div>
                </script>
                <script id="repairBuildCompany1" type="text/template">
                    {{each th1}}
                    <tr>
                        <td>{{$value.detail}}</td>
                        <td>{{$value.standart}}</td>
                        <td>{{$value.entvalue}}</td>
                    </tr>
                    {{/each}}
                </script>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="buildShipNums"></span>艘</p>
                        <p class="textSum">建造渔船数(艘)</p>
                    </div>
                </div>
                <script id="buildShip" type="text/template">
                    <div class="col-sm-5">
                        <ul class="nav nav-tabs" role="tablist" class="Tab">
                            <li role="presentation" class="active"><a href="#buildContour" aria-controls="contour" role="tab" data-toggle="tab">船长</a></li>
                            <li role="presentation"><a href="#buildHeadSculpture" aria-controls="headSculpture" role="tab" data-toggle="tab">船体材质</a></li>
                            <li role="presentation"><a href="#buildLable" aria-controls="lable" role="tab" data-toggle="tab">作业区域</a></li>

                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="buildContour" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="buildHeadSculpture" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="buildLable" style="width:350px;height:350px;">

                            </div>

                        </div>
                    </div>
                    <div class="col-sm-7">
                        <table class="checkTime">
                            <thead>
                                <th>船名</th>
                                <th>船长(m)</th>
                                <th>主机功率(kw)</th>
                                <th>建造完工日期</th>
                                <th>完工报告</th>
                            </thead>
                            <tbody id="tableBody2">
                            {{each th1}}
                            <tr>
                                <td>{{$value.shipname}}</td>
                                <td>{{$value.shiplength}}</td>
                                <td>{{$value.power}}</td>
                                <td>{{$value.completdate}}</td>
                                <td class="glyphicon glyphicon-download-alt"><a>下载</a></td>
                            </tr>
                            {{/each}}
                            </tbody>
                        </table>
                        <div id="buildPaging"></div>
                        </table>
                    </div>
                </script>
                <script id="buildShip1" type="text/template">
                    {{each th1}}
                    <tr>
                        <td>{{$value.shipname}}</td>
                        <td>{{$value.shiplength}}</td>
                        <td>{{$value.power}}</td>
                        <td>{{$value.completdate}}</td>
                        <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="{{$value.shipcode}}" class="file-upload-btn">下载</a></td>
                    </tr>
                    {{/each}}
                </script>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="repairTimes"></span>艘次</p>
                        <p class="textSum">维修渔船(艘次)</p>
                    </div>
                </div>
                <script id="repair_Ship" type="text/template">
                    <div class="col-sm-5">
                        <ul class="nav nav-tabs" role="tablist" class="Tab">
                            <li role="presentation" class="active"><a href="#build_contour" aria-controls="contour" role="tab" data-toggle="tab">船长</a></li>
                            <li role="presentation"><a href="#build_headSculpture" aria-controls="headSculpture" role="tab" data-toggle="tab">船体材质</a></li>
                            <li role="presentation"><a href="#build_lable" aria-controls="lable" role="tab" data-toggle="tab">作业区域</a></li>

                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="build_contour" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="build_headSculpture" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="build_lable" style="width:350px;height:350px;">

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-7">
                        <table class="checkTime">
                            <thead>
                            <th>船名 <a style="color: #0B61A4" href="javascript:;" class="repairChoose glyphicon glyphicon-filter"></a></th>
                            <th>船长(m)</th>
                            <th>主机功率(kw)</th>
                            <th>维修时间</th>
                            <th>维修记录</th>
                            </thead>
                            <tbody id="tableBody1">
                            {{each th1}}
                            <tr>
                                <td>{{$value.CSR_SHIPNAME}}</td>
                                <td>{{$value.CS_SHIPLENGTH}}</td>
                                <td>{{$value.CS_POWER}}</td>
                                <td>{{$value.CSR_REPTIME}}</td>
                                <td class="glyphicon glyphicon-download-alt"><a>下载</a></td>
                            </tr>
                            {{/each}}
                            </tbody>
                        </table>
                        <div id="pagination"></div>
                    </div>
                </script>
                <script id="repairShip1" type="text/template">
                    {{each th1}}
                    <tr>
                        <td>{{$value.CSR_SHIPNAME}}</td>
                        <td>{{$value.CS_SHIPLENGTH}}</td>
                        <td>{{$value.CS_POWER}}</td>
                        <td>{{$value.CSR_REPTIME}}</td>
                        <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="{{$value.CSR_ID}}" class="file-upload-btn">下载</a></td>
                    </tr>
                    {{/each}}
                </script>

                <div class="col-sm-6">
                    <div class=" box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id ="rpPoint">0</span>分</p>
                        <p class="textSum">修造企业能力评估(分)</p>
                    </div>
                </div>
                <script id="repairScore" type="text/template">
                    <div class="row lis1">
                        <div class="col-sm-6">
                            <div class="line-chart" style="position:relative;">
                                <div id="qiye_chart" style="width:100%;height:300px;"></div>
                                <div class="fenshu"><strong>{{score}}</strong>分</div>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="panel-group" id="rp_qingkuang">
                                {{each result}}
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#rp_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
                                        </h4>
                                    </div>
                                    <div id="{{$value.id}}" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            {{each ext[$value.id]}}
                                            <p>
                                                <span>{{$value.name}}：</span>({{$value.score*$value.weight}}/{{$value.totalScore}})
                                            </p>
                                            {{/each}}
                                        </div>
                                    </div>
                                </div>
                                {{/each}}
                            </div>
                        </div>
                    </div>

                </script>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01">关键指标</h3>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="buildYear"></span>年</p>

                        <p class="textSum">建厂时间</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="area"></span>万平方米</p>

                        <p class="textSum">占地面积</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="workers"></span>人</p>
                        <p class="textSum">专业技术人员</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="registerMoney"></span>万元</p>
                        <p class="textSum">注册资金</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="box  repairBox detailMsg">
                <h3 class='title01'>基本信息</h3>
                <div class="qiyemsg">
                    <ul class="informationCompany">
                        <li><b>工商注册号：</b><span class="qiyeNumber"></span></li>
                        <li><b>法人代表：</b><span class="personName"></span></li>
                        <li><b>注册资本(万元)：</b><span class="zcMoney"></span></li>
                        <li><b>建造等级：</b><span class="level"></span></li>
                        <li><b>企业统一信用代码：</b><span class="creditcode"></span></li>
                        <li><b>营业期限：</b><span class="bussinessTime"></span></li>
                        <li><b>企业类型：</b><span class="qiyeType"></span></li>
                        <li><b>登记机关：</b><span class="registerAddress"></span></li>
                        <li><b>登记状态：</b><span class="registerStatus"></span></li>
                        <li><b>企业地址：</b><span class="address"></span><a href="#" class="gogis"></a></li>
                        <li><b>联系电话：</b><span class="qiyeTel"></span></li>
                        <li><b>经营范围：</b><span class="manageRange"></span></li>
                        <li><b>营业执照：</b><img id="buildImg" src="../../../../resources/style/images/zhizhao.jpg" alt="营业执照" style="width:30px;height:50px;vertical-align: top;" class="zhizhaoImg"></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box repairBox detailMsg" style="position: relative;">
                <h3 class='title01'>企业展示</h3>
                <div class="qiyezhangshi banner">
                    <ul class="banList" id="raft_banimg">
                        <script id="raft_imgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                            <li><img class="zoomify" src="../../../../resources/style/images/roft-01.jpg"></li>
                            <? } else{  ?>
                            <?for(var i=0;i<picUrl.length;i++){?>
                            <li><img class="zoomify" src="/<?= picUrl[i] ?>"></li>
                            <? }?>
                            <? }?>
                        </script>
                    </ul>
                    <div class="test">测试图片</div>
                    <div class="fomW" >
                        <div class="jsNav" >
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
        <div class="col-sm-6">
            <div class="repairBox box">
                <h3 class="title01">企业建造渔船一次检验合格率</h3>
                <div id="firstBuildPass" style="width: 100%;height: 350px;"></div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="repairBox box">
                <h3 class="title01">渔船维修后首次检验的一次检验合格率</h3>
                <div id="shipFirstPass" style="width: 100%;height: 350px;"></div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="repairBox box">
                <h3 class="title01">企业修造渔船数量统计</h3>
                <ul class="nav nav-tabs" id="companyShipNumTab">
                    <li class="active">
                        <a href="#tab_jd_1" data-toggle="tab"><%--<span class="">2017-2016</span>年--%>建造渔船数量</a>
                    </li>
                    <li>
                        <a href="#tab_jd_2" data-toggle="tab"><%--<span>2017-2016</span>年--%>维修渔船船次数<span></span></a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane in active" id="tab_jd_1">
                        <div id="companyShipNum" style="width: 545px;height: 290px;"></div>
                    </div>
                    <div class="tab-pane" id="tab_jd_2">
                        <div id="paperCheck" style="width: 545px;height: 290px"></div>
                    </div>
                </div>

            </div>
        </div>
        <div class="col-sm-6">
            <div class="repairBox box" id="rbShipImgBody1">
                <script id="repairBuildShipImg" type="text/template">
                <h3 class="title01">示范渔船</h3>
                <h4 class="buildtit">标准渔船型号： <a href="#">桂北渔24088</a></h4>
            <%--示范图片--%>

                <div id="repairBuildShip" class="carousel slide">
                    <ol class="carousel-indicators">
                        <?for(var i=0;i<result.length;i++){?>
                            <?if(i==0){?>
                                <li data-target="#myCarousel1" data-slide-to="<?=i?>" class="active"/>
                            <?}else{?>
                                <li data-target="#myCarousel1" data-slide-to="<?=i?>"/>
                            <?}?>
                        <?}?>

                    </ol>
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                        <?for(var i=0;i<result.length;i++){?>
                            <?if(i==0){?>
                                <div class="active item"><img src="${ctx}/<?=result[i].PICPATH?>" alt=""style="height: 300px;width: 94%">
                                    <div class="carousel-caption">
                                        <h4><a href="page_news_item.html">船名：<?=result[i].SHIPNAME?></a></h4>
                                        <p>船长：<?=result[i].SHIPLENGTH?> </p>
                                    </div>
                                </div>
                            <?}else{?>
                                <div class="item"><img src="${ctx}/<?=result[i].PICPATH?>" alt=""style="height: 300px;width: 94%">
                                    <div class="carousel-caption">

                                        <h4><a href="page_news_item.html">船名：<?=result[i].SHIPNAME?></a></h4>

                                        <p>船长：<?=result[i].SHIPLENGTH?> </p>

                                    </div>
                                </div>
                            <?}?>
                        <?}?>
                    </div>
                    <!-- Carousel nav  -->
                    <a class="carousel-control left" href="#repairBuildShip" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>

                    </a>
                    <a class="carousel-control right" href="#repairBuildShip" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>

                    </a>
                </div>
                </script>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>
<script src='${script}/chinasofti/ent/buildcompanyPanel.js'></script>
<script type="text/javascript" src="${ctx}/systemsite/plug/js-utils/count-number.js"></script>