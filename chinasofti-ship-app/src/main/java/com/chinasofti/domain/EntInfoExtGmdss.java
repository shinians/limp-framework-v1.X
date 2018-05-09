package com.chinasofti.domain;

import java.io.Serializable;

public class EntInfoExtGmdss implements Serializable {
    private String id;

    private String pid;

    private String certnum;

    private String certterm;

    private String entemail;

    private String setdate;

    private String crettime;

    private String postalcode;

    private String telphone;

    private String workesnum;

    private String certwokernum;

    private Object idt;

    private String repairtype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getCertnum() {
        return certnum;
    }

    public void setCertnum(String certnum) {
        this.certnum = certnum == null ? null : certnum.trim();
    }

    public String getCertterm() {
        return certterm;
    }

    public void setCertterm(String certterm) {
        this.certterm = certterm == null ? null : certterm.trim();
    }

    public String getEntemail() {
        return entemail;
    }

    public void setEntemail(String entemail) {
        this.entemail = entemail == null ? null : entemail.trim();
    }

    public String getSetdate() {
        return setdate;
    }

    public void setSetdate(String setdate) {
        this.setdate = setdate == null ? null : setdate.trim();
    }

    public String getCrettime() {
        return crettime;
    }

    public void setCrettime(String crettime) {
        this.crettime = crettime == null ? null : crettime.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getWorkesnum() {
        return workesnum;
    }

    public void setWorkesnum(String workesnum) {
        this.workesnum = workesnum == null ? null : workesnum.trim();
    }

    public String getCertwokernum() {
        return certwokernum;
    }

    public void setCertwokernum(String certwokernum) {
        this.certwokernum = certwokernum == null ? null : certwokernum.trim();
    }

    public Object getIdt() {
        return idt;
    }

    public void setIdt(Object idt) {
        this.idt = idt;
    }

    public String getRepairtype() {
        return repairtype;
    }

    public void setRepairtype(String repairtype) {
        this.repairtype = repairtype == null ? null : repairtype.trim();
    }
}