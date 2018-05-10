package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ImageManager;
import com.chinasofti.domain.ImageManagerExample;
import com.chinasofti.domain.Surveyor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageManagerMapper {
    int countByExample(ImageManagerExample example);

    int deleteByExample(ImageManagerExample example);

    int insert(ImageManager record);

    int insertSelective(ImageManager record);

    List<ImageManager> selectByExample(ImageManagerExample example);

    List<ImageManager> getSurImgByCertnum(Surveyor surveyor);

    int updateByExampleSelective(@Param("record") ImageManager record, @Param("example") ImageManagerExample example);

    int updateByExample(@Param("record") ImageManager record, @Param("example") ImageManagerExample example);

    List<ImageManager> getAllImageList();
}