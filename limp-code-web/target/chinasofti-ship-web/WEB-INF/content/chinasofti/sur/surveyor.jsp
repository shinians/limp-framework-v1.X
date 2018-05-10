<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>

<style>
    #ychEcharts{
        height:300px;
    }
    .container{
        padding-bottom:55px;
    }
    .banner{
        width:465px;
        overflow:hidden;
        height:275px;
        position:relative;
        left: 25px;
    }
    .banList li img{
        height:230px;
        width: 465px;

    }
    .ycBanner .ycFomw{
        bottom:28px;
    }
    .ycBanner li img{
        width:165px;
    }
    .banList li{
        height:230px;
        opacity:0;
        margin-left:-40px;
        position:absolute;
        transform:scale(0);
        transition:transform 0.5s ease 0s, opacity 1.5s ease 0s;
        z-index:1;
    }
    .banList li.active{opacity:1;transform:scale(1);z-index:2;}
    .fomW{
        position:absolute;
        bottom:52px;
        left:35%;
        height:20px;
        z-index:9;
        width:100px;
        margin-left:-500px;
    }
    .jsNav{text-align:center;}
    .jsNav a{
        display:inline-block;
        background:#00AEFF;
        width:10px;
        height:10px;
        border-radius:50%;
        margin:0 5px;
    }
    .jsNav a.current{
        background:#FED61C;
        cursor:pointer
    }
    .personTable{
        margin:0px;
    }
    .tab-content{
        width:100%;
    }
    .filterBtn{
        color:#fff;
        width: 65px;
        padding:10px;
        border:2px solid #FED61C;
        background-color:#122C5B;
    }
    .layui-layer-setwin a{
        width:19px;
        height: 19px;
    }
    .datetimepicker table tr td span:hover{
        background:#FED61C;
    }
    #datetimepicker1, #datetimepicker2{
        width:auto;
    }
    .btn-time{
        margin-top:25px;
    }
    .datetimepicker thead tr:first-child th:hover, .datetimepicker tfoot th:hover{
        background-color:#FED61C;
    }
    #ychEcharts{
        margin-top:45px;
    }
    #personDetail tbody tr td:nth-child(1){
        text-align: right;
    }
    #personDetail tbody tr td:nth-child(2){
        text-align: left;
        color:#fff;
    }
    .personTable tbody tr{
        height:36px;
    }
    .xiangqing table tr td{
        width:95px;
        height: 25px;
        vertical-align: top;
    }
    .xiangqing table tr td:nth-child(1){
        text-align: right;
    }
    .xiangqing table tr td:nth-child(2){
        text-align: left;
        width: 150px;
        padding-left: 5px;
    }

    .layui-elem-field legend{
        margin-left:0px;
        color:#fff;
        font-size: 16px;
        margin-bottom:0px;
    }
    .ycsjb{
        vertical-align: super;
    }
    .radius{
        display: block;
        width: 10px;
        height: 10px;
        background: #F0FF00;
        -moz-border-radius: 50px;
        -webkit-border-radius: 50px;
        border-radius: 50px;
        margin:0 auto;
    }
    /*2017.12.12 alert skin by meng*/
    .layui-layer-setwin .layui-layer-close1{
        background-position:4px -40px;
    }

