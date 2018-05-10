package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.OrganInfo;
import com.chinasofti.domain.OrganInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrganInfoMapper {
    int countByExample(OrganInfoExample example);

    int deleteByExample(OrganInfoExample example);

    int insert(OrganInfo record);

    int insertSelective(OrganInfo record);

    List<OrganInfo> selectByExample(OrganInfoExample example);

    int updateByExampleSelective(@Param("record") OrganInfo record, @Param("example") OrganInfoExample example);

    int updateByExample(@Param("record") OrganInfo record, @Param("example") OrganInfoExample example);

    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //新增  统计辖区内 分布情况统计
    List<Map<String,String>> getGroupNum(@Param("group") String group, @Param("orgCode") String orgCode,@Param("date") String date);

    //机构检验专题 机构数量统计
    List<Map<String,Object>> getCountByLev(@Param("like") String like,@Param("year") String year);

    //@Param
    List<Map<String, String>> getYCSMatchRate(@Param("orgCode")String orgCode, @Param("startY")String startY,@Param("endY") String endY,@Param("line") String line);

    List<Map> eChartsData10(@Param("likeStr") String likeStr, @Param("year") String year,@Param("orgcode") String orgcode);

    List orgEchartsData11(@Param("likeStr")String orginfo);

    //获取证书有效的机构的机构能力平均分
    Float getOrgAvgScore(@Param("likeStr")String like, @Param("year")String year);

    Integer getOrgNums(@Param("likeStr")String like, @Param("year")String year);
}