<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<style>
    <%--详细信息表样式--%>
    .repairBox{
        height: 300px;
    }
    #productMsg{
        margin: 0px 30px;
        width: 95%;
        line-height: 26px;
        color: #57BBED;
        border-collapse:collapse;
    }
    #productMsg tbody tr td{
        line-height: 30px;
        border:1px solid #fff;
        text-align: center;
        width:15%;
    }
    .overHide{
        width: 70px;
    }
    .tdOver{
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        width: 100% !important;
        display: inline-block;
        border: none !important;
    }
</style>
<%--<input type="hidden" id="shipid" value="${shipid}">--%>
<%--<input type="hidden" id="productid" value="${productid}">--%>
<div class="container">
    <%--产品信息页面--%>
    <div style="margin:20px 0px;" class="row">
        <div class="col-md-12" style="padding-left:0;">
            <div class="layui-breadcrumb" id="bread"></div>
            <h3 class="title2 company headerTxt" style="font-size:24px;margin-right: 3%;">产品名称：<span class="proname" id="proName"></span></h3>
            <h3 class="title2 company headerTxt" style="font-size:24px;">编号：<span class="proname" id="proNumber"></span></h3>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="box repairBox">
                <h3 class="box2-title">产品基本信息</h3>
                <table id="productMsg">
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <%--产品追溯信息--%>
    <div class="row">
        <div class="col-md-12">
            <div class="time">
                <div class="title01">产品追溯信息</div>
                <div class="wrapper-t">
                    <div class="content-t"></div>
                </div>
                <div class="t-back"></div>
                <div class="t-go"></div>
            </div>
        </div>
    </div>

</div>
<%--<script type="text/javascript" src='${script}/js/change.js'></script>--%>
<script>
    $(document).ready(function(){
        var uid = "${uid}";
        $.ajax({
            url:get_root+'/ship/getProductinfo?checkUid='+uid,
            type:'post',
            dataType:'json',
            success:function(data){
                var proData = data.result.prodect;
                var hisData = data.result.history;
                $('#proName').text(proData.CP_NAME);
                $('#proNumber').text(proData.CP_CERTNUM);
                var conHtml = "<tr>" +
                    "<td>证书编号：</td><td colspan='2'>"+proData.CP_CPBH+"</td><td>发证日期：</td><td colspan='2'>"+proData.CPH_CERTTIME+"</td></tr>" +
                    "<tr>" +
                    "<td>产品名称：</td><td colspan='2'>" +proData.CP_NAME+"</td><td>企业代码：</td><td colspan='2'>"+proData.CE_CREDITCODE+"</td></tr>" +
                    "<tr>" +
                    "<td>产品型号：</td><td colspan='2'>"+proData.CP_CPXH+"</td><td>产品分类：</td><td colspan='2'>"+proData.CP_CATE+"</td>" +
                    "</tr>" +
                    "<tr>" +
                    "<td>制造厂商：</td><td class='tdOver' style='border-bottom: 1px solid #fff !important;'>"+proData.CE_ENTNAME+"</td><td>制造厂地址：</td><td class='tdOver' style='border-bottom: 1px solid #fff !important;'>"+proData.CE_ADDRESS+"</td><td>图纸批准号：</td><td>"+proData.CP_TZPZH+"</td>" +
                    "</tr>" +
                    "<tr>" +
                    "<td>单位名称：</td><td class='tdOver'>"+proData.CE_ENTNAME+"</td><td>地址：</td><td class='tdOver'>"+proData.CE_ADDRESS +"<td>电子邮件：</td><td>"+proData.CEQ_ENTEMAIL+"</td>"+
                    "</tr>" +
                    "<tr>" +
                    "<td>邮政编码：</td><td>"+proData.CEQ_POSTALCODE+"</td><td>联系电话：</td><td>"+proData.CEQ_TELPHONE+"</td><td>联系人：</td><td>"+proData.CEQ_CONTACT+"</td>" +
                    "</tr>" +
                    "<tr>" +
                    "<td>证书有效期开始：</td><td>"+proData.CPH_ENTID+"</td><td>证书有效期结束：</td><td>"+proData.CPH_CHECKTIMENEXT+"</td><td>发证地点：</td><td>"+proData.CPH_CERTADDR+"</td>" +
                    "</tr>";

                $('#productMsg tbody').append(conHtml);

                //认可类型 a
                var con ='';
                function proType(obj){
                    var obj = obj;
                    con += ("<div class='content-t1 ccc'><h4 class='content-t1-name'>认可类型</h4> <div class='content-con'><p>认可时间：<time>" + obj.STARTTIME+
                        "</time></p><p>认可产品名称：<span class='overHide' title='"+obj.NAME+"'>" +obj.NAME + "</span></p>" +
                        "<p>认可产品类别：<span class='overHide' title='"+obj.TYPE+"'>" + obj.TYPE + "</span></p><p>认可证书编号：<span class='overHide' title='"+obj.CERTIFICATENUMBER+"'>"+obj.CERTIFICATENUMBER+"</span></p><p>认可有效期：<span>"+obj.VALIDTIMEORRESULT+"</span></p></div> </div>");
                    return con;
                }

                //产品检验 b
                var con2 ='';
                function proCheck(obj){
                    var obj = obj;
                    con2 += ("<div class='content-t1 ccc'><h4 class='content-t1-name hh'>产品检验</h4> <div class='content-con'><p>检验时间：<time>" + obj.STARTTIME+
                        "</time></p><p>检验验船师：<span>" +obj.NAME + "</span></p>" +
                        "<p>检验机构：<span class='overHide' title='"+obj.TYPE+"'>" + obj.TYPE + "</span></p><p>检验结果：<span>"+obj.VALIDTIMEORRESULT+"</span></p><p>检验证书编号：<span class='overHide' title='"+obj.CERTIFICATENUMBER+"'>"+obj.CERTIFICATENUMBER+"</span></p></div> </div>");
                    return con2;

                }

                for (var i = 0; i < hisData.length; i++) {
                    if (i % 2 == 0) {
                        // 样式1
                        if(hisData[i].HISTORYTYPE == 'b'){
                            $('.content-t').html(proCheck(hisData[i]));
                        }else{
                            $('.content-t').html( proType(hisData[i]));
                        }

                    } else {
                        //样式2
                        if(hisData[i].HISTORYTYPE == 'b'){
                            $('.content-t').html(proCheck(hisData[i]));
                            $('.content-t .ccc:odd').removeClass('content-t1');
                            $('.content-t .ccc:odd .hh').removeClass('content-t1-name');
                            $('.content-t .ccc:odd').attr('class','content-t2 ccc');
                            $('.content-t .ccc:odd .hh').attr('class','content-t2-name');
                        }else{
                            $('.content-t').html( proType(hisData[i]));
                        }
                    }
                }
                $('.content-t').css('width',hisData.length * $('.content-t1').width()*(3/2));
                for (var j = 0; j < hisData.length; j++) {
                    if (j % 2 == 0) {
                        // var l = 10 + $('.content-t').width() / entProHistoryList.length * j + 'px';
                        var l =  $('.content-t').width() / hisData.length * j + 'px';
                        $('.content-t .ccc').eq(j).css("left", l);
                    } else {
                        var l2 = $('.content-t').width() / hisData.length * j + 'px';
                        $('.content-t .ccc').eq(j).css("left", l2);
                    }
                }
                system.timeLine($('.content-t').width(),hisData.length);
            }
        })
    })
</script>