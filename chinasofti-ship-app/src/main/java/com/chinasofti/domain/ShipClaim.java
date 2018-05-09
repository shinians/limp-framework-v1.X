package com.chinasofti.domain;

import java.io.Serializable;

public class ShipClaim implements Serializable {
    private String id;

    private String shipCode;

    private String shipName;

    private String claimFlag;

    private String accdntspot;

    private String accdnttm;

    private String srvyspot;

    private String srvytm;

    private String accorgcnm;

    private String accrsncnm;

    private String lostdegreecde;

    private String damagedtl;

    private String helpflag;

    private String rescuestatecde;

    private String rescuemodecde;

    private String repaddress;

    private String thdshipname;

    private String thdunit;

    private String thdshipstatuscde;

    private String thddamagedtl;

    private String filetype;

    private String filepath;

    private String accdntdtl;

    private String srvyopn;

    private String cclmno;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getClaimFlag() {
        return claimFlag;
    }

    public void setClaimFlag(String claimFlag) {
        this.claimFlag = claimFlag == null ? null : claimFlag.trim();
    }

    public String getAccdntspot() {
        return accdntspot;
    }

    public void setAccdntspot(String accdntspot) {
        this.accdntspot = accdntspot == null ? null : accdntspot.trim();
    }

    public String getAccdnttm() {
        return accdnttm;
    }

    public void setAccdnttm(String accdnttm) {
        this.accdnttm = accdnttm == null ? null : accdnttm.trim();
    }

    public String getSrvyspot() {
        return srvyspot;
    }

    public void setSrvyspot(String srvyspot) {
        this.srvyspot = srvyspot == null ? null : srvyspot.trim();
    }

    public String getSrvytm() {
        return srvytm;
    }

    public void setSrvytm(String srvytm) {
        this.srvytm = srvytm == null ? null : srvytm.trim();
    }

    public String getAccorgcnm() {
        return accorgcnm;
    }

    public void setAccorgcnm(String accorgcnm) {
        this.accorgcnm = accorgcnm == null ? null : accorgcnm.trim();
    }

    public String getAccrsncnm() {
        return accrsncnm;
    }

    public void setAccrsncnm(String accrsncnm) {
        this.accrsncnm = accrsncnm == null ? null : accrsncnm.trim();
    }

    public String getLostdegreecde() {
        return lostdegreecde;
    }

    public void setLostdegreecde(String lostdegreecde) {
        this.lostdegreecde = lostdegreecde == null ? null : lostdegreecde.trim();
    }

    public String getDamagedtl() {
        return damagedtl;
    }

    public void setDamagedtl(String damagedtl) {
        this.damagedtl = damagedtl == null ? null : damagedtl.trim();
    }

    public String getHelpflag() {
        return helpflag;
    }

    public void setHelpflag(String helpflag) {
        this.helpflag = helpflag == null ? null : helpflag.trim();
    }

    public String getRescuestatecde() {
        return rescuestatecde;
    }

    public void setRescuestatecde(String rescuestatecde) {
        this.rescuestatecde = rescuestatecde == null ? null : rescuestatecde.trim();
    }

    public String getRescuemodecde() {
        return rescuemodecde;
    }

    public void setRescuemodecde(String rescuemodecde) {
        this.rescuemodecde = rescuemodecde == null ? null : rescuemodecde.trim();
    }

    public String getRepaddress() {
        return repaddress;
    }

    public void setRepaddress(String repaddress) {
        this.repaddress = repaddress == null ? null : repaddress.trim();
    }

    public String getThdshipname() {
        return thdshipname;
    }

    public void setThdshipname(String thdshipname) {
        this.thdshipname = thdshipname == null ? null : thdshipname.trim();
    }

    public String getThdunit() {
        return thdunit;
    }

    public void setThdunit(String thdunit) {
        this.thdunit = thdunit == null ? null : thdunit.trim();
    }

    public String getThdshipstatuscde() {
        return thdshipstatuscde;
    }

    public void setThdshipstatuscde(String thdshipstatuscde) {
        this.thdshipstatuscde = thdshipstatuscde == null ? null : thdshipstatuscde.trim();
    }

    public String getThddamagedtl() {
        return thddamagedtl;
    }

    public void setThddamagedtl(String thddamagedtl) {
        this.thddamagedtl = thddamagedtl == null ? null : thddamagedtl.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getAccdntdtl() {
        return accdntdtl;
    }

    public void setAccdntdtl(String accdntdtl) {
        this.accdntdtl = accdntdtl == null ? null : accdntdtl.trim();
    }

    public String getSrvyopn() {
        return srvyopn;
    }

    public void setSrvyopn(String srvyopn) {
        this.srvyopn = srvyopn == null ? null : srvyopn.trim();
    }

    public String getCclmno() {
        return cclmno;
    }

    public void setCclmno(String cclmno) {
        this.cclmno = cclmno == null ? null : cclmno.trim();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ShipClaim@");
        stringBuffer.append("[");
        stringBuffer.append("id=" + id);
        stringBuffer.append(",shipCode=" + shipCode);
        stringBuffer.append(",shipName=" + shipName);
        stringBuffer.append(",claimFlag=" + claimFlag);
        stringBuffer.append(",accdntspot=" + accdntspot);
        stringBuffer.append(",accdnttm=" + accdnttm);
        stringBuffer.append(",srvyspot=" + srvyspot);
        stringBuffer.append(",srvytm=" + srvytm);
        stringBuffer.append(",accorgcnm=" + accorgcnm);
        stringBuffer.append(",accrsncnm=" + accrsncnm);
        stringBuffer.append(",lostdegreecde=" + lostdegreecde);
        stringBuffer.append(",damagedtl=" + damagedtl);
        stringBuffer.append(",helpflag=" + helpflag);
        stringBuffer.append(",rescuestatecde=" + rescuestatecde);
        stringBuffer.append(",rescuemodecde=" + rescuemodecde);
        stringBuffer.append(",repaddress=" + repaddress);
        stringBuffer.append(",thdshipname=" + thdshipname);
        stringBuffer.append(",thdunit=" + thdunit);
        stringBuffer.append(",thdshipstatuscde=" + thdshipstatuscde);
        stringBuffer.append(",thddamagedtl=" + thddamagedtl);
        stringBuffer.append(",filetype=" + filetype);
        stringBuffer.append(",filepath=" + filepath);
        stringBuffer.append(",srvyopn=" + srvyopn);
        stringBuffer.append(",cclmno=" + cclmno);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

}