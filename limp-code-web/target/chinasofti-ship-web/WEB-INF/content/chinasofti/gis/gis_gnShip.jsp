<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_渔船检验机构能力分布</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <%--head开始--%>
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css">
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" >

    <script type="text/javascript"  src="${script}/js/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript"  src="${ctx}/resources/script/abc.js"></script>
    <script type="text/javascript"  src="${ctx}/resources/script/system.js"></script>
    <script type="text/javascript" src="${plug}/js-utils/count-number.js"></script>
    <script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <%--head结束--%>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/plug/layui/css/menuStyle.css" >
    <link rel="stylesheet" href="${style}/css/system-construction.css">
    <link rel="stylesheet" href="${ctx}/plug/layui/css/zoomify.min.css" >
    <link rel="stylesheet" href="${plug}/js-utils/ssmk.css">
    <link rel="stylesheet" href="${plug}/js-utils/layui/css/layui.css" >
    <style type="text/css">
        body{
            margin: 0;
            overflow: hidden;
            background: #fff;
            height:100%;
        }
        /*媒体查询*/
        #map{
            height: 900px;
            border:1px solid #3473b7;
        }
        /*能力评分等级样式*/
        #abilityLevel{
            position: absolute;
            top: 14px;
            left: 47px;
            z-index: 1;
            color: #666;
        }
        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .showNews{
            z-index: 999;
            visibility: hidden;
        }
        .detailTal{
            z-index :999;
        }
        .margin10{
            margin-top:10px;
        }
        .search{
            position: absolute;
            z-index: 999;
            right:180px;
            top:18px;
        }
        .search .layui-btn-mini {
            width:70px;
        }
        #infowin{
            border-radius: 5px;
        }
        #detailTable{
            position: absolute;
            z-index: 999;
            height:300px;
            width:758px;
            text-align: center;
            background-color: #122C5B;
            padding:20px;
            color:#fff;
            overflow-y: scroll;
        }
        #detailTable tbody tr td{
            width:85px;
        }
        #detailTable tbody tr:nth-child(even){
            background:#294B6C;
        }
        #detailTable thead td{
            font-size: 18px;
            color:#fff;
            text-align: center;
            line-height: 18px;
        }
        .detailTal{
            background:none;
            top:6%;
            right:-16px;
        }
        .hideNews{
            position: absolute;
            z-index: 99999;
        }
        .aroundShipDetail{
            border-collapse:collapse
        }
        .group{
            text-align: left;
        }
        .groupNum{
            text-decoration: underline;
            font-size: 18px;
            cursor: pointer;
        }
        .yjyShip{
            text-decoration: underline;
            font-size: 18px;
            cursor: pointer;
        }
        #surNews{
            z-index: 9999;
        }
        #GMDSS_datetimepicker1 .input-group-addon, #GMDSS_datetimepicker2 .input-group-addon {
            width: 35px;
            height: 34px;
            padding: 3px;
            margin: auto;
            background: rgba(0,0,0,0.11) url(../../../../../resources/style/images/icon-white.png) -289px -108px no-repeat;
            border: 0px;
        }

        .jieshu,.kaishi{
            display:inline-block;
        }
        .shipDetailContent{
            position: absolute;
            z-index: 9999;
            top:100px;
            right:350px;
            width:354px;
            height: 425px;
            background-color:#fff;
            /*border:2px solid #237fa3;*/
            /*======added in 2018.1.2*/
            border:2px solid #163981;
            opacity: 0.9;
            display:none;
        }
        /*=======added in 2018.1.2=========*/
        .layui-btn-normal{
            background-color:#1e4799;
        }
        .shipDetailContent table{
            width:100%;
            margin:0 auto;
        }

        .shipDetailContent table tr td:nth-child(1){
            width:68px;
        }

        .shipDetailContent table tr td:nth-child(2){
            width:150px;
            padding-left:5px;
        }
        .shipDetailContent table tr td:nth-child(3){
            width:80px;
        }
        .shipDetailContent table tr td:nth-child(4){
            width:80px;
            padding-left:5px;
        }
        .shipDetailContent .title{
            height:30px;
            /*background-color: #237fa3;*/
            /*====added in 2018.1.2*/
            background-color: #163981;
        }
        .shipPIC{
            height:50px;
        }
        .closeImg{
            position: absolute;
            top:3px;
            right:10px;
            cursor: pointer;
        }
        .shipDetailContent .title{
            padding-left :10px;
            line-height:25px;
            color:#fff;
        }
        .shipSafeScore{
            color:#009966;
        }
        .btnContent{
            text-align:center;
        }
        .shipDetailContent .title{
            cursor: move;
        }
        .layui-form .layui-form-select{
            width:145px;
            display: inline-block;
            margin-left:50px;
        }
        .shipDetailContent .layui-btn-mini{
            height:30px;
            line-height: 30px;
            padding:0 8px;
            font-size:14px;
        }
        .shipDetailContent .layui-input{
            height:30px;
        }
        .shipPosition{
            cursor: pointer;
        }
        /*筛选弹框样式*/
        .filterWin{
            border: 2px solid #163981;

        }
        .filterWin .layui-layer-title{
            /*background-color:#237fa3;*/
            /*=======added in 2018.1.2================*/
            background-color:#163981;
            text-align: center;
            color:#fff;
            padding:0 80px 0 70px;
            font-size: 16px;
        }
        /*===========added in 2018.1.2 =========*/
        .layui-form-checked span, .layui-form-checked:hover span{
            background-color: #8ca7d6;
        }
        .layui-form-checked span, .layui-form-checked:hover span{
            background-color: #8ca7d6;
        }
        .layui-form-checked i, .layui-form-checked:hover i{
            color:#8ca8d6;
        }
        /*==================================================*/
        #filterOk{
            width:210px;
            /*background-color:#237fa3;*/
            height:50px;
            font-size:16px;
        }
        /*搜索弹框样式*/
        .searchWin{

        }
        .sResult{
            border: 1px solid #dcdbdb;
            position: absolute;
            z-index: 100;
            width: 41.5%;
            border-top: 0;
            background-color: #fff;
            display:none;
        }
        .sResult li{
            line-height: 20px;
            padding: 0px 10px;
            color: #9d9595;
        }
        .sResult li:hover{
            background: #eee;
            color:#666;
        }
        #shipTimeSearch{
            margin-bottom:3px;
        }
        #shipDate{
            display:inline-block;
            width:215px;
        }
    </style>
    <script type="text/javascript" src="${bt}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <%--layui--%>
    <script type="text/javascript" src="${plug}/layui-v2.2.6/layui.all.js"></script>
    <%--<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/layui.all.js'></script>--%>
    <script type="text/javascript"  src="${script}/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
    <%--搜索插件--%>
    <script type="text/javascript" src="${plug}/js-utils/ssmk.js"></script>

<body onload="init()">

<%--<div id="abilityLevel">--%>
<%--<div class="level1">--%>
<%--<input class="choose y_choose" type="checkbox" value="1"  checked disabled>80-100分<img src="${supermap}/theme/images/green.png" >--%>
<%--</div>--%>
<%--<div class="level2">--%>
<%--<input class="choose p_choose" type="checkbox" value="2"  checked disabled>60-80分<img src="${supermap}/theme/images/blue.png" >--%>
<%--</div>--%>
<%--<div class="level3">--%>
<%--<input class="choose c_choose" type="checkbox" value="3"   checked disabled>0-60分<img src="${supermap}/theme/images/yellow.png">--%>
<%--</div>--%>
<%--</div>--%>
<header>
    <div id="toggle">
            <span>
                <i class="fa fa-bars"></i>
            </span>
        <span class="shu">工具栏</span>
    </div>
    <div id="menu">
        <ul class="unstyled-list">
            <li id="filter">
                <span class="book"></span>
                <i class="fa fa-filter"></i>
                筛选
            </li>
            <li id="search">
                <span class="movies"></span>
                <i class="fa fa-search"></i>
                搜索
            </li>
            <li id="distance">
                <span class="computer"></span>
                <i class="fa fa-arrows-h"></i>
                测距
            </li>
            <li id="shipToHand">
                <span class="home"></span>
                <i class="fa fa-handshake-o"></i>
                人船握手
            </li>
            <li id="cleanLayer">
                <span class="beauty"></span>
                <i class="fa fa-refresh"></i>
                清除
            </li>
            <li id="fullPage">
                <span class="clothing"></span>
                <i class="fa fa-arrows-alt"></i>
                全屏
            </li>
            <li id="refresh" onclick="history.go(0)">
                <span class="refresh"></span>
                <i class="fa fa-reply"></i>
                刷新
            </li>
        </ul>
    </div>
</header>
<%--<div class="legend">--%>
<%--<p>--%>
<%--<img src="${supermap}/theme/images/greenship.png">： <span> 渔船安全技术状况高</span>--%>
<%--</p>--%>
<%--<p>--%>
<%--<img src="${supermap}/theme/images/yellowstop.png">： <span> 渔船安全技术状况中</span>--%>
<%--</p>--%>
<%--<p>--%>
<%--<img src="${supermap}/theme/images/redstop.png">： <span> 渔船安全技术状况低  </span>--%>
<%--</p>--%>
<%--</div>--%>

<%--<div class="search">--%>
<%--<input type="text"  placeholder="请输入渔船编码" id='ship_num'/><input type="button" class="btn layui-btn  layui-btn-radius layui-btn-mini" id='search'  value="点击搜索"/> <input type="button" class="btn layui-btn  layui-btn-radius layui-btn-mini" id='clean'  value="清除"/>--%>
<%--</div>--%>

<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>

