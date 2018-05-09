package com.chinasofti.sevice.impl;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.BiManageMapper;
import com.chinasofti.mapper.oracle.ThemYcsJBXXMapper;
import com.chinasofti.sevice.BiManageService;
import com.chinasofti.utils.DateUtils;
import com.chinasofti.utils.OrgcodeUtil;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.apache.solr.common.util.Hash;
import org.springframework.stereotype.Service;
import com.chinasofti.mapper.oracle.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-1
 * Time: 下午7:18
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BiManageServiceImpl implements BiManageService {
    private static Logger log= Logger.getLogger(BiManageServiceImpl.class);

    //验船师基本信息mapper
    @Resource
    private ThemYcsJBXXMapper themYcsJBXXMapper;

    @Resource
    private DrawInfoMapper drawInfoMapper;

    @Resource
    private DrawCheckMapper drawCheckMapper;

    //BI管理mapper
    @Resource
    private BiManageMapper biManageMapper;

    @Resource
    private EntInfoMapper entInfoMapper;
    @Resource
    private ProductCheckMapper productCheckMapper;
    @Resource
    private EntProHistoryMapper entProHistoryMapper;
    @Resource
    private ProductsRecordMapper productsRecordMapper;
    @Resource
    private ProductRepairMapper productRepairMapper;
    @Resource
    private OrganInfoMapper organInfoMapper;
    @Resource
    private ShipMapper shipMapper;
    @Resource
    private ShipCheckMapper shipCheckMapper;
    @Resource
    private CapacityMapper capacityMapper;

    @Resource
    private SurveyorMapper surveyorMapper;

    @Resource
    private  OrgCertificateMapper orgCertificateMapper;
    @Resource
    private ThemEntJbxxMapper themEntJbxxMapper;
    @Resource
    private DrawProcMapper drawProcMapper;
    @Resource
    private ThemDrawJbxxMapper themDrawJbxxMapper;

    @Resource
    private BIThemMapper biThemMapper;

    @Resource
    private ThemProductJbxxMapper themProductJbxxMapper;
    @Resource
    private ThemProductYwhzMapper themProductYwhzMapper;

    @Override
    public boolean save(BiManage entry) {
        if (StrUtils.isBlank(entry.getId())) {
            entry.setId(StrUtils.randomUUID());
        }
        return   biManageMapper.insertSelective(entry) == 1 ? true : false;
    }

    @Override
    public BiManage get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(BiManage entry) {
        BiManageExample biManageExample=new BiManageExample();
        biManageExample.createCriteria().andIdEqualTo(entry.getId());
        entry.setUdt(new Date());
        return  biManageMapper.updateByExampleSelective(entry,biManageExample)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<BiManage> getList() {
        BiManageExample biManageExample=new BiManageExample();
        biManageExample.createCriteria().andStateEqualTo(new Short(Constant.STRING_1));
        return biManageMapper.selectByExample(biManageExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, String>> getYcsNumGroupByYear(ThemYcsJBXX themYcsJBXX) {
        return themYcsJBXXMapper.getYcsNumGroupByYear(themYcsJBXX);
    }

    @Override
    public List<Map<String, String>> getYcsXLGroupIndex(ThemYcsJBXX themYcsJBXX) {
        return themYcsJBXXMapper.getYcsXLGroupIndex(themYcsJBXX); //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, String>> getYcsCateIndex(ThemYcsJBXX themYcsJBXX) {
        return themYcsJBXXMapper.getYcsCateIndex(themYcsJBXX);  //To change body of implemented methods use File | Settings | File Templates.
    }

    //法律法规bi---------------------------------start-------------------------------
    //法律法规bi，获取数据
    @Override
    public Map<String, Object> getLayBiData() {
        Map<String,Object> map = new HashMap<>();
        //颁布法规数量
        int lawCount = 0;
        map.put("lawCount", lawCount);
        //动态法规库使用频次
        String lawUseCount = "0";
        map.put("lawUseCount", lawUseCount);
        //法规宣贯期数
        int lawPeriods = 0;
        map.put("lawPeriods", lawPeriods);
        //全国渔船
        int safeScore = 0;
        map.put("safeScore", safeScore);
        //------图标的数据应该调用其他方法生成----
        //1-1
        Map<String,Object> map1 = new HashMap<>();
        map.put("chart1-1",map1);
        //1-2
        Map<String, Object> map2 = new HashMap<>();
        map.put("chart1-2", map2);
        //2-1
        Map<String, Object> map3 = new HashMap<>();
        map.put("chart2-1", map3);
        //2-2
        Map<String, Object> map4 = new HashMap<>();
        map.put("chart2-2", map4);
        //2-3
        Map<String, Object> map5 = new HashMap<>();
        map.put("chart2-3", map5);
        //2-4
        Map<String, Object> map6 = new HashMap<>();
        map.put("chart2-4", map6);

        return map;
    }

    //---------------------------end--------------------------------------------


    //产品检验bi↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //产品检验bi：获取数据
    @Override
    public Map<String, Object> getProCheckData(String uid) {
        Map<String,Object> map = new HashMap<>();
        //产品制造企业认可数量
        int cpzzCount = getCpzzCount(uid);
        map.put("cpzzCount",cpzzCount);
        //维修机构认可的厂
        int repairCount = getRepairCount(uid);
        map.put("repairCount",repairCount);
        //监督抽查合格率
        Map<String, Object> checkPercent = getCheckPercent(uid);
        map.put("checkPercent",checkPercent);
        //产品检验数量
        Map<String,Object> checkCount = getCheckCount(uid);
        map.put("checkCount",checkCount);
        return map;
    }
    //图形1：产品制造企业认可数量分析图
    @Override
    public Map<String, Object> echatsCpzzData(String startYear,String endYear,String uid,String flag) {
        Map<String,Object> map = new HashMap<>();
        List<Integer> countList = new ArrayList<>();
        List<String> yearList = getYearList(startYear, endYear);
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        for (int i = 0; i < yearList.size(); i++) {
//            int cpzzCountByYear = entProHistoryMapper.getCpzzCountByYear("1",yearList.get(i) + "-12-31",like);
//            if(flag!=null && flag.equalsIgnoreCase("all")){
//                //全部的
//                int num = themProductYwhzMapper.countNum("1",like,yearList.get(i) + "-12-31");
//            }else {
//                //有效的
            int num = themProductYwhzMapper.countNum("1",like,yearList.get(i)+"%");
//            }
            countList.add(num);
        }
        map.put("xAxis",yearList);
        map.put("data",countList);
        return map;
    }
    //图形2：产品检测检修机构认可数量分析图
    @Override
    public Map<String, Object> echatsCheckCountData(String year,String uid) {
        System.out.println("拿到的年份："+year);
        Map<String,Object> map = new HashMap<>();
        year = DateUtils.generateCurrentDateStr();
        System.out.println("当前日期："+year);

        Calendar calendar = Calendar.getInstance();
        int iC = calendar.get(Calendar.YEAR);
        String curYear= String.valueOf(iC);
        map.put("year",curYear);

        List<Map<String,Object>> list = new ArrayList<>();
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        //筏站
        Map<String,Object> map1 =  new HashMap<>();
        int roftCount = entProHistoryMapper.getCpzzCountByYear("5", year,like);
        map1.put("name","气胀式救生筏检修站");
        map1.put("value",roftCount);
        list.add(map1);
        //gmdss
        Map<String,Object> map2 = new HashMap<>();
        int gmdssCount = entProHistoryMapper.getCpzzCountByYear("6", year,like);
        map2.put("name","GMDSS设备维修机构");
        map2.put("value",gmdssCount);
        list.add(map2);
        //检测机构
        Map<String,Object> map3 = new HashMap<>();
        int checkOrgCount = entProHistoryMapper.getCpzzCountByYear("7", year,like);
        map3.put("name","船用产品检测机构");
        map3.put("value",checkOrgCount);
        list.add(map3);

        //查询全部企业
        Map<String,Object> map4 = new HashMap<>();
        int allRoftCount = entProHistoryMapper.getCpzzCountByYear("5", null,like);
        map4.put("allOrgFlag","1");
        map4.put("name","气胀式救生筏检修站");
        map4.put("value",allRoftCount);
        list.add(map4);

        //查询全部企业
        Map<String,Object> map5 = new HashMap<>();
        int allGmdssCount = entProHistoryMapper.getCpzzCountByYear("6", null,like);
        map5.put("allOrgFlag","1");
        map5.put("name","GMDSS设备维修机构");
        map5.put("value",allGmdssCount);
        list.add(map5);

        //查询全部企业
        Map<String,Object> map6 = new HashMap<>();
        int allCheckOrgCount = entProHistoryMapper.getCpzzCountByYear("7", null,like);
        map6.put("allOrgFlag","1");
        map6.put("name","船用产品检测机构");
        map6.put("value",allCheckOrgCount);
        list.add(map6);

        map.put("data",list);
        return map;
    }

    //图形3：产品设备类检验数量分析图
    @Override
    public Map<String, Object> echatsCheckData(String startYear,String endYear,String uid) {
        Map<String,Object> objectMap = new HashMap<>();
        List<Map<String,Object>> objectList = new ArrayList<>();

        //全部产品
        List<String> yearList = getYearList(startYear, endYear);
        List<Integer> countList = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        for (int i = 0; i <yearList.size() ; i++)
        {
            String checkTime = yearList.get(i)+"%";
            String ejfl = null;
            List<String> checkType = new ArrayList<>();
            checkType.add("1");
            checkType.add("2");
            checkType.add("3");
            checkType.add("4");
            String orgType = uid;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                orgType = uid.substring(0,2)+"%";
            }
            int count = productCheckMapper.getCountByExas(ejfl,checkType,orgType,checkTime);
            //update by zxj 2017年12月17日18:27:16
            ThemProductJbxxExample themProductJbxxExample = new ThemProductJbxxExample();
            ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
            String year = yearList.get(i)+"%";
            criteria.andYearLike(year);
            String like = null;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                like = uid.substring(0,2)+"%";
            }
            if(like != null){
                criteria.andOrgcodeLike(like);
            }
            List<String> list = new ArrayList<>();
            list.add("救生筏");
            list.add("柴油机");

            criteria.andNameIn(list);
            int count1 = themProductJbxxMapper.countByExample(themProductJbxxExample);
            countList.add(count1);
        }
        map.put("typ","0");
        map.put("xAxis",yearList);
        map.put("data",countList);
        objectList.add(map);

        //柴油机
        Map<String,Object> map1 = new HashMap<>();
        List<Integer> countList1 = new ArrayList<>();
        for (int i = 0; i <yearList.size() ; i++)
        {
            String checkTime = yearList.get(i)+"%";
            String ejfl = "CP10_24";
            List<String> checkType = new ArrayList<>();
            checkType.add("1");
            checkType.add("2");
            checkType.add("3");
            checkType.add("4");
            String orgType = uid;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                orgType = uid.substring(0,2)+"%";
            }
            int count = productCheckMapper.getCountByExas(ejfl,checkType,orgType,checkTime);
            //update by zxj 2017年12月17日18:27:16
            ThemProductJbxxExample themProductJbxxExample = new ThemProductJbxxExample();
            ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
            String year = yearList.get(i)+"%";
            criteria.andYearLike(year);
            String like = null;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                like = uid.substring(0,2)+"%";
            }
            if(like != null){
                criteria.andOrgcodeLike(like);
            }
            List<String> list = new ArrayList<>();
//            list.add("救生筏");
            list.add("柴油机");

            criteria.andNameIn(list);
            int count1 = themProductJbxxMapper.countByExample(themProductJbxxExample);
            countList1.add(count1);
        }
        map1.put("typ","1");
        map1.put("xAxis",yearList);
        map1.put("data",countList1);
        objectList.add(map1);

        //救生筏
        Map<String,Object> map2 = new HashMap<>();
        List<Integer> countList2 = new ArrayList<>();
        for (int i = 0; i <yearList.size() ; i++)
        {
            String checkTime = yearList.get(i)+"%";
            String ejfl = "CP10_66";
            List<String> checkType = new ArrayList<>();
            checkType.add("1");
            checkType.add("2");
            checkType.add("3");
            checkType.add("4");
            String orgType = uid;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                orgType = uid.substring(0,2)+"%";
            }
            int count = productCheckMapper.getCountByExas(ejfl,checkType,orgType,checkTime);

            //update by zxj 2017年12月17日18:27:16
            ThemProductJbxxExample themProductJbxxExample = new ThemProductJbxxExample();
            ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
            String year = yearList.get(i)+"%";
            criteria.andYearLike(year);
            String like = null;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                like = uid.substring(0,2)+"%";
            }
            if(like != null){
                criteria.andOrgcodeLike(like);
            }
            List<String> list = new ArrayList<>();
            list.add("救生筏");
