package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.SysRolePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 角色表的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-23 15:32:09
 * @since jdk1.8
 */
@Mapper
public interface SysRoleDao {

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