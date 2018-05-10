package com.chinasofti.domain;

import java.io.Serializable;

public class GNShipPos implements Serializable {
    private Double x1;
    private Double x2;
    private Double y1;
    private Double y2;

    private String startDate;
    private String endDate;

    private String id;

    private String shipno;

    private String shipname;

    private String shipport;

    private String rectime;

    private String lon;

    private String lat;

    private String postype;

    private String idt;

    private String postime;

    private String direction;

    private String speed;

    private String bow;

    private String terminalType;

    private String commType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShipno() {
        return shipno;
    }

    public void setShipno(String shipno) {
        this.shipno = shipno == null ? null : shipno.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getShipport() {
        return shipport;
    }

    public void setShipport(String shipport) {
        this.shipport = shipport == null ? null : shipport.trim();
    }

    public String getRectime() {
        return rectime;
    }

    public void setRectime(String rectime) {
        this.rectime = rectime == null ? null : rectime.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getPostype() {
        return postype;
    }

    public void setPostype(String postype) {
        this.postype = postype == null ? null : postype.trim();
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt == null ? null : idt.trim();
    }

    public String getPostime() {
        return postime;
    }

    public void setPostime(String postime) {
        this.postime = postime == null ? null : postime.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed == null ? null : speed.trim();
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow == null ? null : bow.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getCommType() {
        return commType;
    }

    public void setCommType(String commType) {
        this.commType = commType == null ? null : commType.trim();
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GNShipPos@");
        stringBuffer.append("[");
        stringBuffer.append("id=" + id);
        stringBuffer.append(",shipno=" + shipno);
        stringBuffer.append(",shipname=" + shipname);
        stringBuffer.append(",shipport=" + shipport);
        stringBuffer.append(",rectime=" + rectime);
        stringBuffer.append(",lon=" + lon);
        stringBuffer.append(",lat=" + lat);
        stringBuffer.append(",postype=" + postype);
        stringBuffer.append(",idt=" + idt);
        stringBuffer.append(",postime=" + postime);
        stringBuffer.append(",direction=" + direction);
        stringBuffer.append(",speed=" + speed);
        stringBuffer.append(",bow=" + bow);
        stringBuffer.append(",terminalType=" + terminalType);
        stringBuffer.append(",commType=" + commType);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}