<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>

    <div id="detailTable">
        <script type="text/template" id='shipDetail'>
            <table class="aroundShipDetail">
                <thead>
                <tr>
                    <td colspan="9">
                        当前区域渔船列表
                    </td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        序号
                    </td>
                    <td>
                        渔船编码
                    </td>
                    <td>
                        船名号
                    </td>
                    <td>
                        渔船呼号
                    </td>
                    <td>
                        MMSI
                    </td>
                    <td>
                        船长<br>（米）
                    </td>
                    <td>
                        型宽<br>（米）
                    </td>
                    <td>
                        功率<br>（Kw）
                    </td>
                    <td>
                        上次检验时间
                    </td>
                    <td>
                        定位
                    </td>
                </tr>

                <?  for(var i = 0 ; i<content.length;i++) {  ?>
                <tr>
                    <td><?= i+1 ?></td>
                    <td><?= content[i].attributes.shipcode ?></td>
                    <td><?= content[i].attributes.shipName ?></td>
                    <td><?= content[i].attributes.shipCall ?></td>
                    <td><?= content[i].attributes.mmsi ?></td>
                    <td><?= content[i].attributes.shipLength ?></td>
                    <td><?= content[i].attributes.modelWidth ?></td>
                    <td><?= content[i].attributes.power ?></td>
                    <td><?= content[i].attributes.lastCheckDate ?></td>
                    <td code = "<?= content[i].attributes.shipcode ?>"><img class="shipTarget shipPosition" src="${ctx}/resources/style/images/target.png"
                                                                            alt=""></td>
                </tr>
                <? }  ?>
                </tbody>
            </table>
        </script>
        <script type="text/template" id='groupDetail'>
            <table style="width:100%;">
                <thead>
                <tr>
                    <th colspan="7">海外检验点团组情况</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>团组编号</td>
                    <td>团组名称</td>
                    <td>检验时间</td>
                    <td>组长</td>
                    <td>团组状态</td>
                    <td>验船师名单</td>
                    <td>已检验渔船</td>
                </tr>

                <?  for(var i=0 ; i<result.length;i++){  ?>
                <tr>
                    <td><?= result[i].code  ?>  </td>
                    <td><?= result[i].name  ?>  </td>
                    <td><?= result[i].checkTime  ?>  </td>
                    <td><?= result[i].leader  ?>  </td>
                    <td><?= result[i].status  ?></td>
                    <td><?= result[i].surveyor  ?></td>
                    <td><?= result[i].checkedShips  ?></td>
                </tr>

                <?  }  ?>


                </tbody>
            </table>
        </script>
        <script type="text/template" id='groupShipInfo'>
            <table>
                <thead>
                <tr>
                    <th colspan="12">远洋渔船信息</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>序号</td>
                    <td>渔船编码</td>
                    <td>船名号</td>
                    <td>省份</td>
                    <td>渔船呼号</td>
                    <td>检验状态</td>
                    <td>MMSI</td>
                    <td>船长</td>
                    <td>功率</td>
                    <td>上次检验时间</td>
                    <td>方向</td>
                </tr>
                <? for(var i = 0;i<result.length;i++) {  ?>
                <tr>
                    <td><?= result[i].RN  ?></td>
                    <td><?= result[i].CDATE  ?></td>
                    <td><?= result[i].SHIPCODE  ?></td>
                    <td><?= result[i].PROVNAME   ?></td>
                    <td><?= result[i].CALLSIGN   ?></td>
                    <td><?= result[i].CHECKSTATE   ?></td>
                    <td><?= result[i].MMSI   ?></td>
                    <td><?= result[i].LENGTH   ?></td>
                    <td><?= result[i].MODELWIDTH   ?></td>
                    <td><?= result[i].POW   ?></td>
                    <td><?= result[i].CDATE   ?></td>
                    <td><?= result[i].DIRECTION   ?></td>
                </tr>
                <? } ?>
                </tbody>
            </table>
        </script>
    </div>

</div>

<div style="height: 100%">
    <div id="map"></div>
</div>

<script type="text/template" id="filterTemp">
    <table class="personTable">
        <tbody>
        <tr>
            <td>船舶所有人:</td>
            <td><input type="text" name="title" id="shipOwner"  placeholder="请输入船东名称/企业信用代码" autocomplete="off" class="layui-input">  </td>
        </tr>
        <tr>
            <td>检验状态:</td>
            <td class="layui-form" lay-filter="jy">
                <input class="jy" type="checkbox" name="0" title="待检" >
                <input class="jy" type="checkbox" name="1" title="已检" >
                <input class="jy" type="checkbox" name="2" title="脱检" >
            </td>
        </tr>
        <%--新加条件--%>
        <tr>
            <td>船长:</td>
            <td class="layui-form" lay-filter="jy">
                <input class="jy" type="checkbox" name="0" title="0-12m" >
                <input class="jy" type="checkbox" name="1" title="12-24m" >
                <input class="jy" type="checkbox" name="2" title="24m以上" >
            </td>
        </tr>
        <tr>
            <td>船体材质:</td>
            <td class="layui-form" lay-filter="jy">
                <input class="jy" type="checkbox" name="0" title="钢质" >
                <input class="jy" type="checkbox" name="1" title="木质" >
                <input class="jy" type="checkbox" name="2" title="玻璃钢质" >
                <input class="jy" type="checkbox" name="3" title="其他" >
            </td>
        </tr>
        <tr>
            <td>渔船安全指数:</td>
            <td class="layui-form" lay-filter="aq">
                <input type="checkbox" name="0" title="指数高" >
                <input type="checkbox" name="1" title="指数中" >
                <input type="checkbox" name="2" title="指数低" >
            </td>
        </tr>
        <tr>
            <td>一次检验合格率:</td>
            <td class="layui-form" lay-filter="hg">
                <input type="checkbox" name="0" title="合格率高" >
                <input type="checkbox" name="1" title="合格率中" >
                <input type="checkbox" name="2" title="合格率低" >
            </td>
        </tr>
        <tr>
            <td>船龄分布:</td>
            <td class="layui-form" lay-filter="cl">
                <input type="checkbox" name="0" title="0-15年" >
                <input type="checkbox" name="1" title="15-25年" >
                <input type="checkbox" name="2" title="25-35年" >
                <input type="checkbox" name="2" title="35年以上">
            </td>
        </tr>
        <tr>
            <td>特殊状态:</td>
            <td class="layui-form" lay-filter="ts">
                <input type="checkbox" name="0" title="报停渔船" >
                <input type="checkbox" name="1" title="失效渔船" >
            </td>
        </tr>
        </tbody>
    </table>
    <div style="text-align: center;margin-top:15px;">
        <button class="layui-btn layui-btn-normal" id="filterOk">确定</button>
    </div>

</script>

<script type="text/template" id="shipHand">
    <table>
        <tr>
            <td style="width:635px;">
                <label class="layui-form-label">请选择检验日期范围:</label>
                <div class="shijianduan">
                    <!--起止时间-->
                    <div class="kaishi form-group">
                        <label>选择开始时间：</label>
                        <!--指定 date标记-->
                        <div class='input-group date' id='GMDSS_datetimepicker1'>
                            <input type='text' class="form-control"  id="GMDSS_startT" />
                            <span class="input-group-addon">
                                        <span class=""></span>
                                    </span>
                        </div>
                    </div>

                    <!--结束时间-->
                    <div class="jieshu">
                        <label>选择结束时间：</label>
                        <div class='input-group date' id='GMDSS_datetimepicker2'>
                            <input type='text' class="form-control"  id="GMDSS_endT" />
                            <span class="input-group-addon">
                                        <span class=""></span>
                                    </span>
                        </div>
                    </div>
                </div>
                <button class="layui-btn sure filterOk" style="position:absolute;top:30px;right:55px;" id="shipHandBtn">确定</button>
            </td>
        </tr>
    </table>
</script>

<script type="text/template" id="searchTemp">
    <table class="searchTable" style="width:100%;">
        <tbody>
        <tr>
            <td>根据船名号/渔船编码查询:</td>
            <td>
                <input id="searchContent" type="text" name="title" placeholder="请输入船名号/渔船编码" class="layui-input">
                <ul class="sResult">
                    <%--<li>渔船123</li>--%>
                    <%--<li>渔船123</li>--%>
                    <%--<li>渔船123</li>--%>
                    <%--<li>渔船123</li>--%>
                    <%--<li>渔船123</li>--%>
                </ul>
            </td>
            <td><button class="layui-btn layui-btn-normal filterOk" id="shipCode">搜索</button></td>
        </tr>
        <tr>
            <td>根据港口查询:</td>
            <td class="layui-form" >
                <select name="" id="shipPort" lay-filter="shipPort">
                    <option value="0">  请选择港口 </option>
                    <? for(var i = 0;i<port.length;i++)  {  ?>
                    <option value="<?= port[i].name ?>">  <?= port[i].name ?> </option>
                    <?  } ?>
                </select>
            </td>
            <td>
                <button class="layui-btn layui-btn-normal filterOk" id="shipPortSearch">搜索</button>
            </td>
        </tr>
        </tbody>
    </table>
</script>
<div class="shipDetailContent">

</div>

<script type="text/template" id="shipContentWin">
    <div class="title">
    </div>
    <img class="closeImg" src="${ctx}/resources/style/images/shipClose2.png">
    <div style="padding:10px;">
        <table>
            <thead>
            <tr>
                <td>

                </td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td >MMSI:</td>
                <td><?= result.MMSI  ?></td>
                <td>航首向:</td>
                <td><?= result.direction  ?>°</td>
            </tr>
            <tr>
                <td>船舶呼号:</td>
                <td><?= result.callSign ?></td>
                <td>航速:</td>
                <td><?= result.speed ?>节</td>
            </tr>
            <tr>
                <td>类型:</td>
                <td><?= result.jobType ?></td>
                <td>纬度:</td>
                <td><?= result.lat ?></td>
            </tr>
            <tr>
                <td>状态:</td>
                <td><? if(result.speed > 0 ) {  ?>
                    在航
                    <?   }else{    ?>
                    停靠
                    <? } ?></td>
                <td>经度:</td>
                <td><?= result.lon ?></td>
            </tr>
            <tr>
                <td>船长:</td>
                <td><?= result.shipLength ?>米</td>
                <td>型宽:</td>
                <td><?= result.modelWidth ?>米</td>
            </tr>
            <tr>
                <td>照片:</td>
                <td>
                    <? if(result.img_path == "无") {  ?>
                    <img class="shipPIC zoomify" src="${ctx}/resources/style/images/gis404.png" alt="">
                    <? }else { ?>
                    <img class="shipPIC zoomify" src="<?= result.imgUrl ?>" alt="">
                    <? }  ?>
                </td>
                <td>安全指数:</td>
                <td class="shipSafeScore">81分</td>
            </tr>
            <tr>
                <td>船龄:</td>
                <td><?= result.age  ?></td>
                <td>一次检验合格率</td>
                <td></td>
            </tr>
            </tbody>
        </table>
        <p class="layui-form">
            最快到达检验点时间:
            <%--<select name="" id="shipArrive" lay-filter="shipArrive">--%>
            <%--<option value="0">  请选择检验点 </option>--%>
            <%--<? for(var i = 0;i<group.length;i++)  {  ?>--%>
            <%--<option value="<?= group[i].name ?>">  <?= group[i].name ?> </option>--%>
            <%--<?  } ?>--%>
            <%--</select>--%>
            <button class="layui-btn layui-btn-normal layui-btn-mini" id="drawBtn">绘制路线</button>
        </p>
        <hr>
        <div class="btnContent">
            <button class="layui-btn layui-btn-normal layui-btn-mini" >渔船详细档案</button>
            <button class="layui-btn layui-btn-normal layui-btn-mini" >上次检验情况</button>
            <button class="layui-btn layui-btn-normal layui-btn-mini" >渔船生命周期</button>
            <p style="text-align: left;line-height:30px;margin-top:15px;">
                轨迹查询：<input type="text" class="layui-input" id="shipDate" placeholder="仅限查询最近90天内的轨迹数据">
                <button class="layui-btn layui-btn-normal layui-btn-sm" id="shipTimeSearch">查询</button>
            </p>
        </div>
    </div>