//            list.add("柴油机");

            criteria.andNameIn(list);
            int count1 = themProductJbxxMapper.countByExample(themProductJbxxExample);
            countList2.add(count1);
        }
        map2.put("typ","2");
        map2.put("xAxis",yearList);
        map2.put("data",countList2);
        objectList.add(map2);

        //GMDSS设备
        Map<String,Object> map3 = new HashMap<>();
        List<Integer> countList3 = new ArrayList<>();
        for (int i = 0; i <yearList.size() ; i++)
        {
            String checkTime = yearList.get(i)+"%";
            String ejfl = "CP10_66";
            List<String> checkType = new ArrayList<>();
            checkType.add("1");
            checkType.add("2");
            checkType.add("3");
            checkType.add("4");
            String orgType = uid;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                orgType = uid.substring(0,2)+"%";
            }
            int count = productCheckMapper.getCountByExas(ejfl,checkType,orgType,checkTime);
            countList3.add(count);
        }
        map3.put("typ","3");
        map3.put("xAxis",yearList);
        map3.put("data",countList3);
        objectList.add(map3);

        objectMap.put("data",objectList);
        return objectMap;
    }
    //图形4：产品设备类维修数量分析图
    @Override
    public Map<String, Object> echatsRepairData(String type,String startYear,String endYear,String uid) {
        Map<String,Object> map = new HashMap<>();

        List<String> yearList = getYearList(startYear, endYear);
        map.put("xAxis",yearList);
        List<Integer> list = new ArrayList<>();
        if(StrUtils.isBlank(type)){
            type="1";
        }
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }

        for (int i = 0; i <yearList.size() ; i++) {
            int echartsCount = productRepairMapper.getEchartsCount(type, yearList.get(i) + "%",like);
            list.add(echartsCount);
        }
        map.put("data",list);

        return map;
    }
    //图形5：产品质量监督抽查合格率分析图
    @Override
    public Map<String, Object> echatsCheckPersentData(String startYear,String endYear,String uid) {
        Map<String,Object> map = new HashMap<>();
        List<String> yearList = getYearList(startYear, endYear);
        List<Integer> gmdssList = new ArrayList<>();
        List<Integer> roftList = new ArrayList<>();
        List<Integer> checkList = new ArrayList<>();
        List<Object> dataList = new ArrayList<>();
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        for (int i = 0; i < yearList.size(); i++) {

            //各种代码需要重新确定
            int gmdss = getPercentByTypeAndYear("5", yearList.get(i),like);
            gmdssList.add(gmdss);
            int roft = getPercentByTypeAndYear("救生筏", yearList.get(i),like);
            roftList.add(roft);
            int check = getPercentByTypeAndYear("7", yearList.get(i),like);
            checkList.add(check);
        }
        map.put("xAxis",yearList);
        dataList.add(gmdssList);
        dataList.add(roftList);
        dataList.add(checkList);
        map.put("data",dataList);
        return map;
    }
    //产品检验bi图形6：救生筏海难救助情况统计
    @Override
    public Map<String, Object> echatsHelpData(String startYear,String endYear) {
        Map<String,Object> map = new HashMap<>();
        List<String> yearList = getYearList(startYear, endYear);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Object> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <yearList.size() ; i++) {
            list1.add(random.nextInt(30));
            list2.add(random.nextInt(30));
        }
        list.add(list1);
        list.add(list2);
        map.put("xAxis",yearList);
        map.put("data",list);

        return map;
    }

    //图表5补充方法
    public int getPercentByTypeAndYear(String type,String year,String like){
//        ProductCheckExample productCheckExample = new ProductCheckExample();
//        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        ThemProductJbxxExample themProductJbxxExample =new ThemProductJbxxExample();
        ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
//        criteria.andChecktypeEqualTo("");
        criteria.andProducttypeEqualTo(type);
        criteria.andYearLike(year+"%");
        if(like !=null){
            criteria.andOrgcodeLike(like);
        }
        int count = themProductJbxxMapper.countByExample(themProductJbxxExample);
        criteria.andAvgrateEqualTo("1");
        int yes = themProductJbxxMapper.countByExample(themProductJbxxExample);
        int percent = 100;
        if(count!= 0){
            percent = yes / count;
        }
        return percent;
    }

    //产品检验bi：制造企业认可数量
    public int getCpzzCount(String uid){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = simpleDateFormat.format(new Date());
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        int cpzzCount = entInfoMapper.getCpzzCount(nowDate,like);
        return cpzzCount;
    }
    //产品检验bi：制造企业认可数量
    public int getRepairCount(String uid){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = simpleDateFormat.format(new Date());
        System.out.println("现在的时间" + nowDate);
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        int repairCount = entInfoMapper.getRepairCount(nowDate,like);
        return repairCount;
    }
    //船用产品监督抽查合格率
    public Map<String,Object> getCheckPercent(String uid){
        Map<String,Object> map = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.YEAR);
        int year = i -1;
        log.debug("应该查询的年数："+year);
