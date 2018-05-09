package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class AreaCode extends AbstractModel implements Serializable {
    private String code;

    private String name;

    private String pcode;

    private Short lv;

    private Short state;

    private Short type;

    private String rc1;

    private Date rc2;

    private Short rc3;

    private String rc4;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public Short getLv() {
        return lv;
    }

    public void setLv(Short lv) {
        this.lv = lv;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1 == null ? null : rc1.trim();
    }

    public Date getRc2() {
        return rc2;
    }

    public void setRc2(Date rc2) {
        this.rc2 = rc2;
    }

    public Short getRc3() {
        return rc3;
    }

    public void setRc3(Short rc3) {
        this.rc3 = rc3;
    }

    public String getRc4() {
        return rc4;
    }

    public void setRc4(String rc4) {
        this.rc4 = rc4 == null ? null : rc4.trim();
    }
}