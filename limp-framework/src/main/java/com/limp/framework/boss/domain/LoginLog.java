package com.limp.framework.boss.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private String id;

    private String userId;

    private String ullAccount;

    private Integer ullLogstate;

    private String ullMac;

    private String ullIp;

    private Date ullTime;

    private Integer ullType;

    private Integer ullState;

    private String ullRc0;

    private String ullRc1;

    private String ullRc2;

    private Integer ullRc3;

    private Integer ullRc4;

    private Date ullRc5;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUllAccount() {
        return ullAccount;
    }

    public void setUllAccount(String ullAccount) {
        this.ullAccount = ullAccount == null ? null : ullAccount.trim();
    }

    public Integer getUllLogstate() {
        return ullLogstate;
    }

    public void setUllLogstate(Integer ullLogstate) {
        this.ullLogstate = ullLogstate;
    }

    public String getUllMac() {
        return ullMac;
    }

    public void setUllMac(String ullMac) {
        this.ullMac = ullMac == null ? null : ullMac.trim();
    }

    public String getUllIp() {
        return ullIp;
    }

    public void setUllIp(String ullIp) {
        this.ullIp = ullIp == null ? null : ullIp.trim();
    }

    public Date getUllTime() {
        return ullTime;
    }

    public void setUllTime(Date ullTime) {
        this.ullTime = ullTime;
    }

    public Integer getUllType() {
        return ullType;
    }

    public void setUllType(Integer ullType) {
        this.ullType = ullType;
    }

    public Integer getUllState() {
        return ullState;
    }

    public void setUllState(Integer ullState) {
        this.ullState = ullState;
    }

    public String getUllRc0() {
        return ullRc0;
    }

    public void setUllRc0(String ullRc0) {
        this.ullRc0 = ullRc0 == null ? null : ullRc0.trim();
    }

    public String getUllRc1() {
        return ullRc1;
    }

    public void setUllRc1(String ullRc1) {
        this.ullRc1 = ullRc1 == null ? null : ullRc1.trim();
    }

    public String getUllRc2() {
        return ullRc2;
    }

    public void setUllRc2(String ullRc2) {
        this.ullRc2 = ullRc2 == null ? null : ullRc2.trim();
    }

    public Integer getUllRc3() {
        return ullRc3;
    }

    public void setUllRc3(Integer ullRc3) {
        this.ullRc3 = ullRc3;
    }

    public Integer getUllRc4() {
        return ullRc4;
    }

    public void setUllRc4(Integer ullRc4) {
        this.ullRc4 = ullRc4;
    }

    public Date getUllRc5() {
        return ullRc5;
    }

    public void setUllRc5(Date ullRc5) {
        this.ullRc5 = ullRc5;
    }
}