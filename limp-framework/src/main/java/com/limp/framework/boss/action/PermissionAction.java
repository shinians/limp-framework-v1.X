package com.limp.framework.boss.action;

import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.Permission;
import com.limp.framework.boss.domain.RolePermissionMap;
import com.limp.framework.boss.domain.UserPermissionMap;
import com.limp.framework.boss.service.PermissionService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
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

import static com.limp.framework.core.constant.Constant.*;

/**
 * 权限控制
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 17-6-27
 * Time: 上午9:14
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/system/permission")
public class PermissionAction  extends AbstractAction {
    @Autowired
    private PermissionService permissionService;


    @Access(login = true,privilege = false)
    @RequestMapping(value ="initSessionAuth",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String initSessionAuth(HttpSession session) {
        if (!permissionService.initSessionAuth(session)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        }
        try {
            //重新加载系统环境
            permissionService.initSessionConfig(session);
        } catch (Exception e) {

        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }
    /**
     *  获取所有权限
     * @param session
     * @param menu
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getPermissionList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPermissionList(HttpSession session,Menu menu) {
        List<Permission> permissionList = permissionService.getList();
        return Result.getInstance(ResultCode.SUCCESS.toString()
                , ResultMsg.SUCCESS, permissionList, "").getJson();
    }

    /**
     * 添加Or更新权限菜单
     * id为空则是添加菜权限
     * @param permission
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="saveOrUpdate", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String savePermission(Permission permission) {
        //id为空则是添加菜单
        if(StrUtils.isBlank(permission.getId())){
            if (permissionService.save(permission)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS, "","").getJson();
            }
        }else{
            if (permissionService.update(permission)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS, "","").getJson();
            }
        } ;
        return new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR, "","").getJson();
    }

    /**
     * 根据角色Id获取该角色有的元素权限
     * @param rid 角色ID
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getPermByRoleId", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPermByRoleId(String rid) {
        List<RolePermissionMap > list= permissionService.getPermByRoleId(rid) ;
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 根据用户Id获取该角色有的元素权限
     * @param uid 用户ID
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getPermByUserId", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPermByUserId(String uid) {
        List<UserPermissionMap> list= permissionService.getPermByUserId(uid) ;
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 保存角色更新后的元素权限
     * @param rid
     * @param permIdsOld
     * @param permIds
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="saveRolePerms",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRoleMenus(String rid,String permIdsOld,String permIds) {
        //最终删除
        List oldPermsListTemp=StrUtils.compSourceListDiff(Arrays.asList(permIdsOld.split(",")),
                Arrays.asList(permIds.split(",")));
        //最终新增
        List permsListTemp=StrUtils.compSourceListDiff(Arrays.asList(permIds.split(",")),
                Arrays.asList(permIdsOld.split(",")));

        if(!StrUtils.isBlank(oldPermsListTemp)&&oldPermsListTemp.size()!=0){
            permissionService.delPermsByRId(rid,oldPermsListTemp);
        }
        if(!StrUtils.isBlank(permsListTemp)&&permsListTemp.size()!=0){
            permissionService.addPermsByRId(rid,permsListTemp);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }

    /**
     * 保存用户更新后的元素权限
     * @param uid
     * @param permIdsOld
     * @param permIds
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value ="saveUserPerms",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveUserPerms(String uid,String permIdsOld,String permIds) {
        //最终删除
        List oldPermsListTemp=StrUtils.compSourceListDiff(Arrays.asList(permIdsOld.split(",")),
                Arrays.asList(permIds.split(",")));
        //最终新增
        List permsListTemp=StrUtils.compSourceListDiff(Arrays.asList(permIds.split(",")),
                Arrays.asList(permIdsOld.split(",")));

        if(!StrUtils.isBlank(oldPermsListTemp)&&oldPermsListTemp.size()!=0){
            permissionService.delPermsByUId(uid,oldPermsListTemp);
        }
        if(!StrUtils.isBlank(permsListTemp)&&permsListTemp.size()!=0){
            permissionService.addPermsByUId(uid,permsListTemp);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }


}
