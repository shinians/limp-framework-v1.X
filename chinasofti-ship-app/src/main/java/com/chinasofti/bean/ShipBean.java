
package com.chinasofti.bean;

import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.core.Constants;

/**
 * 采用bean的方式查询
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-8-5
 * Time: 下午8:21
 * To change this template use File | Settings | File Templates.
 */
public class ShipBean {
    @Field
    private  String ID;
    @Field
    private  String NAME;
    @Field
    private  String ADDR;
    @Field
    private  String PROVNAME;
    @Field
    private  String TYPE;
    @Field
    private  String TYPEEXT;
    @Field
    private  Long POINT;
    @Field
    private  String REFNAME;
    @Field
    private  String RC1;
    @Field
    private  String RC2;
    @Field
    private  String RC3;
    @Field
    private  Object SHIP_KEY;

    public String getID() {
        //如果type类型是验船师类型，则身份号需要加密
       /* if (Constant.STRING_2.equals(TYPE)) {
            if (!StrUtils.isBlank(ID) && ID.length() > 6) {
                return ID.substring(ID.length() - 6, ID.length()) + "***";
            }
        }*/
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
}
