package com.chinasofti.sevice;

import com.chinasofti.domain.BiManage;
import com.chinasofti.domain.OrganInfo;
import com.chinasofti.domain.ThemYcsJBXX;
import com.limp.framework.core.abs.AbstractService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-1
 * Time: 下午7:16
 * To change this template use File | Settings | File Templates.
 */
public interface BiManageService extends AbstractService<BiManage> {
    /**
     * 验船师持证总人数
     * @param themYcsJBXX
     * @return
     */
    List<Map<String,String>> getYcsNumGroupByYear(ThemYcsJBXX themYcsJBXX);

    /**
     * 各级持证验船师学历结构情况
     * @param themYcsJBXX
     * @return
     */
    List<Map<String,String>> getYcsXLGroupIndex(ThemYcsJBXX themYcsJBXX);

    /**
     *  所在机构管辖范围内的验船师按照级别分类、按照学历分类的数量构成
     * @param themYcsJBXX
     * @return
     */
    List<Map<String,String>> getYcsCateIndex(ThemYcsJBXX themYcsJBXX);

    //法律法规bi，获取数据
    Map<String,Object> getLayBiData();

    //检验机构↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //关键信息
    Map<String,Object> getOrgData(String uid);
    //图表1
    Map<String,Object> eChartsData1(String uid, String year);
    //图表2
    Map<String,Object> eChartsData2();
    //图表3
    Map<String,Object> eChartsData3(String uid,String startYear,String endYear);
    //图表4
    Map eChartsData4(String uid, String year);
    //图表5
    Map<String,Object> eChartsData5();
    //图表6
    Map<String,Object> eChartsData6(String uid,String startYear,String endYear);
    //图表7
    Map<String,Object> eChartsData7(String uid);
    //图表8
    List eChartsData8(String uid);
    //图表9
    List eChartsData9(String uid, String bYear, String eYear);

    //检验机构↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    //产品检验专题↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    //获取数据
    Map<String,Object> getProCheckData(String uid);
    //图形1：产品制造企业认可数量分析图
    Map<String,Object> echatsCpzzData(String startYear,String endYear,String uid,String flag);
    //图形2：产品检测检修机构认可数量分析图
    Map<String,Object> echatsCheckCountData(String year,String uid);
    //图形3：产品设备类检验数量分析图
    Map<String,Object> echatsCheckData(String startYear,String endYear,String uid);
    //图形4：产品设备类维修数量分析图
    Map<String,Object> echatsRepairData(String type,String startYear,String endYear,String uid);
    //图形5：产品质量监督抽查合格率分析图
    Map<String,Object> echatsCheckPersentData(String startYear,String endYear,String uid);
    //产品检验bi图形6：救生筏海难救助情况统计
    Map<String,Object> echatsHelpData(String startYear,String endYear);

    //产品检验↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    //获取图纸审查套数
    int countDrawsByYear(String lastYear);

    //单位数量
    int countEntNumsByEntcate(String entcate);

    //国内海洋渔船标准化程度平均分
    float getStandardScore(String type,String model);

    //图纸审查数量分析图数据
    Map getDrawNumsGroupYear(String bYear, String eYear);

    //获取图纸审查数量
    List<Map> getDrawCheckNumsByYear(String year,String orgCode);

    //按省分组获取企业数量
    List<Map> getEntNumsGroupPrv(String year, String entcate);

    //获取各省图纸审查数量
    List<Map> getDrawNumsGroupPrv(String year);

    //审图中心图纸审查一次合格率
    Map getDrawFirPassRate(String bYear, String eYear);
    //新建渔船标准化分析图
    Map getNewShipCapacityScore(String year);
    //获取检验管理专题页面基本信息
    Map<String,Object> getCheckManageInfo(String uid);

    //渔船拥有量分析图
    Map<String,Object> getShipInfos(String bYear, String eYear, String uid);
    //渔船检验工作量分析图
    Map<String,Object> shipCheckWorks(String bYear, String eYear, String uid);
    //新建渔船检验工作量分析
    Map<String,Object> getNewShipChecks(String year, String uid);
	//渔船船龄统计分析
    List getShipYearsOld(String uid, String jobArea);
    //远洋渔船一次检验合格率分析
    Map getOceanShipFirPassRate(String uid, String bYear, String eYear);
    //远洋渔船企业一次检验合格率分析
    Map getOceanEntFirPassRate(String uid, String year);
    //渔船检验工作完成率
    BigDecimal getshipCheckWorkRate(String uid);
    //渔业船舶拥有量分析图
    Map getOceanShipSecurityScore(String uid, String year);
    //远洋渔船综合安全指数高位分布图数据接口
    Map getOceanShipSecurityScoreDes(String uid, String year);

    List<Map<String,Object>> selectListMapByMethod(String method,Map<String,Object>params);
    //渔业船舶拥有量分析图
    List getShipNumsGroups(String uid, String year);

    List eChartsData10(OrganInfo org);

    List orgEchartsData11(OrganInfo orginfo);

    Map getYcsInitData(String uid,String years);
    //验船师缺口人数k线图数据接口
    Map getYcsQkrsData(String uid);
    //验船师评分占比图
    Map getYcsScoreData(String uid);
}
