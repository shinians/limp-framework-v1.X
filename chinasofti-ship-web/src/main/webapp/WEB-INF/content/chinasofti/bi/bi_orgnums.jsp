<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html style = 'overflow: hidden'>
<head>
    <meta charset="UTF-8">
    <title>总数+业务复核+完成率</title>
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" >
    <%--<link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/mainPanel.css">--%>
    <style>
        /*机构表格 样式*/
        .orgBItable{
            width:100%;
        }
        .orgBItable td,.orgBItable th{
            border:1px solid #234876;
        }
        .orgBItable thead{
            font-size: 18px;
            color:#fff;

        }
        .orgBItable thead tr th,.orgBItable tbody tr td{
            text-align: center;
        }
        .orgBItable thead tr{
            line-height: 45px;
            border-bottom: 2px solid #234876;
            border-top: 2px solid #234876;
            text-align: center;
        }
        .orgBItable tbody tr{
            line-height: 45px;
            color:#fff;
        }
        html{
            overflow-y: scroll !important;
        }
    </style>
</head>
<body style="background-color:#18204B">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <table class="orgBItable">
                        <%--<thead>--%>
                            <%--<tr>--%>
                                <%--<th>省局</th>--%>
                                <%--<th>市处</th>--%>
                                <%--<th>县站</th>--%>
                                <%--<th>渔船拥有量</th>--%>
                                <%--<th>检验工作完成率</th>--%>
                                <%--<th>机构能力得分</th>--%>
                            <%--</tr>--%>
                        <%--</thead>--%>
                        <%--<tbody>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="57">浙江省渔业船舶检验局</td>--%>
                                <%--<td rowspan="8">杭州检验处</td>--%>
                                <%--<td>西湖检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>94</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>萧山检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>89</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>余杭检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>94</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>桐庐检验站</td>--%>
                                <%--<td>7</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>93</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>淳安检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>建德检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>富阳检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>97</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>临安检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>96</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="7">宁波检验局</td>--%>
                                <%--<td>北仑检验站</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>鄞州检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>象山检验站</td>--%>
                                <%--<td>7</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>94</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>宁海检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>余姚检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>慈溪检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>奉化检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>

                            <%--<tr>--%>
                                <%--<td rowspan="7">温州检验处</td>--%>
                                <%--<td>龙湾检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>洞头检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>94</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>永嘉检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>平阳检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>94</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>苍南检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>瑞安检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>乐清检验站</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="5">嘉兴检验处</td>--%>
                                <%--<td>嘉善检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>海盐检验站</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>96</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>海宁检验处</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>桐乡检验站</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>98</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>平湖检验处</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>82</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="5">湖州检验处</td>--%>
                                <%--<td>吴兴检验站</td>--%>
                                <%--<td>6</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>86</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>南浔检验处</td>--%>
                                <%--<td>7</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>85</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>德清检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>89</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>长兴检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>80</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>安吉检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>88</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="4">绍兴检验处</td>--%>
                                <%--<td>绍兴检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>267</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>新昌检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>278</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>诸暨检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>267</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>上虞检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>86</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="3">金华检验处</td>--%>
                                <%--<td>兰溪检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>87</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>义务检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>88</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>东阳检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>84</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="3">衢州检验处</td>--%>
                                <%--<td>柯城检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>267</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>开化检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>85</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>龙游检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>97</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="4">舟山检验处</td>--%>
                                <%--<td>定海检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>88</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>普陀检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>278</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>岱山检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>267</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>嵊泗检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>86</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="6">台州检验处</td>--%>
                                <%--<td>椒江检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>路桥检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>87</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>玉环检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>99</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>三门检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>89</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>温岭检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>91</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>临海检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>267</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td rowspan="5">丽水检验处</td>--%>
                                <%--<td>青田检验站</td>--%>
                                <%--<td>4</td>--%>
                                <%--<td>3</td>--%>
                                <%--<td>90</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>遂昌检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>92</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>云和检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>93</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>景宁检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>95</td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>龙泉检验站</td>--%>
                                <%--<td>5</td>--%>
                                <%--<td>2</td>--%>
                                <%--<td>278</td>--%>
                            <%--</tr>--%>
                        <%--</tbody>--%>
                    </table>

            </div>
        </div>
    </div>
    <script type="text/javascript" src="${ctx}/resources/script/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script type="text/javascript" src='${echarts}/echarts.min.js'></script>

