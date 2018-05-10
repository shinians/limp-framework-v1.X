package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ShipCheck;
import com.chinasofti.domain.ShipCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShipCheckMapper {
    int countByExample(ShipCheckExample example);

    int countByExample1(@Param("likeStr") String orgid, @Param("yearLike")String yearLike);

    int deleteByExample(ShipCheckExample example);

    int insert(ShipCheck record);

    int insertSelective(ShipCheck record);

    List<ShipCheck> selectByExample(ShipCheckExample example);

    int updateByExampleSelective(@Param("record") ShipCheck record, @Param("example") ShipCheckExample example);

    int updateByExample(@Param("record") ShipCheck record, @Param("example") ShipCheckExample example);

    float getBuildFirstPassRate(@Param("pid")String pid,@Param("bYearsOld") int bYearsOld,@Param("eYearsOld") int eYearsOld);

    List<Map<String,String>> getShipCheckNumGroup(@Param("orgCode")String orgCode,@Param("startY") String startY, @Param("endY")String endY);
    //全国渔船检验量
    int countCheckShipsByYear(@Param("year") String year, @Param("uid")String uid);
    //远洋渔船一次检验合格率
    float getYyShipFirtPassRate(@Param("year")String year, @Param("workArea")String workArea,@Param("uid")String uid,@Param("ownerId")String ownerId);

    //实检渔船总数
    List countCheckShipNumsGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //实检登记渔船总吨位
    List getCheckTotalTonnagesGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //实检登记渔船总功率
    List getCheckTotalPowersGroupYear(@Param("bYear")String bYear, @Param("eYear")String eYear, @Param("likeStr")String likeStr);
    //按渔船材质分组获取新建渔船检验量
    List countCheckShipsGroupMaterial(@Param("year")String year,@Param("likeStr") String likeStr, @Param("jobArea")String jobArea);
    //按年份分组获取远洋渔船一次检验合格率分析
    List getOceanShipFirPassRateGroupYear(@Param("likeStr")String likeStr, @Param("bYear")String bYear, @Param("eYear")String eYear, @Param("jobArea")String jobArea);
    //远洋渔船企业一次检验合格率分析
    List<Map> getOceanEntFirPassRateGroupOwner(@Param("likeStr") String likeStr, @Param("year") String year,@Param("jobArea") String jobArea);
}