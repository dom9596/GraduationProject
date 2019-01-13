package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.SysUserRoleDao;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserRolePo;
import com.cuishizhou.onlineLearning.mdm.service.SysUserRoleService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户角色表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:46
 * @since jdk 1.8
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public SysUserRoleDao sysUserRoleDao;


    @Override
    public Page<SysUserRolePo> selectPaged(RowBounds rowBounds) {
        return sysUserRoleDao.selectPaged(rowBounds);
    }

    @Override
    public SysUserRolePo selectByPrimaryKey(Integer surId) {
        return sysUserRoleDao.selectByPrimaryKey(surId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer surId) {
        return sysUserRoleDao.deleteByPrimaryKey(surId);
    }

    @Override
    public Integer insert(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insert(sysUserRole);
    }

    @Override
    public Integer insertSelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insertSelective(sysUserRole);
    }

    @Override
    public Integer insertSelectiveIgnore(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insertSelectiveIgnore(sysUserRole);
    }

    @Override
    public Integer updateByPrimaryKeySelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.updateByPrimaryKeySelective(sysUserRole);
    }

    @Override
    public Integer updateByPrimaryKey(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.updateByPrimaryKey(sysUserRole);
    }

    @Override
    public Integer batchInsert(List<SysUserRolePo> list) {
        return sysUserRoleDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<SysUserRolePo> list) {
        return sysUserRoleDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.upsert(sysUserRole);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.upsertSelective(sysUserRole);
    }

    @Override
    public List<SysUserRolePo> query(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.query(sysUserRole);
    }

    @Override
    public Long queryTotal() {
        return sysUserRoleDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return sysUserRoleDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
