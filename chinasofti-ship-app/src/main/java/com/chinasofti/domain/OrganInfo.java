package com.chinasofti.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.chinasofti.common.Const;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.constant.Constant;

import java.io.Serializable;

public class OrganInfo  extends AbstractModel implements Serializable  {
    private String id;

    private String uid;

    private String certid;

    private String orgname;

    private String orgcode;

    private String orgaddr;

    private String funtype;

    private String parttype;

    private String bustype;

    private String funscope;

    private String geotype;

    private String provcode;

    private String provname;

    private String typelv;

    private String orgnameup;

    private String orgcodeup;

    private String orgareaname;

    private String orgpostcode;

    private String areacode;

    private String contactphone;

    private String contactfax;

    private String contacttel;

    private String contactemail;

    private String bodertype;

    private String headhas;

    private String finasource;

    private String respperson;

    private String legalperson;

    private String subjection;

    private String naturetype;

    private String apprnum;

    private String pertotalnum;

    private Long persurlv1;

    private Long persurlv2;

    private Long persurlv3;

    private Long persurocean;

    private Long persurdraw;

    private Long persurproduct;

    private Long juniordown;

    private Long juniorup;

    private Long bachelorup;

    private Long graduateup;

    private String officearea;

    private Long device;

    private Integer carnum;

    private Long compunum;

    private Long shipnum7;

    private Long shipnum7to12;

    private Long shipnum12to24;

    private Long shipnum24;

    private Long oceshipnum5;

    private Long oceshipnum5to12;

    private Long oceshipnum12to24;

    private Long oceshipnum24to45;

    private Long oceshipnum45;

    private String orgscope;

    private String checkscope;

    private Long oceanboatnum;

    private Long entreparenum;

    private Long entproductnum;

    private Long entdesinum;

    private Long allboatnum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid == null ? null : certid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getOrgaddr() {
        return orgaddr;
    }

    public void setOrgaddr(String orgaddr) {
        this.orgaddr = orgaddr == null ? null : orgaddr.trim();
    }

    /**
     * 加入转化编码前缀
     * @return
     */
   @JSONField(name= Constant.CODE_TRANS_PRE+"funtype")
    public String getFuntype() {
        return funtype;
    }

