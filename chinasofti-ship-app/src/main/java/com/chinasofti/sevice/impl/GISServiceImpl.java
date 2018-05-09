package com.chinasofti.sevice.impl;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.GISService;
import com.chinasofti.utils.AddressUtil;
import com.chinasofti.utils.OrgcodeUtil;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-4-27
 * Time: 下午4:50
 * To change this template use File | Settings | File Templates.
 */
@Service
public class GISServiceImpl implements GISService{
    private static Logger log = Logger.getLogger(GISServiceImpl.class);

    @Resource
    private GISMapper gisMapper;

    @Resource
    private OrganInfoMapper orgMapper;

    @Resource
    private SurveyorMapper surveyorMapper;

    @Resource
    private ProductRepairMapper productRepairMapper;

    @Resource
    private ProCheckListMapper proCheckListMapper;

    @Resource
    private ShipCheckMapper shipCheckMapper;

    @Resource
    private CapacityMapper capacityMapper;

    @Resource
    private DrawInfoMapper drawInfoMapper;

    @Resource
    private GNShipPosMapper gnShipPosMapper;

    @Resource
    private EntInfoMapper entMapper;

    @Override
    public Object getConstructionOrg(OrganInfo org) {
        List list = gisMapper.getConstructionOrg(org);
        if (StrUtils.isBlank(org.getUid())) {
            return list;
        }
        return list.size()>0?list.get(0):null;
    }

