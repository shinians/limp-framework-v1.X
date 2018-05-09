package com.chinasofti.domain;

import java.io.Serializable;

public class EntInfoExtRepair implements Serializable {
    private String id;

    private String pid;

    private String createtime;

    private String entarea;

    private String registcapital;

    private String profworkersnum;

    private String fountdate;

    private String accepttime;

    private String approvaltime;

    private String entpostnum;

    private String entemail;

    private String entlevel;

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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getEntarea() {
        return entarea;
    }

    public void setEntarea(String entarea) {
        this.entarea = entarea == null ? null : entarea.trim();
    }

    public String getRegistcapital() {
        return registcapital;
    }

    public void setRegistcapital(String registcapital) {
        this.registcapital = registcapital == null ? null : registcapital.trim();
    }

    public String getProfworkersnum() {
        return profworkersnum;
    }

    public void setProfworkersnum(String profworkersnum) {
        this.profworkersnum = profworkersnum == null ? null : profworkersnum.trim();
    }

    public String getFountdate() {
        return fountdate;
    }

    public void setFountdate(String fountdate) {
        this.fountdate = fountdate == null ? null : fountdate.trim();
    }

    public String getAccepttime() {
        return accepttime;
    }

    public void setAccepttime(String accepttime) {
        this.accepttime = accepttime == null ? null : accepttime.trim();
    }

    public String getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(String approvaltime) {
        this.approvaltime = approvaltime == null ? null : approvaltime.trim();
    }

    public String getEntpostnum() {
        return entpostnum;
    }

    public void setEntpostnum(String entpostnum) {
        this.entpostnum = entpostnum == null ? null : entpostnum.trim();
    }

    public String getEntemail() {
        return entemail;
    }

    public void setEntemail(String entemail) {
        this.entemail = entemail == null ? null : entemail.trim();
    }

    public String getEntlevel() {
        return entlevel;
    }

    public void setEntlevel(String entlevel) {
        this.entlevel = entlevel == null ? null : entlevel.trim();
    }
}