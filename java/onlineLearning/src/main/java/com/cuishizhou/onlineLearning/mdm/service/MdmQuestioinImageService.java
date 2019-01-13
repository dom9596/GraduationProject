package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinImagePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答案表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:38
 * @since jdk 1.8
 */
public interface MdmQuestioinImageService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmQuestioinImagePo> selectPaged(RowBounds rowBounds);

    MdmQuestioinImagePo selectByPrimaryKey(Long questioinImageId);

    Long deleteByPrimaryKey(Long questioinImageId);

    Long insert(MdmQuestioinImagePo mdmQuestioinImage);

    Long insertSelective(MdmQuestioinImagePo mdmQuestioinImage);

    Long insertSelectiveIgnore(MdmQuestioinImagePo mdmQuestioinImage);

    Long updateByPrimaryKeySelective(MdmQuestioinImagePo mdmQuestioinImage);

    Long updateByPrimaryKey(MdmQuestioinImagePo mdmQuestioinImage);

    Long batchInsert(List<MdmQuestioinImagePo> list);

    Long batchUpdate(List<MdmQuestioinImagePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmQuestioinImagePo mdmQuestioinImage);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmQuestioinImagePo mdmQuestioinImage);

    List<MdmQuestioinImagePo> query(MdmQuestioinImagePo mdmQuestioinImage);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
