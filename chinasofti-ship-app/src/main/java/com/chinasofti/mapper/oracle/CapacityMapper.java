package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.Capacity;
import com.chinasofti.domain.CapacityExample;
import java.util.List;

import com.chinasofti.domain.Surveyor;
import org.apache.ibatis.annotations.Param;

public interface CapacityMapper {
    int countByExample(CapacityExample example);

    int deleteByExample(CapacityExample example);

    int deleteByPrimaryKey(String id);

    int insert(Capacity record);

    int insertSelective(Capacity record);

    List<Capacity> selectByExample(CapacityExample example);

    Capacity selectByPrimaryKey(String id);

    String getLateBatch(@Param("refid") String refid, @Param("belongModel") String belongModel);

    String getScoreByCertnum(Surveyor surveyor);

    List<Capacity> getCapacityByCertnum(Capacity capacity);

    int updateByExampleSelective(@Param("record") Capacity record, @Param("example") CapacityExample example);

    int updateByExample(@Param("record") Capacity record, @Param("example") CapacityExample example);

    int updateByPrimaryKeySelective(Capacity record);

    int updateByPrimaryKey(Capacity record);

    /**
     * 根据refid查询所有的子类：注意一定是tye为1的大类 【确定唯一】
     * @param refid
     * @return
     */
    List<Capacity> getModelCapacitList(@Param("refid") String refid);

    //检验机构专题
    //拿到最新的能力评估时间
    int getMaxDate();
    //获取渔船标准化平均分
    float getStandardScore(@Param("type")String type, @Param("model")String model);
    //新建渔船标准化分析图
    float getNewShipCapacityScore(@Param("provCode")String provCode, @Param("bScore")int bScore,@Param("eScore") int eScore,@Param("year")String year);
    int getNewShipCapacityNums(@Param("provCode")String provCode, @Param("bScore")int bScore,@Param("eScore") int eScore,@Param("year")String year);
    //远洋渔船综合安全系数分析图
    List getOceanShipSecurityScore(@Param("likeStr")String likeStr, @Param("year")String year,@Param("jobArea") String jobArea);
    //远洋渔船综合安全指数高位分布
    List getOceanShipSecurityScoreDES(@Param("likeStr")String likeStr, @Param("year")String year,@Param("jobArea") String jobArea);
    //验船师能力平均分
    Float getSurAvgScore(@Param("likeStr")String likeStr);

    int getOrganScore(@Param("likeStr")String likeStr);
}