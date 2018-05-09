package com.chinasofti.sevice.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chinasofti.common.Const;
import com.chinasofti.db.AESUtil;
import com.chinasofti.db.ZipUtil;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.GetDataService;
import com.chinasofti.sevice.HbClient;
import com.chinasofti.sevice.TrainService;
import com.limp.framework.core.abs.AbstractModel;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;



@Service
public class GetDataServiceImpl implements GetDataService {
    @Resource
    private GetDataMapper getDataMapper;

    @Resource
    private ShipMapper shipMapper;

    @Resource
    private YYShipPosMapper yyShipPosMapper;

//    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private GNShipPosMapper gnShipPosMapper;

    @Resource
    private ShipInsuranceMapper shipInsuranceMapper;

    @Resource
    private ShipClaimMapper shipClaimMapper;

    public String findByNamePwd() throws IOException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String pwd = "yycbjy2017@";
        String pwdmd5 = MD5 (MD5(pwd+"@/)cttic")+sdf.format(new Date()));
        String url = "http://data.vmschina.com/api/shipInfo/1?name=yycbjy&pwd="+pwdmd5;
        Map map = this.restTemplate.getForObject(url,Map.class);
        Object obj = map.get("data");
        String data = "";
        if(obj!=null){
            String exData = obj.toString();
            //解密
            String zipdata = AESUtil.decryptStr(exData,MD5(pwd+"@/)cttic"));
            //解压
            data = ZipUtil.uncompress(zipdata);
        }
        return data;
    }

    public String findByShipName(String shipNames) throws IOException {
        String data = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String pwd = "yycbjy2017@";
        String pwdmd5 = MD5 (MD5(pwd+"@/)cttic")+sdf.format(new Date()));
        String url = "http://data.vmschina.com/api/shipInfo/2?name=yycbjy&pwd="+pwdmd5+"&shipName="+shipNames;
        Map map = this.restTemplate.getForObject(url,Map.class);
        Object obj = map.get("data");
        if(obj!=null){
            String exData = obj.toString();
            //解密
            String zipdata = AESUtil.decryptStr(exData,MD5(pwd+"@/)cttic"));
            //解压
            data = ZipUtil.uncompress(zipdata);
        }
        return data;
    }

    public String findPositon(String shipNames) throws IOException {
        String data = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String pwd = "yycbjy2017@";
        String pwdmd5 = MD5 (MD5(pwd+"@/)cttic")+sdf.format(new Date()));
        Map variables = new HashMap();
        String url = "http://data.vmschina.com/api/shipInfo/3?name=yycbjy&pwd="+pwdmd5+"&shipName="+shipNames;
        Map map = this.restTemplate.getForObject(url,Map.class);
        System.out.println(map);
        Object obj = map.get("data");
        if(obj!=null){
            String exData = obj.toString();
            //解密
            String zipdata = AESUtil.decryptStr(exData,MD5(pwd+"@/)cttic"));
            //解压缩
            data = ZipUtil.uncompress(zipdata);
        }
        return data;
    }

    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void getYYShipData() throws IOException {
//        String shipPos = this.findPositon("平太荣9");
//        shipPos=new String(shipPos.getBytes("ISO-8859-1"),"UTF-8");
//        System.out.println("shipPos---->"+shipPos);
        String nameData = this.findByNamePwd();
        JSONArray jsonArray = JSON.parseArray(nameData);
        System.out.println("------------size:_______________" + jsonArray.size());
        List<YYShipPos> posList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String shipName = new String(jsonObject.getString("shipName").getBytes("ISO-8859-1"),"UTF-8");
            String shipInfo = this.findByShipName(shipName);
            shipInfo=new String(shipInfo.getBytes("ISO-8859-1"),"UTF-8");
            String shipPos = this.findPositon(shipName);
            shipPos=new String(shipPos.getBytes("ISO-8859-1"),"UTF-8");
            JSONArray infoArr = JSON.parseArray(shipInfo);
            JSONArray posArr = JSON.parseArray(shipPos);
            if (infoArr.size()>0&&posArr.size()>0){
                JSONObject posObj = posArr.getJSONObject(0);
                JSONObject infoObj = infoArr.getJSONObject(0);

                YYShipPos yyShipPos = new YYShipPos();
                yyShipPos.setPostime(posObj.getString("posTime"));
                yyShipPos.setLon(posObj.getString("lon"));
                yyShipPos.setLat(posObj.getString("lat"));
                yyShipPos.setDirection(posObj.getString("direction"));
                yyShipPos.setSpeed(posObj.getString("speed"));
                yyShipPos.setShipport(infoObj.getString("regPort"));
                yyShipPos.setShipname(infoObj.getString("shipName"));
                yyShipPos.setShipno(infoObj.getString("shipCode"));
                posList.add(yyShipPos);
            }
        }
        yyShipPosMapper.batchInsert(posList);

    }

    @Override
    public void getGNShipData_gd() {
        MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();
        RestTemplate restTemplate = new RestTemplate();
        requestEntity.add("userName","chuanjian" );
        requestEntity.add("password","chuanjiandatapush" );
        String resultStr = restTemplate.postForObject("http://183.232.34.41:8017/GDYYDSS/rest/dataShareService/login", requestEntity, String.class);
        Map resultMap = JsonUtils.convertJsonStrToMap(resultStr);
        String state = (String) resultMap.get("state");
        String token = (String) resultMap.get("token");
        requestEntity.clear();
        requestEntity.add("token",token);
        requestEntity.add("query","all");
        requestEntity.add("online","true");
        resultStr = restTemplate.postForObject("http://183.232.34.41:8017/GDYYDSS/rest/dataShareService/queryShipInfoUnified", requestEntity, String.class);
        resultMap = JsonUtils.convertJsonStrToMap(resultStr);
        JSONArray dataArr = (JSONArray) resultMap.get("data");//1526

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        if (dataArr != null) {
            List<GNShipPos> posList = new ArrayList();
            for (int i=0;i< dataArr.size();i++) {
                JSONObject obj = (JSONObject) dataArr.get(i);
                String shipCode = obj.getString("shipCode");
                Date posTime = new Date(Long.parseLong(obj.getString("timeStamp")));

                //查询渔船是否已纯在
                if (shipCode!=null){
//                    ShipExample shipExample = new ShipExample();
//                    ShipExample.Criteria criteria = shipExample.createCriteria();
//                    criteria.andShipcodeEqualTo(shipCode);
//                    List<Ship> ships = shipMapper.selectByExample(shipExample);
//                        Ship ship = new Ship();
//                        ship.setShipcode(shipCode);
//                        ship.setShipname(obj.getString("shipName"));
//                        ship.setShiptype(obj.getString("shipType"));
                    //
//                        ship.setOwnername(obj.getString("shipOwner"));
//                        ship.setOwnertel(obj.getString("mobilePhone"));
//                        ship.setPostime(sdf.format(posTime));
//                        try {
//                            shipMapper.insertSelective(ship);
//                        }catch (Exception e){
//                            e.printStackTrace();
//                            shipMapper.insertSelective(ship);
//                        }
                }
                //渔船位置信息
                GNShipPos gnShipPos = new GNShipPos();
                gnShipPos.setShipno(shipCode);
                gnShipPos.setShipname(obj.getString("shipName"));
                gnShipPos.setTerminalType(obj.getString("terminalType"));
                gnShipPos.setCommType(obj.getString("terminalID"));
                gnShipPos.setSpeed(obj.getString("speed"));
                gnShipPos.setLon(obj.getString("longitude"));
                gnShipPos.setLat(obj.getString("latitude"));
                gnShipPos.setPostime(sdf.format(posTime));
                gnShipPos.setDirection(obj.getString("course"));
                gnShipPos.setIdt(sdf.format(new Date(System.currentTimeMillis())));

                posList.add(gnShipPos);

            }
            gnShipPosMapper.insertGNShipPosList(posList);
        }

    }

    //对接互保数据
    @Override
    public void saveInsuranceAndClaim() throws Exception {
        Pager pager = new Pager();
        List<Ship> ships = new ArrayList<>();
        HbClient hbClient = new HbClient();
        ShipExample example = new ShipExample();
        ShipExample.Criteria criteria = example.createCriteria();
        int shipNums = shipMapper.countByExample(example);
        for(int i=1;(i-1)*100<shipNums;i++){
            pager.setPage(i);
            pager.setRows(100);
            example.setPage(pager);
            //分页获取渔船数据
            System.out.println("==================ships"+i+"循环b====================");
            long b = System.currentTimeMillis();
            ships = shipMapper.selectByExample(example);
            List<ShipClaim> claimList = new ArrayList<>();
            List<ShipInsurance> policyList = new ArrayList<>();
//            int count=0;
            for (Ship ship:ships){
                String shipname = ship.getShipname();
                if (!StrUtils.isBlank(shipname)){
//                    System.out.println(++count);
                    //根据渔船名字获取互保数据
                    List<ShipClaim> claims = hbClient.getShipClaimAppByShipName(shipname);
                    List<ShipInsurance> policies = hbClient.getShipPoliycAppByShipName(shipname);
                    if (claims.size()>0) {
                        claimList.addAll(claims);
//                        //存在理赔信息
//                        ShipClaimExample claimExample = new ShipClaimExample();
//                        ShipClaimExample.Criteria claimCriteria;
//                        //查询本系统是否已经存在该理赔信息,如果不存在,则插入到数据库
//                        for (ShipClaim claim :
//                                claims) {
//                            claimCriteria = claimExample.createCriteria();
//                            claimCriteria.andCclmnoEqualTo(claim.getCclmno());
//                            List<ShipClaim> claimResults = shipClaimMapper.selectByExample(claimExample);
//                            if (claimResults.size()==0) {
//                                claimList.add(claim);
//                            }
//                            claimExample.clear();
//                        }
                    }

                    if (policies.size()>0) {//存在保单信息
                        policyList.addAll(policies);
                        /*ShipInsuranceExample policyExample = new ShipInsuranceExample();
                        ShipInsuranceExample.Criteria policyCriteria ;
                        for (ShipInsurance policy :
                                policies) {
                            policyCriteria = policyExample.createCriteria();
                            policyCriteria.andPolicynumEqualTo(policy.getPolicynum());
                            List<ShipInsurance> policyResults = shipInsuranceMapper.selectByExample(policyExample);
                            if (policyResults.size()==0) {
                                policyList.add(policy);
                            }else {
                                //todo:如果存在是否需要更新记录?
                            }
                            policyExample.clear();
                        }*/
                    }
                }
            }
            if (claimList.size()>0) {
                shipClaimMapper.batchInsert(claimList);
            }
            if (policyList.size()>0) {
                shipInsuranceMapper.batchInsert(policyList);
            }
            System.out.println("==================ships循环e>>>>>>>>>>>用时"+(System.currentTimeMillis()-b)/1000+"秒=================");
            example.clear();
        }
    }

    @Override
    public void saveShipInsurance(ShipInsurance shipInsurance) {
        shipInsurance.setShipCode(getShipCodeByShipNameOrNo(shipInsurance.getShipName(), shipInsurance.getPolicynum()));
        shipInsuranceMapper.insertSelective(shipInsurance);
    }

    @Override
    public void saveShipClaim(ShipClaim shipClaim) {
        shipClaim.setShipCode(getShipCodeByShipNameOrNo(shipClaim.getShipName(), shipClaim.getCclmno()));
        shipClaimMapper.insertSelective(shipClaim);
    }

    @Override
    public String getShipCodeByShipNameOrNo(String shipName, String no) {
        String shipCode = "";
        shipCode = gnShipPosMapper.getCodeByName(shipName);
        shipCode = StrUtils.isBlank(shipCode) ? "YC-" + no : shipCode;
        //System.out.println("渔船名称为：“" + shipName + "”的渔船编号为：“" + shipCode + "”。");
        return shipCode;
    }

    @Override
    public Map<String, String> getShipMap() {
        Map<String, String> map = new HashMap<String, String>();
        List<Map<String, String>> mapList = gnShipPosMapper.getShipMapList();
        for (Map<String, String> m : mapList) {
            //渔船编码
            map.put(m.get("VALUE") + "c", m.get("CODE"));
            //渔船名称
            map.put(m.get("VALUE") + "n", m.get("NAME"));
        }
        return map;
    }

    @Override
    public int saveGNShipPosList(List<GNShipPos> gnShipPosList) {
        return gnShipPosMapper.insertGNShipPosList(gnShipPosList);
    }

}
