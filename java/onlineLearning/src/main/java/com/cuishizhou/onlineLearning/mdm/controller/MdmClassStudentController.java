package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassStudentPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassStudentService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 班级学生表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:31
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmclassstudent")
@Api(value = "班级学生表", description = "")
public class MdmClassStudentController {
    @Autowired
    private MdmClassStudentService mdmClassStudentService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmClassStudentPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmClassStudentPo>> pageResult = new Result<>();
        Page<MdmClassStudentPo> page = mdmClassStudentService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmClassStudentPo> selectByPrimaryKey(Long classStudentId) {
        Result<MdmClassStudentPo> result = new Result<>();
        MdmClassStudentPo po = mdmClassStudentService.selectByPrimaryKey(classStudentId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long classStudentId) {
        Result<Long> result = new Result<>();
        Long num = mdmClassStudentService.deleteByPrimaryKey(classStudentId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmClassStudent")
    public Result<Long> insert(MdmClassStudentPo mdmClassStudent) {
        Result<Long> result = new Result<>();
        Long num = mdmClassStudentService.insertSelective(mdmClassStudent);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmClassStudent")
    public Result<Long> updateByPrimaryKeySelective(MdmClassStudentPo mdmClassStudent) {
        Result<Long> result = new Result<>();
        Long num = mdmClassStudentService.updateByPrimaryKeySelective(mdmClassStudent);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmClassStudentPo>> queryByCondition(MdmClassStudentPo mdmClassStudent) {
        Result<List<MdmClassStudentPo>> result = new Result<>();
        List<MdmClassStudentPo> list = mdmClassStudentService.query(mdmClassStudent);
        result.setData(list);
        return result;
    }

}
