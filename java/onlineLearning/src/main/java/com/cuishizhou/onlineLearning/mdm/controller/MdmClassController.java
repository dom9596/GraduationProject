package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 班级表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:28
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmclass")
@Api(value = "班级表", description = "")
public class MdmClassController {
    @Autowired
    private MdmClassService mdmClassService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmClassPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmClassPo>> pageResult = new Result<>();
        Page<MdmClassPo> page = mdmClassService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmClassPo> selectByPrimaryKey(Long classId) {
        Result<MdmClassPo> result = new Result<>();
        MdmClassPo po = mdmClassService.selectByPrimaryKey(classId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long classId) {
        Result<Long> result = new Result<>();
        Long num = mdmClassService.deleteByPrimaryKey(classId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmClass")
    public Result<Long> insert(MdmClassPo mdmClass) {
        Result<Long> result = new Result<>();
        Long num = mdmClassService.insertSelective(mdmClass);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmClass")
    public Result<Long> updateByPrimaryKeySelective(MdmClassPo mdmClass) {
        Result<Long> result = new Result<>();
        Long num = mdmClassService.updateByPrimaryKeySelective(mdmClass);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmClassPo>> queryByCondition(MdmClassPo mdmClass) {
        Result<List<MdmClassPo>> result = new Result<>();
        List<MdmClassPo> list = mdmClassService.query(mdmClass);
        result.setData(list);
        return result;
    }

}
