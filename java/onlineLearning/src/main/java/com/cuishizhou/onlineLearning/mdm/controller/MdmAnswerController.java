package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmAnswerPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmAnswerService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 答案表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 15:21:35
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmanswer")
@Api(value = "答案表")
public class MdmAnswerController {
    @Autowired
    private MdmAnswerService mdmAnswerService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmAnswerPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmAnswerPo>> pageResult = new Result<>();
        Page<MdmAnswerPo> page = mdmAnswerService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmAnswerPo> selectByPrimaryKey(Long answerId) {
        Result<MdmAnswerPo> result = new Result<>();
        MdmAnswerPo po = mdmAnswerService.selectByPrimaryKey(answerId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long answerId) {
        Result<Long> result = new Result<>();
        Long num = mdmAnswerService.deleteByPrimaryKey(answerId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmAnswer")
    public Result<Long> insert(MdmAnswerPo mdmAnswer) {
        Result<Long> result = new Result<>();
        Long num = mdmAnswerService.insertSelective(mdmAnswer);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmAnswer")
    public Result<Long> updateByPrimaryKeySelective(MdmAnswerPo mdmAnswer) {
        Result<Long> result = new Result<>();
        Long num = mdmAnswerService.updateByPrimaryKeySelective(mdmAnswer);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmAnswerPo>> queryByCondition(MdmAnswerPo mdmAnswer) {
        Result<List<MdmAnswerPo>> result = new Result<>();
        List<MdmAnswerPo> list = mdmAnswerService.query(mdmAnswer);
        result.setData(list);
        return result;
    }

}
