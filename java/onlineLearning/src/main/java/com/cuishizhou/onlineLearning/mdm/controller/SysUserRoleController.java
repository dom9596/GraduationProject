package com.cuishizhou.onlineLearning.mdm.controller;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserRolePo;
import com.cuishizhou.onlineLearning.mdm.service.SysUserRoleService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 用户角色表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:46
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysuserrole")
@Api(value = "用户角色表", description = "")
public class SysUserRoleController {
    @Autowired
    private SysUserRoleService sysUserRoleService;

    /**
     * 分页查询数据
     */
    @RequestMapping("/select_paged")
    public Result<Page<SysUserRolePo>> selectPaged(RowBounds rowBounds) {
        Result<Page<SysUserRolePo>> pageResult = new Result<>();
        Page<SysUserRolePo> page = sysUserRoleService.selectPaged(rowBounds);
        pageResult.setData(page);
        return pageResult;
    }

    /**
     * 通过id查询
     *
     * @return
     */
    @RequestMapping("/select_by_id")
    public Result<SysUserRolePo> selectByPrimaryKey(Integer surId) {
        Result<SysUserRolePo> result = new Result<>();
        SysUserRolePo po = sysUserRoleService.selectByPrimaryKey(surId);
        result.setData(po);
        return result;
    }

    /**
     * 通过ID删除
     *
     * @return
     */
    @RequestMapping("/delete_by_id")
    public Result<Integer> deleteByPrimaryKey(Integer surId) {
        Result<Integer> result = new Result<>();
        Integer num = sysUserRoleService.deleteByPrimaryKey(surId);
        result.setData(num);
        return result;
    }

    /**
     * 新增数据
     *
     * @return
     */
    @RequestMapping("/save_sysUserRole")
    public Result<Integer> insert(SysUserRolePo sysUserRole) {
        Result<Integer> result = new Result<>();
        Integer num = sysUserRoleService.insertSelective(sysUserRole);
        result.setData(num);
        return result;
    }

    /**
     * 修改数据
     *
     * @return
     */
    @RequestMapping("/update_sysUserRole")
    public Result<Integer> updateByPrimaryKeySelective(SysUserRolePo sysUserRole) {
        Result<Integer> result = new Result<>();
        Integer num = sysUserRoleService.updateByPrimaryKeySelective(sysUserRole);
        result.setData(num);
        return result;
    }


    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/query_list")
    public Result<List<SysUserRolePo>> queryByCondition(SysUserRolePo sysUserRole) {
        Result<List<SysUserRolePo>> result = new Result<>();
        List<SysUserRolePo> list = sysUserRoleService.query(sysUserRole);
        result.setData(list);
        return result;
    }

}
