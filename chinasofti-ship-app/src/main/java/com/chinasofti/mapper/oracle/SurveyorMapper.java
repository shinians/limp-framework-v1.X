package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.Credentials;
import com.chinasofti.domain.SurWorkRecord;
import com.chinasofti.domain.Surveyor;
import com.chinasofti.domain.SurveyorExample;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface SurveyorMapper {
    int countByExample(SurveyorExample example);

    int countSurWorkRecord(SurWorkRecord surWorkRecord);

    int deleteByExample(SurveyorExample example);

    int insert(Surveyor record);

    int insertSelective(Surveyor record);

    List<Surveyor> selectByExample(SurveyorExample example);

    List<Map<String,String>> getCertListByCerynum(Surveyor surveyor);

    List<SurWorkRecord> getSurWorkRecordByCertnum(SurWorkRecord surWorkRecord);

    List<Credentials> getCreListByCertnum(Surveyor surveyor);

    List<Credentials> getCreList(Surveyor surveyor);

    int updateByExampleSelective(@Param("record") Surveyor record, @Param("example") SurveyorExample example);

    int updateByExample(@Param("record") Surveyor record, @Param("example") SurveyorExample example);

    Integer countSurByOrgCode(@Param("likeStr") String likeStr);

    int getSurNumByMajor(@Param("likeStr")String likeStr,@Param("major") String major);
}