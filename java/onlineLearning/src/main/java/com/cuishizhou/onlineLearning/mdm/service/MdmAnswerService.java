package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmAnswerPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答案表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:25
 * @since jdk 1.8
 */
public interface MdmAnswerService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmAnswerPo> selectPaged(RowBounds rowBounds);

    MdmAnswerPo selectByPrimaryKey(Long answerId);

    Long deleteByPrimaryKey(Long answerId);

    Long insert(MdmAnswerPo mdmAnswer);

    Long insertSelective(MdmAnswerPo mdmAnswer);

    Long insertSelectiveIgnore(MdmAnswerPo mdmAnswer);

    Long updateByPrimaryKeySelective(MdmAnswerPo mdmAnswer);

    Long updateByPrimaryKey(MdmAnswerPo mdmAnswer);

    Long batchInsert(List<MdmAnswerPo> list);

    Long batchUpdate(List<MdmAnswerPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmAnswerPo mdmAnswer);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmAnswerPo mdmAnswer);

    List<MdmAnswerPo> query(MdmAnswerPo mdmAnswer);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
