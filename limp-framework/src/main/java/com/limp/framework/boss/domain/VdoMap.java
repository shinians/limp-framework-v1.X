package com.limp.framework.boss.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VdoMap implements Serializable {
    private String udmUreguid;

    private String udmSsmguid;

    private String udmSsmdtguid;

    private String udmValue;

    private BigDecimal udmInclude;

    private BigDecimal udmIsremove;

    private BigDecimal udmState;

    private String udmRc0;

    private String udmRc1;

    private String udmRc2;

    private String udmRc3;

    private String udmRc4;

    private String udmRc5;

    private BigDecimal udmRc6;

    private BigDecimal udmRc7;

    private Date udmRc8;

    private Date udmRc9;

    private static final long serialVersionUID = 1L;

    public String getUdmUreguid() {
        return udmUreguid;
    }

    public void setUdmUreguid(String udmUreguid) {
        this.udmUreguid = udmUreguid == null ? null : udmUreguid.trim();
    }

    public String getUdmSsmguid() {
        return udmSsmguid;
    }

    public void setUdmSsmguid(String udmSsmguid) {
        this.udmSsmguid = udmSsmguid == null ? null : udmSsmguid.trim();
    }

    public String getUdmSsmdtguid() {
        return udmSsmdtguid;
    }

    public void setUdmSsmdtguid(String udmSsmdtguid) {
        this.udmSsmdtguid = udmSsmdtguid == null ? null : udmSsmdtguid.trim();
    }

    public String getUdmValue() {
        return udmValue;
    }

    public void setUdmValue(String udmValue) {
        this.udmValue = udmValue == null ? null : udmValue.trim();
    }

    public BigDecimal getUdmInclude() {
        return udmInclude;
    }

    public void setUdmInclude(BigDecimal udmInclude) {
        this.udmInclude = udmInclude;
    }

    public BigDecimal getUdmIsremove() {
        return udmIsremove;
    }

    public void setUdmIsremove(BigDecimal udmIsremove) {
        this.udmIsremove = udmIsremove;
    }

    public BigDecimal getUdmState() {
        return udmState;
    }

    public void setUdmState(BigDecimal udmState) {
        this.udmState = udmState;
    }

    public String getUdmRc0() {
        return udmRc0;
    }

    public void setUdmRc0(String udmRc0) {
        this.udmRc0 = udmRc0 == null ? null : udmRc0.trim();
    }

    public String getUdmRc1() {
        return udmRc1;
    }

    public void setUdmRc1(String udmRc1) {
        this.udmRc1 = udmRc1 == null ? null : udmRc1.trim();
    }

    public String getUdmRc2() {
        return udmRc2;
    }

    public void setUdmRc2(String udmRc2) {
        this.udmRc2 = udmRc2 == null ? null : udmRc2.trim();
    }

    public String getUdmRc3() {
        return udmRc3;
    }

    public void setUdmRc3(String udmRc3) {
        this.udmRc3 = udmRc3 == null ? null : udmRc3.trim();
    }

    public String getUdmRc4() {
        return udmRc4;
    }

    public void setUdmRc4(String udmRc4) {
        this.udmRc4 = udmRc4 == null ? null : udmRc4.trim();
    }

    public String getUdmRc5() {
        return udmRc5;
    }

    public void setUdmRc5(String udmRc5) {
        this.udmRc5 = udmRc5 == null ? null : udmRc5.trim();
    }

    public BigDecimal getUdmRc6() {
        return udmRc6;
    }

    public void setUdmRc6(BigDecimal udmRc6) {
        this.udmRc6 = udmRc6;
    }

    public BigDecimal getUdmRc7() {
        return udmRc7;
    }

    public void setUdmRc7(BigDecimal udmRc7) {
        this.udmRc7 = udmRc7;
    }

    public Date getUdmRc8() {
        return udmRc8;
    }

    public void setUdmRc8(Date udmRc8) {
        this.udmRc8 = udmRc8;
    }

    public Date getUdmRc9() {
        return udmRc9;
    }

    public void setUdmRc9(Date udmRc9) {
        this.udmRc9 = udmRc9;
    }
}