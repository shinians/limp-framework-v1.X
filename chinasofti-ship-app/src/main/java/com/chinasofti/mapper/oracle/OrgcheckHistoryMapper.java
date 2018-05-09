package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.OrgcheckHistory;
import com.chinasofti.domain.OrgcheckHistoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface OrgcheckHistoryMapper {
    int countByExample(OrgcheckHistoryExample example);

    int deleteByExample(OrgcheckHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgcheckHistory record);

    int insertSelective(OrgcheckHistory record);

    List<OrgcheckHistory> selectByExample(OrgcheckHistoryExample example);

    OrgcheckHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgcheckHistory record, @Param("example") OrgcheckHistoryExample example);

    int updateByExample(@Param("record") OrgcheckHistory record, @Param("example") OrgcheckHistoryExample example);

    int updateByPrimaryKeySelective(OrgcheckHistory record);

    int updateByPrimaryKey(OrgcheckHistory record);
}