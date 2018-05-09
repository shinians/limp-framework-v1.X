package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class OrgPosition implements Serializable {
    private String orgCode;

    private String posy;

    private String posx;

    private String orgname;

    private String orgFax;

    private String orgAdress;

    private String orgRespperson;//机构负责人

    private String orgPhone;

    private String orgScore;//机构能力评分

    private String typeLv;

    private static final long serialVersionUID = 1L;
    @JSONField(name= Constant.CODE_TRANS_PRE+"typeLv")
    public String getTypeLv() {
        return typeLv;
    }

    public void setTypeLv(String typeLv) {
        this.typeLv = typeLv;
    }

    public String getOrgScore() {
        return orgScore;
    }

    public void setOrgScore(String orgScore) {
        this.orgScore = orgScore;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPosy() {
        return posy;
    }

    public void setPosy(String posy) {
        this.posy = posy;
    }

    public String getPosx() {
        return posx;
    }

    public void setPosx(String posx) {
        this.posx = posx;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgFax() {
        return orgFax;
    }

    public void setOrgFax(String orgFax) {
        this.orgFax = orgFax;
    }

    public String getOrgAdress() {
        return orgAdress;
    }

    public void setOrgAdress(String orgAdress) {
        this.orgAdress = orgAdress;
    }

    public String getOrgRespperson() {
        return orgRespperson;
    }

    public void setOrgRespperson(String orgRespperson) {
        this.orgRespperson = orgRespperson;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }
}