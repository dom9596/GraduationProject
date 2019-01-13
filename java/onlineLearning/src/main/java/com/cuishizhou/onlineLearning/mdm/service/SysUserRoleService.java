package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.SysUserRolePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户角色表 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:46
 * @since jdk 1.8
 */
public interface SysUserRoleService {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserRolePo> selectPaged(RowBounds rowBounds);

    SysUserRolePo selectByPrimaryKey(Integer surId);

    Integer deleteByPrimaryKey(Integer surId);

    Integer insert(SysUserRolePo sysUserRole);

    Integer insertSelective(SysUserRolePo sysUserRole);

    Integer insertSelectiveIgnore(SysUserRolePo sysUserRole);

    Integer updateByPrimaryKeySelective(SysUserRolePo sysUserRole);

    Integer updateByPrimaryKey(SysUserRolePo sysUserRole);

    Integer batchInsert(List<SysUserRolePo> list);

    Integer batchUpdate(List<SysUserRolePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(SysUserRolePo sysUserRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(SysUserRolePo sysUserRole);

    List<SysUserRolePo> query(SysUserRolePo sysUserRole);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}
