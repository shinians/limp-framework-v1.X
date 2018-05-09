package com.chinasofti.domain;

import java.io.Serializable;

public class Comment implements Serializable {
    private String id;

    private String content;

    private String targetname;

    private String targetid;

    private String entid;

    private String entname;

    private Short commcate;

    private String type;

    private String commtime;

    private String criticname;

    private Short critictype;

    private String criticid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname == null ? null : targetname.trim();
    }

    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid == null ? null : targetid.trim();
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

    public Short getCommcate() {
        return commcate;
    }

    public void setCommcate(Short commcate) {
        this.commcate = commcate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCommtime() {
        return commtime;
    }

    public void setCommtime(String commtime) {
        this.commtime = commtime == null ? null : commtime.trim();
    }

    public String getCriticname() {
        return criticname;
    }

    public void setCriticname(String criticname) {
        this.criticname = criticname == null ? null : criticname.trim();
    }

    public Short getCritictype() {
        return critictype;
    }

    public void setCritictype(Short critictype) {
        this.critictype = critictype;
    }

    public String getCriticid() {
        return criticid;
    }

    public void setCriticid(String criticid) {
        this.criticid = criticid == null ? null : criticid.trim();
    }
}