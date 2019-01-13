package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassStudentPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级学生表的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:31
 * @since jdk1.8
 */
@Mapper
public interface MdmClassStudentDao {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassStudentPo> selectPaged(RowBounds rowBounds);

    MdmClassStudentPo selectByPrimaryKey(Integer classStudentId);

    Integer deleteByPrimaryKey(Integer classStudentId);

    Integer insert(MdmClassStudentPo mdmClassStudent);

    Integer insertSelective(MdmClassStudentPo mdmClassStudent);

    Integer insertSelectiveIgnore(MdmClassStudentPo mdmClassStudent);

    Integer updateByPrimaryKeySelective(MdmClassStudentPo mdmClassStudent);

    Integer updateByPrimaryKey(MdmClassStudentPo mdmClassStudent);

    Integer batchInsert(List<MdmClassStudentPo> list);

    Integer batchUpdate(List<MdmClassStudentPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmClassStudentPo mdmClassStudent);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmClassStudentPo mdmClassStudent);

    List<MdmClassStudentPo> query(MdmClassStudentPo mdmClassStudent);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}