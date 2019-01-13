package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmQuestioinService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 问题表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:36
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmquestioin")
@Api(value = "问题表", description = "")
public class MdmQuestioinController {
    @Autowired
    private MdmQuestioinService mdmQuestioinService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmQuestioinPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmQuestioinPo>> pageResult = new Result<>();
        Page<MdmQuestioinPo> page = mdmQuestioinService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmQuestioinPo> selectByPrimaryKey(Integer questioinId) {
        Result<MdmQuestioinPo> result = new Result<>();
        MdmQuestioinPo po = mdmQuestioinService.selectByPrimaryKey(questioinId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Integer> deleteByPrimaryKey(Integer questioinId) {
        Result<Integer> result = new Result<>();
        Integer num = mdmQuestioinService.deleteByPrimaryKey(questioinId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmQuestioin")
    public Result<Integer> insert(MdmQuestioinPo mdmQuestioin) {
        Result<Integer> result = new Result<>();
        Integer num = mdmQuestioinService.insertSelective(mdmQuestioin);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmQuestioin")
    public Result<Integer> updateByPrimaryKeySelective(MdmQuestioinPo mdmQuestioin) {
        Result<Integer> result = new Result<>();
        Integer num = mdmQuestioinService.updateByPrimaryKeySelective(mdmQuestioin);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmQuestioinPo>> queryByCondition(MdmQuestioinPo mdmQuestioin) {
        Result<List<MdmQuestioinPo>> result = new Result<>();
        List<MdmQuestioinPo> list = mdmQuestioinService.query(mdmQuestioin);
        result.setData(list);
        return result;
    }

}
