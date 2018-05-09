package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;

public class KeyValueMap extends AbstractModel implements Serializable {
    private String key;

    private String value;

    private String rc1;

    private Integer rc2;

    private static final long serialVersionUID = 1L;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1 == null ? null : rc1.trim();
    }

    public Integer getRc2() {
        return rc2;
    }

    public void setRc2(Integer rc2) {
        this.rc2 = rc2;
    }
}