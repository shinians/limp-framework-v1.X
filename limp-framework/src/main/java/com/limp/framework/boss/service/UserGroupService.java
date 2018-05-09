package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.RoleGroupMap;
import com.limp.framework.boss.domain.UserGroup;
import com.limp.framework.boss.domain.UserGroupUserMap;
import com.limp.framework.core.abs.AbstractService;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-6-20
 * Time: 下午1:45
 * To change this template use File | Settings | File Templates.
 */
public interface UserGroupService extends AbstractService<UserGroup> {

    public List<UserGroup> getList(Serializable id);

    public List<UserGroupUserMap> getUserGroupUserMap(Serializable userId);

    int countByFatherId(Serializable fatherId);

    public boolean bindRole(RoleGroupMap entry);

    public List<RoleGroupMap> getRoleGroupMap(Serializable groupId);

    public boolean updateRole(RoleGroupMap entry);

    public boolean updateUserGroupUser(String[] userGroupIDs, String[] userIDs);
}