    @Override
    public Map getOrgData(OrganInfo org) {
        Map map = new HashMap();
        String likeStr = null;
        int orgNums=0;
        OrganInfoExample organInfoExample = new OrganInfoExample();
        OrganInfoExample.Criteria criteria = organInfoExample.createCriteria();

        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
            criteria.andUidLike(likeStr);
        }
        orgNums = orgMapper.countByExample(organInfoExample);
        List<Map> setModeList = gisMapper.countByOrgCode(likeStr,"CO_FUNTYPE");//设置方式_分组
        List<Map> foundModeList = gisMapper.countByOrgCode(likeStr, "CO_FINASOURCE");//经费拨款方式_分组
        List<Map> orgManageList = gisMapper.countByOrgCode(likeStr,"CO_PARTTYPE");//机构管理方式_分组


//        Map setModeMap = new HashMap();;//设置方式_分组
//        Map foundModeMap = new HashMap();;//经费拨款方式_分组
//        Map orgManageMap = new HashMap();;//机构管理方式_分组
//        for (Map imap:setModeList){
//            switch ((String)imap.get("CO_FUNTYPE")) {
//                case Const.ORG_FUND_TYP1:
//                    setModeMap.put("org_fund_type1", imap.get("NUMS"));
//                    break;
//                case Const.ORG_FUND_TYP2:
//                    setModeMap.put("org_fund_type2", imap.get("NUMS"));
//                    break;
//                case Const.ORG_FUND_TYP3:
//                    setModeMap.put("org_fund_type3", imap.get("NUMS"));
//                    break;
//            }
//        }
//        for (Map imap:foundModeList){
//            switch ((String)imap.get("CO_FINASOURCE")) {
//                case Const.ORG_FUND_TYP1:
//                    setModeMap.put("org_fund_type1", imap.get("NUMS"));
//                    break;
//                case Const.ORG_FUND_TYP2:
//                    setModeMap.put("org_fund_type2", imap.get("NUMS"));
//                    break;
//                case Const.ORG_FUND_TYP3:
//                    setModeMap.put("org_fund_type3", imap.get("NUMS"));
//                    break;
//            }
//        }
        map.put("setMode", setModeList);
        map.put("foundMode", foundModeList);
        map.put("orgManageMode", orgManageList);
        map.put("orgNums", orgNums);
        return map;
    }

    @Override
    public List getGisSurData1(OrganInfo org) {
        List list = gisMapper.getGisSurData1();
        return list;
    }

    @Override
    public List getSurAbilityData1() {
        List list = new ArrayList();
        list = gisMapper.getSurAbilityData1();
        return list;
    }

    @Override
    public List getSurAbilityData2(OrganInfo org) {
        List list = new ArrayList();
        String likeStr = OrgcodeUtil.getLikeStr(org.getUid());
        String year = Calendar.getInstance().get(Calendar.YEAR)+"";
        list = gisMapper.getSurAbilityData2(likeStr,year);
        return list;
    }

    @Override
    public List getOrgData1(OrganInfo org) {
        List list = new ArrayList();
        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }
        list = gisMapper.getOrgData1(likeStr);
        return list;
    }

    @Override
    public List getGisSurData2(OrganInfo org) {
        List list = new ArrayList();
        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }
        list = gisMapper.getGisSurData2(likeStr);
        return list;
    }

    @Override
    public List getOrgData2() {
        List list = new ArrayList();
        list = gisMapper.getOrgData2();
        return list;
    }

    @Override
    public List getGisTrainData1() {
        List list = new ArrayList();
        list = gisMapper.getGisTrainData1();
        return list;
    }

    @Override
    public List getGisTrainData2(OrganInfo org) {
        List list = new ArrayList();
        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }
        list = gisMapper.getGisTrainData2(likeStr);

        return list;
    }

    @Override
    public Map getGisTrainData3(OrganInfo org) {
        Map map = new HashMap();
        List list = new ArrayList();
        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }
        list = gisMapper.getGisTrainData3(likeStr);
        int num = gisMapper.countGisTrainData3(likeStr);
        map.put("dataList", list);
        map.put("totalNums", num);

        return map;
    }

    @Override
    public List getGisTrainData4(String orgcode) {
        List list = new ArrayList();
        if (!StrUtils.isBlank(orgcode)){
            list = this.gisMapper.getGisTrainData4(orgcode);
        }
        return list;
    }

    @Override
    public List getProductCheckData1() {
        List list = gisMapper.getProductCheckData1();
        return list;
    }

    @Override
    public Map getSurAbilityData3(OrganInfo org) {
        Map map = new HashMap();
        String likeStr = OrgcodeUtil.getLikeStr(org.getUid());
        String year = Calendar.getInstance().get(Calendar.YEAR) + "";
        map.put("totalNum",gisMapper.getSurNumByOrg(likeStr,year));//验船师总数量-them_ycs_jbxx
        map.put("surLv",gisMapper.getSurAbilityData3(likeStr,"LV",year));//按级别分类-them_ycs_jbxx
        map.put("surEduction",gisMapper.getSurAbilityData3(likeStr,"EDUCERTCODE",year));//按学历分类-them_ycs_jbxx
        map.put("surProfession",gisMapper.getSurAbilityData3(likeStr,"MAJORTYPE",year));//按专业分类-CIS_SURVEYOR
        return map;
    }

    @Override
    public Map getProductCheckData2(OrganInfo org) {
        Map map = new HashMap();
        List dataList = new ArrayList();
        int totalNum = 0;

        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }

        dataList = gisMapper.getProductCheckData2(likeStr);
        totalNum = gisMapper.countProductCheckData2(likeStr);

        map.put("totalNum", totalNum);
        map.put("dataList", dataList);
        return map;
    }

    //产品制造企业位置及基本信息
    @Override
    public List getProductCreateData1(String name) {
        List list = new ArrayList();
        if (!StrUtils.isBlank(name)){
            name = "%"+name+"%";
        }
        list = gisMapper.getProductCreateData1(name);
        return list;
    }

    //全国各省制造企业数量
    @Override
    public List getProductCreateData2() {
        List list = new ArrayList();
        list = gisMapper.getProductCreateData2();
        return list;
    }

    //产品制造企业能力分布的饼状图
    @Override
    public List getProductCreateData3(OrganInfo org) {
        List list = new ArrayList();
        String likeStr = OrgcodeUtil.getLikeStr(org.getUid());
        list = gisMapper.getProductCreateData3(likeStr);
        return list;
    }
    //各省产品认可型号数量
    @Override
    public List getProductTypeData1() {
        List list = new ArrayList();
        list = gisMapper.getProductTypeData1();
        return list;
    }

    //各省产品认可型号数量统计
    @Override
    public Map getProductTypeData2(OrganInfo org) {
        Map map = new HashMap();
        List dataList = new ArrayList();
        int totalNum = 0;

        String likeStr = null;
        if (!StrUtils.isBlank(org.getUid())&&!org.getUid().equals("0000000")) {
            likeStr = org.getUid().substring(0,2)+"%";
        }

        dataList = gisMapper.getProductTypeData2(likeStr);
        totalNum = gisMapper.countProductTypeData2(likeStr);

        map.put("totalNum", totalNum);
        map.put("dataList", dataList);
        return map;
    }

    //GMDSS,筏站点位分布
    @Override
    public List getRaftStationData1(String entcate,String name) {
        List list = new ArrayList();
        if (!StrUtils.isBlank(name)) {
            name = "%"+name+"%";
        }
        list = gisMapper.getRaftStationData1(entcate,name);
        return list;
    }
    //获取筏站或GMDSS维修设备统计信息
    @Override
    public Map getRaftOrGMDSSData(EntInfo ent,String proType) {
        int proNums = 0;//累计修筏数量
        int raftNum = 0;//
        Float rate = 0f;
        Map map = new HashMap();

        proNums = gisMapper.countProNumByEnt(ent,proType);
        rate = gisMapper.getChcekRate(ent.getPid());//监督抽查合格率
        raftNum = inTimeRoft(ent, gisMapper.getCurCheckTime(), "", proType);

        map.put("proNums",proNums);
        map.put("raftNum",raftNum);//待确认
        map.put("rate",rate==null?0.0:rate);
        return map;
    }

    @Override
    public Map getCheckOrgData2(EntInfo ent) {
        int proNums = 0;//累计检测产品的数量
        int typeNum = 0;//检测产品型式数量
        Float rate = 0f;//监督抽查合格率

        if (!StrUtils.isBlank(ent.getPid())) {
            rate = gisMapper.getChcekRate(ent.getPid());
            proNums = gisMapper.countProNumByEnt(ent,null);
            typeNum = getProductTypes(ent, "");
        }
        Map map = new HashMap();
        map.put("proNums",proNums);
        map.put("typeNum",typeNum);
        map.put("rate",rate==null?0.00:rate);
        return map;
    }

    public int getProductTypes(EntInfo entInfo, String type) {
        ProCheckListExample proCheckListExample = new ProCheckListExample();
        ProCheckListExample.Criteria criteria = proCheckListExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getPid())) {
            criteria.andEntidEqualTo(entInfo.getPid());
        }
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        return proCheckListMapper.countByExample(proCheckListExample);
    }
    //各企业抽查情况点位
    @Override
    public Map getProCheckAnalysis1() {
        Map map = new HashMap();
        String checkTime = "";
        List dataList = new ArrayList();
        checkTime = gisMapper.getCurCheckTime();
        dataList = gisMapper.getProCheckAnalysis1(checkTime);
        map.put("checkTime",checkTime);
        map.put("dataList",dataList);
        return map;
    }
    //企业被抽查的详细信息
    @Override
    public Map getProCheckAnalysis2(EntInfo ent) {
        Map map = new HashMap();
        Float rate = 0f;//企业监督抽查合格率

        String curCheckTime = gisMapper.getCurCheckTime();//当前周期抽查时间
        String lastCheckTime = gisMapper.getLastCheckTime();//上一周期抽查时间
        rate = gisMapper.getChcekRate(ent.getPid());
        map = gisMapper.getEntInfo(ent);//获取企业名称,地址
        map.put("rate",rate);
        map.put("curResult",gisMapper.getChecResultByChecTime(ent.getPid(),curCheckTime));
        map.put("lastResult",gisMapper.getChecResultByChecTime(ent.getPid(),lastCheckTime));
        return map;
    }

    //各省检验工作完成率
    @Override
    public List getProCheckAnalysis3() {
        List list = new ArrayList();
//        String curCheckTime = gisMapper.getCurCheckTime();
//        list = gisMapper.getProCheckAnalysis3(curCheckTime);
        list = gisMapper.getProCheckAnalysis3(null);
        return list;
    }

    //各类企业抽查的进度柱状图
    @Override
    public Map getProCheckAnalysis4(String uid) {
        Map map = new HashMap();
        List list = new ArrayList();
        String rate = null;
        if (!StrUtils.isBlank(uid)&&!"0000000".equals(uid)){
            String curCheckTime = gisMapper.getCurCheckTime();
            list = gisMapper.getProCheckAnalysis4(curCheckTime,uid.substring(0,2)+"%");

            List<Map> rateList = gisMapper.getProCheckAnalysis3(uid.substring(0,2)+"%");
            if (rateList!=null&&rateList.size()>0){
                rate = rateList.get(0).get("RATE").toString();
            }
        }
        map.put("dataList", list);//已抽查企业和企业数量
        map.put("checkRate", rate);//监督抽查合格率
        return map;
    }

    @Override
    public Map getProductCreateData4(String uid) {
        Map map = new HashMap();
        List list = new ArrayList();
        int totalNum = 0;

        String likeStr = null;
        if (!StrUtils.isBlank(uid)&&!"0000000".equals(uid)){
            likeStr = uid.substring(0,2)+"%";
        }
        totalNum = gisMapper.countProEntNum(likeStr);
        list = gisMapper.getProductCreateData4(likeStr);
        map.put("totalNum", totalNum);
        map.put("dataList", list);
        return map;
    }

    @Override
    public List getGisTrainData5() {
        List<Map> list = new ArrayList();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        list = gisMapper.getGisTrainData5(year+"%",null);
        //检查是否有未解析的地址
        for (Map map:list) {
            String trainPlace = (String)map.get("TRAINPLACE");
            String posx = (String)map.get("POSX");
            //如果地址不为空,且坐标为空
            if (!StrUtils.isBlank(trainPlace)&&StrUtils.isBlank(posx)){
                //解析地址
                GisPoint baidu_XY = AddressUtil.getBaiDuXYInfo(trainPlace);
                if (baidu_XY!=null){
                    GisPoint gcj02_XY = AddressUtil.bd09togcj02(baidu_XY);
                    GisPoint wgs84_XY = AddressUtil.gcj02towgs84(gcj02_XY);
                    System.out.println(wgs84_XY.getLat()+","+wgs84_XY.getLng());
                    //更新map
                    map.put("POSX",wgs84_XY.getLng());
                    map.put("POSY",wgs84_XY.getLat());
                    //更新数据库数据
                    gisMapper.updateTrainPos(map);
                }
            }
        }
        return list;
    }

    @Override
    public List findTrainByName(String name) {
        List<Map> list = new ArrayList();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (!StrUtils.isBlank(name)){
            list = gisMapper.getGisTrainData5(year+"%","%"+name+"%");
        }
        return list;
    }

    @Override
    public List getOceanShipData1() {
        List list = new ArrayList();
        list = gisMapper.getOceanShipData1();
        return list;
    }
    //企业的渔船数量
    @Override
    public Map getOceanShipData2(String id) {
        Map map = new HashMap();
        Map ownerMap = new HashMap();
        Integer ownerScore = 0;//企业诚信得分
        if (!StrUtils.isBlank(id)) {
            ownerMap = gisMapper.getOceanOwnerInfo(id);//远洋渔船企业信息
            ownerScore = gisMapper.getScoreById(id, Const.HONEST_SCORE);
            if (ownerScore == null) {
                ownerScore = 0;
            }
        }
        ownerMap.put("score", ownerScore);
        map.put("ownerMap", ownerMap);

        Map shipMap = new HashMap();//远洋渔船拥有量,总功率,总吨位
        shipMap =gisMapper.getTotalById(id);
        float safeScore= 0f;//远洋渔船综合安全状况
        safeScore = gisMapper.getSafeScore(id);
        float checkRate = 0f;//远洋渔船一次检验合格率
        checkRate = shipCheckMapper.getYyShipFirtPassRate(null,Const.OCEAN_STR,null,id);
        List checkStatusList = gisMapper.getShipNum(id);//检验渔船情况
        Map safeRateMap = gisMapper.getSafeRateShipNum(id);//安全系数情况
        //暂无数据
        safeRateMap = new HashMap();
        safeRateMap.put("lowNum", 1);
        safeRateMap.put("middleNum", 20);
        safeRateMap.put("highNum", 124);

        map.put("shipMap", shipMap);
        map.put("safeScore", safeScore);
        map.put("checkRate", checkRate);
        map.put("checkStatusList", checkStatusList);
        map.put("safeRateMap", safeRateMap);

        return map;
    }

    @Override
    public List getDesignEntData1() {
        List list = new ArrayList();
        list = gisMapper.getPointInfo(Const.DESIGN_ENT_ABILITY_SCORE,Const.DESIGN_ENT_CATE);
        return list;
    }

    @Override
    public Map getDesignEntData2(String pid) {
        Map<String, Object> map = new HashMap<>();
        int drawings = 0;//设计图纸数;
        int drawBuildShips = 0;//图纸建造渔船数
        float drawFirstPassRate = 0f;//图纸一次通过率
        Integer technicians = 0;;//企业技术人员数

        DrawInfoExample drawInfoExample = new DrawInfoExample();
        DrawInfoExample.Criteria criteria = drawInfoExample.createCriteria();
        if (!StrUtils.isBlank(pid)) {
            criteria.andEntidEqualTo(pid);
        }
        drawings = this.drawInfoMapper.countByExample(drawInfoExample);
        drawBuildShips = this.drawInfoMapper.getShipsOfDrawBuid(pid);
        drawFirstPassRate = this.drawInfoMapper.getDrawPassRate(pid,1);//1待表一次通过率
        technicians = gisMapper.getTechniciansById(pid);
        technicians = technicians == null?0:technicians;
        map.put("drawings",drawings);
        map.put("drawBuildShips",drawBuildShips);
        map.put("drawFirstPassRate",drawFirstPassRate);
        map.put("technicians",technicians);
        return map;
    }
    //维修企业点位能力分布
    @Override
    public List getRepairEntData1() {
        List list = new ArrayList();
        list = gisMapper.getPointInfo(Const.BREPAIR_ENT_ABILITY_SCORE,Const.BREPAIR_ENT_CATE);
        return list;
    }
    //各省渔船修造企业数量
    @Override
    public List getRepairEntData2() {
        List list = gisMapper.getEntNumsGroupProvByCate(Const.BREPAIR_ENT_CATE);
        return list;
    }
    //各省渔船修造企业能力分布的饼状图数据接口
    @Override
    public List getRepairEntData3(String uid) {
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        List list = gisMapper.getRepairEntData3(likeStr);
        return list;
    }

    @Override
    public Map getRepairEntData4(String uid) {
        Map map = new HashMap();
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int repairTimes = gisMapper.countRepairTimes(likeStr);//维修渔船总船次
        int buildShipNums = gisMapper.countBuildShips(likeStr);//建造渔船数量
        BigDecimal bRate = BigDecimal.valueOf(0.00d);//建造渔船一次检验合格率
        BigDecimal rRate = BigDecimal.valueOf(0.00d);//渔船维修后首次检验一次检验合格率
        int entNums = 0;//渔船修造企业总数量

        //计算建造渔船一次检验合格率
        ShipCheckExample shipCheckExample = new ShipCheckExample();
        ShipCheckExample.Criteria criteria = shipCheckExample.createCriteria();
        criteria.andChecktypeEqualTo(Const.SHIP_CHECK_TYPE_FIR);
        if (!StrUtils.isBlank(likeStr)) {
            criteria.andOrgcodeLike(likeStr);
        }
        BigDecimal total = BigDecimal.valueOf(shipCheckMapper.countByExample(shipCheckExample));//建造后首次检验的渔船总数
        if (total.intValue()!=0) {
            criteria.andRc5EqualTo((short) 1);//查询首次检验就通过的次数
            BigDecimal bfNum = BigDecimal.valueOf(shipCheckMapper.countByExample(shipCheckExample)*100);
            bRate = bfNum.divide(total).setScale(2,BigDecimal.ROUND_HALF_UP);
        }

        //计算渔船维修后首次检验一次检验合格率
        total = gisMapper.countShipRepairs(likeStr,false);
        if (total.intValue()!=0) {
            BigDecimal rfNum = gisMapper.countShipRepairs(likeStr, true);
            rRate = rfNum.multiply(BigDecimal.valueOf(100)).divide(total).setScale(2, BigDecimal.ROUND_HALF_UP);
        }

        //计算渔船修造企业总数量
        EntInfoExample entInfoExample = new EntInfoExample();
        EntInfoExample.Criteria entCriteria = entInfoExample.createCriteria();
        entCriteria.andEntcateEqualTo(Const.BREPAIR_ENT_CATE);
        if (!StrUtils.isBlank(likeStr)) {
            entCriteria.andOrgcodeLike(likeStr);
        }
        entNums = entMapper.countByExample(entInfoExample);

        map.put("repairTimes", repairTimes);
        map.put("buildShipNums",buildShipNums );
        map.put("bRate", bRate);
        map.put("rRate",rRate );
        map.put("entNums",entNums );
        return map;
    }
    //远洋渔船位置分布
    @Override
    public List getOceanShipData3() {
        List list = gisMapper.getYYShipPos();
        return list;
    }

    //远洋渔船综合安全指数分布
    @Override
    public Map getOceanShipData4() {
        Map map = new HashMap();
        List<Map> list = gisMapper.getOceanShipData4();
        int highNums = 0;
        int middleNums = 0;
        int lowNums = 0;
        for (Map dataMap : list){
            double score = Double.parseDouble((String) dataMap.get("score"));
            if (score >= 0 && score <= 60) {
                lowNums++;
            } else if (score > 60 && score <= 80) {
                middleNums++;
            }else {
                highNums++;
            }
        }
        map.put("dataList",list);
        map.put("highNums",highNums);
        map.put("middleNums",middleNums);
        map.put("lowNums",lowNums);
        return map;
    }
    //远洋渔船点位信息和一次检验合格率
    @Override
    public Map getOceanShipData5() {
        Map map = new HashMap();
        List<Map> list = gisMapper.getOceanShipData5();
        int highNums = 0;
        int middleNums = 0;
        int lowNums = 0;
        for (Map dataMap : list){
            float score = ((BigDecimal) dataMap.get("checkRate")).floatValue();
            if (score >= 0 && score <= 60) {
                lowNums++;
            } else if (score > 60 && score <= 80) {
                middleNums++;
            }else {
                highNums++;
            }
        }
        map.put("dataList",list);
        map.put("highNums",highNums);
        map.put("middleNums",middleNums);
        map.put("lowNums",lowNums);
        return map;
    }
    //渔船船龄分布
    @Override
    public Map getOceanShipData6() {
        Map map = new HashMap();
        List<Map> list = gisMapper.getOceanShipData6();
        int ageNum1 = 0;//船龄15年以下
        int ageNum2 = 0;//15-25
        int ageNum3 = 0;//25-35
        int ageNum4 = 0;//35以上
        for (Map dataMap : list){
            int age = ((BigDecimal) dataMap.get("age")).intValue();
            if (age < 15) {
                ageNum1++;
            } else if (age >= 15 && age < 25) {
                ageNum2++;
            }else if (age >= 25 && age < 35){
                ageNum3++;
            }else{
                ageNum4++;
            }
        }
        map.put("dataList",list);
        map.put("ageNum1",ageNum1);
        map.put("ageNum2",ageNum2);
        map.put("ageNum3",ageNum3);
        map.put("ageNum4",ageNum4);
        return map;
    }


    //渔船检验状态分布
    @Override
    public Map getOceanShipData7() {
        Map map = new HashMap();
        List<Map> list = gisMapper.getOceanShipData7();
        int checkedNUms = 0;//已检
        int notchcekNums = 0;//脱检
        int checkingNums = 0;//待检
        for (Map dataMap : list) {
            String status = (String) dataMap.get("checkStatus");
            if ("1".equals(status)) {
                checkedNUms++;
            } else if ("2".equals(status)) {
                notchcekNums++;
            } else {
                checkingNums++;
            }
        }
        map.put("dataList",list);
        map.put("checkedNUms",checkedNUms);
        map.put("notchcekNums",notchcekNums);
        map.put("checkingNums",checkingNums);
        return map;

    }
    //各省渔船检验机构的图纸审查数量
    @Override
    public Map getDrawCheck1() {
        Map map = new HashMap();
        List list = gisMapper.getDrawCheck1();
        List stList = gisMapper.getStOrg();//审图中心信息

        map.put("proList", list);
        map.put("stList", stList);
        return map;
    }
    //各省图纸申请情况统计
    @Override
    public List getDrawCheck2(String uid) {
        String likeStr = OrgcodeUtil.getLikeStr(uid);
        List<Map> list = gisMapper.getDrawCheck2(likeStr);
        return list;
    }
    //境外检验点数据接口
    @Override
    public List getOceanShipData8() {
        List list = gisMapper.getOceanShipData8();
        return list;
    }
    //根据境外检验点编码获取检验团组的信息
    @Override
    public List getOceanShipData9(String orgcode) {
        List<Map> list = gisMapper.getAbroadGroupByOrgcode(orgcode);
        for (Map map:list) {
            Integer checkTime = 0;//团组驻检时间(天)
            Integer checkedShips = 0;//已检渔船数量
            String groupCode = (String) map.get("code");
            checkTime = gisMapper.getGroupCheckTime(groupCode);
            checkedShips = gisMapper.getCheckedShips(groupCode);
            if (checkTime == null) {
                checkTime = 0;
            }
            map.put("checkTime",checkTime);
            map.put("checkedShips",checkedShips);
        }
        return list;
    }
    //获取远洋渔船信息
    @Override
    public Map getOceanShipData10(String tName,String shipcode) {
        Map map = gisMapper.getOceanShipData10(tName,shipcode);
        //获取渔船综合安全指数
        String secScore = "";
        String lateBatch = capacityMapper.getLateBatch(shipcode,Const.SHIP_SECURITY_SCORE);
        if (!StrUtils.isBlank(lateBatch)) {
            CapacityExample capacityExample=new CapacityExample();
            CapacityExample.Criteria criteria=capacityExample.createCriteria();
            criteria.andBelongmodelEqualTo(Const.SHIP_SECURITY_SCORE);
            criteria.andBatchEqualTo(lateBatch);
            criteria.andRefidEqualTo(shipcode);
            secScore = capacityMapper.selectByExample(capacityExample).get(0).getScore();
        }
        if(map!=null){
            map.put("secScore",secScore);
        }
        return map;
    }
    //境外检验点检验的渔船列表
    @Override
    public Pager getOceanShipData11(Pager pager, String orgcode) {
        int page = pager.getPage();
        int rows = pager.getRows();
        List<Map<String,Object>> shipRepairInfo = this.gisMapper.getYYShips(page*rows,(page-1)*rows+1,orgcode);
        pager.setPagerInfo(shipRepairInfo,this.gisMapper.countYYShips(orgcode));
        return pager;
    }

    @Override
    public String getUrlByCate(String cate) {
        Map map = new HashMap();
        List list = new ArrayList();
        switch(cate){
            case "1":
                map.put("name","验船师当前培训分布");
                map.put("url","/gis/toGisCurrentTrain");
                list.add(map);
                map = new HashMap();
                map.put("name","渔船检验机构能力分布");
                map.put("url","/gis/constructionOrg");
                list.add(map);
                map = new HashMap();
                map.put("name","验船师人员能力分布");
                map.put("url","/gis/toGisSurAblity");
                list.add(map);
                map = new HashMap();
                map.put("name","验船师人员匹配分布");
                map.put("url","/gis/toGisSurveyor");
                list.add(map);
                map = new HashMap();
                map.put("name","验船师历史培训分布");
                map.put("url","/gis/toGisHistoryTrain");
                list.add(map);
                break;
            case "2":
                map.put("name","产品制造企业分布");
                map.put("url","/gis/toGisProCreate");
                list.add(map);
                map = new HashMap();
                map.put("name","产品监督抽查分析");
                map.put("url","/gis/toProChecAnalysis");
                list.add(map);
                map = new HashMap();
                map.put("name","筏站能力分布");
                map.put("url","/gis/toGisRaftStation");
                list.add(map);
                map = new HashMap();
                map.put("name","GMDSS维修站能力分布");
                map.put("url","/gis/toGisGMDSS");
                list.add(map);
                map = new HashMap();
                map.put("name","产品检验业务统计");
                map.put("url","/gis/toGisProduction");
                list.add(map);
                map = new HashMap();
                map.put("name","检测机构能力分布");
                map.put("url","/gis/toCheckOrg");
                list.add(map);
                break;
            case "3":
                map.put("name","渔船设计企业能力分布");
                map.put("url","/gis/toDesignCompany");
                list.add(map);
                map = new HashMap();
                map.put("name","渔船修造企业能力分布");
                map.put("url","/gis/toShipRepair");
                list.add(map);
                map = new HashMap();
                map.put("name","图纸审查统计分析");
                map.put("url","/gis/toDrawingCheck");
                list.add(map);
                break;
        }
        return JsonUtils.toJson(list);
    }

    @Override
    public List queryOceanShip(OceanShipParam param) {
        List list = new ArrayList();
        param.init();
        list = gisMapper.queryOceanShip(param);
        return list;
    }

    @Override
    public List getShipPortPos() {
        List list = gisMapper.getShipPortPos();
        return list;
    }

    @Override
    public List getSurShipHs(String bYear, String eYear) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        if (StrUtils.isBlank(bYear)) {
            GregorianCalendar gc=new GregorianCalendar();
            gc.setTime(date);
            gc.add(2,-1);
            bYear = sdf.format(gc.getTime());
        }
        if (StrUtils.isBlank(eYear)) {
            eYear = sdf.format(date);
        }
        List list = gisMapper.getSurShipHs(bYear, eYear);
        return list;
    }

    @Override
    public List getInShipPos(Object pos, String tName) {
        return gisMapper.getInShipPos(pos,tName);
    }

    @Override
    public List getShipTrack(Object pos,String tName) {
        return gisMapper.getShipTrack(pos,tName);
    }


    //检修期内救生筏数  检修期内救生筏数
    public int inTimeRoft(EntInfo entInfo, String checkTime, String checkTimeNext, String type) {
        int i = 0;
        ProductRepairExample productRepairExample = new ProductRepairExample();
        ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        if (!StrUtils.isBlank(entInfo.getPid())) {
            criteria.andEntidEqualTo(entInfo.getPid());
        }
        //判断是否处于检修期内
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println("判断是不是出于检修期内的时候用到的时间：" + format);
        criteria.andChecktimenextGreaterThanOrEqualTo(format);
        i = productRepairMapper.countByExample(productRepairExample);
        return i;
    }
}
