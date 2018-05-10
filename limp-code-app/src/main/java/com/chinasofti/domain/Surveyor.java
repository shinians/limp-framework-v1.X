package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Surveyor  extends AbstractModel implements Serializable  {
    private String id;

    private String uid;

    private String organid;

    private String certid;

    private String organname;

    private String ycsname;

    private String ycscertnum;

    private String shipchecktime;

    private String sex;

    private String birthdate;

    private String provcode;

    private String educertcode;

    private String majorname;

    private String educertcode1;

    private String majorname1;

    private String positionname;

    private String leaderstatus;

    private String oceanyear;

    private Date idt;

    private Date udt;

    private String state;

    private String provname;

    private String telphone;

    private String email;

    //证书Map
    private Map certMap;
    //机构地址
    private String orgaddr;
    //序号
    private String rownum;

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

    public String getOrganid() {
        return organid;
    }

    public void setOrganid(String organid) {
        this.organid = organid == null ? null : organid.trim();
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid == null ? null : certid.trim();
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname == null ? null : organname.trim();
    }

    public String getYcsname() {
        return ycsname;
    }

    public void setYcsname(String ycsname) {
        this.ycsname = ycsname == null ? null : ycsname.trim();
    }

    public String getYcscertnum() {
        return ycscertnum;
    }

    public void setYcscertnum(String ycscertnum) {
        this.ycscertnum = ycscertnum == null ? null : ycscertnum.trim();
    }

    public String getShipchecktime() {
        return shipchecktime;
    }

    public void setShipchecktime(String shipchecktime) {
        this.shipchecktime = shipchecktime == null ? null : shipchecktime.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "provcode")
    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode == null ? null : provcode.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "educertcode")
    public String getEducertcode() {
        return educertcode;
    }

    public void setEducertcode(String educertcode) {
        this.educertcode = educertcode == null ? null : educertcode.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "majorname")
    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "educertcode1")
    public String getEducertcode1() {
        return educertcode1;
    }

    public void setEducertcode1(String educertcode1) {
        this.educertcode1 = educertcode1 == null ? null : educertcode1.trim();
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "majorname1")
    public String getMajorname1() {
        return majorname1;
    }

    public void setMajorname1(String majorname1) {
        this.majorname1 = majorname1 == null ? null : majorname1.trim();
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public String getLeaderstatus() {
        return leaderstatus;
    }

    public void setLeaderstatus(String leaderstatus) {
        this.leaderstatus = leaderstatus == null ? null : leaderstatus.trim();
    }

    public String getOceanyear() {
        return oceanyear;
    }

    public void setOceanyear(String oceanyear) {
        this.oceanyear = oceanyear == null ? null : oceanyear.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getIdt() {
        return idt;
    }

    public void setIdt(Date idt) {
        this.idt = idt;
    }

    public Date getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }

    public String getOrgaddr() {
        return orgaddr;
    }

    public void setOrgaddr(String orgaddr) {
        this.orgaddr = orgaddr;
    }

    public String getRownum() {
        return rownum;
    }

    public void setRownum(String rownum) {
        this.rownum = rownum;
    }

    public Map getCertMap() {
        return certMap;
    }

    public void setCertMap(Map certMap) {
        this.certMap = certMap;
    }
}