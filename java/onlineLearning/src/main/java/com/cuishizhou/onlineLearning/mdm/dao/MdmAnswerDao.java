package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmAnswerPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答案表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 15:21:35
 * @since jdk1.8
 */
@Mapper
public interface MdmAnswerDao {

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