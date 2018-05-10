package com.chinasofti.domain;

import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.bean.Pager;

import java.io.Serializable;

public class SurWorkRecord  extends AbstractModel implements Serializable {
    private String id;

    private String surid;

    private String orgid;

    private String workunit;

    private String begintime;

    private String endtime;

    private String position;

    private String witness;

    private Object idt;

    private Object udt;

    private String state;

    private Pager page;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSurid() {
        return surid;
    }

    public void setSurid(String surid) {
        this.surid = surid == null ? null : surid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime == null ? null : begintime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public Object getIdt() {
        return idt;
    }

    public void setIdt(Object idt) {
        this.idt = idt;
    }

    public Object getUdt() {
        return udt;
    }

    public void setUdt(Object udt) {
        this.udt = udt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Pager getPage() {
        return page;
    }

    public void setPage(Pager page) {
        this.page = page;
    }
}