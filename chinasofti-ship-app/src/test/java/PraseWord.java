

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.chinasofti.domain.Surveyor;
import com.chinasofti.utils.StrUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.limp.framework.core.bean.TimestampTypeAdapter;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PraseWord {
    public static void main(String[] args)throws Exception{
        //{"msg":"success","result":{"data":[{"data":[{"YEAR":"2016","NUM":10,"LP_CODE_TYPENUM":1},{"YEAR":"2016","NUM":60,"LP_CODE_TYPENUM":2},{"YEAR":"2016","NUM":2,"LP_CODE_TYPENUM":3},{"YEAR":"2016","NUM":1,"LP_CODE_TYPENUM":6},{"YEAR":"2015","NUM":8,"LP_CODE_TYPENUM":1},{"YEAR":"2015","NUM":40,"LP_CODE_TYPENUM":2},{"YEAR":"2015","NUM":4,"LP_CODE_TYPENUM":3},{"YEAR":"2015","NUM":1,"LP_CODE_TYPENUM":4},{"YEAR":"2014","NUM":12,"LP_CODE_TYPENUM":1},{"YEAR":"2014","NUM":76,"LP_CODE_TYPENUM":2},{"YEAR":"2014","NUM":4,"LP_CODE_TYPENUM":3},{"YEAR":"2014","NUM":1,"LP_CODE_TYPENUM":5}],"typ":"0"},{"data":[],"typ":"1"},{"data":[],"typ":"2"}]},"code":"200"}
        Surveyor surveyor=new Surveyor();
        surveyor.setId("12345");
        surveyor.setEmail("1232131@qq.com");
        surveyor.setProvcode("110");

        String retrunJson = "";
        SerializeConfig ser = new SerializeConfig();
        ser.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd  HH:mm:ss"));
        try {
            /*
            1����ʽ��ʱ��
             2����ֹѭ��
             3��fastjson��beanת���ַ���ʱ����ĸ��Сд���⣺������bean������get�����ϼ�ע�� @JSONField(name = "RC2") public String getRC2() return RC2;
             */
            retrunJson = JSON.toJSONString(surveyor, ser, SerializerFeature.WriteNullListAsEmpty,
                    SerializerFeature.DisableCircularReferenceDetect);
        } catch (Exception e) {
        }
        System.out.println(retrunJson);
        //�ֲ�ʽ
        Map<String,String> map=new HashMap<String,String>();
        map.put("110","teshcaddddd");
        map.put("113","12345678");
        map.put("f","cs");
        String json="{lp_code_name:113,lp_code_sex:'110',hz:'900',lp_code_age:'23',lp_code_xl:\"bk\",arr:[lp_code_fm:'110',lp_code_hyzt:'f'],lp_code_test1:'d'}";

        final  String pattern= Constant.CODE_TRANS_PRE+"(.*?)[,|\\}|\\]]";//lp_code_  }����]��β

        List list=new ArrayList();
        List<Map<String,String>> listMapMath=new ArrayList<Map<String,String>>();

        List<String> groups=StrUtils.getRegGroupList(json, pattern);

        for(String group:groups){
            String codeMath=group.split(":")[1].replaceAll("\'|\"", "");
            System.out.println("codeMath:--> " + codeMath);
            if(!StrUtils.isBlank(codeMath)&&!list.contains(codeMath)){
                list.add(codeMath);
                Map<String,String> code=new HashMap<>();
                code.put("key",codeMath);
                code.put("value",StrUtils.isBlank(map.get(codeMath))?"--":map.get(codeMath));
                listMapMath.add(code);
            }
        }
        System.out.println("listMapMath:--> " + listMapMath );
        System.out.println("jsons:--> " + json );

        for(Map<String,String> mapF:listMapMath){
          String reg="(:'|:\"|:)"+mapF.get("key")+"(['|\"]{0,1})";
            String key=mapF.get("key");
//           String reg=":"+key+"|:'"+key+"'|:\""+key+"\"";
//           String reg=":'110'";
//            System.out.println(reg);
            json=json.replaceAll(reg,":"+mapF.get("value"));
        }
        System.out.println("json:--> " + json );

    }



    public static void consoleTitle(String path)throws Exception{

    }
}
