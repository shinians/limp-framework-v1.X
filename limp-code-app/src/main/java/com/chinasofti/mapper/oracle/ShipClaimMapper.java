package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ShipClaim;
import com.chinasofti.domain.ShipClaimExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShipClaimMapper {
    int countByExample(ShipClaimExample example);

    int deleteByExample(ShipClaimExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShipClaim record);

    int insertSelective(ShipClaim record);

    List<ShipClaim> selectByExample(ShipClaimExample example);

    ShipClaim selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShipClaim record, @Param("example") ShipClaimExample example);

    int updateByExample(@Param("record") ShipClaim record, @Param("example") ShipClaimExample example);

    int updateByPrimaryKeySelective(ShipClaim record);

    int updateByPrimaryKey(ShipClaim record);
    //批量插入
    void batchInsert(List<ShipClaim> claimList);
}