package com.chinasofti.domain;

import java.io.Serializable;

public class EntProHistory implements Serializable {
    private String id;

    private String uid;

    private String checkunit;

    private String orgname;

    private String orgid;

    private String entid;

    private String entname;

    private String checktype;

    private String checktimenext;

    private String checktime;

    private String certaddr;

    private String certtime;

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

    public String getCheckunit() {
        return checkunit;
    }

    public void setCheckunit(String checkunit) {
        this.checkunit = checkunit == null ? null : checkunit.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname == null ? null : entname.trim();
    }

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getChecktimenext() {
        return checktimenext;
    }

    public void setChecktimenext(String checktimenext) {
        this.checktimenext = checktimenext == null ? null : checktimenext.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getCertaddr() {
        return certaddr;
    }

    public void setCertaddr(String certaddr) {
        this.certaddr = certaddr == null ? null : certaddr.trim();
    }

    public String getCerttime() {
        return certtime;
    }

    public void setCerttime(String certtime) {
        this.certtime = certtime == null ? null : certtime.trim();
    }
}