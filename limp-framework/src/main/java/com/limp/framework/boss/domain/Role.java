package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class Role extends AbstractModel implements Serializable {
    private String id;

    private String ureName;

    private String ureRemarks;

    private Integer ureState;

    private String ureRc0;

    private String ureRc1;

    private String ureRc2;

    private Long ureRc3;

    private Long ureRc4;

    private Date ureRc5;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUreName() {
        return ureName;
    }

    public void setUreName(String ureName) {
        this.ureName = ureName == null ? null : ureName.trim();
    }

    public String getUreRemarks() {
        return ureRemarks;
    }

    public void setUreRemarks(String ureRemarks) {
        this.ureRemarks = ureRemarks == null ? null : ureRemarks.trim();
    }

    public Integer getUreState() {
        return ureState;
    }

    public void setUreState(Integer ureState) {
        this.ureState = ureState;
    }

    public String getUreRc0() {
        return ureRc0;
    }

    public void setUreRc0(String ureRc0) {
        this.ureRc0 = ureRc0 == null ? null : ureRc0.trim();
    }

    public String getUreRc1() {
        return ureRc1;
    }

    public void setUreRc1(String ureRc1) {
        this.ureRc1 = ureRc1 == null ? null : ureRc1.trim();
    }

    public String getUreRc2() {
        return ureRc2;
    }

    public void setUreRc2(String ureRc2) {
        this.ureRc2 = ureRc2 == null ? null : ureRc2.trim();
    }

    public Long getUreRc3() {
        return ureRc3;
    }

    public void setUreRc3(Long ureRc3) {
        this.ureRc3 = ureRc3;
    }

    public Long getUreRc4() {
        return ureRc4;
    }

    public void setUreRc4(Long ureRc4) {
        this.ureRc4 = ureRc4;
    }

    public Date getUreRc5() {
        return ureRc5;
    }

    public void setUreRc5(Date ureRc5) {
        this.ureRc5 = ureRc5;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", ureName='" + ureName + '\'' +
                ", ureRemarks='" + ureRemarks + '\'' +
                ", ureState=" + ureState +
                ", ureRc0='" + ureRc0 + '\'' +
                ", ureRc1='" + ureRc1 + '\'' +
                ", ureRc2='" + ureRc2 + '\'' +
                ", ureRc3=" + ureRc3 +
                ", ureRc4=" + ureRc4 +
                ", ureRc5=" + ureRc5 +
                '}';
    }
}