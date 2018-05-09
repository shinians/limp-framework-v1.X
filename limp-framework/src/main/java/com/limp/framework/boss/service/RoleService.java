package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.Role;
import com.limp.framework.boss.domain.RoleExample;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService extends AbstractService<Role> {

    public  Role getRoleByID(String roleId);
    //List<Role> getRoleListByUsrId();
    /**
     * 获取角色ID列表
     *
     * @param userId 用户ID
     * @return 角色ID列表
     */
    List<String> getRoleByUser(String userId);

    /**
     * 删除多个
     *
     * @param ids ids
     * @return
     */
    boolean deletes(List<String> ids);

    /**
     * 根据角色模版查询角色列表
     *
     * @param roleExample
     * @return 角色列表
     */
    Pager<Role> getListExample(RoleExample roleExample);

    /**
     * 根据角色id获取角色对应的所有菜单id
     *
     * @param rid 角色id
     * @return
     */
    List<String> getMenus(String rid);

    /**
     * 根据id删除菜单权限
     *
     * @param rid 角色id
     * @param ids 菜单id
     * @return
     */
    boolean deleteMenuById(String rid, List<String> ids);

    /**
     * 根据id添加菜单权限
     *
     * @param rid 角色id
     * @param ids 菜单id
     * @return
     */
    boolean addMenuById(String rid, List<String> ids);


    /**
     * 根据id获取子系统的实现类名
     *
     * @param id 子系统id
     * @return
     */
    String getApi(String id);

    /**
     * 根据id删除数据权限
     *
     * @param id       角色id
     * @param sysId    分系统唯一标识
     * @param sysVdoId 分系统数据维度id
     * @return
     */
    boolean deleteDataById(String id, String sysId, String sysVdoId);

    /**
     * 根据id添加数据权限
     *
     * @param id       角色id
     * @param sysId    分系统唯一标识
     * @param sysVdoId 分系统数据维度id
     * @param ids      保存值
     * @return
     */
    boolean addDataById(String id, String sysId, String sysVdoId, List<String> ids);

    /**
     * @param roleId    角色id
     * @param sysId     分系统id
     * @param vdoTypeID 分系统维度类型id
     * @return
     */
    List<String> getDatasByVdoId(String roleId, String sysId, String vdoTypeID);

    /**
     * 注销多个
     *
     * @param ids ids
     * @return
     */
    boolean destroys(List<String> ids);
}
