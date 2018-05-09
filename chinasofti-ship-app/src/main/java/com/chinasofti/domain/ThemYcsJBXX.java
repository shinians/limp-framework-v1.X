package com.chinasofti.domain;

import java.io.Serializable;

public class ThemYcsJBXX implements Serializable {
    private String typeStr;

    private String id;

    private String name;

    private String orgname;

    private String orgcode;

    private String provcode;

    private String lv;

    private String educertcode;

    private String position;

    private String certtime;

    private String majorcode;

    private String sex;

    private Long pxnum;

    private Long shipnum;

    private Long drawnum;

    private Long productnum;

    private String year;

    private String rangetype;

    private static final long serialVersionUID = 1L;

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

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

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode == null ? null : provcode.trim();
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv == null ? null : lv.trim();
    }

    public String getEducertcode() {
        return educertcode;
    }

    public void setEducertcode(String educertcode) {
        this.educertcode = educertcode == null ? null : educertcode.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getCerttime() {
        return certtime;
    }

    public void setCerttime(String certtime) {
        this.certtime = certtime == null ? null : certtime.trim();
    }

    public String getMajorcode() {
        return majorcode;
    }

    public void setMajorcode(String majorcode) {
        this.majorcode = majorcode == null ? null : majorcode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Long getPxnum() {
        return pxnum;
    }

    public void setPxnum(Long pxnum) {
        this.pxnum = pxnum;
    }

    public Long getShipnum() {
        return shipnum;
    }

    public void setShipnum(Long shipnum) {
        this.shipnum = shipnum;
    }

    public Long getDrawnum() {
        return drawnum;
    }

    public void setDrawnum(Long drawnum) {
        this.drawnum = drawnum;
    }

    public Long getProductnum() {
        return productnum;
    }

    public void setProductnum(Long productnum) {
        this.productnum = productnum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getRangetype() {
        return rangetype;
    }

    public void setRangetype(String rangetype) {
        this.rangetype = rangetype == null ? null : rangetype.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }
}