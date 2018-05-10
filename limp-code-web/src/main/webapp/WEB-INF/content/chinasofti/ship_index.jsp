<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<style>
    #nav_intro{
        height:1400px;
    }
    #productFil,#shipFil{
        color:#fff;
    }
    #filterContent{
        margin-top:20px;
        height:30px;
    }
    .filterContent{

    }
    .filterContent1{
        display: inline-block;
        background-color:#e4393c;
        width:215px;
        height:25px;
        text-align: center;
        border-radius: 5px;
        padding-top:2px;
        color:#000;
        font-weight: bold;
        margin:0 10px;
    }
    .closeAll{
        position: relative;
        right:-3px;
        top:-1px;
        cursor: pointer;
    }
    .closeAll:hover{
        color:#e4393c;
    }
    .shipClose{
        position: relative;
        right:-38px;
        cursor: pointer;
    }
    .filterClose{
        cursor:pointer;
    }
    .panel-group{
        margin-bottom: 0px;
    }
    #timeMove{
        width:1000px;
    }
    #shipTab a{
        border:1px solid transparent;
    }
    .filter{
        width:215px;
        padding:5px;
        margin-left:10px;
        color:#fff;
        -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        border-radius: 5px;
        background: linear-gradient(to right,#696dd8,#0445fd);

    }
    .filterBtn{
        margin-top:18px;
    }
    .filterBtn .layui-btn{
        background-color:#008db7;
        font-weight:bold;
    }
    .filterBtn .layui-btn{
        border-left:none;
    }
    .tab-content{
        width:auto;
    }
</style>
<input type="hidden" id="shipid" value="${shipid}">
<input type="hidden" id="productid" value="${productid}">
<div class="container">

    <div style="" class="row" >
        <div class="layui-breadcrumb" id="bread">
          
        </div>
        <div style="margin:10px;" class="col-sm-12">
            <h3 style="float: left;" class="title01 headerTxt"></h3>
            <%--<span style="margin: 25px 0px 0px 20px;" class="status">脱检</span>--%>
        </div>

    </div>
    <div class="row" >
        <div class="col-sm-12">
            <div class="panel-group" role="tablist" aria-multiselectable="true" id="qingkuang">
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingone">
                        <h4 class="panel-title">
                            <a href="#qingk1" data-toggle="collapse" data-parent="#qingkuang"><i class="glyphicon glyphicon-hand-down"></i>渔船基本信息</a>
                        </h4>
                    </div>
                    <div id="qingk1" class="panel-collapse collapse in" aria-labelledby="headingOne">
                        <div class="panel-body" style="height:500px;">
                            <div class="col-sm-12" style="margin-top:64px;">
                                <div class="col-sm-4" >
                                    <div style="" class="box003">
                                        <b class="iconShipsum"></b>
                                        <ul id="shipNews" class="information01" >
                                            <script id="shipSimpleContent" type="text/template">
                                                <li><b>船名号：</b><span class="">{{shipname}}</span></li>
                                                <li><b>渔船编码：</b><span class="">{{shipcode}}</span></li>
                                                <li><b>船舶所有人：</b><span class="">{{ownername}}</span></li>
                                                <li><b>船籍港：</b><span class="">{{shipport}}</span></li>
                                                <li><b>船体材质：</b><span class="">{{shipmaterial}}</span></li>
                                                <li><b>船长：</b><span class="">{{shiplength}}(米)</span></li>
                                                <li><b>建造完工日期：</b><span class="">{{completdate}}</span></li>
                                                <li><b>核定航区：</b><span class="">近海航区</span></li>
                                                <li><b>主机功率：</b><span class="">{{power}}kw</span></li>
                                                <li><b>渔船安全指数：</b><span class="textRed safeScore">92</span>分</li>
                                            </script>
                                        </ul>

                                        <script id="shipInformation" type="text/template">
                                            <table class="shipInf">
                                                <tr>
                                                    <td>渔船所属检验机构</td>
                                                    <td class="shipWhite" colspan="3"><?= content.orgname ?></td>
                                                    <td>检验登记号</td>
                                                    <td class="shipWhite"><?= content.linkVerifyenrNo  ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船名</td>
                                                    <td class="shipWhite"><?= content.shipname ?></td>
                                                    <td>渔船编码</td>
                                                    <td class="shipWhite"><?= content.shipcode?></td>
                                                    <td>渔船类别</td>
                                                    <td class="shipWhite"><?= content.shiptype ?></td>
                                                </tr>
                                                <tr>
                                                    <td>证书状态</td>
                                                    <td class="shipWhite" colspan="5"><?= content.getCertificatestate ?></td>

                                                </tr>
                                                <tr>
                                                    <td>渔船所属地区</td>
                                                    <td class="shipWhite" colspan="3"><?= content.regarea?></td>
                                                    <td>船籍港</td>
                                                    <td class="shipWhite"><?= content.shipport ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船舶所有人</td>
                                                    <td class="shipWhite" colspan="3">	<?= content.ownername?></td>
                                                    <td>身份号码/企业注册号</td>
                                                    <td class="shipWhite"><?= content.ownerno ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船舶所有人地址</td>
                                                    <td class="shipWhite" colspan="3"><?= content.owneraddr ?></td>
                                                    <td>船舶所有人联系电话</td>
                                                    <td class="shipWhite"><?= content.ownertel ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船网指标批准书编号</td>
                                                    <td class="shipWhite" colspan="3"><?= content.shipinsapp ?></td>
                                                    <td>申请类型</td>
                                                    <td class="shipWhite"></td>
                                                </tr>
                                                <tr>
                                                    <td>核准作业类型</td>
                                                    <td class="shipWhite"><?= content.jobtype  ?></td>
                                                    <td>核准作业场所</td>
                                                    <td class="shipWhite"><?= content.navzone ?></td>
                                                    <td>核准主机总功率(kW)</td>
                                                    <td class="shipWhite"><?= content.power ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船舶类型 </td>
                                                    <td class="shipWhite"><?= content.shipCategory ?></td>
                                                    <td>批准作业区域</td>
                                                    <td class="shipWhite"></td>
                                                    <td>主机总功率</td>
                                                    <td class="shipWhite"><?= content.power ?></td>
                                                </tr>
                                                <tr>
                                                    <td>船体材料</td>
                                                    <td class="shipWhite"><?= content.shipmaterial?></td>
                                                    <td>船舶呼号/识别码</td>
                                                    <td class="shipWhite"><?= content.callsign?></td>
                                                    <td>安放龙骨日期</td>
                                                    <td class="shipWhite"></td>
                                                </tr>
                                                <tr>
                                                    <td>建造完工日期</td>
                                                    <td class="shipWhite"><?= content.completdate ?></td>
                                                    <td>主机机号</td>
                                                    <td class="shipWhite"><?= content.hostmodel1?></td>
                                                    <td class="shipWhite"><?= content.hostmodel2?></td>
                                                    <td class="shipWhite"><?= content.hostmodel3?></td>
                                                </tr>
                                                <tr>
                                                    <td>船舶制造厂</td>
                                                    <td class="shipWhite"><?= content.entnamebul?></td>
                                                    <td>船舶经营方</td>
                                                    <td  class="shipWhite"></td>
                                                    <td></td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>船长(m) </td>
                                                    <td class="shipWhite"><?= content.shiplength ?>米</td>
                                                    <td>型宽(m)</td>
                                                    <td class="shipWhite"><?= content.modelwidth?>米</td>
                                                    <td>船舶型深(m)</td>
                                                    <td class="shipWhite"><?= content.modeldepth ?>米</td>
                                                </tr>
                                                <tr>
                                                    <td>总长(m)	</td>
                                                    <td class="shipWhite"><?= content.covshiplength ?></td>
                                                    <td>总吨位</td>
                                                    <td class="shipWhite"><?= content.tonnage?></td>
                                                    <td>净吨位</td>
                                                    <td class="shipWhite"><?= content.nettonnage?></td>
                                                </tr>
                                                <tr>
                                                    <td>船型代号</td>
                                                    <td class="shipWhite"><?= content.shipnameplan ?></td>
                                                    <td>设计航速（节）</td>
                                                    <td class="shipWhite"><?= content.desspeed?></td>
                                                    <td>定员</td>
                                                    <td class="shipWhite"><?= content.crewquota?></td>
                                                </tr>
                                                <tr>
                                                    <td>姐妹船</td>
                                                    <td class="shipWhite" colspan="5"></td>
                                                </tr>
                                                <tr>
                                                    <td>船舶历史记事</td>
                                                    <td class="shipWhite" colspan="5"></td>
                                                </tr>
                                                <tr>
                                                    <td>备注</td>
                                                    <td class="shipWhite" colspan="5"></td>
                                                </tr>
                                            </table>
                                   </script>
                                    </div>
                                </div>
                                <script id="safe" type="text/template">
                                    <div class="row lis1">
                                        <div class="col-sm-6">
                                            <div class="line-chart" style="position:relative;">
                                                <div id="safeChart" style="width:100%;height:450px;"></div>
                                                <div class="fenshu"><strong>100</strong>分</div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6">
                                            <div class="panel-group" id="safeScore">
                                                <div class="panel panel-default">
                                                    <div class="panel-heading">
                                                        <h4 class="panel-title">
                                                            <a href="#safe01" data-toggle="collapse" data-parent="#safeScore"><i
                                                                    class="glyphicon glyphicon-hand-down"></i>船舶因素
                                                                &nbsp;(<var>50</var>/50)</a>
                                                        </h4>
                                                    </div>
                                                    <div id="safe01" class="panel-collapse collapse in">
                                                        <div class="panel-body">
                                                            <p>
                                                                <span>船体结构：</span>25/25
                                                            </p>
                                                            <p>
                                                                <span>船舶设备：</span> 25/25
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-default">
                                                    <div class="panel-heading">
                                                        <h4 class="panel-title">
                                                            <a href="#safe02" data-toggle="collapse" data-parent="#safeScore"><i
                                                                    class="glyphicon glyphicon-hand-down"></i>人员因素&nbsp;(<var>0</var>/0)</a>
                                                        </h4>
                                                    </div>
                                                    <div id="safe02" class="panel-collapse collapse">
                                                        <div class="panel-body">
                                                            <p>
                                                                <span>缺省</span>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-default">
                                                    <div class="panel-heading">
                                                        <h4 class="panel-title">
                                                            <a href="#safe03" data-toggle="collapse" data-parent="#safeScore"><i
                                                                    class="glyphicon glyphicon-hand-down"></i>环境因素&nbsp;(<var>0</var>/0)</a>
                                                        </h4>
                                                    </div>
                                                    <div id="safe03" class="panel-collapse collapse">
                                                        <div class="panel-body">
                                                            <p>
                                                                <span>缺省</span>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-default">
                                                    <div class="panel-heading">
                                                        <h4 class="panel-title">
                                                            <a href="#safe04" data-toggle="collapse" data-parent="#safeScore"><i
                                                                    class="glyphicon glyphicon-hand-down"></i>管理因素&nbsp;(<var>50</var>/50)</a>
                                                        </h4>
                                                    </div>
                                                    <div id="safe04" class="panel-collapse collapse">
                                                        <div class="panel-body">
                                                            <p>
                                                                <span>安全管理制度：</span>25/25
                                                            </p>
                                                            <p>
                                                                <span>安全管理效果：</span>25/25
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </script>
                                <div class="col-sm-4 box003" >
                                    <ul class="nav nav-tabs" role="tablist" id="myTab">
                                        <li role="presentation" class="active"><a href="#contour" aria-controls="contour" role="tab" data-toggle="tab">船舶外形</a></li>
                                        <li role="presentation"><a href="#headSculpture" aria-controls="headSculpture" role="tab" data-toggle="tab">船主头像</a></li>
                                        <li role="presentation"><a href="#lable" aria-controls="lable" role="tab" data-toggle="tab">电子标签</a></li>
                                        <li role="presentation"><a href="#location" aria-controls="location" role="tab" data-toggle="tab">主机处所</a></li>
                                    </ul>
                                    <div class="tab-content" id="shipPicContent">

                                            <div role="tabpanel" class="tab-pane active" id="contour"><img src="${style}/images/yuchuan.png" alt=""></div>
                                            <div role="tabpanel" class="tab-pane" id="headSculpture"><img src="${style}/images/people1.jpg" alt=""></div>
                                            <div role="tabpanel" class="tab-pane" id="lable"><img src="${style}/images/card1.png" alt=""></div>
                                            <div role="tabpanel" class="tab-pane" id="location"><img src="${style}/images/oil_engine1.jpg" alt=""></div>
                                   </div>
                                </div>

                                <div style="width: 330px;position: absolute; right: 30px;top: 0px;" class="col-sm-3 box003">
                                    <p class="location" style="display: inline-block"><b>经度:</b><span class="jd">121.32E</span></p>
                                    <p class="location" style="display: inline-block"><b>纬度:</b><span class="wd">33.53N</span></p>
                                    <p class="location" style="display: inline-block"><b>航向:</b><span class="hx">120°</span></p>
                                    <p class="location " style="display: inline-block"><b>航速:</b><span class="hs">XXKN</span></p>
                                    <iframe name="myFrame" src="${ctx}/gis/toGisTemp" id="gisIfm" frameborder="0" height="165" width="200"></iframe>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingtwo">
                        <h4 class="panel-title">
                            <a href="#qingk2" data-toggle="collapse" data-parent="#qingkuang"><i
                                    class="glyphicon glyphicon-hand-down"></i>产品基本信息</a>
                        </h4>
                    </div>
                    <div id="qingk2" class="panel-collapse collapse" aria-labelledby="headingtwo">
                        <div class="panel-body" style="min-height:500px;">
                            <div style="margin-top:55px;">
                                <div class="col-sm-3" style="height:400px;overflow: scroll;overflow-x: hidden">
                                    <ul id="shipTree" class="ztree">

                                    </ul>
                                </div>
                                <div class="col-sm-9">
                                    <table class="personTable zTreeContent" >
                                        <tbody>
                                        <tr>
                                            <td align="right" width="30%">产品名称:</td>
                                            <td align="left"><div id="pName"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">产品编号:</td>
                                            <td align="left"><div id="pNum"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">产品制造企业:</td>
                                            <td align="left"><div id="pEntName"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">产品型号:</td>
                                            <td align="left"><div id="pProdutModel"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">产品认可证书编号:</td>
                                            <td align="left"><div id="pProductCert"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">产品检验时间:</td>
                                            <td align="left"><div id="pcheckTime"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">验船师:</td>
                                            <td align="left"><div id="resppersonName"></div></td>
                                        </tr>
                                        <tr>
                                            <td align="right" width="30%">附件:</td>
                                            <td align="left">——</td>
                                        </tr>

                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            <script id="productType" type="text/template">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <!-- Modal -->
                                        <div class="revie w">
                                            <span>产品类别：</span>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r1">
                                                <label for="r1">舾装部件</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r2">
                                                <label for="r1">船用材料</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r3">
                                                <label for="r1">轮机设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r4">
                                                <label for="r1">电器设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r6">
                                                <label for="r1">救生设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r7">
                                                <label for="r1">信号设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r8">
                                                <label for="r1">消防设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r9">
                                                <label for="r1">防污染设备</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="r10">
                                                <label for="r1">其他</label>
                                            </div>
                                            <br>
                                            <span>产品名称：</span>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="n1">
                                                <label for="n1">水密门</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="n2">
                                                <label for="n1">防火门</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="n3">
                                                <label for="n1">防爆舷窗</label>
                                            </div>
                                            <br>
                                            <span>产品编号：</span>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="b1">
                                                <label for="b1">YXS001</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="b2">
                                                <label for="b1">YXS002</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="b3">
                                                <label for="b1">YXS003</label>
                                            </div>
                                            <div class="item_icon">
                                                <input class="magic-checkbox" type="checkbox" name="layout" id="b4">
                                                <label for="b1">YXS004</label>
                                            </div>

                                        </div>
                                        <br>
                                        <br>
                                        <br>
                                        <br>
                                    </div>
                                    <div style="text-align: center;" class="col-sm-12">
                                        <button class="btn-time">确认</button>
                                    </div>
                                </div>
                            </script>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <script id="productFilter4" type="text/template">
        <span>产品型号：</span>

        <? for(var i = 0;i<content.length;i++) { ?>

        <div class="item_icon">
            <input class="magic-checkbox" type="radio" value="<?= content[i].name ?>" name="productFil3" id="<?= content[i].name ?>">
            <label for="<?= content[i].name ?>"><?= content[i].name ?></label>
        </div>

        <?  }  ?>
    </script>
    <script id="productFilter3" type="text/template">
        <span>产品型号：</span>

        <? for(var i = 0;i<content.length;i++) { ?>

        <div class="item_icon" style="width: 110px;">
            <input class="magic-checkbox" type="radio" value="<?= content[i].name ?>" name="productFil3" id="<?= content[i].name ?>">
            <label for="<?= content[i].name ?>"><?= content[i].name ?></label>
        </div>

        <?  }  ?>
    </script>
    <!--产品 -->
    <script id="productFilter2" type="text/template">
        <span>产品名称：</span>

        <? for(var i = 0;i<content.length;i++) { ?>

        <div class="item_icon" style="width:110px;">
            <input class="magic-checkbox" type="radio" value="<?= content[i].name ?>" name="productFil2" id="<?= content[i].name ?>">
            <label for="<?= content[i].name ?>"><?= content[i].name ?></label>
        </div>

        <?  }  ?>
    </script>
    <script id="productReview" type="text/template">
        <div class="row">
            <div class="col-sm-12">
                <!-- Modal -->
                <ul class="nav nav-tabs" role="tablist" id="shipTab">
                    <li role="presentation" class="active"><a href="#productFil" aria-controls="productFil" role="tab" data-toggle="tab">产品类别筛选</a></li>
                    <%--<li role="presentation"><a href="#shipFil" aria-controls="shipFil" role="tab" data-toggle="tab">渔船追溯环节筛选</a></li>--%>
                </ul>
                <div class="tab-content" id="shipTabContent">
                    <div role="tabpanel" class="tab-pane active" id="productFil">
                        <div class="shipFilter">
                            <span>产品类别：</span>
                            <? for(var i = 0;i<content.length;i++) { ?>
                               <div class="item_icon" style="width:110px;">
                                   <input class="magic-checkbox" val="<?= content[i].checkUid ?>" type="radio" value="<?= content[i].name ?>" name="productFil" id="<?= content[i].name ?>">
                                   <label for="<?= content[i].name ?>"><?= content[i].name ?></label>
                               </div>
                            <?  }  ?>
                        </div>
                        <div class="shipFilter2"></div>
                        <div class="shipFilter3"></div>

                    </div>
                    <%--<div role="tabpanel" class="tab-pane" id="shipFil">--%>
                        <%--<div class="item_icon">--%>
                            <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c1">--%>
                            <%--<label for="c1">建造检验</label>--%>
                        <%--</div>--%>
                        <%--<div class="item_icon">--%>
                            <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c2">--%>
                            <%--<label for="c2">年度检验</label>--%>
                        <%--</div>--%>
                        <%--<div class="item_icon">--%>
                            <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c3">--%>
                            <%--<label for="c3">监督抽查</label>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                </div>
            </div>
            <br>
            <br>
            <br>                                                                                                       
            <br>
            <div style="text-align: center;" class="col-sm-12">
                <button class="btn-time productFilterBtn">确认</button>
            </div>
        </div>
    </script>


    <script id="shipReview" type="text/template">
        <div class="row">
            <div class="col-sm-12">
                <!-- Modal -->
                <ul class="nav nav-tabs" role="tablist" id="shipTab2">
                    <li role="presentation" class="active"><a href="#productFil" aria-controls="productFil" role="tab" data-toggle="tab">渔船追溯环节</a></li>
                    <%--<li role="presentation"><a href="#shipFil" aria-controls="shipFil" role="tab" data-toggle="tab">渔船追溯环节筛选</a></li>--%>
                </ul>
                <div class="tab-content" id="shipTabContent2">
                    <div role="tabpanel" class="tab-pane active" id="productFil">
                        <div class="shipFilter">
                            <span>追溯环节：</span>
                            <? for(var i = 0;i<content.length;i++) { ?>
                            <div class="item_icon" style="width:110px;">
                                <input class="magic-checkbox" type="checkbox" value="<?= content[i].id ?>" name="productFil" id="<?= content[i].name ?>">
                                <label for="<?= content[i].name ?>"><?= content[i].name ?></label>
                            </div>
                            <?  }  ?>
                        </div>
                    </div>
                    <%--<div role="tabpanel" class="tab-pane" id="shipFil">--%>
                    <%--<div class="item_icon">--%>
                    <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c1">--%>
                    <%--<label for="c1">建造检验</label>--%>
                    <%--</div>--%>
                    <%--<div class="item_icon">--%>
                    <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c2">--%>
                    <%--<label for="c2">年度检验</label>--%>
                    <%--</div>--%>
                    <%--<div class="item_icon">--%>
                    <%--<input class="magic-checkbox" type="checkbox" name="layout" id="c3">--%>
                    <%--<label for="c3">监督抽查</label>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                </div>
            </div>
            <br>
            <br>
            <br>
            <br>
            <div style="text-align: center;" class="col-sm-12">
                <button class="btn-time productFilterBtn">确认</button>
            </div>
        </div>
    </script>

    <div >

    </div>

    <div class="row" style="background-color: #0A1838;margin: 0px 0px;">
        <%--TODO 筛选屏蔽--%>
        <div style="overflow: hidden;" class="col-sm-12">
            <%--TODO 屏蔽按钮--%>
                <div class="layui-btn-group filterBtn">
                    <button id="arrowDown" class="layui-btn">产 品 类 别 筛 选</button>
                    <button id="ship" class="layui-btn">渔 船 追 溯 环 节 筛 选</button>
                    <button id="refreshBtn" class="layui-btn layui-btn-sm">
                        <i class="layui-icon">&#x1002;</i>
                    </button>
                    <%--<a id="refreshBtn"  class="glyphicon glyphicon-repeat" ></a>--%>
                </div>

                <div id="filterContent">

                </div>

            <%--<a id="arrowDown" href="#timeMove01" class="glyphicon glyphicon-filter" ></a>--%>
            <%--刷新按钮--%>


            <div id="timeMove"  class="timeShow">
                <span id="goL" class="turnLeft move"></span>
                <ul class="timeNews">
                    <li><a href='javascript:;'><span style='display: none'></span></a></li>
                </ul>
                <span id="goR" class="turnRight move"></span>
            </div>
        </div>
        <div id="timeMove01" style="margin-bottom: 20px;"  class="col-sm-12">
              <div style="z-index: 100" class="col-sm-6">
                    <div class="repairBox box" style="height: 395px;border: 2px solid #0F2373; border-right: none;">
                        <div class="port-4 effect-3  m-envelope">
                            <div class="item2">
                                <div class="m-envelope-img">
                                    <%--<img src="${ctx}/resources/style/images/zy.png" alt="">--%>
                                </div>
                            </div>
                            <div style="border-right: 142px solid #999999;top: 0px;" class="item"></div>
                            <div class="text-desc00" id="shipContentHtml">
                                <script id="shipContent" type="text/template">
                                    <h3 class="title01 shipContentTitle">渔船基本信息</h3>
                                    <ul class="informationCompany">
                                        <li><b>船名号：</b><span class="">{{shipname}}</span></li>
                                        <li><b>渔船编码：</b><span class="">{{shipcode}}</span></li>
                                        <li><b>船舶所有人：</b><span class="">{{ownername}}</span></li>
                                        <li><b>船籍港：</b><span class="">{{shipport}}</span></li>
                                        <li><b>船体材质：</b><span class="">{{shipmaterial}}</span></li>
                                        <li><b>船长(m)：</b><span class="">{{shiplength}}</span></li>
                                        <li><b>建造完工日期：</b><span class="">{{completdate}}</span></li>
                                        <li><b>核定航区：</b><span class="">近海航区</span></li>
                                        <li><b>主机功率(kw)：</b><span class="">{{power}}</span></li>
                                    </ul>
                                </script>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                        <!--晃动圆点-->
                    <div style="border:none;height: 395px;" class=" repairBox box text-desc show">
                        <div class="port-4 effect-3">
                            <div class="">
                                <h3 class="title01 timeEvent shipTitle">监督抽查</h3>
                                <ul class="information01 timeEvent01">

                                    <li><b>产品抽查机构</b>：<span>农业部渔业船舶检验局</span></li><li><b> 产品抽查验船师</b>：<span>刘东</span></li><li><b>验船师登船检验次数</b>：<span>2次</span></li><li><b> 抽查基本情况</b>：<span>合格</span></li><li><b>抽查合格率</b>：<span>96%</span></li></ul>
                            </div>
                        </div>
                    </div>
                </div>

        </div>
        </div>
    </div>
</div>
<script type="text/javascript" src='${script}/js/change.js'></script>
<script>
$(function(){

    addBread(sessionStorage.getItem("keyUrl"),sessionStorage.getItem("keyName"));

    //===============layui-breadcrumb

    layui.use('element',function(){
        var element = layui.element();
        element.init();

//        element.on('(bread)filter',function(elem){
//            console.log(elem);
//        })
    });
   
    Array.prototype.unique = function(){
        var res = [];
        var json = {};
        for(var i = 0; i < this.length; i++){
            if(!json[this[i]]){
                res.push(this[i]);
                json[this[i]] = 1;
            }
        }
        return res;
    }
//    timeData ();


//    $("#arrowDown").click(
//            function(){
//                $(this).attr("data-target","#productModal");
//            }
//    );
    //            左右按钮切换
    function startMove() {

    }
//    $("#arrowDown").click(function(){
//        var data = {}
//        var str = template("productReview", data)
//        layer.open({
//            type: 1,
//            skin: 'personTable',
//            closeBtn: '2',
//            content: str,
//            title: "追溯环节筛选",
//            area: ['580px', '300px'],
//            shade: [0.7, '#000']
//        });
//    })
    $("#arrowDownship").click(function(){
        var data = {}
        var str = template("productType", data)
        layer.open({
            type: 1,
            skin: 'personTable',
            closeBtn: '2',
            content: str,
            title: "产品筛选",
            area: ['700px', '350px'],
            shade: [0.7, '#000']
        });
    });
    $(".iconShipsum").click(function(){
        system.post(
            get_root + "/ship/getShipDetail",
            {
                shipcode:$("#shipid").val()
            },
            function (data) {
                var data = {
                    content : data.result
                }
                var str = template("shipInformation", data);
                layer.open({
                    type: 1,
                    skin: 'personTable',
                    closeBtn: '2',
                    content: str,
                    title: "渔船信息展示",
                    area: ['1200px', '600px'],
                    shade: [0.7, '#000']
                });

            }
        );

    });
//    $(".safeScore").click(function(){
//        console.log('1213')
//    })

    function ShipReview(options){
        var loadLayer = null;
        function review(options) {
            var self = this;
        }
        function createTree(chapterTree)
        {
            var treeNodes=[];
            for(var m in chapterTree)
            {
                var domain=chapterTree[m];
                if(domain.id!=undefined && domain.id!='')
                {
                    var node={};
                    node["id"]=domain.id;
                    node["pid"]=domain.pid;
					if("yjml"==domain.pid)
                    {
                        node["name"]=domain.productName+"("+domain.productSum+")";
                    }
                    else
                    {
                        node["name"]=domain.productName;
                    }
                    node["title"]=domain.productName;
                    //node["surId"]=domain.surId;
                    node["entId"]=domain.entId;
                    node["entName"]=domain.entName;
                    node["resppersonId"]=domain.resppersonId;
                    node["resppersonName"]=domain.resppersonName;
                    node["shipCode"]=domain.shipCode;
                    node["shipName"]=domain.shipName;
                    node["checkTime"]=domain.checkTime;
                    node["productType"]=domain.productType;  //"通讯导航设备*"
                    node["productNum"]=domain.productNum;
                    node["productSum"]=domain.productSum;
                    node["productCert"]=domain.productCert;
                    node["checkType"]=domain.checkType;
                    node["produtModel"]=domain.produtModel;  // 产品型号
                    node["shipCheckType"]=domain.shipCheckType;
                    treeNodes.push(node);
                }
            }

            var setting = {
                view: {
                    dblClickExpand: false,//双击节点时，是否自动展开父节点的标识
                    showLine: false,//是否显示节点之间的连线
                    showIcon: false,
                    fontCss: { 'color': 'white', 'font-weight': 'normal' },//字体样式函数
                    selectedMulti: false //设置是否允许同时选中多个节点
                },
                check: {
                    //chkboxType: { "Y": "ps", "N": "ps" },
                    chkStyle: "checkbox",//复选框类型
                    enable: false //每个节点上是否显示 CheckBox
                },
                data: {
                    keep : {  //子节点和父节点属性设置 默认值都为false
                        leaf : true,//zTree 的节点叶子节点属性锁，是否始终保持 isParent = false
                        parent : false//zTree 的节点父节点属性锁，是否始终保持 isParent = true
                    },
                    key: {
                        title:"title"
                    },
                    simpleData: {//简单数据模式
                        enable: true,
                        idKey: "id",
                        pIdKey: "pid",
                        rootPId: "root"
                    }
                },
                callback:
                {
                    beforeClick: function (treeId, treeNode)
                    {
                        if(!treeNode.children)
                        {
                            $("#pName").html(treeNode.name);
                            $("#pNum").html(treeNode.productNum);
                            $("#pEntName").html(treeNode.entName);
                            $("#pProdutModel").html(treeNode.produtModel);
                            $("#pProductCert").html(treeNode.productCert);
                            $("#pcheckTime").html(treeNode.checkTime);
                            $("#resppersonName").html(treeNode.resppersonName);
                        }
                    },
                    onClick: function (event, treeId, treeNode)
                    {
                        zTree = $.fn.zTree.getZTreeObj("menu_tree_left");
                        if ($(event.target).hasClass('ico_close') || $(event.target).hasClass('ico_open')) {
                            zTree.expandNode(treeNode);//如果是父节点，则展开该节点
                        } else {
                            return;
                        }
                    },
                    onDblClick: function (event, treeId, treeNode)
                    {

                    }
                }
            };
            //初始化zTree，三个参数一次分别是容器(zTree 的容器 className 别忘了设置为 "ztree")、参数配置、数据源
            var zTreeObj = $.fn.zTree.init($("#shipTree"), setting, treeNodes);
            zTreeObj.expandAll(false);
        }
        review.prototype = {
            init : function(){
                this.prepareData();
                this.treeData();
                this.traceData();
                this.shipGis();
            },
            shipGis : function(){
                var that = this;
                var shipid = $("#shipid").val();
                    shipid = "3710822014110009";
                $.ajax({
                    url :get_root + "/ship/getShipPos?shipcode="+shipid,
                    type: 'post',
                    dataType : "json",
                    success : function(data){
                        $('.hx').html(data.result.direction+"°");
                        $('.jd').html(data.result.lon);
                        $('.wd').html(data.result.lat);
                        $('.hs').html(data.result.speed+"节");
                        $('#gisIfm').attr('src',"${ctx}/gis/toGisTemp?x="+data.result.lon+"&y="+data.result.lat+" ")

                    }
                })
            },
            //渔船基本信息
            prepareData : function(){
                var that = this;
                var shipid = $("#shipid").val();
                var productid = $("#productid").val();

                system.ajax({
                    url : get_root + "/ship/getShipInformation",
                    data : {
                        shipcode:shipid,
                        pronumber:productid
                    },
                    cb : function(data){
                        console.log(data)
                        that.handleShip(data.result);
                    }
                })
            },
            //获取树的信息
            treeData:function(){
                var that = this;
                var shipid = $("#shipid").val();
                var productid = $("#productid").val();

                system.ajax({
                    url : get_root + "/ship/getProductList",
                    data : {
                        shipcode:shipid,
                        pronumber:productid
                    },
                    cb : function(data){
                        //返回的数据

                        that.filterLayer(data.result);
                        that.handleZtree(data.result);

                        system.ajax({
                            url : get_root + "/system/dict/getDicByCate?cates=190",
                            cb : function(data){
                                //返回的数据
                                that.shipZs(data);
                            }
                        })


                    }
                })


            },
            shipZs : function(data){

               // var str = template("productReview", cpData);

                //渔船追溯环节筛选
                $('#ship').on('click',function(){

                    var result = [];
                    for(var i = 0;i<data.result[190].length;i++){
                        result.push({
                            id : data.result[190][i].dictKey,
                            name : data.result[190][i].dictdataName
                        })
                    }

                    var cpData = {
                        content : result,
                    }

                    var str = template("shipReview", cpData);

                    var index = layer.open({
                        type: 1,
                        skin: 'personTable',
                        closeBtn: '2',
                        content: str,
                        title: "追溯环节筛选",
                        area: ['500px', '500px'],
                        shade: [0.7, '#000'],
                        scrollbar : false
                    });

                    var resultArr = [];

                    $('.productFilterBtn').on('click',function(){
                        var ele = $('input[name=productFil]');
                        for(var i = 0 ;i<ele.length;i++){
                            if(ele[i].checked){
                                var attr = $(ele[i]).attr('value');
                                resultArr.push(attr);


                                // console.log(ele[i])
                            }
                        }
                    })


                })
            },
            //获取追溯信息
            traceData:function(){
                var that = this;
                var shipid = $("#shipid").val();
                var productid = $("#productid").val();
                system.post(
                    get_root + "/ship/getShipHistory",
                    {
                        shipcode:shipid,
                        pronumber:productid
                    },
                    function (data) {
                        //返回的数据
                        that.handTimeLine(data.result,"first");
                    });
            },
            handTimeLine: function(data,type){
                var that = this;
                if(data && data.shipTraceList.length > 0){
                    var result = data.shipTraceList;
                    var arr = [];
                    var allArr = [];
                    var allData;

                    for(var i=0;i<result.length;i++) {
                        var evenArr = [];
                        var content;
                        var color;
                        var id;
                        var curr = result[i].dataList;
                        for(var k=0;k<curr.length;k++){
                            var detailArr = [];
                            switch(curr[k].traceType){
                                case '190_1' :
                                    content = '船具审批';
                                    color = "1";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"审批编号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"船东",
                                        "value":curr[k].entUnit
                                    },{
                                        "key":"审核功率上限",
                                        "value":curr[k].power
                                    },{
                                        "key":"拟作业场所",
                                        "value":curr[k].jobPlace
                                    },{
                                        "key":"pdf",
                                        "value":curr[k].docList
                                    })
                                    break;
                                case '190_2' :
                                    content = '船名号审批';
                                    color = "1";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"审批编号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"审批船名",
                                        "value":curr[k].shipName
                                    },{
                                        "key":"船籍港",
                                        "value":curr[k].shipPort
                                    },{
                                        "key":"船舶所有人",
                                        "value":curr[k].ownerName
                                    },{
                                        "key":"pdf",
                                        "value":curr[k].docList
                                    })
                                    break;
                                case '190_3' :
                                    content = '图纸审查';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                            "key":"图号",
                                            "value":curr[k].drawno
                                        },{
                                            "key":"船型编号",
                                            "value":curr[k].serialNumber
                                        },{
                                            "key":"渔船图纸设计单位",
                                            "value":curr[k].entUnit
                                        },{
                                            "key":"渔船图纸审查受理单位",
                                            "value":curr[k].unitOrg
                                        }, {
                                            "key":"渔船图纸技术审查单位",
                                            "value":curr[k].thirdEnt
                                        }, {
                                            "key":"审图验船师",
                                            "value":curr[k].surveyor
                                        },
                                        {
                                            "key":"图纸修改情况",
                                            "value":curr[k].situation
                                        },
                                        {
                                            "key":"审图收费",
                                            "value":curr[k].money
                                        },
                                        {
                                            "key":"图纸有效期",
                                            "value":curr[k].validityStart + "—" + curr[k].validityEnd
                                        },
                                        {
                                            "key":"pdf文档",
                                            "value":curr[k].docList
                                        }
                                    )
                                    break;
                                case '190_4' :
                                    content = '建造检验';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"造船厂名",
                                        "value":curr[k].entUnit
                                    },{
                                        "key":"渔船检验机构",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"现场验船师",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"渔船主机总功率",
                                        "value":curr[k].power
                                    },{
                                        "key":"建造完工日期",
                                        "value": curr[k].validityEnd
                                    })
                                    break;
                                case '190_5' :
                                    content = '渔船登记';
                                    color = "1";
                                    id = curr[k].refid;
                                    if(curr[k].kindType == 'NULL'){
                                        curr[k].kindType = "";
                                    }
                                    if(curr[k].jobMode == 'NULL'){
                                        curr[k].jobMode = "";
                                    }
                                    detailArr.push({
                                        "key":"所有权登记证书编号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"船名号",
                                        "value":curr[k].shipName
                                    },{
                                        "key":"船籍港",
                                        "value":curr[k].shipPort
                                    },{
                                        "key":"船舶种类",
                                        "value":curr[k].kindType
                                    },{
                                        "key":"生产方式",
                                        "value": curr[k].jobMode
                                    })
                                    break;
                                case '190_6' :
                                    content = '捕捞证审批';
                                    color = "1";
                                    var str = curr[k].validityStart + "—" + curr[k].validityEnd;
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"许可证编号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"船名",
                                        "value":curr[k].shipName
                                    },{
                                        "key":"作业方式",
                                        "value":curr[k].jobMode
                                    },{
                                        "key":"作业场所",
                                        "value":curr[k].jobPlace
                                    },{
                                        "key":"作业时限",
                                        "value":str
                                    })
                                    break;
                                case '190_7' :
                                    content = '年检';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"检验机构",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"检验验船师",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"验船师登船检验次数",
                                        "value":curr[k].insCount
                                    },{
                                        "key":"年度检验问题",
                                        "value":curr[k].question
                                    },{
                                        "key":"检验时间",
                                        "value":curr[k].auditTime
                                    })
                                    break;
                                case '190_8' :
                                    content = '期间检验';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"检验机构",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"检验验船师",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"验船师登船检验次数",
                                        "value":curr[k].insCount
                                    },{
                                        "key":"年度检验问题",
                                        "value":curr[k].question
                                    },{
                                        "key":"检验时间",
                                        "value":curr[k].auditTime
                                    })
                                    break;
                                case '190_9' :
                                    content = '检验机构';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"检验机构",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"检验验船师",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"验船师登船检验次数",
                                        "value":curr[k].insCount
                                    },{
                                        "key":"换证检验存在的问题",
                                        "value":curr[k].question
                                    },{
                                        "key":"检验时间",
                                        "value":curr[k].auditTime
                                    })
                                    break;
                                case '190_10' :
                                    content = '渔船维修';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"渔船维修船厂",
                                        "value":curr[k].entUnit
                                    },{
                                        "key":"维修负责人",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"维修主要情况",
                                        "value":curr[k].situation
                                    },{
                                        "key":"维修时间",
                                        "value":curr[k].auditTime
                                    },{
                                        "key":"维修环节照片",
                                        "value":curr[k].imgList
                                    })
                                    break;
                                case '190_11' :
                                    content = '渔船变更';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"变更登记号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"渔船变更类别",
                                        "value":curr[k].kindType
                                    },{
                                        "key":"渔船船名号变更为",
                                        "value":curr[k].oriShipCode
                                    },{
                                        "key":"原船舶所有人变更情况",
                                        "value":curr[k].oriOwnerName
                                    },{
                                        "key":"临时检验情况",
                                        "value":curr[k].situation
                                    },{
                                        "key":"船网工具指标变更情况",
                                        "value":curr[k].power
                                    },{
                                        "key":"渔船作业类型",
                                        "value":curr[k].jobMode
                                    })
                                    break;
                                case '190_12' :
                                    content = '渔船租赁';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"渔船所有人",
                                        "value":curr[k].ownerName
                                    },{
                                        "key":"渔船租赁方",
                                        "value":curr[k].refid
                                    },{
                                        "key":"租赁时间",
                                        "value":curr[k].validityStart + "—" + curr[k].validityEnd
                                    })
                                    break;
                                case '190_13' :
                                    content = '渔船抵押';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"渔船所有人",
                                        "value":curr[k].ownerName
                                    },{
                                        "key":"渔船抵押方",
                                        "value":curr[k].thirdEnt
                                    },{
                                        "key":"抵押时间",
                                        "value":curr[k].validityStart + "—" + curr[k].validityEnd
                                    })
                                    break;
                                case '190_14' :
                                    content = '临时检验';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key": "检验机构",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"检验验船师",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"验船师登船检验次数",
                                        "value":curr[k].insCount
                                    },{
                                        "key":"年度检验问题",
                                        "value":curr[k].question
                                    },{
                                        "key":"检验时间",
                                        "value":curr[k].auditTime
                                    })

                                    break;
                                case '190_15':
                                    content = '渔船灭失';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"灭失证明书编号",
                                        "value":curr[k].serialNumber
                                    },{
                                        "key":"渔船灭失方式",
                                        "value":curr[k].kindType
                                    },{
                                        "key":"渔船拆解地点",
                                        "value":curr[k].jobPlace
                                    },{
                                        "key":"失踪时间",
                                        "value":curr[k].auditTime
                                    },{
                                        "key":"证明机关",
                                        "value":curr[k].unitOrg
                                    })
                                    break;
                                case '190_16' :
                                    content = '渔船安全技术状况抽查';
                                    color = "2";
                                    id = curr[k].refid;
                                    detailArr.push({
                                        "key":"行动名称",
                                        "value":curr[k].xdname
                                    },{
                                        "key":"组织单位",
                                        "value":curr[k].unitOrg
                                    },{
                                        "key":"行动负责人",
                                        "value":curr[k].surveyor
                                    },{
                                        "key":"主要抽查项目",
                                        "value":curr[k].situation
                                    },{
                                        "key":"主要问题",
                                        "value":curr[k].question
                                    })
                                    break;
                                default:
                                    break;
                            }

                            evenArr.push({
                                "content" : content,
                                "score" : color,
                                "detail": detailArr,
                                "id": id
                            })
                        }
                        var obj = {
                            year : result[i].year,
                            event:  evenArr
                        }
                        allArr.push(obj);
                        var allData = {
                            date : allArr
                        }
                    }
                    that.timeLineDate(allData,type);
                }
            },

            timeLineDate : function(timeData,type){

                var html='';
                var that = this;
                var lastDataHtml = "";
                var lastDataArr = timeData.date;
                var clone = lastDataArr.slice(0);
                var lastData = clone.pop();
                var currData = lastData.event[lastData.event.length - 1].detail;
                var title = lastData.event[lastData.event.length - 1].content;
                $('.shipTitle').html(title);
                for(var i = 0;i<currData.length;i++){
                    lastDataHtml += "<li><b>"+currData[i].key+"</b>：<span>"+currData[i].value+"</span></li>";
                    $(".timeEvent01").empty();
                    $(".timeEvent01").append(lastDataHtml);
                }
                for(var i=0;i<timeData.date.length;i++){
                    html+=("<li><b>"+timeData.date[i].year+"</b></li> ")
                    for(var j=0;j<timeData.date[i].event.length;j++){
                        if(timeData.date[i].event[j].score==="0"){
                            html+=("<li><a class='timeOrange' href='javascript:;'><span class='shipId' style='display: none'>"+timeData.date[i].event[j].id+"</span><span class='year timeOrange' style='display: none'>"+timeData.date[i].event[j].content+"</span></a></li>");
//                         $(".timeNews li a").addClass("timeOrange");
                        }else if(timeData.date[i].event[j].score==="1"){
                            html+=("<li><a class='timeBlue' href='javascript:;'><span class='shipId' style='display: none'>"+timeData.date[i].event[j].id+"</span><span class='year timeBlue' style='display: none'>"+timeData.date[i].event[j].content+"</span></a></li>");
//                         $(".timeNews li a").addClass("timeBlue")
                        }else if(timeData.date[i].event[j].score==="2"){
                            html+=("<li><a class='timeGreen' href='javascript:;'><span class='shipId' style='display: none'>"+timeData.date[i].event[j].id+"</span><span class='year timeGreen' style='display: none'>"+timeData.date[i].event[j].content+"</span></a></li>");
//                         $(".timeNews li a")  .addClass("timeGreen")
                        }
                        
                    }
                    $(".timeNews").html(html);

                    $(".timeNews li a ").click(function(){
                        that.envelope();
                        var str = $(this).children('.year').html();
                        var id = $(this).children('.shipId').html();
                        var html = "";
                        for(var i = 0 ;i<timeData.date.length;i++){
                            var cur = timeData.date[i].event;
                            for(var j = 0;j<cur.length;j++){
                                if(cur[j].id == id){
                                    $('.shipTitle').html(cur[j].content);
                                    var detail = cur[j].detail;
                                    for(var v = 0;v < detail.length;v++){
                                        $(".timeEvent01").empty();
                                        html += "<li><b>"+detail[v].key+"</b>：<span>"+detail[v].value+"</span></li>";
                                        $(".timeEvent01").append(html);
                                    }

                                }
                            }

                        }
                        that.change();
                    })
                }
                $(".timeNews li").hover(
                    function () {
                        $(this).children().children('.year').addClass("timeClick").slideUp().css({"display":"none"});
                        $(this).siblings().children().children('.year').removeClass("timeClick");
                    },
                    function () {
                        $(this).removeClass("timeClick");
                    }
                );


                $(".timeNews li:last").children().children('.year').addClass("timeClick");

                that.envelope();
                that.change();
                that.startMove();
            },
            startMove:function(){

                var that = this;
                var state=0;
                var move = 0;
                var right;
                var rightMove = 0;
                var leftMove = 0;
                var fWidth = $('#timeMove').width();
                var width = $('.timeNews').width();
                $('.timeNews').css({
                    width : "2000px",
                    paddingLeft : '0px'
                })

                // $('#timeMove').css({
                //     "width" : width,
                //     "marginLeft":"-130px"
                // })
                $("#goL").on('click',that.leftClick);
                $("#goR").on('click',that.rightClick.bind(this));
            },
            rightClick:function(){
                    var right =  $('#timeMove').css('marginLeft');
                    var rightMove = -50;
                    var r = parseInt(right) + rightMove;
                    $("#timeMove").animate({"marginLeft": r},500);
            },
            leftClick : function(){
                    var left = $('#timeMove').css('marginLeft');
                    var leftMove = 50;
                    var l = parseInt(left) + leftMove;
                    $("#timeMove").animate({"marginLeft": l},500);
            },
            envelope:function(){
                $(".item2").removeClass("item2-cover");
                var t=setTimeout(function(){
                    $(".item2").addClass("item2-cover");
                },100)
            },
            change : function(){
                $(".item2").removeClass("item2-cover");
                $(".show").removeClass("text-desc01");
                var t=setTimeout(function(){

                    $(".item2").addClass("item2-cover");
                    $(".show").addClass("text-desc01");
                },1300)
            },
            handleShip : function(data){
                var that = this;
                var title = data.shipname;
                setTitleName(title);
                $('.headerTxt').html(title);
                this.handleSimpleData(data);
            },
            handleSimpleData : function(data){
                var str = template('shipSimpleContent',data);
                var shipContent = template('shipContent',data);
                $('#shipContentHtml').html(shipContent);
                $('#shipNews').html(str);
                $('.safeScore').on('click',function(){
                    var data = {};
                    var str = template("safe", data)
                    layer.open({
                        type: 1,
                        skin: 'personTable',
                        closeBtn: '2',
                        content: str,
                        title: "渔船安全指数",
                        area: ['1200px', '580px'],
                        shade: [0.7, '#000']
                    });
                    var safeChart= echarts.init(document.getElementById("safeChart"));
                    var safe_option = {
                        title: {
                        text: '总得分：',
                        textStyle: {
                            fontSize: 18,
                            fontWeight: 'bolder',
                            color: '#fff'
                        },
                        left: 'left',
                        top: '-3px'
                    },
                    color: ["#28B779", "#27A9E3"],
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data: ['分值', '得分'],
                        left: '350px',
                        textStyle: {
                            color: '#fff'          // 图例文字颜色
                        }
                    },
                    radar: {
                        center: ['50%', '50%'],
                        indicator: [
                            {name: '船舶因素（50/50）', max: 50},
                            {name: '人员因素(0/0)', max: 0},
                            {name: '环境因素(0/0)', max: 0},
                            {name: '管理因素(50/50)', max: 50},
                        ]
                    },
                    series: [{
                            name: '分值 vs得分',
                            type: 'radar',
                // areaStyle: {normal: {}},
                            data: [
                            {
                                value: [50,0,0,50],
                                name: '分值'
                            },
                            {
                                value: [50,0,0,50],
                                name: '得分',
                                areaStyle: {
                                    normal: {
                                        color: 'rgba(86, 168, 222, 0.65)'
                                    }
                                }
                            }
                            ]
                        }]
                    };
                    safeChart.setOption(safe_option);
                })
            },
            handleTableOne : function(data){
                  var result = data.childList;
                  var str = template("zTreeTable",result[0]);
                  $('.zTreeContent').html(str);
            },
            handleZtree : function(data){
                createTree(data.productShowList);
            },
            changeTableContent : function(zTreeData){
                  var data = zTreeData.item;
                  var str = template("zTreeTable",data);
                $('.zTreeContent').html(str);
            },
            filterLayer : function(data){
                //cpmc:产品名称
                var that = this;
                var cplb = [];
                var cpmc = [];
                var cpArr = data.productShowList;

                for(var i=1;i<cpArr.length;i++){
                    if("productNum" in cpArr[i]){
                        cpmc.push({
                            name:cpArr[i].productName
                        })
                    }else{
                        cplb.push({
                            name : cpArr[i].productName,
                        })
                    }
                }

                $("#arrowDown").click(function(){
                    var cpData = {
                        content : cplb,
                    }

                    var str = template("productReview", cpData);

                    var index = layer.open({
                        type: 1,
                        skin: 'personTable',
                        closeBtn: '2',
                        content: str,
                        title: "产品类别筛选",
                        area: ['500px', '500px'],
                        shade: [0.7, '#000'],
                        scrollbar : false
                    });
                    var html;
                    var shipHtml;
                    var final = "";
                    var first = "";
                    $('input[name=productFil]').on('click',function(){
                        html = $(this).next().html();
                        shipHtml = html;
                        $('.shipFilter2').html("");
                        $('.shipFilter3').html("");
                        var shipContent2 = {};
                        var shipContent2Arr  = [];
                        for(var i = 1;i<cpArr.length;i++){
                            if(cpArr[i].productName == html){
                                var child = cpArr[i];
                                var myid = cpArr[i].id; //id=0
                                 for(var k = 0;k<cpArr.length;k++){
                                     if(cpArr[k]["pid"] == myid){
                                         shipContent2Arr.push({
                                             name : cpArr[k].productName
                                         })
                                     }
                                 }
                                shipContent2 = {
                                     content : shipContent2Arr
                                }
                                var str = template('productFilter2',shipContent2);
                                $('.shipFilter2').html("<br>"+str);

//                                var fil2;


                                $('input[name=productFil2]').on('click',function(){
                                    var lastStr = $(this).next().html();
                                    final = lastStr;
                                    shipHtml += ","+ lastStr;
                                })
                            }
                        }
                    });
                    $('.productFilterBtn').on('click',function(){
                        if(shipHtml == undefined){
                            layer.msg('请选择筛选项目');
                            return;
                        }else{
                            var strArr = shipHtml.split(',');
                            strArr = strArr.unique();  // ["设备"，"产品"]
                            var str = "<div class='filter'>";
                            var html ;
                            var uid;

                            var ele = $("input[name=productFil2]").val();
                            for(var i = 0;i<cpArr.length;i++){
                                if(cpArr[i].productName == ele){
                                    uid = cpArr[i].checkUid;
                                }
                            }

                            that.refresh(uid,index,that);
                            for(var i = 0 ;i<strArr.length;i++){

                                //$('#filterContent').append('')
                                if(i == 0){
                                    str += "<span class='filterContent'>"+strArr[i]+" </span>  -> ";
                                }else{
                                    str += "<span class='filterContent2'>"+strArr[i]+" </span><span class='closeAll'>x</span></div>";
                                }

                                $('#filterContent').html(str);

                                $('.closeAll').on('click',function(){
                                    $('#filterContent').html('');
                                    $('#refreshBtn').trigger('click');
                                })
                            }
                        }
                    })
                    $('#filterContent').on('click','.filterClose',function(){
                       var ele = $(this).parent();
                       $(ele).remove();
                    })
                })
                //还原初始状态
                $('#refreshBtn').click(function () {
                    shipReview.traceData();
                    $('#filterContent').html('');
                })
            },
            refresh : function(nums,layerName,self){
                var shipid = $("#shipid").val();

                system.post(
                    get_root + "/ship/getProductTrace",
                    {
                        shipcode:shipid,
                        checkUid:nums,
                    },
                    function (data) {
                        if(data){
                            console.log(data);
                            var result = data.result.proShipList;
                            var arr = [];
                            var allArr = [];
                            var allData;
                            for(var i=0;i<result.length;i++){
                                var evenArr = [];
                                var content;
                                var color;
                                var id;
                                var curr = result[i].dataList;
                                for(var k=0;k<curr.length;k++){
                                    var detailArr = [];
                                    switch(curr[k].traceType){
                                        case "190_1" :
                                            content = '船具审批';
                                            color = "1";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"审批编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"船东",
                                                "value":curr[k].entUnit
                                            },{
                                                "key":"审核功率上限",
                                                "value":curr[k].power
                                            },{
                                                "key":"拟作业场所",
                                                "value":curr[k].jobPlace
                                            })
                                            break;
                                        case "190_2" :
                                            content = '船名号审批';
                                            color = "1";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"审批编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"审批船名",
                                                "value":curr[k].shipName
                                            },{
                                                "key":"船籍港",
                                                "value":curr[k].shipPort
                                            },{
                                                "key":"船舶所有人",
                                                "value":curr[k].jobPlace
                                            })
                                            break;
                                        case "190_3" :
                                            content = '图纸审查';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                    "key":"图号",
                                                    "value":curr[k].drawno
                                                },{
                                                    "key":"船型编号",
                                                    "value":curr[k].serialNumber
                                                },{
                                                    "key":"渔船图纸设计单位",
                                                    "value":curr[k].entUnit
                                                },{
                                                    "key":"渔船图纸审查受理单位",
                                                    "value":curr[k].unitOrg
                                                }, {
                                                    "key":"渔船图纸技术审查单位",
                                                    "value":curr[k].thirdEnt
                                                }, {
                                                    "key":"审图验船师",
                                                    "value":curr[k].surveyor
                                                },
                                                {
                                                    "key":"图纸修改情况",
                                                    "value":curr[k].situation
                                                },
                                                {
                                                    "key":"审图收费",
                                                    "value":curr[k].money
                                                },
                                                {
                                                    "key":"图纸有效期",
                                                    "value":curr[k].validityStart + "—" + curr[k].End
                                                },
                                                {
                                                    "key":"pdf文档",
                                                    "value":curr[k].docList
                                                }
                                            )
                                            break;
                                        case "190_4" :
                                            content = '建造检验';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"造船厂名",
                                                "value":curr[k].entUnit
                                            },{
                                                "key":"渔船检验机构",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"现场验船师",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"渔船主机总功率",
                                                "value":curr[k].power
                                            },{
                                                "key":"建造完工日期",
                                                "value": curr[k].validityEnd
                                            })
                                            break;
                                        case "190_5" :
                                            content = '渔船登记';
                                            color = "1";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"所有权登记证书编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"船名号",
                                                "value":curr[k].shipName
                                            },{
                                                "key":"船籍港",
                                                "value":curr[k].shipPort
                                            },{
                                                "key":"船舶种类",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"生产方式",
                                                "value": curr[k].jobMode
                                            })
                                            break;
                                        case "190_6" :
                                            content = '捕捞证审批';
                                            color = "1";
                                            var str = curr[k].validityStart + "—" + curr[k].validityEnd;
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"许可证编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"船名",
                                                "value":curr[k].shipName
                                            },{
                                                "key":"作业方式",
                                                "value":curr[k].jobMode
                                            },{
                                                "key":"作业场所",
                                                "value":curr[k].jobPlace
                                            },{
                                                "key":"作业时限",
                                                "value":str
                                            })
                                            break;
                                        case "190_7" :
                                            content = '年检';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"检验机构",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"检验验船师",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"验船师登船检验次数",
                                                "value":curr[k].insCount
                                            },{
                                                "key":"年度检验问题",
                                                "value":curr[k].question
                                            },{
                                                "key":"检验时间",
                                                "value":curr[k].auditTime
                                            })
                                            break;
                                        case "190_8" :
                                            content = '期间检验';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"检验机构",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"检验验船师",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"验船师登船检验次数",
                                                "value":curr[k].insCount
                                            },{
                                                "key":"年度检验问题",
                                                "value":curr[k].question
                                            },{
                                                "key":"检验时间",
                                                "value":curr[k].auditTime
                                            })
                                            break;
                                        case "190_9" :
                                            content = '检验机构';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"检验机构",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"检验验船师",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"验船师登船检验次数",
                                                "value":curr[k].insCount
                                            },{
                                                "key":"换证检验存在的问题",
                                                "value":curr[k].question
                                            },{
                                                "key":"检验时间",
                                                "value":curr[k].auditTime
                                            })
                                            break;
                                        case "190_10" :
                                            content = '渔船维修';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"渔船维修船厂",
                                                "value":curr[k].entUnit
                                            },{
                                                "key":"维修负责人",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"维修主要情况",
                                                "value":curr[k].situation
                                            },{
                                                "key":"维修时间",
                                                "value":curr[k].auditTime
                                            },{
                                                "key":"维修环节照片",
                                                "value":curr[k].imgList
                                            })
                                            break;
                                        case "190_11" :
                                            content = '渔船变更';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"变更登记号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"渔船变更类别",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"渔船船名号变更为",
                                                "value":curr[k].oriShipCode
                                            },{
                                                "key":"原船舶所有人变更情况",
                                                "value":curr[k].oriOwnerName
                                            },{
                                                "key":"临时检验情况",
                                                "value":curr[k].situation
                                            },{
                                                "key":"船网工具指标变更情况",
                                                "value":curr[k].power
                                            },{
                                                "key":"渔船作业类型",
                                                "value":curr[k].jobMode
                                            })
                                            break;
                                        case "190_12" :
                                            content = '渔船租赁';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"渔船所有人",
                                                "value":curr[k].ownerName
                                            },{
                                                "key":"渔船租赁方",
                                                "value":curr[k].refid
                                            },{
                                                "key":"租赁时间",
                                                "value":curr[k].validityStart + "—" + curr[k].validityEnd
                                            })
                                            break;
                                        case "190_13" :
                                            content = '渔船抵押';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"渔船所有人",
                                                "value":curr[k].ownerName
                                            },{
                                                "key":"渔船抵押方",
                                                "value":curr[k].thirdEnt
                                            },{
                                                "key":"抵押时间",
                                                "value":curr[k].validityStart + "—" + curr[k].validityEnd
                                            })
                                            break;
                                        case "190_14" :
                                            content = '临时检验';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key": "检验机构",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"检验验船师",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"验船师登船检验次数",
                                                "value":curr[k].insCount
                                            },{
                                                "key":"年度检验问题",
                                                "value":curr[k].question
                                            },{
                                                "key":"检验时间",
                                                "value":curr[k].auditTime
                                            })

                                            break;
                                        case "190_15" :
                                            content = '渔船灭失';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"灭失证明书编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"渔船灭失方式",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"渔船拆解地点",
                                                "value":curr[k].jobPlace
                                            },{
                                                "key":"失踪时间",
                                                "value":curr[k].auditTime
                                            },{
                                                "key":"证明机关",
                                                "value":curr[k].unitOrg
                                            })
                                            break;
                                        case "190_16" :
                                            content = '渔船安全技术状况抽查';
                                            color = "2";
                                            id = curr[k].refid;
                                            detailArr.push({
                                                "key":"行动名称",
                                                "value":curr[k].xdname
                                            },{
                                                "key":"组织单位",
                                                "value":curr[k].unitOrg
                                            },{
                                                "key":"行动负责人",
                                                "value":curr[k].surveyor
                                            },{
                                                "key":"主要抽查项目",
                                                "value":curr[k].situation
                                            },{
                                                "key":"主要问题",
                                                "value":curr[k].question
                                            })
                                            break;
                                        case "-1" :
                                            content = '型式认可';
                                            color = "0";
                                            id = curr[k].uuid;
                                            detailArr.push({
                                                "key":"型式认可证书编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"证书有效期",
                                                "value":curr[k].startTime + "—" + curr[k].endTime
                                            },{
                                                "key":"产品名称",
                                                "value":curr[k].productName
                                            },{
                                                "key":"企业名称",
                                                "value":curr[k].auditTime
                                            },{
                                                "key":"地址",
                                                "value":curr[k].entAddr
                                            })
                                            break;
                                        case "-2" :
                                            content = '出厂检验';
                                            color = "0";
                                            id = curr[k].uuid;
                                            detailArr.push({
                                                "key":"产品制造企业",
                                                "value":curr[k].entName
                                            },{
                                                "key":"产品编号",
                                                "value":curr[k].serialNumber
                                            },{
                                                "key":"产品检验验船师",
                                                "value":curr[k].personName
                                            },{
                                                "key":"检验类别",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"检验结果",
                                                "value":curr[k].result
                                            },{
                                                "key":"检验机构",
                                                "value":curr[k].orgName
                                            })
                                            break;
                                        case "-3":
                                            content = '产品装船';
                                            color = "0";
                                            id = curr[k].productNumber;

                                            console.log(curr[k]);
                                            //TODO 验船师字段

                                            detailArr.push({
                                                "key":"产品装船环节",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"验船师",
                                                "value": '1'
                                            },{
                                                "key":"装船时间",
                                                "value":curr[k].insTime
                                            },{
                                                "key":"产品来源",
                                                "value":curr[k].insTime
                                            })
