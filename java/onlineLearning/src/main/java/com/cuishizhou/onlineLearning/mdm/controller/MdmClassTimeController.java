package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassTimePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassTimeService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 班级上课时间表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:32
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmclasstime")
@Api(value = "班级上课时间表", description = "")
public class MdmClassTimeController {
    @Autowired
    private MdmClassTimeService mdmClassTimeService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmClassTimePo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmClassTimePo>> pageResult = new Result<>();
        Page<MdmClassTimePo> page = mdmClassTimeService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmClassTimePo> selectByPrimaryKey(Long classTimeId) {
        Result<MdmClassTimePo> result = new Result<>();
        MdmClassTimePo po = mdmClassTimeService.selectByPrimaryKey(classTimeId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long classTimeId) {
        Result<Long> result = new Result<>();
        Long num = mdmClassTimeService.deleteByPrimaryKey(classTimeId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmClassTime")
    public Result<Long> insert(MdmClassTimePo mdmClassTime) {
        Result<Long> result = new Result<>();
        Long num = mdmClassTimeService.insertSelective(mdmClassTime);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmClassTime")
    public Result<Long> updateByPrimaryKeySelective(MdmClassTimePo mdmClassTime) {
        Result<Long> result = new Result<>();
        Long num = mdmClassTimeService.updateByPrimaryKeySelective(mdmClassTime);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmClassTimePo>> queryByCondition(MdmClassTimePo mdmClassTime) {
        Result<List<MdmClassTimePo>> result = new Result<>();
        List<MdmClassTimePo> list = mdmClassTimeService.query(mdmClassTime);
        result.setData(list);
        return result;
    }

}
