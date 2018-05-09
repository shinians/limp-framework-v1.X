package com.chinasofti.domain;

import java.io.Serializable;
import java.util.Date;

public class EntInfo implements Serializable {
    private String uid;

    private String pid;

    private String entname;

    private String registnum;

    private String legal;

    private String regcapital;

    private String creditcode;

    private String businessterm;

    private String enttype;

    private String regoffice;

    private String address;

    private String tel;

    private String scope;

    private String entcate;

    private String rc1;

    private String rc2;

    private Object idt;

    private Object udt;

    private Short zt;

    private Date rc3;

    private Date rc4;

    private String orgcode;

    private String areacode;

    private Short entstate;

    private String areaname;

    private String orgname;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getRegistnum() {
        return registnum;
    }

    public void setRegistnum(String registnum) {
        this.registnum = registnum == null ? null : registnum.trim();
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal == null ? null : legal.trim();
    }

    public String getRegcapital() {
        return regcapital;
    }

    public void setRegcapital(String regcapital) {
        this.regcapital = regcapital == null ? null : regcapital.trim();
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode == null ? null : creditcode.trim();
    }

    public String getBusinessterm() {
        return businessterm;
    }

    public void setBusinessterm(String businessterm) {
        this.businessterm = businessterm == null ? null : businessterm.trim();
    }

    public String getEnttype() {
        return enttype;
    }

    public void setEnttype(String enttype) {
        this.enttype = enttype == null ? null : enttype.trim();
    }

    public String getRegoffice() {
        return regoffice;
    }

    public void setRegoffice(String regoffice) {
        this.regoffice = regoffice == null ? null : regoffice.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getEntcate() {
        return entcate;
    }

    public void setEntcate(String entcate) {
        this.entcate = entcate == null ? null : entcate.trim();
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

    public Object getIdt() {
        return idt;
    }

    public void setIdt(Object idt) {
        this.idt = idt;
    }

    public Object getUdt() {
        return udt;
    }

    public void setUdt(Object udt) {
        this.udt = udt;
    }

    public Short getZt() {
        return zt;
    }

    public void setZt(Short zt) {
        this.zt = zt;
    }

    public Date getRc3() {
        return rc3;
    }

    public void setRc3(Date rc3) {
        this.rc3 = rc3;
    }

    public Date getRc4() {
        return rc4;
    }

    public void setRc4(Date rc4) {
        this.rc4 = rc4;
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

    public Short getEntstate() {
        return entstate;
    }

    public void setEntstate(Short entstate) {
        this.entstate = entstate;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }
}