package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ProCheckList;
import com.chinasofti.domain.ProCheckListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProCheckListMapper {
    int countByExample(ProCheckListExample example);

    int deleteByExample(ProCheckListExample example);

    int insert(ProCheckList record);

    int insertSelective(ProCheckList record);

    List<ProCheckList> selectByExample(ProCheckListExample example);

    int updateByExampleSelective(@Param("record") ProCheckList record, @Param("example") ProCheckListExample example);

    int updateByExample(@Param("record") ProCheckList record, @Param("example") ProCheckListExample example);

    //自定义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    //获取产品类型
    List<String> getProductTypes(String entid);
    //获取产品名称
    List<String> getProductNames(@Param("entid")String entid, @Param("name")String name);
    //获取产品证书
    List<String> getCrets(@Param("entid")String entid, @Param("name")String name);
}