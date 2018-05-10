package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TrainMapper {

    int countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    int insert(Train record);

    int insertSelective(Train record);

    String getSurTrainnumByCertnum(Surveyor surveyor);

    List<Train> selectByExample(TrainExample example);

    List<SurTrainShow> getSurTrainByCertnum(SurTrainShow surTrainShow);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);

    int getSurtrainRecordCount(@Param("procode") String procode, String codeTransPre);// 累计培训总人次

    int getSurtrainRecordCountByYear(@Param("year") String year, @Param("procode") String procode);// 年度培训总人数

    int getPERCENT(@Param("procode") String procode);// 培训平均完成率

    List<Map<String, String>> getPercentStatistics(@Param("orderBy") String orderBy, @Param("procode") String procode);// 获取培训完成率统计图统计数据8个

    int getPlannumByYear(@Param("year") String year, @Param("procode") String procode);// 年度培训计划人数,cis_traininfo

    List<Map<String, String>> getTrainRateStatistics(@Param("year") String year, @Param("ids") List<String> ids, @Param("orderBy") String orderBy, @Param("procode") String procode);// 获取培训执行进度表统计数据5个

    List<Map<String, String>> getTrainNames(@Param("year") String year, @Param("procode") String procode);// 获取培训班名称列表,cis_train_rate

    int getTrainingNumByTrainid(@Param("trainid") String trainid);// 获取实际培训总人数

    String getTrainingNameByTrainid(@Param("trainid") String trainid);// 获取实际培训班名称,cis_surtrain_record

    List<Map<String, String>> getTrainingNamesByYear(@Param("year") String year, @Param("procode") String procode);// 获取实际培训班名称列表,cis_surtrain_record

    List<String> getTrainbaseByYear(@Param("year") String year, @Param("procode") String procode);// 获取培训基地名称列表

    int getSurtrainRecordCountByTrainbaseAndYear(@Param("trainbase") String trainbase, @Param("year") String year, @Param("procode") String procode);// 获取培训基地培训人次

    int getType1NumByTrainbaseAndYear(@Param("trainbase") String trainbase, @Param("year") String year);// 获取培训基地验船师数量

    int getType2NumByTrainbaseAndYear(@Param("trainbase") String trainbase, @Param("year") String year);// 获取培训基地教师数量

    List<Map<String, String>> getCTENames(@Param("year") String year, @Param("procode") String procode);// 获取培训班名称列表

    List<Map<String, String>> getCTEByUID(@Param("year") String year, @Param("id") String id);// 获取培训班评价信息

    int getPersonnumCount(@Param("procode") String procode);// 培训需求总人数

    List<String> getTrainDemandIdByYear(@Param("year") String year, @Param("procode") String procode);// 获取培训需求名称列表8个

    List<Map<String, Object>> getTrainDemandByYear(@Param("year") String year, @Param("sid") String sid);// 获取培训需求分析图统计数据

    List<Map<String, Object>> getTrainPlanningByYear(@Param("year") String year, @Param("procode") String procode);// 获取培训规划统计图统计数据，从当前年份开始未来5年。

    List<String> getCTETypenames(@Param("year") String year, @Param("procode") String procode);// 获取培训班评价类型名称列表

    String getCTENameByUID(@Param("id") String id);// 获取培训班名称,cis_train_evaluate

    String getNameByCode(@Param("code") String code);// 根据code获取名称

    List<String> getYCSorgcodeByYear(@Param("year") String year, @Param("procode") String procode);// 获取验船师缺口名称列表8个

    List<Map<String, Object>> getYCSgapByYear(@Param("year") String year, @Param("scode") String scode);// 获取验船师缺口统计图统计数据
}