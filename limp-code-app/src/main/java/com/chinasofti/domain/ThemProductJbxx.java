package com.chinasofti.domain;

import java.io.Serializable;

public class ThemProductJbxx implements Serializable {
    private String id;

    private String name;

    private String producttype;

    private String entname;

    private String shipid;

    private String year;

    private String prvcode;

    private String checktype;

    private String orginname;

    private String orgcode;

    private String areacode;

    private String avgrate;

    private String shipchecktype;

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

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid == null ? null : shipid.trim();
    }

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

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getOrginname() {
        return orginname;
    }

    public void setOrginname(String orginname) {
        this.orginname = orginname == null ? null : orginname.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getAvgrate() {
        return avgrate;
    }

    public void setAvgrate(String avgrate) {
        this.avgrate = avgrate == null ? null : avgrate.trim();
    }

    public String getShipchecktype() {
        return shipchecktype;
    }

    public void setShipchecktype(String shipchecktype) {
        this.shipchecktype = shipchecktype == null ? null : shipchecktype.trim();
    }
}