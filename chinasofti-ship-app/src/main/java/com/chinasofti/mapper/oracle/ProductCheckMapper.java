package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfo;
import com.chinasofti.domain.ProductCheck;
import com.chinasofti.domain.ProductCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductCheckMapper {
    int countByExample(ProductCheckExample example);

    int deleteByExample(ProductCheckExample example);

    int insert(ProductCheck record);

    int insertSelective(ProductCheck record);

    List<ProductCheck> selectByExample(ProductCheckExample example);

    int updateByExampleSelective(@Param("record") ProductCheck record, @Param("example") ProductCheckExample example);

    int updateByExample(@Param("record") ProductCheck record, @Param("example") ProductCheckExample example);

    List getCpzzPercent(@Param("ent")EntInfo ent, @Param("productCheck")ProductCheck productCheck, @Param("bYear")String bYear,@Param("eYear")String eYear);

    int getCountByExas(@Param("ejfl")String ejfl,@Param("checkType")List<String> checkType,@Param("orgType")String orgType,@Param("checkTime")String checkTime);

    List<Map> getProductCheckGroup(@Param("checkType")List<String> checkType,@Param("orgCode")String orgCode,@Param("startYear")String startYear,@Param("endYear")String endYear);

    int getProNumsByOrgCode(@Param("likeStr")String likeStr);
}