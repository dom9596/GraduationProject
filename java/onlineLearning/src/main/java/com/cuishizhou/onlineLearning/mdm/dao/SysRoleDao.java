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
 * @date 2019-01-13 05:54:42
 * @since jdk1.8
 */
@Mapper
public interface SysRoleDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysRolePo> selectPaged(RowBounds rowBounds);

    SysRolePo selectByPrimaryKey(Integer roleId);

    Integer deleteByPrimaryKey(Integer roleId);

    Integer insert(SysRolePo sysRole);

    Integer insertSelective(SysRolePo sysRole);

    Integer insertSelectiveIgnore(SysRolePo sysRole);

    Integer updateByPrimaryKeySelective(SysRolePo sysRole);

    Integer updateByPrimaryKey(SysRolePo sysRole);

    Integer batchInsert(List<SysRolePo> list);

    Integer batchUpdate(List<SysRolePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(SysRolePo sysRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(SysRolePo sysRole);

    List<SysRolePo> query(SysRolePo sysRole);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}