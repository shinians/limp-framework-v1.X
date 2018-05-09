package com.limp.framework.boss.domain;

import java.io.Serializable;

public class RoleGroupMap implements Serializable {
    private String groupId;

    private String roleId;

    private static final long serialVersionUID = 1L;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "RoleGroupMap{" +
                "groupId='" + groupId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}