package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.GNShipPos;
import com.chinasofti.domain.GNShipPosExample;
import java.util.List;
import java.util.Map;

import com.chinasofti.domain.ShipShow;
import org.apache.ibatis.annotations.Param;

public interface GNShipPosMapper {
    int countByExample(GNShipPosExample example);

    int deleteByExample(GNShipPosExample example);

    int insert(GNShipPos record);

    int insertSelective(GNShipPos record);

    List<GNShipPos> selectByExample(GNShipPosExample example);

    int updateByExampleSelective(@Param("record") GNShipPos record, @Param("example") GNShipPosExample example);

    int updateByExample(@Param("record") GNShipPos record, @Param("example") GNShipPosExample example);

    String getCodeByName(@Param("name") String name);

    List<Map<String, String>> getShipMapList();

    int insertGNShipPosList(List<GNShipPos> gnShipPosList);

    Map getByShipShow(@Param("ship")ShipShow ship);
    //根据渔船编码获取位置
    GNShipPos getByCode(@Param("shipcode")String shipcode);
}