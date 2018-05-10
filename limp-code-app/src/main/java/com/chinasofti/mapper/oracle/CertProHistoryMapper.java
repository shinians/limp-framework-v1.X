package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.CertProHistory;
import com.chinasofti.domain.CertProHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CertProHistoryMapper {
    int countByExample(CertProHistoryExample example);

    int deleteByExample(CertProHistoryExample example);

    int insert(CertProHistory record);

    int insertSelective(CertProHistory record);

    List<CertProHistory> selectByExample(CertProHistoryExample example);

    int updateByExampleSelective(@Param("record") CertProHistory record, @Param("example") CertProHistoryExample example);

    int updateByExample(@Param("record") CertProHistory record, @Param("example") CertProHistoryExample example);
}