package com.chinasofti.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductCheck implements Serializable {
    private String id;

    private String uid;

    private String entid;

    private String surid;

    private String shipname;

    private String respperson;

    private String checktime;

    private String checktimenext;

    private String producttype;

    private String productnum;

    private String produtmodel;

    private String productcert;

    private Short checkpass;

    private String shipport;

    private String checktype;

    private String shipcode;

    private String rc1;

    private String rc2;

    private Long rc3;

    private Date rc4;

    private String reportNo;

    private String state;

    private String shipcheckType;

    private String checknumber;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getSurid() {
        return surid;
    }

    public void setSurid(String surid) {
        this.surid = surid == null ? null : surid.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getRespperson() {
        return respperson;
    }

    public void setRespperson(String respperson) {
        this.respperson = respperson == null ? null : respperson.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getChecktimenext() {
        return checktimenext;
    }

    public void setChecktimenext(String checktimenext) {
        this.checktimenext = checktimenext == null ? null : checktimenext.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum == null ? null : productnum.trim();
    }

    public String getProdutmodel() {
        return produtmodel;
    }

    public void setProdutmodel(String produtmodel) {
        this.produtmodel = produtmodel == null ? null : produtmodel.trim();
    }

    public String getProductcert() {
        return productcert;
    }

    public void setProductcert(String productcert) {
        this.productcert = productcert == null ? null : productcert.trim();
    }

    public Short getCheckpass() {
        return checkpass;
    }

    public void setCheckpass(Short checkpass) {
        this.checkpass = checkpass;
    }

    public String getShipport() {
        return shipport;
    }

    public void setShipport(String shipport) {
        this.shipport = shipport == null ? null : shipport.trim();
    }

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getShipcode() {
        return shipcode;
    }

    public void setShipcode(String shipcode) {
        this.shipcode = shipcode == null ? null : shipcode.trim();
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

    public Date getRc4() {
        return rc4;
    }

    public void setRc4(Date rc4) {
        this.rc4 = rc4;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getShipcheckType() {
        return shipcheckType;
    }

    public void setShipcheckType(String shipcheckType) {
        this.shipcheckType = shipcheckType == null ? null : shipcheckType.trim();
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber == null ? null : checknumber.trim();
    }
}