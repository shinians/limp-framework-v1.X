package com.chinasofti.domain;

import java.io.Serializable;

public class ThemEntJbxx implements Serializable {
    private String year;

    private String prvcode;

    private String entid;

    private String entname;

    private String enttype;

    private String personnum;

    private String persontype;

    private String drawnum;

    private String drawrate;

    private String reparenum;

    private String rebunum;

    private String prvname;

    private static final long serialVersionUID = 1L;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getPrvcode() {
        return prvcode;
    }

    public void setPrvcode(String prvcode) {
        this.prvcode = prvcode == null ? null : prvcode.trim();
    }

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

    public String getEnttype() {
        return enttype;
    }

    public void setEnttype(String enttype) {
        this.enttype = enttype == null ? null : enttype.trim();
    }

    public String getPersonnum() {
        return personnum;
    }

    public void setPersonnum(String personnum) {
        this.personnum = personnum == null ? null : personnum.trim();
    }

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype == null ? null : persontype.trim();
    }

    public String getDrawnum() {
        return drawnum;
    }

    public void setDrawnum(String drawnum) {
        this.drawnum = drawnum == null ? null : drawnum.trim();
    }

    public String getDrawrate() {
        return drawrate;
    }

    public void setDrawrate(String drawrate) {
        this.drawrate = drawrate == null ? null : drawrate.trim();
    }

    public String getReparenum() {
        return reparenum;
    }

    public void setReparenum(String reparenum) {
        this.reparenum = reparenum == null ? null : reparenum.trim();
    }

    public String getRebunum() {
        return rebunum;
    }

    public void setRebunum(String rebunum) {
        this.rebunum = rebunum == null ? null : rebunum.trim();
    }

    public String getPrvname() {
        return prvname;
    }

    public void setPrvname(String prvname) {
        this.prvname = prvname == null ? null : prvname.trim();
    }
}