</style>
<div class="container">
    <input id="ycscertnum" type="hidden" value="${ycscertnum}"/>
    <div style="height: 90px;margin-top: 30px;" class="row" class="header" >
        <div class="col-md-12">
            <div class="col-md-12">
                <div class="layui-breadcrumb" id="bread">

                </div>
                <script id="name" type="text/template">
                    <h3 style="margin-left: 0px" class="title01 headerTxt"> {{name}} <br /> <span class="numberColor"> {{ company }}</span></h3>
                </script>

                <div id="view1"></div>
            </div>
            <div class="col-md-9">
                <div class="col-md-4">

                </div>
            </div>
        </div>
    </div>
    <!--四项指标-->
    <div class="row zbRow">
        <div class="col-sm-6">
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>

                        <%--<script id="jysj" type="text/template">--%>

                            <%--<p class='numberColor numberStyle gzsj'><span class='number'>{{checknum}}</span>年</p>--%>

                        <%--</script>--%>
                        <p class='numberColor numberStyle gzsj'><span class='number' id="jyWorkTime"></span>年</p>
                        <p class="textSum">从事渔船检验工作时间</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>

                        <%--<script id="ljjy" type="text/template">--%>

                            <%--<p class='numberColor numberStyle'><span class='number n' id="shipNums">{{ljjx}}</span>艘次</p>--%>

                        <%--</script>--%>
                        <p class='numberColor numberStyle'><span class='number n' id="shipNums"></span>艘次</p>
                        <%--<div id="view2"></div>--%>
                        <p class="textSum">累计检验渔船船次(艘次)</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>

                        <%--<script id="pxqs" type="text/template">--%>
                            <%--<p class='numberColor numberStyle'><span class='number'>{{pxqs}}</span>期</p>--%>
                        <%--</script>--%>

                        <p class='numberColor numberStyle'><span class='number' id="pxNum"></span>期</p>
                        <%--<div id='view4'></div>--%>

                        <p class="textSum">参加培训期数</p>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class=" box01 box">
                        <p class="margin35"><b class="iconSum"></b></p>

                        <%--<script id="ycsnl" type="text/template">--%>
                            <%--<p class='numberColor numberStyle'><span class='number'>{{ycsnl}}</span>分</p>--%>
                        <%--</script>--%>
                        <p class='numberColor numberStyle'><span class='number' id="pgScore"></span>分</p>
                        <%--<div id='view5'></div>--%>
                        <p class="textSum">验船师能力评估(分)</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="box02 box">
                <h3 class="title01" style="margin-bottom: 0px">验船师关键指标<b id="ycsDetail"  class="iconSum"></b></h3>
                <%--<b class="iconBig"></b>--%>
                <div class="col-sm-6">

                    <%--<script id="xl" type="text/template">--%>
                        <%--<p class="numberColor  numberStyle" title="{{xl}}"><span style="font-size: 40px;" class="number">{{xl}}</span></p>--%>
                    <%--</script>--%>

                    <p class="numberColor  numberStyle" title="{{xl}}"><span style="font-size: 40px;" class="number" id="xueli"></span></p>

                    <%--<div id='view6'></div>--%>

                    <p class="textSum">最高学历</p>
                </div>
                <div class="col-sm-6">
                    <div id="view7">
                        <p class="numberColor numberStyle"><span style="font-size: 40px;"  class="number ycsjb"></span></p>
                    </div>

                    <p class="textSum">验船师级别</p>
                </div>

                <div class="col-sm-6">
                    <div id='view8'>
                        <p class="numberColor  numberStyle"><span style="font-size: 40px;" class="number ycszy" id='zyzd'></span></p>
                    </div>
                    <p class="textSum">专业</p>
                </div>
                <div class="col-sm-6">                                  
                    <div id='view9'>
                        <p class="numberColor  numberStyle"><span style="font-size: 40px;" class="number xg_tszg"></span></p>
                    </div>
                    <p class="textSum">特殊资格</p>
                </div>
            </div>
        </div>
    </div>
    <!--结束 四项指标-->
    <div class="row">
        <div class="col-sm-3">
            <div class="box box02" style="height: 340px;">
                <h3 class='title01' >验船师基本信息</h3>
                <div class="ycBanner">
                    <ul class="banList" id='view3'>
                        <script id="surveyorImgUrl" type="text/template">
                            <?if(picUrl.length==0){  ?>
                            <li><img class="zoomify" src="../../../../resources/style/images/ycszs.png"></li>
                            <? } else{  ?>
                            <?for(var i=0;i<picUrl.length;i++){?>
                            <li><img class="zoomify" src="<?= picUrl[i] ?>"></li>
                            <? }?>
                            <? }?>
                        </script>
                    </ul>
                    <div class="fomW ycFomw">
                        <div class="jsNav">
                            <a href="javascript:;" class="trigger current"></a>
                            <a href="javascript:;" class="trigger"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-sm-9" style="padding-right: 5px">
            <div class="box box04" style="margin-left: 0px;height:340px;">
                <h3 class='title01' id='gzl' style="float: left;margin-bottom: 0px">
                </h3>
                <span>&nbsp;&nbsp;</span><img id="shipEcharts" src="${ctx}/resources/style/img/filter.png" style="width: 20px;height: 20px;cursor: pointer;position: absolute;top:20px;left:95%;"/>
                <%--<b class="iconBig"></b>--%>
                <div id='ycsEcharts' style="margin-top: 33px"></div>
            </div>
        </div>
    </div>
    <div class="col-sm-12" id="surveyorTime" style="padding-left:0px; width: 102%">
        <div class="time">
            <div class="title01">资质历程</div>
            <div class="wrapper-t">
                <div class="content-t"></div>
            </div>
            <div class="t-back"></div>
            <div class="t-go"></div>
        </div>
    </div>