//                                        },{
//                                            "key":"是否旧产品",
//                                            "value":curr[k].result
//                                        })
                                            break;
                                        case "-4" :
                                            content = '产品装船';
                                            color = "0";
                                            id = curr[k].uuid;
                                            detailArr.push({
                                                "key":"产品装船环节",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"验船师",
                                                "value":curr[k].personName
                                            },{
                                                "key":"产品检验验船师",
                                                "value":curr[k].personName
                                            },{
                                                "key":"装船时间",
                                                "value":curr[k].insTime
                                            },{
                                                "key":"检验结果",
                                                "value":curr[k].result
                                            })
                                            break;
                                        case "-5" :
                                            content = '监督抽查';
                                            color = "0";
                                            id = curr[k].uuid;
                                            detailArr.push({
                                                "key":"产品抽查机构",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"产品抽查负责人",
                                                "value":curr[k].personName
                                            },{
                                                "key":"抽查时间",
                                                "value":curr[k].personName
                                            },{
                                                "key":"抽查基本情况",
                                                "value":curr[k].kindType
                                            })
                                            break;
                                        case "-6" :
                                            content = '渔船安全技术状况监督抽查';
                                            color = "0";
                                            id = curr[k].uuid;
                                            detailArr.push({
                                                "key":"产品抽查机构",
                                                "value":curr[k].kindType
                                            },{
                                                "key":"产品抽查负责人",
                                                "value":curr[k].personName
                                            },{
                                                "key":"抽查时间",
                                                "value":curr[k].personName
                                            },{
                                                "key":"抽查基本情况",
                                                "value":curr[k].kindType
                                            })
                                            break;
                                        default:
                                            break;
                                    }
                                    evenArr.push({
                                        "content" : content,
                                        "score" : color,
                                        "detail": detailArr,
                                        "id": id
                                    })

                                }

                                var obj = {
                                    year : result[i].year,
                                    event:  evenArr
                                }

                                allArr.push(obj);   
                                var allData = {
                                    date : allArr
                                }
                            }
                            console.log(allData);
                            self.timeLineDate(allData);
                        }
                    });
                layer.close(layerName);
            }
        }
        return new review(options);
    }

    var shipReview = new ShipReview();

        shipReview.init();
});
</script>