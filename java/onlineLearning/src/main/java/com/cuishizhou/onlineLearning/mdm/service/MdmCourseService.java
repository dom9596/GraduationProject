package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmCoursePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 课程表 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:34
 * @since jdk 1.8
 */
public interface MdmCourseService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmCoursePo> selectPaged(RowBounds rowBounds);

    MdmCoursePo selectByPrimaryKey(Integer courseId);

    Integer deleteByPrimaryKey(Integer courseId);

    Integer insert(MdmCoursePo mdmCourse);

    Integer insertSelective(MdmCoursePo mdmCourse);

    Integer insertSelectiveIgnore(MdmCoursePo mdmCourse);

    Integer updateByPrimaryKeySelective(MdmCoursePo mdmCourse);

    Integer updateByPrimaryKey(MdmCoursePo mdmCourse);

    Integer batchInsert(List<MdmCoursePo> list);

    Integer batchUpdate(List<MdmCoursePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(MdmCoursePo mdmCourse);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(MdmCoursePo mdmCourse);

    List<MdmCoursePo> query(MdmCoursePo mdmCourse);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
