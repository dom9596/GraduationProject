package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysRolePo;
import com.cuishizhou.onlineLearning.mdm.service.SysRoleService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 角色表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:42
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysrole")
@Api(value = "角色表", description = "")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<SysRolePo>> selectPaged(RowBounds rowBounds) {
        Result<Page<SysRolePo>> pageResult = new Result<>();
        Page<SysRolePo> page = sysRoleService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<SysRolePo> selectByPrimaryKey(Long roleId) {
        Result<SysRolePo> result = new Result<>();
        SysRolePo po = sysRoleService.selectByPrimaryKey(roleId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Long> deleteByPrimaryKey(Long roleId) {
        Result<Long> result = new Result<>();
        Long num = sysRoleService.deleteByPrimaryKey(roleId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_sysRole")
    public Result<Long> insert(SysRolePo sysRole) {
        Result<Long> result = new Result<>();
        Long num = sysRoleService.insertSelective(sysRole);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_sysRole")
    public Result<Long> updateByPrimaryKeySelective(SysRolePo sysRole) {
        Result<Long> result = new Result<>();
        Long num = sysRoleService.updateByPrimaryKeySelective(sysRole);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<SysRolePo>> queryByCondition(SysRolePo sysRole) {
        Result<List<SysRolePo>> result = new Result<>();
        List<SysRolePo> list = sysRoleService.query(sysRole);
        result.setData(list);
        return result;
    }

}
