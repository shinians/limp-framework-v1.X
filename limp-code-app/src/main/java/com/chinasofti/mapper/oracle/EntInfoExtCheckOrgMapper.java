package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtCheckOrg;
import com.chinasofti.domain.EntInfoExtCheckOrgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtCheckOrgMapper {
    int countByExample(EntInfoExtCheckOrgExample example);

    int deleteByExample(EntInfoExtCheckOrgExample example);

    int insert(EntInfoExtCheckOrg record);

    int insertSelective(EntInfoExtCheckOrg record);

    List<EntInfoExtCheckOrg> selectByExample(EntInfoExtCheckOrgExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtCheckOrg record, @Param("example") EntInfoExtCheckOrgExample example);

    int updateByExample(@Param("record") EntInfoExtCheckOrg record, @Param("example") EntInfoExtCheckOrgExample example);
}