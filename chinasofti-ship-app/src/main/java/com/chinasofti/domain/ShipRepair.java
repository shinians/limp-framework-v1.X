package com.chinasofti.domain;

import java.io.Serializable;

public class ShipRepair implements Serializable {
    private String id;

    private String shipname;

    private Ship ship;

    private String reptime;

    private String repitems;

    private String repreason;

    private String repcontent;

    private String repperson;

    private String repunit;

    private String entid;

    private String entname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

//    public String getShipid() {
//        return shipid;
//    }
//
//    public void setShipid(String shipid) {
//        this.shipid = shipid == null ? null : shipid.trim();
//    }

    public String getReptime() {
        return reptime;
    }

    public void setReptime(String reptime) {
        this.reptime = reptime == null ? null : reptime.trim();
    }

    public String getRepitems() {
        return repitems;
    }

    public void setRepitems(String repitems) {
        this.repitems = repitems == null ? null : repitems.trim();
    }

    public String getRepreason() {
        return repreason;
    }

    public void setRepreason(String repreason) {
        this.repreason = repreason == null ? null : repreason.trim();
    }

    public String getRepcontent() {
        return repcontent;
    }

    public void setRepcontent(String repcontent) {
        this.repcontent = repcontent == null ? null : repcontent.trim();
    }

    public String getRepperson() {
        return repperson;
    }

    public void setRepperson(String repperson) {
        this.repperson = repperson == null ? null : repperson.trim();
    }

    public String getRepunit() {
        return repunit;
    }

    public void setRepunit(String repunit) {
        this.repunit = repunit == null ? null : repunit.trim();
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

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

}