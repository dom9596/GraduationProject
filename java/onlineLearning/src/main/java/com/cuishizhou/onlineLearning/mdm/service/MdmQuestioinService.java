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

    MdmQuestioinPo selectByPrimaryKey(Integer questioinId);

    Integer deleteByPrimaryKey(Integer questioinId);

    Integer insert(MdmQuestioinPo mdmQuestioin);

    Integer insertSelective(MdmQuestioinPo mdmQuestioin);

    Integer insertSelectiveIgnore(MdmQuestioinPo mdmQuestioin);

    Integer updateByPrimaryKeySelective(MdmQuestioinPo mdmQuestioin);

    Integer updateByPrimaryKey(MdmQuestioinPo mdmQuestioin);

    Integer batchInsert(List<MdmQuestioinPo> list);

    Integer batchUpdate(List<MdmQuestioinPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmQuestioinPo mdmQuestioin);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmQuestioinPo mdmQuestioin);

    List<MdmQuestioinPo> query(MdmQuestioinPo mdmQuestioin);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
