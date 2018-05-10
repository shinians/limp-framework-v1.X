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


    <%--<meta charset="UTF-8">--%>
    <%--<title>产品制造企业</title>--%>
    <%--<script src='${ctx}/resources/script/chinasofti/ent/js/tools/jquery/jquery-3.2.1.min.js'></script>--%>
    <%--<link href="${bt}/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="${bt}/css/bootstrap-datetimepicker.min.css" />--%>
    <%--<link rel="stylesheet" href="${style}/css/theme.css" />--%>
    <%--&lt;%&ndash;<script src="${ctx}/resources/script/chinasofti/ent/js/tools/jquery/jquery-3.2.1.min.js"></script>&ndash;%&gt;--%>
    <%--<script src="${bt}/js/bootstrap.min.js"></script>--%>
    <%--<script src="${bt}/js/bootstrap-datetimepicker.min.js"></script>--%>
    <%--<script src="${bt}/js/bootstrap-datetimepicker.zh-CN.js"></script>--%>
    <%--<script src='${echarts}/echarts.min.js'></script>--%>
    <%--<script src="${ctx}/plug/laydate/laydate.js"></script>--%>
    <%--<script src="${ctx}/plug/laydate/layer/layer.js"></script>--%>
    <%--<script src="${script}/js/template-web.js"></script>--%>
    <%--<link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css">--%>
    <%--<link rel="stylesheet" href="${style}/css/panel-main.css">--%>
    <%--<link rel="stylesheet" href="${style}/css/fazhan-panel.css">--%>
    <%--<link rel="stylesheet" href="${style}/css/gmdss-panel.css" />--%>
    <%--<link rel="stylesheet" href="${style}/css/chanpinzz-panel.css" />--%>
    <%--<link rel="stylesheet" href="${ctx}/plug/jsmind/jsmind.css">--%>

<%--</head>--%>
<style>
  
    #nav_intro{
        height:150%;
    }
    .fenshu{
        top:27px;
    }
    .wrapper-t{
        background-position: -4px 250px;
    }
    .fomW{
        left:108%;
    }
    /*营业执照*/
    /*.zhizhaoImg{*/
        /*transition:all 0.4s;*/
    /*}*/
    /*.zhizhaoImg:hover{*/
        /*margin-top:-100px;*/
        /*transform:scale(8);*/
    /*}*/
    .t-go, .t-back{
        top:245px;
    }
    /*2017.8.22 by meng*/
    #cpzz_datetimepicker1, #cpzz_datetimepicker2 {
        width: 110px;
    }
    #cpzz_datetimepicker1 .form-control, #cpzz_datetimepicker2 .form-control {
        width: 70px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #cpzz_datetimepicker1 .input-group-addon, #cpzz_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
        border: 0px;
    }
    #chouchaTab .active{
        border:0;
    }
    /*0822 by meng tree-echarts*/
    jmnodes.theme-primary jmnode{background-color:#28B779;color:#fff;border-color:#357ebd;}

    /*所有制形式*/
    .numberStyle #enttype{
        width: 192px;
        overflow: hidden;
        display: inline-block;
        height: 56px;
        font-size: 48px;
        white-space: nowrap;
        text-overflow: ellipsis;
    }

