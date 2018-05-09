package com.limp.framework.boss.domain;

import java.io.Serializable;

public class RolePermissionMap implements Serializable {
    private String roleid;

    private String sprmPerid;

    private static final long serialVersionUID = 1L;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getSprmPerid() {
        return sprmPerid;
    }

    public void setSprmPerid(String sprmPerid) {
        this.sprmPerid = sprmPerid == null ? null : sprmPerid.trim();
    }
}