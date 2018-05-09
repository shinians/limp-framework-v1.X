package com.limp.framework.boss.domain;

import java.io.Serializable;

public class UserRoleMap implements Serializable {
    private String urmUsrguid;

    private String urmUreguid;

    private static final long serialVersionUID = 1L;

    public String getUrmUsrguid() {
        return urmUsrguid;
    }

    public void setUrmUsrguid(String urmUsrguid) {
        this.urmUsrguid = urmUsrguid == null ? null : urmUsrguid.trim();
    }

    public String getUrmUreguid() {
        return urmUreguid;
    }

    public void setUrmUreguid(String urmUreguid) {
        this.urmUreguid = urmUreguid == null ? null : urmUreguid.trim();
    }
}