package com.cuishizhou.onlineLearning.mdm.dao;

import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户表的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-23 15:32:14
 * @since jdk1.8
 */
@Mapper
public interface SysUserDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserPo> selectPaged(RowBounds rowBounds);

    SysUserPo selectByPrimaryKey(Long userId);

    Long deleteByPrimaryKey(Long userId);

    Long insert(SysUserPo sysUser);

    Long insertSelective(SysUserPo sysUser);

    Long insertSelectiveIgnore(SysUserPo sysUser);

    Long updateByPrimaryKeySelective(SysUserPo sysUser);

    Long updateByPrimaryKey(SysUserPo sysUser);

    Long batchInsert(List<SysUserPo> list);

    Long batchUpdate(List<SysUserPo> list);

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    Long upsert(SysUserPo sysUser);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    Long upsertSelective(SysUserPo sysUser);

    List<SysUserPo> query(SysUserPo sysUser);

    Long queryTotal();

    Long deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

    /*********************** 自定义 ****************************/
    List<SysUserPo> queryByUserCode(SysUserPo sysUserPo);

}