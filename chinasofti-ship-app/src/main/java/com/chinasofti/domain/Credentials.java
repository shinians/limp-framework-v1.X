package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class Credentials extends AbstractModel implements Serializable  {

    //主键
    private String cid;
    //验船师身份证
    private String cuid;
    //验船师姓名
    private String name;
    //工作单位
    private String org;
    //证件编号
    private String certno;
    //证件级别
    private String clevel;
    //证件专业
    private String major;
    //证件授予日期
    private String grantdate;
    //证件发证日期
    private String issuedate;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "funtype")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrantdate() {
        return grantdate;
    }

    public void setGrantdate(String grantdate) {
        this.grantdate = grantdate;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    @JSONField(name = Constant.CODE_TRANS_PRE + "clevel")
    public String getClevel() {
        return clevel;
    }

    public void setClevel(String clevel) {
        this.clevel = clevel;
    }
}