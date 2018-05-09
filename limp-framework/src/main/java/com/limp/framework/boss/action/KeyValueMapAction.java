package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.service.KeyValueMapService;
import com.limp.framework.boss.service.PermissionService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * kv控制
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 17-6-27
 * Time: 上午9:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/kv")
public class KeyValueMapAction extends AbstractAction {
    @Autowired
    private KeyValueMapService keyValueMapService;



    /**
     * 根据用户keyValueMap 获取集合
     * @param session  用户ID
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getRoleListByKid", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getRoleListByKid(HttpSession session) {
        //获取当前用户的 角色数据权限
        User user=ApplicationContext.getLoginUser(session);
        List<Role> roleList=ApplicationContext.getRoleList(session);
        List<String> roleIds=new ArrayList<String>();
        for(Role role:roleList){
            if(!StrUtils.isBlank(role.getId())){
                roleIds.add(role.getId());
            }
        }
        List<Role> list= keyValueMapService.getRoleListByKid(roleIds) ;
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
    /**
     * 根据用户keyValueMap 获取集合
     * @param keyValueMap  用户ID
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getKVList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getKVList(KeyValueMap keyValueMap) {
        List<KeyValueMap> list= keyValueMapService.getKVList(keyValueMap) ;
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 保存KV更新后的元素权限
     * @param kid
     * @param valueOld
     * @param value
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "更新数据权限")
    @RequestMapping(value ="updateKV",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveKV(String kid,String valueOld,String value) {
        //最终删除
        List oldListTemp=StrUtils.compSourceListDiff(Arrays.asList(valueOld.split(",")),
                Arrays.asList(value.split(",")));
        //最终新增
        List listTemp=StrUtils.compSourceListDiff(Arrays.asList(value.split(",")),
                Arrays.asList(valueOld.split(",")));

        if(!StrUtils.isBlank(oldListTemp)&&oldListTemp.size()!=0){
            keyValueMapService.delKVMapByK(kid, oldListTemp);
        }
        if(!StrUtils.isBlank(listTemp)&&listTemp.size()!=0){
            keyValueMapService.addValuesByKId(kid, listTemp);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }


}
