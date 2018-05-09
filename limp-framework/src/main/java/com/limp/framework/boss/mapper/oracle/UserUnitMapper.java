package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.UserUnit;
import com.limp.framework.boss.domain.UserUnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserUnitMapper {
    int countByExample(UserUnitExample example);

    int deleteByExample(UserUnitExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserUnit record);

    int insertSelective(UserUnit record);

    List<UserUnit> selectByExample(UserUnitExample example);

    UserUnit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserUnit record, @Param("example") UserUnitExample example);

    int updateByExample(@Param("record") UserUnit record, @Param("example") UserUnitExample example);

    int updateByPrimaryKeySelective(UserUnit record);

    int updateByPrimaryKey(UserUnit record);
}