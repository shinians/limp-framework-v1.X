package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Role;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.MenuService;
import com.limp.framework.boss.service.RoleService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-2-28
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/role")
public class RoleAction extends AbstractAction {
    @Autowired
    private RoleService roleService;

    private static Logger log = Logger.getLogger(RoleAction.class.getName());
    /**
     *    一共多少行
     */
    private Integer rowCount;
    private static final Integer DEFAULT_ROW = 10;

    /**
     * 获取角色列表
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRoleList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRoleList() {
        List<Role> menuList=roleService.getList();
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,menuList,"").getJson();
    }
    /**
     * 根据角色ID获取角色详细信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRoleByID",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRoleByID(String roleId) {
        Role role=roleService.getRoleByID(roleId);
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,role,"").getJson();
    }
    /**
     * 删除角色
     * @param role
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "管理员删除角色")
    @RequestMapping(value ="delRole",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String delRole(Role role,HttpServletRequest request) {
        if(StrUtils.isBlank(role)&&StrUtils.isBlank(role.getId())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
        }
        User user= ApplicationContext.getLoginUser(request);
        Role roleDel=new Role();
        roleDel.setId(role.getId());
        roleDel.setUreRc1(user.getUsrAccount());
        roleDel.setUreState(StrUtils.isBlank(role.getUreState())? Constant.STATE_DELETE:role.getUreState());
        if(!roleService.save(roleDel)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
        };
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.DEL_SUCCESS,"","").getJson();
    }
    /**
     * 管理员更新角色
     * @param role
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "管理员更新角色")
    @RequestMapping(value ="updateRole",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String updateRole(Role role,HttpServletRequest request) {
        if(StrUtils.isBlank(role)&&StrUtils.isBlank(role.getId())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        }
        User user= ApplicationContext.getLoginUser(request);
        role.setUreRc1(user.getUsrAccount());
        if(!roleService.save(role)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        };
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }
    /**
     * 新增角色
     * @param role
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "管理员新增角色")
    @RequestMapping(value ="save",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRole(Role role,HttpServletRequest request) {
        if(StrUtils.isBlank(role)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.ADD_ERROR,"","").getJson();
        }
        User user= ApplicationContext.getLoginUser(request);
        role.setUreRc1(user.getUsrAccount());
        roleService.save(role);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.ADD_SUCCESS,"","").getJson();
    }

    /**
     * 根据用户id获得角色列表
     * @param uid 用户id
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRoleByUser",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRoleByUser(String uid) {
        if(!StrUtils.isBlank(uid)){
            return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,
                    roleService.getRoleByUser(uid),"").getJson();
        }
        return  new Result(ResultCode.ERROR.toString(), ResultMsg.ERROR,"","").getJson();
    }

    /**
     * 根据用户角色id获得menuids
     * @param rid
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getMenusByRoleId",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getMenusByRoleId(String rid) {
        return   Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,roleService.getMenus(rid),"").getJson();
    }

    /**
     * 保存角色的菜单权限
     * @param rid
     * @param menuIds1 之前菜单id
     * @param menuIds 修正后的菜单
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "设置角色菜单")
    @RequestMapping(value ="saveRoleMenus",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRoleMenus(String rid,String menuIds1,String menuIds) {
        //最终删除
        List oldPermsListTemp=StrUtils.compSourceListDiff(Arrays.asList(menuIds1.split(",")),
                Arrays.asList(menuIds.split(",")));
        //最终新增
        List permsListTemp=StrUtils.compSourceListDiff(Arrays.asList(menuIds.split(",")),
                Arrays.asList(menuIds1.split(",")));

        if(!StrUtils.isBlank(oldPermsListTemp)&&oldPermsListTemp.size()!=0){
            roleService.deleteMenuById(rid,oldPermsListTemp);
        }
        if(!StrUtils.isBlank(permsListTemp)&&permsListTemp.size()!=0){
            roleService.addMenuById(rid,permsListTemp);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }


}
