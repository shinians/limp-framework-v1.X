package com.chinasofti.domain;

import java.io.Serializable;

public class ThemJyjgJBXX implements Serializable {
    private String id;

    private String orgname;

    private String naturetype;

    private String parttype;

    private String funtype;

    private String finasource;

    private String provcode;

    private String regdate;

    private String year;

    private String personnum;

    private String majortype;

    private String provname;

    private String finishrateone;

    private Integer checkshipnum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getNaturetype() {
        return naturetype;
    }

    public void setNaturetype(String naturetype) {
        this.naturetype = naturetype == null ? null : naturetype.trim();
    }

    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype == null ? null : parttype.trim();
    }

    public String getFuntype() {
        return funtype;
    }

    public void setFuntype(String funtype) {
        this.funtype = funtype == null ? null : funtype.trim();
    }

    public String getFinasource() {
        return finasource;
    }

    public void setFinasource(String finasource) {
        this.finasource = finasource == null ? null : finasource.trim();
    }

    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode == null ? null : provcode.trim();
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate == null ? null : regdate.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getPersonnum() {
        return personnum;
    }

    public void setPersonnum(String personnum) {
        this.personnum = personnum == null ? null : personnum.trim();
    }

    public String getMajortype() {
        return majortype;
    }

    public void setMajortype(String majortype) {
        this.majortype = majortype == null ? null : majortype.trim();
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }

    public String getFinishrateone() {
        return finishrateone;
    }

    public void setFinishrateone(String finishrateone) {
        this.finishrateone = finishrateone == null ? null : finishrateone.trim();
    }

    public Integer getCheckshipnum() {
        return checkshipnum;
    }

    public void setCheckshipnum(Integer checkshipnum) {
        this.checkshipnum = checkshipnum;
    }
}