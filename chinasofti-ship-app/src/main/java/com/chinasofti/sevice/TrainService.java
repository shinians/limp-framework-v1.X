package com.chinasofti.sevice;

import com.chinasofti.domain.*;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * 培训service层
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface TrainService extends AbstractService<Ship> {

    /**
     * 根据身份证号获取验船师培训期数
     * @param surveyor
     * @return
     */
    public String getSurTrainnum(Surveyor surveyor);

    /**
     * 获取验船师培训记录
     * @param surTrainShow
     * @return
     */
    public List<SurTrainShow> getSurTrainList(SurTrainShow surTrainShow);

    /**
     * 获取4个核心指标
     *
     * @param procode
     * @return
     */
    public Map<String, String> getCoreNum(String procode);

    /**
     * 获取培训人次统计图统计数据
     *
     * @param procode
     * @param startDate
     * @param endDate
     * @return
     */
    public List<Map<String, String>> getTrainingNumStatistics(String procode, String startDate, String endDate);

    /**
     * 获取培训完成率统计图统计数据
     *
     * @param orderBy
     * @param procode
     * @return
     */
    public List<Map<String, String>> getPercentStatistics(String orderBy, String procode);

    /**
     * 获取培训执行进度表统计数据
     *
     * @param ids
     * @param orderBy
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainRateStatistics(List<String> ids, String orderBy, String procode);

    /**
     * 获取培训班名称列表
     *
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainNames(String procode);

    /**
     * 获取实际培训统计图统计数据
     *
     * @param year
     * @param ids
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainingNumStatisticsByYear(String year, List<String> ids, String procode);

    /**
     * 获取实际培训班名称列表
     *
     * @param year
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainingNamesStatisticsByYear(String year, String procode);

    /**
     * 获取培训基地培训人次统计图统计数据
     *
     * @param year
     * @param procode
     * @return
     */
    public List<Map<String, String>> getSurtrainRecordCountByTrainplaceAndYear(String year, String procode);

    /**
     * 获取培训基地教师统计图统计数据
     *
     * @param year
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTeacherNumStatistics(String year, String procode);

    /**
     * 获取培训评价分析图统计数据
     *
     * @param year
     * @param ids
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainEvaluateStatistics(String year, List<String> ids, String procode);

    /**
     * 获取培训评价培训班名称列表
     *
     * @param year
     * @param procode
     * @return
     */
    public List<Map<String, String>> getCTENames(String year, String procode);

    /**
     * 获取培训需求分析图统计数据
     *
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainDemandAnalysisStatistics(String procode);

    /**
     * 获取验船师缺口统计图统计数据
     * 参考验船师主题中已经做好的匹配度表
     *
     * @param procode
     * @return
     */
    public List<Map<String, String>> getSurveyorGapStatistics(String procode);

    /**
     * 获取培训规划统计图统计数据
     *
     * @param procode
     * @return
     */
    public List<Map<String, String>> getTrainPlanningStatistics(String procode);

    /**
     * 获取培训班评价类型名称列表
     *
     * @param year
     * @param procode
     * @return
     */
    public List<String> getCTETypenames(String year, String procode);

}
