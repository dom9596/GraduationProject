package com.cuishizhou.onlineLearning.mdm.service;

import com.cuishizhou.onlineLearning.mdm.model.po.SysRolePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 角色表 service层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:42
 * @since jdk 1.8
 */
public interface SysRoleService {

    /*<AUTOGEN--BEGIN>*/

    Page<SysRolePo> selectPaged(RowBounds rowBounds);

    SysRolePo selectByPrimaryKey(Long roleId);

    Long deleteByPrimaryKey(Long roleId);

    Long insert(SysRolePo sysRole);

    Long insertSelective(SysRolePo sysRole);

    Long insertSelectiveIgnore(SysRolePo sysRole);

    Long updateByPrimaryKeySelective(SysRolePo sysRole);

    Long updateByPrimaryKey(SysRolePo sysRole);

    Long batchInsert(List<SysRolePo> list);

    Long batchUpdate(List<SysRolePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(SysRolePo sysRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(SysRolePo sysRole);

    List<SysRolePo> query(SysRolePo sysRole);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
