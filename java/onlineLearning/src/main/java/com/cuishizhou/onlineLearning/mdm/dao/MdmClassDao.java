package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:28
 * @since jdk1.8
 */
@Mapper
public interface MdmClassDao {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassPo> selectPaged(RowBounds rowBounds);

    MdmClassPo selectByPrimaryKey(Long classId);

    Long deleteByPrimaryKey(Long classId);

    Long insert(MdmClassPo mdmClass);

    Long insertSelective(MdmClassPo mdmClass);

    Long insertSelectiveIgnore(MdmClassPo mdmClass);

    Long updateByPrimaryKeySelective(MdmClassPo mdmClass);

    Long updateByPrimaryKey(MdmClassPo mdmClass);

    Long batchInsert(List<MdmClassPo> list);

    Long batchUpdate(List<MdmClassPo> list);

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    Long upsert(MdmClassPo mdmClass);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    Long upsertSelective(MdmClassPo mdmClass);

    List<MdmClassPo> query(MdmClassPo mdmClass);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}