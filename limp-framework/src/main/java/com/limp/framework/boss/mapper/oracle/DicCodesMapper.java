package com.limp.framework.boss.mapper.oracle;


import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.boss.domain.DicCodesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DicCodesMapper {
    int countByExample(DicCodesExample example);

    int deleteByExample(DicCodesExample example);

    int insert(DicCodes record);

    int insertSelective(DicCodes record);

    List<DicCodes> selectByExampleByMsql(DicCodesExample example);


    List<DicCodes> selectByExample(DicCodesExample example);

    int updateByExampleSelective(@Param("record") DicCodes record, @Param("example") DicCodesExample example);

    int updateByExample(@Param("record") DicCodes record, @Param("example") DicCodesExample example);
}