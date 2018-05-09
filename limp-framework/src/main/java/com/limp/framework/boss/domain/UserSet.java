package com.limp.framework.boss.domain;

import java.io.Serializable;
import java.util.Date;

public class UserSet implements Serializable {
    private String userid;

    private String menuid;

    private Date begindate;

    private Date enddate;

    private Integer showLimit;

    private Integer settype;

    private Integer totalCount;

    private Integer usedCount;

    private Integer retainCount;

    private Integer status;

    private Date rc1;

    private Integer rc2;

    private Integer rc3;

    private String rc4;

    private String rc5;

    private Date idt;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getShowLimit() {
        return showLimit;
    }

    public void setShowLimit(Integer showLimit) {
        this.showLimit = showLimit;
    }

    public Integer getSettype() {
        return settype;
    }

    public void setSettype(Integer settype) {
        this.settype = settype;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public Integer getRetainCount() {
        return retainCount;
    }

    public void setRetainCount(Integer retainCount) {
        this.retainCount = retainCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRc1() {
        return rc1;
    }

    public void setRc1(Date rc1) {
        this.rc1 = rc1;
    }

    public Integer getRc2() {
        return rc2;
    }

    public void setRc2(Integer rc2) {
        this.rc2 = rc2;
    }

    public Integer getRc3() {
        return rc3;
    }

    public void setRc3(Integer rc3) {
        this.rc3 = rc3;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRc4() {
        return rc4;
    }

    public void setRc4(String rc4) {
        this.rc4 = rc4 == null ? null : rc4.trim();
    }

    public String getRc5() {
        return rc5;
    }

    public void setRc5(String rc5) {
        this.rc5 = rc5 == null ? null : rc5.trim();
    }

    public Date getIdt() {
        return idt;
    }

    public void setIdt(Date idt) {
        this.idt = idt;
    }
}