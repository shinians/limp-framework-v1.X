package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawInfo;
import com.chinasofti.domain.DrawInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DrawInfoMapper {
    int countByExample(DrawInfoExample example);

    int deleteByExample(DrawInfoExample example);

    int insert(DrawInfo record);

    int insertSelective(DrawInfo record);

    List<DrawInfo> selectByExample(DrawInfoExample example);

    int updateByExampleSelective(@Param("record") DrawInfo record, @Param("example") DrawInfoExample example);

    int updateByExample(@Param("record") DrawInfo record, @Param("example") DrawInfoExample example);

    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //查询图纸建造船数
    int getShipsOfDrawBuid(@Param("pid")String pid);

    //查询图纸通过率
    float getDrawPassRate(@Param("pid")String pid,@Param("nums")int nums);

    //查询企业设计图纸列表
    List getDrawInfoByEntId(@Param("pid")String pid, @Param("endRow")int endRow, @Param("beginRow")int beginRow, @Param("keyWord")String keyWord);
    int countDrawInfoByEntId(@Param("pid")String pid, @Param("keyWord")String keyWord);

    //获取图纸建造的渔船信息
    List getDrawBuildByEntId(@Param("pid")String pid, @Param("endRow")int endRow, @Param("beginRow")int beginRow, @Param("keyWord")String keyWord);
    int countDrawBuildByEntId(@Param("pid")String pid, @Param("keyWord")String keyWord);

    //获取图纸数量
    int countByApprTimeYear(@Param("lastYear")String lastYear);

    //分组查询图纸数量
    List<Map<String,String>> countDrawsGroupYear(@Param("bYear")int bYear, @Param("eYear")int eYear, @Param("jobArea")String jobArea);
}