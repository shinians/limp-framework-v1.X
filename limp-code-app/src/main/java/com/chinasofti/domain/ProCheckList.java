package com.chinasofti.domain;

import java.io.Serializable;

public class ProCheckList implements Serializable {
    private String id;

    private String entname;

    private String entid;

    private String uid;

    private String protype;

    private String cerno;

    private String promodel;

    private String proname;

    private String checkunit;

    private String checkpersion;

    private String endtime;

    private String checktime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype == null ? null : protype.trim();
    }

    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno == null ? null : cerno.trim();
    }

    public String getPromodel() {
        return promodel;
    }

    public void setPromodel(String promodel) {
        this.promodel = promodel == null ? null : promodel.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getCheckunit() {
        return checkunit;
    }

    public void setCheckunit(String checkunit) {
        this.checkunit = checkunit == null ? null : checkunit.trim();
    }

    public String getCheckpersion() {
        return checkpersion;
    }

    public void setCheckpersion(String checkpersion) {
        this.checkpersion = checkpersion == null ? null : checkpersion.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }
}