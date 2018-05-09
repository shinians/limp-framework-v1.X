package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;

public class UserUnit extends AbstractModel implements Serializable {
    private String id;

    private String name;

    private String keycode;

    private String areacode;

    private String fatherid;

    private String fatherarea;

    private Short state;

    private String rc1;

    private String rc2;

    private Long rc3;

    private Long rc4;

    private Long rc5;

    private String rc6;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode == null ? null : keycode.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid == null ? null : fatherid.trim();
    }

    public String getFatherarea() {
        return fatherarea;
    }

    public void setFatherarea(String fatherarea) {
        this.fatherarea = fatherarea == null ? null : fatherarea.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1 == null ? null : rc1.trim();
    }

    public String getRc2() {
        return rc2;
    }

    public void setRc2(String rc2) {
        this.rc2 = rc2 == null ? null : rc2.trim();
    }

    public Long getRc3() {
        return rc3;
    }

    public void setRc3(Long rc3) {
        this.rc3 = rc3;
    }

    public Long getRc4() {
        return rc4;
    }

    public void setRc4(Long rc4) {
        this.rc4 = rc4;
    }

    public Long getRc5() {
        return rc5;
    }

    public void setRc5(Long rc5) {
        this.rc5 = rc5;
    }

    public String getRc6() {
        return rc6;
    }

    public void setRc6(String rc6) {
        this.rc6 = rc6 == null ? null : rc6.trim();
    }
}