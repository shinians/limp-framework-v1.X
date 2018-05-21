$(function(){
    // 加载菜单
   setTimeout(function(){
       SysOrder.getOrderList(1,2,1,1);
   },1000)
})

var SysOrder={
    /************************订单列表****************begin**************************/
    /**
     * 订单list
     * @param page    页码
     * @param ordertype 订单类型 1，链接订单     2积分
     * @param orderName  排序名称  p
     * @param orderType 升 2 降 1
     */
    getOrderList:function(page,ordertype,orderName,orderType){
        var params={};
        if(!system.isBlank(page)) {
            params["page"]=page;
        }else{
            params["page"]=1;
        }
        if(!system.isBlank(ordertype)){
            params["ordertype"]=ordertype;
        }
        if(!system.isBlank(orderName)){
            params["orderName"]=orderName;
        }if(!system.isBlank(orderType)){
            params["orderType"]=orderType;
        }
        log.info("params")
        log.info(params) ;
        system.post(get_root+"/order/getOrderList.action",params,function(data){
            var trs="";
            log.info(data);
            for(var i in data.result.dataList){
                var domain=data.result.dataList[i];
                main.orderMap[domain.id]=domain;
                var detail="";
                var opt="";
                var point=system.isBlank(domain.xcode)?"--":domain.xcode;
                if(domain.ordertype=="1"){
                    detail="消耗"+point+"积分";
                    opt='查看';
                }else if("2"==domain.ordertype){
                    detail="增加"+point+"积分";
                    opt='无';
                }


                trs+='<tr class="odd gradeX"> ' +
                    '<td><input type="checkbox" name="orderCK" value="'+domain.id+'"></td>' +
                    '<td>' + domain.ordername + ' </td>' +
                    '<td>'+detail+ '</td> ' +
                    '<td>'+domain.createdateshow+ '</td>' +
                    ' <td class="go" style="cursor: pointer;color: #0000ff" data-value="'+domain.id+'" >'+opt+'</td>' +
                    ' <td>'+domain.userid+'</td> ' +
                    '</tr>';
            }
            $("#orderTable").html(trs);
            $(".go").click(function () {
                var url = main.orderMap[$(this).attr("data-value")]["xxcode"];
                if (url.indexOf("http") > -1) {
                    window.open(url);
                } else {
                    log.info(url);
                }
            })
            system.PagesLen = parseInt(data.result.pageCount);
            var pageArr = system.getPagestartEnd(parseInt(page)).split(",");
            var lis = '<li><a href="javascript:void(0)" data-value="1">&laquo;</a></li>';
            for (var i = parseInt(pageArr[0]); i <= pageArr[1]; i++) {
                var curr = i;
                if (page == i) {
                    lis += '<li class="active"> <a href="javascript:void(0)"  data-value="' + curr + '">' + i + '</a></li>';
                } else {
                    lis += '<li> <a href="javascript:void(0)" data-value="' + curr + '">' + i + '</a></li>';
                }
            }
            lis += '<li><a href="javascript:void(0)" data-value="' + system.PagesLen + '">&raquo;</a></li>';
            $("#order_page").html(lis);
            $("#order_page li").click(function () {
                SysOrder.getOrderList($(this).find("a").attr("data-value"),$("#OrderStatus").val(),1,1);
            })
        })
    }

}