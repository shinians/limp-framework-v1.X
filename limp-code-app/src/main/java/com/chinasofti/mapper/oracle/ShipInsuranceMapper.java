package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ShipInsurance;
import com.chinasofti.domain.ShipInsuranceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShipInsuranceMapper {
    int countByExample(ShipInsuranceExample example);

    int deleteByExample(ShipInsuranceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShipInsurance record);

    int insertSelective(ShipInsurance record);

    List<ShipInsurance> selectByExample(ShipInsuranceExample example);

    ShipInsurance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShipInsurance record, @Param("example") ShipInsuranceExample example);

    int updateByExample(@Param("record") ShipInsurance record, @Param("example") ShipInsuranceExample example);

    int updateByPrimaryKeySelective(ShipInsurance record);

    int updateByPrimaryKey(ShipInsurance record);
    //批量插入
    void batchInsert(List<ShipInsurance> policyList);
}