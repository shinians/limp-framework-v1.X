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
<link rel="stylesheet" href="${style}/css/fazhan-panel.css">
<link rel="stylesheet" href="${style}/css/shejidanwei-panel.css" />

    <input class="registnumval" value="${pid}" hidden="hidden"/>
    <div class="container">
        <%--设计所名称--%>
        <div style="margin:20px 0px;" class="row">
            <div class="col-md-12">
				<h3 class="title2 company headerTxt" id="company" style="font-size:26px;"></h3>
            </div>
        </div>

        <%--设计四项指标--%>
        <div class="row">
            <div class="col-sm-6">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span class="number repairCount"></span>套</p>
                            <p class="textSum">设计图纸数(套)</p >
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span class="number onShipCount"></span>艘</p>
                            <p class="textSum">图纸建造渔船数(艘)</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span class="number percentOfPass"></span>%</p>
                            <p class="textSum">图纸审查通过率(%)</p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="box01 box">
                            <p class="margin35"><b class="iconSum"></b></p>
                            <p class="numberColor numberStyle"><span class="number" id="sheji_point">0</span>分</p>
                            <p class="textSum">设计企业能力评估(分)</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="box02 box">
                    <h3 class="title01">关键指标</h3>
                    <div class="row">
                        <div class="col-sm-6">
                            <p class="numberColor numberStyle"><span class="number setdate">2004.08</span></p>
                            <p class="textSum">注册时间</p>
                        </div>
                        <div class="col-sm-6">
                            <p class="numberColor numberStyle"><span class="number workesnum">200</span>万元</p>
                            <p class="textSum">注册资金</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <p class="numberColor numberStyle"><span class="number certwokernum">19</span>人</p>
                            <p class="textSum">专业技术人员</p>
                        </div>
                        <div class="col-sm-6">
                            <p class="numberColor numberStyle"><span class="number maxShipLength">L≥60</span>m</p>
                            <p class="textSum">设计最大船长</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row lastRow">
            <%--设计企业概况--%>
                <div class="col-sm-6">
                    <div class="box repairBox">
                        <h3 class='title01'>企业概况</h3>
                        <div class="qiyemsg">
                            <ul class="information">
                                <li><b>工商注册号：</b><span id="registeredNum"></span></li>
                                <li><b>法人代表：</b><span id="personName"></span></li>
                                <li><b>注册资本(万元)：</b><span id="zcMoney"></span></li>
                                <li><b>质量保障：</b><span id="quality"></span></li>
                                <li><b>公司人数：</b><span id="staff"></span></li>
                                <li><b>设计范围：</b><span id="designRange"></span></li>
                                <li><b>公司类型：</b><span id="type"></span></li>
                                <li><b>登记机关：</b><span id="registerOffice"></span></li>
                                <li><b>企业地址：</b><span id="address" title=""></span></li>
                                <li><b>联系电话：</b><span id="tel"></span></li>
                                <li><b>经营范围：</b><span id="manageRange"></span></li>
                                <li><b>信用代码：</b><span id="creditcode"></span></li>
                                <li><b>营业执照：</b><img src="" alt="营业执照" style="width:30px;height:50px;vertical-align: top;"
                                                     class="zhizhaoImg zoomify" id="zhizhaoImg"/></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <%--企业技术人员占比--%>
                <div class="col-sm-6">
                     <div class="box repairBox" >
                          <div class="title01">企业技术人员占比</div>
                         <div id="stuff" style="width:560px;height:330px;"></div>
                     </div>
                </div>
        </div>
        <%--弹出层--%>
        <div id='view1' class='hide'></div>
        <ul class="lay">
        <script type="text/template" id='layOne'>
            <li class="lis1" id="lisOne">
                <!--弹出层1 设计图纸套数-->
                <div class="row">
                    <div class="dp-search" style="width:35%;">
                        <input type="text" id="drawSearch" placeholder="请输入图号、负责人" style="width:85%;background: #fff;color:#0B61A4;"/><a class="searchpic" id="draw-search-btn"></a>
                    </div>
                    <table class="table table-striped">
                        <thead>
                            <tr class="shejiCon">
                                <td>图号</td>
                                <td>登记船长(m)</td>
                                <td>总吨位</td>
                                <td>船舶种类</td>
                                <td>拟建造艘数</td>
                                <td>设计负责人</td>
                                <td>审图验船师</td>
                                <td>批准日期</td>
                            </tr>
                        </thead>
                        <tbody id="drawTbody">
                        {{each th}}
                            <tr>
                                <td>{{$value.drawno}}</td>
                                <td>{{$value.shiplength}}</td>
                                <td>{{$value.tonnage}}</td>
                                <td>{{$value.shiptype}}</td>
                                <td>{{$value.rebshipnum}}</td>
                                <td>{{$value.resppersion}}</td>
                                <td>{{$value.surveyorName}}</td>
                                <td>{{$value.apprtime}}</td>
                            </tr>
                        {{/each}}
                        </tbody>
                    </table>
                    <%--分页--%>
                    <div id="paging"></div>
                </div>
            </li>
        </script>
        <script type="text/template" id='layOne1'>
            {{each th}}
            <tr>
                <td>{{$value.drawno}}</td>
                <td>{{$value.shiplength}}</td>
                <td>{{$value.tonnage}}</td>
                <td>{{$value.shiptype}}</td>
                <td>{{$value.rebshipnum}}</td>
                <td>{{$value.resppersion}}</td>
                <td>{{$value.surveyorName}}</td>
                <td>{{$value.apprtime}}</td>
            </tr>
            {{/each}}
        </script>
        <script type="text/template" id="layTwo">
            <li class="lis1" id="lisTwo">
                <!--弹出层2 图纸建造渔船数 -->
                <div class="row">
                    <div class="dp-search" style="width:35%;">
                        <input type="text" placeholder="请输入图号、负责人" style="width:85%;background: #fff;color:#0B61A4;"/><i class="searchpic"></i>
                    </div>
                    <table class="table table-striped">
                        <thead>
                            <tr class="shejiCon">
                                <td>图号</td>
                                <td>建造数（艘）</td>
                                <td>项目负责人</td>
                                <td>开工时间</td>
                                <td>完工时间</td>
                            </tr>
                        </thead>
                        <tbody id="drawBuildTbody">
                        {{each th}}
                        <tr>
                            <td>{{$value.drawno}}</td>
                            <td>{{$value.shiplength}}</td>
                            <td>{{$value.tonnage}}</td>
                            <td>{{$value.shiptype}}</td>
                            <td>{{$value.rebshipnum}}</td>
                        </tr>
                        {{/each}}
                        </tbody>
                    </table>
                    <%--分页--%>
                    <div id="drawBuidPaging"></div>
                </div>
            </li>
        </script>
        <script type="text/template" id="layThree">
            <li class="lis1" id="lisThree">
                <!--弹出层3 图纸设计一次通过率-->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="line-chart" style="position: relative;">
                            <div id="pie-chart" style="width:100%;height:360px;"></div>
                        </div>
                    </div>
                </div>
            </li>
        </script>
        <script type="text/template" id="layFour">
            <li class="lis1 act" id="lisFour">
                <!--弹出层4 设计企业能力评估-->
                <div class="row">
                    <div class="col-sm-6  radar">
                        <div class="line-chart" style="position: relative;">
                            <div id="sj-radar-chart" style="width:100%;height:300px;"></div>
                            <div class="fenshu"><strong>{{score}}</strong>分</div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="panel-group" id="sj_qingkuang">
                            {{each result}}
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a href="\#{{$value.id}}"data-toggle="collapse" data-parent="#sj_qingkuang"><i class="glyphicon glyphicon-hand-down"></i>{{$value.name}} &nbsp;({{$value.score}}/{{$value.totalScore}})</a>
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
        <%--结束弹出层--%>
    </div>