</script>
<script type="text/template" id="shipHandContent">
    <div class="title">
        <?= result.shipname ?>
    </div>
    <img class="closeImg" src="${ctx}/resources/style/images/shipClose.png">
    <div style="padding:10px;">
        <table>
            <thead>
            <tr>
                <td>

                </td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>MMSI:</td>
                <td><?= result.MMSI ?></td>
                <td>航首向:</td>
                <td><?= result.direction  ?></td>
            </tr>
            <tr>
                <td>航速:</td>
                <td><?= result.speed ?></td>
                <td>船舶呼号:</td>
                <td><?= result.callSign?></td>
            </tr>
            <tr>
                <td>船舶类型:</td>
                <td><?= result.jobType ?></td>
                <td>纬度:</td>
                <td><?= result.lat ?></td>
            </tr>
            <tr>
                <td>状态:</td>
                <td><? if(result.speed > 0 ) {  ?>
                    在航
                    <?   }else{    ?>
                    停靠
                    <? } ?></td>
                <td>经度:</td>
                <td><?= result.lon ?></td>
            </tr>
            <tr>
                <td>船长:</td>
                <td><?= result.shipLength ?>米</td>
                <td>型宽:</td>
                <td><?= result.modelWidth ?>米</td>
            </tr>
            <tr>
                <td>照片:</td>
                <td>
                    <? if(result.img_path == "无") {  ?>
                    <img class="shipPIC zoomify" src="${ctx}/resources/style/images/gis404.png" alt="">
                    <? }else { ?>
                    <img class="shipPIC zoomify" src="<?= result.imgUrl ?>" alt="">
                    <? }  ?>
                </td>
                <td>安全指数:</td>
                <td class="shipSafeScore">81分</td>
            </tr>
            <tr>
                <td>船龄:</td>
                <td><?= result.age ?>年</td>
                <td style="width:93px;">一次检验合格率</td>
                <td><?= result.rate ?></td>
            </tr>
            <tr style="border-top:1px solid #ddd;">
                <td style="width:68px;">
                    是否合格:</td>
                <td style="width:68px;"><?= result.checkPass?></td>
                <td style="width:68px;">检验时间:</td>
                <td style="width:68px;"><?= result.checkTime ?></td>
            </tr>
            <tr>
                <td style="width:68px;">检验类别:</td>
                <td style="width:68px;"><?= result.checkType ?></td>
                <td style="width:68px;">人船握手:</td>
                <td style="width:68px;">
                    <? if(result.isPass == '1'){    ?>
                    是
                    <?  } else{   ?>
                    否
                    <? }  ?>
                </td>
            </tr>
            <tr>
                <td style="width:68px;">验船师名称:</td>
                <td colspan="3"><?= result.ycsName ?></td>
            </tr>
            </tbody>
        </table>

        <p class="layui-form">
            最快到达检验点时间:

            <select name="" id="shipArrive2" lay-filter="shipArrive2">
                <option value="0">  请选择检验点 </option>
                <? for(var i = 0;i<group.length;i++)  {  ?>
                <option value="<?= group[i].name ?>">  <?= group[i].name ?> </option>
                <?  } ?>
            </select>
        </p>
        <hr>
        <div class="btnContent">
            <button class="layui-btn layui-btn-normal layui-btn-mini" >渔船详细档案</button>
            <button class="layui-btn layui-btn-normal layui-btn-mini" >上次检验情况</button>
            <button class="layui-btn layui-btn-normal layui-btn-mini" >渔船生命周期</button>
        </div>
    </div>
</script>
</body>
<script>
    var get_root='${ctx}';
    var curr_sur = '${surveyor.ycsname}';
    var curr_org = '${orginfo.orgname}';
    var curr_orgcode = '${orginfo.orgcode}';
    <%--var curr_orgcode = '${orginfo.orgcode}';orgcode--%>