</div>

<script id='workCheck' type="text/template">
    <div id='workContent'>
        <div class="col-sm-6" style="width:38%;">
            <ul class="nav nav-tabs" role="tablist" class="Tab">
                <li role="presentation" class="active"><a href="#contour" aria-controls="contour" role="tab" data-toggle="tab">船长</a></li>
                <li role="presentation"><a href="#headSculpture" aria-controls="headSculpture" role="tab" data-toggle="tab">船体材质</a></li>
                <li role="presentation"><a href="#lable" aria-controls="lable" role="tab" data-toggle="tab">作业区域</a></li>

            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="contour" style="width:390px;height:350px;">

                </div>
                <div role="tabpanel" class="tab-pane" id="headSculpture" style="width:390px;height:350px;">

                </div>
                <div role="tabpanel" class="tab-pane" id="lable" style="width:390px;height:350px;">

                </div>

            </div>

        </div>

        <div class="col-sm-6" style="width:62%;padding:0px;margin-top:42px;">

            <%--<option value="">请选择开始日期</option>--%>
            <label style="color:#fff;">选择开始时间：</label>
            <div class="input-group date" style="display: inline-block;vertical-align:middle;" id="datetimepicker1">
                <input type="text" class="form-control" id="tabStartT" />
                <span class="input-group-addon">
                     <span class="glyphicon-calendar"></span>
                </span>
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <label style="color:#fff;">选择结束时间：</label>
            <div class="input-group date" id="datetimepicker2" style="display: inline-block;vertical-align:middle;">
                <input type="text" class="form-control" id="tabEndT" />
                <span class="input-group-addon">
                                <span class="glyphicon-calendar"></span>
                                </span>
            </div>
            <button class="layui-btn layui-btn-normal" id="timeClk">搜索</button>
            <table id='workTable'>
                <thead>
                <tr>
                    <td>序号</td>
                    <td>船名</td>
                    <td>船长(m)</td>
                    <td>船体材质</td>
                    <td>作业区域</td>
                    <td>检验类型</td>
                    <td>检验时间</td>
                </tr>
                </thead>
                <tbody id='tableBody'>
                <? for(var i = 0 ;i<content.length;i++){ ?>
                <? for(var j=0;j<content[i].content.length;j++) { ?>
                <tr>
                    <td title=<?=content[i].content[j].rownum_?>  ><?= content[i].content[j].rownum_ ?></td>
                    <td title=<?=content[i].content[j].ycmc?>><span style='cursor: pointer;' onClick=crossLoad('/ship/index?shipcode=<?=content[i].content[j].ycbm?>','<?=content[i].content[j].ycmc?>')><?= content[i].content[j].ycmc ?></span></td>
                    <td title=<?=content[i].content[j].shiplength?> ><?= content[i].content[j].shiplength   ?></td>
                    <td title=<?=content[i].content[j].shipmaterial?> ><?= content[i].content[j].shipmaterial   ?></td>
                    <td title=<?=content[i].content[j].jobarea?> ><?= content[i].content[j].jobarea ?></td>
                    <td title=<?=content[i].content[j].checktype?> ><?= content[i].content[j].checktype ?></td>
                    <td title=<?=content[i].content[j].checktime?> ><?= content[i].content[j].checktime ?></td>
                </tr>
                <? } ?>
                <? } ?>
                </tbody>
            </table>
        </div>
        <div id="paging"></div>

    </div>
</script>

<script id='tableContent' type="text/template">

    <? for(var i = 0 ;i<content.length;i++){ ?>
    <? for(var j=0;j<content[i].content.length;j++) { ?>
    <tr>
        <td title=<?=content[i].content[j].rownum_?>  ><?= content[i].content[j].rownum_ ?></td>
        <td title=<?=content[i].content[j].ycmc?>><span style='cursor: pointer;' onClick=crossLoad('/ship/index?shipcode=<?=content[i].content[j].ycbm?>','<?=content[i].content[j].ycmc?>')><?= content[i].content[j].ycmc ?></span></td>
        <td title=<?=content[i].content[j].shiplength?> ><?= content[i].content[j].shiplength   ?></td>
        <td title=<?=content[i].content[j].shipmaterial?> ><?= content[i].content[j].shipmaterial   ?></td>
        <td title=<?=content[i].content[j].jobarea?> ><?= content[i].content[j].jobarea ?></td>
        <td title=<?=content[i].content[j].checktype?> ><?= content[i].content[j].checktype ?></td>
        <td title=<?=content[i].content[j].checktime?> ><?= content[i].content[j].checktime ?></td>
    </tr>
    <? } ?>

    <? } ?>

