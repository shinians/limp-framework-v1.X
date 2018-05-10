package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfo;
import com.chinasofti.domain.GNShipPos;
import com.chinasofti.domain.OceanShipParam;
import com.chinasofti.domain.OrganInfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * GIS专题自定义sqlMapper
 */
public interface GISMapper {

    List getConstructionOrg(@Param("org") OrganInfo org);

    List countByOrgCode(@Param("orgcode") String likeStr, @Param("group") String group);

    List getGisSurData1();

    List getSurAbilityData1();

    List getSurAbilityData2(@Param("likeStr") String likeStr,@Param("year") String year);

    List getOrgData1(@Param("likeStr")String likeStr);

    List getOrgData2();

    List getGisSurData2(@Param("likeStr")String likeStr);

    List getGisTrainData1();

    List getGisTrainData2(@Param("likeStr")String likeStr);

    List getGisTrainData3(@Param("likeStr")String likeStr);
    int countGisTrainData3(@Param("likeStr")String likeStr);

    List getGisTrainData4(@Param("orgcode")String orgcode);

    List getProductCheckData1();

    List getSurAbilityData3(@Param("likeStr") String likeStr, @Param("groupField") String groupField,@Param("year") String year);

    List getSurAbilityData4(@Param("likeStr")String likeStr);

    List getProductCheckData2(@Param("likeStr")String likeStr);

    int countProductCheckData2(@Param("likeStr")String likeStr);
    //产品制造企业位置及基本信息
    List getProductCreateData1(@Param("name")String name);
    //全国各省制造企业数量
    List getProductCreateData2();
    //产品制造企业能力分布的饼状图
    List getProductCreateData3(@Param("likeStr")String likeStr);
    //各省产品认可型号数量
    List getProductTypeData1();

    //各省产品认可型号数量统计
    List getProductTypeData2(@Param("likeStr")String likeStr);
    //各省产品认可型号总数量
    int countProductTypeData2(@Param("likeStr")String likeStr);
    //GMDSS,筏站点位分布
    List getRaftStationData1(@Param("entcate") String entcate,@Param("name") String name);
    //GMDSS维修站或筏站维修的产品数量
    int countProNumByEnt(@Param("ent")EntInfo ent,@Param("proType")String proType);
    //当前周期监督抽查时间
    String getCurCheckTime();
    //各企业抽查情况点位
    List getProCheckAnalysis1(@Param("curCheckTime")String curCheckTime);
    //获取企业名称,地址
    Map getEntInfo(@Param("ent")EntInfo ent);
    //上一周期抽查时间
    String getLastCheckTime();
    //根据周期获取企业被抽查结果
    String getChecResultByChecTime(@Param("entid")String entid,@Param("checkTime")String checkTime);
    //企业监督抽查合格率
    Float getChcekRate(@Param("entid")String entid);
    //各省检验工作完成率
//    List getProCheckAnalysis3(@Param("checkTime")String checkTime);
    List getProCheckAnalysis3(@Param("orgcode") String orgcode);
    //各类企业抽查的进度柱状图
    List getProCheckAnalysis4(@Param("checkTime")String curCheckTime, @Param("likeStr")String likeStr);
    //产品制造企业数量
    List getProductCreateData4(@Param("likeStr")String likeStr);
    int countProEntNum(@Param("likeStr")String likeStr);
    //省份监督抽查合格率
    Float getProCheckRate(@Param("likeStr")String likeStr);

    List getGisTrainData5(@Param("year")String year,@Param("name") String name);

    List getOceanShipData1();
    //获取各省渔船检验机构数量(需要排除山东,上海审图中心,远洋协会,但orgcode未知,暂未排除)
    List getOceanShipData2();
    //远洋渔船企业信息
    Map getOceanOwnerInfo(@Param("id")String id);
    //根据refid和belongmodel查询得分
    Integer getScoreById(@Param("id")String id,@Param("belongModel") String belongModel);
    //远洋渔船拥有量,总功率,总吨位
    Map getTotalById(@Param("id")String id);
    //远洋渔船综合安全状况
    float getSafeScore(@Param("id")String id);
    //检验渔船情况
    List getShipNum(@Param("id")String id);
    //渔船综合安全指数情况
    Map getSafeRateShipNum(@Param("id")String id);
    //获取企业点位信息
    List getPointInfo(@Param("belongModel") String belongModel, @Param("entcate")String entcate);
    //企业技术人员数
    Integer getTechniciansById(@Param("pid")String pid);
    //获取各省企业数量
    List getEntNumsGroupProvByCate(@Param("entcate")String entcate);
    //各省渔船修造企业能力
    List getRepairEntData3(@Param("likeStr")String likeStr);
    //获取远洋渔船位置
    List getYYShipPos();
    //远洋渔船综合安全指数分布
    List getOceanShipData4();
    //远洋渔船点位信息和一次检验合格率
    List<Map> getOceanShipData5();
    //渔船船龄分布
    List<Map> getOceanShipData6();
    //各省渔船检验机构的图纸审查数量
    List getDrawCheck1();
    //各省图纸申请情况统计
    List getDrawCheck2(@Param("likeStr") String likeStr);
    //渔船检验状态分布
    List<Map> getOceanShipData7();
    //审图中心信息和审图中中心审查的图纸数量
    List getStOrg();
    //境外检验点数据接口
    List getOceanShipData8();
    //根据境外检验点编码获取检验团组的信息
    List getAbroadGroupByOrgcode(@Param("orgcode")String  orgcode);
    //获取远洋渔船信息
    Map getOceanShipData10(@Param("tName") String tName, @Param("shipCode") String shipCode);
    //团组驻检时间(天)
    Integer getGroupCheckTime(@Param("groupCode")String groupCode);
    //团组检验渔船数量
    Integer getCheckedShips(@Param("groupCode")String groupCode);
    //境外检验点检验的渔船列表
    List<Map<String,Object>> getYYShips( @Param("endRow") int endRow, @Param("beginRow") int beginRow, @Param("orgcode")String orgcode);
    int countYYShips(@Param("orgcode")String orgcode);

    //远洋渔船高级查询
    List queryOceanShip(@Param("param") OceanShipParam param);
    //获取船籍港位置信息
    List getShipPortPos();
    //人船握手基本信息查询
    List getSurShipHs(@Param("bYear")String bYear, @Param("eYear")String eYear);
    //从主题表获取验船师数量
    int getSurNumByOrg(@Param("likeStr") String likeStr,@Param("year") String year);
    //获取地图屏幕内的点位
    List getInShipPos(@Param("pos") Object pos,@Param("tName") String tName);
    //获取渔船轨迹数据
    List getShipTrack(@Param("pos") Object pos,@Param("tName")String tName);
    //更新培训地点坐标
    void updateTrainPos(@Param("map") Map map);

    int countRepairTimes(@Param("likeStr") String likeStr);

    int countBuildShips(@Param("likeStr") String likeStr);

    BigDecimal countShipRepairs(@Param("likeStr")String likeStr, @Param("isFir")boolean isFir);
}