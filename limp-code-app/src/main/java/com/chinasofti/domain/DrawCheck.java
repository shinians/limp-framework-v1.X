package com.chinasofti.domain;

import java.io.Serializable;

public class DrawCheck implements Serializable {
    private String id;

    private String drawno;

    private String ycsname;

    private String ycscertnum;

    private String checktype;

    private String checkpass;

    private String checktime;

    private String entid;

    private String idt;

    private String workarea;

    private String orgcode;

    private String ycsnameDq;

    private String ycscertnumDq;

    private String ycsnameLj;

    private String ycscertnumLj;

    private String ycsnameZl;

    private String ycscertnumZl;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
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

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getCheckpass() {
        return checkpass;
    }

    public void setCheckpass(String checkpass) {
        this.checkpass = checkpass == null ? null : checkpass.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt == null ? null : idt.trim();
    }

    public String getWorkarea() {
        return workarea;
    }

    public void setWorkarea(String workarea) {
        this.workarea = workarea == null ? null : workarea.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getYcsnameDq() {
        return ycsnameDq;
    }

    public void setYcsnameDq(String ycsnameDq) {
        this.ycsnameDq = ycsnameDq == null ? null : ycsnameDq.trim();
    }

    public String getYcscertnumDq() {
        return ycscertnumDq;
    }

    public void setYcscertnumDq(String ycscertnumDq) {
        this.ycscertnumDq = ycscertnumDq == null ? null : ycscertnumDq.trim();
    }

    public String getYcsnameLj() {
        return ycsnameLj;
    }

    public void setYcsnameLj(String ycsnameLj) {
        this.ycsnameLj = ycsnameLj == null ? null : ycsnameLj.trim();
    }

    public String getYcscertnumLj() {
        return ycscertnumLj;
    }

    public void setYcscertnumLj(String ycscertnumLj) {
        this.ycscertnumLj = ycscertnumLj == null ? null : ycscertnumLj.trim();
    }

    public String getYcsnameZl() {
        return ycsnameZl;
    }

    public void setYcsnameZl(String ycsnameZl) {
        this.ycsnameZl = ycsnameZl == null ? null : ycsnameZl.trim();
    }

    public String getYcscertnumZl() {
        return ycscertnumZl;
    }

    public void setYcscertnumZl(String ycscertnumZl) {
        this.ycscertnumZl = ycscertnumZl == null ? null : ycscertnumZl.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}