</script>

<script id='training' type="text/template">
    <div class="picBox">
        <ul class="picL" id="picLsy" >

            <? for(var i = 0;i<content.length;i++){ ?>
            <li>
                <a href="#"><img src='${ctx}/<?= content[i].imageUrl ?>'/></a>
                <div class="text01">
                    <p>
                        <span>培训名称：<?= content[i].trainname?> </span>
                        <span>培训时间：<?= content[i].begintime?> - <?= content[i].endtime?>  </span>
                        <span>发起单位：<?= content[i].initiateUnits ?> </span>
                        <span>获取资格：<?= content[i].surcertificate?></span>
                        <span>考试成绩：<?= content[i].examtscore?></span>
                        <span>是否发证：<?= content[i].lssuestatus?></span>

                    </p>
                </div>
            </li>
            <?}?>
        </ul>
    </div>
</script>

<script id='ability' type="text/template">
    <div class="col-sm-6" style="width:50%;">
        <div id='ychEcharts'></div>
    </div>
    <div class="col-sm-6" style="width:50%;">
        <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
            <? for(var i=0;i<arr.length;i++){?>
            <div class="panel panel-default">

                <? if(arr[i].remark != '无') { ?>

                    <div class="panel-heading" role="tab" id="heading<?= i?>">
                        <h4 class="panel-title">
                            <a role="button" class='mStr accordion-toggle' data-toggle="collapse" data-parent="#accordion" aria-expanded="true" aria-controls="collapse<?=i?>">
                                <?= arr[i].name?>:<?= arr[i].score?>/<?= arr[i].total?> &nbsp;&nbsp; ( <span class="remark"><?= arr[i].remark ?></span> )
                            </a>
                        </h4>
                    </div>



                <?} else if(arr[i].remark == '无') { ?>

                    <div class="panel-heading" role="tab" id="heading<?= i?>">
                        <h4 class="panel-title">
                            <a role="button" class='mStr accordion-toggle' data-toggle="collapse" data-parent="#accordion" href="#collapse<?=i?>" aria-expanded="true" aria-controls="collapse<?=i?>">
                                <?= arr[i].name?>:<?= arr[i].score?>/<?= arr[i].total?>
                            </a>
                        </h4>
                    </div>


                <? } ?>


                <div id="collapse<?=i?>" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading<?= i?>">
                    <div class="panel-body">
                        <? for(var j=0;j<arr[i].child.length;j++){ ?>
                        <p> <?= arr[i].child[j].name ?> : <?= arr[i].child[j].score?> / <?= arr[i].child[j].totalScore?> </p>
                        <? } ?>
                    </div>
                </div>
            </div>
            <?}?>
        </div>
    </div>
</script>

