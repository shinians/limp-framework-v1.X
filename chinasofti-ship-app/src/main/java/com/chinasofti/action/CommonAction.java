package com.chinasofti.action;

import com.chinasofti.domain.ImageManager;
import com.chinasofti.sevice.ImageService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 声明：图片和文件管理涉及的业务比较固定单一，可写在commonAction中
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-8-2
 * Time: 上午11:22
 * To change this template use File | Settings | File Templates.        e
 */
@Controller
@RequestMapping("/common")
public class CommonAction  extends AbstractAction {
    @Autowired
    ImageService imageService;


    private static Logger log = Logger.getLogger(CommonAction.class);

    private Integer rowCount; //一共多少行

    public   Integer defaultRow = 10; //默认一页10 条
    /**
     * demo
     * http://localhost:92/common/getImgPage?page=1&refid=1&typenum=2
     * &refid2=1&orderName=refid&orderType=DESC
     *  typenum支持多个类型 逗号分隔
     * 获得图片列表
     * @param pager 分页
     * @param image 图片信息：传入该实体对应的field即可作为查询条件：  refid refid2   typenum
     * @param orderName 排序字段  (对应数据库字段值)
     * @param orderType DESC：ASC
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getImgPage",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSurPage(ImageManager image,Pager pager,String orderName,String orderType) {
        pager = new Pager(pager.getPage(), defaultRow);
        Pager<ImageManager> imagesPager = imageService.getImagesPage(image, pager, orderName, orderType);
        rowCount = pager.getRowCount();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,imagesPager,"").getJson();
    }
}
