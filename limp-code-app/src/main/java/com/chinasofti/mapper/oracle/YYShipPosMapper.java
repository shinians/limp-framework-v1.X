package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ShipShow;
import com.chinasofti.domain.YYShipPos;
import com.chinasofti.domain.YYShipPosExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface YYShipPosMapper {
    int countByExample(YYShipPosExample example);

    int deleteByExample(YYShipPosExample example);

    int insert(YYShipPos record);

    int insertSelective(YYShipPos record);

    List<YYShipPos> selectByExample(YYShipPosExample example);

    int updateByExampleSelective(@Param("record") YYShipPos record, @Param("example") YYShipPosExample example);

    int updateByExample(@Param("record") YYShipPos record, @Param("example") YYShipPosExample example);

    void batchInsert(List<YYShipPos> posList);

    Map getByShipShow(@Param("ship")ShipShow ship);

    YYShipPos getByCode(@Param("shipcode")String shipcode);
}