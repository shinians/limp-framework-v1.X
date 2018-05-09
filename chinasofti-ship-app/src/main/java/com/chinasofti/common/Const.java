package com.chinasofti.common;

/**
 * 通用常量
 */
public class Const {


    /**
     * 生成图片所需server文件路径
     */
    public static final String SUCCESSFile = "文件上传成功";

    public static final String ERRORFile = "文件上传失败";


    //文件上传目录
    public static final String UploadHome = StoreControl.getValue("LIMP.HOME")+"upload/";

    public static final String INDEX="index";//首页

    public static final String MINISTRY_CODE = "0000000";//部级编码

    public static final String OCEAN_ENT_LIKE_STR = "远洋渔业有限公司";//远洋渔船公司名称后缀
    public static final String DOMESTIC_OCEAN_STR = "24_1";//国内海洋
    public static final String OCEAN_STR = "24_2";//远洋
    public static final String INLAND_RIVER_STR = "24_3";//内河
    public static final String ORG_FUND_TYP1 = "独立机构";
    public static final String ORG_FUND_TYP2 = "二合一机构";
    public static final String ORG_FUND_TYP3 = "三合一机构";

    public static final String HONEST_SCORE = "3010";//企业诚信得分
    public static final String DESIGN_ENT_ABILITY_SCORE = "3006";//设计单位能力得分
    public static final String REPAIR_ENT_ABILITY_SCORE = "3004";//维修企业能力得分
    public static final String BREPAIR_ENT_ABILITY_SCORE = "3007";//修造企业能力得分
    public static final String SHIP_SECURITY_SCORE = "4001";//渔船综合安全指数

    public static final String DESIGN_ENT_CATE = "2";//设计单位类别编码
    public static final String BREPAIR_ENT_CATE = "3";//修造企业类别编码
    public static final String REPAIR_ENT_CATE = "4";//维修企业类别编码
    public static final String RAFT_ENT_CATE = "5";//筏站企业类别编码
    public static final String GMDSS_ENT_CATE = "6";//GMDSS企业类别编码

    public static final String MAP_PATH = "E:\\map\\gnShipPos.smwu";
    public static final String DATASET_NAME = "gnshipPoint";//

    public static final String ENT_LICENCE_TYPE = "5";//企业营业执照图片所属类别

    public static final String PRO_TYPE_FIR = "CP9";//产品类别一级分类编码
    public static final String PRO_TYPE_SEC = "CP10";//产品类别二级级分类编码
    public static final String PRO_TYPE_THI = "CP11";//产品类别三级分类编码


    public static final String GIS_CUR_TRAIN = "验船师当前培训分布";
    public static final String GIS_CUR_TRAIN_URL = "/gis/toGisCurrentTrain";
    public static final String GIS_CONSTRUCTION_ORG = "渔船检验机构能力分布";
    public static final String GIS_CONSTRUCTION_ORG_URL = "/gis//gis/constructionOrg";

    public static final String ORG_IN_SESSION = "orginfo";
    public static final String PRO_CER = "68_3";//验船师的检验产品的资格
    public static final String DRAW_CER = "68_5";//验船师的审图资格

    public static final String GN_POS_TAB = "cis_ship_pos_gn";//国内渔船位置信息表
    public static final String YY_POS_TAB = "cis_ship_pos_yy";//远洋渔船位置信息表

    //产品维修类别
    public static final String PRO_REPAIR_RAFT = "1";//救生筏
    public static final String PRO_REPAIR_GMDSS = "2";//GMDSS

    //渔船检验类别
    public static final String SHIP_CHECK_TYPE_FIR = "1_1";//渔船首次检验

    public static final String SD_DRAW_CHECK = "1000000";//山东审图中心orgcode
    public static final String SH_DRAW_CHECK = "2000000";//上海审图中心orgcode


}