</style>
<input class="registnumval" value="${pid}" hidden="hidden"></input>
<div class="container">
    <div style="margin: 20px 0px;" class="row">
        <div class="col-md-12" style="padding-left:0;">
            <h3 style="margin-left: 0px;font-size:26px;" class="title2 company headerTxt"></h3>
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
                        <p class="numberColor numberStyle"><span class="number" id="cpzz_repairCount" ></span>个</p>
                        <p class="textSum">产品认可型号(个)</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="cpzz_onShipCount"></span>只</p>
                        <p class="textSum">出厂检验产品(只)</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="cpzz_percentOfPass"></span>%</p>
                        <p class="textSum">产品检验合格率(%)</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class=" box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="cpzz_capability"></span>分</p>
                        <p class="textSum">产品制造企业能力评估(分)</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01" style="margin-bottom: 0px;">关键指标</h3>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number" id="years">21</span>年</p>
                        <p class="textSum">企业注册年限</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number" id="enttype">国有企业</span></p>
                        <p class="textSum">所有制形式</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number" id="checkworkersnum">0</span>人</p>
                        <p class="textSum">技术人员数量</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor numberStyle"><span class="number"id="zcMoney">0</span>万元</p>
                        <p class="textSum">注册资金</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--结束 四项指标-->
    <!--企业相关信息-->
    <div class="row">
        <div class="col-sm-6">
            <div class="box repairBox" style="height:424px;">
                <h3 class='title01'>企业概况</h3>
                <div class="qiyemsg">
                    <ul class="information">
                        <li><b>企业名称：</b><span class="qiyeName"></span></li>
                        <li><b>所在地：</b><span class="city"></span></li>
                        <li><b>单位地址：</b><span class="address"></span></li>
                        <li><b>企业邮编：</b><span class="postNum"></span></li>
                        <%--新增項：信用代碼--%>
                        <li><b>企业統一信用代碼：</b><span class=""></span></li>
                        <li><b>单位负责人：</b><span class="personName"></span></li>
                        <li><b>联系电话：</b><span class="personTel"></span></li>
                        <li><b>单位联系人：</b><span class="personName"></span></li>
                        <li><b>联系人邮箱：</b><span class="qiyeEmail"></span></li>
                        <li><b>企业信用代码：</b><span class="creditcode"></span></li>
                        <li><b>营业执照：</b><img id="cpzzImg" src="" alt="营业执照" style="width:30px;height:50px;vertical-align: top;"
                        class="zhizhaoImg zoomify" /></li>
                    </ul>
                </div>
            </div>
        </div>
        <%--</div>--%>
        <!--企业展示-->
        <div class="col-sm-6">
            <div class="box repairBox" style="min-height: 424px;position: relative;">
                <h3 class='title01'>企业展示</h3>
                <div class="qiyezhangshi banner">
                    <ul class="banList" id="cpzz_banimg">
                        <script id="cpzz_imgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                            <li><img class="zoomify" src="../../../../resources/style/images/cpzz-01.jpg"></li>
                            <? } else{  ?>
                            <?for(var i=0;i<picUrl.length;i++){?>
                            <li><img class="zoomify" src="/<?= picUrl[i] ?>"></li>
                            <? }?>
                            <? }?>
                        </script>
                    </ul>

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
    <!--抽查+客户评价 2017.8.18去掉-->

    <!--弹出层-->
    <div id='view1' class='hide'></div>
    <ul class="lay">
        <script type="text/template" id='product_layOne'>
            <li class="personTable" id="product_lisOne">
                <!--弹出层1 产品认可型号-->
                <div class="renke">
                    <div class="chanpin">
                        <ul class="shaixuan">
                            <li class="leixing">
                                <h5 class="sx_name" >产品类型：</h5>
                                <p class="sx_con" id="producttypes">
                                    {{each productTypes}}
                                    <span>{{$value}}</span>
                                    {{/each}}
                                    <%--<span>haha</span>--%>
                                </p>
                            </li>
                            <li class="mingcheng">
                                <h5 class="sx_name">产品名称：</h5>
                                <p class="sx_con" id="productnames">
                                    <%--{{each productNames}}--%>
                                    <%--<span>{{$value}}</span>--%>
                                    <%--{{/each}}--%>
                                </p>
                            </li>
                            <li class="zhengshu">
                                <h5 class="sx_name">产品证书：</h5>
                                <p class="sx_con" id="certno">
                                    <%--{{each crets}}--%>
                                    <%--<span>{{$value}}</span>--%>
                                    <%--{{/each}}--%>
                                </p>
                            </li>
                        </ul>
                    </div>
                    <!--历程时间轴-->
                    <div class="row">
                        <div class="col-md-12 time">
                            <div class="wrapper-t">
                                <div class="content-t"></div>
                            </div>
                            <div class="t-back"></div>
                            <div class="t-go"></div>
                        </div>
                    </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="product_layTwo">
            <li class="personTable" id="product_lisTwo">
                <!--弹出层2 出厂检验产品-->
                <div class="row">
                    <%--待定--%>
                        <iframe id="tan2" style="width: 100%;height:450px;overflow-y:hidden;" src="http://202.127.45.98:8080/newship/zzjg_jsmind_snap.html" frameborder="0"></iframe>
                </div>
            </li>
        </script>
        <script type="text/template" id="product_layThree">
            <li class="personTable" id="product_lisThree">
                <!--弹出层3 产品检验合格率-->
                <div class="row">
                    <div class="col-sm-6" style="width:45%;">
                        <div class="shijianduan">
                            <!--起止时间-->
                            <div class="kaishi form-group">
                                <label>选择开始时间：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='cpzz_datetimepicker1'>
                                    <input type='text' class="form-control" value="2015-01" id="cpzz_startT" />
                                    <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                                </div>
                            </div>
                            <!--结束时间-->
                            <div class="jieshu">
                                <label>选择结束时间：</label>
                                <div class='input-group date' id='cpzz_datetimepicker2'>
                                    <input type='text' class="form-control" value="2016-01" id="cpzz_endT" />
                                    <span class="input-group-addon">
							   		<span class="glyphicon-calendar"></span>
							  	</span>
                                </div>
                            </div>
                        </div>
                        <%--折线图--%>
                        <div id="cpzz_choucha" style="width:500px;height:280px;"></div>
                    </div>
                    <div class="col-sm-6" style="width:55%;">
                        <div class="choucha">
                            <ul class="nav nav-tabs" id="chouchaTab" style="width:100%;">
                                <li class="active">
                                    <a href="#cpzz_tab_jd_1" data-toggle="tab">产品质量监督抽查<span>({{percent1}}%)</span></a>
                                </li>
                                <li>
                                    <a href="#cpzz_tab_jd_2" data-toggle="tab">营运检验<span>({{percent2}}%)</span></a>
                                </li>
                                <li>
                                    <a href="#cpzz_tab_jd_3" data-toggle="tab">渔船安全技术状况监督抽查<span>({{percent3}}%)</span></a>
                                </li>
                            </ul>
                            <div class="tab-content" style="min-height:300px;width:100%;border:0;">
                                <div class="tab-pane active" id="cpzz_tab_jd_1">
                                    <table class="checkTime">
                                        <thead>
                                        <tr>
                                            <td>序号</td>
                                            <td>产品名称</td>
                                            <td>产品编号</td>
                                            <td>抽查时间</td>
                                            <td>抽查报告</td>
                                        </tr>
                                        </thead>
                                        <tbody id="cpzz_body1">
                                        {{each pager1.dataList}}
                                        <tr>
                                            <td>{{$index+1}}</td>
                                            <td>{{$value.rc1}}</td>
                                            <td>{{$value.productnum}}</td>
                                            <td>{{$value.checktime}}</td>
                                            <td>下载</td>
                                            <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                                            <%--class="file-upload-btn">下载</a>--%>
                                            <%--</td>--%>
                                        </tr>
                                        {{/each}}
                                        </tbody>
                                    </table>
                                    <div id="cpzz_pagination1"/>
                                </div>
                                <div class="tab-pane" id="cpzz_tab_jd_2">
                                    <table class="checkTime">
                                        <thead>
                                        <tr>
                                            <td>序号</td>
                                            <td>产品名称</td>
                                            <td>产品编号</td>
                                            <td>渔船名称</td>
                                            <td>检验时间</td>
                                            <td>检验报告</td>
                                        </tr>
                                        </thead>
                                        <tbody id="cpzz_body2">
                                        {{each pager2.dataList}}
                                        <tr>
                                            <td>{{$index+1}}</td>
                                            <td>{{$value.rc1}}</td>
                                            <td>{{$value.productnum}}</td>
                                            <td>{{$value.shipname}}</td>
                                            <td>{{$value.checktime}}</td>
                                            <td>下载</td>
                                            <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                                            <%--class="file-upload-btn">下载</a>--%>
                                            <%--</td>--%>
                                        </tr>
                                        {{/each}}
                                        </tbody>
                                    </table>
                                    <div id="cpzz_pagination2"/>
                                </div>
                                <div class="tab-pane" id="cpzz_tab_jd_3">
                                    <table class="checkTime">
                                        <thead>
                                        <tr>
                                            <td>序号</td>
                                            <td>产品名称</td>
                                            <td>产品编号</td>
                                            <td>渔船名称</td>
                                            <%--<td>行动名称</td>--%>
                                            <td>抽查时间</td>
                                            <td>检验报告</td>
                                        </tr>
                                        </thead>
                                        <tbody id="cpzz_body3">
                                        {{each pager3.dataList}}
                                        <tr>
                                            <td>{{$index+1}}</td>
                                            <td>{{$value.rc1}}</td>
                                            <td>{{$value.productnum}}</td>
                                            <td>{{$value.shipname}}</td>
                                            <%--<td>{{$value.actionname}}</td>--%>
                                            <td>{{$value.checktime}}</td>
                                            <td>下载</td>
                                            <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                                            <%--class="file-upload-btn">下载</a>--%>
                                            <%--</td>--%>
                                        </tr>
                                        {{/each}}
                                        </tbody>
                                    </table>
                                    <div id="cpzz_pagination3"/>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </li>
        </script>
        <script type="text/template" id="cpzz_template1">
            {{each dataList}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.rc1}}</td>
                <td>{{$value.productnum}}</td>
                <td>{{$value.checktime}}</td>
                <td>下载</td>
                <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                <%--class="file-upload-btn">下载</a>--%>
                <%--</td>--%>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="cpzz_template2">
            {{each dataList}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.rc1}}</td>
                <td>{{$value.productnum}}</td>
                <td>{{$value.shipname}}</td>
                <td>{{$value.checktime}}</td>
                <td>下载</td>
                <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                <%--class="file-upload-btn">下载</a>--%>
                <%--</td>--%>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="cpzz_template3">
            {{each dataList}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.rc1}}</td>
                <td>{{$value.productnum}}</td>
                <td>{{$value.shipname}}</td>
                <td>{{$value.checktime}}</td>
                <td>下载</td>
                <%--<td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"--%>
                <%--class="file-upload-btn">下载</a>--%>
                <%--</td>--%>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="product_layFour">
            <li class="personTable act" id="product_lisFour">
                <!--弹出层4 产品能力评估-->
                <div class="row">
                    <div class="span6 radar">
                        <div class="line-chart">
                            <div id="chanpin"></div>
                            <div class="fenshu"><strong>{{score}}</strong>分</div>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="panel-group" id="cpzz_qingkuang">
                            {{each result}}
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#cpzz_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
    <script type="text/template" id="product_xiangqing">
        <div class="xiangqing">
            <p>企业名称：<span>{{entname}}</span></p>
            <p>证书编号：<span>{{certid}}</span></p>
            <p>型式数量：<span>{{uid}}</span></p>
            <p>有效期：<span>{{checktimenext}}</span></p>
        </div>
    </script>
</div>
<script type="text/javascript" src="${ctx}/plug/jsmind/jsmind.js"></script>

<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>


<script src='${script}/chinasofti/ent/cpzzPanel.js'></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>