</script>
<script>
    function init(){
        var orgBlity = new OrgBlity();
        orgBlity.init();
    }

    function OrgBlity(options){
        //var baseMap = "http://47.92.125.222:8083/iserver/services/map-china400/rest/maps/China_4326";
        var baseMap = system.tiandiUrl;
        //var baseMap = "http://202.127.45.164:8095/iserver/services/map-China1002/rest/maps/China_4326";
        var shipPoint = get_root + "/gis/getInGnShipPos";
        var markUrl = get_root + "/gis/getOceanShipData4";
        var groupUrl = get_root + "/gis/getOceanShipData8";
        var clickUrl =  get_root + "/gis/getOceanShipData2?id=";
        var allUrl  = get_root +   "/gis/getOceanShipData2?";
        var filterUrl = get_root + "/gis/queryOceanShip"
        var searchShipDetail = get_root+"/gis/getGNShipDetail?shipcode=";
        var gnShip = system.gnUrl;
        //量算url
        var measureUrl = system.measureUrl;
        //点击团组的url
        var gruopNum = get_root+ "/gis/getOceanShipData9?orgcode=";
        //点击远洋渔船url
        var groupShip = get_root + "/gis/getOceanShipData11?orgcode=";
        //渔船港口
        var shipPort = get_root + "/gis/getShipPortPos";
        //渔船握手
        var shipHandUrl = get_root + "/gis/surShipHs";
        //渔船轨迹
        var shipTrajectory = get_root + "/gis/getGNShipTrack";
        var shipMap = system.shipUrl;
        var layer1,shipMap,shipDraw,shipPoints,vectorlayer,infowin,s_arr,groupArr,pointFeature,searchShipLayer,infowinPosition,examineLayer,shipPortLayer,selectFeature,shipGroupFeature,shipPortFeature,jyShipLayer,graphicsLayer,markerLayer,layerLoad,lineLayer,drawLine;
        function OrgFun(option) {
            var self = this;
        }
        OrgFun.prototype = {
            check : function(){
                if(!document.createElement('canvas').getContext){
                    alert("您的浏览器不支持 Canvas，请升级！");
                    return false;
                }else{
                    return true;
                }
            },
            init : function(){
                var that = this;
                //检查用户浏览器
                if(!this.check()) return;
                //初始化地图
                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap,null,{maxResolution:"auto",wrapDateLine:true},{transparent: true, cacheEnabled: true});
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});

                vectorlayer = new SuperMap.Layer.Vector("vectorLayer");
                jyShipLayer = new SuperMap.Layer.Vector("jyShip");
                examineLayer = new SuperMap.Layer.Vector("examines");
                shipPortLayer = new SuperMap.Layer.Vector("shipPort");
                graphicsLayer = new SuperMap.Layer.Vector("绘制图层");
                markerLayer = new SuperMap.Layer.Markers("围栏船位");
                lineLayer = new SuperMap.Layer.Vector("lineLayer");
                searchShipLayer = new SuperMap.Layer.Vector("searchShipLayer");
                shipDraw = new SuperMap.Layer.Vector("shipDraw");
                shipPoints = new SuperMap.Layer.Markers("shipPoint");
                //距离测量图层
                var style = {
                    strokeColor: "#304DBE",
                    strokeWidth: 2,
                    pointerEvents: "visiblePainted",
                    fillColor: "#304DBE",
                    fillOpacity: 0.8
                }
                lineLayer.style = style;

                drawLine = new SuperMap.Control.DrawFeature(lineLayer, SuperMap.Handler.Path, { multi: true });

                drawLine.events.on({"featureadded": that.drawCompleted});
                map = new SuperMap.Map("map",{
                    controls: [
                        new SuperMap.Control.ScaleLine(),
                        new SuperMap.Control.Zoom(),
                        new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.Navigation({
                            dragPanOptions: {
                                enableKinetic: true
                            }}),
                        drawLine],
                    projection: "EPSG:4326",
                    allOverlays: true
                });

                //map.minZoom = 1;

                map.events.on({"mousemove":function(e){
                        infowinPosition = e.xy.clone();
                        // 偏移
                        infowinPosition.x += 20;
                        infowinPosition.y -= 20;
                    }});

                var callbacks={
                    click: that.shipClick.bind(this)
                };

                selectFeature = new SuperMap.Control.SelectFeature([vectorlayer,examineLayer,shipPortLayer,jyShipLayer,graphicsLayer,searchShipLayer], {callbacks: callbacks});

                map.addControls([selectFeature]);

                $('#toggle').on('click', function() {
                    $('header').toggleClass('open')
                });
            },
            addLayer : function(){
                var that = this;
                //layerLoad = layer.load(3);
                shipMap = new SuperMap.Layer.TiledDynamicRESTLayer("ship", gnShip, {transparent: true, cacheEnabled: true});
                shipMap.events.on({"layerInitialized":that.addLayer2.bind(this)});

                //that.addMarker();
                //  map.events.on({'zoomend':that.listenZoom.bind(this)});
                //   map.events.on({'move':debounce(that.listenZoom.bind(this),250)});
                map.events.on({'moveend':that.listenZoom.bind(this)});

//                //团组
//                //that.addGroup();
//                //港口
//                that.addShipPort();
//                //search部分弃用
//                //that.search();
//                //人船握手
//                that.shipHand();
//                //搜索部分
//                that.searchContent();
//                //测距部分
//                that.distance();
//                //清除图层
//                that.cleanLayer();
//                //全屏
//                that.setFullPage();

            },
            addLayer2 : function(){
                var that = this;
                map.addLayers([layer1,shipMap,shipDraw,shipPoints,vectorlayer,searchShipLayer,examineLayer,markerLayer,shipPortLayer,graphicsLayer,jyShipLayer,lineLayer]);
                //map.setCenter(new SuperMap.LonLat(24.4335937500, -7.3624668655),2);
                map.setCenter(new SuperMap.LonLat(108.067923, 22.679943),3);
                selectFeature.activate();
                //窗口移动
                that.divMove();
                //全屏
                that.setFullPage();
                //筛选部分
                that.filter();


            },
            divMove : function(){
                $('.shipDetailContent').draggable({
                    handle : '.title'
                });
                $('.shipDetailContent').on('click','.closeImg',function(){
                    $('.shipDetailContent').css({
                        "display" : "none"
                    })
                })
            },
            setFullPage : function(){
                $('#fullPage').on('click',function(){
                    var docElm = document.documentElement;
                    //W3C
                    if (docElm.requestFullscreen) {
                        docElm.requestFullscreen();
                    }
                    //FireFox
                    else if (docElm.mozRequestFullScreen) {
                        docElm.mozRequestFullScreen();
                    }
                    //Chrome等
                    else if (docElm.webkitRequestFullScreen) {
                        docElm.webkitRequestFullScreen();
                    }
                    //IE11
                    else if (elem.msRequestFullscreen) {
                        elem.msRequestFullscreen();
                    }
                })
            },
            cleanLayer : function(){
                $('#cleanLayer').on('click',function(){
                    lineLayer.removeAllFeatures();
                    graphicsLayer.removeAllFeatures();
                    markerLayer.clearMarkers();

                })
            },
            measureError : function(measureEventArgs){
                console.log(measureEventArgs);
            },
            drawCompleted : function(drawGeometryArgs){
                drawLine.deactivate();
                var geometry = drawGeometryArgs.feature.geometry,
                    measureParam = new SuperMap.REST.MeasureParameters(geometry),
                    myMeasuerService = new SuperMap.REST.MeasureService(measureUrl);
                myMeasuerService.events.on({ "processCompleted": function(measureEventArgs){
                        var distance = measureEventArgs.result.distance;
                        var unit = measureEventArgs.result.unit;
                        layer.msg("量算结果"+distance+"米")
                    } });

                myMeasuerService.measureMode = SuperMap.REST.MeasureMode.DISTANCE;

                myMeasuerService.processAsync(measureParam);
            },
            distance : function(){
                var that = this;
                $('#distance').on('click',function(){
                    that.clearFeatures();
                    drawLine.activate();
                })
            },
            //清除之前line残留
            clearFeatures : function(){
                lineLayer.removeAllFeatures();
            },
            shipHand : function(){
                var str =  template("shipHand",{})

                $('#shipToHand').on('click',function(){
                    var searchLayer = layer.open({
                        type : 1,
                        title:"人船握手",
                        offset :"150px",
                        skin : "filterWin",
                        area : ['680px', '487px'],
                        content : str
                    })
                    var strB = "";
                    var strE = "";
                    $('#GMDSS_startT').datetimepicker({
                        format: "yyyy-mm-dd",
                        todayBtn: 'linked',
                        autoclose: true,
                        todayHighlight: true,
                        language: 'zh-CN',
                        minView: 'month',
                        endDate: new Date()
                    }).on('changeDate', function (e) {
                        var startTime = e.date;
                        var date =  new Date(startTime);
                        strB =   date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
                    });
                    $('#GMDSS_endT').datetimepicker({
                        format: "yyyy-mm-dd",
                        todayBtn: 'linked',
                        autoclose: true,
                        todayHighlight: true,
                        language: 'zh-CN',
                        minView: 'month',
                        endDate: new Date()
                    }).on('changeDate', function (e) {
                        var endTime = e.date;
                        var date =  new Date(endTime)
                        strE =   date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
                    });

                    $('#shipHandBtn').on('click',function(){
                        if(strE == "" || strB == ""){
                            layer.msg("请先填写指定日期");
                            return;
                        }
                        var obj = {
                            bYear:strB,
                            eYear:strE
                        }
                        $.ajax({
                            url: shipHandUrl,
                            type: 'post',
                            data : obj,
                            dataType: 'json',
                            beforeSend : function(){
                                layerLoad = layer.load(3)
                            },
                            success : function(data){
                                vectorlayer.removeAllFeatures();
                                console.log(data.result)
                                layer.close(layerLoad);
                                layer.close(searchLayer);
                                var result = data.result;
                                var images;
                                for(var i = 0;i<result.length;i++){
                                    if(result[i].isPass == "1"){
                                        images = "${supermap}/theme/images/shipHandComplate.png";
                                    }else if (result[i].isPass == "2"){
                                        images = "${supermap}/theme/images/shipHandError.png"
                                    }
                                    var curr = result[i];
                                    var x = curr.lon;
                                    var y = curr.lat;
                                    var point= new SuperMap.Geometry.Point(x,y);
                                    pointFeature = new SuperMap.Feature.Vector(point);
                                    pointFeature.attributes = {
                                        ycbm : result[i].ycbm,
                                        checkPass : result[i].checkPass,
                                        checkTime : result[i].checkTime,
                                        checkType : result[i].checkType,
                                        isPass : result[i].isPass,
                                        ycsName : result[i].ycsName
                                    }
                                    pointFeature.style={
                                        pointRadius:16,
                                        externalGraphic : images
                                    };
                                    jyShipLayer.addFeatures(pointFeature);
                                }
                            }
                        })
                    })


                })

            },
            addShipPort : function(){
                var that = this;
                $.ajax({
                    url: shipPort,
                    type: 'get',
                    dataType: 'json',
                    success : function(data){
                        console.log(data);
                        var result = data.result;
                        for(var i = 0;i<result.length;i++){
                            var curr = result[i];
                            var x = curr.lon;
                            var y = curr.lat;
                            var point= new SuperMap.Geometry.Point(x,y);
                            pointFeature = new SuperMap.Feature.Vector(point);
                            pointFeature.attributes = {
                                provname : result[i].provname,
                                name : result[i].name
                            }
                            pointFeature.style = {
                                pointRadius:8,
                                externalGraphic : "${supermap}/theme/images/shipPort.png"
                            };
                            shipPortLayer.addFeatures(pointFeature);

                        }
                    }
                })
            },
            shipPortClick : function(e){
                var that = this;
                if(e.geometry){
                    var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                        +"<table class='group'>"
                        +"<tr>"
                        +"<td>渔港名称：</td><td>"+e.attributes.name+"</td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>渔港所属省份：</td><td>"+e.attributes.provname+"</td>"
                        +"</tr>"
                        +"</table>"
//                        +"<tr>"
//                        +"<td>渔船电子围栏：</td><td><button class='aroundShip'>查看附近的渔船</button></td>"
//                        +"</tr>"
                    var lonLat = map.getLonLatFromPixel(infowinPosition);

                    var options = {
                        x : lonLat.lon,
                        y : lonLat.lat,
                        width: 220,
                        height: 100
                    };
                    that.showPopup(map, options, contentHTML);
                }

            },
            searchContent : function(){
                var that = this;
                $('#search').on('click',function(){
                    $.ajax({
                        url: shipPort,
                        type: 'get',
                        dataType: 'json',
                        beforeSend : function(){
                            layerLoad = layer.load(3)
                        },
                        success: function (data){
                            layer.close(layerLoad);
                            var str = template('searchTemp',{
                                port : data.result
                            });
                            var searchLayer = layer.open({
                                type : 1,
                                title:"查询",
                                offset :"150px",
                                skin : "filterWin",
                                area : ['504px', '487px'],
                                content : str
                            })
                            var seleHtml;
                            layui.use('form', function(){
                                var form = layui.form();
                                //必加此行代码激活layui属性
                                form.render();
                                form.on('select(shipPort)', function(data){
                                    seleHtml = data.value;
                                });
                            })

                            $('#searchContent').on('input propertychange',function(){
                                var html = $(this).val();
                                if(html){
                                    $('.sResult').find('li').remove();
                                    $.ajax({
                                        type:'post',
                                        url:get_root+'/index/s',
                                        dataType:'json',
                                        data:{
                                            key:html,
                                            type:4,
                                            page:1,
                                            pageSize:5
                                        },
                                        success:function(data){
                                            var data = JSON.parse(data.result);
                                            var liCon='';
                                            for(var i in data){
                                                console.log(data[i])
                                                liCon = "<li>"+data[i]['NAME']+"</li>";
                                                $('.sResult').append(liCon);
                                            }
                                            $('.sResult').css('display','block');
                                            $('.sResult li').click(function(){
                                                var html = $(this).text();
                                                $('.sResult').css('display','none');
                                                $("#searchContent").val(html);
                                                $('#shipCode').on('click',function(){
                                                    if(html != ""){
                                                        if(isNaN(Number(html))){
                                                            layer.close(searchLayer);
                                                            var features = vectorlayer.getFeaturesByAttribute("shipName",html);
                                                            if(!features || features.length==0){
                                                                alert("没有船名为" + html + "的渔船");
                                                                return;
                                                            }
                                                            var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);
                                                            map.setCenter(lonlat, 6);
                                                            var ele = features[0];

                                                            ele.style.externalGraphic = "${supermap}/theme/images/twinkle.gif";
                                                            vectorlayer.redraw();
                                                            //console.log(ele)
                                                        }else{
                                                            layer.close(searchLayer);
                                                            var features = vectorlayer.getFeaturesByAttribute("shipcode",html);
                                                            var ele = features[0];
                                                            //与zoom事件冲突
                                                            //ele.style.externalGraphic = "${supermap}/theme/images/twinkle.gif";
                                                            if(!features || features.length==0){
                                                                alert("没有编号为" + html + "的渔船");
                                                                return;
                                                            }
                                                            var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);
                                                            map.setCenter(lonlat, 6);
                                                            var ele = features[0];
                                                            ele.style.externalGraphic = "${supermap}/theme/images/twinkle.gif";
                                                            vectorlayer.redraw();
                                                            //console.log(ele);
                                                        }
                                                    }
                                                })
                                            })

                                        }
                                    })
                                }else if(html == ""){
                                    $('.sResult').css('display','block');
                                }
                            })

                            $('#shipPortSearch').on('click',function(){
                                for(var i = 0 ; i<data.result.length;i++){
                                    var curr = data.result[i];
                                    if(curr.name == seleHtml){
                                        that.aroundShip(curr,searchLayer);
                                    }
                                }
                            })

                        }
                    })

                })
            },
            listenZoom : function(){
                var that = this;
                var zoomNum = map.getZoom();
                if(zoomNum >= 8){
                    //左上角坐标
                    var pixcelLeftTop = new SuperMap.Pixel(0,0,"SuperMap.Pixel.Mode.LeftTop");
                    var leftTopLonLat = map.getLonLatFromPixel(pixcelLeftTop);
                    //右下角坐标
                    var div = map.getSize();
                    var pixcelRightBottom = new SuperMap.Pixel(div.w,div.h,"SuperMap.Pixel.Mode.LeftTop");
                    var rightBottomLonLat = map.getLonLatFromPixel(pixcelRightBottom);

                    var obj = {
                        x1 : leftTopLonLat.lon,
                        y1 : leftTopLonLat.lat,
                        x2 : rightBottomLonLat.lon,
                        y2 : rightBottomLonLat.lat
                    }

                    var arr = [];
                    //ajax请求
                    $.ajax({
                        url : shipPoint,
                        type : 'post',
                        dataType : 'json',
                        data : obj,
                        success : function(data){
                            that.addMarker(data);

                        }
                    })
                }else if(zoomNum < 13){
                    that.resetLayer();
                }
//
//                if(zoomNum >= 4){
//                    that.changeShipImg("big");
//                }else if(zoomNum < 4){
//                    that.changeShipImg("small");
//                }
            },
            resetLayer : function(){
                shipMap.setVisibility(true);
                vectorlayer.removeAllFeatures();
            },
            changeShipImg : function(size) {
                var ele = vectorlayer.features;
                var ele2 = searchShipLayer.features;
                if(size == 'big'){
                    for(var  i = 0 ;i<ele.length;i++){
                        ele[i].style.externalGraphic = "${supermap}/theme/images/greenship.png";
                        ele[i].style.pointRadius = "8";
                    }
                    for(var i = 0;i<ele2.length;i++){
                        ele2[i].style.externalGraphic = "${supermap}/theme/images/greenship.png";
                        ele2[i].style.pointRadius = "8";
                    }
                    vectorlayer.redraw();
                    searchShipLayer.redraw();
                }else if(size == 'small'){
                    for(var  i = 0 ;i<ele.length;i++){
                        ele[i].style.externalGraphic = "${supermap}/theme/images/shipGreenPoint.png";
                        ele[i].style.pointRadius = "16";
                    }
                    for(var i = 0;i<ele2.length;i++){
                        ele2[i].style.externalGraphic = "${supermap}/theme/images/shipGreenPoint.png";
                        ele2[i].style.pointRadius = "16";
                    }
                    vectorlayer.redraw();
                    searchShipLayer.redraw();
                }
            },
            filter : function(){
                var that = this;
                $('#filter').on('click',function(){
                    var str = template('filterTemp',{});
                    var filterLayer = layer.open({
                        type : 1,
                        title:"筛选",
                        offset :"100px",
                        skin: 'filterWin',
                        area : ['625px', '630px'],
                        content : str
                    })

                    layui.use('form', function(){
                        var form = layui.form;
                        //必加此行代码激活layui属性
                        form.render();
                        //各种基于事件的操作
                        $('#filterOk').on('click',function(){
                            var dom =    $('td[lay-filter="jy"] .layui-form-checked span');
                            var dom2 =   $('td[lay-filter="aq"] .layui-form-checked span');
                            var dom3 =   $('td[lay-filter="hg"] .layui-form-checked span');
                            var dom4 =   $('td[lay-filter="cl"] .layui-form-checked span');
                            var arr = {
                                status : [],
                                safeScore : [],
                                rate : [],
                                age : []
                            };
                            for(var i = 0 ; i<dom.length;i++){
                                switch($(dom[i]).html()){
                                    case "待检":
                                        arr.status.push(0);
                                        break;
                                    case "已检":
                                        arr.status.push(1);
                                        break;
                                    case "脱检":
                                        arr.status.push(2);
                                        break;
                                }
                            }
                            for(var i = 0 ; i<dom2.length;i++){
                                switch($(dom2[i]).html()){
                                    case "指数高":
                                        arr.safeScore.push(0);
                                        break;
                                    case "指数中":
                                        arr.safeScore.push(1);
                                        break;
                                    case "指数低":
                                        arr.safeScore.push(2);
                                        break;
                                }
                            }
                            for(var i = 0 ; i<dom3.length;i++){
                                switch($(dom3[i]).html()){
                                    case "合格率高":
                                        arr.rate.push(0);
                                        break;
                                    case "合格率中":
                                        arr.rate.push(1);
                                        break;
                                    case "合格率低":
                                        arr.rate.push(2);
                                        break;
                                }
                            }
                            for(var i = 0 ; i<dom4.length;i++){
                                switch($(dom4[i]).html()){
                                    case "0-15年":
                                        arr.age.push(0);
                                        break;
                                    case "15-25年":
                                        arr.age.push(1);
                                        break;
                                    case "25-35年":
                                        arr.age.push(2);
                                        break;
                                    case "35年以上":
                                        arr.age.push(3);
                                        break;
                                }
                            }

                            var ownShip = $('#shipOwner').html();

                            var obj = {
                                ownerName : ownShip,
                                status : arr.status.join(","),
                                safeScore : arr.safeScore.join(","),
                                rate : arr.rate.join(","),
                                age : arr.age.join(",")
                            }

                            $.ajax({
                                type: 'post',
                                url : filterUrl,
                                dataType : "json",
                                data : obj,
                                beforeSend : function(){
                                    layerLoad = layer.load(3)
                                },
                                success : function(data){
                                    that.drawMarker(data);
                                    layer.close(filterLayer);
                                }
                            })




                        })

                    });

                })

            },
            addGroup : function(){
                var that = this;
                layerLoad = layer.load(3);
                $.ajax({
                    url: groupUrl,
                    type: 'get',
                    dataType: 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            groupArr = [];
                            for(var i = 0;i<result.length;i++){
                                var curr = result[i];
                                groupArr.push({
                                    name : curr.name,
                                    lon : curr.lon,
                                    lat : curr.lat
                                })
                                var x = curr.lon;
                                var y = curr.lat;
                                var point= new SuperMap.Geometry.Point(x,y);
                                pointFeature = new SuperMap.Feature.Vector(point);
                                pointFeature.attributes = {
                                    address : result[i].address,
                                    groupNums : result[i].groupNums,
                                    name : result[i].name,
                                    orgCode : result[i].orgcode,
                                    shipNums : result[i].shipNums,
                                    lastCheckDate :  result[i].lastCheckDate
                                }
                                pointFeature.style = {
                                    pointRadius:12,
                                    externalGraphic : "${supermap}/theme/images/overseas.png"
                                };
                                examineLayer.addFeatures(pointFeature);
                            }
                        }
                    }
                })
            },
            shipClick :function(e){
                var that = this;
                that.closeInfo();
                var layerName = e.layer.name;
                if(layerName == 'vectorLayer'){
                    that.shipDetail(e);
                }else if(layerName == 'examines'){
                    that.groupShip(e);
                }else if(layerName == 'shipPort'){
                    that.shipPortClick(e);
                }else if(layerName == 'jyShip'){
                    that.jyShipDetail(e);
                }else if(layerName == 'searchShipLayer'){
                    that.drawMarkerShip(e);
                }

            },
            drawMarkerShip : function(e){
                var that = this;
                var code = e.attributes.shipCode;
                $.ajax({
                    url : searchShipDetail+code,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            layer.close(layerLoad);
                            console.log(data);
                            $('.shipDetailContent').css({
                                "display" : "block"
                            });
                            var result = data.result;

                            var str = template('shipContentWin',{
                                result : result,
                                group : groupArr
                            });
                            $('.shipDetailContent').html(str);
                            $('.zoomify').zoomify();
                            layui.use('form', function(){
                                var form = layui.form();
                                //必加此行代码激活layui属性
                                form.render();
                                form.on('select(shipArrive)', function(data){
                                    var seleHtml = data.value;
                                    var portArea;
                                    var shipPort;
                                    for(var i = 0 ;i<groupArr.length;i++){
                                        if(groupArr[i].name == seleHtml){
                                            portArea =  new SuperMap.LonLat(groupArr[i].lon, groupArr[i].lat);
                                            shipPort =  new SuperMap.LonLat(result.lon, result.lat);
                                            var nmi = SuperMap.Util.distVincenty(shipPort,portArea);
                                            nmi = nmi.toFixed(2);
                                            var speed = (result.desspeed * 1.852).toFixed(2)
//                                           TODO传到后台
                                            var hours = (nmi/speed).toFixed(1);
                                            hours = Math.round(hours);
                                            var day = parseInt(Math.round(hours/24));
                                            if(!isNaN(day)){
                                                var arraveDate = that.getDateStr(day);
                                                layer.msg("最快到达检验点的时间"+arraveDate)
                                            }else{
                                                layer.msg("日期不合法")
                                            }

                                        }
                                    }
                                });
                            })


                            $('.shipDetailContent .title').html(e.attributes.shipName);

                        }
                    }
                })
            },
            jyShipDetail : function(e){
                var that = this;
                if(e.geometry){
                    console.log(e);
                    var code = e.attributes.ycbm;
                    $.ajax({
                        url : searchShipDetail+code,
                        type:'get',
                        dataType : 'json',
                        success : function(data){
                            if(data.msg == 'success'){
                                layer.close(layerLoad);
                                console.log(data)
                                $('.shipDetailContent').css({
                                    "display" : "block",
                                    "height" :  "385px",
                                    "width"  : "436px"
                                });
                                var result = data.result;
                                result.checkPass = e.attributes.checkPass;
                                result.checkTime = e.attributes.checkTime;
                                result.checkType = e.attributes.checkType;
                                result.isPass = e.attributes.isPass;
                                result.ycsName = e.attributes.ycsName;

                                console.log(result);
                                var str = template('shipHandContent',{
                                    result : result,
                                    group : groupArr
                                });
                                $('.shipDetailContent').html(str);

                                $('.zoomify').zoomify();
                                layui.use('form', function(){
                                    var form = layui.form();
                                    //必加此行代码激活layui属性
                                    form.render();
                                    form.on('select(shipArrive2)', function(data){
                                        var seleHtml = data.value;
                                        var portArea;
                                        var shipPort;
                                        for(var i = 0 ;i<groupArr.length;i++){
                                            if(groupArr[i].name == seleHtml){
                                                portArea =  new SuperMap.LonLat(groupArr[i].lon, groupArr[i].lat);
                                                shipPort =  new SuperMap.LonLat(result.lon, result.lat);
                                                var nmi = SuperMap.Util.distVincenty(shipPort,portArea);
                                                nmi = nmi.toFixed(2);
                                                var speed = (result.desspeed * 1.852).toFixed(2)
//                                           TODO传到后台
                                                var hours = (nmi/speed).toFixed(1);
                                                hours = Math.round(hours);
                                                var day = parseInt(Math.round(hours/24));
                                                if(!isNaN(day)){
                                                    var arraveDate = that.getDateStr(day);
                                                    layer.msg("最快到达检验点的时间"+arraveDate)
                                                }else{
                                                    layer.msg("日期不合法")
                                                }

                                            }
                                        }
                                    });
                                })


                                $('.shipDetailContent .title').html(e.attributes.shipName);

                            }
                        }
                    })
//                    var contentHTML
//                    if(e.attributes.isPass == '1'){
//                        contentHTML =  "<div style='color: #000; background-color: #fff'>"
//                            +"<table class='group'>"
//                            +"<tr>"
//                            +"<td>检验是否通过：</td><td>"+e.attributes.checkPass+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>检验时间：</td><td>"+e.attributes.checkTime+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>检验类别：</td><td>"+e.attributes.checkType+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>渔船编码：</td><td>"+e.attributes.ycbm+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>验船师名称：</td><td>"+e.attributes.ycsName+"</td>"
//                            +"</tr>"
//                            +"</table>"
//                    }else if(e.attributes.isPass == '2'){
//                        contentHTML =  "<div style='color: #000; background-color: #fff'>"
//                            +"<table class='group'>"
//                            +"<tr>"
//                            +"<td>检验是否通过：</td><td>"+e.attributes.checkPass+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>检验时间：</td><td>"+e.attributes.time+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>检验类别：</td><td>"+e.attributes.checkType+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>渔船编码：</td><td>"+e.attributes.ycbm+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td>验船师名称：</td><td>"+e.attributes.ycsName+"</td>"
//                            +"</tr>"
//                            +"<tr>"
//                            +"<td style='color: #e4393c;'>点击查看当前验船师位置</td><td>"+e.attributes.ycsName+"</td>"
//                            +"</tr>"
//                            +"</table>"
//                    }
                }
            },
            groupShip : function(e){
                var that = this;
                if(e.geometry){
                    var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                        +"<table class='group'>"
                        +"<tr>"
                        +"<td>境外检验点名称：</td><td>"+e.attributes.name+"</td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>境外检验点地址：</td><td>"+e.attributes.address+"</td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>境外团组数量：</td><td><a class='groupNum'>"+e.attributes.groupNums+"</a></td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>已检远洋渔船船次：</td><td><a class='yjyShip'>"+e.attributes.shipNums+"</a></td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>渔船电子围栏：</td><td><button class='aroundShip1'>查看附近的渔船</button></td>"
                        +"</tr>"
                    var lonLat = map.getLonLatFromPixel(infowinPosition);

                    var options = {
                        x : lonLat.lon,
                        y : lonLat.lat,
                        width: 220,
                        height: 168
                    };

                    that.showPopup(map, options, contentHTML);
                    $('.aroundShip1').on('click',function(){
                        if(infowin) map.removePopup(infowin);
                        that.aroundShip(e);
                    })

                    $('.groupNum').on('click',function(){
                        that.groupNumber(e.attributes.orgCode);
                    })

                    //if(Number(e.attributes.shipNums) != 0){
                    $('.yjyShip').on('click',function(){
                        that.groupShipDetail(e.attributes.orgCode);
                    })
                    //}
                }

            },
            groupShipDetail : function(code){
                $.ajax({
                    url : groupShip+"ZYJ001",
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        var result = data.result.dataList;
                        for(var i = 0 ;i<result.length;i++){
                            if(result[i].CHECKSTATE == '0'){
                                result[i].CHECKSTATE = '待检验';
                            }else if(result[i].CHECKSTATE == '1'){
                                result[i].CHECKSTATE == '已检验';
                            }else if(result[i].CHECKSTATE == '2'){
                                result[i].CHECKSTATE = '脱检';
                            }
                        }
                        var result = {
                            result : result
                        }
                        var str = template('groupShipInfo',result);
                        $('.showNews').trigger('click');
                        $('#detailTable').html(str);
                    }
                })

            },
            groupNumber : function(code){
                $.ajax({
                    url : gruopNum+code,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        var result = data.result;
                        var status = "";
                        for(var i = 0; i<result.length;i++){
                            if(data.result[i].status == "0"){
                                status = '待检验';
                                result[i].status =  status;
                            }else if(data.result[i].status == "1"){
                                status = '已检验';
                                result[i].status =  status;
                            }else if(data.result[i].status == "2"){
                                status = '脱检';
                                result[i].status =  status;
                            }
                        }

                        var result = {
                            result : result
                        }

                        var str = template('groupDetail',result);

                        $('.showNews').trigger('click');

                        $('#detailTable').html(str);
                    }
                })
            },
            aroundShip : function(curr,layerName){
                var that = this;
                //默认50
                var radius = "50";
                that.elecfence(curr,radius,layerName);
            },
            aroundShip2 : function(){
                var that = this;
                //默认50
                var radius = "50";
                that.elecfence2(curr,radius);
            },
            elecfence : function(curr,radius,layerName){
                var that = this;
                var selectedPoints = curr;
                var ele = shipPortLayer.features;
                var choosePoint;
                for(var i = 0 ; i<ele.length;i++){
                    if(curr.name == ele[i].attributes.name){
                        choosePoint = ele[i]
                    }
                }
                var geo = choosePoint.geometry;
                var seleLonlat = new SuperMap.LonLat(geo.x, geo.y);
                graphicsLayer.removeAllFeatures();
                if(choosePoint){
                    layer.close(layerName);
                    map.setCenter(seleLonlat,6);
                    var attrs = [];
                    var circleP=that.createCircle(choosePoint.geometry,radius*1.852/111,256,360,360);
                    var circleVector = new SuperMap.Feature.Vector(circleP);
                    circleVector.style={
                        strokeColor:"#CAFF70",
                        fillColor:"#C6E2FF",
                        strokeWidth:2 ,
                        fillOpacity:0.5
                    };
                    graphicsLayer.addFeatures([circleVector]);
                    map.addLayer(graphicsLayer);

                    for(var i=0;i<vectorlayer.features.length;i++){
                        var feature = vectorlayer.features[i];
                        var geometry = feature.geometry;

                        var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                        var nmi = SuperMap.Util.distVincenty(lonlat,seleLonlat);
                        if(nmi/1.852 <= radius){
                            var attr = feature;
                            attrs.push(attr);
                            var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                            var size = new SuperMap.Size(26, 23),
                                offset = new SuperMap.Pixel(-13, -12),
                                icon = new SuperMap.Icon("${supermap}/theme/images/twinkle.gif", size, offset);
                            var marker = new SuperMap.Marker(lonlat, icon);
                            markerLayer.addMarker(marker);
                            map.addLayer(markerLayer);
                            marker.attr =  feature.attributes;
                            marker.events.on({
                                "click":that.aroundShipClick,
                                "scope": marker
                            });
                        }
                    }
                    that.handleTable(attrs);
                }
            },
            elecfence2 : function(curr,radius,layerName){
                var that = this;
                var selectedPoints = curr;
                var ele = shipPortLayer.features;
                var choosePoint;
                for(var i = 0 ; i<ele.length;i++){
                    if(curr.name == ele[i].attributes.name){
                        choosePoint = ele[i]
                    }
                }
                var geo = choosePoint.geometry;
                var seleLonlat = new SuperMap.LonLat(geo.x, geo.y);
                graphicsLayer.removeAllFeatures();
                if(choosePoint){
                    layer.close(layerName);
                    map.setCenter(seleLonlat,6);
                    var attrs = [];
                    var circleP=that.createCircle(choosePoint.geometry,radius*1.852/111,256,360,360);
                    var circleVector = new SuperMap.Feature.Vector(circleP);
                    circleVector.style={
                        strokeColor:"#CAFF70",
                        fillColor:"#C6E2FF",
                        strokeWidth:2 ,
                        fillOpacity:0.5
                    };
                    graphicsLayer.addFeatures([circleVector]);
                    map.addLayer(graphicsLayer);
                    for(var i=0;i<vectorlayer.features.length;i++){
                        var feature = vectorlayer.features[i];
                        var geometry = feature.geometry;
                        var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                        var nmi = SuperMap.Util.distVincenty(lonlat,seleLonlat);
                        if(nmi/1.852 <= radius){
                            var attr = feature;
                            attrs.push(attr);
                            var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                            var size = new SuperMap.Size(26, 23),
                                offset = new SuperMap.Pixel(-13, -12),
                                icon = new SuperMap.Icon("${supermap}/theme/images/twinkle.gif", size, offset);
                            var marker = new SuperMap.Marker(lonlat, icon);
                            markerLayer.addMarker(marker);
                            map.addLayer(markerLayer);
                            marker.attr =  feature.attributes;
                            marker.events.on({
                                "click":that.aroundShipClick,
                                "scope": marker
                            });
                        }
                    }
                    that.handleTable(attrs);
                }
            },
            handleTable : function(arr){
                var data = {
                    content : arr
                }
                var str =  template('shipDetail',data);
                $('.showNews').trigger('click');
                $('#detailTable').html(str);

                $('.shipPosition').on('click',function(){
                    var code = $(this).parent().attr('code');
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",code);
                    var ele = features[0];
                    var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);
                    map.setCenter(lonlat, 14);
                })
            },
            aroundShipClick : function(){
                var marker = this;
                var code = marker.attr.shipcode;
                $.ajax({
                    url: searchShipDetail + code,
                    type: 'get',
                    dataType: 'json',
                    success: function (data) {
                        if(data.msg == 'success'){
                            var result = data.result;
                            var checkStatus = "" ;
                            if(result.checkStatus == '0'){
                                checkStatus = "未检验";
                            }else if(result.checkStatus == '1'){
                                checkStatus = '已检验';
                            }else if(result.checkStatus == '2'){
                                checkStatus = '脱检';
                            }
                            var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                                +"<table>"
                                +"<tr>"
                                +"<td>船名号：</td><td>"+result.shipname+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶呼号：</td><td>"+result.callSign+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>MMSI：</td><td>"+result.MMSI+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>检验状态：</td><td>"+checkStatus+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>作业类型：</td><td>"+result.jobType+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船东：</td><td>"+result.ownernam+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航向：</td><td>"+result.direction+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航速：</td><td>"+result.speed+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶检验照片：</td><td> </td>"
                                +"</tr>"
                                +"<tr>";
                            var lonLat = map.getLonLatFromPixel(infowinPosition);
                            var options = {
                                x : lonLat.lon,
                                y : lonLat.lat,
                                width: 220,
                                height: 230
                            };
                            var test = new OrgBlity();
                            test.showPopup(map, options, contentHTML);
                            //showPopup(map, options, contentHTML);
                        }
                    }
                })

            },
            createCircle : function(origin, radius, sides,r,angel){
                var rR = r*Math.PI/(180*sides);
                var rotatedAngle, x, y;
                var points = [];
                for(var i=0; i<sides; ++i) {
                    rotatedAngle = rR*i;
                    x = origin.x + (radius * Math.cos(rotatedAngle));
                    y = origin.y + (radius * Math.sin(rotatedAngle));
                    points.push(new SuperMap.Geometry.Point(x, y));
                }
                rotatedAngle = r*Math.PI/180;
                x = origin.x + (radius * Math.cos(rotatedAngle));
                y = origin.y + (radius * Math.sin(rotatedAngle));
                points.push(new SuperMap.Geometry.Point(x, y));

                var ring = new SuperMap.Geometry.LinearRing(points);
                ring.rotate(parseFloat(angel),origin);
                var geo = new SuperMap.Geometry.Collection([ring]);
                geo.origin = origin;
                geo.radius = radius;
                geo.r = r;
                geo.angel = angel;
                geo.sides = sides;
                geo.polygonType = "Curve";
                return geo;
            },
            //点击渔船
            shipDetail : function(e){
                var that = this;
                layerLoad = layer.load(3);
                if(!e.attributes.shipId){
                    layer.msg('查询不到该艘渔船的相关数据')
                    return;
                }
                var code = e.attributes.shipId;
                console.log(e);
                $.ajax({
                    url : searchShipDetail+code,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            layer.close(layerLoad);
                            $('.shipDetailContent').css({
                                "display" : "block"
                            });
                            var result = data.result;
                            console.log(result);

                            var str = template('shipContentWin',{
                                result : result,
                                group : groupArr
                            });
                            $('.shipDetailContent').html(str);

                            var maxDate = Date.parse(new Date())
                            var objTime;
                            layui.use('laydate', function(){
                                var laydate = layui.laydate;
                                //执行一个laydate实例
                                laydate.render({
                                    elem: '#shipDate'
                                    ,type: 'datetime'
                                    ,range: "~"
                                    ,min:-90
                                    ,max:maxDate
                                    ,format : "yyyy-MM-dd HH:mm:ss"
                                    ,done : function(value, date, endDate){
                                        var date = String(value);
                                        objTime = {
                                            startDate :  date.split(' ~ ')[0],
                                            endDate :  date.split(' ~ ')[1],
                                            shipno : e.attributes.shipId
                                        }
                                    }
                                });
                            });

                            $('.shipDetailContent').on('click',"#shipTimeSearch",function(){
                                if(!objTime){
                                    layer.msg("请选择日期");
                                    return;
                                }
                                $.ajax({
                                    url : shipTrajectory,
                                    type : 'post',
                                    data : objTime,
                                    dataType : "json",
                                    success : function(data){
                                        shipDraw.removeAllFeatures();
                                        shipPoints.clearMarkers();
                                        var result = data.result;
                                        console.log(result);
                                        if(result.length > 0 ){
                                            var startPoint = result[0];
                                            var endPoint = result[result.length -1];

                                            var size = new SuperMap.Size(48,48);
                                            var shipSize = new SuperMap.Size(24,24);
                                            var offset = new SuperMap.Pixel(-(size.w/2), -(size.h - 10));
                                            var pointImg = new SuperMap.Icon('${supermap}/theme/images/pointDate.png',shipSize);

                                            var points=[];
                                            for(var i = 0 ;i<result.length;i++){
                                                points.push(new SuperMap.Geometry.Point(result[i].lon,result[i].lat) )
                                                var markerPoint = new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),pointImg);

                                                markerPoint.direction =  result[i].direction;
                                                markerPoint.speed = result[i].speed;
                                                markerPoint.postime =  result[i].postime;

                                                markerPoint.events.on({
                                                    "mouseover":function(){
                                                        if(infowin){
                                                            try{
                                                                infowin.hide();
                                                                infowin.destroy();
                                                            }
                                                            catch(e){}
                                                        }
                                                        var marker = this;
                                                        var content = "<div class='shipPointContent'>"
                                                            +      "<p>航向："+marker.direction+"度</p>"
                                                            +       "<p>航速："+marker.speed+"节</p>"
                                                            +       "<p>时间："+marker.postime+"</p>"
                                                            +      "</div>"

                                                        var lonlat = marker.getLonLat();
                                                        var size = new SuperMap.Size(0, 33);
                                                        var offset = new SuperMap.Pixel(10, -20);
                                                        var popup = new SuperMap.Popup.FramedCloud("popwin",
                                                            new SuperMap.LonLat(lonlat.lon,lonlat.lat),
                                                            new SuperMap.Size(80,20),content,null,false,null,false);

                                                        if(popup) map.removePopup(popup);

                                                        infowin = popup;
                                                        map.addPopup(popup);
                                                    },
                                                    "mouseout" : function(){
                                                        if(infowin){
                                                            try{
                                                                infowin.hide();
                                                                infowin.destroy();
                                                            }
                                                            catch(e){}
                                                        }
                                                    },
                                                    "scope": markerPoint
                                                })
                                                shipPoints.addMarker(markerPoint);
                                            }

                                            var icon = new SuperMap.Icon('${supermap}/theme/images/startPoint.png', size, offset);
                                            var markerStart = new SuperMap.Marker(new SuperMap.LonLat(startPoint.lon,startPoint.lat),icon) ;

                                            var iconEnd = new SuperMap.Icon('${supermap}/theme/images/endPoint.png', size, offset);
                                            var markerEnd = new SuperMap.Marker(new SuperMap.LonLat(endPoint.lon,endPoint.lat),iconEnd) ;
                                            shipPoints.addMarker(markerStart);
                                            shipPoints.addMarker(markerEnd);

                                            markerStart.direction =  startPoint.direction;
                                            markerStart.speed = startPoint.speed;
                                            markerStart.postime =  startPoint.postime;

                                            markerEnd.direction =  endPoint.direction;
                                            markerEnd.speed =  endPoint.speed;
                                            markerEnd.postime =  endPoint.postime;

                                            markerEnd.events.on({
                                                "mouseover":function(){
                                                    if(infowin){
                                                        try{
                                                            infowin.hide();
                                                            infowin.destroy();
                                                        }
                                                        catch(e){}
                                                    }
                                                    var marker = this;
                                                    var content = "<div class='shipPointContent'>"
                                                        +      "<p>航向："+marker.direction+"度</p>"
                                                        +       "<p>航速："+marker.speed+"节</p>"
                                                        +       "<p>时间："+marker.postime+"</p>"
                                                        +      "</div>"

                                                    var lonlat = marker.getLonLat();
                                                    var size = new SuperMap.Size(0, 33);
                                                    var offset = new SuperMap.Pixel(10, -20);
                                                    var popup = new SuperMap.Popup.FramedCloud("popwin",
                                                        new SuperMap.LonLat(lonlat.lon,lonlat.lat),
                                                        new SuperMap.Size(80,20),content,null,false,null,false);

                                                    if(popup) map.removePopup(popup);

                                                    infowin = popup;
                                                    map.addPopup(popup);
                                                },
                                                "mouseout" : function(){
                                                    if(infowin){
                                                        try{
                                                            infowin.hide();
                                                            infowin.destroy();
                                                        }
                                                        catch(e){}
                                                    }
                                                },
                                                "scope": markerEnd
                                            })

                                            markerStart.events.on({
                                                "mouseover":function(){
                                                    if(infowin){
                                                        try{
                                                            infowin.hide();
                                                            infowin.destroy();
                                                        }
                                                        catch(e){}
                                                    }
                                                    var marker = this;
                                                    var content = "<div class='shipPointContent'>"
                                                        +      "<p>航向："+marker.direction+"度</p>"
                                                        +       "<p>航速："+marker.speed+"节</p>"
                                                        +       "<p>时间："+marker.postime+"</p>"
                                                        +      "</div>"

                                                    var lonlat = marker.getLonLat();
                                                    var size = new SuperMap.Size(0, 33);
                                                    var offset = new SuperMap.Pixel(10, -20);
                                                    var popup = new SuperMap.Popup.FramedCloud("popwin",
                                                        new SuperMap.LonLat(lonlat.lon,lonlat.lat),
                                                        new SuperMap.Size(80,20),content,null,false,null,false);

                                                    if(popup) map.removePopup(popup);

                                                    infowin = popup;
                                                    map.addPopup(popup);
                                                },
                                                "mouseout" : function(){
                                                    if(infowin){
                                                        try{
                                                            infowin.hide();
                                                            infowin.destroy();
                                                        }
                                                        catch(e){}
                                                    }
                                                },
                                                "scope": markerStart
                                            });

                                            var line = new SuperMap.Geometry.LineString(points);
                                            var linecVector = new SuperMap.Feature.Vector(line);
                                            linecVector.style={
                                                strokeColor:"#e4393c",
                                                strokeWidth:2
                                            };
                                            shipDraw.addFeatures([linecVector]);
                                        }else if(result.length == 0){
                                            layer.msg("没有查询到该船此时间段的航行轨迹")
                                        }


                                    }
                                })
                            })






                            $('.zoomify').zoomify();

                            $('#drawBtn').on('click',function(){
                                drawLine.activate();
                                drawLine.events.on({"featureadded":function(drawGeometryArgs){
                                        drawLine.deactivate();
                                        var geometry = drawGeometryArgs.feature.geometry;
                                        var measureParam = new SuperMap.REST.MeasureParameters(geometry)
                                        var myMeasuerService = new SuperMap.REST.MeasureService(measureUrl);
                                        myMeasuerService.events.on({ "processCompleted": function(measureEventArgs){
                                                var distance = measureEventArgs.result.distance;
                                                var unit = measureEventArgs.result.unit;
                                                layer.close(layerLoad);
                                                var haiLi = parseInt(distance/1852);
                                                var speed = Number(data.result.desspeed);
                                                var time = parseInt(parseInt(haiLi/speed)/24);
                                                if(!isNaN(time)){
                                                    var arraveDate = that.getDateStr(time);
                                                    layer.msg("全程总计"+haiLi+"海里，以设计航速最快到达检验点的时间是"+arraveDate)
                                                }else{
                                                    layer.msg("日期不合法")
                                                }
                                                //layer.msg("量算结果:"+distance + "米");
                                            }});
                                        myMeasuerService.events.on({ "processFailed": that.measureError.bind(this) });
                                        myMeasuerService.measureMode = SuperMap.REST.MeasureMode.DISTANCE;
                                        layerLoad = layer.load(3)
                                        myMeasuerService.processAsync(measureParam);
                                    }});

                            })

//                            layui.use('form', function(){
//                                var form = layui.form();
//                                //必加此行代码激活layui属性
//                                form.render();
//                                form.on('select(shipArrive)', function(data){
//                                    var seleHtml = data.value;
//                                    var portArea;
//                                    var shipPort;
//                                    for(var i = 0 ;i<groupArr.length;i++){
//                                        if(groupArr[i].name == seleHtml){
//                                            portArea =  new SuperMap.LonLat(groupArr[i].lon, groupArr[i].lat);
//                                            shipPort =  new SuperMap.LonLat(result.lon, result.lat);
//                                            var nmi = SuperMap.Util.distVincenty(shipPort,portArea);
//                                                nmi = nmi.toFixed(2);
//                                            var speed = (result.desspeed * 1.852).toFixed(2)
////                                           TODO传到后台
//                                            var hours = (nmi/speed).toFixed(1);
//                                                hours = Math.round(hours);
//                                            var day = parseInt(Math.round(hours/24));
//
//
//                                        }
//                                    }
//                                });
//                            })


                            $('.shipDetailContent .title').html(e.attributes.shipName);

                        }
                    }
                })
            },
            getDateStr : function(AddDayCount) {
                var dd = new Date();
                dd.setDate(dd.getDate()+AddDayCount);//获取AddDayCount天后的日期
                var y = dd.getFullYear();
                var m = (dd.getMonth()+1)<10?"0"+(dd.getMonth()+1):(dd.getMonth()+1);//获取当前月份的日期，不足10补0
                var d = dd.getDate()<10?"0"+dd.getDate():dd.getDate();//获取当前几号，不足10补0
                return y+"-"+m+"-"+d;
            },
            showPopup : function(map, options, contentHTML){
                var name = options && options.name? options.name : "infowin";
                var position = options && options.x && options.y? new SuperMap.LonLat(options.x,options.y) : map.getCenter();
                // 弹出框大小
                var size = options && options.width && options.height ? new SuperMap.Size(options.width, options.height): new SuperMap.Size(200, 300);

                if(infowin) map.removePopup(infowin);
                infowin = new SuperMap.Popup(
                    name,
                    position,
                    size,
                    contentHTML,
                    true,
                    false,
                    null);
                infowin.setBackgroundColor("#fff");
                infowin.setOpacity(0.8);
                map.addPopup(infowin);
            },
            closeInfo : function(){
                if(infowin) {
                    try {
                        map.removePopup(infowin)
                    } catch(e) {}
                }
            },
            search : function(){
                $('#search').on('click',function(){
                    var word = $('#ship_num').val();
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",word);
                    var ele = features[0];
                    //与zoom事件冲突 暂无法解决
                    //ele.style.externalGraphic = "${supermap}/theme/images/twinkle.gif";
                    if(!features || features.length==0){
                        alert("没有编号或船名为" + word + "的渔船");
                        return;
                    }
                    var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);

                    map.setCenter(lonlat, 9);

                })

                $('#clean').on('click',function(){
                    var word = $('#ship_num').val();
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",word);
                    if(features.length > 0){
                        var ele = features[0];
                        ele.style.externalGraphic = "${supermap}/theme/images/greenship.png";
                    }

                    graphicsLayer.removeAllFeatures();
                    markerLayer.clearMarkers();

                    $('.hideNews').trigger('click');

                    map.setCenter(new SuperMap.LonLat(24.4335937500, -7.3624668655),0);

                })
            },
            drawMarker : function(data){
                vectorlayer.removeAllFeatures();
                var result = data.result;
                console.log(result);
                map.setCenter(new SuperMap.LonLat(24.4335937500, -7.3624668655),2);
                var images = "${supermap}/theme/images/shipGreenPoint.png";
                for(var i = 0;i<result.length;i++){
                    var curr = result[i];
                    var x = curr.LON;
                    var y = curr.LAT;
                    var point= new SuperMap.Geometry.Point(x,y);
                    pointFeature = new SuperMap.Feature.Vector(point);
                    pointFeature.attributes = {
                        checkStatus : result[i].CHECKSTATUS,
                        ownerName : result[i].OWNERNAME,
                        rate : result[i].RATE,
                        score : result[i].SCORE,
                        shipAge : result[i].SHIPAGE,
                        shipCode : result[i].SHIPCODE,
                        shipName : result[i].SHIPNAME
                    }
                    pointFeature.style={
                        pointRadius:16,
                        externalGraphic : images,
                        rotation : result[i].DIRECTION
                    };
                    searchShipLayer.addFeatures(pointFeature);
                }
                layer.close(layerLoad);
            },
            addMarker : function (data) {
                var that = this;
                shipMap.setVisibility(false);
                vectorlayer.removeAllFeatures();
                var images = "${supermap}/theme/images/greenship.png";
                var result = data.result;
                console.log(result);
                for(var i = 0 ;i<result.length;i++){
                    var curr = result[i];
                    var x = curr.CSP_LON;
                    var y = curr.CSP_LAT;

                    var point= new SuperMap.Geometry.Point(x,y);

                    pointFeature = new SuperMap.Feature.Vector(point);
                    pointFeature.attributes = {
                        shipId : result[i].CSP_SHIPNO,
                        shipName : result[i].CSP_SHIPNAME
                    }
                    pointFeature.style={
                        pointRadius:10,
                        externalGraphic : images,
                        rotation : result[i].CSP_DIRECTION,
                        label : result[i].CSP_SHIPNAME,
                        labelYOffset : 20,
                        fontFamily : '微软雅黑',
                        fontColor : "#F0FF00"
                    };
                    vectorlayer.addFeatures(pointFeature);
                }
                vectorlayer.redraw();

            },
            openInfoWin : function(){
                if(infowin) {
                    try {
                        map.removePopup(infowin)
                    }catch(e) {

                    }
                }
                var marker = this;
                var id  = marker.id;
                var url = clickUrl +  3;
                var lonlat = marker.getLonLat();
                $.ajax({
                    url : url,
                    type:'get',
                    dataType : 'json',
                    success : function(data){

                        var data = data.result;
                        var ownerMap = data.ownerMap;

                        var checkStatusList = data.checkStatusList;

                        var safeRateMap = data.safeRateMap;
                        //渔船安全系数艘数
                        $('.zhaqxs').html(safeRateMap.highNum);
                        $('.zhaqxsz').html(safeRateMap.middleNum);
                        $('.zhaqxsd').html(safeRateMap.lowNum);

                        $('.zgl').html(data.shipMap.totalPower);
                        $('.zdw').html(data.shipMap.totalTon);
                        $('.hgl').html(data.checkRate+"%");

                        for(var i = 0 ;i<checkStatusList.length;i++){
                            var curr = checkStatusList[i];
                            if(curr.checkStatus == '0'){
                                $('.djjyc').html(curr.num) ;
                            }else if(curr.checkStatus == '1'){
                                $('.yjyyc').html(curr.num) ;
                            }else if(curr.checkStatus == '2'){
                                $('.tjyc').html(curr.num) ;
                            }
                        }

                        var contentHTML = "<div style='font-size:.8em; opacity: 2.0; overflow:auto;'>";

                        contentHTML += "<div>"+"机构名称："+"<a>"+ownerMap.name+"</a>"+
                            "<br/>"+"机构地址："+ ownerMap.addr +"<br>机构负责人:"+ownerMap.leader+"<br>机构联系电话:"+ownerMap.tel+"<br>诚信得分"+ownerMap.score;
                        "</div></div>";
                        var size = new SuperMap.Size(0, 33);
                        var offset = new SuperMap.Pixel(11, 10);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
                        var popup = new SuperMap.Popup.FramedCloud("popwin",
                            new SuperMap.LonLat(lonlat.lon,lonlat.lat),
                            null,
                            contentHTML,
                            icon,
                            true
                        );
                        infowin = popup;
                        map.addPopup(popup);
                    }
                })
            },
            inputCheck : function(){
                $('.choose').removeAttr("disabled");
                $('.y_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 100 && s_arr[i].score >80){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 100 && s_arr[i].score >80){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.p_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 80 && s_arr[i].score >60){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 80 && s_arr[i].score >60){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.c_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 60 && s_arr[i].score >=0 ){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 60 && s_arr[i].score >=0){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })
            }
        }
        return new OrgFun(options);
    }

</script>
</head>
</html>