<%--<script type="text/javascript" src='${ctx}/resources/script/chinasofti/ent/mainPanel.js'></script>--%>
    <script type="text/javascript">
        $(document).ready(function(){
            $.ajax({
                url:get_root+'/ship/bi/orgEchartsData10',
                type: 'post',
                dataType:'json',
                success:function(data){
                    var tableCon = data.result;
//                    console.log(tableCon);
                    if(curr_orgcode == "0000000"){
                        //国家级
                        creatmapBycity(tableCon);
                    }else{
                        creatmapBycity2(tableCon);
                    }

                }
            });
            function creatmapBycity(arrjson){
                var citymap={};
                var len = arrjson.length; //9
                for(var i=0;i<len;i++){
                    if(citymap[arrjson[i].cityname] == undefined){
                        var list = [];
                        list.push(arrjson[i]);
                        citymap[arrjson[i].cityname] = list;
                    }else{
                        citymap[arrjson[i].cityname].push(arrjson[i]);
                    }
                }
                var str="<thead><tr><td>省局</td><td>市处</td><td>县站</td><td>渔船拥有量</td><td>检验工作完成率</td><td>机构能力得分</td></tr></thead><tbody>";
                str +="<tr><td rowspan='"+arrjson.length+"'>"+arrjson[0].proname+"</td>"
                for(var cityname in citymap){
                    var stu = citymap[cityname]; //3
                    str+="<td rowspan='"+stu.length+"'>"+cityname+"</td>";
                    for(var i = 0;i < stu.length;i++){
                        if(i==0){
                            str+="<td>"+stu[i].orgname+"</td><td>"+stu[i].shipNums+"</td><td>"+stu[i].checkRate+"</td><td>"+stu[i].score+"</td></tr>";
                        }else{
                            str+="<tr><td>"+stu[i].orgname+"</td><td>"+stu[i].shipNums+"</td><td>"+stu[i].checkRate+"</td><td>"+stu[i].score+"</td></tr>";
                        }
                    }
                }
                str+="</tbody> ";
                $('table').append(str);
            }

            //少一列
            function creatmapBycity2(arrjson){
                var citymap={};
                var len = arrjson.length; //9
                for(var i=0;i<len;i++){
                    if(citymap[arrjson[i].cityname] == undefined){
                        var list = [];
                        list.push(arrjson[i]);
                        citymap[arrjson[i].cityname] = list;
                    }else{
                        citymap[arrjson[i].cityname].push(arrjson[i]);
                    }
                }
                var str="<table class='orgBItable'><thead><tr><td>市处</td><td>县站</td><td>渔船拥有量</td><td>检验工作完成率</td><td>机构能力得分</td></tr></thead><tbody>";
//            str +="<tr><td rowspan='"+arrjson.length+"'>"+arrjson[0].proname+"</td>"
                for(var cityname in citymap){
                    var stu = citymap[cityname]; //3
                    str+="<td rowspan='"+stu.length+"'>"+cityname+"</td>";
                    for(var i = 0;i < stu.length;i++){
                        if(i==0){
                            str+="<td>"+stu[i].orgname+"</td><td>"+stu[i].shipNums+"</td><td>"+stu[i].checkRate+"</td><td>"+stu[i].score+"</td></tr>";
                        }else{
                            str+="<tr><td>"+stu[i].orgname+"</td><td>"+stu[i].shipNums+"</td><td>"+stu[i].checkRate+"</td><td>"+stu[i].score+"</td></tr>";
                        }
                    }
                }
                str+="</table> ";
                $('table').html(str);
            }
        });

    </script>
</body>
</html>


