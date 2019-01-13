package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassTimePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级上课时间表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:32
 * @since jdk 1.8
 */
public interface MdmClassTimeService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassTimePo> selectPaged(RowBounds rowBounds);

    MdmClassTimePo selectByPrimaryKey(Long classTimeId);

    Long deleteByPrimaryKey(Long classTimeId);

    Long insert(MdmClassTimePo mdmClassTime);

    Long insertSelective(MdmClassTimePo mdmClassTime);

    Long insertSelectiveIgnore(MdmClassTimePo mdmClassTime);

    Long updateByPrimaryKeySelective(MdmClassTimePo mdmClassTime);

    Long updateByPrimaryKey(MdmClassTimePo mdmClassTime);

    Long batchInsert(List<MdmClassTimePo> list);

    Long batchUpdate(List<MdmClassTimePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmClassTimePo mdmClassTime);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmClassTimePo mdmClassTime);

    List<MdmClassTimePo> query(MdmClassTimePo mdmClassTime);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
