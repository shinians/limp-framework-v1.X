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

<style type="text/css">
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
    .t-go, .t-back{
        top:316px;
    }
    #chouchaTab .active{
        margin-right:-1px;
    }
    .file-upload-btn{
        color:#53B2E5;
    }
    .checkTime>tbody tr td{
        border-top: 0;
        border-bottom: 0;
    }
    /*2017.8.17 by meng*/
    #raft_datetimepicker1, #raft_datetimepicker2 {
        width: 110px;
    }
    #raft_datetimepicker1 .form-control, #raft_datetimepicker2 .form-control {
        width: 70px;
        padding: 3px;
        font-size: 10px;
        background-color: rgba(0, 0, 0, 0.11);
        color: #fff;
        border: 0;
    }
    #raft_datetimepicker1 .input-group-addon, #raft_datetimepicker2 .input-group-addon {
        width: 35px;
        height: 34px;
        padding: 3px;
        margin: auto;
        background: rgba(0,0,0,0.11) url(../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
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

<input class="registnumval" value="${pid}" hidden="hidden" />
<div class="container">

    <div style="margin:20px 0px;" class="row">
        <div class="col-md-12" style="padding-left:0;">
            <div class="layui-breadcrumb" id="bread">

            </div>
            <h3 class="title2 raft_company headerTxt" id = "company" ></h3>
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
                        <p class="numberColor numberStyle"><span class="number" id="repairCount"></span>只</p>
                        <p class="textSum">累计检修筏数量(只)</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="roftCountInTime">27</span>只</p>
                        <p class="textSum">检修期内救生筏数(只)</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="percentOfPass">91%</span></p>
                        <p class="textSum">监督抽查合格率(%)</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class=" box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>
                        <p class="numberColor numberStyle"><span class="number" id="raft_capability">0</span>分</p>
                        <p class="textSum">企业能力评估(分)</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01" style="margin-bottom:0px;">关键指标</h3>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="setdate">2004.08</span></p>
                        <p class="textSum">成立时间</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="workesnum">2000</span>㎡</p>

                        <p class="textSum">场地面积</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="certwokernum">19</span>人</p>
                        <p class="textSum">持证技术人员</p>
                    </div>
                    <div class="col-sm-6">
                        <p class="numberColor  numberStyle"><span class="number" id="productTypes">7</span>个</p>
                        <p class="textSum">修筏产品型式</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--结束 四项指标-->

    <!--企业相关信息-->
    <div class="row">
        <div class="col-sm-6">
            <div class="box repairBox detailMsg" style="padding-bottom: 4px;">
                <h3 class='title01' style="margin-left: 35px;top: 20px;">基本信息</h3>
                <div class="qiyemsg">
                    <ul class="information">
                        <li><b>企业名称：</b><span class="qiyeName"></span></li>
                        <li><b>地址：</b><span class="address"></span><a href="#" class="gogis"></a></li>
                        <li><b>企业成立时间：</b><span class="foundTime"></span></li>
                        <li><b>企业认可时间：</b><span class="acceptTime"></span></li>
                        <%--新增项：信用代码--%>
                        <li><b>企业统一信用代码：</b><span class="raftUniCode"></span></li>
                        <li><b>认可证书有效期：</b><span class="approvalTime"></span></li>
                        <li><b>法人代表：</b><span class="personName"></span></li>
                        <li><b>法人代表电话：</b><span class="personTel"></span></li>
                        <li><b>企业邮编：</b><span class="postNum"></span></li>
                        <li><b>企业邮箱：</b><span class="qiyeEmail"></span></li>
                        <li><b>注册资本(万元)：</b><span class="zcMoney"></span></li>
                        <li><b>登记机关：</b><span class="registerAddress"></span></li>
                        <li><b>经营范围：</b><span class="manageRange"></span></li>
                        <%--新增项：执照--%>
                        <li><b>营业执照：</b><img id="fazhanImg" src="../../../../resources/style/images/zhizhao.jpg" alt="执照" style="width:30px;height:50px;vertical-align: top;" class="zhizhaoImg zoomify"></li>
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
    <!--弹出层-->
    <div id='raft_view1' class='hide'></div>
    <ul class="lay">
        <script type="text/template" id='raft_layOne'>
            <li class="personTable" id="raft_lisOne">
                <!--弹出层1 累计救生筏数-->
                <div class="row">
                    <div class="col-sm-6" style="width:38%;">
                        <div class="shijianduan">
                            <!--起止时间-->
                            <div class="kaishi form-group">
                                <label>选择开始时间：</label>
                                <!--指定 date标记-->
                                <div class='input-group date' id='raft_datetimepicker1'>
                                    <input type='text' class="form-control" value="2013" id="raft_startT" />
                                <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                                </div>
                            </div>
                            <!--结束时间-->
                            <div class="jieshu">
                                <label>选择结束时间：</label>
                                <div class='input-group date' id='raft_datetimepicker2'>
                                    <input type='text' class="form-control" value="2017" id="raft_endT" />
                                <span class="input-group-addon">
							   		<span class="glyphicon-calendar"></span>
							  	</span>
                                </div>
                            </div>
                        </div>
                        <div class="line-chart">
                            <!--图表-->
                            <div id="raft_main6" style="width:430px;height:300px;margin:auto;"></div>
                        </div>
                    </div>
                    <div class="col-sm-6" style="width:62%;">
                        <div class="biao">
                            <table class="checkTime">
                                <thead>
                                <tr>
                                    <td>序号</td>
                                    <td>船名</td>
                                    <td>产品编号</td>
                                    <td>检修时间</td>
                                    <td>下次检修日期</td>
                                    <td>检修记录</td>
                                </tr>
                                </thead>
                                <tbody id='raft_tableBody'>
                                {{each dataList.dataList}}
                                <tr>
                                    <td>{{$index+1+(dataList.page-1)*dataList.rows}}</td>
                                    <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
                                    <td>{{$value.prono}}</td>
                                    <td>{{$value.checktime}}</td>
                                    <td>{{$value.checktimenext}}</td>
                                    <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>
                                </tr>
                                {{/each}}
                                </tbody>
                            </table>
                            <div id="raft_paging"></div>
                        </div>
                    </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="raft_layTwo">
            <li class="personTable" id="raft_lisTwo">
                <!--弹出层2 检修期内gmdss数-->
                <div class="row">
                    <table class="checkTable">
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
                        <tbody id="raft_body2">
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
                    <div id="raft_pagination2"/>
                </div>
            </li>
        </script>
        <script type="text/template" id="raft_template2">
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

        <script type="text/template" id="raft_layThree">
            <li class="personTable" id="raft_lisThree">
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
                                <td>问题描述</td>
                                <td>抽查结果</td>
                                <td>抽查报告</td>
                            </tr>
                            </thead>
                            <tbody id="raft_body3">
                            {{each th}}
                            <tr>
                                <td>{{$index+1}}</td>
                                <td>{{$value.checktime}}</td>
                                <td>{{$value.respperson}}</td>
                                <td>{{$value.questtype}}</td>
                                <td>{{$value.questintro}}</td>
                                {{if $value.checkpass == '1'}}
                                <td>合格</td>
                                {{else}}
                                <td>不合格</td>
                                {{/if}}
                                <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1"
                                                                                class="file-upload-btn">下载</a></td>
                            </tr>
                            {{/each}}
                            </tbody>
                        </table>
                        <div id="raft_pagination3"/>
                     </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="raft_template3">
            {{each th}}
            <tr>
                <td>{{$index+1}}</td>
                <td>{{$value.checktime}}</td>
                <td>{{$value.respperson}}</td>
                <td>{{$value.questtype}}</td>
                <td>{{$value.questintro}}</td>
                {{if $value.checkpass == '1'}}
                <td>合格</td>
                {{else}}
                <td>不合格</td>
                {{/if}}
                <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="raft_layFour">
            <li class="personTable" id="raft_lisFour">
                <!--弹出层4 企业能力评估-->
                <div class="row">
                    <div class="span6 radar">
                        <div class="line-chart" style="position: relative;">
                            <div id="main2"></div>
                            <div class="fenshu"><strong>{{score}}</strong>分</div>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="panel-group" id="raft_qingkuang">
                            {{each result}}
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#raft_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
    <script type="text/template" id="raft_xiangqing">
        <div class="xiangqing">
            <p><span class="xiangqingTitle">企业名称：</span><span class="xiangqingCon">{{entname}}</span></p>
            <p><span class="xiangqingTitle">证书编号：</span><span class="xiangqingCon">{{id}}</span></p>
            <p><span class="xiangqingTitle">型式数量：</span><span class="xiangqingCon">{{uid}}</span></p>
            <p><span class="xiangqingTitle">有效期：</span><span class="xiangqingCon">{{checktimenext}}</span></p>
        </div>
    </script>
    <script type="text/template" id="raft_listByPageCopy">
        {{each dataList.dataList}}
        <tr>
            <td>{{$index+1+(dataList.page-1)*dataList.rows}}</td>
            <td><span style="cursor: pointer;" onClick=crossLoad('/ship/index?shipcode={{$value.shipcode}}','{{$value.shipname}}')>{{$value.shipname}}</span></td>
            <td>{{$value.prono}}</td>
            <td>{{$value.checktime}}</td>
            <td>{{$value.checktimenext}}</td>
            <td class="glyphicon glyphicon-download-alt"><a href="#" data-value="1" class="file-upload-btn">下载</a></td>

        </tr>
        {{/each}}
    </script>
    <!--筏站认可历程-->
    <div class="row">
        <div class="col-md-12" style="padding-right:5px;">
            <div class="time">
                <div class="title01">认可历程</div>
                <div class="wrapper-t">
                    <div style="width: 1200px;" class="content-t"></div>
                </div>
                <div class="t-back"></div>
                <div class="t-go"></div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script src='${script}/chinasofti/ent/fazhanPanel.js'></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>



