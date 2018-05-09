package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;
import java.util.Date;

public class Permission extends AbstractModel implements Serializable {
    private String id;

    private String name;

    private String intro;

    private Short type;

    private String typeext;

    private String fatherid;

    private String url;

    private String urltype;

    private String classname;

    private Short sort;

    private String show;

    private String imgpath;

    private Short hints;

    private String code;

    private String mathvalue;

    private String mathtype;

    private Short state;

    private String rc0;

    private String rc1;

    private String rc2;

    private String rc3;

    private String rc4;

    private String rc5;

    private Short rc6;

    private Short rc7;

    private Date rc8;

    private Date rc9;

    private Date idt;

    private Date udt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getTypeext() {
        return typeext;
    }

    public void setTypeext(String typeext) {
        this.typeext = typeext == null ? null : typeext.trim();
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid == null ? null : fatherid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrltype() {
        return urltype;
    }

    public void setUrltype(String urltype) {
        this.urltype = urltype == null ? null : urltype.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show == null ? null : show.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Short getHints() {
        return hints;
    }

    public void setHints(Short hints) {
        this.hints = hints;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getMathvalue() {
        return mathvalue;
    }

    public void setMathvalue(String mathvalue) {
        this.mathvalue = mathvalue == null ? null : mathvalue.trim();
    }

    public String getMathtype() {
        return mathtype;
    }

    public void setMathtype(String mathtype) {
        this.mathtype = mathtype == null ? null : mathtype.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getRc0() {
        return rc0;
    }

    public void setRc0(String rc0) {
        this.rc0 = rc0 == null ? null : rc0.trim();
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

    public String getRc3() {
        return rc3;
    }

    public void setRc3(String rc3) {
        this.rc3 = rc3 == null ? null : rc3.trim();
    }

    public String getRc4() {
        return rc4;
    }

    public void setRc4(String rc4) {
        this.rc4 = rc4 == null ? null : rc4.trim();
    }

    public String getRc5() {
        return rc5;
    }

    public void setRc5(String rc5) {
        this.rc5 = rc5 == null ? null : rc5.trim();
    }

    public Short getRc6() {
        return rc6;
    }

    public void setRc6(Short rc6) {
        this.rc6 = rc6;
    }

    public Short getRc7() {
        return rc7;
    }

    public void setRc7(Short rc7) {
        this.rc7 = rc7;
    }

    public Date getRc8() {
        return rc8;
    }

    public void setRc8(Date rc8) {
        this.rc8 = rc8;
    }

    public Date getRc9() {
        return rc9;
    }

    public void setRc9(Date rc9) {
        this.rc9 = rc9;
    }

    public Date getIdt() {
        return idt;
    }

    public void setIdt(Date idt) {
        this.idt = idt;
    }

    public Date getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }
}