package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.SysUserRolePo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户角色表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:46
 * @since jdk1.8
 */
@Mapper
public interface SysUserRoleDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserRolePo> selectPaged(RowBounds rowBounds);

    SysUserRolePo selectByPrimaryKey(Long surId);

    Long deleteByPrimaryKey(Long surId);

    Long insert(SysUserRolePo sysUserRole);

    Long insertSelective(SysUserRolePo sysUserRole);

    Long insertSelectiveIgnore(SysUserRolePo sysUserRole);

    Long updateByPrimaryKeySelective(SysUserRolePo sysUserRole);

    Long updateByPrimaryKey(SysUserRolePo sysUserRole);

    Long batchInsert(List<SysUserRolePo> list);

    Long batchUpdate(List<SysUserRolePo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Long upsert(SysUserRolePo sysUserRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Long upsertSelective(SysUserRolePo sysUserRole);

    List<SysUserRolePo> query(SysUserRolePo sysUserRole);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}