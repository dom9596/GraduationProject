package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmAnswerPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 答案表 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:25
 * @since jdk 1.8
 */
public interface MdmAnswerService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmAnswerPo> selectPaged(RowBounds rowBounds);

    MdmAnswerPo selectByPrimaryKey(Integer answerId);

    Integer deleteByPrimaryKey(Integer answerId);

    Integer insert(MdmAnswerPo mdmAnswer);

    Integer insertSelective(MdmAnswerPo mdmAnswer);

    Integer insertSelectiveIgnore(MdmAnswerPo mdmAnswer);

    Integer updateByPrimaryKeySelective(MdmAnswerPo mdmAnswer);

    Integer updateByPrimaryKey(MdmAnswerPo mdmAnswer);

    Integer batchInsert(List<MdmAnswerPo> list);

    Integer batchUpdate(List<MdmAnswerPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmAnswerPo mdmAnswer);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmAnswerPo mdmAnswer);

    List<MdmAnswerPo> query(MdmAnswerPo mdmAnswer);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
