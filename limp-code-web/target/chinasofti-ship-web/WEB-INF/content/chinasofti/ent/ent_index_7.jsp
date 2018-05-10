
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
<style>
    .title02{
        margin: 16px 0px 16px 25px;
        color: #fff;
        font-size: 26px;
    }
    .fomW {
        bottom: 25px;
        width: 100%;
        margin-left: 0px;
    }
    .time{
        height:426px;
    }
    .wrapper-t {
        background-position: -4px 194px;
    }
    .information>li b, .information01>li b{
        min-width: 126px;
    }
    .checkcompany {
        margin: 20px;
        overflow: hidden;
        height: 300px;
    }

    .jcbanList li {
        height: 100%;
        width: 81%;
        margin-left: 5px;
        opacity: 0;
        transform: scale(0);
        transition: transform 0.5s ease 0s, opacity 1.5s ease 0s;
        z-index: 1;
        position: absolute;
    }

    .jcbanList li img {
        height: 300px;
        width: 100%;
    }
    .title03{
        margin: 14px 20px;
        color: #fff;
        font-size: 20px;
    }
    .title01{
        margin-bottom: 0px;
    }

    .jcbanList li .active {opacity:1;transform:scale(1);z-index:2;}
    .wrapper-t{
        background-position:-4px 180px;
    }
    #tab_jd_1 td,#tab_jd_2 td{
        width: 125px;
        height: 30px;
        font-size: 12px;
        padding: 0px;
        text-align: center;
        color: #53B2E5;
        white-space:nowrap;
        overflow: hidden;
        text-overflow: ellipsis;
    }
    .choucha .nav{
        width:100%;
    }
    #chouchaTab li{
       float:left;
    }
    #chouchaTab .active{
        border:0;
    }
    #jiance_datetimepicker1, #jiance_datetimepicker2 {
        width: 110px;
    }
    #jiance_datetimepicker1 .form-control, #jiance_datetimepicker2 .form-control {
        width: 70px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #jiance_datetimepicker1 .input-group-addon, #jiance_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
    }
    <%--小时间轴--%>

    .content-t1{
        width: 200px;
        height: 178px;
        /*background: url(../images/time-bg.png) 0px 0px no-repeat;*/
        position: absolute;
        top: 20px;
        left: 100px;
        background-size: 100% 100%;
    }
    .content-t2{
        width: 200px;
        height: 178px;
        /*background: url(../images/time-bg2.png) 0px 0px no-repeat;*/
        position: absolute;
        bottom: 26px;
        left: 190px;
        background-size: 100% 100%;
    }
    .content-con, .content-con2{
        margin: 10px 0px 0px 25px;
    }
    .content-t2-name{
        margin: 40px 0px 0px 35px;
    }
    .t-go, .t-back{
        top:226px;
    }
    .btn-time{
        margin: 5px;
    }
    #banimg li.active {
        opacity: 1;
        transform: scale(1);
        z-index: 2;
    }
    .xiangqingTitle{
        width: 99px;
        text-align: right;
        display: inline-block;
    }
    .xiangqingCon{
        display: inline-block;
        width: 140px;
        vertical-align: top;
    }

</style>

