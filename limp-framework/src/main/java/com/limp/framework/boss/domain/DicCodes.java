package com.limp.framework.boss.domain;

import com.limp.framework.core.abs.AbstractModel;

import java.io.Serializable;

public class DicCodes extends AbstractModel implements  Serializable {
    private String dictCate;

    private String dictdataName;

    private String dictdataValue;

    private String dictIntro;

    private String dictStatue;

    private String dictPvalue;

    private Short dictSort;

    private String dictKey;

    private Short dictLv;

    private String dictRc1;

    private String dictRc2;

    private static final long serialVersionUID = 1L;

    public String getDictCate() {
        return dictCate;
    }

    public void setDictCate(String dictCate) {
        this.dictCate = dictCate == null ? null : dictCate.trim();
    }

    public String getDictdataName() {
        return dictdataName;
    }

    public void setDictdataName(String dictdataName) {
        this.dictdataName = dictdataName == null ? null : dictdataName.trim();
    }

    public String getDictdataValue() {
        return dictdataValue;
    }

    public void setDictdataValue(String dictdataValue) {
        this.dictdataValue = dictdataValue == null ? null : dictdataValue.trim();
    }

    public String getDictIntro() {
        return dictIntro;
    }

    public void setDictIntro(String dictIntro) {
        this.dictIntro = dictIntro == null ? null : dictIntro.trim();
    }

    public String getDictStatue() {
        return dictStatue;
    }

    public void setDictStatue(String dictStatue) {
        this.dictStatue = dictStatue == null ? null : dictStatue.trim();
    }

    public String getDictPvalue() {
        return dictPvalue;
    }

    public void setDictPvalue(String dictPvalue) {
        this.dictPvalue = dictPvalue == null ? null : dictPvalue.trim();
    }

    public Short getDictSort() {
        return dictSort;
    }

    public void setDictSort(Short dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey == null ? null : dictKey.trim();
    }

    public Short getDictLv() {
        return dictLv;
    }

    public void setDictLv(Short dictLv) {
        this.dictLv = dictLv;
    }

    public String getDictRc1() {
        return dictRc1;
    }

    public void setDictRc1(String dictRc1) {
        this.dictRc1 = dictRc1 == null ? null : dictRc1.trim();
    }

    public String getDictRc2() {
        return dictRc2;
    }

    public void setDictRc2(String dictRc2) {
        this.dictRc2 = dictRc2 == null ? null : dictRc2.trim();
    }
}