package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinImagePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmQuestioinImageService;
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
 * @date 2019-01-13 05:54:38
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/mdmquestioinimage")
@Api(value = "答案表", description = "")
public class MdmQuestioinImageController {
    @Autowired
    private MdmQuestioinImageService mdmQuestioinImageService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<MdmQuestioinImagePo>> selectPaged(RowBounds rowBounds) {
        Result<Page<MdmQuestioinImagePo>> pageResult = new Result<>();
        Page<MdmQuestioinImagePo> page = mdmQuestioinImageService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<MdmQuestioinImagePo> selectByPrimaryKey(Long questioinImageId) {
        Result<MdmQuestioinImagePo> result = new Result<>();
        MdmQuestioinImagePo po = mdmQuestioinImageService.selectByPrimaryKey(questioinImageId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long questioinImageId) {
        Result<Long> result = new Result<>();
        Long num = mdmQuestioinImageService.deleteByPrimaryKey(questioinImageId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_mdmQuestioinImage")
    public Result<Long> insert(MdmQuestioinImagePo mdmQuestioinImage) {
        Result<Long> result = new Result<>();
        Long num = mdmQuestioinImageService.insertSelective(mdmQuestioinImage);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_mdmQuestioinImage")
    public Result<Long> updateByPrimaryKeySelective(MdmQuestioinImagePo mdmQuestioinImage) {
        Result<Long> result = new Result<>();
        Long num = mdmQuestioinImageService.updateByPrimaryKeySelective(mdmQuestioinImage);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<MdmQuestioinImagePo>> queryByCondition(MdmQuestioinImagePo mdmQuestioinImage) {
        Result<List<MdmQuestioinImagePo>> result = new Result<>();
        List<MdmQuestioinImagePo> list = mdmQuestioinImageService.query(mdmQuestioinImage);
        result.setData(list);
        return result;
    }

}