    public void setFuntype(String funtype) {
        this.funtype = funtype == null ? null : funtype.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"parttype")
    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype == null ? null : parttype.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"bustype")
    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype == null ? null : bustype.trim();
    }
    @JSONField(name=Constant.CODE_TRANS_PRE+"funscope")
    public String getFunscope() {
        return funscope;
    }

    public void setFunscope(String funscope) {
        this.funscope = funscope == null ? null : funscope.trim();
    }
    @JSONField(name=Constant.CODE_TRANS_PRE+"geotype")
    public String getGeotype() {
        return geotype;
    }

    public void setGeotype(String geotype) {
        this.geotype = geotype == null ? null : geotype.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"provcode")
    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode == null ? null : provcode.trim();
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }
    @JSONField(name= Constant.CODE_TRANS_PRE+"typelv")
    public String getTypelv() {
        return typelv;
    }

    public void setTypelv(String typelv) {
        this.typelv = typelv == null ? null : typelv.trim();
    }

    public String getOrgnameup() {
        return orgnameup;
    }

    public void setOrgnameup(String orgnameup) {
        this.orgnameup = orgnameup == null ? null : orgnameup.trim();
    }

    public String getOrgcodeup() {
        return orgcodeup;
    }

    public void setOrgcodeup(String orgcodeup) {
        this.orgcodeup = orgcodeup == null ? null : orgcodeup.trim();
    }

    public String getOrgareaname() {
        return orgareaname;
    }

    public void setOrgareaname(String orgareaname) {
        this.orgareaname = orgareaname == null ? null : orgareaname.trim();
    }

    public String getOrgpostcode() {
        return orgpostcode;
    }

    public void setOrgpostcode(String orgpostcode) {
        this.orgpostcode = orgpostcode == null ? null : orgpostcode.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getContactfax() {
        return contactfax;
    }

    public void setContactfax(String contactfax) {
        this.contactfax = contactfax == null ? null : contactfax.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail == null ? null : contactemail.trim();
    }

    public String getBodertype() {
        return bodertype;
    }

    public void setBodertype(String bodertype) {
        this.bodertype = bodertype == null ? null : bodertype.trim();
    }

    public String getHeadhas() {
        return headhas;
    }

    public void setHeadhas(String headhas) {
        this.headhas = headhas == null ? null : headhas.trim();
    }
    @JSONField(name=Constant.CODE_TRANS_PRE+"finasource")
    public String getFinasource() {
        return finasource;
    }

    public void setFinasource(String finasource) {
        this.finasource = finasource == null ? null : finasource.trim();
    }

    public String getRespperson() {
        return respperson;
    }

    public void setRespperson(String respperson) {
        this.respperson = respperson == null ? null : respperson.trim();
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public String getSubjection() {
        return subjection;
    }

    public void setSubjection(String subjection) {
        this.subjection = subjection == null ? null : subjection.trim();
    }
    @JSONField(name=Constant.CODE_TRANS_PRE+"naturetype")
    public String getNaturetype() {
        return naturetype;
    }

    public void setNaturetype(String naturetype) {
        this.naturetype = naturetype == null ? null : naturetype.trim();
    }

    public String getApprnum() {
        return apprnum;
    }

    public void setApprnum(String apprnum) {
        this.apprnum = apprnum == null ? null : apprnum.trim();
    }

    public String getPertotalnum() {
        return pertotalnum;
    }

    public void setPertotalnum(String pertotalnum) {
        this.pertotalnum = pertotalnum == null ? null : pertotalnum.trim();
    }

    public Long getPersurlv1() {
        return persurlv1;
    }

    public void setPersurlv1(Long persurlv1) {
        this.persurlv1 = persurlv1;
    }

    public Long getPersurlv2() {
        return persurlv2;
    }

    public void setPersurlv2(Long persurlv2) {
        this.persurlv2 = persurlv2;
    }

    public Long getPersurlv3() {
        return persurlv3;
    }

    public void setPersurlv3(Long persurlv3) {
        this.persurlv3 = persurlv3;
    }

    public Long getPersurocean() {
        return persurocean;
    }

    public void setPersurocean(Long persurocean) {
        this.persurocean = persurocean;
    }

    public Long getPersurdraw() {
        return persurdraw;
    }

    public void setPersurdraw(Long persurdraw) {
        this.persurdraw = persurdraw;
    }

    public Long getPersurproduct() {
        return persurproduct;
    }

    public void setPersurproduct(Long persurproduct) {
        this.persurproduct = persurproduct;
    }

    public Long getJuniordown() {
        return juniordown;
    }

    public void setJuniordown(Long juniordown) {
        this.juniordown = juniordown;
    }

    public Long getJuniorup() {
        return juniorup;
    }

    public void setJuniorup(Long juniorup) {
        this.juniorup = juniorup;
    }

    public Long getBachelorup() {
        return bachelorup;
    }

    public void setBachelorup(Long bachelorup) {
        this.bachelorup = bachelorup;
    }

    public Long getGraduateup() {
        return graduateup;
    }

    public void setGraduateup(Long graduateup) {
        this.graduateup = graduateup;
    }

    public String getOfficearea() {
        return officearea;
    }

    public void setOfficearea(String officearea) {
        this.officearea = officearea == null ? null : officearea.trim();
    }

    public Long getDevice() {
        return device;
    }

    public void setDevice(Long device) {
        this.device = device;
    }

    public Integer getCarnum() {
        return carnum;
    }

    public void setCarnum(Integer carnum) {
        this.carnum = carnum;
    }

    public Long getCompunum() {
        return compunum;
    }

    public void setCompunum(Long compunum) {
        this.compunum = compunum;
    }

    public Long getShipnum7() {
        return shipnum7;
    }

    public void setShipnum7(Long shipnum7) {
        this.shipnum7 = shipnum7;
    }

    public Long getShipnum7to12() {
        return shipnum7to12;
    }

    public void setShipnum7to12(Long shipnum7to12) {
        this.shipnum7to12 = shipnum7to12;
    }

    public Long getShipnum12to24() {
        return shipnum12to24;
    }

    public void setShipnum12to24(Long shipnum12to24) {
        this.shipnum12to24 = shipnum12to24;
    }

    public Long getShipnum24() {
        return shipnum24;
    }

    public void setShipnum24(Long shipnum24) {
        this.shipnum24 = shipnum24;
    }

    public Long getOceshipnum5() {
        return oceshipnum5;
    }

    public void setOceshipnum5(Long oceshipnum5) {
        this.oceshipnum5 = oceshipnum5;
    }

    public Long getOceshipnum5to12() {
        return oceshipnum5to12;
    }

    public void setOceshipnum5to12(Long oceshipnum5to12) {
        this.oceshipnum5to12 = oceshipnum5to12;
    }

    public Long getOceshipnum12to24() {
        return oceshipnum12to24;
    }

    public void setOceshipnum12to24(Long oceshipnum12to24) {
        this.oceshipnum12to24 = oceshipnum12to24;
    }

    public Long getOceshipnum24to45() {
        return oceshipnum24to45;
    }

    public void setOceshipnum24to45(Long oceshipnum24to45) {
        this.oceshipnum24to45 = oceshipnum24to45;
    }

    public Long getOceshipnum45() {
        return oceshipnum45;
    }

    public void setOceshipnum45(Long oceshipnum45) {
        this.oceshipnum45 = oceshipnum45;
    }

    public String getOrgscope() {
        return orgscope;
    }

    public void setOrgscope(String orgscope) {
        this.orgscope = orgscope == null ? null : orgscope.trim();
    }

    public String getCheckscope() {
        return checkscope;
    }

    public void setCheckscope(String checkscope) {
        this.checkscope = checkscope == null ? null : checkscope.trim();
    }

    public Long getOceanboatnum() {
        return oceanboatnum;
    }

    public void setOceanboatnum(Long oceanboatnum) {
        this.oceanboatnum = oceanboatnum;
    }

    public Long getEntreparenum() {
        return entreparenum;
    }

    public void setEntreparenum(Long entreparenum) {
        this.entreparenum = entreparenum;
    }

    public Long getEntproductnum() {
        return entproductnum;
    }

    public void setEntproductnum(Long entproductnum) {
        this.entproductnum = entproductnum;
    }

    public Long getEntdesinum() {
        return entdesinum;
    }

    public void setEntdesinum(Long entdesinum) {
        this.entdesinum = entdesinum;
    }

    public Long getAllboatnum() {
        return allboatnum;
    }

    public void setAllboatnum(Long allboatnum) {
        this.allboatnum = allboatnum;
    }
}