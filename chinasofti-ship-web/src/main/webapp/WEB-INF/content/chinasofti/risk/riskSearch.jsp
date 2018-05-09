<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html lang="en" style = 'overflow: hidden'>
<head>
    <meta charset="utf-8">
    <title>风险监测</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${bt}/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">
    <%--<link rel="stylesheet" href="${ctx}/resources/style/css/theme-layout.css">--%>
    <link rel="stylesheet" href="${ctx}/resources/style/css/common-utils.css">
    <link rel="stylesheet" href="${style}/css/animate.min.css">
    <link rel="stylesheet" href="${style}/css/animations.css">
    <link rel="stylesheet" href="${style}/css/jquery.fullPage.css">
    <style>
        #fp-nav ul li a span, .fp-slidesNav ul li a span { background-color: #fff;}
        /* film_focus */
        .film_focus{width:993px;overflow:hidden;position:relative;margin:40px auto;    padding: 20px 0px;}
        .film_focus .film_focus_imgs_wrap{width:1003px; float:right; overflow:hidden;height:430px;}
        .film_focus ul.film_focus_imgs{height:auto;position:absolute;right:0;overflow:hidden;width:1003px;}
        .film_focus ul.film_focus_imgs li{overflow:hidden; height:430px;width:1003px;height:auto; bottom:0; margin:5px 0;}
        .film_focus ul.film_focus_imgs li img{height:160px;width:245px;}
        .film_focus ul.film_focus_nav{width:193px;position:absolute;left:0;top:0;z-index:100;}
        .film_focus ul.film_focus_nav li{width:170px;height:107px;left:0px;padding:0px 10px;word-break:break-all;color:#fff;font-size:22px;overflow:hidden;line-height:105px; background:#0A1838; border-left:solid 1px #d7d7d7; border-right:solid 2px #aacf53; border-bottom:solid 1px #d7d7d7;}
        .film_focus ul.film_focus_nav li.cur{width:170px;left:0px;padding:0px 10px;word-break:break-all;color:#fff;overflow:hidden;line-height:105px; background:#3458B5; cursor:pointer; border-left:solid 1px #aacf53; border-right:solid 2px #aacf53;border-bottom:solid 1px #aacf53;}
        .film_focus ul.film_focus_nav li b{display:none;height:105px;width:170px;float:left;}
        .film_focus ul.film_focus_nav li span img{ float:left; margin:35px 10px 0 10px;}
        .film_focus ul.film_focus_nav li b p img{ float:left; margin:35px 10px 0 10px;}
        .film_focus ul.film_focus_nav li.cur b{ font-weight:100;}

        .film_focus ul.film_focus_nav li span.zhanl img{ float:left; margin:42px 10px 0 10px;}
        .film_focus ul.film_focus_nav li b p{ line-height:105px; font-size:22px; color:#fff;}
        .film_focus ul.film_focus_nav li b.zhanl p img{ float:left; margin:42px 10px 0 10px;}
        .film_focus ul.film_focus_nav li p{ line-height:105px; color:#fff; font-size:22px;}

        .film_focus ul.film_focus_nav li span.huod img{ float:left; margin:25px 10px 0 10px;}
        .film_focus ul.film_focus_nav li b.huod p img{ float:left; margin:25px 10px 0 10px;}

        .film_focus ul.film_focus_nav li.cur b{display:block;vertical-align: middle;display: table-cell;height:105px;width:170px;float:left;}
        .film_focus ul.film_focus_nav li.cur span{display:none;}

        .film_focus ul.film_focus_nav li b p{ font-size:22px;}

        .film_focus_imgs li dl dd{float: left;
            width: 258px;
            height: 160px;
            margin: 25px 0 25px 64px;}
        .film_focus_imgs li dl dd a{ width:244px; height:160px; display:block;}
        .film_focus_imgs li dl dd a .mouse_s{width:245px; height:160px;box-shadow: 5px 10px 10px 0px rgba(15,35,83,0.65);}
        .film_focus_imgs li dl dd a .mouse_s p{width: 100%;
            bottom: 31px;
            position: relative;
            line-height: 32px;
            background: #153264;
            color: #fff;
            font-size: 14px;
            text-align: center;}
        .film_focus_imgs li dl dd a .hover_s{width:244px; height:160px; position:relative;top:-990px;}
        .film_focus_imgs li dl dd a .hover_s p{ background:#d2d2d2; color:#333; font-size:14px; text-align:center;}
        .film_focus_imgs li dl dd a:hover .hover_s{ display:block; height:160px;top:-160px;}
        .film_focus_imgs li dl dd a:hover .hover_s p{width:100%; text-align:center;bottom:31px; line-height:32px; background:none;position:relative; font-size:14px; color:#fff;}
        .blankName,.grayName,.otherName{
            top: 0px;
            left: 0%;
            z-index: 10;
        }
        @media screen and  (min-width:1310px)and  (max-width:1320px){
            .blankName:before,.grayName:before,.otherName:before{
                left: 12.2%;
            }
        }

        @media screen and  (min-width:1340px)and  (max-width:1390px){
            .blankName:before,.grayName:before,.otherName:before{
                left: 13.45%;
            }
        }

        @media screen and  (min-width:1390px) and  (max-width:1550px){
            .blankName:before,.grayName:before,.otherName:before{
                left: 17.45%;
            }
        }

        .content-wrap {
            padding: 0px;
        }
        /*统一弹层样式*/
        .personTable{
            margin:20px;
            width:700px;
        }
        .personTable .layui-layer-content{
            background:#122C5B;
            padding:10px;
            color: #fff;
        }
        .personTable .layui-layer-title{
            font-size: 20px;
            border-bottom: none;
        }
        .personTable .layui-layer-title{
            color:#fff;
            background:#122C5B;
        }
        .personTable .layui-layer-setwin .layui-layer-close2{
            right: 3px;
            top:1px;
            width:20px;
            height:20px;
        }
        .personTable .layui-layer-setwin .layui-layer-ico{
            background:url('../../../../resources/style/images/close.png');
        }
        .modelTable{width: 100%;}
        .modelTable thead tr th{
            width:5%;
            height:30px;
            color: #fff;
            font-size: 14px;
            text-align: center;
            border-top:1px solid #204A79;
            border-bottom:1px solid #204A79;
        }
        .modelTable tbody tr td{
            width:5%;
            height:30px;
            font-size:14px;
            padding:5px;
            text-align: center;
            color:#53B2E5;
        }
        .modelTable tbody tr:nth-child(odd){
            background:#122c5b ;
        }
        .modelTable tbody tr:nth-child(even){
            background: #294b6c;
        }
        .layui-btn {
            display: inline-block;
            height: 25px;
            line-height: 25px;
            padding: 0 15px;
            margin-top: -4px;
        }
        .safebox{
            display: inline-block;
            width: 23%;
        }
        .safeSel{
            width: 55%;
            color: #000;
        }
        .shipOwner{
            color: #000;
        }
        .layui-laypage span.layui-laypage-curr, .layui-laypage a{
            margin: 0px 5px;
            padding: 0px 12px;
        }
        .layui-laypage span{
            background-color: transparent;
            border: 1px solid #6AC3FC;
            color: #69C1F9;
            margin: 0 0px 2px 0;
        }

        .layui-laypage .layui-laypage-curr .layui-laypage-em{
            background-color: #009CFF;
        }
        .layui-laypage a{
            background-color: transparent;
            border: 1px solid #6AC3FC;
            color: #69C1F9;
        }
        #tjycContent{
            text-align: right;
        }
        .searchTotal{
            color: #F0FF00;
        }
        
    </style>
</head>

<body >
<div class="wrap-fluid">
    <div class="container-fluid">
        <div class="content-wrap">
            <div id="dowebok">
                <div style="background:url(../../../../resources/style/images/searchbg.png) no-repeat;background-size: 100% 100%;" id="section1"  class="section active pt-perspective pt-page-moveFromTop">
                    <div class="row">
                        <%--<span class="blankName"></span>--%>

                        <%--<div class="film_focus" style=" border-top:solid 4px #0A1838;">--%>
                        <div class="film_focus">
                            <img class="blankName" src="../../../../resources/style/images/risk.png" alt="">
                            <div class="film_focus_imgs_wrap" style="">
                                <ul class="film_focus_imgs">
                                    <li>
                                        <dl>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>脱检渔船</p></div><div class="hover_s tuojian"><img src="../../../../resources/style/images/chse.png" /><p>脱检渔船</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>机船不符</p></div><div class="hover_s jichuan"><img src="../../../../resources/style/images/chse.png" /><p>机船不符</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>大机小标</p></div><div class="hover_s daxiao"><img src="../../../../resources/style/images/chse.png" /><p>大机小标</p></div></a></dd>
                                        </dl>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="background:url(../../../../resources/style/images/searchbg.png) no-repeat;background-size: 100% 100%;"  id="section2" class="section pt-perspective pt-page-moveFromTop">
                    <div class="row">
                        <%--<span class="grayName"></span>--%>
                        <div class="film_focus">
                            <img class="grayName" src="../../../../resources/style/images/risk2.png" alt="">
                            <div class="film_focus_imgs_wrap">
                                <ul class="film_focus_imgs">
                                    <li>
                                        <dl>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>一次检验合格率低的企业</p></div><div class="hover_s yici"><img src="../../../../resources/style/images/chse.png" /><p>一次检验合格率低的企业</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>渔船安全指数低的企业</p></div><div class="hover_s shipsafe"><img src="../../../../resources/style/images/chse.png" /><p>渔船安全指数低的企业</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>诚信值低的船东</p></div><div class="hover_s chengxin"><img src="../../../../resources/style/images/chse.png" /><p>诚信值低的船东</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>抽查合格率低的产品制造企业</p></div><div class="hover_s choucha"><img src="../../../../resources/style/images/chse.png" /><p>抽查合格率低的产品制造企业</p></div></a></dd>

                                        </dl>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

                <div style="background:url(../../../../resources/style/images/searchbg.png) no-repeat;background-size: 100% 100%;" id="section3" class="section pt-perspective pt-page-moveFromTop">
                    <div class="row">
                        <%--<span class="otherName"></span>--%>
                        <div class="film_focus">
                            <img class="otherName" src="../../../../resources/style/images/risk3.png" alt="">
                            <div class="film_focus_imgs_wrap">
                                <ul class="film_focus_imgs">
                                    <li>
                                        <dl>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>报停渔船</p></div><div class="hover_s baoting"><img src="../../../../resources/style/images/chse.png" /><p>报停渔船</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>船多人少</p></div><div class="hover_s duoshao"><img src="../../../../resources/style/images/chse.png" /><p>船多人少</p></div></a></dd>
                                            <dd><a href="#"><div class="mouse_s"><img src="../../../../resources/style/images/cp.png" /><p>验船师能力评估</p></div><div class="hover_s surability"><img src="../../../../resources/style/images/chse.png" /><p>验船师能力评估</p></div></a></dd>
                                        </dl>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/template" id="tjyc">
    <? for(var i = 0 ;i<content.length;i++) { ?>
         <tr>
            <td>
                <?= content[i].ROWNUM_ ?>
            </td>


            <td style='text-align:left;'>
                <?= content[i].CS_SHIPNAME ?>
            </td>


            <td >
                <?= content[i].YCJY ?>
            </td>


            <td >
                <?= content[i].CS_SHIPLENGTH ?>
            </td>
            <td>
                <?= content[i].CS_POWER ?>
            </td>

            <td >
                <?= content[i].CS_SHIPPORT ?>
            </td>


        <td >
            <?= content[i].CS_OWNERNAME ?>
        </td>


        <td >
            <? if(content[i].CS_OWNERTEL == '0') {  ?>

          <?  } else {  ?>
                <?= content[i].CS_OWNERTEL ?>
         <? } ?>
            <%--<?= content[i].NEXTCHECKTIME ?>--%>
        </td>

        <td >
            <?= content[i].NEXTCHECKTIME ?>
        </td>

        <td >
            <? if(content[i].CS_REGCERTDATE == '0') {  ?>

            <?  } else {  ?>
                <?= content[i].CS_REGCERTDATE ?>
            <? } ?>
        </td>

    </tr>
    <? } ?>
</script>


<!--通用-->

<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>

<script type="text/javascript" src='${script}/js/template-web.js'></script>
<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/layui.all.js'></script>
<script type="text/javascript" src="${script}/chinasofti/bi/jquery.fullPage.js"></script>
<script type="text/javascript" src='${script}/js/change.js'></script>
<script>
    $(document).ready(function(){
        $('#dowebok').fullpage({
            navigation: true,
            afterRender : function(){
                //控制iframe高度
                $('#nav_iframe', window.parent.document).css({
                    minHeight : 650
                });

            },
        });

        $(".tuojian").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div id='tjycContent'>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>船东：</span>" +
                "<input type='text' placeholder='请输入' class='shipOwner'>" +
                "</div>"+
                " <div class='safebox'><span>作业区域：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>远洋</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
            " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>船名</th>\n" +
                "                     <th>作业区域</th>\n" +
                "                     <th>船长(m)</th>\n" +
                "                     <th>主机功率(kw)</th>\n" +
                "                     <th>船籍港</th>\n" +
                "                     <th>船东</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>检验日期</th>\n" +
                "                     <th>证书有效期</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody id='tjycTbody'>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                    "<p class='total'> </p>"+
                "<div id=\"layerPage\"></div>"+
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "脱检渔船",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
            //table数据
            var url = get_root + "/ship/getInspectList";
            $.ajax({
                url: url,
                type: 'post',
                dataType: 'json',
                data : {
                    rows : "5",
                    page : "1"
                },
                beforeSend : function(){
                    layerLoad = layer.load(3)
                },
                success : function(data){
                    console.log(data);
                    //默认设置每页显示5行
                    var nums = 5;
                    layer.close(layerLoad);
                    var list = data.result.dataList;
                    var str = template('tjyc',{
                        content : list
                    });
                    $('#tjycTbody').html(str);
                    $('.total').html("当前查询渔船总数为:<span class='searchTotal'>"+data.result.rowCount+"艘次</span>");
                    var laypage = layui.laypage;
                    laypage({
                        cont: 'layerPage'
                        ,pages: Math.ceil(data.result.rowCount/nums) //总页数
                        ,groups: 5 //连续显示分页数
                        ,jump : function(obj,first){
                            if(obj.curr == 1){
                                var str = template('tjyc',{
                                    content : list
                                });
                                $('#tjycTbody').html(str);
                            }else{
                                $.ajax({
                                    url: url,
                                    type: 'post',
                                    data : {
                                        rows : nums,
                                        page : obj.curr
                                    },
                                    dataType: 'json',
                                    beforeSend : function(){
                                       layerLoad = layer.load(3)
                                    },
                                    success : function(data){
                                        layer.close(layerLoad);
                                        var list = data.result.dataList;
                                        var str = template('tjyc',{
                                            content : list
                                        });
                                        $('#tjycTbody').html(str);
                                    }
                                })
                            }
                        }
                    });
                    
                }
            })


        });
        $(".jichuan").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>船东：</span>" +
                "<input type='text' placeholder='请输入' class='shipOwner'>" +
                "</div>"+
                " <div class='safebox'><span>作业区域：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>远洋</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br> <table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>船名</th>\n" +
                "                     <th>作业区域</th>\n" +
                "                     <th>船长(m)</th>\n" +
                "                     <th>主机功率(kw)</th>\n" +
                "                     <th>船籍港</th>\n" +
                "                     <th>船东</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>证书主机型号</th>\n" +
                "                     <th>实际主机型号</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td style='text-align:left;'>闽漳渔60228</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>26.08</td>\n" +
                "                     <td>16.18</td>\n" +
                "                     <td>漳浦</td>\n" +
                "                     <td>林元章</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>C0430042321</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td style='text-align:left;'>鲁乳渔养65658</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>11</td>\n" +
                "                     <td>乳山口</td>\n" +
                "                     <td>乳山正洋食品有限公司</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>C0430042322</td>\n" +
                "                     <td>1124065</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td style='text-align:left;'>闽云渔05733</td>\n" +
                "                     <td>内河渔船</td>\n" +
                "                     <td>9.55</td>\n" +
                "                     <td>8.8</td>\n" +
                "                     <td>云霄</td>\n" +
                "                     <td>陈民聪</td>\n" +
                "                     <td>13859279987</td>\n" +
                "                     <td>C2130212325</td>\n" +
                "                     <td>中洋日马</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td style='text-align:left;'>闽云渔05727</td>\n" +
                "                     <td>内河渔船</td>\n" +
                "                     <td>8.1</td>\n" +
                "                     <td>3.68</td>\n" +
                "                     <td>云霄</td>\n" +
                "                     <td>陈结明</td>\n" +
                "                     <td>15060535718</td>\n" +
                "                     <td>C2130212328</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td style='text-align:left;'>闽云渔05623</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>8.06</td>\n" +
                "                     <td>16.18</td>\n" +
                "                     <td>云霄</td>\n" +
                "                     <td>方加福</td>\n" +
                "                     <td>13386941202</td>\n" +
                "                     <td>C2130263210</td>\n" +
                "                     <td>4317G000518</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>6</td>\n" +
                "                     <td style='text-align:left;'>鲁牟渔养61525</td>\n" +
                "                     <td>国远洋渔船</td>\n" +
                "                     <td>10</td>\n" +
                "                     <td>18</td>\n" +
                "                     <td>养马岛</td>\n" +
                "                     <td>牟平区志国海产品养殖场</td>\n" +
                "                     <td>13706316224</td>\n" +
                "                     <td>C2130263215</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "机船不符",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".daxiao").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>船东：</span>" +
                "<input type='text' placeholder='请输入' class='shipOwner'>" +
                "</div>"+
                " <div class='safebox'><span>作业区域：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>远洋</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br> <table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>船名</th>\n" +
                "                     <th>作业区域</th>\n" +
                "                     <th>船长(m)</th>\n" +
                "                     <th>主机功率(kw)</th>\n" +
                "                     <th>船籍港</th>\n" +
                "                     <th>船东</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>证书主机功率(kw)</th>\n" +
                "                     <th>实际主机功率(kw)</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td style='text-align:left;'>闽漳渔60228</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>26.08</td>\n" +
                "                     <td>16.18</td>\n" +
                "                     <td>漳浦</td>\n" +
                "                     <td>林元章</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>16.18</td>\n" +
                "                     <td>26.28</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td style='text-align:left;'>鲁乳渔养65658</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>11</td>\n" +
                "                     <td>乳山口</td>\n" +
                "                     <td>乳山正洋食品有限公司</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>11</td>\n" +
                "                     <td>22</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td style='text-align:left;'>鲁乳渔养65652</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>11</td>\n" +
                "                     <td>乳山口</td>\n" +
                "                     <td>乳山正洋食品有限公司</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>11</td>\n" +
                "                     <td>22</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td style='text-align:left;'>鲁牟渔养61526</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>10</td>\n" +
                "                     <td>18</td>\n" +
                "                     <td>养马岛</td>\n" +
                "                     <td>孙怀纯</td>\n" +
                "                     <td>13793372068</td>\n" +
                "                     <td>18</td>\n" +
                "                     <td>28</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td style='text-align:left;'>闽漳渔05028</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>5.58</td>\n" +
                "                     <td>3.9</td>\n" +
                "                     <td>漳浦</td>\n" +
                "                     <td>林省民</td>\n" +
                "                     <td>18960021111</td>\n" +
                "                     <td>3.9</td>\n" +
                "                     <td>8.9</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>6</td>\n" +
                "                     <td style='text-align:left;'>闽漳渔05022</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>5.58</td>\n" +
                "                     <td>3.9</td>\n" +
                "                     <td>漳浦</td>\n" +
                "                     <td>林省民</td>\n" +
                "                     <td>18960021111</td>\n" +
                "                     <td>3.9</td>\n" +
                "                     <td>8.9</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "大机小标",
                area: ['1200px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".yici").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>日期：</span>" +
                "<input type='date' class='shipOwner'>" +
                "</div>"+

                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
            "                     <th>序号</th>\n" +
                "                     <th>企业名称</th>\n" +
                "                     <th>企业地址</th>\n" +
                "                     <th>成立时间</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>负责人</th>\n" +
                "                     <th>联系人</th>\n" +
                "                     <th>渔船数量(艘)</th>\n" +
                "                     <th>一次检验合格率</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td>广东兴海麒麟远洋渔业有限公司</td>\n" +
                "                     <td>广东省广州市天河区天河东路67号2608</td>\n" +
                "                     <td>2008.12.11</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>陈升忠</td>\n" +
                "                     <td>林福友</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>56%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>广东协盛远洋渔业有限公司</td>\n" +
                "                     <td>广州市天河区天河东路6号粤安广场北塔2103房</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>陈民聪</td>\n" +
                "                     <td>林金财</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>61%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>广州远洋渔业公司</td>\n" +
                "                     <td>广州市海珠区新港东路2842号</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>张大庆</td>\n" +
                "                     <td>刘火明</td>\n" +
                "                     <td>14</td>\n" +
                "                     <td>46%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>深圳启森渔业有限公司</td>\n" +
                "                     <td>深圳市罗湖区深南东路2001号鸿昌广场3302室</td>\n" +
                "                     <td>1993.12.12</td>\n" +
                "                     <td>13656060958</td>\n" +
                "                     <td>方加福</td>\n" +
                "                     <td>倪君利</td>\n" +
                "                     <td>7</td>\n" +
                "                     <td>61%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>湛江市粤水渔业有限公司</td>\n" +
                "                     <td>广东省湛江市开发区东怡路1号</td>\n" +
                "                     <td>2013.12.18</td>\n" +
                "                     <td>13599683959</td>\n" +
                "                     <td>陈升忠</td>\n" +
                "                     <td>罗招德</td>\n" +
                "                     <td>14</td>\n" +
                "                     <td>56%</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "一次检验合格率低的企业",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".shipsafe").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>日期：</span>" +
                "<input type='date' class='shipOwner'>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>企业名称</th>\n" +
                "                     <th>企业地址</th>\n" +
                "                     <th>成立时间</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>负责人</th>\n" +
                "                     <th>联系人</th>\n" +
                "                     <th>渔船数量</th>\n" +
                "                     <th>渔船安全指数</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td>广东兴海麒麟远洋渔业有限公司</td>\n" +
                "                     <td>广东省广州市天河区天河东路67号2608</td>\n" +
                "                     <td>2008.12.11</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>陈升忠</td>\n" +
                "                     <td>林福友</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>56%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>湛江市昊海远洋渔业有限公司</td>\n" +
                "                     <td>湛江海滨大道中147号</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>陈民聪</td>\n" +
                "                     <td>林金财</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>61%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>中水集团远洋股份有限公司</td>\n" +
                "                     <td>北京市西城区民丰胡同31号</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>张大庆</td>\n" +
                "                     <td>刘火明</td>\n" +
                "                     <td>14</td>\n" +
                "                     <td>46%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>天津天祥渔业股份有限公司</td>\n" +
                "                     <td>天津市塘沽区东江路3849号</td>\n" +
                "                     <td>1993.12.12</td>\n" +
                "                     <td>13656060958</td>\n" +
                "                     <td>方加福</td>\n" +
                "                     <td>倪君利</td>\n" +
                "                     <td>7</td>\n" +
                "                     <td>61%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>天津牧洋渔业有限公司</td>\n" +
                "                     <td>天津市塘沽区东江路3849号</td>\n" +
                "                     <td>2013.12.18</td>\n" +
                "                     <td>13599683959</td>\n" +
                "                     <td>陈升忠</td>\n" +
                "                     <td>罗招德</td>\n" +
                "                     <td>14</td>\n" +
                "                     <td>56%</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "渔船安全指数低的企业",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".chengxin").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>日期：</span>" +
                "<input type='date' class='shipOwner'>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>企业名称</th>\n" +
                "                     <th>企业地址</th>\n" +
                "                     <th>成立时间</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>负责人</th>\n" +
                "                     <th>联系人</th>\n" +
                "                     <th>渔船数量</th>\n" +
                "                     <th>船东诚信(分)</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td>广东兴海麒麟远洋渔业有限公司</td>\n" +
                "                     <td>广东省广州市天河区天河东路67号2608</td>\n" +
                "                     <td>2018.12.21</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>陈升忠</td>\n" +
                "                     <td>林福友</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>67</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>广东协盛远洋渔业有限公司</td>\n" +
                "                     <td>广州市天河区天河东路6号粤安广场北塔2103房</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>0631-6688155</td>\n" +
                "                     <td>陈明泉</td>\n" +
                "                     <td>周程雄</td>\n" +
                "                     <td>13</td>\n" +
                "                     <td>87</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>深圳市联成远洋渔业有限公司</td>\n" +
                "                     <td>深圳市福田区金田路荣超经贸中心4203</td>\n" +
                "                     <td>1993.12.12</td>\n" +
                "                     <td>13678987789</td>\n" +
                "                     <td>刘向荣</td>\n" +
                "                     <td>刘利军</td>\n" +
                "                     <td>13</td>\n" +
                "                     <td>87</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>深圳市华南渔业有限公司</td>\n" +
                "                     <td>深圳市福田区金田路4028号荣超经贸中心4205A</td>\n" +
                "                     <td>2013.11.12</td>\n" +
                "                     <td>13890987383</td>\n" +
                "                     <td>陈木华</td>\n" +
                "                     <td>方家洲</td>\n" +
                "                     <td>13</td>\n" +
                "                     <td>87</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>烟台北京远洋渔业公司</td>\n" +
                "                     <td>山东省蓬莱市南关路159号百泰大厦5楼</td>\n" +
                "                     <td>2011.09.12</td>\n" +
                "                     <td>13909098978</td>\n" +
                "                     <td>张毅</td>\n" +
                "                     <td>周雄</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>97</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "诚信值低的船东",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".choucha").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>日期：</span>" +
                "<input type='date' class='shipOwner'>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>企业名称</th>\n" +
                "                     <th>企业地址</th>\n" +
                "                     <th>成立时间</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>负责人</th>\n" +
                "                     <th>认可有效期</th>\n" +
                "                     <th>产品型号数量</th>\n" +
                "                     <th>监督抽查合格率</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td>无锡市海联舰船内装有限公司</td>\n" +
                "                     <td>无锡市锡山区东北塘梓旺村</td>\n" +
                "                     <td>2009.10.12</td>\n" +
                "                     <td>13859250892</td>\n" +
                "                     <td>张大庆</td>\n" +
                "                     <td>2017.06.02</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>56%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>无锡市文教玻璃钢厂</td>\n" +
                "                     <td>无锡市新区鸿山镇鸿西村</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>13396975195</td>\n" +
                "                     <td>庄祥斌</td>\n" +
                "                     <td>2017.06.17</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>65%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>兴化市启源机械有限公司</td>\n" +
                "                     <td>兴化市经济开发区经三路7号</td>\n" +
                "                     <td>2008.12.12</td>\n" +
                "                     <td>13986977895</td>\n" +
                "                     <td>王琦</td>\n" +
                "                     <td>2017.06.17</td>\n" +
                "                     <td>8</td>\n" +
                "                     <td>75%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>镇江四洋柴油机制造有限公司</td>\n" +
                "                     <td>江苏省镇江市梦溪路2号</td>\n" +
                "                     <td>2009.12.20</td>\n" +
                "                     <td>15060535718</td>\n" +
                "                     <td>程才坤</td>\n" +
                "                     <td>2017.07.17</td>\n" +
                "                     <td>15</td>\n" +
                "                     <td>59%</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>中船动力有限公司</td>\n" +
                "                     <td>镇江市长江路402号</td>\n" +
                "                     <td>2008.09.12</td>\n" +
                "                     <td>13786975190</td>\n" +
                "                     <td>刘立军</td>\n" +
                "                     <td>2017.08.23</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>46%</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "抽查合格率低的产品制造企业",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".duoshao").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>日期：</span>" +
                "<input type='date' class='shipOwner'>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
            "                     <th>序号</th>\n" +
                "                     <th>机构名称</th>\n" +
                "                     <th>机构级别</th>\n" +
                "                     <th>验船师实际人数</th>\n" +
                "                     <th>缺口总人数</th>\n" +
                "                     <th>船体缺口</th>\n" +
                "                     <th>机电缺口</th>\n" +
                "                     <th>其他缺口</th>\n" +
                "                     <th>匹配度</th>\n" +
                "                     <th>年度培训人次</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td>江苏渔业船舶检验局盱眙检验站</td>\n" +
                "                     <td>县站</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>6</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>89%</td>\n" +
                "                     <td>6</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>江苏渔业船舶检验局金湖检验站</td>\n" +
                "                     <td>县站</td>\n" +
                "                     <td>4</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>91%</td>\n" +
                "                     <td>6</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>江苏渔业船舶检验局盐城检验处</td>\n" +
                "                     <td>市处</td>\n" +
                "                     <td>8</td>\n" +
                "                     <td>5</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>2</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>87%</td>\n" +
                "                     <td>5</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>中华人民共和国江苏渔业船舶检验局盐城分局</td>\n" +
                "                     <td>分局</td>\n" +
                "                     <td>12</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>88%</td>\n" +
                "                     <td>3</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>江苏渔业船舶检验局响水检验站</td>\n" +
                "                     <td>县站</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>3</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>1</td>\n" +
                "                     <td>93%</td>\n" +
                "                     <td>6</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "船多人少",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".baoting").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>船东：</span>" +
                "<input type='text' placeholder='请输入' class='shipOwner'>" +
                "</div>"+
                " <div class='safebox'><span>作业区域：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>远洋</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>船名</th>\n" +
                "                     <th>作业区域</th>\n" +
                "                     <th>船长(m)</th>\n" +
                "                     <th>主机功率(kw)</th>\n" +
                "                     <th>船籍港</th>\n" +
                "                     <th>船东</th>\n" +
                "                     <th>联系电话</th>\n" +
                "                     <th>检验日期</th>\n" +
                "                     <th>证书有效期</th>\n" +
                "                     <th>报停时间</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n" +
                "                     <td>1</td>\n" +
                "                     <td style='text-align:left;'>浙路渔运058</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>30.20</td>\n" +
                "                     <td>235.00</td>\n" +
                "                     <td>路桥</td>\n" +
                "                     <td>路桥区渔业总站</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>2016.12.02</td>\n" +
                "                     <td>2017.06.02</td>\n" +
                "                     <td>109</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td style='text-align:left;'>浙岭渔运165</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>28.85</td>\n" +
                "                     <td>198.60</td>\n" +
                "                     <td>温岭</td>\n" +
                "                     <td>胡华军</td>\n" +
                "                     <td>13606876644</td>\n" +
                "                     <td>2016.12.03</td>\n" +
                "                     <td>2017.06.04</td>\n" +
                "                     <td>110</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td style='text-align:left;'>浙玉渔运352</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>22.00</td>\n" +
                "                     <td>88.00</td>\n" +
                "                     <td>玉环</td>\n" +
                "                     <td>梁世松</td>\n" +
                "                     <td>15958088782</td>\n" +
                "                     <td>2016.12.04</td>\n" +
                "                     <td>2017.06.04</td>\n" +
                "                     <td>111</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td style='text-align:left;'>浙玉渔7888</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>17.30</td>\n" +
                "                     <td>88.20</td>\n" +
                "                     <td>玉环</td>\n" +
                "                     <td>林福友</td>\n" +
                "                     <td>&nbsp</td>\n" +
                "                     <td>2016.12.05</td>\n" +
                "                     <td>2017.06.07</td>\n" +
                "                     <td>112</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td style='text-align:left;'>浙苍渔运378</td>\n" +
                "                     <td>国内海洋渔船</td>\n" +
                "                     <td>28.98</td>\n" +
                "                     <td>214.00</td>\n" +
                "                     <td>三门</td>\n" +
                "                     <td>倪君利</td>\n" +
                "                     <td>13058730838</td>\n" +
                "                     <td>2016.12.17</td>\n" +
                "                     <td>2017.06.08</td>\n" +
                "                     <td>113</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "报停渔船",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
        $(".surability").on("click",function(){
            $.fn.fullpage.setAllowScrolling(false)
            var str="<div>" +
                " <div class='safebox'><span>地区：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>北京市</option>" +
                "<option value='0'>上海市</option>" +
                "<option value='0'>黑龙江省</option>" +
                "</select>" +
                "</div>" +
                " <div class='safebox'><span>所属检验机构：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>浙江检验机构</option>" +
                "<option value='0'>杭州检验机构</option>" +
                "</select>" +
                "</div>" +
                "<div class='safebox'><span>姓名：</span><input type='text' placeholder='请输入'></div>"+
                " <div class='safebox'><span>级别：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>验船员</option>" +
                "<option value='0'>助理验船师</option>" +
                "<option value='0'>中级验船师</option>" +
                "<option value='0'>高级验船师</option>" +
                "</select>" +
                "</div>"+
                " <div class='safebox'><span>证书专业：</span><select name='' id='' class='safeSel'>" +
                "<option value='0'>请选择</option>" +
                "<option value='0'>小型渔业船舶检验船体</option>" +
                "<option value='0'>渔业船舶检验管理</option>" +
                "<option value='0'>轮机</option>" +
                "<option value='0'>电气</option>" +
                "</select>" +
                "</div>"+
                " <div style='width:5%' class='safebox'><button class='layui-btn layui-btn-xs'>搜索</button></div>" +
                "<br><table class=\"modelTable\">\n" +
                "                 <thead>\n" +
                "                 <tr>\n" +
                "                     <th>序号</th>\n" +
                "                     <th>姓名</th>\n" +
                "                     <th>工作单位</th>\n" +
                "                     <th>行政职务</th>\n" +
                "                     <th>级别</th>\n" +
                "                     <th>证书专业</th>\n" +
                "                     <th>学历</th>\n" +
                "                     <th>能力得分(分)</th>\n" +
                "                 </tr>\n" +
                "                 </thead>\n" +
                "                 <tbody>\n" +
                "                 <tr>\n"
                "                     <td>1</td>\n" +
                "                     <td>陈京生</td>\n" +
                "                     <td>广西渔业船舶检验局南宁检验处</td>\n" +
                "                     <td>无</td>\n" +
                "                     <td>验船员</td>\n" +
                "                     <td>小型渔业船舶检验</td>\n" +
                "                     <td>大学本科</td>\n" +
                "                     <td>91</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>2</td>\n" +
                "                     <td>雷立毅</td>\n" +
                "                     <td>广西渔业船舶检验局南宁检验处 </td>\n" +
                "                     <td>无</td>\n" +
                "                     <td>助理验船师</td>\n" +
                "                     <td>小型渔业船舶检验</td>\n" +
                "                     <td>大学本科</td>\n" +
                "                     <td>89</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>3</td>\n" +
                "                     <td>周尚焰</td>\n" +
                "                     <td>广西渔业船舶检验局钦州检验处</td>\n" +
                "                     <td>科员</td>\n" +
                "                     <td>验船员</td>\n" +
                "                     <td>渔业船舶检验管理</td>\n" +
                "                     <td>大学本科</td>\n" +
                "                     <td>92</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>4</td>\n" +
                "                     <td>何万然</td>\n" +
                "                     <td>广西渔业船舶检验局南宁检验处 </td>\n" +
                "                     <td>无</td>\n" +
                "                     <td>验船员</td>\n" +
                "                     <td>小型渔业船舶检验</td>\n" +
                "                     <td>大学本科</td>\n" +
                "                     <td>90</td>\n" +
                "                 </tr>\n" +
                "                 <tr>\n" +
                "                     <td>5</td>\n" +
                "                     <td>韦韫宇</td>\n" +
                "                     <td>广西渔业船舶检验局南宁检验处 </td>\n" +
                "                     <td>无</td>\n" +
                "                     <td>助理验船师</td>\n" +
                "                     <td>小型渔业船舶检验</td>\n" +
                "                     <td>大学本科</td>\n" +
                "                     <td>89</td>\n" +
                "                 </tr>\n" +
                "                 </tbody>\n" +
                "             </table>\n" +
                "         </div>"
            layer.open({
                type: 1,
                skin: 'personTable',
                closeBtn: '2',
                content:str,
                scrollBar:false,
                title: "验船师能力评估",
                area: ['1150px', '500px'],
                shade: [0.7, '#000'],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
        });
    })

</script>

</body>
</html>



