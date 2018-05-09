package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.Permission;
import com.limp.framework.boss.domain.Role;
import com.limp.framework.boss.domain.RolePermissionMap;
import com.limp.framework.boss.domain.UserPermissionMap;
import com.limp.framework.core.abs.AbstractService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-6-29
 * Time: 上午11:19
 * To change this template use File | Settings | File Templates.
 */
public interface PermissionService extends AbstractService<Permission> {
    /**
     * 获取 Permissions
     * @param rid 角色id
     * @return
     */
    public  List<RolePermissionMap> getPermByRoleId(String rid);

    /**
     * 根据用户ID获取元素权限
     * @param uid
     * @return
     */
    public  List<UserPermissionMap> getPermByUserId(String uid);

    /**
     * 根据角色ID和菜单ID删除元素权限
     * @param rid 角色ID   j
     * @param ids 所有的菜单IDS
     * @return
     */
    public boolean delPermsByRId(String rid, List<String> ids);

    /**
     * 增加【角色元素权限】记录
     * @param rid 角色ID
     * @param ids 元素权限IDs
     * @return
     */
    public boolean addPermsByRId(String rid, List<String> ids) ;

    /**
     * 根据用户ID和菜单ID删除元素权限
     * @param uid 用户ID   j
     * @param ids 所有的菜单IDS
     * @return
     */
    public boolean delPermsByUId(String uid, List<String> ids);

    /**
     * 增加【用户元素权限】记录
     * @param uid 用户ID
     * @param ids 元素权限IDs
     * @return
     */
    public boolean addPermsByUId(String uid, List<String> ids) ;

    /**
     * 初始化用户的权限信息
     * @param session
     * @return
     */
    public boolean initSessionAuth(HttpSession session) ;

    /**
     * 初始化系统配置属性
     * @param session
     * @return
     */
    public boolean initSessionConfig(HttpSession session) ;
}
