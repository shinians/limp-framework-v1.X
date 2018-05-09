package com.limp.framework.boss.domain;

import java.io.Serializable;

public class UserPermissionMap implements Serializable {
    private String usrid;

    private String perid;

    private static final long serialVersionUID = 1L;

    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid == null ? null : usrid.trim();
    }

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid == null ? null : perid.trim();
    }
}