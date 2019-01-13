package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassTimePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 班级上课时间表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:32
 * @since jdk1.8
 */
@Mapper
public interface MdmClassTimeDao {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmClassTimePo> selectPaged(RowBounds rowBounds);

    MdmClassTimePo selectByPrimaryKey(Integer classTimeId);

    Integer deleteByPrimaryKey(Integer classTimeId);

    Integer insert(MdmClassTimePo mdmClassTime);

    Integer insertSelective(MdmClassTimePo mdmClassTime);

    Integer insertSelectiveIgnore(MdmClassTimePo mdmClassTime);

    Integer updateByPrimaryKeySelective(MdmClassTimePo mdmClassTime);

    Integer updateByPrimaryKey(MdmClassTimePo mdmClassTime);

    Integer batchInsert(List<MdmClassTimePo> list);

    Integer batchUpdate(List<MdmClassTimePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmClassTimePo mdmClassTime);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmClassTimePo mdmClassTime);

    List<MdmClassTimePo> query(MdmClassTimePo mdmClassTime);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}