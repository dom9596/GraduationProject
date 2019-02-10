package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmCoursePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmCourseService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 课程表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:34
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmcourse")
@Api(value = "课程表", description = "")
public class MdmCourseController {
    @Autowired
    private MdmCourseService mdmCourseService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmCoursePo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmCoursePo>> pageResult = new Result<>();
        Page<MdmCoursePo> page = mdmCourseService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmCoursePo> selectByPrimaryKey(Long courseId) {
        Result<MdmCoursePo> result = new Result<>();
        MdmCoursePo po = mdmCourseService.selectByPrimaryKey(courseId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long courseId) {
        Result<Long> result = new Result<>();
        Long num = mdmCourseService.deleteByPrimaryKey(courseId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmCourse")
    public Result<Long> insert(@RequestBody MdmCoursePo mdmCourse, HttpServletRequest request) {
        Result<Long> result = new Result<>();
        Long num = mdmCourseService.insertSelective(mdmCourse);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmCourse")
    public Result<Long> updateByPrimaryKeySelective(MdmCoursePo mdmCourse) {
        Result<Long> result = new Result<>();
        Long num = mdmCourseService.updateByPrimaryKeySelective(mdmCourse);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmCoursePo>> queryByCondition(MdmCoursePo mdmCourse) {
        Result<List<MdmCoursePo>> result = new Result<>();
        List<MdmCoursePo> list = mdmCourseService.query(mdmCourse);
        result.setData(list);
        return result;
    }

    /**
     *
     */
    @RequestMapping("/query_bu_user_id")
    public Result<List<MdmCoursePo>> queryByUserId(String userId,HttpServletRequest request) {
        System.out.print("ppp");
        Result<List<MdmCoursePo>> result = new Result<>();
        List<MdmCoursePo> list = mdmCourseService.queryByUserId(userId);
        result.setData(list);
        return result;
    }

}
