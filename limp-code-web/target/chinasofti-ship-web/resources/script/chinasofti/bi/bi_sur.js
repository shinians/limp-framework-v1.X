$(function(){
    //设置全局的option选项
    //var today = new Date();//获得当前日期
    var getYear = system.getCurYearBefore(0);//获得年份
    var optionArr=[{key:1,value:"持证"},{key:2,value:"一线"}];
    var arrStr=curr_orgcode.substring(0,3)
    //插件使用样例1
    $("#time-sur-1-1").initDateFilterLi(function(data){
        //console.log(data);
        sur.initSurNumBox("2017,2016，2015,2014,2013",data.value);
    },optionArr); //验船师匹配度
    $("#time-sur-1-2").initDateFilterLi(function(data){
        sur.initSurXLBox("2017,2016，2015,2014,2013",data.value);
    },optionArr);
    $("#time-sur-2-1").initDateFilterLi(function(data){
        // console.log(data)
        sur.initSurLVBox(getYear,data.value);
    },optionArr);
    $("#time-sur-2-2").initDateFilterLi(function(data){
        sur.initSUR22(getYear,data.value);
    },optionArr);
    $("#time-sur-2-3").initDateFilterLi(function(data){
        sur.initSUR23(getYear,data.value);
    },optionArr);
    $("#time-sur-2-4").initDateFilterLi(function(data){
        sur.initSUR24(getYear,data.value);
    },optionArr);
    $("#time-sur-3-1").initDateFilterLi(function(data){
        sur.initSUR31(arrStr+"%",system.getCurYearBefore(5),data.value);
    },optionArr);
    $("#time-sur-3-2").initDateFilterLi(function(data){
        sur.initSUR32(arrStr+"%",getYear,data.value);
    },optionArr);
    $("#time-sur-4-1").initDateFilter(function(data){
        sur.initYcsMate(arrStr+"%",data["startT"],data["endT"]);
    },optionArr) ; //验船师匹配度
    $("#time-sur-4-2").initDateFilterLi(function(data){
        //  console.log(data);
        sur.initYCSGap(arrStr+"%",data.value);
    },optionArr);  //验船师匹配度
    //验船师相关数量
    sur.initSurCurNum("");
  /*  system.post(get_root+"/ship/bi/getYcsInitData",{year:system.getCurYearBefore(0)},function (data) {
        var obj = data.result;
        // $("#SUR_POINT").countTo({to:obj.avgScore,speed:1000});//todo:暂无数据
        $("#SUR_POINT").countTo({to:88,speed:1000});
        $("#SUR_WORK_NUM").countTo({to:obj.shipNums,speed:1000});
        $("#SUR_WORK_NUM01").countTo({to:obj.drawNums,speed:1000});
        $("#SUR_WORK_NUM02").countTo({to:obj.proNums,speed:1000});
        $("#SUR_MATCH_NUM").countTo({to:obj.compatibility,speed:1000});
    });*/

    //持证总人数
    sur.initSurNumBox("2012,2013,2014,2015,2016,2017",1);
    sur.initSurXLBox("2017,2016，2015,2014,2013",1);
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度         
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            });
            sur.initSurNumBox(system.getCurYearBefore(5),"");
            sur.initSurXLBox(system.getCurYearBefore(5),"") ;
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
            if(index==2){
                //按照级别分类
                sur.initSurLVBox(getYear,"");
                //学历机构情况  2-2-1(第二屏-第二行-第一个)
                sur.initSUR22(getYear,"");
                sur.initSUR23(getYear,"");
                sur.initSUR24(getYear,"");
            }else if(index==3){
                sur.initSUR31(arrStr+"%",system.getCurYearBefore(5),1);
                sur.initSUR32(arrStr+"%",getYear,1);

            }else if(index==4){
                setTimeout(function(){
                    //todo 走势图 机构代码前2位
                    var tyear=parseInt(system.getCurYearBefore(0));
                    sur.initYcsMate(arrStr+"%",tyear-4,tyear);


                },300)
            }else if(index == 5){
                //验船师匹配度
                sur.initYCSGap(arrStr+"%",1);//验船师 缺口情况
            }
            scrollTo(0,0);

        }
    });
    //echart 验船师持证总人数
});
var sur={
    initSUR22:function(year,type){
        $("#SUR_2_2").showLoading();
        var param={method:'getYCSXLGroup',year:year};
        if(!system.isBlank(type)){
            param['type']=type;
        }
        system.post(get_root+"/ship/bi/listMap",param,function(data){
            var xData=[];
            var yData=[];
            for(var m in data.result){
                var domain =data.result[m];
                xData.push(domain.MAJNAME);
                yData.push({value:domain.NUM,name:domain.MAJNAME});
            }
            $("#SUR_2_2").initBIOption({
                legend: {data: xData},
                series: [{
                    data: yData,
                    itemStyle: {normal: {label: {formatter: ' {c}人\n({d}%) '}}}
                }]
            },30,"");
        });
    },
    initSUR23:function(year,type){
        $("#SUR_2_3").showLoading();
        var param={method:'getYCSMajGroup',year:year};
        if(!system.isBlank(type)){
            param['type']=type;
        }
        system.post(get_root+"/ship/bi/listMap",param,function(data){
            console.log("look me-->")
            console.log(param)
            console.log(data)
            var xData=[];
            var yData=[];
            var majMap={};
            for(var m in data.result){
                var domain =data.result[m];
                //验证名称是否为空
                if(!system.isBlank(domain)){
                    //主要思想：行业名称逗号分隔，全部放在map中，格式如下： {行业名称:数量}
                   var majArr=domain.MAJNAME.split(",");
                    for(var j in majArr){
                        //定义单个分类名称
                       var majName= majArr[j]
                        if(system.isBlank(majMap[majName])) {
                            //排除68开头
                            if(majName.indexOf("68")==-1){
                                //如果不存在 ，则添加到map中
                                majMap[majName]=domain.NUM;
                            }
                        }else{
                            //如果map已经存在该行业名称，则取出该行业数量 加上 domain.NUM
                            majMap[majName]=parseInt(majMap[majName])+parseInt(domain.NUM);
                        }
                    }

                }
            }

            //循环添加到map中
            for(var n in majMap){
                xData.push(n);
                yData.push(majMap[n]);
            }
            $("#SUR_2_3").initBIOption({series:[{data:yData}], xAxis:{data:xData,axisLabel:{interval: 0,
                        formatter:function(params)
                        {
                            var newParamsName = "";
                            var paramsNameNumber = params.length;
                            var provideNumber = 6;
                            var rowNumber = Math.ceil(paramsNameNumber / provideNumber);
                            if (paramsNameNumber > provideNumber){
                                for (var p = 0; p < rowNumber; p++){
                                    var tempStr = "";
                                    var start = p * provideNumber;
                                    var end = start + provideNumber;
                                    if (p == rowNumber - 1){
                                        tempStr = params.substring(start, paramsNameNumber);
                                    }else{
                                        tempStr = params.substring(start, end) + "\n";
                                    }
                                    newParamsName += tempStr;
                                }
                            }else{
                                newParamsName = params;
                            }

                            return newParamsName
                        }}}},10);
        })
    },
    initSUR24:function(year,type){
        $("#SUR_2_4").showLoading();
        var param={method:'getYCSPosGroup',year:year};
        if(!system.isBlank(type)){
            param['type']=type;
        }
        system.post(get_root+"/ship/bi/listMap",param,function(data){
            var xData=[];
            var yData=[];
            for(var m in data.result){
                var domain =data.result[m];
                xData.push(domain.MAJOR);
                yData.push(domain.NUM);

            }
            $("#SUR_2_4").initBIOption({series:[{data:yData}], xAxis:{data:xData,axisLabel:{
                        interval: 0,
                        formatter:function(params)
                        {
                            var newParamsName = "";
                            var paramsNameNumber = params.length;
                            var provideNumber = 6;
                            var rowNumber = Math.ceil(paramsNameNumber / provideNumber);
                            if (paramsNameNumber > provideNumber){
                                for (var p = 0; p < rowNumber; p++){
                                    var tempStr = "";
                                    var start = p * provideNumber;
                                    var end = start + provideNumber;
                                    if (p == rowNumber - 1){
                                        tempStr = params.substring(start, paramsNameNumber);
                                    }else{
                                        tempStr = params.substring(start, end) + "\n";
                                    }
                                    newParamsName += tempStr;
                                }
                            }else{
                                newParamsName = params;
                            }

                            return newParamsName
                        }
                    }}},10);
        })
    },
    initSUR31:function(orgCode,year,type){
        $("#sur_3_1").showLoading();
        var param={method:'getYCSPointByYear',year:year,type:type,orgCode:orgCode};
        if(!system.isBlank(type)){
            param['type']=type;
        }
        system.post(get_root+"/ship/bi/listMap",param,function(data){
            var  date=new Date();
            var curYear = date.getFullYear()-1;
            var curYear01 = date.getFullYear()-5;
            $('#overYear').html(curYear+")");
            $('#startYear').html("("+curYear01);
            var yData=[];//y轴数轴
            var dataMap={};
            for(var m in data.result){
                var domain =data.result[m];
                dataMap[domain.YEAR]=domain.POINT;
            }
            var years=year.split(",");
            for(var n in years){
                var val=system.isBlank(dataMap[years[n]])?"0":dataMap[years[n]];
                yData.push(val)
            }
            $("#sur_3_1").initBIOption({
                series:[{name:'平均分', data:yData}],xAxis:{data :years},yAxis: {name: "(分)"}},20,{});

        })
    },
    initSUR32:function(orgCode,year,type) {
        $("#sur_3_2").showLoading();
        var param={method: '', year: year, orgCode: orgCode};
        if(!system.isBlank(type)){
            param['type']=type;
        }
        system.post(get_root + "/ship/bi/getYcsScoreData", param,
            function (data) {
                var arr= data.result;
                var xData=[];
                var yData=[];
                if(type==1){
                    for(var m=0;m<arr.surCertList.length;m++){
                        var domain =arr.surCertList[m];
                        xData.push(domain.name);
                        yData.push({value:domain.value,name:domain.name});
                    }
                }else if(type==2){
                    for(var m in arr.surOnlineList){
                        var domain =arr.surOnlineList[m];
                        xData.push(domain.name);
                        yData.push({value:domain.value,name:domain.name});
                    }
                }
                $("#sur_3_2").initBIOption({
                    color:BO.pieBiOptionColor(xData.length),
                    legend:{data: xData},
                    series: [{
                        data:yData,
                        itemStyle: {normal: {label: {formatter: ' {c}人\n({d}%) '}}}
                    }]
                }, 30, {});

            });
    },
    /**
     * 验船师持证人数统计
     * @param orgCode 模糊查询 机构代码（如果是全国则传入空）
     * @param startY 选择的年份
     * @param onLine 是否是一线 1是一线  0是持证
     */
    initYCSGap:function(orgCode,onLine){
        //1缺口  2 之间 3 优秀（只有一个数组）
        var type = onLine;
        system.post(get_root+"/ship/bi/getYcsQkrsData",{method:'getYcsQkrsData',orgCode:orgCode},
            function(data){
                console.log(data);
                var dataMap={};
                var dataMapOl={};
                var ycsNum =[];
                var ycsNumOl =[];
                var dataArr=[];
                var maxgood=[];
                var maxgood01=[];
                //持证
                for(var m in data.result.surCertList){
                    var domain=data.result.surCertList[m];
                    dataMap[domain.educertcode]=domain;
                    //实际人数
                    ycsNum.push(dataMap[domain.educertcode]['ycsnum']);
                    dataArr.push(dataMap[domain.educertcode]['educertcode']);
                    maxgood.push(dataMap[domain.educertcode]['ycsgoodnum'])
                }
               // console.log(data);
                //一线
                for(var m in data.result.surOnlineList){
                    var domain=data.result.surOnlineList[m];
                    dataMapOl[domain.educertcode]=domain;
                    ycsNumOl.push(dataMapOl[domain.educertcode]['ycslinenum']);
                    maxgood01.push(dataMap[domain.educertcode]['ycsgoodnum'])
                }
                //优秀至最低人数=优秀-最低
                var GToMin=[];
                var GToMinOl=[];
                var minNum=[];
                var minNumOl=[];
                var arrBig=[];
                for(var nn in dataArr){
                    GToMin.push(dataMap[dataArr[nn]]['ycsgoodnum']-dataMap[dataArr[nn]]['ycsminnum']);
                    GToMinOl.push(dataMapOl[dataArr[nn]]['ycsgoodnum']-dataMapOl[dataArr[nn]]['ycsminnum']);
                    minNum.push(dataMap[dataArr[nn]]['ycsminnum']);
                    minNumOl.push(dataMapOl[dataArr[nn]]['ycsminnum']);
                }
                //实际人数
                var quekou =[];
                var expeop =[];
                var betwnpeopp =[];
                if(type =="1"){
                    for(var n in dataArr){
                        // 数据
                        if(ycsNum[n]<dataMap[dataArr[n]]['ycsminnum']){
                            // 缺口人数
                            quekou.push(minNum[n]-ycsNum[n]);
                            expeop.push(0);
                            betwnpeopp.push(0);
                        }else if(ycsNum[n]>dataMap[dataArr[n]]['ycsgoodnum']){  //超出人数
                            expeop.push(ycsNum[n]-dataMap[dataArr[n]]['ycsgoodnum']);
                            betwnpeopp.push(0);
                            quekou.push(0);
                          //  quekouu.push(0);
                          }else if((ycsNum[n]<=dataMap[dataArr[n]]['ycsgoodnum']) && (ycsNum[n]>=dataMap[dataArr[n]]['ycsminnum'])){
                            //之间
                            betwnpeopp.push(ycsNum[n]-dataMap[dataArr[n]]['ycsminnum']);
                            expeop.push(0);
                            quekou.push(0);
                          //quekouu.push(0);
                       }
                    }
                    var tex = {
                        backgroundColor:"#0F2353",
                        tooltip: {
                            trigger: 'item',//是否节点触发
                            padding: 5,

                        },
                        legend: {
                            data: [
                                {name:'缺口人数',textStyle:{
                                    fontSize:12,
                                    fontWeight:'bolder',
                                    color:'#cccccc'
                                }},
                                {name:'优秀至最低人数',icon:'image://'+get_root+'/resources/style/images/dashed.png' },
                                {name:'超出人数'},
                                {name:'介于最低和优秀之间' }
                            ],
                            textStyle:{
                                color: '#fff'
                            }
                        },
                        xAxis: [
                            {
                                type: 'category',
                                axisLine:{
                                    lineStyle:{
                                        color:'#fff'
                                    }
                                },
                                data:dataArr
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value',
                                name: '人数',
                                axisLabel: {
                                    formatter: '{value} '
                                } ,
                                axisLine:{
                                    lineStyle:{
                                        color:'#fff'
                                    }
                                }
                            }
                        ],
                        series: [
                            {
                                name:'实际人数',
                                type:'bar',
                                stack: '总量',
                                barWidth:'50px',
                                itemStyle:{
                                    normal:{
                                        barBorderColor:'rgba(19,240,221,1)',
                                        borderType:"dashed",
                                        color:'rgba(0,0,0,0)'
                                    }
                                },
                                data:minNum,
                                zlevel:0,

                            },
                            {
                                name: '缺口人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:quekou,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#f40102"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },
                            {
                                name: '超出人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:expeop,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#7afc35"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },

                            {
                                name: '优秀至最低人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:betwnpeopp,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#3267ff"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },
                            {
                                // 优秀至最低人数
                                name: '优秀人数',
                                type: 'bar',
                                stack: '总量',
                                barWidth:'50',
                                label: {
                                    normal: {
                                        show: false,
                                        position: 'insideRight'
                                    }
                                },
                                itemStyle:{
                                    color:'#334',
                                    normal:{
                                        color: 'transparent',
                                        barBorderColor: '#fff',
                                        // borderWidth:'20',
                                        barBorderWidth:3,
                                        barBorderRadius:0,
                                        borderType:"dashed"
                                    }
                                },
                                data:GToMin,
                                zlevel:10
                            }
                        ]
                    }

                    $("#4-2-1").initBIOption(tex,12,{})
                }else if(type =="2"){
                    for(var n in dataArr){
                        if(ycsNumOl[n]<dataMapOl[dataArr[n]]['ycsminnum']){
                            quekou.push(minNumOl[n]-ycsNumOl[n]);
                            expeop.push(0);
                            betwnpeopp.push(0);
                        }else if(ycsNumOl[n]>dataMapOl[dataArr[n]]['ycsgoodnum']){  //超出人数
                            expeop.push(ycsNumOl[n]-dataMapOl[dataArr[n]]['ycsgoodnum']);
                            betwnpeopp.push(0);
                            quekou.push(0);

                        }else{
                            //之间
                            betwnpeopp.push(ycsNumOl[n]-dataMapOl[dataArr[n]]['ycsminnum']);
                            expeop.push(0);
                            quekou.push(0);

                        }
                    }
                    var tex1 = {
                        backgroundColor:"#0F2353",
                        tooltip: {
                            trigger: 'item',//是否节点触发
                            padding: 5,

                        },
                        legend: {
                            data: [
                                {name:'缺口人数',textStyle:{
                                    fontSize:12,
                                    fontWeight:'bolder',
                                    color:'#cccccc'
                                }},
                                {name:'优秀至最低人数',icon:'image://'+get_root+'/resources/style/images/dashed.png' },
                                {name:'超出人数'},
                                {name:'介于最低和优秀之间' }
                            ],
                            textStyle:{
                                color: '#fff'
                            }
                        },
                        xAxis: [
                            {
                                type: 'category',
                                axisLine:{
                                    lineStyle:{
                                        color:'#fff'
                                    }
                                },
                                data:dataArr
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value',
                                name: '人数',
                                axisLabel: {
                                    formatter: '{value} '
                                } ,
                                axisLine:{
                                    lineStyle:{
                                        color:'#fff'
                                    }
                                }
                            }
                        ],
                        series: [
                            {
                                name:'实际人数',
                                type:'bar',
                                stack: '总量',
                                barWidth:'50px',
                                itemStyle:{
                                    normal:{
                                        barBorderColor:'rgba(19,240,221,1)',
                                        borderType:"dashed",
                                        color:'rgba(0,0,0,0)'
                                    }
                                },
                                data:minNumOl,
                                zlevel:0,

                            },
                            {
                                name: '缺口人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:quekou,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#f40102"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },
                            {
                                name: '超出人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:expeop,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#7afc35"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },
                            {
                                name: '优秀至最低人数',
                                type: 'bar',
                                stack: '缺口',
                                barWidth:'50px',
                                data:betwnpeopp,
                                itemStyle:{
                                    normal: {
                                        barBorderWidth:15,
                                        color: "#3267ff"
                                    }
                                },
                                barGap:'-100%',
                                zlevel:100,
                            },
                            {
                                // 优秀至最低人数
                                name: '优秀人数',
                                type: 'bar',
                                stack: '总量',
                                barWidth:'50',
                                label: {
                                    normal: {
                                        show: false,
                                        position: 'insideRight'
                                    }
                                },
                                itemStyle:{
                                    color:'#334',
                                    normal:{
                                        color: 'transparent',
                                        barBorderColor: '#fff',
                                        // borderWidth:'20',
                                        barBorderWidth:3,
                                        barBorderRadius:0,
                                        borderType:"dashed"
                                    }
                                },
                                data:GToMinOl,
                                zlevel:10
                            }
                        ]
                    }

                    $("#4-2-1").initBIOption(tex1,12,{})
                }

            })
    },
    initYcsMate:function(orgCode,startY,endY){
        $("#4-1-1").showLoading();
        system.post(get_root+"/ship/org/getSurMatchData",{orgCode:orgCode,startY:startY,endY:endY},function(data){
             console.log(data);
            var  date=new Date();
            var curYear = date.getFullYear();
            var curYear01 = date.getFullYear()-4;
            $('#start02').html(curYear+")");
            $('#start01').html("("+curYear01+" ");
            var mapData=[];
            for(var m in data.result){
                var domain=data.result[m];
                mapData[domain.YEAR]=parseInt(domain.RATE);
            }
            var xData=[];
            var yData=[];
            for(var i=startY;i<=endY;i++){
                xData.push(i) ;
                var y=system.isBlank(mapData[i])?"0":mapData[i];
                yData.push(y);
            }

            $("#4-1-1").initBIOption({tooltip:{
                formatter: function (a) {
                    var relVal = '';
                    for (var i in a) {if (i < 2) {var domain = a[i];relVal += domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value +'%</span><br/>';}}return relVal;}},
                xAxis:{data :xData},yAxis:{name:"(%)"},series:[{name:"匹配度",data:yData}]},20,{});

        });
    },
    /**
     * 根据检验机构获取验船师当前数量
     * @param orgname
     */
    initSurCurNum:function(orgname){
        // console.log("调试加载验船师数量")
        var  param={};
        param['year'] =system.getCurYearBefore(0);
        if (!system.isBlank(orgname)) {
            param['orgname']=orgname;
        }

        system.post(get_root+"/ship/bi/getYcsInitData",param,function(data){
            if("200"==data.code){
                var obj=data.result;
                $("#SUR_NUM").countTo({to:obj.SURNUM,speed:1000});
                $("#SUR_POINT").countTo({to:obj.avgScore,speed:1000});
                $("#SUR_WORK_NUM").countTo({to:obj.SHIPNUMS,speed:1000});
                $("#SUR_WORK_NUM01").countTo({to:obj.DRAWNUMS,speed:1000});
                $("#SUR_WORK_NUM02").countTo({to:obj.PRONUMS,speed:1000});
                $("#SUR_MATCH_NUM").countTo({to:obj.compatibility,speed:1000});


                var newObj  = {
                    SURNUM : system.toThousands(obj.SURNUM),
                    SHIPNUMS : system.toThousands(obj.SHIPNUMS),
                    DRAWNUMS : system.toThousands(obj.DRAWNUMS),
                    PRONUMS : system.toThousands(obj.PRONUMS),
                    compatibility : system.toThousands(obj.compatibility),
                    SUR_POINT : obj.avgScore
                }

                setTimeout(function(){
                    $("#SUR_NUM").html(newObj.SURNUM);
                    $("#SUR_POINT").html(newObj.SUR_POINT);
                    $("#SUR_WORK_NUM").html(newObj.SHIPNUMS);
                    $("#SUR_WORK_NUM01").html(newObj.DRAWNUMS);
                    $("#SUR_WORK_NUM02").html(newObj.PRONUMS);
                },"1000")
            }

        });




    },
    /**
     *
     * @param id 加载图Id
     * @param rangVal   类型
     * @param backgroundcolor 图形背景颜色
     */
    initSurNumBox:function(year,rangVal){
        var xarry=[];
        var yarry=[];
        var option = {
            tooltip : {
                trigger: 'axis',
            },
            grid: {
                top:"10%",
                left: '3%',
                right: '10%',
                bottom: '3%',
                containLabel: true
            },
            xAxis :
                {
                    data :xarry
                },
         
            series : [
                {
                    name:'验船师数量',
                    type:'line',
                    data:yarry
                }]


        };
        var param = {};
        param['year'] = system.getCurYearBefore(5);
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        system.post(get_root+"/ship/bi/getYcsNumGroupByYear",param,function(data){
            var  date=new Date();
            var curYear = date.getFullYear()+"";
            var month=parseInt(date.getMonth().toString())+1;

            for(var m in data.result){
                var domain=data.result[m];
                if(!system.isBlank(domain.YEAR)&&!system.isBlank(domain.NUM)){
                    if(curYear==domain.YEAR) {
                        var yearNow=month!="0"?domain.YEAR+"年"+month+"月": domain.YEAR;
                        xarry.push(yearNow)
                    }else{
                        xarry.push(domain.YEAR)
                    }
                    yarry.push(domain.NUM);
                }
            }
            $("#SUR_1_1").initBIOption(option,20,{});
        })
    },
    initSurXLBox:function(year,rangVal){
        var seriesData=[];
        var xdata=[]; // ['高级验船师','中级验船师','普通验船师'],
        var legendDdata=[];//['本科','专科','高中']=[];
        var param = {};
        param['year'] =  system.getCurYearBefore(5);
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        system.post(get_root+"/ship/bi/getYcsXLGroupIndex",param,function(data){
            //学历 ：  大学专科  大学本科   硕士及以上
            var dataXL={"中专及以下":{},"大学专科":{},"大学本科":{},"硕士及以上":{},"未填写":{}};
            var lvArr= xdata;
            /**
             *  传入学历计算 各等级数量
             * @param xlType
             * @returns {Array}
             */
            function getXLNum(xlType) {
                var arry = [];
                for (var lv in lvArr) {
                    var lvName = lvArr[lv];
                    var num = dataXL[xlType][lvName];
                    num = system.isBlank(num) ? 0 : num;
                    arry.push(num);
                }
                return arry;

            }
            for(var m in data.result){
                var domain=data.result[m];
                //x坐标轴
                if(xdata.indexOf(domain.LV)==-1) {
                    xdata.push(domain.LV) ;
                }
                //图例            todo
                var dname="无"==domain.EDUCERTCODE?"未填写":domain.EDUCERTCODE;
                if(legendDdata.indexOf(dname)==-1) {
                    legendDdata.push(dname) ;//x坐标轴
                }

                dataXL[dname][domain.LV]=domain.NUM;

            }
            //xdata=['高级验船师','中级验船师','助理验船师','验船员']; //todo 注释掉此段

            //组装ser
            for(var xl in dataXL){
                seriesData.push({ name: xl, type: 'bar', barWidth: 40, stack: '验船师学历',
                    data: getXLNum(xl)
                })
            }
            var  option = {
                color: ['#00AEFF','#00699A','#fed61c'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    },

                },

                legend: {
                    top:"2px",
                    left: 'right',
                    textStyle: {
                        color: '#00C6FF'          // 图例文字颜色
                    },
                    y: '30px',
                    data:legendDdata
                },
                grid: {
                    top:'10%',
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis : {
                    type : 'category',
                    boundaryGap : true,
                    data :xdata,

                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1,//这里是为了突出显示加上的

                        }
                    }
                },
                yAxis : {
                    name:'人',
                    type : 'value',
                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1,//这里是为了突出显示加上的
                        }
                    }
                },
                series : seriesData
            };
            //console.log(option)
            $("#SUR_1_2").initBIOption(option,11,{})
        })
    },

    initSurLVBox:function(year,rangVal){
        // var rangVal=1;//$("#rang-select option:selected").val();
        var typeStr=1;//$("#cate-select option:selected").val();
        var legendData=[];
        var seriesData=[];
        var option3={
            color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
            tooltip: {
                trigger: 'none',
                //  trigger: 'item',
                formatter: "{a} <br/>{b}: {c} ({d}%)"
            },

            legend: {
                orient: 'vertical',
                left: 'left',
                textStyle: {
                    color: '#00C6FF'          // 图例文字颜色
                },
                y: 'bottom',
                data:legendData// ['验船员','助理验船师','中级验船师','高级验船师']
            },

            grid: {
                top:'10%',
                left: '23%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            series: [
                {
                    name:'验船师数量',
                    type:'pie',
                    selectedMode: 'single',
                    radius: [0, '60%'],

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
                    data:seriesData,
                    itemStyle: {
                        normal: {
                            // color: '各异',
                            borderColor: '#405272',
                            borderWidth: 1,
                            label: {
                                show: true,
                                position: 'outer',
                                formatter: ' {c}人 \n({d}%) '
                                //{b} \n  ({d}%)
                                // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                                ,textStyle:{
                                    fontSize:16
                                }
                            },
                            labelLine: {
                                show: true,
                                length: 20,
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
                },
                //外侧圆圈设置
                {
                    name:'外侧圆圈设置',
                    type:'pie',
                    radius: ['69%', '78%'],
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
                            borderWidth: 7,
                            emphasis: {

                            }
                        }
                    }}
            ]
        }
        var param = {};
        param['year'] = year;
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        param['typeStr'] =typeStr;


        system.post(get_root+"/ship/bi/getYcsCateIndex",param,function(data){
            for(var m in data.result){
                var domain=data.result[m];
                if(m==0){
                    seriesData.push({value:domain.NUM, name:domain.TYPE});
                }else{
                    seriesData.push({value:domain.NUM, name:domain.TYPE});
                }
                legendData.push(domain.TYPE);
            }

            $("#SUR_2_1").initBIOption(option3,30,{})
        })
    },
    /**
     * 各级学历
     * @param id
     * @param rangVal
     * @param backgroundcolor
     */
    initSurXLCateBox:function(id,rangVal,backgroundcolor){
        var rangVal=1;//$("#rang-select option:selected").val();
        var typeStr=2;//$("#cate-select option:selected").val();
        var chartType=1;//$("#chart-select option:selected").val();
        var legendData=[];
        var seriesData=[];
        var option3 ="";

        if(chartType=="2"){
            option3 = {
                color: ['#00AEFF','#00699A','#fed61c'],
                backgroundColor:backgroundcolor,// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis : {
                    type : 'category',
                    boundaryGap : true,
                    data : legendData,

                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1,//这里是为了突出显示加上的

                        }
                    }
                },
                yAxis :
                    {
                        name:'人',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的
                            }
                        }
                    },
                series : [
                    {
                        type:'bar',
                        barWidth:40,
                        stack: '验船师学历',
                        data:seriesData
                    }
                ]
            };

        }
//            $("#sur-person-chart").html('');
        var myChart = echarts.init(document.getElementById(id));
        var param = {};
        param['year'] = '2017,2016，2015,2014,2013'
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        param['typeStr'] =typeStr;
        system.post(get_root+"/ship/bi/getYcsCateIndex",param,function(data){
            for(var m in data.result){
                var domain=data.result[m];
                if(m==0){
                    seriesData.push({value:domain.NUM, name:domain.TYPE,selected:true});
                }else{
                    seriesData.push({value:domain.NUM, name:domain.TYPE});
                }
                legendData.push(domain.TYPE);
            }
//            myChart.setOption(option3,true);
        });
    }

};