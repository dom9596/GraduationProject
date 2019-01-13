package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.MdmCoursePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 课程表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:34
 * @since jdk 1.8
 */
public interface MdmCourseService {

    /*<AUTOGEN--BEGIN>*/

    Page<MdmCoursePo> selectPaged(RowBounds rowBounds);

    MdmCoursePo selectByPrimaryKey(Long courseId);

    Long deleteByPrimaryKey(Long courseId);

    Long insert(MdmCoursePo mdmCourse);

    Long insertSelective(MdmCoursePo mdmCourse);

    Long insertSelectiveIgnore(MdmCoursePo mdmCourse);

    Long updateByPrimaryKeySelective(MdmCoursePo mdmCourse);

    Long updateByPrimaryKey(MdmCoursePo mdmCourse);

    Long batchInsert(List<MdmCoursePo> list);

    Long batchUpdate(List<MdmCoursePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(MdmCoursePo mdmCourse);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(MdmCoursePo mdmCourse);

    List<MdmCoursePo> query(MdmCoursePo mdmCourse);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
