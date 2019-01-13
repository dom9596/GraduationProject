package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 问题表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:36
 * @since jdk 1.8
 */
public interface MdmQuestioinService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmQuestioinPo> selectPaged(RowBounds rowBounds);

    MdmQuestioinPo selectByPrimaryKey(Long questioinId);

    Long deleteByPrimaryKey(Long questioinId);

    Long insert(MdmQuestioinPo mdmQuestioin);

    Long insertSelective(MdmQuestioinPo mdmQuestioin);

    Long insertSelectiveIgnore(MdmQuestioinPo mdmQuestioin);

    Long updateByPrimaryKeySelective(MdmQuestioinPo mdmQuestioin);

    Long updateByPrimaryKey(MdmQuestioinPo mdmQuestioin);

    Long batchInsert(List<MdmQuestioinPo> list);

    Long batchUpdate(List<MdmQuestioinPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmQuestioinPo mdmQuestioin);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmQuestioinPo mdmQuestioin);

    List<MdmQuestioinPo> query(MdmQuestioinPo mdmQuestioin);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
