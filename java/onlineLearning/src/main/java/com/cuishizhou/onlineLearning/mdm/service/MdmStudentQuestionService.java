package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmStudentQuestionPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答题表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:40
 * @since jdk 1.8
 */
public interface MdmStudentQuestionService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmStudentQuestionPo> selectPaged(RowBounds rowBounds);

    MdmStudentQuestionPo selectByPrimaryKey(Long studentQuestionId);

    Long deleteByPrimaryKey(Long studentQuestionId);

    Long insert(MdmStudentQuestionPo mdmStudentQuestion);

    Long insertSelective(MdmStudentQuestionPo mdmStudentQuestion);

    Long insertSelectiveIgnore(MdmStudentQuestionPo mdmStudentQuestion);

    Long updateByPrimaryKeySelective(MdmStudentQuestionPo mdmStudentQuestion);

    Long updateByPrimaryKey(MdmStudentQuestionPo mdmStudentQuestion);

    Long batchInsert(List<MdmStudentQuestionPo> list);

    Long batchUpdate(List<MdmStudentQuestionPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmStudentQuestionPo mdmStudentQuestion);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmStudentQuestionPo mdmStudentQuestion);

    List<MdmStudentQuestionPo> query(MdmStudentQuestionPo mdmStudentQuestion);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