//        ProductCheckExample productCheckExample = new ProductCheckExample();
//        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        ThemProductJbxxExample themProductJbxxExample = new ThemProductJbxxExample();
        ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        criteria.andYearLike(year+"%");
        //监督抽查的代码
//        criteria.andChecktypeEqualTo("1");
        if(like != null){
            criteria.andOrgcodeLike(like);
        }
        int all = themProductJbxxMapper.countByExample(themProductJbxxExample);
        criteria.andAvgrateEqualTo("1");
        int yes = themProductJbxxMapper.countByExample(themProductJbxxExample);
        int percent = 95;
        if(all!=0){
            percent = yes*100 / all;
        }
        map.put("year",year);
        map.put("checkPercent",percent);
        return map;
    }
    //设备类检验数量
    public Map<String,Object> getCheckCount(String uid){
        Map<String,Object> map = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.YEAR);
        int year = i -1;
        log.debug("应该查询的年数："+year);
//        ProductCheckExample productsCheckExample = new ProductCheckExample();
//        ProductCheckExample.Criteria criteria = productsCheckExample.createCriteria();
        ThemProductJbxxExample themProductJbxxExample =new ThemProductJbxxExample();
        ThemProductJbxxExample.Criteria criteria = themProductJbxxExample.createCriteria();
        String like = null;
        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            like = uid.substring(0,2)+"%";
        }
        if(like != null){
            criteria.andOrgcodeLike(like);
        }
        criteria.andYearLike(year+"%");
        criteria.andShipchecktypeIsNotNull();

        //区分设备类
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        criteria.andChecktypeIn(list);
//        criteria.andCate1EqualTo("");

        int checkCount = themProductJbxxMapper.countByExample(themProductJbxxExample);
        map.put("year",year);
        map.put("checkCount",checkCount);
        return map;
    }
    //拿到开始结束之间年数的集合
    public List<String> getYearList(String startYear,String endYear){
        List<String> list = new ArrayList<>();
        if(StrUtils.isBlank(startYear)||StrUtils.isBlank(endYear)){
            Calendar calendar = Calendar.getInstance();
            int iC = calendar.get(Calendar.YEAR);
            int jC = iC - 4;
            endYear= String.valueOf(iC);
            startYear= String.valueOf(jC);
        }
        System.out.println("startyear:"+startYear+"endyear:"+endYear);
        int i = Integer.parseInt(startYear);
        int j = Integer.parseInt(endYear);
        while (i <= j) {
            list.add(String.valueOf(i));
            i++;
        }
        return list;
    }

    //产品检验专题↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    //-------------------------------技术发展处专题------------------------------------------
    //获取图纸审查套数
    @Override
    public int countDrawsByYear(String lastYear) {
        int drawNums = 0;
        if (StrUtils.isBlank(lastYear)) {
            drawNums = this.drawInfoMapper.countByApprTimeYear(lastYear);
        }
        return drawNums;
    }

    //全国单位数量
    @Override
    public int countEntNumsByEntcate(String entcate) {
        Short zt = 1;
        EntInfoExample example = new EntInfoExample();
        EntInfoExample.Criteria criteria = example.createCriteria();
        criteria.andEntcateEqualTo(entcate);
        criteria.andZtEqualTo(zt);
        return entInfoMapper.countByExample(example);
    }

    //国内海洋渔船标准化程度平均分
    @Override
    public float getStandardScore(String type, String model) {
        float score = 0F;
        if (!StrUtils.isBlank(type)&&!StrUtils.isBlank(model)){
            score = this.capacityMapper.getStandardScore(type,model);
        }
        return 0;
    }

    //图纸审查数量分析图数据
    @Override
    public Map getDrawNumsGroupYear(String bYear, String eYear) {
        int beginYear ;
        int endYear ;
        if (StrUtils.isBlank(bYear)) {
            beginYear = Calendar.getInstance().get(Calendar.YEAR)-5;
        }else {
            beginYear = Integer.parseInt(bYear);
        }
        if (StrUtils.isBlank(eYear)) {
            endYear = Calendar.getInstance().get(Calendar.YEAR)-1;
        }else{
            endYear = Integer.parseInt(eYear);
        }
        List<Map<String,String>> domesticOcean = drawInfoMapper.countDrawsGroupYear(beginYear,endYear,Const.DOMESTIC_OCEAN_STR);
        List<Map<String,String>> ocean = drawInfoMapper.countDrawsGroupYear(beginYear,endYear,Const.OCEAN_STR);
        List<Map<String,String>> inlandRiver = drawInfoMapper.countDrawsGroupYear(beginYear,endYear,Const.INLAND_RIVER_STR);
        Map map = new HashMap();
        for(int i = beginYear; i <= endYear; i++){
            boolean cz1 = true;
            boolean cz2 = true;
            boolean cz3 = true;
            Map<String,String> currMap = new HashMap<String,String>();
            currMap.put("year",i+"");
            currMap.put("nums",0+"");
            for(int j=0; j <domesticOcean.size(); j++){
                Map<String,String> tmpMap = domesticOcean.get(j);
                if(i == Integer.parseInt((String)tmpMap.get("year"))){
                    cz1 = false;
                }
            }
            if(cz1){
                domesticOcean.add(currMap);
            }
            for(int j=0; j <ocean.size(); j++){
                Map<String,String> tmpMap = ocean.get(j);
                if(i == Integer.parseInt((String)tmpMap.get("year"))){
                    cz2 = false;
                }
            }
            if(cz2){
                ocean.add(currMap);
            }
            for(int j=0; j <inlandRiver.size(); j++){
                Map<String,String> tmpMap = inlandRiver.get(j);
                if(i == Integer.parseInt((String)tmpMap.get("year"))){
                    cz3 = false;
                }
            }
            if(cz3){
                inlandRiver.add(currMap);
            }
        }
        map.put("domesticOcean",domesticOcean);
        map.put("ocean",ocean);
        map.put("inlandRiver",inlandRiver);
        return map;
    }

    //获取图纸审查数量
    @Override
    public List<Map> getDrawCheckNumsByYear(String year,String uid) {
        String orgCode = null;
        if(uid!=null && !Const.MINISTRY_CODE.equals(uid)){
            orgCode = uid.substring(0, 2);
        }
        List<Map> list = new ArrayList<>();
        if (StrUtils.isBlank(year)) {
            String curYear = (Calendar.getInstance().get(Calendar.YEAR)-1)+"";
            list = this.drawCheckMapper.getDrawCheckNumsByYear(curYear,orgCode);
        }else{
            list = this.drawCheckMapper.getDrawCheckNumsByYear(year,orgCode);
        }
        return list;
    }
    //按省分组获取企业数量
    @Override
    public List<Map> getEntNumsGroupPrv(String year, String entcate) {
        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR)+"";
        }
        return themEntJbxxMapper.getEntNumsGroupPrv(year,entcate);
    }

    //获取各省图纸审查数量
    @Override
    public List<Map> getDrawNumsGroupPrv(String year) {
        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR)-1+"";
        }
        return this.drawProcMapper.getDrawNumsGroupPrv(year);
    }

    //审图中心图纸审查一次合格率
    @Override
    public Map getDrawFirPassRate(String bYear, String eYear) {
        Map map = new HashMap();
        List listSD = new ArrayList();//山东审图中心合格率
        List listSH = new ArrayList();//上海审图中心合格率
        List timeList = new ArrayList();
        if (StrUtils.isBlank(bYear)) {
            bYear = Calendar.getInstance().get(Calendar.YEAR) - 5 + "";
        }
        if (StrUtils.isBlank(eYear)) {
            eYear = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        listSD = this.themDrawJbxxMapper.getDrawFirPassRate(Const.SD_DRAW_CHECK,bYear,eYear);
        listSH = this.themDrawJbxxMapper.getDrawFirPassRate(Const.SH_DRAW_CHECK,bYear,eYear);

        int indexSD = 0;
        int indexSH = 0;
        boolean foundSD = false;
        boolean foundSH = false;
        Map dataMap = new HashMap<>();
        for (int i=Integer.parseInt(bYear);i<=Integer.parseInt(eYear);i++){
            timeList.add(i);
            //没有年份的填0,
            for (;indexSD<listSD.size();indexSD++){
                String year = (String) ((Map) listSD.get(indexSD)).get("year");
                if (i==Integer.parseInt(year)){//找到了年份
                    foundSD = true;
                    break;
                }
                if (i<Integer.parseInt(year)){//未找到年份
                    break;
                }
            }
            for (;indexSD<listSH.size();indexSD++){
                String year = (String) ((Map) listSH.get(indexSD)).get("year");
                if (i==Integer.parseInt(year)){//找到了年份
                    foundSH = true;
                    break;
                }
                if (i<Integer.parseInt(year)){//未找到年份
                    break;
                }
            }
            if (!foundSD){
                dataMap = new HashMap();
                dataMap.put("year", i+"");
                dataMap.put("rates", 0);
                listSD.add(indexSD,dataMap);
                foundSD = false;
            }
            if (!foundSH){
                dataMap = new HashMap();
                dataMap.put("year", i+"");
                dataMap.put("rates", 0);
                listSH.add(indexSH,dataMap);
                foundSH = false;
            }
        }

        map.put("listSD",listSD);
        map.put("listSH",listSH);
        map.put("timeList",timeList);
        return map;
    }

    //新建渔船标准化分析图
    @Override
    public Map getNewShipCapacityScore(String year) {
        List dataList = new ArrayList();
        Map dataMap = new HashMap();
        Map map0_60 = new HashMap();
        Map map60_70 = new HashMap();
        Map map70_90 = new HashMap();
        Map map90_100 = new HashMap();

        List<String> provList = new ArrayList();
        provList.add("浙江,33");
        provList.add("山东,22");

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR)-1 + "";
        }
        for (int i=0;i<provList.size();i++){
            String provStr = provList.get(i);
            String[] split = provStr.split(",");

            Map dMap0_60 =new HashMap();
            dMap0_60.put("nums",this.capacityMapper.getNewShipCapacityNums(split[1]+"%",0,60,year));
            dMap0_60.put("score",this.capacityMapper.getNewShipCapacityScore(split[1]+"%",0,60,year));
            map0_60.put(split[0], dMap0_60);

            Map dMap60_70 =new HashMap();
            dMap60_70.put("nums",this.capacityMapper.getNewShipCapacityNums(split[1]+"%",60,70,year));
            dMap60_70.put("score",this.capacityMapper.getNewShipCapacityScore(split[1]+"%",60,70,year));
            map60_70.put(split[0], dMap60_70);

            Map dMap70_90 =new HashMap();
            dMap70_90.put("nums",this.capacityMapper.getNewShipCapacityNums(split[1]+"%",70,90,year));
            dMap70_90.put("score",this.capacityMapper.getNewShipCapacityScore(split[1]+"%",70,90,year));
            map70_90.put(split[0], dMap70_90);

            Map dMap90_100 =new HashMap();
            dMap90_100.put("nums",this.capacityMapper.getNewShipCapacityNums(split[1]+"%",90,101,year));
            dMap90_100.put("score",this.capacityMapper.getNewShipCapacityScore(split[1]+"%",90,101,year));
            map90_100.put(split[0], dMap90_100);
        }
        dataMap.put("score0_60",map0_60);
        dataMap.put("score60_70",map60_70);
        dataMap.put("score70_90",map70_90);
        dataMap.put("score90_100",map90_100);
        return dataMap;
    }


    //-------------------------------end------------------------------------------

    //检验机构↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    @Override
    public Map<String, Object> getOrgData(String uid) {
        Map<String,Object> map = new HashMap<>();
        OrganInfo organInfo = getOrganInfo(uid);
        if(StrUtils.isBlank(organInfo)){
            return map;
        }
        //机构总数
        int organCount = getOrganCount(organInfo);
        map.put("organCount",organCount);
        //机构业务复核总数量
        int checkAgainCount= getCheckAgainCount(organInfo,false);
        map.put("checkAgainCount",checkAgainCount);
        //机构待复核数量
        int toCheckCount= getCheckAgainCount(organInfo,true);
        map.put("toCheckCount",toCheckCount);
        //检验工作完成率
        int checkPercent = getOrganCheckPercent(OrgcodeUtil.getLikeStr(organInfo.getOrgcode()));
        map.put("checkPercent",checkPercent);
        //机构能力评价分
        int organScore = capacityMapper.getOrganScore(OrgcodeUtil.getLikeStr(uid));
        map.put("organScore",organScore);

        return map;
    }

    @Override
    public Map<String, Object> eChartsData1(String uid, String year) {
        Map<String,Object> map = new HashMap<>();
        OrganInfo organInfo = getOrganInfo(uid);
        if(StrUtils.isBlank(organInfo)){
            return map;
        }
        String like = null;
        if(organInfo.getOrgcodeup()!=null&&organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
            //省级登录
            if(uid!=null &&uid.length()>2){
                String substring = uid.substring(0, 2);
                like = substring +"%";
            }
        }

        if(StrUtils.isBlank(year)){
            year = Calendar.getInstance().get(Calendar.YEAR)+"";
        }

        List<Map<String, Object>> countByLevList = organInfoMapper.getCountByLev(like,year);
        log.debug(countByLevList);
        map.put("year",year);
        map.put("dataList",countByLevList);

        return map;
    }

    @Override
    public Map<String, Object> eChartsData2() {
        return null;
    }

    @Override
    public Map<String, Object> eChartsData3(String uid,String startYear,String endYear) {
        Map<String,Object> map = new HashMap<>();
        List<String> yearList = getYearList(startYear, endYear);
        OrganInfo organInfo = getOrganInfo(uid);
        if(StrUtils.isBlank(organInfo)){
            return map;
        }
        String like = null;
        if(organInfo.getOrgcodeup()!=null&&organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
            //省级登录
            if(uid!=null &&uid.length()>2){
                String substring = uid.substring(0, 2);
                like = substring +"%";
            }
        }
        List<Float> dataList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();//机构能力平均分
        for (int i = 0; i < yearList.size(); i++) {
//            CapacityExample capacityExample = new CapacityExample();
//            CapacityExample.Criteria capacityExampleCriteria = capacityExample.createCriteria();
//            capacityExampleCriteria.andBelongmodelEqualTo(yearList.get(i)+"%");
//            capacityExampleCriteria.andTypeEqualTo("1");
//            if(!StrUtils.isBlank(like)){
//                capacityExampleCriteria.andRefidLike(like+"%");
//            }
//            List<Capacity> capacities = capacityMapper.selectByExample(capacityExample);
//            int total = 0;
//            int avg = 100;
//            for (int j = 0; j < capacities.size(); j++) {
//                   total += Integer.parseInt(String.valueOf(capacities.get(j).getScore()));
//            }
//            if(capacities.size()>0){
//                avg = total/capacities.size();
//            }
//            dataList.add(avg);
            //update by ly171203
            Float score = organInfoMapper.getOrgAvgScore(like, yearList.get(i));
            Integer num = organInfoMapper.getOrgNums(like, yearList.get(i));
            dataList.add(score!=null?score:0);
            numList.add(num!=null?num:0);
        }
        map.put("xAxis",yearList);
        map.put("data",dataList);
        map.put("numData",numList);

        return map;
    }

    //气泡图
    @Override
    public Map eChartsData4(String uid, String year) {
//        Map<String,Object> map = new HashMap<>();
//        //获取下级机构
//        OrganInfoExample organInfoExample = new OrganInfoExample();
//        OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();
//        criteria.andOrgcodeupEqualTo(uid);
//        List<OrganInfo> organInfos = organInfoMapper.selectByExample(organInfoExample);
//        List<Object> arrayList = new ArrayList<>();
//        //横轴列表
//        List<String> nameList = new ArrayList<>();
//        //最新的一次评分id
//        int maxDate = capacityMapper.getMaxDate();
//        //哪一年
//        int aimYear = Calendar.getInstance().get(Calendar.YEAR) - 1;
//        for (int i = 0; i < organInfos.size(); i++) {
//            String like = null;
//            if(!Const.MINISTRY_CODE.equals(uid)){
//                //省级
//                like = uid.substring(0,4);
//            }else {
//                //部级
//                like =  uid.substring(0,2);
//            }
//            //评分
//
//            //机构数量
//
//        }
//
//
//        return map;
        //update by Liyao
        Map paramMap = new HashMap();
        Map dataMap = new HashMap();
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            paramMap.put("orgCode",uid.substring(0, 2));
        }

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR) + "";
        }
        paramMap.put("year", year);
        List dataList = this.selectListMapByMethod("getOrgScoreAndNum", paramMap);
        dataMap.put("year", year);
        dataMap.put("dataList", dataList);
        return dataMap;
    }

    @Override
    public Map<String, Object> eChartsData5() {
        return null;
    }

    @Override
    public Map<String, Object> eChartsData6(String uid,String startYear,String endYear) {
        Map<String,Object> map = new HashMap<>();
        List yearList = new ArrayList<>();
        List dataList = new ArrayList<>();
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        List<Map> data = biManageMapper.getCheckRateGroupYear(likeStr,startYear,endYear);
        for (Map item:data) {
            yearList.add(item.get("year"));
            dataList.add(item.get("rate"));
        }
//        for (int i = 0; i < yearList.size(); i++) {
//            ShipExample shipExample = new ShipExample();
//            ShipExample.Criteria shipExampleCriteria = shipExample.createCriteria();
//            if(like != null){
//                shipExampleCriteria.andOrgidLike(like+"%");
//            }
//            shipExampleCriteria.andCompletdateLike(yearList+"%");
//            int total = shipMapper.countByExample(shipExample);
//            List<Ship> ships = shipMapper.selectByExample(shipExample);
//            List<String> list = new ArrayList<>();
//            for (int j = 0; j < ships.size(); j++) {
//                list.add(ships.get(i).getShipcode());
//            }
//            ShipCheckExample shipCheckExample = new ShipCheckExample();
//            ShipCheckExample.Criteria shipCheckExampleCriteria = shipCheckExample.createCriteria();
//            if(list != null&& list.size()>0){
//                shipCheckExampleCriteria.andYcbmIn(list);
//            }
//            shipCheckExampleCriteria.andChecktimeLike(yearList.get(i)+"%");
//            int checked = shipCheckMapper.countByExample(shipCheckExample);
//
//            int percent = 100;
//            if(total != 0){
//                percent = checked * 100 /total;
//            }
//            dataList.add(percent);
//        }
        map.put("xAxis",yearList);
        map.put("data",dataList);
        return map;
    }

    @Override
    public Map<String, Object> eChartsData7(String uid) {
        Map<String,Object> map = new HashMap<>();
        OrganInfoExample organInfoExample = new OrganInfoExample();
        OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();
        criteria.andOrgcodeupEqualTo(uid);
        //下属所有机构
        List<OrganInfo> organInfos = organInfoMapper.selectByExample(organInfoExample);
        int aimYear = Calendar.getInstance().get(Calendar.YEAR)-1;
        List<Integer> percentList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < organInfos.size(); i++) {
            nameList.add(organInfos.get(i).getOrgname());
            ShipExample shipExample = new ShipExample();
            ShipExample.Criteria shipExampleCriteria = shipExample.createCriteria();
            String like = null;
            if(!Const.MINISTRY_CODE.equals(uid)){
                //省级登录
                like = uid.substring(0,4);
            }else {
                //部级登录
                like = uid.substring(0,2);
            }
            shipExampleCriteria.andOrgidLike(like+"%");
            shipExampleCriteria.andCompletdateLessThanOrEqualTo(aimYear+"12-31");
            int total = shipMapper.countByExample(shipExample);
//            List<Ship> ships = shipMapper.selectByExample(shipExample);
//            List<String> shipCodes = new ArrayList<>();
//            for (int j = 0; j < ships.size(); j++) {
//                shipCodes.add(ships.get(j).getShipcode());
//            }
            ShipCheckExample shipCheckExample = new ShipCheckExample();
            ShipCheckExample.Criteria shipCheckExampleCriteria = shipCheckExample.createCriteria();
            shipCheckExampleCriteria.andChecktimeBetween(aimYear+"-01-01",aimYear+"-12-31");
//           if(shipCodes!=null&& shipCodes.size()>0){
//               shipCheckExampleCriteria.andYcbmIn(shipCodes);
//           }
            shipCheckExampleCriteria.andAreacodeLike(like+"%");
            int checked = shipCheckMapper.countByExample(shipCheckExample);
            int percent = 100;

            if(total != 0){
                percent = checked*100/total;
            }
            //暂时写假数据 todo:
            int max=100;
            int min=80;
            Random random = new Random();
            percent = random.nextInt(max)%(max-min+1) + min;
            percentList.add(percent);
        }
        //update by Liyao begin
        Object[] nameArr = nameList.toArray();
        Object[] percentArr =  percentList.toArray();
        for (int i=0;i<10&&i<percentArr.length;i++){
            for (int j=i+1;j<percentArr.length;j++){
                Integer ipercent = (Integer) percentArr[i];
                Integer jpercent = (Integer) percentArr[j];
                if (ipercent<jpercent) {
                    int temp = ipercent;
                    percentArr[i] = jpercent;
                    percentArr[j] = temp;

                    Object strTemp = nameArr[i];
                    nameArr[i] = nameArr[j];
                    nameArr[j] = strTemp;
                }
            }
        }
        String[] xAxis = new String[10];
        Integer[] data = new Integer[10];
        System.arraycopy(nameArr,0,xAxis,0,10);
        System.arraycopy(percentArr,0,data,0,10);
        map.put("xAxis",xAxis);
        map.put("data",data);
        //update by Liyao end
        return map;
    }

    @Override
    public List eChartsData8(String uid) {
        List list = new ArrayList();
        Map map = new HashMap();
        String year  = Calendar.getInstance().get(Calendar.YEAR)-1+"%";
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        map.put("year", year);
        map.put("likeStr", likeStr);
        list = biThemMapper.selectListMapByMethod("getOrgCheckNums",map);
        return list;
    }

    @Override
    public List eChartsData9(String uid, String bYear, String eYear) {
        List list = new ArrayList();
        Map params = new HashMap();
        String likeStr = null;
        if (uid != null&&!Const.MINISTRY_CODE.equals(uid)) {//检验机构代码0000000为部级用户,通过前2位区分省,前四位区分市
            likeStr = uid.substring(0,2)+"%";
        }
        if (StrUtils.isBlank(bYear)){
            bYear = Calendar.getInstance().get(Calendar.YEAR) + 1 + "";
        }
        if (StrUtils.isBlank(eYear)){
            eYear = Calendar.getInstance().get(Calendar.YEAR) + 10 + "";
        }
        params.put("likeStr", likeStr);
        params.put("bYear", bYear);
        params.put("eYear", eYear);
        list = this.biThemMapper.selectListMapByMethod("getForeCastOrgs", params);
        return list;
    }
    //获取基本信息
    public OrganInfo getOrganInfo(String uid){
        OrganInfoExample organInfoExample = new OrganInfoExample();
        OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<OrganInfo> organInfos = organInfoMapper.selectByExample(organInfoExample);
        return organInfos.size()>0?organInfos.get(0):null;
    }
    //机构总数
    public int getOrganCount(OrganInfo organInfo){
        OrganInfoExample organInfoExample = new OrganInfoExample();
        OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();
        if(organInfo.getOrgcodeup()!=null&&organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
            //省级登录
            String uid = organInfo.getUid();
            if(uid!=null &&uid.length()>2){
                String substring = uid.substring(0, 2);
                criteria.andUidLike(substring+"%");
            }
        }
        int i = organInfoMapper.countByExample(organInfoExample);
        return i;
    }
    //机构业务复核数量
    public int getCheckAgainCount(OrganInfo organInfo,boolean isChecked){
        OrgCertificateExample example = new OrgCertificateExample();
        OrgCertificateExample.Criteria criteria = example.createCriteria();

        if(organInfo.getOrgcodeup()!=null&&organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
            //省级登录
            String uid = organInfo.getUid();
            if(uid!=null &&uid.length()>2){
                String substring = uid.substring(0, 2);
                criteria.andOrgcodeLike(substring + "%");
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        if(isChecked){//查询今年待复核的数量
            criteria.andEndtimeGreaterThan(format);
        }
        criteria.andEndtimeLike(format.substring(0,4)+"%");//在今年复核的数量
        int i = orgCertificateMapper.countByExample(example);
        return i;
    }
    //检验工作完成率(年度已检渔船数量/渔船总数)
    public int getOrganCheckPercent(String likeStr){
        String lastYear = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        ShipExample shipExample = new ShipExample();
        ShipExample.Criteria criteria = shipExample.createCriteria();
        criteria.andCompletdateLessThanOrEqualTo(lastYear);

        if (!StrUtils.isBlank(likeStr)){
            criteria.andOrgidLike(likeStr);
        }
        int shipNums = shipMapper.countByExample(shipExample);//渔船总数
        int lastNums = shipCheckMapper.countByExample1(likeStr,lastYear);//年度已检渔船数量
        int percent = 100;
        if (shipNums!=0) {
            percent = lastNums*100/shipNums;
        }
        /*
        int year = Calendar.getInstance().get(Calendar.YEAR);
        //筛选渔船有效 字段未定义
        int curNums = shipCheckMapper.countByExample1(likeStr,year+"");//分母

        int lastNums = shipCheckMapper.countByExample1(likeStr,year-1+"");
        int percent = 100;
        if(lastNums != 0){
            percent = curNums*100/lastNums;
        }*/
        return percent;
    }
    /*//检验机构能力评分
    public int getOrganScore(OrganInfo organInfo){
        *//** OrganInfoExample organInfoExample = new OrganInfoExample();
     OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();
     if(organInfo.getOrgcodeup()!=null&& organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
     //省级登录
     String uid = organInfo.getUid();
     if(uid!=null &&uid.length()>2){
     String substring = uid.substring(0, 2);
     criteria.andUidLike(substring+"%");
     }
     }

     List<OrganInfo> organInfos = organInfoMapper.selectByExample(organInfoExample);
     List<String> list = new ArrayList<>();
     for (int i = 0; i < organInfos.size(); i++) {
     list.add(organInfos.get(i).getUid());
     }
     String maxDate = capacityMapper.getLateBatch("2001");
     //循环id去查找
     CapacityExample capacityExample = new CapacityExample();
     CapacityExample.Criteria capacityExampleCriteria = capacityExample.createCriteria();
     capacityExampleCriteria.andBatchEqualTo(maxDate);
     //:TODO list数量过大，需要修正（大于1000sql会报错）

     if(list != null&& list.size()>0){
     capacityExampleCriteria.andRefidIn(list);
     }**//*
        CapacityExample capacityExample = new CapacityExample();
        CapacityExample.Criteria capacityExampleCriteria = capacityExample.createCriteria();
        if(organInfo.getOrgcodeup()!=null&& organInfo.getOrgcodeup().equals(Const.MINISTRY_CODE)){
            //省级登录
            String uid = organInfo.getUid();
            if(uid!=null &&uid.length()>2){
                String substring = uid.substring(0, 2);
//                criteria.andUidLike(substring+"%");
                capacityExampleCriteria.andRefidLike(substring+"%");
            }
        }
        capacityExampleCriteria.andTypeEqualTo("1");
        List<Capacity> capacities = capacityMapper.selectByExample(capacityExample);
        float total = 0;
        int capScore = 100;
        for (int i = 0; i < capacities.size(); i++) {
            total+=Float.parseFloat(String.valueOf(capacities.get(i).getScore()));
        }
        if(capacities.size()>0){
            String string = String.valueOf(total/capacities.size());
            if(string.indexOf(".")!=-1){
                string = string.substring(0,string.indexOf("."));
            }
            capScore = Integer.parseInt(string);
        }
        return capScore;
    }*/

    //检验机构↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    //***************************************检验管理专题begin***************************************
    //获取检验管理专题页面基本信息
    @Override
    public Map<String, Object> getCheckManageInfo(String uid) {
        String lastYear = (Calendar.getInstance().get(Calendar.YEAR)-1)+"";
        Map map = new HashMap();
        int checkships = 0;
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        //年份
        map.put("year",lastYear);
        //全国渔船检验量
        checkships = shipCheckMapper.countCheckShipsByYear(lastYear + "%",likeStr);
        map.put("checkShips",checkships);
        //新建渔船数量
        ShipExample shipExample = new ShipExample();
        ShipExample.Criteria criteria = shipExample.createCriteria();
        criteria.andCompletdateLike(lastYear+"%");

        if (!StrUtils.isBlank(likeStr)){
            criteria.andOrgidLike(likeStr);
        }
        map.put("buildShips", shipMapper.countByExample(shipExample));
        //检验工作完成率(上一年检验的渔船数量/完工时为上一年以前的所有渔船数量)
        int organCheckPercent = getOrganCheckPercent(likeStr);
        map.put("checkWorkRate", organCheckPercent);
        //远洋渔船一次检验合格率
        map.put("yyShipFirtPassRate",shipCheckMapper.getYyShipFirtPassRate(lastYear+"%",Const.OCEAN_STR,likeStr,null));
        return map;
    }

    //渔船拥有量分析图
    @Override
    public Map<String, Object> getShipInfos(String bYear, String eYear, String uid) {
        Map dataMap = new HashMap();

        List timeList = new ArrayList();

        String likeStr = OrgcodeUtil.getLikeStr(uid);

        if (StrUtils.isBlank(bYear)) {
            bYear = Calendar.getInstance().get(Calendar.YEAR) - 5 + "";
        }
        if (StrUtils.isBlank(eYear)) {
            eYear = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        for (int i=Integer.parseInt(bYear);i<=Integer.parseInt(eYear);i++){
            timeList.add(i);
        }

        dataMap.put("totalShips",shipMapper.countShipNumsGroupYear(bYear,eYear,likeStr));//渔船总数
        dataMap.put("totalTonnages",shipMapper.getTotalTonnagesGroupYear(bYear,eYear,likeStr));//登记渔船总吨位
        dataMap.put("totalPowers",shipMapper.getTotalPowersGroupYear(bYear,eYear,likeStr));//登记渔船总功率
        dataMap.put("timeList",timeList);//年份
        return dataMap;
    }

    //渔船检验工作量分析图
    @Override
    public Map<String, Object> shipCheckWorks(String bYear, String eYear, String uid) {
        Map dataMap = new HashMap();

        List timeList = new ArrayList();

        String likeStr = OrgcodeUtil.getLikeStr(uid);

        if (StrUtils.isBlank(bYear)) {
            bYear = Calendar.getInstance().get(Calendar.YEAR) - 5 + "";
        }
        if (StrUtils.isBlank(eYear)) {
            eYear = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        for (int i=Integer.parseInt(bYear);i<=Integer.parseInt(eYear);i++){
            timeList.add(i);
        }

        dataMap.put("totalShips",shipCheckMapper.countCheckShipNumsGroupYear(bYear,eYear,likeStr));//实检渔船总数
        dataMap.put("totalTonnages",shipCheckMapper.getCheckTotalTonnagesGroupYear(bYear,eYear,likeStr));//实检登记渔船总吨位
        dataMap.put("totalPowers",shipCheckMapper.getCheckTotalPowersGroupYear(bYear,eYear,likeStr));//实检登记渔船总功率
        dataMap.put("timeList",timeList);//年份
        return dataMap;
    }

    //新建渔船检验工作量分析 上一年
    @Override
    public Map<String, Object> getNewShipChecks(String year, String uid) {
        Map dataMap = new HashMap();

        String likeStr = null;
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            likeStr = uid.substring(0, 2)+"%";
        }

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR)-1 + "";
        }

        dataMap.put("oceanShips",shipCheckMapper.countCheckShipsGroupMaterial(year+"%",likeStr,Const.OCEAN_STR));//实检渔船总数 远洋
        dataMap.put("domesticOceanShips",shipCheckMapper.countCheckShipsGroupMaterial(year+"%",likeStr,Const.DOMESTIC_OCEAN_STR));//实检登记渔船总吨位 国内海洋
        dataMap.put("inlandRiverShips",shipCheckMapper.countCheckShipsGroupMaterial(year+"%",likeStr,Const.INLAND_RIVER_STR));//实检登记渔船总功率 内河
        dataMap.put("year",year);//年份
        return dataMap;
    }
    //渔船船龄统计分析
    @Override
    public List getShipYearsOld(String uid, String jobArea) {
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        List list = shipMapper.getShipYearsOld(Calendar.getInstance().get(Calendar.YEAR),likeStr,jobArea);
        return list;
    }
    //远洋渔船一次检验合格率分析
    @Override
    public Map getOceanShipFirPassRate(String uid, String bYear, String eYear) {
        Map map = new HashMap();
        List xdata = new ArrayList();
        List ydata = new ArrayList();
        List domesticXData = new ArrayList();
        List domesticYdata = new ArrayList();

        String likeStr = null;
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            likeStr = uid.substring(0, 2)+"%";
        }

        if (StrUtils.isBlank(bYear)) {
            bYear = Calendar.getInstance().get(Calendar.YEAR) - 5 + "";
        }
        if (StrUtils.isBlank(eYear)) {
            eYear = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        List<Map> dataList = shipCheckMapper.getOceanShipFirPassRateGroupYear(likeStr, bYear, eYear, Const.OCEAN_STR);
        List<Map> domesticDataList = shipCheckMapper.getOceanShipFirPassRateGroupYear(likeStr, bYear, eYear, Const.DOMESTIC_OCEAN_STR);
        for (Map dataMap:dataList) {
            xdata.add(dataMap.get("year"));
            ydata.add(dataMap.get("rate"));
        }
        for(Map domesticDataMap:domesticDataList){
            domesticXData.add(domesticDataMap.get("year"));
            domesticYdata.add(domesticDataMap.get("rate"));
        }
        map.put("domesticXData",domesticXData);
        map.put("domesticYdata",domesticYdata);
        map.put("xdata", xdata);
        map.put("ydata", ydata);
        return map;
    }

    @Override
    public Map getOceanEntFirPassRate(String uid, String year) {
        Map map = new HashMap();
        List xdata = new ArrayList();
        List ydata = new ArrayList();
        List domesticXData = new ArrayList();
        List domesticYdata = new ArrayList();
        String likeStr = null;
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            likeStr = uid.substring(0, 2)+"%";
        }

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR) - 1 + "%";
        }
        List<Map> dataList = shipCheckMapper.getOceanEntFirPassRateGroupOwner(likeStr, year,Const.OCEAN_STR);
        List<Map> domesticDataList = shipCheckMapper.getOceanEntFirPassRateGroupOwner(likeStr, year,Const.DOMESTIC_OCEAN_STR);
        for (int i=0;i<5 &&i<dataList.size();i++) {
            Map dataMap = dataList.get(i);
            xdata.add(dataMap.get("name"));
            ydata.add(dataMap.get("rate"));
        }

        for (int i=0;i<5 &&i<domesticDataList.size();i++) {
            Map domesticDataMap = domesticDataList.get(i);
            domesticXData.add(domesticDataMap.get("name"));
            domesticYdata.add(domesticDataMap.get("rate"));
        }

        map.put("xdata", xdata);
        map.put("ydata", ydata);
        map.put("domesticXData", domesticXData);
        map.put("domesticYdata", domesticYdata);
        return map;
    }
    //渔船检验工作完成率
    @Override
    public BigDecimal getshipCheckWorkRate(String uid) {
        String likeStr =null;
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        if (uid != null&&!Const.MINISTRY_CODE.equals(uid)) {//检验机构代码0000000为部级用户,通过前2位区分省,前四位区分市
            likeStr = uid.substring(0,2)+"%";
        }
        //全国渔船检验量
        int curCheckShips = 0;//当前年份检验的渔船数量
        float  rate;
        int lastCheckShips = 0;//所有渔船数量
        lastCheckShips=shipMapper.countByExample(null);
        curCheckShips = shipCheckMapper.countCheckShipsByYear( curYear+ "%",likeStr);
        //检验工作完成率(上一年检验的渔船数量/完工时间为上一年以前的所有渔船数量)
//        ShipExample shipExample = new ShipExample();
//        ShipExample.Criteria criteria = shipExample.createCriteria();
//        criteria.andCompletdateLessThanOrEqualTo(curYear);
//
//        if (!StrUtils.isBlank(likeStr)){
//            criteria.andOrgidLike(likeStr);
//        }
//        int shipNums = shipMapper.countByExample(shipExample);
        if(lastCheckShips==0){
            rate=0;
        }else{
            rate=(float)curCheckShips*100 / lastCheckShips;
        }
        return new BigDecimal(rate).setScale(2, RoundingMode.UP);
    }

    //远洋渔船综合安全系数分析图
    @Override
    public Map getOceanShipSecurityScore(String uid, String year) {
        String likeStr = null;
        Map map = new HashMap();
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            likeStr = uid.substring(0, 2)+"%";
        }

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }

        List oceanDate=capacityMapper.getOceanShipSecurityScore(likeStr,year,Const.OCEAN_STR);
        List domesticDate=capacityMapper.getOceanShipSecurityScore(likeStr,year,Const.DOMESTIC_OCEAN_STR);
        map.put("oceanDate",oceanDate);
        map.put("domesticDate",domesticDate);
        return map;
    }

    //渔船综合安全指数高位分布
    @Override
    public Map getOceanShipSecurityScoreDes(String uid, String year) {
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        Map map = new HashMap();

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        List oceanData=capacityMapper.getOceanShipSecurityScoreDES(likeStr,year,Const.OCEAN_STR);
        List domesticData=capacityMapper.getOceanShipSecurityScoreDES(likeStr,year,Const.DOMESTIC_OCEAN_STR);
        map.put("oceanDate",oceanData);
        map.put("domesticDate",domesticData);
        return map;
    }
    //渔业船舶拥有量分析图
    @Override
    public List getShipNumsGroups(String uid, String year) {
        String likeStr = null;
        if (!StrUtils.isBlank(uid)&&!Const.MINISTRY_CODE.equals(uid)){
            likeStr = uid.substring(0, 2)+"%";
        }

        if (StrUtils.isBlank(year)) {
            year = Calendar.getInstance().get(Calendar.YEAR) - 1 + "";
        }
        return shipMapper.getShipNumsGroupLenAre(likeStr,year);
    }

    @Override
    public List eChartsData10(OrganInfo org) {

        List<Map> countyList = new ArrayList<>();
        if (org !=null) {
            OrganInfoExample example = new OrganInfoExample();
            OrganInfoExample.Criteria criteria = example.createCriteria();
            criteria.andOrgcodeupEqualTo(org.getOrgcode());

            String likeStr = null;
            if (!StrUtils.isBlank(org.getOrgcode())&&!org.getOrgcode().equals("0000000")) {
                likeStr = org.getOrgcode().substring(0, 2)+"%";
            }
            int year = Calendar.getInstance().get(Calendar.YEAR);
            countyList = organInfoMapper.eChartsData10(likeStr,year+"",org.getOrgcode());

        }
        return countyList;
    }

    @Override
    public List orgEchartsData11(OrganInfo orginfo) {
        String likeStr = null;
        if (orginfo!=null&&!StrUtils.isBlank(orginfo.getOrgcode())&&!orginfo.getOrgcode().equals("0000000")) {
            likeStr = orginfo.getOrgcode().substring(0, 2)+"%";
        }
        List list = organInfoMapper.orgEchartsData11(likeStr);
        return list;
    }

    @Override
    public Map getYcsInitData(String uid,String years) {
        Map map = new HashMap();
        String likeStr = null;

        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            likeStr = uid.substring(0,2)+"%";
        }
        Map params=new HashMap();
        params.put("orgcode",likeStr);
        params.put("year",years);
        List<Map<String,Object>> listMap=this.selectListMapByMethod("getThemeYcsIdexNum",params);