<script>
    <%--企业技术人员占比图--%>
    var stuff = echarts.init(document.getElementById("stuff"));
    var option = {

        color: ['#EF3D43','#4D9FED','#2B618E','#FFE119','#FF8919','#9EF229','#E34FE8','rgba(54,59,109,0.1)'],
        tooltip: {
            trigger: 'none',
            //  trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'right',
            textStyle: {
                color: '#00C6FF'          // 图例文字颜色
            },
            y: 'bottom',
            data: ['轮机','船体高级工程师','轮机高级工程师','电气高级工程师','船体工程师','高级工程师','电气工程师']
        },
        series: [
            {
                name:'访问来源',
                type:'pie',
                selectedMode: 'single',
                center:['center','center'],
                radius: [0, '45%'],
                label: {
                    normal: {
                        position: 'outer'
                    }
                },
                labelLine: {
                    normal: {
                        show: true
                    }
                },
                data:[
                    {value:2646,name:'轮机', selected:true},{value:3036,name:'船体高级工程师'}, {value:895,name:'轮机高级工程师'},{value:251,name:'电气高级工程师'}, {value:1036,name:'船体工程师'},{value:695,name:'电气工程师'}, { value:261,name:'高级工程师'}
                ],
                itemStyle: {
                    normal: {
                        // color: '各异',
                        borderColor: '#405272',
                        borderWidth: 1,
                        label: {
                            show: true,
                            position: 'outer',
                            formatter: '{c}({d}%)',
                            // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                            textStyle:{
                                fontSize:16
                            }
                        },
                        labelLine: {
                            show: true,
                            length: 50,
                            lineStyle: {
                                //  color: '各异',
                                width: 2,
                                type: 'solid'
                            }
                        }
                    },
                    emphasis: {
                        // color: 各异,
                        borderColor: '#405272',
                        borderWidth: 2,//鼠标移动上去的宽度
                        label: {
                            show: true,
                            position: 'outer'
                            // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                        },
                        labelLine: {
                            show: true,
                            length: 1,
                            lineStyle: {
                                // color: 各异,
                                width: 1, ////鼠标移动上线的宽度
                                type: 'solid'
                            }
                        }
                    }
                }
            }  ,
            //外侧圆圈设置
            {
                name:'外侧圆圈设置',
                type:'pie',
                center:['center','center'],
                radius: ['59%', '65%'],
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
        stuff.setOption(option);
</script>
<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/zoomify.min.js"></script>
<script src="${bt}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${bt}/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script src='${script}/chinasofti/ent/shejiPanel.js'></script>
<script src='${script}/chinasofti/bi/bi_option.js'></script>

