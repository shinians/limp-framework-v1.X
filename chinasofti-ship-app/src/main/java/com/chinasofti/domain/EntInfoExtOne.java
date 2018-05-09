package com.chinasofti.domain;

import java.io.Serializable;

public class EntInfoExtOne implements Serializable {
    private String id;

    private String pid;

    private String certnum;

    private String certterm;

    private String entemail;

    private String setdate;

    private String contact;

    private String postalcode;

    private String telphone;

    private String workesnum;

    private String profworkersnum;

    private String checkworkersnum;

    private Object idt;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
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

    public String getProfworkersnum() {
        return profworkersnum;
    }

    public void setProfworkersnum(String profworkersnum) {
        this.profworkersnum = profworkersnum == null ? null : profworkersnum.trim();
    }

    public String getCheckworkersnum() {
        return checkworkersnum;
    }

    public void setCheckworkersnum(String checkworkersnum) {
        this.checkworkersnum = checkworkersnum == null ? null : checkworkersnum.trim();
    }

    public Object getIdt() {
        return idt;
    }

    public void setIdt(Object idt) {
        this.idt = idt;
    }
}