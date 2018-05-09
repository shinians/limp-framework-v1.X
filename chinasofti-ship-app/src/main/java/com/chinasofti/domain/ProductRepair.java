package com.chinasofti.domain;

import java.io.Serializable;

public class ProductRepair implements Serializable {
    private String id;

    private String entid;

    private String entname;

    private String enttype;

    private String protype;

    private String prono;

    private String promodelno;

    private String certno;

    private String quetype;

    private String queincpr;

    private String checktime;

    private String checktimenext;

    private String checktaddr;

    private String proname;

    private String checkuser;

    private String checkresult;

    private String entbuild;

    private String shipcode;

    private String shipname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getEnttype() {
        return enttype;
    }

    public void setEnttype(String enttype) {
        this.enttype = enttype == null ? null : enttype.trim();
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype == null ? null : protype.trim();
    }

    public String getProno() {
        return prono;
    }

    public void setProno(String prono) {
        this.prono = prono == null ? null : prono.trim();
    }

    public String getPromodelno() {
        return promodelno;
    }

    public void setPromodelno(String promodelno) {
        this.promodelno = promodelno == null ? null : promodelno.trim();
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno == null ? null : certno.trim();
    }

    public String getQuetype() {
        return quetype;
    }

    public void setQuetype(String quetype) {
        this.quetype = quetype == null ? null : quetype.trim();
    }

    public String getQueincpr() {
        return queincpr;
    }

    public void setQueincpr(String queincpr) {
        this.queincpr = queincpr == null ? null : queincpr.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getChecktimenext() {
        return checktimenext;
    }

    public void setChecktimenext(String checktimenext) {
        this.checktimenext = checktimenext == null ? null : checktimenext.trim();
    }

    public String getChecktaddr() {
        return checktaddr;
    }

    public void setChecktaddr(String checktaddr) {
        this.checktaddr = checktaddr == null ? null : checktaddr.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getCheckuser() {
        return checkuser;
    }

    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public String getEntbuild() {
        return entbuild;
    }

    public void setEntbuild(String entbuild) {
        this.entbuild = entbuild == null ? null : entbuild.trim();
    }

    public String getShipcode() {
        return shipcode;
    }

    public void setShipcode(String shipcode) {
        this.shipcode = shipcode == null ? null : shipcode.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }
}