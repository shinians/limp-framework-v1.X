package com.chinasofti.domain;

import java.io.Serializable;

public class DrawRepair implements Serializable {
    private String id;

    private String uid;

    private String reptype;

    private String reptime;

    private String qusitem;

    private String checkitem;

    private String checkpersion;

    private String subpersion;

    private String drawno;

    private String download;

    private String approtime;

    private String appromsg;

    private String procuid;

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

    public String getReptype() {
        return reptype;
    }

    public void setReptype(String reptype) {
        this.reptype = reptype == null ? null : reptype.trim();
    }

    public String getReptime() {
        return reptime;
    }

    public void setReptime(String reptime) {
        this.reptime = reptime == null ? null : reptime.trim();
    }

    public String getQusitem() {
        return qusitem;
    }

    public void setQusitem(String qusitem) {
        this.qusitem = qusitem == null ? null : qusitem.trim();
    }

    public String getCheckitem() {
        return checkitem;
    }

    public void setCheckitem(String checkitem) {
        this.checkitem = checkitem == null ? null : checkitem.trim();
    }

    public String getCheckpersion() {
        return checkpersion;
    }

    public void setCheckpersion(String checkpersion) {
        this.checkpersion = checkpersion == null ? null : checkpersion.trim();
    }

    public String getSubpersion() {
        return subpersion;
    }

    public void setSubpersion(String subpersion) {
        this.subpersion = subpersion == null ? null : subpersion.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public String getApprotime() {
        return approtime;
    }

    public void setApprotime(String approtime) {
        this.approtime = approtime == null ? null : approtime.trim();
    }

    public String getAppromsg() {
        return appromsg;
    }

    public void setAppromsg(String appromsg) {
        this.appromsg = appromsg == null ? null : appromsg.trim();
    }

    public String getProcuid() {
        return procuid;
    }

    public void setProcuid(String procuid) {
        this.procuid = procuid == null ? null : procuid.trim();
    }
}