package com.chinasofti.domain;

import java.io.Serializable;

public class DrawInfo implements Serializable {
    private String id;

    private String drawno;

    private String apprtime;

    private String endtime;

    private String desunit;

    private String entid;

    private String resppersion;

    private String shipno;

    private Long rebshipnum;

    private String shiplength;

    private String tonnage;

    private String power;

    private String speed;

    private String water;

    private String shiptype;

    private String shiptypeid;

    private String shiparea;

    private String shipareaid;

    private String peoplecount;

    private String jobarea;

    private String applyunit;

    private String applyunitId;

    private String dramshipname;

    private String engineroomType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
    }

    public String getApprtime() {
        return apprtime;
    }

    public void setApprtime(String apprtime) {
        this.apprtime = apprtime == null ? null : apprtime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getDesunit() {
        return desunit;
    }

    public void setDesunit(String desunit) {
        this.desunit = desunit == null ? null : desunit.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getResppersion() {
        return resppersion;
    }

    public void setResppersion(String resppersion) {
        this.resppersion = resppersion == null ? null : resppersion.trim();
    }

    public String getShipno() {
        return shipno;
    }

    public void setShipno(String shipno) {
        this.shipno = shipno == null ? null : shipno.trim();
    }

    public Long getRebshipnum() {
        return rebshipnum;
    }

    public void setRebshipnum(Long rebshipnum) {
        this.rebshipnum = rebshipnum;
    }

    public String getShiplength() {
        return shiplength;
    }

    public void setShiplength(String shiplength) {
        this.shiplength = shiplength == null ? null : shiplength.trim();
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage == null ? null : tonnage.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed == null ? null : speed.trim();
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water == null ? null : water.trim();
    }

    public String getShiptype() {
        return shiptype;
    }

    public void setShiptype(String shiptype) {
        this.shiptype = shiptype == null ? null : shiptype.trim();
    }

    public String getShiptypeid() {
        return shiptypeid;
    }

    public void setShiptypeid(String shiptypeid) {
        this.shiptypeid = shiptypeid == null ? null : shiptypeid.trim();
    }

    public String getShiparea() {
        return shiparea;
    }

    public void setShiparea(String shiparea) {
        this.shiparea = shiparea == null ? null : shiparea.trim();
    }

    public String getShipareaid() {
        return shipareaid;
    }

    public void setShipareaid(String shipareaid) {
        this.shipareaid = shipareaid == null ? null : shipareaid.trim();
    }

    public String getPeoplecount() {
        return peoplecount;
    }

    public void setPeoplecount(String peoplecount) {
        this.peoplecount = peoplecount == null ? null : peoplecount.trim();
    }

    public String getJobarea() {
        return jobarea;
    }

    public void setJobarea(String jobarea) {
        this.jobarea = jobarea == null ? null : jobarea.trim();
    }

    public String getApplyunit() {
        return applyunit;
    }

    public void setApplyunit(String applyunit) {
        this.applyunit = applyunit == null ? null : applyunit.trim();
    }

    public String getApplyunitId() {
        return applyunitId;
    }

    public void setApplyunitId(String applyunitId) {
        this.applyunitId = applyunitId == null ? null : applyunitId.trim();
    }

    public String getDramshipname() {
        return dramshipname;
    }

    public void setDramshipname(String dramshipname) {
        this.dramshipname = dramshipname == null ? null : dramshipname.trim();
    }

    public String getEngineroomType() {
        return engineroomType;
    }

    public void setEngineroomType(String engineroomType) {
        this.engineroomType = engineroomType == null ? null : engineroomType.trim();
    }
}