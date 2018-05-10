package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShipMapper {
    int countByExample(ShipExample example);

    int deleteByExample(ShipExample example);

    int insert(Ship record);

    int insertSelective(Ship record);

    List<Ship> selectByExample(ShipExample example);

    int updateByExampleSelective(@Param("record") Ship record, @Param("example") ShipExample example);

    int updateByExample(@Param("record") Ship record, @Param("example") ShipExample example);

    //查询检验检验年数
    List<String> countCheckYear(ShipCheckShow shipCheckShow);

    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //检验记录分页
    int countShipCheck(ShipCheckShow shipCheckShow);



    //获取检验记录
    List<ShipCheckShow> getShipCheckList(ShipCheckShow shipCheckShow);

    //获取本人每年工作量
    List<Map<String,Object>> getMyWorkList(ShipCheck shipCheck);
    //获取检验工作量
    List<Map<String,Object>> getInsAllList(ShipCheck shipCheck);
    //获取每年检验人数
    List<Map<String,Object>> getPersonNum(ShipCheck shipCheck);

    //获取本人每年工作量(产品)
    List<Map<String,Object>> getMyWorkForProductList(ShipCheck shipCheck);
    //获取检验工作量(产品)
    List<Map<String,Object>> getInsAllForProductList(ShipCheck shipCheck);
    //获取每年检验人数(产品)
    List<Map<String,Object>> getPersonNumForProduct(ShipCheck shipCheck);

    //获取本人每年工作量(图纸)
    List<Map<String,Object>> getMyWorkForDrawList(ShipCheck shipCheck);
    //获取检验工作量(图纸)
    List<Map<String,Object>> getInsAllForDrawList(ShipCheck shipCheck);
    //获取每年检验人数(图纸)
    List<Map<String,Object>> getPersonNumForDraw(ShipCheck shipCheck);

    //获取检验船长统计图
    List<Map<String,Object>> getLengthList(ShipCheckShow shipCheckShow);
    //获取检验材质统计图
    List<Map<String,Object>> getmaterialList(ShipCheckShow shipCheckShow);
    //获取检验工作区域统计图
    List<Map<String,Object>> getJobAreaList(ShipCheckShow shipCheckShow);

    //按照船长和id查询
    List<Map<String,Object>> countByLength(List<String> shipIds);
    //按照材质和id查询
    List<Map<String,Object>> countByMeterial(List<String> shipIds);
    //按照作业区域和id查询
    List<Map<String,Object>> countByWorkarea(List<String> shipIds);

    //获取渔船首次维修后一次检验合格率
    List<Map<String,Object>> getFirstPassGroupRate(@Param("shipIds") List<String> shipIds, @Param("beginYear") String beginYear, @Param("endYear") String endYear);

    //获取渔船总的首次维修后一次检验合格率
    Map getFirstPassRate(@Param("shipIds")List<String> shipIds);

    //通过建造企业获取shipids
    List<String> getShipIdsByBulEntId(@Param("pid")String pid);

    //获取维修企业建造的渔船数量
    List<Map<String,Object>> countTimesGroupYear(@Param("pid")String pid,@Param("beginYear") String beginYear, @Param("endYear")String endYear);
    //获取维修企业建造渔船的检验合格率
    List<Map<String,Object>> countRatesGroupYear(@Param("pid")String pid,@Param("beginYear") String beginYear, @Param("endYear")String endYear,@Param("beginLength")int beginLength,@Param("endLength")int endLength);
    //获取渔船基本信息(渔船追溯)
    ShipShow getShipinfo(ShipShow ship);
    //年份分组获取渔船总数
    List countShipNumsGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //年份分组获取渔船总吨位
    List getTotalTonnagesGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //年份分组获取渔船总功率
    List getTotalPowersGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //渔船船龄统计分析
    List getShipYearsOld(@Param("curYear") int curYear, @Param("likeStr") String likeStr,@Param("jobArea") String jobArea);
    //长度和工作区域分组获取船的数量
    List getShipNumsGroupLenAre(@Param("likeStr")String likeStr, @Param("year")String year);
    //获取渔船所有产品信息列表(产品追溯)
    List<ProductShow> getProductsList(ShipShow ship);
    //获取渔船所有产品信息列表(产品追溯)
    List<ProductShow> getProductsByScpt(ProductShow productShow);
    //获取渔船所有产品信息列表(产品追溯)
    List<Map> getProductsGroupPt(ProductShow productShow);
    //获取渔船所有产品信息列表(产品追溯)
    List<ProductShow> getProChcByCt(ShipShow ship);
    //根据产品编码获取产品信息
    ProductShow getProductShow(ProductShow ps);
    //获取产品类别
    List<Map<String,String>> getCplbList();

    //获取示范渔船图片和渔船信息
    List<Map> getExampleShipPics(@Param("pid")String pid,@Param("typeNum") String typeNum);

    //追溯渔船生命周期
    List<ShipTrace> getShipTraceList(ShipShow ship);
    //追溯产品生命周期
    List<ProductTrace> getProductTraceList(ProductShow ps);


	 int getShipChecknum(@Param("uid")String uid);
    int getInspectListCount(ShipCheckShow sh);

    List<Map<String,String>> getInspectList(ShipCheckShow sh);


    //获取渔船基本信息(渔船编码)
    Ship getShipDetail(Ship ship);

    //根据产品编码获取产品信息
    Map getProductinfo(ProductShow ps);

    //根据产品编码获取产品追溯信息
    List<Map<String,String>> getProductHistory(ProductShow ps);

}