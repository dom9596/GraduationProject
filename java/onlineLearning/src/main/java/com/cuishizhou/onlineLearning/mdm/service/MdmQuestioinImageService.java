package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinImagePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答案表 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:38
 * @since jdk 1.8
 */
public interface MdmQuestioinImageService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmQuestioinImagePo> selectPaged(RowBounds rowBounds);

    MdmQuestioinImagePo selectByPrimaryKey(Integer questioinImageId);

    Integer deleteByPrimaryKey(Integer questioinImageId);

    Integer insert(MdmQuestioinImagePo mdmQuestioinImage);

    Integer insertSelective(MdmQuestioinImagePo mdmQuestioinImage);

    Integer insertSelectiveIgnore(MdmQuestioinImagePo mdmQuestioinImage);

    Integer updateByPrimaryKeySelective(MdmQuestioinImagePo mdmQuestioinImage);

    Integer updateByPrimaryKey(MdmQuestioinImagePo mdmQuestioinImage);

    Integer batchInsert(List<MdmQuestioinImagePo> list);

    Integer batchUpdate(List<MdmQuestioinImagePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmQuestioinImagePo mdmQuestioinImage);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmQuestioinImagePo mdmQuestioinImage);

    List<MdmQuestioinImagePo> query(MdmQuestioinImagePo mdmQuestioinImage);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
