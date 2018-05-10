package com.chinasofti.domain;

import java.io.Serializable;

public class DrawProc implements Serializable {
    private String id;

    private String uid;

    private String apprtime;

    private String checkpersion;

    private String checksuggest;

    private String sender;

    private String receiver;

    private String checktype;

    private String lssuetime;

    private String drawno;

    private String orgid;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

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

    public String getApprtime() {
        return apprtime;
    }

    public void setApprtime(String apprtime) {
        this.apprtime = apprtime == null ? null : apprtime.trim();
    }

    public String getCheckpersion() {
        return checkpersion;
    }

    public void setCheckpersion(String checkpersion) {
        this.checkpersion = checkpersion == null ? null : checkpersion.trim();
    }

    public String getChecksuggest() {
        return checksuggest;
    }

    public void setChecksuggest(String checksuggest) {
        this.checksuggest = checksuggest == null ? null : checksuggest.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getLssuetime() {
        return lssuetime;
    }

    public void setLssuetime(String lssuetime) {
        this.lssuetime = lssuetime == null ? null : lssuetime.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
    }
}