package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.BiManage;
import com.chinasofti.domain.BiManageExample;
import com.chinasofti.domain.OrganInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BiManageMapper {
    int countByExample(BiManageExample example);

    int deleteByExample(BiManageExample example);

    int insert(BiManage record);

    int insertSelective(BiManage record);

    List<BiManage> selectByExample(BiManageExample example);

    int updateByExampleSelective(@Param("record") BiManage record, @Param("example") BiManageExample example);

    int updateByExample(@Param("record") BiManage record, @Param("example") BiManageExample example);

    Float getSurCompatibility(@Param("likeStr") String likeStr);

    Double getAvgShipNums(@Param("likeStr") String likeStr);
    //按年分组获取检验工作完成率
    List<Map> getCheckRateGroupYear(@Param("likeStr") String likeStr, @Param("startYear")String startYear, @Param("endYear")String endYear);
}