//        Integer surNum = this.surveyorMapper.countSurByOrgCode(likeStr);//验船师人数
        Float avgScore=this.capacityMapper.getSurAvgScore(likeStr);//能力平均分
        Float compatibility = biManageMapper.getSurCompatibility(likeStr);//验船师人员匹配度
      /*  String drawNums=this.getAvgDraws(likeStr);//验船师年均审查图纸数量
        String proNums=this.getAvgProducts(likeStr);//验船师年均检验产品数量
        Double shipNums=biManageMapper.getAvgShipNums(likeStr);//验船师年均检验渔船数量*/

//        map.put("surNum",surNum);
        map.put("avgScore",avgScore);
        map.put("compatibility",compatibility);
//        map.put("drawNums",drawNums);
//        map.put("proNums",proNums);
//        map.put("shipNums",shipNums);

        map.putAll(listMap.size()>0?listMap.get(0):new HashMap());
        return map;
    }


    private String getAvgProducts(String likeStr) {
        float pronum = productCheckMapper.getProNumsByOrgCode(likeStr); //检验的产品数量
        float surnum = surveyorMapper.getSurNumByMajor(likeStr,Const.PRO_CER);//具有产品检验资质的验船师数量
        String avgNum = "0";
        if (surnum!=0){
            BigDecimal num = new BigDecimal(pronum / surnum).setScale(2, BigDecimal.ROUND_HALF_UP);
            avgNum = num.toString();
        }
        return avgNum;
    }

    private String getAvgDraws(String likeStr) {
        float drawnum = drawCheckMapper.getDrawNumsByOrgCode(likeStr); //图纸审查的套数
        float surnum = surveyorMapper.getSurNumByMajor(likeStr,Const.DRAW_CER);//具有图纸审查资质的验船师数量
        String avgNum = "0";
        if (surnum!=0){
            BigDecimal num = new BigDecimal(drawnum / surnum).setScale(2, BigDecimal.ROUND_HALF_UP);
            avgNum = num.toString();
        }
        return avgNum;
    }

    @Override
    public Map getYcsQkrsData(String uid) {
        Map map = new HashMap();
        Map params = new HashMap();
        String likeStr = null;

        if(!Const.MINISTRY_CODE.equals(uid)){
            //省级登录
            likeStr = uid.substring(0,2)+"%";
        }
        params.put("likeStr", likeStr);
        params.put("type", Constant.NUMBER_1);
        List<Map<String,Object>> surCertList = biThemMapper.selectListMapByMethod("getYcsQkrsData",params);//持证验船师
        params.put("type", Constant.NUMBER_2);
        List surOnlineList = biThemMapper.selectListMapByMethod("getYcsQkrsData",params);//一线验船师
        //todo:暂时覆盖实际数据
        Map ycsnum0 = surCertList.get(0);
        ycsnum0.put("ycsnum", 347);
        Map ycsnum1 = surCertList.get(1);
        ycsnum1.put("ycsnum", 513);
        Map ycsnum2 = surCertList.get(2);
        ycsnum2.put("ycsnum", 3608);
        map.put("surCertList", surCertList);
        map.put("surOnlineList", surOnlineList);
        return map;
    }

    @Override
    public Map getYcsScoreData(String uid) {
        Map map = new HashMap();
        Map params = new HashMap();
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        params.put("likeStr", likeStr);
        params.put("type", Constant.NUMBER_1);
        List<Map<String,Object>> surCertList = biThemMapper.selectListMapByMethod("getYcsScoreData",params);//持证验船师
        params.put("type", Constant.NUMBER_2);
        List surOnlineList = biThemMapper.selectListMapByMethod("getYcsScoreData",params);//一线验船师

        map.put("surCertList", surCertList);
        map.put("surOnlineList", surOnlineList);
        return map;
    }


    //***************************************检验管理专题end***************************************
    @Override
    public List<Map<String, Object>> selectListMapByMethod(String method,Map<String,Object>params) {
        if (params.get("year")!=null){
            String year = (String) params.get("year");
            String[] years = year.split(",");
            params.put("years", Arrays.asList(years));
        }
        return biThemMapper.selectListMapByMethod(method,params);
    }
}

