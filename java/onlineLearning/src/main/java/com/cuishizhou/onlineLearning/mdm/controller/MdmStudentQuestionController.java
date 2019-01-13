package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmStudentQuestionPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmStudentQuestionService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 答题表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:40
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmstudentquestion")
@Api(value = "答题表", description = "")
public class MdmStudentQuestionController {
    @Autowired
    private MdmStudentQuestionService mdmStudentQuestionService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmStudentQuestionPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmStudentQuestionPo>> pageResult = new Result<>();
        Page<MdmStudentQuestionPo> page = mdmStudentQuestionService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmStudentQuestionPo> selectByPrimaryKey(Long studentQuestionId) {
        Result<MdmStudentQuestionPo> result = new Result<>();
        MdmStudentQuestionPo po = mdmStudentQuestionService.selectByPrimaryKey(studentQuestionId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long studentQuestionId) {
        Result<Long> result = new Result<>();
        Long num = mdmStudentQuestionService.deleteByPrimaryKey(studentQuestionId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmStudentQuestion")
    public Result<Long> insert(MdmStudentQuestionPo mdmStudentQuestion) {
        Result<Long> result = new Result<>();
        Long num = mdmStudentQuestionService.insertSelective(mdmStudentQuestion);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmStudentQuestion")
    public Result<Long> updateByPrimaryKeySelective(MdmStudentQuestionPo mdmStudentQuestion) {
        Result<Long> result = new Result<>();
        Long num = mdmStudentQuestionService.updateByPrimaryKeySelective(mdmStudentQuestion);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmStudentQuestionPo>> queryByCondition(MdmStudentQuestionPo mdmStudentQuestion) {
        Result<List<MdmStudentQuestionPo>> result = new Result<>();
        List<MdmStudentQuestionPo> list = mdmStudentQuestionService.query(mdmStudentQuestion);
        result.setData(list);
        return result;
    }

}
