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
    .layui-layer-tips .layui-layer-close{
        right: -10px;
        top: -5px;
    }
    /*banner*/
    .banner{
        width: 83%;
    }
    .banList li{
        height: 100%;
        width: 100%;
        margin-left: 0px;
    }
    .banList li img {
        height: 100%;
        width: 100%;
    }
    .fomW{
        bottom: -37px;
        left: 108%;
        width:100%;
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
    .file-upload-btn{
        color:#53B2E5;
    }
    .checkTime>tbody tr td{
        border-top: 0;
        border-bottom: 0;
    }

</style>

<div class="container">
    <input type="hidden" id="entPid" value="${pid}">
    <div style="margin: 20px 0px;" class="row" >
        <div class="col-sm-12">
            <div class="layui-breadcrumb" id="bread">

            </div>
			<h3 class="title2 company headerTxt" id="company"></h3>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>

                        <p class="numberColor numberStyle"><span style="font-size: 35px;margin-left: 10%;" class="number" id="entClass"></span></p>
                        <p class="textSum" style="margin-top: 10px;">企业分级</p>
                    </div>
                </div>
                <script id="repairCompany" type="text/template">
                    <table id="checkTime" class="inforTable">
                        <thead>
                        <th>标准内容</th>
                        <th>标准</th>
                        <th>实际</th>

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
                <script id="repairCompany2" type="text/template">
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
                        <p class="numberColor numberStyle"><span class="number" id="repairTimes"></span>艘次</p>
                        <p class="textSum">维修渔船(艘次)</p>
                    </div>
                </div>
                <script id="repairShip" type="text/template">
                    <div class="col-sm-5">
                        <ul class="nav nav-tabs" role="tablist" class="Tab">
                            <li role="presentation" class="active"><a href="#contour" aria-controls="contour" role="tab" data-toggle="tab">船长</a></li>
                            <li role="presentation"><a href="#headSculpture" aria-controls="headSculpture" role="tab" data-toggle="tab">船体材质</a></li>
                            <li role="presentation"><a href="#lable" aria-controls="lable" role="tab" data-toggle="tab">作业区域</a></li>

                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="contour" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="headSculpture" style="width:350px;height:350px;">

                            </div>
                            <div role="tabpanel" class="tab-pane" id="lable" style="width:350px;height:350px;">

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
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="firtPassRate"></span>%</p>
                        <p class="textSum">维修后首次检验一次通过率(%)</p>
                    </div>
                </div>
                <script id="repairPercent" type="text/template">
                    <div class="row">
                        <div class="shijianduan">
                            <!--起止时间-->
                            <div class="kaishi form-group">
                                <label>选择开始时间：</label>
                                <!--指定 date标记-->
                                <div class="input-group date" id="datetimepicker1">
                                    <input type="text" class="form-control" id="startT">
                                    <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                                </div>
                            </div>
                            <!--结束时间-->
                            <div class="jieshu">
                                <label>选择结束时间：</label>
                                <div class="input-group date" id="datetimepicker2">
                                    <input type="text" class="form-control" id="endT">
                                    <span class="input-group-addon">
							   		<span class="glyphicon-calendar"></span>
							  	</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="repairGood" style="width:100%;height:300px;"></div>
                </script>

                <div class="col-sm-6">
                    <div class=" box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="repairPoint">0</span>分</p>
                        <p class="textSum">维修企业能力评估(分)</p>
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
                            <div class="panel-group" id="repair_qingkuang">
                                {{each result}}
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#repair_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
                <h3 class="title01" style="margin-bottom:0px;">关键指标</h3>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="createtime"></span></p>

                        <p class="textSum">建厂时间</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="entarea"></span>亩</p>
                        <p class="textSum">占地面积</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="profworkersnum"></span>人</p>
                        <p class="textSum">专业技术人员</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="registcapital"></span>万元</p>
                        <p class="textSum">注册资金</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="box  repairBox">
                <h3 class='title01'>基本信息</h3>
                <div class="qiyemsg">
                    <ul class="informationCompany">
                        <li><b>企业名称：</b><span class="qiyeName"></span></li>
                        <li><b>地址：</b><span class="address"></span><a href="#" class="gogis"></a></li>
                        <li><b>法人代表：</b><span class="personName"></span></li>
                        <li><b>法人代表电话：</b><span class="personTel"></span></li>
                        <li><b>企业邮编：</b><span class="postNum"></span></li>
                        <li><b>企业邮箱：</b><span class="qiyeEmail"></span></li>
                        <li><b>注册资本(万元)：</b><span class="zcMoney"></span></li>
                        <li><b>登记机关：</b><span class="registerAddress"></span></li>
                        <li><b>经营范围：</b><span class="manageRange"></span></li>
                        <%--新增项：执照--%>
                        <li><b>营业执照：</b><img id="repairImg" src="" alt="营业执照" style="width:30px;height:50px;vertical-align: top;" class="zhizhaoImg zoomify"></li>
                    </ul>
                </div>
            </div>

        </div>
        <div class="col-sm-6">
            <div class="box  repairBox" style="min-height: 424px;position: relative;">
                <h3 class='title01'>企业展示</h3>
                <div class="qiyezhangshi banner">
                    <ul class="banList" id="banimg">

                        <script id="repairimgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                            <li><img class="zoomify" src="../../../../resources/style/images/xzqy-01.jpg"></li>
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
    <div class="row">
        <div class="col-sm-6">
            <div class="repairBox box">
                <h3 class="title01">企业维修渔船船次</h3>
                <div id="companyShip" style="width: 100%;height: 350px;"></div>
            </div>
        </div>
        <div class="col-sm-6">
            <%--增加维修渔船轮播   by   Duanyunhong--%>
            <div class="repairBox box" id="repairShipImgBody1">
                <script id="repairShipImg" type="text/template">
                    <h3 class="title01">维修渔船示例</h3>
                    <div id="firstRepair" >
                    <h4 class="repairTitle02">维修渔船型号：<a href="#" style="text-decoration: underline;color: #00aeef;">BZ01</a></h4>
                    <div id="myCarousel1" class="carousel slide">
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
                        <!-- Carousel nav -->
                        <a class="carousel-control left" href="#myCarousel1" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>

                        </a>
                        <a class="carousel-control right" href="#myCarousel1" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>

                        </a>
                    </div>
                </div>
                </script>
            </div>

        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>
<script src='${script}/chinasofti/ent/repaircompanyPanel.js'></script>
<script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/plug/js-utils/count-number.js"></script>

