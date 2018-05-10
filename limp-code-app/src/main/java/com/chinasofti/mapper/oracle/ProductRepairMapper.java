package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ProductRepair;
import com.chinasofti.domain.ProductRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductRepairMapper {
    int countByExample(ProductRepairExample example);

    int deleteByExample(ProductRepairExample example);

    int insert(ProductRepair record);

    int insertSelective(ProductRepair record);

    List<ProductRepair> selectByExample(ProductRepairExample example);

    int updateByExampleSelective(@Param("record") ProductRepair record, @Param("example") ProductRepairExample example);

    int updateByExample(@Param("record") ProductRepair record, @Param("example") ProductRepairExample example);
    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    int getEchartsCount(@Param("type") String type,@Param("year") String likeYear,@Param("like") String like);
}