<input class="registnumval" value="${pid}" hidden="hidden"/>
<div class="container">
    <div style="margin:30px 0px 30px 0px;" class="row">
        <div class="col-md-12">
            <div class="layui-breadcrumb" id="bread">

            </div>
            <h3 class="title2 jiance_company headerTxt"></h3>
            <span class="status">认可有效期内</span>
        </div>
    </div>
    <!--企业关键指标-->
    <div class="row">
        <div class="col-sm-3">
            <div class="row">
                <div class="col-sm-12">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number jiance_repairCount"></span>只</p>
                        <p class="textSum">累计检测产品数量(只)</p >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number jiance_onShipCount" id="jiance_capability">{{score}}</span>分</p>
                        <p class="textSum">企业能力评估(分)</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-3">
            <div class="box01 box" style="height:320px;">
                <img src="" style="width: 100%;height: 100%" alt="资质证书" id="certificate" class="zoomify">
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01">关键指标<b class="iconSum" style='margin-top: 5px;margin-right:10px;left:247px;'></b></h3>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number setdate">2004.08</span></p>
                        <p class="textSum">成立时间</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number workesnum">2000</span>㎡</p>
                        <p class="textSum">场地面积</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number certwokernum">19</span>人</p>
                        <p class="textSum">持证技术人员</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number productTypes">7</span>个</p>
                        <p class="textSum">检测产品型式</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--结束 企业关键指标-->
    <%--开始 检测机构--%>
    <div class="row">
        <div class="col-sm-3">
            <div class="box box01" style="min-height: 426px;position: relative;">
                <h3 class='title02'>基本信息 </h3>
                <div class="checkcompany">

                    <ul class="jcbanList banList" id="jiance_banimg">
                        <script id="jiance_imgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                                 <li><img class="zoomify" src="../../../../resources/style/images/jiancejg-01.png"></li>
                            <? } else{  ?>
                            <?for(var i=0;i<picUrl.length;i++){?>
                                <li><img class="zoomify" src="/<?= picUrl[i] ?>"></li>
                            <? }?>
                            <? }?>
                        </script>
                    </ul>
                    <div class="fomW">
                        <div class="jsNav">
                            <a href="javascript:;" class="trigger current"></a>
                            <a href="javascript:;" class="trigger"></a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!--认可历程-->
        <div class="col-sm-9" style="padding-right:5px;">
            <div class="time">
                <div class="title03">认可历程</div>
                <div class="wrapper-t">
                    <div class="content-t"></div>
                </div>
                <div class="t-back"></div>
                <div class="t-go"></div>
            </div>
        </div>
    </div>

    <!--弹出层-->
    <div id='view1' class='hide'></div>
    <ul class="lay">
        <script type="text/template" id="jcnum">
            <li class="personTable" id="lisOne">
                <!--弹出层1 累计检测产品数量-->
                <div class="row">
                    <div class="col-sm-6" style="width:45%;">
                        <div class="shijianduan">
                            <!--起止时间-->
                            <div class="kaishi form-group">
                                <label>选择开始时间：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='jiance_datetimepicker1'>
                                    <input type='text' class="form-control" value="2015-01" id="jiance_startT" />
                                    <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                                </div>
                            </div>
                            <!--结束时间-->
                            <div class="jieshu">
                                <label>选择结束时间：</label>
                                <div class='input-group date' id='jiance_datetimepicker2'>
                                    <input type='text' class="form-control" value="2016-01" id="jiance_endT" />
                                    <span class="input-group-addon">
							   		<span class="glyphicon-calendar"></span>
							  	</span>
                                </div>
                            </div>
                        </div>
                        <div id="xingshiChart" style="width:500px;height: 300px;"></div>
                    </div>
                    <div class="col-sm-6" style="width:55%;">
                        <div class="choucha">
                            <ul class="nav" id="chouchaTab">
                                <li class="active">
                                    <a href="#jiance_tab_jd_1" data-toggle="tab">型式认可检测<span></span></a>
                                </li>
                                <li>
                                    <a href="#jiance_tab_jd_2" data-toggle="tab">产品装船后检测<span></span></a>
                                </li>
                            </ul>
                            <div class="tab-content" style="width:100%;">
                                <div class="tab-pane active" id="jiance_tab_jd_1">
                                    <table class="checkTime">
                                        <thead>
                                        <tr style="border-top:0;border-bottom:0;">
                                            <td>序号</td>
                                            <td>检测时间</td>
                                            <td>产品名称</td>
                                            <td>产品编号</td>
                                            <td>检测报告</td>
                                        </tr>
                                        </thead>
                                        <tbody id="checkOrg_body1">
                                        <%--{{each xingshiPager.dataList}}
                                        <tr>
                                            <td>{{$index+1}}</td>
                                            <td>{{$value.checktime}}</td>
                                            <td>{{$value.rc1}}</td>
                                            <td>{{$value.productnum}}</td>
                                            <td>下载</td>
                                        </tr>
                                        {{/each}}--%>
                                        </tbody>
                                    </table>
                                    <%--分页--%>
                                    <div id="checkOrg_pagination1"></div>
                                </div>
                                <div class="tab-pane" id="jiance_tab_jd_2">
                                    <table class="checkTime">
                                        <thead>
                                        <tr style="border-top:0;border-bottom:0;">
                                            <td>序号</td>
                                            <td>检测时间</td>
                                            <td>产品名称</td>
                                            <td>产品编号</td>
                                            <td>安装渔船</td>
                                            <td>检测报告</td>
                                        </tr>
                                        </thead>
                                        <tbody id="checkOrg_body2">
                                        <%--{{each checkAfterShip.dataList}}
                                        <tr>
                                            <td>{{$index+1}}</td>
                                            <td>{{$value.checktime}}</td>
                                            <td>{{$value.rc1}}</td>
                                            <td>{{$value.productnum}}</td>
                                            <td>{{$value.shipname}}</td>
                                            <td>下载</td>
                                        </tr>
                                        {{/each}}--%>
                                        </tbody>
                                    </table>
                                    <%--分页--%>
                                    <div id="checkOrg_pagination2"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="checkOrg_template1">
            {{each dataList}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.checktime}}</td>
                <td>{{$value.rc1}}</td>
                <td>{{$value.productnum}}</td>
                <td>下载</td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="checkOrg_template2">
            {{each dataList}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.checktime}}</td>
                <td>{{$value.rc1}}</td>
                <td>{{$value.productnum}}</td>
                <td>{{$value.shipname}}</td>
                <td>下载</td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="pinggu">
            <li class="personTable act" id="lisTwo">
                <!--弹出层2 企业能力评估-->
                <div class="row">
                    <div class="span6 radar">
                        <div class="line-chart" style="position:relative;">
                            <div id="qiye_chart"></div>
                            <div class="fenshu"><strong>{{score}}</strong>分</div>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="panel-group" id="jiance_qingkuang">
                            {{each result}}
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#jiance_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
            </li>
        </script>
        <script type="text/template" id="jibenmsg">
            <li class="lis1 act" id="lisThree">
                <%--<div class="col-md-12 box box02" style="height: 320px;">--%>
                    <div class="qiyemsg">
                        <ul class="information">
                            <li><b>机构名称：</b><span>{{entname}}</span></li>
                            <li><b>机构地址：</b><span> {{address}}</span></li>
                            <li><b>企业认可有效期：</b><span>{{certterm}}</span></li>
                            <li><b>法人代表：</b><span>{{legal}}</span></li>
                            <li><b>联系人：</b><span>{{legal}}</span></li>
                            <li><b>联系电话：</b><span> {{tel}}</span></li>
                            <li><b>企业经营业务范围：</b><span style="width: 71%;white-space: normal; vertical-align: top;">{{scope}}</span></li>
                        </ul>
                    </div>
                <%--</div>--%>
            </li>
        </script>
    </ul>
    <!--end 弹出层-->
    <!--查看详情弹出窗-->
    <script type="text/template" id="detection_xiangqing">
        <div class="xiangqing">
            <p><span class="xiangqingTitle">企业名称：</span><span class="xiangqingCon">{{entname}}</span></p>
            <p><span class="xiangqingTitle">证书编号：</span><span class="xiangqingCon">{{id}}</span></p>
            <p><span class="xiangqingTitle">型式数量：</span><span class="xiangqingCon">{{uid}}</span></p>
            <p><span class="xiangqingTitle">有效期：</span><span class="xiangqingCon">{{checktimenext}}</span></p>
        </div>
    </script>
    <script src='${script}/chinasofti/ent/jiancejigou.js'></script>
    <script src='${script}/chinasofti/bi/bi_option.js'></script>
    <%--<script type="text/template" id="listByPageCopy">--%>
        <%--{{each dataList}}--%>
        <%--<tr>--%>

            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
            <%--<td>{{$value.entname}}</td>--%>
        <%--</tr>--%>
        <%--{{/each}}--%>
    <%--</script>--%>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
