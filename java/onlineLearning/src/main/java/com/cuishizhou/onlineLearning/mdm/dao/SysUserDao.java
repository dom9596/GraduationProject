package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户表的dao层
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:44
 * @since jdk1.8
 */
@Mapper
public interface SysUserDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserPo> selectPaged(RowBounds rowBounds);

    SysUserPo selectByPrimaryKey(Integer userId);

    Integer deleteByPrimaryKey(Integer userId);

    Integer insert(SysUserPo sysUser);

    Integer insertSelective(SysUserPo sysUser);

    Integer insertSelectiveIgnore(SysUserPo sysUser);

    Integer updateByPrimaryKeySelective(SysUserPo sysUser);

    Integer updateByPrimaryKey(SysUserPo sysUser);

    Integer batchInsert(List<SysUserPo> list);

    Integer batchUpdate(List<SysUserPo> list);

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    Integer upsert(SysUserPo sysUser);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    Integer upsertSelective(SysUserPo sysUser);

    List<SysUserPo> query(SysUserPo sysUser);

    Long queryTotal();

    Integer deleteBatch(List<Integer> list);

    /*<AUTOGEN--END>*/

}