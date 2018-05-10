package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntProHistory;
import com.chinasofti.domain.EntProHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntProHistoryMapper {
    int countByExample(EntProHistoryExample example);

    int deleteByExample(EntProHistoryExample example);

    int insert(EntProHistory record);

    int insertSelective(EntProHistory record);

    List<EntProHistory> selectByExample(EntProHistoryExample example);

    int updateByExampleSelective(@Param("record") EntProHistory record, @Param("example") EntProHistoryExample example);

    int updateByExample(@Param("record") EntProHistory record, @Param("example") EntProHistoryExample example);

    //自定义方法↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    int getCpzzCountByYear(@Param("entcate")String entcate , @Param("endTime") String endTime,@Param("like") String like);
}