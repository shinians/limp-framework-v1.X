package com.chinasofti.domain;

import java.io.Serializable;

public class ThemProductYwhz implements Serializable {
    private String entid;

    private String entname;

    private String entcate;

    private String enttype;

    private String areacode;

    private String firstapptime;

    private String recapptime;

    private String nextapptime;

    private static final long serialVersionUID = 1L;

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getEntcate() {
        return entcate;
    }

    public void setEntcate(String entcate) {
        this.entcate = entcate == null ? null : entcate.trim();
    }

    public String getEnttype() {
        return enttype;
    }

    public void setEnttype(String enttype) {
        this.enttype = enttype == null ? null : enttype.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getFirstapptime() {
        return firstapptime;
    }

    public void setFirstapptime(String firstapptime) {
        this.firstapptime = firstapptime == null ? null : firstapptime.trim();
    }

    public String getRecapptime() {
        return recapptime;
    }

    public void setRecapptime(String recapptime) {
        this.recapptime = recapptime == null ? null : recapptime.trim();
    }

    public String getNextapptime() {
        return nextapptime;
    }

    public void setNextapptime(String nextapptime) {
        this.nextapptime = nextapptime == null ? null : nextapptime.trim();
    }
}