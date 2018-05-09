package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ProductsRecord;
import com.chinasofti.domain.ProductsRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductsRecordMapper {
    int countByExample(ProductsRecordExample example);

    int deleteByExample(ProductsRecordExample example);

    int insert(ProductsRecord record);

    int insertSelective(ProductsRecord record);

    List<ProductsRecord> selectByExample(ProductsRecordExample example);

    int updateByExampleSelective(@Param("record") ProductsRecord record, @Param("example") ProductsRecordExample example);

    int updateByExample(@Param("record") ProductsRecord record, @Param("example") ProductsRecordExample example);
}