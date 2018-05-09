package com.chinasofti.sevice;

import com.chinasofti.domain.*;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-4-27
 * Time: 下午4:47
 * To change this template use File | Settings | File Templates.
 */
public interface GISService {

    //获取检验机构坐标及基本信息
    Object getConstructionOrg(OrganInfo org);
    //获取各省机构统计信息
    Map getOrgData(OrganInfo org);
    //验船师数量匹配分布图数据接口
    List getGisSurData1(OrganInfo org);
    //各省机构数量统计 接口
    List getSurAbilityData1();
    //各省验船师能力得分分布图接口
    List getSurAbilityData2(OrganInfo org);
    //各省机构能力得分分布图 数据接口
    List getOrgData1(OrganInfo org);
    //验船师数量的详细统计
    List getGisSurData2(OrganInfo org);
    //各省机构数量 数据接口
    List getOrgData2();
    //各省渔船检验机构的验船师培训人次数量 数据接口
    List getGisTrainData1();
    //省验船师培训人次分布的饼状图
    List getGisTrainData2(OrganInfo org);
    //验船师培训人次 数据接口
    Map getGisTrainData3(OrganInfo org);
    //培训班的详细信息
    List getGisTrainData4(String orgcode);
    //各省渔船检验机构产品检验数量
    List getProductCheckData1();
    //专业分类统计验船师数量
    Map getSurAbilityData3(OrganInfo org);
    //产品类别分类统计各省渔船检验机构产品检验数量
    Map getProductCheckData2(OrganInfo org);
    //产品制造企业位置及基本信息
    List getProductCreateData1(String name);
    //全国各省制造企业数量
    List getProductCreateData2();
    //产品制造企业能力分布的饼状图
    List getProductCreateData3(OrganInfo org);
    //各省产品认可型号数量
    List getProductTypeData1();
    //各省产品认可型号数量统计
    Map getProductTypeData2(OrganInfo org);
    //GMDSS,筏站点位分布
    List getRaftStationData1(String entcate,String name);
    //获取筏站或GMDSS维修设备统计信息
    Map getRaftOrGMDSSData(EntInfo ent,String proType);
    //检测机构检测设备统计信息
    Map getCheckOrgData2(EntInfo ent);
    //各企业抽查情况点位
    Map getProCheckAnalysis1();
    //被抽查企业的详细信息
    Map getProCheckAnalysis2(EntInfo ent);
    //各省检验工作完成率
    List getProCheckAnalysis3();
    //各类企业抽查的进度柱状图
    Map getProCheckAnalysis4(String uid);
    //产品制造企业数量
    Map getProductCreateData4(String uid);
    //培训班点位信息
    List getGisTrainData5();
    //远洋渔船企业点位信息
    List getOceanShipData1();
    //企业的渔船数量
    Map getOceanShipData2(String id);
    //设计企业点位能力分布
    List getDesignEntData1();
    //设计渔船图纸数量统计
    Map getDesignEntData2(String pid);
    //维修企业点位能力分布
    List getRepairEntData1();
    //各省渔船修造企业数量
    List getRepairEntData2();
    //各省渔船修造企业能力分布的饼状图数据接口
    List getRepairEntData3(String uid);

    Map getRepairEntData4(String uid);

    //远洋渔船点位分布
    List getOceanShipData3();
    //远洋渔船综合安全指数分布
    Map getOceanShipData4();
    //远洋渔船点位信息和一次检验合格率
    Map getOceanShipData5();
    //渔船船龄分布
    Map getOceanShipData6();
    //渔船检验状态分布
    Map getOceanShipData7();
    //各省渔船检验机构的图纸审查数量
    Map getDrawCheck1();
    //各省图纸申请情况统计
    List getDrawCheck2(String uid);
    //境外检验点数据接口
    List getOceanShipData8();
    //根据境外检验点编码获取检验团组的信息
    List getOceanShipData9(String orgcode);
    //获取远洋渔船信息
    Map getOceanShipData10(String tName,String shipcode);
    //境外检验点检验的渔船列表
    Pager getOceanShipData11(Pager pager, String orgcode);

    String getUrlByCate(String cate);
    //远洋渔船高级查询
    List queryOceanShip(OceanShipParam param);

    List getShipPortPos();
    //人船握手基本信息
    List getSurShipHs(String bYear, String eYear);
    //获取屏幕内船位信息
    List getInShipPos(Object pos, String gnPosTab);
    //获取国内渔船轨迹数据
    List getShipTrack(Object pos,String tName);

    List findTrainByName(String name);
}
