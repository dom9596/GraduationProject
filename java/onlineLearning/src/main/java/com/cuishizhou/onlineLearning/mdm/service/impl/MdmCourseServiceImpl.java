package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmCourseDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmCoursePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmCourseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 课程表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:34
 * @since jdk 1.8
 */
@Service("mdmCourseService")
public class MdmCourseServiceImpl implements MdmCourseService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmCourseDao mdmCourseDao;


    @Override
    public Page<MdmCoursePo> selectPaged(RowBounds rowBounds) {
        return mdmCourseDao.selectPaged(rowBounds);
    }

    @Override
    public MdmCoursePo selectByPrimaryKey(Long courseId) {
        return mdmCourseDao.selectByPrimaryKey(courseId);
    }

    @Override
    public Long deleteByPrimaryKey(Long courseId) {
        return mdmCourseDao.deleteByPrimaryKey(courseId);
    }

    @Override
    public Long insert(MdmCoursePo mdmCourse) {
        return mdmCourseDao.insert(mdmCourse);
    }

    @Override
    public Long insertSelective(MdmCoursePo mdmCourse) {
        return mdmCourseDao.insertSelective(mdmCourse);
    }

    @Override
    public Long insertSelectiveIgnore(MdmCoursePo mdmCourse) {
        return mdmCourseDao.insertSelectiveIgnore(mdmCourse);
    }

    @Override
    public Long updateByPrimaryKeySelective(MdmCoursePo mdmCourse) {
        return mdmCourseDao.updateByPrimaryKeySelective(mdmCourse);
    }

    @Override
    public Long updateByPrimaryKey(MdmCoursePo mdmCourse) {
        return mdmCourseDao.updateByPrimaryKey(mdmCourse);
    }

    @Override
    public Long batchInsert(List<MdmCoursePo> list) {
        return mdmCourseDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<MdmCoursePo> list) {
        return mdmCourseDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    @Override
    public Long upsert(MdmCoursePo mdmCourse) {
        return mdmCourseDao.upsert(mdmCourse);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    @Override
    public Long upsertSelective(MdmCoursePo mdmCourse) {
        return mdmCourseDao.upsertSelective(mdmCourse);
    }

    @Override
    public List<MdmCoursePo> query(MdmCoursePo mdmCourse) {
        return mdmCourseDao.query(mdmCourse);
    }

    @Override
    public Long queryTotal() {
        return mdmCourseDao.queryTotal();
    }

    @Override
    public Long deleteBatch(List<Long> list) {
        return mdmCourseDao.deleteBatch(list);
    }


    /*<AUTOGEN--END>*/
    @Override
    public PageInfo<MdmCoursePo> queryByUserId(String userId,int pageCode,int pageSize) {
        PageHelper.startPage(pageCode, pageSize);
        System.out.println("---------------");
        System.out.println("pageCode:"+pageCode+"pageSize:"+pageSize);
        PageInfo result = new PageInfo<>(mdmCourseDao.queryByUserId(userId));
        return result;

//        return mdmCourseDao.queryByUserId(userId);
    }
}
