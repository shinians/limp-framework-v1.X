package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.OrgCertificate;
import com.chinasofti.domain.OrgCertificateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgCertificateMapper {
    int countByExample(OrgCertificateExample example);

    int deleteByExample(OrgCertificateExample example);

    int insert(OrgCertificate record);

    int insertSelective(OrgCertificate record);

    List<OrgCertificate> selectByExample(OrgCertificateExample example);

    int updateByExampleSelective(@Param("record") OrgCertificate record, @Param("example") OrgCertificateExample example);

    int updateByExample(@Param("record") OrgCertificate record, @Param("example") OrgCertificateExample example);
}