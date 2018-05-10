
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
<%--<head>--%>
    <%--<link rel="stylesheet" href="${style}/css/gmdss-panel.css"/>--%>
<%--</head>--%>

<input class="registnumval" value="${pid}" hidden="hidden"/>
<style>
    #nav_intro{
        height:150%;
    }
    .container{
        margin-bottom:5%;
    }
    .fomW{
        left: 108%;
    }
    /*测试图片样式*/
    .test{
        position: absolute;
        top: 0px;
        right: 4%;
        color:white;
        z-index: 10;
        font-weight: bolder;
    }
    #chouchaTab .active{
        border-right: 1px solid rgb(18, 44, 91);
        margin-right: -1px;
    }
    .file-upload-btn{
        color:#53B2E5;
    }
    .checkTime>tbody tr td{
        border-top: 0;
        border-bottom: 0;
    }
    /*2017.8.17 by meng*/
    #GMDSS_datetimepicker1, #GMDSS_datetimepicker2 {
        width: 110px;
    }
    #GMDSS_datetimepicker1 .form-control, #GMDSS_datetimepicker2 .form-control {
        width: 70px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #GMDSS_datetimepicker1 .input-group-addon, #GMDSS_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
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
<div class="container">
    <div style="margin:20px 0px;" class="row">
        <div class="col-md-12" style="padding-left:0;">
            <div class="layui-breadcrumb" id="bread">

            </div>
            <h3 class="title2 company headerTxt" style="font-size:26px;"></h3>
            <span class="status">认可有效期内</span>
        </div>
    </div>
    <!--四项指标-->
    <div class="row">
        <div class="col-sm-6">
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number repairCount" ></span>只</p>
                        <p class="textSum">维修GMDSS设备(只)</p >
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number onShipCount"></span>只</p>
                        <p class="textSum">质保期GMDSS数量(只)</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number percentOfPass"></span>%</p>
                        <p class="textSum">监督抽查合格率(%)</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="GMDSS_capability">0</span>分</p>
                        <p class="textSum">企业能力评估(分)</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01" style="margin-bottom: 0px">关键指标</h3>
                <div class="row">
                    <div class="col-sm-6">

                        <p class="numberColor numberStyle"><span class="number setdate" ></span></p>

                        <p class="textSum">成立时间</p>
                    </div>
                    <div class="col-sm-6">

                        <p class="numberColor numberStyle"><span class="number workesnum"></span>㎡</p>

                        <p class="textSum">场地面积</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">

                        <p class="numberColor numberStyle"><span class="number certwokernum"></span>人</p>

                        <p class="textSum">持证技术人员</p>
                    </div>
                    <div class="col-sm-6">

                        <p class="numberColor numberStyle"><span class="number productTypes"></span>个</p>

                        <p class="textSum">维修产品型式</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--结束 四项指标-->
    <!--企业相关信息-->
    <div class="row">
        <div class="col-sm-6">
            <div class="box repairBox detailMsg">
                <h3 class='title01'>基本信息</h3>
                <div class="qiyemsg">
                    <ul class="information">
                        <li><b>企业名称：</b><span class="qiyeName"></span></li>
                        <li><b>地址：</b><span class="address"></span><a href="#" class="gogis"></a></li>
                        <li><b>企业成立时间：</b><span class="foundTime"></span></li>
                        <li><b>企业认可时间：</b><span class="acceptTime"></span></li>
                        <%--新增项：信用代码--%>
                        <li><b>企业统一信用代码：</b><span class="gmdssUniCode"></span></li>
                        <li><b>认可证书有效期：</b><span class="approvalTime"></span></li>
                        <li><b>法人代表：</b><span class="personName"></span></li>
                        <li><b>法人代表电话：</b><span class="personTel"></span></li>
                        <li><b>企业邮编：</b><span class="postNum"></span></li>
                        <li><b>企业邮箱：</b><span class="qiyeEmail"></span></li>
                        <li><b>注册资本(万元)：</b><span class="zcMoney"></span></li>
                        <li><b>登记机关：</b><span class="registerAddress"></span></li>
                        <li><b>经营范围：</b><span class="manageRange"></span></li>
                        <%--新增项：执照--%>
                        <li><b>营业执照：</b><img id="gmdssImg" src="../../../../resources/style/images/zhizhao.jpg" alt="执照" style="width:30px;height:50px;vertical-align: top;" class="zhizhaoImg zoomify"></li>

                    </ul>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box repairBox detailMsg" >
                <h3 class='title01'>企业展示</h3>
                <div class="qiyezhangshi banner">
                    <ul class="banList" id="GMDSS_banimg">
                        <script id="GMDSS_imgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                            <li><img class="zoomify" src="../../../../resources/style/images/gmdss-01.jpg"></li>
                            <? } else{  ?>
                            <?for(var i=0;i<picUrl.length;i++){?>
                            <li><img class="zoomify" src="/<?= picUrl[i] ?>"></li>
                            <? }?>
                            <? }?>
                        </script>
                    </ul>
                    <div class="test">测试图片</div>
                    <div class="fomW">
                        <div class="jsNav">
                            <%--<script id="jsNav" type="text/template">--%>
                            <%--{{each fomW}}--%>
                            <%--<a href="javascript:;" class="trigger"></a>--%>
                            <%--{{/each}}--%>
                            <%--</script>--%>
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
    <!--认可历程-->
    <div class="row">
        <div class="col-md-12" style="padding-right:5px;">
            <div class="time">
                <div class="title01">认可历程</div>
                <div class="wrapper-t">
                    <div class="content-t"></div>
                </div>
                <div class="t-back"></div>
                <div class="t-go"></div>
            </div>
        </div>
    </div>
    <!--抽查+客户评价-->
    <div class="row">
        <!--抽查-->
        <div class="col-sm-6">
            <div class="box repairBox" style="height:430px" >
                <div class="title01" style="margin:18px 30px;">客户评价分析图</div>
                <div id="choucha" style="width:100%;height:280px;"></div>
            </div>
        </div>
        <!--客户评价-->
        <div class="col-sm-6">
            <div class="box repairBox" style="min-height:346px;">
                <div class="title01" style="margin:18px 30px;">客户评价</div>
                <div class="kehuCon">
                    <ul class="nav nav-tabs" id="kehuTab">
                        <li class="active sayall">
                            <a href="#allping" data-toggle="tab">全部评价</a>
                        </li>
                        <li class="sayyes">
                            <a href="#haoping" data-toggle="tab">好评</a>
                        </li>
                        <li class="sayno">
                            <a href="#chaping" data-toggle="tab">差评</a>
                        </li>
                    </ul>
                    <div id="kehuContent" class="tab-content" style="width:100%;">
                        <div class="tab-pane fade in  active" id="allping">
                        </div>
                        <div class="tab-pane fade " id="haoping">
                        </div>
                        <div class="tab-pane fade " id="chaping">
                        </div>
                    </div>
                    <div id="gmdssPagination"/>
                    <script id="commentTemplate" type="text/template">
                        <ul class="scrollercon" >
                            <? for(var i=0;i<commentList.length;i++){?>
                            <li class="scrolllis">
                                <? if(commentList[i].commcate=='1'){  ?>
                                    <div class="constatus"></div>
                                <? }else{?>
                                    <div class="constatus constatus2"></div>
                                <? }?>
                                <div class="scrolltit"><?=commentList[i].content?></div>
                                <span class="scrollfrom"><?=commentList[i].entname?></span>
                                <date class="date"><?=commentList[i].commtime?></date>
                            </li>
                            <?}?>
                        </ul>
                    </script>
                </div>
            </div>
        </div>
    </div>
    <!--弹出层-->
    <div id='GMDSS_view1' class='hide'></div>
    <ul class="lay">
        <script type="text/template" id='GMDSS_layOne'>
            <li class="personTable" id="GMDSS_lisOne">
                <!--弹出层1 维修GMDSS数量-->
                <div class="row">
                    <div class="col-sm-6" style="width:38%;">
                        <div class="shijianduan">
                            <!--起止时间-->
                            <div class="kaishi form-group">
                                <label>选择开始时间：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='GMDSS_datetimepicker1'>
                                    <input type='text' class="form-control" value="2015-01-12" id="GMDSS_startT" />
                                <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                                </div>
                            </div>
                            <!--结束时间-->
                            <div class="jieshu">
                                <label>选择结束时间：</label>
                                <div class='input-group date' id='GMDSS_datetimepicker2'>
                                    <input type='text' class="form-control" value="2015-01-13" id="GMDSS_endT" />
                                <span class="input-group-addon">
							   		<span class="glyphicon-calendar"></span>
							  	</span>
                                </div>
                            </div>
                        </div>
                        <div class="line-chart">
                            <!--图表-->
                            <div id="main6" style="width:430px;height:300px;margin:auto;"></div>
                        </div>
                    </div>
                    <div class="col-sm-6" style="width:62%;padding:0px;">
                        <div class="biao">
                            <table class="checkTime">
                                <thead>
                                <tr>
                                    <td>序号</td>
                                    <td>船名</td>
                                    <td>产品名称</td>
                                    <td>产品编号</td>
                                    <td>检修时间</td>
                                    <td>下次检修</td>
                                    <td>检修记录</td>
                                </tr>
                                </thead>
                                <tbody id='tableBody'>
                                {{each dataList.dataList}}
                                <tr>
                                    <td>{{$index+1+(dataList.page-1)*dataList.rows}}</td>
                                    <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
                                    <td>{{$value.proname}}</td>
                                    <td>{{$value.prono}}</td>
                                    <td>{{$value.checktime}}</td>
                                    <td>{{$value.checktimenext}}</td>
                                    <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>
                                </tr>
                                {{/each}}
                                </tbody>
                            </table>
                            <div id="paging"></div>
                        </div>
                    </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="GMDSS_layTwo">
            <li class="personTable" id="GMDSS_lisTwo">
                <!--弹出层2 检修期内救生筏数-->
                <div class="row">
                    <table class="checkTime">
                        <thead>
                        <tr>
                            <td>序号</td>
                            <td>产品名称</td>
                            <td>产品型号</td>
                            <td>产品编号</td>
                            <td>产品制造企业</td>
                            <td>船名</td>
                            <td>本次检修时间</td>
                            <td>下次检修时间</td>
                        </tr>
                        </thead>
                        <tbody id="gmdss_body2">
                        {{each th}}
                        <tr>
                            <td>{{$index+1}}</td>
                            <td>{{$value.proname}}</td>
                            <td>{{$value.promodelno}}</td>
                            <td>{{$value.prono}}</td>
                            <td><span style="cursor: pointer;" onClick=crossLoad('/ship/ent/index?pid={{$value.entid}}','{{$value.entbuild}}')>{{$value.entbuild}}</span></td>
                            <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
                            <td>{{$value.checktime}}</td>
                            <td>{{$value.checktimenext}}</td>
                        </tr>
                        {{/each}}
                        </tbody>
                    </table>
                    <%--分页 待定--%>
                    <div id="gmdss_pagination2"/>
                </div>
            </li>
        </script>
        <script type="text/template" id="GMDSS_template2">
            {{each th}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.proname}}</td>
                <td>{{$value.promodelno}}</td>
                <td>{{$value.prono}}</td>
                <td><span style="cursor: pointer;" onClick=crossLoad('/ship/ent/index?pid={{$value.entid}}','{{$value.entbuild}}')>{{$value.entbuild}}</span></td>
                <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
                <td>{{$value.checktime}}</td>
                <td>{{$value.checktimenext}}</td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="GMDSS_layThree">
            <li class="personTable" id="GMDSS_lisThree">
                <!--弹出层3 监督抽查合格率-->
                <div class="portlet">
                    <div class="choucha">
                        <table class="checkTime">
                            <thead>
                            <tr>
                                <td>序号</td>
                                <td>抽查时间</td>
                                <td>负责人</td>
                                <td>问题类型</td>
                                <td>合格率</td>
                                <td>整改通知书</td>
                                <td>抽查报告</td>
                            </tr>
                            </thead>
                            <tbody id="gmdss_body3" style="font-size:14px;">
                                {{each th}}
                                <tr>
                                    <td>{{$index+1}}</td>
                                    <td>{{$value.checktime}}</td>
                                    <td>{{$value.respperson}}</td>
                                    <td>{{$value.questtype}}</td>
                                    <td>100%</td>
                                    {{if $value.checkpass == '1'}}
                                    <td>合格</td>
                                    {{else}}
                                    <td>不合格(pdf)</td>
                                    {{/if}}
                                    <td class="glyphicon glyphicon-download-alt">
                                        <a href="#" data-value="1" class="file-upload-btn">下载</a></td>
                                </tr>
                                {{/each}}
                            </tbody>

                        </table>
                    </div>
                    <div id="gmdss_pagination3"/>
                </div>
            </li>
        </script>
        <script type="text/template" id="GMDSS_template3">
            {{each th}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.checktime}}</td>
                <td>{{$value.respperson}}</td>
                <td>{{$value.questtype}}</td>
                <td>100%</td>
                {{if $value.checkpass == '1'}}
                <td>合格</td>
                {{else}}
                <td>不合格</td>
                {{/if}}
                <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="GMDSS_layFour">
            <li class="personTable act" id="GMDSS_lisFour">
                <!--弹出层4 企业能力评估-->
                <div class="row">
                    <div class="span6 radar">
                        <div class="line-chart" style="position: relative;">
                            <div id="main2" style="width: 100%;height:320px;"></div>
                            <div class="fenshu"><strong>{{score}}</strong>分</div>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="panel-group" id="GMDSS_qingkuang">
                            {{each result}}
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#GMDSS_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
    </ul>
    <!--end 弹出层-->
    <!--查看详情弹出窗-->
    <script type="text/template" id="GMDSS_xiangqing">
        <div class="xiangqing">
            <p><span class="xiangqingTitle">企业名称：</span><span class="xiangqingCon">{{entname}}</span></p>
            <p><span class="xiangqingTitle">证书编号：</span><span class="xiangqingCon">{{id}}</span></p>
            <p><span class="xiangqingTitle">型式数量：</span><span class="xiangqingCon">{{uid}}</span></p>
            <p><span class="xiangqingTitle">有效期：</span><span class="xiangqingCon">{{checktimenext}}</span></p>
        </div>
    </script>
    <script type="text/template" id="listByPageCopy">
        {{each dataList.dataList}}
        <tr>
            <td>{{$index+1+(dataList.page-1)*dataList.rows}}</td>
            <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
            <td>{{$value.proname}}</td>
            <td>{{$value.prono}}</td>
            <td>{{$value.checktime}}</td>
            <td>{{$value.checktimenext}}</td>
            <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>
        </tr>
        {{/each}}
    </script>
</div>
        </div>
    </div>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script src='${script}/chinasofti/ent/GMDSSPanel.js'></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>
<script>
    //饼图
    function eCharts(commentNums) {
    var choucha = echarts.init(document.getElementById("choucha"));
    var option = {
        color:['#4D9FED','#EF3D43','rgba(54,59,109,0.1)'],
        title : {
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            textStyle: {
                color: '#fff'
            },
            data: ['好评','差评']
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
//                radius : '55%',
//                center: ['50%', '60%'],
                data:commentNums,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            },
            {
                name:'外侧圆圈设置',
                type:'pie',
                center:['center','center'],
                radius: ['94%', '90%'],
                data:[
                    {value:788, name:''}
                ],
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                tooltip: {
                    trigger: 'none'
                },
                itemStyle: {
                    normal: {
                        //设置透明色
                        borderColor: 'rgba(97, 117, 137, 0.1)',//#405272
                        borderWidth: 7
                    }
                }
            }
        ]
    };
    choucha.setOption(option);
    }
</script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
