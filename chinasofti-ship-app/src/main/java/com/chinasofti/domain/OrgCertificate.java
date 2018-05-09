package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;
import java.util.Date;

public class OrgCertificate implements Serializable {
    private String id;

    private String uid;

    private String cerno;

    private String acceptstatus;

    private String endtime;

    private String firsttime;

    private String checktime;

    private String orgcode;

    private String orgareaname;

    private String rc1;

    private String rc2;

    private String rc3;

    private Date rc4;

    private Short rc5;

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

    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno == null ? null : cerno.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"acceptstatus")
    public String getAcceptstatus() {
        return acceptstatus;
    }

    public void setAcceptstatus(String acceptstatus) {
        this.acceptstatus = acceptstatus == null ? null : acceptstatus.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(String firsttime) {
        this.firsttime = firsttime == null ? null : firsttime.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getOrgareaname() {
        return orgareaname;
    }

    public void setOrgareaname(String orgareaname) {
        this.orgareaname = orgareaname == null ? null : orgareaname.trim();
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

    public String getRc3() {
        return rc3;
    }

    public void setRc3(String rc3) {
        this.rc3 = rc3 == null ? null : rc3.trim();
    }

    public Date getRc4() {
        return rc4;
    }

    public void setRc4(Date rc4) {
        this.rc4 = rc4;
    }

    public Short getRc5() {
        return rc5;
    }

    public void setRc5(Short rc5) {
        this.rc5 = rc5;
    }
}