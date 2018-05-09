package com.chinasofti.domain;

import java.util.List;

/**
 * Created by icss on 2017/11/16.
 */
public class ShipQueryParams {
    private String id;//所属机构id
    private String shipid;//
    private String shipname;//
    private String lengthType;//1:0-12米，2:12-24米，3:24-45米，4:45米及以上
    private String material;//船体材质
    private String jobArea;//作业区域
    private String powerBegin;//主机功率
    private String powerEnd;//主机功率

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getPowerBegin() {
        return powerBegin;
    }

    public void setPowerBegin(String powerBegin) {
        this.powerBegin = powerBegin;
    }

    public String getPowerEnd() {
        return powerEnd;
    }

    public void setPowerEnd(String powerEnd) {
        this.powerEnd = powerEnd;
    }

    public String getLengthType() {
        return lengthType;
    }

    public void setLengthType(String lengthType) {
        this.lengthType = lengthType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getJobArea() {
        return jobArea;
    }

    public void setJobArea(String jobArea) {
        this.jobArea = jobArea;
    }
}
