package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级表的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:28
 * @since jdk1.8
 */
@Mapper
public interface MdmClassDao {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassPo> selectPaged(RowBounds rowBounds);

    MdmClassPo selectByPrimaryKey(Integer classId);

    Integer deleteByPrimaryKey(Integer classId);

    Integer insert(MdmClassPo mdmClass);

    Integer insertSelective(MdmClassPo mdmClass);

    Integer insertSelectiveIgnore(MdmClassPo mdmClass);

    Integer updateByPrimaryKeySelective(MdmClassPo mdmClass);

    Integer updateByPrimaryKey(MdmClassPo mdmClass);

    Integer batchInsert(List<MdmClassPo> list);

    Integer batchUpdate(List<MdmClassPo> list);

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    Integer upsert(MdmClassPo mdmClass);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    Integer upsertSelective(MdmClassPo mdmClass);

    List<MdmClassPo> query(MdmClassPo mdmClass);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}