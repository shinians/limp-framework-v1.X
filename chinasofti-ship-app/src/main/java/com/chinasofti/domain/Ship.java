package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class Ship extends AbstractModel implements Serializable {
    private String id;

    private String shipname;

    private String callsign;

    private String shipmaterial;

    private String shipnameplan;

    private String modelwidth;

    private String modeldepth;

    private String freshwaterv;

    private String bollardpull;

    private String power;

    private String completdate;

    private String drawno;

    private String freshkeep;

    private String desspeed;

    private String crewquota;

    private String fishcub;

    private String propellereff;

    private String pitchstatus;

    private String shipcode;

    private String shiptype;

    private String navzone;

    private String shiplength;

    private String desdraft;

    private String freeboard;

    private String shipweight;

    private String tonnage;

    private String entnamedes;

    private String entdesid;

    private String shipport;

    private String decks;

    private String covshiplength;

    private String deswater;

    private String oilv;

    private String ballast;

    private String nettonnage;

    private String entnamebul;

    private String entbulid;

    private String orgid;

    private String shiprovname;

    private String hostmodel1;

    private String hostmodel2;

    private String hostmodel3;

    private String hostpower1;

    private String hostpower2;

    private String hostpower3;

    private String ownerno;

    private String fishroomnum;

    private String hostnum;

    private String jobtype;

    private String opemode;

    private String jobtype2;

    private String opemode2;

    private String autopemode;

    private String workplace;

    private String ownername;

    private String owneraddr;

    private String ownertel;

    private String postcode;

    private String periodfishlic;

    private String fishlicno;

    private String shipcertval;

    private String shipcertno;

    private String regcertdate;

    private String regcertno;

    private String ownerobtdate;

    private String endregcertno;

    private String shipinsapp;

    private String regarea;

    private String posx;

    private String posy;

    private String postime;

    private String jobarea;

    private String datastatus;

    private String checkstatus;

    private String mmsi;

    private String rownum_;

    private String linkVerifyenrNo;

    private String orgname;

    private String certificatestate;

    private String shipCategory;

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

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign == null ? null : callsign.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"shipmaterial")
    public String getShipmaterial() {
        return shipmaterial;
    }

    public void setShipmaterial(String shipmaterial) {
        this.shipmaterial = shipmaterial == null ? null : shipmaterial.trim();
    }

    public String getShipnameplan() {
        return shipnameplan;
    }

    public void setShipnameplan(String shipnameplan) {
        this.shipnameplan = shipnameplan == null ? null : shipnameplan.trim();
    }

    public String getModelwidth() {
        return modelwidth;
    }

    public void setModelwidth(String modelwidth) {
        this.modelwidth = modelwidth == null ? null : modelwidth.trim();
    }

    public String getModeldepth() {
        return modeldepth;
    }

    public void setModeldepth(String modeldepth) {
        this.modeldepth = modeldepth == null ? null : modeldepth.trim();
    }

    public String getFreshwaterv() {
        return freshwaterv;
    }

    public void setFreshwaterv(String freshwaterv) {
        this.freshwaterv = freshwaterv == null ? null : freshwaterv.trim();
    }

    public String getBollardpull() {
        return bollardpull;
    }

    public void setBollardpull(String bollardpull) {
        this.bollardpull = bollardpull == null ? null : bollardpull.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getCompletdate() {
        return completdate;
    }

    public void setCompletdate(String completdate) {
        this.completdate = completdate == null ? null : completdate.trim();
    }

    public String getDrawno() {
        return drawno;
    }

    public void setDrawno(String drawno) {
        this.drawno = drawno == null ? null : drawno.trim();
    }

    public String getFreshkeep() {
        return freshkeep;
    }

    public void setFreshkeep(String freshkeep) {
        this.freshkeep = freshkeep == null ? null : freshkeep.trim();
    }

    public String getDesspeed() {
        return desspeed;
    }

    public void setDesspeed(String desspeed) {
        this.desspeed = desspeed == null ? null : desspeed.trim();
    }

    public String getCrewquota() {
        return crewquota;
    }

    public void setCrewquota(String crewquota) {
        this.crewquota = crewquota == null ? null : crewquota.trim();
    }

    public String getFishcub() {
        return fishcub;
    }

    public void setFishcub(String fishcub) {
        this.fishcub = fishcub == null ? null : fishcub.trim();
    }

    public String getPropellereff() {
        return propellereff;
    }

    public void setPropellereff(String propellereff) {
        this.propellereff = propellereff == null ? null : propellereff.trim();
    }

    public String getPitchstatus() {
        return pitchstatus;
    }

    public void setPitchstatus(String pitchstatus) {
        this.pitchstatus = pitchstatus == null ? null : pitchstatus.trim();
    }

    public String getShipcode() {
        return shipcode;
    }

    public void setShipcode(String shipcode) {
        this.shipcode = shipcode == null ? null : shipcode.trim();
    }

    @JSONField(name= Constant.CODE_TRANS_PRE+"shiptype")
    public String getShiptype() {
        return shiptype;
    }

    public void setShiptype(String shiptype) {
        this.shiptype = shiptype == null ? null : shiptype.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"navzone")
    public String getNavzone() {
        return navzone;
    }

    public void setNavzone(String navzone) {
        this.navzone = navzone == null ? null : navzone.trim();
    }

    public String getShiplength() {
        return shiplength;
    }

    public void setShiplength(String shiplength) {
        this.shiplength = shiplength == null ? null : shiplength.trim();
    }

    public String getDesdraft() {
        return desdraft;
    }

    public void setDesdraft(String desdraft) {
        this.desdraft = desdraft == null ? null : desdraft.trim();
    }

    public String getFreeboard() {
        return freeboard;
    }

    public void setFreeboard(String freeboard) {
        this.freeboard = freeboard == null ? null : freeboard.trim();
    }

    public String getShipweight() {
        return shipweight;
    }

    public void setShipweight(String shipweight) {
        this.shipweight = shipweight == null ? null : shipweight.trim();
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage == null ? null : tonnage.trim();
    }

    public String getEntnamedes() {
        return entnamedes;
    }

    public void setEntnamedes(String entnamedes) {
        this.entnamedes = entnamedes == null ? null : entnamedes.trim();
    }

    public String getEntdesid() {
        return entdesid;
    }

    public void setEntdesid(String entdesid) {
        this.entdesid = entdesid == null ? null : entdesid.trim();
    }

    public String getShipport() {
        return shipport;
    }

    public void setShipport(String shipport) {
        this.shipport = shipport == null ? null : shipport.trim();
    }

    public String getDecks() {
        return decks;
    }

    public void setDecks(String decks) {
        this.decks = decks == null ? null : decks.trim();
    }

    public String getCovshiplength() {
        return covshiplength;
    }

    public void setCovshiplength(String covshiplength) {
        this.covshiplength = covshiplength == null ? null : covshiplength.trim();
    }

    public String getDeswater() {
        return deswater;
    }

    public void setDeswater(String deswater) {
        this.deswater = deswater == null ? null : deswater.trim();
    }

    public String getOilv() {
        return oilv;
    }

    public void setOilv(String oilv) {
        this.oilv = oilv == null ? null : oilv.trim();
    }

    public String getBallast() {
        return ballast;
    }

    public void setBallast(String ballast) {
        this.ballast = ballast == null ? null : ballast.trim();
    }

    public String getNettonnage() {
        return nettonnage;
    }

    public void setNettonnage(String nettonnage) {
        this.nettonnage = nettonnage == null ? null : nettonnage.trim();
    }

    public String getEntnamebul() {
        return entnamebul;
    }

    public void setEntnamebul(String entnamebul) {
        this.entnamebul = entnamebul == null ? null : entnamebul.trim();
    }

    public String getEntbulid() {
        return entbulid;
    }

    public void setEntbulid(String entbulid) {
        this.entbulid = entbulid == null ? null : entbulid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"shiprovname")
    public String getShiprovname() {
        return shiprovname;
    }

    public void setShiprovname(String shiprovname) {
        this.shiprovname = shiprovname == null ? null : shiprovname.trim();
    }

    public String getHostmodel1() {
        return hostmodel1;
    }

    public void setHostmodel1(String hostmodel1) {
        this.hostmodel1 = hostmodel1 == null ? null : hostmodel1.trim();
    }

    public String getHostmodel2() {
        return hostmodel2;
    }

    public void setHostmodel2(String hostmodel2) {
        this.hostmodel2 = hostmodel2 == null ? null : hostmodel2.trim();
    }

    public String getHostmodel3() {
        return hostmodel3;
    }

    public void setHostmodel3(String hostmodel3) {
        this.hostmodel3 = hostmodel3 == null ? null : hostmodel3.trim();
    }

    public String getHostpower1() {
        return hostpower1;
    }

    public void setHostpower1(String hostpower1) {
        this.hostpower1 = hostpower1 == null ? null : hostpower1.trim();
    }

    public String getHostpower2() {
        return hostpower2;
    }

    public void setHostpower2(String hostpower2) {
        this.hostpower2 = hostpower2 == null ? null : hostpower2.trim();
    }

    public String getHostpower3() {
        return hostpower3;
    }

    public void setHostpower3(String hostpower3) {
        this.hostpower3 = hostpower3 == null ? null : hostpower3.trim();
    }

    public String getOwnerno() {
        return ownerno;
    }

    public void setOwnerno(String ownerno) {
        this.ownerno = ownerno == null ? null : ownerno.trim();
    }

    public String getFishroomnum() {
        return fishroomnum;
    }

    public void setFishroomnum(String fishroomnum) {
        this.fishroomnum = fishroomnum == null ? null : fishroomnum.trim();
    }

    public String getHostnum() {
        return hostnum;
    }

    public void setHostnum(String hostnum) {
        this.hostnum = hostnum == null ? null : hostnum.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"jobtype")
    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype == null ? null : jobtype.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"opemode")
    public String getOpemode() {
        return opemode;
    }

    public void setOpemode(String opemode) {
        this.opemode = opemode == null ? null : opemode.trim();
    }

    public String getJobtype2() {
        return jobtype2;
    }

    public void setJobtype2(String jobtype2) {
        this.jobtype2 = jobtype2 == null ? null : jobtype2.trim();
    }

    public String getOpemode2() {
        return opemode2;
    }

    public void setOpemode2(String opemode2) {
        this.opemode2 = opemode2 == null ? null : opemode2.trim();
    }

    public String getAutopemode() {
        return autopemode;
    }

    public void setAutopemode(String autopemode) {
        this.autopemode = autopemode == null ? null : autopemode.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"workplace")
    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    public String getOwneraddr() {
        return owneraddr;
    }

    public void setOwneraddr(String owneraddr) {
        this.owneraddr = owneraddr == null ? null : owneraddr.trim();
    }

    public String getOwnertel() {
        return ownertel;
    }

    public void setOwnertel(String ownertel) {
        this.ownertel = ownertel == null ? null : ownertel.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getPeriodfishlic() {
        return periodfishlic;
    }

    public void setPeriodfishlic(String periodfishlic) {
        this.periodfishlic = periodfishlic == null ? null : periodfishlic.trim();
    }

    public String getFishlicno() {
        return fishlicno;
    }

    public void setFishlicno(String fishlicno) {
        this.fishlicno = fishlicno == null ? null : fishlicno.trim();
    }

    public String getShipcertval() {
        return shipcertval;
    }

    public void setShipcertval(String shipcertval) {
        this.shipcertval = shipcertval == null ? null : shipcertval.trim();
    }

    public String getShipcertno() {
        return shipcertno;
    }

    public void setShipcertno(String shipcertno) {
        this.shipcertno = shipcertno == null ? null : shipcertno.trim();
    }

    public String getRegcertdate() {
        return regcertdate;
    }

    public void setRegcertdate(String regcertdate) {
        this.regcertdate = regcertdate == null ? null : regcertdate.trim();
    }

    public String getRegcertno() {
        return regcertno;
    }

    public void setRegcertno(String regcertno) {
        this.regcertno = regcertno == null ? null : regcertno.trim();
    }

    public String getOwnerobtdate() {
        return ownerobtdate;
    }

    public void setOwnerobtdate(String ownerobtdate) {
        this.ownerobtdate = ownerobtdate == null ? null : ownerobtdate.trim();
    }

    public String getEndregcertno() {
        return endregcertno;
    }

    public void setEndregcertno(String endregcertno) {
        this.endregcertno = endregcertno == null ? null : endregcertno.trim();
    }

    public String getShipinsapp() {
        return shipinsapp;
    }

    public void setShipinsapp(String shipinsapp) {
        this.shipinsapp = shipinsapp == null ? null : shipinsapp.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"regarea")
    public String getRegarea() {
        return regarea;
    }

    public void setRegarea(String regarea) {
        this.regarea = regarea == null ? null : regarea.trim();
    }

    public String getPosx() {
        return posx;
    }

    public void setPosx(String posx) {
        this.posx = posx == null ? null : posx.trim();
    }

    public String getPosy() {
        return posy;
    }

    public void setPosy(String posy) {
        this.posy = posy == null ? null : posy.trim();
    }

    public String getPostime() {
        return postime;
    }

    public void setPostime(String postime) {
        this.postime = postime == null ? null : postime.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"jobarea")
    public String getJobarea() {
        return jobarea;
    }

    public void setJobarea(String jobarea) {
        this.jobarea = jobarea == null ? null : jobarea.trim();
    }

    public String getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(String datastatus) {
        this.datastatus = datastatus == null ? null : datastatus.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi == null ? null : mmsi.trim();
    }

    public String getRownum_() {
        return rownum_;
    }

    public void setRownum_(String rownum_) {
        this.rownum_ = rownum_;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getLinkVerifyenrNo() {
        return linkVerifyenrNo;
    }

    public void setLinkVerifyenrNo(String linkVerifyenrNo) {
        this.linkVerifyenrNo = linkVerifyenrNo;
    }

    @JSONField(name= Constant.CODE_TRANS_PRE+"getCertificatestate")
    public String getCertificatestate() {
        return certificatestate;
    }

    public void setCertificatestate(String certificatestate) {
        this.certificatestate = certificatestate;
    }

    @JSONField(name= Constant.CODE_TRANS_PRE+"shipCategory")
    public String getShipCategory() {
        return shipCategory;
    }

    public void setShipCategory(String shipCategory) {
        this.shipCategory = shipCategory;
    }
}