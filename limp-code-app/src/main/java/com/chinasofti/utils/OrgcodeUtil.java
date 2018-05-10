package com.chinasofti.utils;

import com.chinasofti.common.Const;

/**
 * Created by icss on 2017/12/17.
 */
public class OrgcodeUtil {
    public static String getLikeStr(String orgcode){
        String likeStr = null;
        if (orgcode != null&&!Const.MINISTRY_CODE.equals(orgcode)) {//检验机构代码0000000为部级用户,通过前2位区分省,前四位区分市
            likeStr = orgcode.substring(0,2)+"%";
        }
        return likeStr;
    }
}
