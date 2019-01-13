package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.SysRoleDao;
import com.cuishizhou.onlineLearning.mdm.model.po.SysRolePo;
import com.cuishizhou.onlineLearning.mdm.service.SysRoleService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 角色表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:42
 * @since jdk 1.8
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public SysRoleDao sysRoleDao;


    @Override
    public Page<SysRolePo> selectPaged(RowBounds rowBounds) {
        return sysRoleDao.selectPaged(rowBounds);
    }

    @Override
    public SysRolePo selectByPrimaryKey(Integer roleId) {
        return sysRoleDao.selectByPrimaryKey(roleId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer roleId) {
        return sysRoleDao.deleteByPrimaryKey(roleId);
    }

    @Override
    public Integer insert(SysRolePo sysRole) {
        return sysRoleDao.insert(sysRole);
    }

    @Override
    public Integer insertSelective(SysRolePo sysRole) {
        return sysRoleDao.insertSelective(sysRole);
    }

    @Override
    public Integer insertSelectiveIgnore(SysRolePo sysRole) {
        return sysRoleDao.insertSelectiveIgnore(sysRole);
    }

    @Override
    public Integer updateByPrimaryKeySelective(SysRolePo sysRole) {
        return sysRoleDao.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public Integer updateByPrimaryKey(SysRolePo sysRole) {
        return sysRoleDao.updateByPrimaryKey(sysRole);
    }

    @Override
    public Integer batchInsert(List<SysRolePo> list) {
        return sysRoleDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<SysRolePo> list) {
        return sysRoleDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(SysRolePo sysRole) {
        return sysRoleDao.upsert(sysRole);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(SysRolePo sysRole) {
        return sysRoleDao.upsertSelective(sysRole);
    }

    @Override
    public List<SysRolePo> query(SysRolePo sysRole) {
        return sysRoleDao.query(sysRole);
    }

    @Override
    public Long queryTotal() {
        return sysRoleDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return sysRoleDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
