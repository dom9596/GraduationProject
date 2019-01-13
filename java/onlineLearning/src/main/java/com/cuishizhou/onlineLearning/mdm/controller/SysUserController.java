package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.cuishizhou.onlineLearning.mdm.service.SysUserService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 用户表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:44
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysuser")
@Api(value = "用户表", description = "")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<SysUserPo>> selectPaged(RowBounds rowBounds) {
        Result<Page<SysUserPo>> pageResult = new Result<>();
        Page<SysUserPo> page = sysUserService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<SysUserPo> selectByPrimaryKey(Long userId) {
        Result<SysUserPo> result = new Result<>();
        SysUserPo po = sysUserService.selectByPrimaryKey(userId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long userId) {
        Result<Long> result = new Result<>();
        Long num = sysUserService.deleteByPrimaryKey(userId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_sysUser")
    public Result<Long> insert(SysUserPo sysUser) {
        Result<Long> result = new Result<>();
        Long num = sysUserService.insertSelective(sysUser);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_sysUser")
    public Result<Long> updateByPrimaryKeySelective(SysUserPo sysUser) {
        Result<Long> result = new Result<>();
        Long num = sysUserService.updateByPrimaryKeySelective(sysUser);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<SysUserPo>> queryByCondition(SysUserPo sysUser) {
        Result<List<SysUserPo>> result = new Result<>();
        List<SysUserPo> list = sysUserService.query(sysUser);
        result.setData(list);
        return result;
    }


    @RequestMapping("/query_total")
    public Long queryTotal() {
        return sysUserService.queryTotal();
    }

}
