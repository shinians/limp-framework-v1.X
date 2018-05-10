package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ShipRepair;
import com.chinasofti.domain.ShipRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShipRepairMapper {
    int countByExample(ShipRepairExample example);

    int deleteByExample(ShipRepairExample example);

    int insert(ShipRepair record);

    int insertSelective(ShipRepair record);

    List<ShipRepair> selectByExample(ShipRepairExample example);

    int updateByExampleSelective(@Param("record") ShipRepair record, @Param("example") ShipRepairExample example);

    int updateByExample(@Param("record") ShipRepair record, @Param("example") ShipRepairExample example);
    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //获得维修渔船ids
    List<String> getShipIdsByEnt(@Param("pid")String pid);

    //按照年份分类查询维修次数
    List<Map<String, Object>> countTimesGroupYear(@Param("pid")String pid, @Param("beginYear")String beginYear, @Param("endYear") String endYear);
    //按照年份分类查询维修后首次校验合格率
    List<Map<String, Object>> countRatesGroupYear(@Param("pid")String pid, @Param("beginYear")String beginYear, @Param("endYear") String endYear,@Param("beginLength")int beginLength,@Param("endLength")int endLength);

    //获取企业维修过的渔船信息
    List<Map<String,Object>> selectByEntId(@Param("pid") String pid, @Param("endRow") int endRow, @Param("beginRow") int beginRow, @Param("shipName")String shipName);
    int countByEntId(@Param("pid")String pid,@Param("shipName")String shipName);

}