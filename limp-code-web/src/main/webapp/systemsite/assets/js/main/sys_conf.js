
/*
 * Copyright (c) 2018. 北京中软国际信息技术有限公司 .
 */
$(function(){
    SysConf.initConf();
    SysConf.initLister();
})

var SysConf={
    /**
     * 监听：事件类
     */
    initLister:function(){

        //绑定点击确认事件
        $(document).off("click",".lp-form-click").delegate(".lp-form-click","click",function() {
            var formId=$(this).attr("data-value");
           console.log($("#"+formId).serialize());

          system.post(get_root+"/system/conf/updateConfFields",$("#"+formId).serialize(),function(data){
              if("200"==data.code){
               alert("保存成功")
              }
            })
        })
        //绑定被点击事件
        $(document).off("click","#wizard-tab ul li").delegate("#wizard-tab ul li","click",function() {
           console.log($(this).find("a").attr("id"));
                var id=$(this).find("a").attr("id");
            if(!system.isBlank(id)&&!system.isBlank(SysConf.cachConf[id])){
                    SysConf.initConfFieldData(SysConf.cachConf[id].id);
            }
        })

    },
    /**
     * 初始化单条 策略
     * @param pid
     */
    initConfFieldData:function(pid){
        var option={
            pageFlay:false,
            async:false,
            table:{thStyle:"text-align:left;white-space: nowrap;cursor:pointer",tdStyle:"text-align:left;"},
            tfoot:'<tr> <td></td> <td> <button type="button"  class="btn btn-success btn-embossed lp-form-click" data-value="wizard-form-'+pid+'">确定</button> ' +
                 '<button type="reset" onclick=system.resetById("wizard-form-'+pid+'") class="btn btn-default btn-embossed">复原</button> </td> <td></td> </tr>',
            colModel : [
                {key :'title',name:"标题",width:"15%"},
                {key :'value',name :'变量值',formatters:function(domain){
                    /******radio:处理  1 是  0 否**************************************/
                    if("radio"==domain.type){
                        var html=$(domain.html);
                        var flay1="1"==domain.value?true:false;
                        var flay2="0"==domain.value?true:false;
                        setTimeout(function(){//演示加载初始化
                            $("input[name='"+domain.id+"']:eq(0)").prop("checked",flay1)
                            $("input[name='"+domain.id+"']:eq(1)").prop("checked",flay2)
                        },1000)
                        return domain.html;
                    }
                    var val=system.isBlank(domain.value)?"":domain.value;
                    var td='<div class="row"> <div class="col-sm-8 col-xs-12">' +
                        ' <input type="text" name="'+domain.id+'"  class="form-control" data-tip="'+domain.title+'" value="'+val+'"><span class="msg-box n-right" for="row[name]" style="display: none;"></span>' +
                        ' </div> <div class="col-sm-4"></div> </div>';
                    return td;
                }},
                {key :'key',name :'变量名',width:"15%"}
            ]};
        $("#wizard-table-"+pid).LPTable(get_root+"/system/conf/getConfFieldPageList.action",{pid:pid},option);
    },
    //缓存配置类数据{id:domain}
    cachConf:{},
    /**
     * 初始化 nav 菜单点击项
     */
    initConf:function(){
        $("#wizard-tab").html('');
        system.post(get_root+"/system/conf/getConfPageList.action",{},function(data){

          if("200"==data.code){
              for(var m in data.result.dataList){

                  var domain=data.result.dataList[m];
                  console.log(domain);

                  //备份缓存数据
                  SysConf.cachConf["wizard-tab-t-"+m]=domain;
                  console.log(domain);
                  $("#wizard-tab").append('<h2>'+domain.title+'</h2> <section>' +
                  '<p> <div class="table-responsive"><form id="wizard-form-'+domain.id+'"><table class="table  table-striped" id="wizard-table-'+domain.id+'"></table></form></div> </p> </section>');
                  //如果为 1；则
                  if(0==m){
                      SysConf.initConfFieldData(domain.id);
                  }
              }
              //加载点击nav事件
              $("#wizard-tab").steps({
                  headerTag: "h2",
                  bodyTag: "section",
                  //transitionEffect: "slide",
                  transitionEffect: "none",
                  enableFinishButton: false,
                  enablePagination: false,
                  enableAllSteps: true,
                  titleTemplate: "#title#",
                  cssClass: "tabcontrol"
              });

          }
      })

    }

}