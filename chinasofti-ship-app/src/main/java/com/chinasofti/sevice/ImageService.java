package com.chinasofti.sevice;

import com.chinasofti.domain.ImageManager;
import com.chinasofti.domain.Surveyor;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;

/**
 * 图片获取service层
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface ImageService extends AbstractService<ImageManager> {

    /**
     * 根据身份证号获取图片列表
     * @param surveyor
     * @return
     */
    public List<ImageManager> getSurImg(Surveyor surveyor);

    public Pager<ImageManager>getImagesPage(ImageManager imageManager,Pager pager,String orderName,String orderType);

    public String saveTest();
}
