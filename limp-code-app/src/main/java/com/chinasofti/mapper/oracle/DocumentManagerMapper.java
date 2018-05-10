package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DocumentManager;
import com.chinasofti.domain.DocumentManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentManagerMapper {
    int countByExample(DocumentManagerExample example);

    int deleteByExample(DocumentManagerExample example);

    int insert(DocumentManager record);

    int insertSelective(DocumentManager record);

    List<DocumentManager> selectByExample(DocumentManagerExample example);

    int updateByExampleSelective(@Param("record") DocumentManager record, @Param("example") DocumentManagerExample example);

    int updateByExample(@Param("record") DocumentManager record, @Param("example") DocumentManagerExample example);

    List<DocumentManager> getAllDocList();
}