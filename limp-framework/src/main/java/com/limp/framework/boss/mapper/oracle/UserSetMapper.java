package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.UserSet;
import com.limp.framework.boss.domain.UserSetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserSetMapper {
    int countByExample(UserSetExample example);

    int deleteByExample(UserSetExample example);

    int insert(UserSet record);

    int insertSelective(UserSet record);

    List<UserSet> selectByExample(UserSetExample example);

    public List<Map<String, Object>> selectUserSetByUserId(@Param("userId") String userId);

    public List<UserSet> selectUserSetByIDKeyWord(@Param("userId") String userId, @Param("keyWord") String keyWord);

    int updateByExampleSelective(@Param("record") UserSet record, @Param("example") UserSetExample example);

    int updateByExample(@Param("record") UserSet record, @Param("example") UserSetExample example);
}