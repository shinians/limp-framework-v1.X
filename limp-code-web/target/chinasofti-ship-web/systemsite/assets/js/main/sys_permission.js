$(function(){
    // 加载权限：需要延时加载菜单
   setTimeout(function(){
       SysPermission.initTree();
   },1000)

})

var SysPermission={

    /**
     * 加载权限管理 属性结构
     */
    initTree:function(){
        var nodes=new Array();
        system.post(get_root+system.action["getPermissionList"]["url"],{},function(data){
        console.debug("加载权限");
        console.info(data);
        for(var i in data.result){
            var domain=data.result[i];
            main.permissionData[domain.id+""]=domain;
            var node={};
            node["id"]=domain.id+"";
            node["pId"]=domain.fatherid+"";
            node["name"]=domain.name+"";
            node["t"]=domain.name+"";
            node["open"]=false;
//            node["icon"]=get_root+"/systemsite/ztree/css/zTreeStyle/img/diy/5.png";

            if("0"==domain.fatherid){
                node["open"]=true;
            }
            nodes.push(node);
        }
        $.fn.zTree.init($("#treeDemo"), settingPer, nodes);
            $("#perId").val("0");
        $("#load").hide();
    })
}  ,

    /**
     * 初始化菜单选项
     * @param permission
     */
    initPermission:function(permission){
        var fatherName="";    //父级菜单名称
        try{
            fatherName=main.permissionData[permission.fatherid].name;
        }catch (e){
            fatherName="一级目录";
        }
        console.log(permission);
        var  permissionDetail=$("#permissionDetail").html('');
        permissionDetail.append('<tr> <th>权限名称</th> <td><input type="text" id="pName"  name="name" value="'+permission.name+'"/></td></tr>');
        permissionDetail.append('<tr> <th>权限标识</th><td> <input type="text"  name="code" value="'+system.dealBlank(permission.code,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>访问类型</th><td> <input type="text" placeholder="1:可以访问,-1：限制访问"  name="mathtype" value="'+system.dealBlank(permission.mathtype,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>父类菜单</th><td> '+system.dealBlank(fatherName,"")+'</td></tr>');
        permissionDetail.append('<tr> <th>顺序</th><td> <input type="text" name="sort" value="'+system.dealBlank(permission.sort,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>Url地址</th><td> <input type="text"  name="url" value="'+system.dealBlank(permission.url,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>描述</th> <td> <input type="text"  name="intro" value="'+system.dealBlank(permission.intro,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>样式</th> <td> <input type="text"  placeholder="输入class样式.." name="className" value="'+system.dealBlank(permission.className,"")+'"/></td></tr>');
        permissionDetail.append('<tr> <th>类型</th> <td> <input type="text" title="" placeholder="" name="type" value="'+system.dealBlank(permission.type,"")+'"/></td></tr>');
        permissionDetail.append('<input type="hidden" id="perId" name="id" value="'+permission.id+'"/>');
        permissionDetail.append('<input type="hidden" id="fatherId" name="fatherid" value="'+permission.fatherid+'"/>');
    } ,
    /**
     * 保存menu
     */
    savePermission:function (){
        if (system.isBlank($("#pName").val())) {
            main.tip("请完善权限名称！",0);
            return;
        }
        system.post(get_root + "/system/permission/saveOrUpdate.action", $("#permissionForm").serialize(), function (data) {
            main.tip(data.msg,1);
            SysPermission.initTree();//更新
        },false)
    },
    /************************菜单管理*******begin***********************************/
    /**
     * 新增菜单
     */
    toSavePermission: function(){
        var perId=$("#perId").val(); //选中菜单的下一级别建立
        if(system.isBlank(perId)){
            perId="0";
          //  main.tip("请选择父级菜单",0);
           // return;
        }
        var permission={name:"",code:"",imgPath:"",idt:"",sort:"",url:"",intro:"",id:"",fatherid:perId,type:"",mathtype:""};
        SysPermission.initPermission(permission);
    },

    /**
     * 删除 menu
     * @param type 1为新增 其他为修改
     */
    delPermission:function(){
        var sid=$("#perId").val();
        if(system.isBlank(sid)){
            main.tip("请选择菜单",0);
            return;
        }
        system.post(get_root + "/system/permission/saveOrUpdate.action", {id:sid,state:"-1"}, function (data) {
            main.tip(data.msg,1);
            SysPermission.initTree();//更新
        })
    }
}
 //需要在加载的时候加载树形配置
var settingPer={
    data: {
        key: {
            title:"t"
        },
        simpleData: {
            enable: true
        }
    },
    callback: {
        beforeClick: beforeClickPer,
        onClick: onClickPer
    }
}

function beforeClickPer(treeId, treeNode, clickFlag) {
    log.info("[beforeClick ]" + treeNode.name );
    return (treeNode.click != false);
}
/**
 *clickFlag===1: 普通选中;clickFlag===0:取消选中 ;追加选中
 * @param event
 * @param treeId
 * @param treeNode
 * @param clickFlag
 */
function onClickPer(event, treeId, treeNode, clickFlag) {
    log.info( treeNode);
    if(1==clickFlag){
        SysPermission.initPermission(main.permissionData[treeNode.id]);
    }
}
