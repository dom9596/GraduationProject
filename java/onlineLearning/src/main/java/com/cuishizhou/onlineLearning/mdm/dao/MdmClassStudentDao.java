package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassStudentPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级学生表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:31
 * @since jdk1.8
 */
@Mapper
public interface MdmClassStudentDao {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassStudentPo> selectPaged(RowBounds rowBounds);

    MdmClassStudentPo selectByPrimaryKey(Long classStudentId);

    Long deleteByPrimaryKey(Long classStudentId);

    Long insert(MdmClassStudentPo mdmClassStudent);

    Long insertSelective(MdmClassStudentPo mdmClassStudent);

    Long insertSelectiveIgnore(MdmClassStudentPo mdmClassStudent);

    Long updateByPrimaryKeySelective(MdmClassStudentPo mdmClassStudent);

    Long updateByPrimaryKey(MdmClassStudentPo mdmClassStudent);

    Long batchInsert(List<MdmClassStudentPo> list);

    Long batchUpdate(List<MdmClassStudentPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmClassStudentPo mdmClassStudent);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmClassStudentPo mdmClassStudent);

    List<MdmClassStudentPo> query(MdmClassStudentPo mdmClassStudent);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}