<script id='detailContent' type="text/template">
    <table id='personDetail'>
        <tr>
            <td>姓名：</td>
            <td><?= ycsname ?></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><?= sex ?></td>
        </tr>
        <tr>
            <td>出生日期：</td>
            <td><?= birthday ?></td>
        </tr>
        <%--<tr>--%>
        <%--<td>证书专业：</td>--%>
        <%--<td><?= zy ?></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
        <%--<td>特殊资格：</td>--%>
        <%--<td><?= zxzg ?></td>--%>
        <%--</tr>--%>

        <tr>
            <td>相关学历：</td>
            <td><?= xl1 ?></td>
        </tr>

        <tr>
            <td>相关学历专业：</td>
            <td><?= major1 ?></td>
        </tr>

        <tr>
            <td>最高学历：</td>
            <td><?= xl ?></td>
        </tr>

        <tr>
            <td>最高学历专业：</td>
            <td><?= major ?></td>
        </tr>

        <tr>
            <td>工作单位：</td>
            <td><?= company ?></td>
        </tr>

        <tr>
            <td>行政职务：</td>
            <td><?= zw ?></td>
        </tr>
    </table>
    <table>
        <thead>
        <tr>
            <th colspan="<?= zsjb.length + 1  ?>">验船师证书情况</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>证书级别</td>
            <? for(var i = 0 ; i < zsjb.length ; i++){  ?>
            <td> <?= zsjb[i].CERLEVEL ?>   </td>
            <?  }  ?>
        </tr>
        <tr>
            <td>证书专业</td>
            <? for(var i = 0 ;i < zsjb.length ; i++) {  ?>
            <td> <?= zsjb[i].MAJOR ?>   </td>
            <?  } ?>
        </tr>
        </tbody>
    </table>

    <table>
        <thead>
        <tr>
            <th colspan="5">验船师特殊资质</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>远洋渔船船舶检验</td>
            <td>境外船舶检验</td>
            <td>船用产品检验</td>
            <td>境外船用产品检验</td>
            <td>图纸审查</td>
        </tr>
        <tr>
            <td>
                <? for(var i = 0 ; i < tszj.length;i++) { ?>
                <? if(tszj[i] == '远洋渔业船舶检验'){  ?>
                <span class="radius"></span>
                <?  }else ?>
                <? } ?>
            </td>
            <td>
                <? for(var i = 0 ; i < tszj.length;i++) { ?>
                <? if(tszj[i] == '境外船舶检验'){  ?>
                <span class="radius"></span>
                <?  }else ?>
                <? } ?>
            </td>
            <td>
                <? for(var i = 0 ; i < tszj.length;i++) { ?>
                <? if(tszj[i] == '船用产品检验'){  ?>
                <span class="radius"></span>
                <?  }else ?>
                <? } ?>
            </td>
            <td>
                <? for(var i = 0 ; i < tszj.length;i++) { ?>
                <? if(tszj[i] == '境外船用产品检验'){  ?>
                <span class="radius"></span>
                <?  }else ?>
                <? } ?>
            </td>
            <td>
                <? for(var i = 0 ; i < tszj.length;i++) { ?>
                <? if(tszj[i] == '图纸审查'){  ?>
                <span class="radius"></span>
                <?  }else ?>
                <? } ?>
            </td>
        </tr>
        </tbody>
    </table>


</script>

<script id='timeContent' type="text/template">
    <table class='personTable'>
        <thead>
        <tr>
            <th style="font-weight: normal">时间</th>
            <th style="font-weight: normal">工作单位</th>
            <th style="font-weight: normal">部门职务</th>
            <th style="font-weight: normal">证明人</th>
        </tr>
        </thead>

        <tbody id='timeTable'>
        <? for(var i=0;i<person.length;i++){ ?>
        <tr>
            <td><?= person[i].begintime?>-<?= person[i].endtime?></td>
            <td><?= person[i].workunit ?></td>
            <td><?= person[i].position ?></td>
            <td><?= person[i].witness ?></td>
        </tr>
        <? } ?>
        </tbody>
    </table>
    <div id="timePageing"></div>
</script>

<script type="text/template" id="xiangqing">
    <div class="xiangqing">
        <table>
            <tr>
                <td>持证人姓名:</td>
                <td>{{name}}</td>
            </tr>
            <tr>
                <td>工作单位:</td>
                <td>{{org}}</td>
            </tr>
            <tr>
                <td>证件编号:</td>
                <td>{{certno}}</td>
            </tr>
            <tr>
                <td>专业:</td>
                <td>{{clevel}}</td>
            </tr>
            <tr>
                <td>授予时间:</td>
                <td>{{grantdate}}</td>
            </tr>
            <tr>
                <td>发证日期:</td>
                <td>{{issuedate}}</td>
            </tr>
        </table>
    </div>
</script>


<script type="text/javascript">
    $(function(){

    });

    //  var filterLay;
    //        function tmpfilter(txt){
    //
    //            //时间控件
    //            $('#startT').datetimepicker({
    //                format: "yyyy",
    //                autoclose: true,
    //                startView: 4,
    //                minView: 4,
    //                todayHighlight: true,
    //                language: 'zh-CN'
    //            });
    //            $('#endT').datetimepicker({
    //                format: "yyyy",
    //                autoclose: true,
    //                startView: 4,
    //                minView: 4,
    //                todayHighlight: true,
    //                language: 'zh-CN'
    //            });
    //
    //
    //        }

    $(document).ready(function(){
        addBread(sessionStorage.getItem("keyUrl"),sessionStorage.getItem("keyName"));
        //===============layui-breadcrumb
        layui.use('element',function(){
            var element = layui.element();
            element.init();

//        element.on('(bread)filter',function(elem){
//            console.log(elem);
//        })
        });
        //获取验船师信息
        getCurrSur($("#ycscertnum").val());
    })

</script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script type="text/javascript" src='${ctx}/resources/script/chinasofti/ent/surveyor.js'></script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>

<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
