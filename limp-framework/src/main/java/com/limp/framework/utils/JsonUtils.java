package com.limp.framework.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-6-29
 * Time: 下午11:17
 * To change this template use File | Settings | File Templates.
 */
public class JsonUtils {
    /**
     * 将map转化为json
     * @param map
     * @return
     */
    public static String toJson(HashMap<String,Object> map){
        Gson gson=new Gson();
        return gson.toJson(map);
    }


    /**
     * 字符串转换map格式
     * @param jsonStr
     * @return
     */
    public static Map convertJsonStrToMap(String jsonStr){
        Map<String, Object> map = JSON.parseObject(
                jsonStr,new TypeReference<Map<String, Object>>(){} );
        return map;
    }

    /**
     * Object 转化为Json
     * @param obj
     * @return Json字符串
     */
    public static String toJson(Object obj){
        Gson gson=new Gson();
        return gson.toJson(obj);
    }

}
