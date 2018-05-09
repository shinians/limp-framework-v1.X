package com.chinasofti.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class ImageManager extends AbstractModel implements Serializable {
    private String id;

    private String refid;

    private String name;

    private String intro;

    private String path;

    private String url;

    private String typenum;

    private Short order;

    private Short status;

    private Object idt;

    private Object udt;

    private String rc1;

    private String rc2;

    private Date rc3;

    private Date rc4;

    private Short rc5;

    private String refid2;

    private String typename;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTypenum() {
        return typenum;
    }

    public void setTypenum(String typenum) {
        this.typenum = typenum == null ? null : typenum.trim();
    }

    public Short getOrder() {
        return order;
    }

    public void setOrder(Short order) {
        this.order = order;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public String getRc1() {
        return rc1;
    }

    public void setRc1(String rc1) {
        this.rc1 = rc1 == null ? null : rc1.trim();
    }

    public String getRc2() {
        return rc2;
    }

    public void setRc2(String rc2) {
        this.rc2 = rc2 == null ? null : rc2.trim();
    }

    public Date getRc3() {
        return rc3;
    }

    public void setRc3(Date rc3) {
        this.rc3 = rc3;
    }

    public Date getRc4() {
        return rc4;
    }

    public void setRc4(Date rc4) {
        this.rc4 = rc4;
    }

    public Short getRc5() {
        return rc5;
    }

    public void setRc5(Short rc5) {
        this.rc5 = rc5;
    }

    public String getRefid2() {
        return refid2;
    }

    public void setRefid2(String refid2) {
        this.refid2 = refid2 == null ? null : refid2.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}