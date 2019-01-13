package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmStudentQuestionPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答题表 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:40
 * @since jdk 1.8
 */
public interface MdmStudentQuestionService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmStudentQuestionPo> selectPaged(RowBounds rowBounds);

    MdmStudentQuestionPo selectByPrimaryKey(Integer studentQuestionId);

    Integer deleteByPrimaryKey(Integer studentQuestionId);

    Integer insert(MdmStudentQuestionPo mdmStudentQuestion);

    Integer insertSelective(MdmStudentQuestionPo mdmStudentQuestion);

    Integer insertSelectiveIgnore(MdmStudentQuestionPo mdmStudentQuestion);

    Integer updateByPrimaryKeySelective(MdmStudentQuestionPo mdmStudentQuestion);

    Integer updateByPrimaryKey(MdmStudentQuestionPo mdmStudentQuestion);

    Integer batchInsert(List<MdmStudentQuestionPo> list);

    Integer batchUpdate(List<MdmStudentQuestionPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmStudentQuestionPo mdmStudentQuestion);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmStudentQuestionPo mdmStudentQuestion);

    List<MdmStudentQuestionPo> query(MdmStudentQuestionPo mdmStudentQuestion);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
