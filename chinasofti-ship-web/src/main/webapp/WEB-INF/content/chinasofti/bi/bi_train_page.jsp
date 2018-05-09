<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017年8月23日
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <link rel="stylesheet" href="${ctx}/resources/style/css/theme-layout.css">
</head>
<body>

<div class="row">
    <div id="filterYear" style="display: none;">
        <%--<input placeholder='年份' type="text" class="form-control" value=""
               id="trainingNumYear">--%>
        <div class="shijianduan">
            <!--年份-->
            <div class="kaishi form-group">
                <label>选择年份：</label>
                <!--指定 date标记-->
                <div class="input-group date" id="datetimepicker1">
                    <input type="text" class="form-control" id="trainingNumYear">
                    <span class="input-group-addon">
									<span class="glyphicon-calendar"></span>
								</span>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="row">
    <div id="filterBox" style="color: #fff;font-size:14px;text-align: center">
        <br><br>
        <div id="checkboxs"></div>
        <br><br><br>
        <button style="text-align: center;color:#fff; width: 65px; padding:10px; border:2px solid #FED61C; background-color:#122C5B;"
                id="btnCli" style="margin-top: 25px;">确定
        </button>
    </div>
</div>

<script type="text/javascript" src="${script}/chinasofti/bi/bi_train.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>
<script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>
<script>
    var contentCheckbox = $("#checkboxs").html('');

    var val = [];
    var year = "${year}";
    var strs = "${strs}".split(',');
    var appendFunction = "${appendName}";
    console.log("year=“" + year + "”==strs=“" + strs + "”==appendFunction=“" + appendFunction + "”");

    $('#btnCli').on('click', function () {
        $("input[name='jobtype']").each(function () {
            if ($(this).prop("checked") == true) {
                val.push($(this).val());
            }
        });
        if (0 == val.toString().length) {
            layer.msg("请至少选择一个培训班！");
        } else {
            var filterBox = $("#filterBox").html('');
            if ("getTrainNames" == appendFunction) {
                // filterBox.append('<h3>培训执行进度表</h3>');
                filterBox.append('<div id="TRAIN_RATE_BOX" style="width: 100%;height: 300px"></div>');
                train.getTrainRateStatistics(val.toString());
                val = [];
            } else if ("getTrainingNamesStatisticsByYear" == appendFunction) {
                // filterBox.append('<h3>实际培训统计图</h3>');
                filterBox.append('<div id="TRAINING_NUM_BY_YEAR_BOX" style="width: 100%;height: 300px"></div>');
                train.getTrainingNumStatisticsByYear(year, val.toString());
                val = [];
            } else if ("getCTENames" == appendFunction) {
                // filterBox.append('<h3>培训评价分析图</h3>');
                filterBox.append('<div id="TRAIN_EVALUATE_BOX" style="width: 100%;height: 300px"></div>');
                train.getTrainEvaluateStatistics("", val.toString());
                val = [];
            }
        }
    });

    function getTrainNames() {
        <%--var trainRateIds = ${strs};--%>
        // var contentCheckbox = $("#checkboxs").html('');
        system.post(get_root + "/ship/bi/getTrainNames.action", {}, function (data) {
            console.log(data);
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.NAME)) {
                    // console.log(domain.ID);
                    // console.log(domain.NAME);
                    // console.log("strs.indexOf(domain.ID)" + strs.indexOf(domain.ID));
                    if (strs.indexOf(domain.ID) > -1) {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.ID + '" checked="checked"/>' + domain.NAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    } else {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.ID + '"/>' + domain.NAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    }
                }
            }
        });
    }

    function getTrainingNamesStatisticsByYear() {
        <%--var trainingNumIds = ${strs};--%>
        var param = {};
        if (!system.isBlank(year)) {
            param['year'] = year;
        }
        // var contentCheckbox = $("#checkboxs").html('');
        system.post(get_root + "/ship/bi/getTrainingNamesStatisticsByYear.action", param, function (data) {
            console.log(data);
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.TRAINNAME)) {
                    // console.log(domain.TRAINID);
                    // console.log(domain.TRAINNAME);
                    // console.log("strs.indexOf(domain.TRAINID)" + strs.indexOf(domain.TRAINID));
                    if (strs.indexOf(domain.TRAINID) > -1) {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.TRAINID + '" checked="checked"/>' + domain.TRAINNAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    } else {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.TRAINID + '"/>' + domain.TRAINNAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    }
                }
            }
        })
    }

    function getCTENames() {
        <%--var trainEvaluateIds = ${strs};--%>
        // var contentCheckbox = $("#checkboxs").html('');
        system.post(get_root + "/ship/bi/getCTENames.action", {}, function (data) {
            console.log(data);
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.NAME)) {
                    // console.log(domain.NAME);
                    // console.log(domain.ID);
                    // console.log("strs.indexOf(domain.NAME)" + strs.indexOf(domain.NAME));
                    if (strs.indexOf(domain.ID) > -1) {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.ID + '" checked="checked"/>' + domain.NAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    } else {
                        contentCheckbox.append('<input type="checkbox" name="jobtype" value="' + domain.ID + '"/>' + domain.NAME + '&nbsp;&nbsp;&nbsp;&nbsp;');
                    }
                }
            }
        })
    }

    //增加多选框
    function checkboxsAppend() {
        // console.log(appendFunction);
        if ("getTrainNames" == appendFunction) {
            getTrainNames();
        } else if ("getTrainingNamesStatisticsByYear" == appendFunction) {
//            $("#filterYear").show();
//            $("#trainingNumYear").datetimepicker({
//                language: 'zh-CN',
//                format: 'yyyy',
//                weekStart: 1,
//                autoclose: 1,
//                todayHighlight: 1,
//                minView: 4,
//                startView: 4,
//                pickerPosition: "bottom-right"
//            }).on('changeDate', function (e) {
//                year = e.date.getFullYear();
//            });
            $("#trainingNumYear").val(year);
            getTrainingNamesStatisticsByYear();
        } else if ("getCTENames" == appendFunction) {
            getCTENames();
        }
    }
    checkboxsAppend();

    $('input[type=checkbox]').click(function () {
        $(this).siblings('input').prop('checked', false);
    });
</script>
</body>
</html>
