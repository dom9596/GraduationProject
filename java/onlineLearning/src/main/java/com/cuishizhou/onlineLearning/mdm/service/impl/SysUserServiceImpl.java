package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.SysUserDao;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.cuishizhou.onlineLearning.mdm.service.SysUserService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-23 15:32:14
 * @since jdk 1.8
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public SysUserDao sysUserDao;


    @Override
    public Page<SysUserPo> selectPaged(RowBounds rowBounds) {
        return sysUserDao.selectPaged(rowBounds);
    }

    @Override
    public SysUserPo selectByPrimaryKey(Long userId) {
        return sysUserDao.selectByPrimaryKey(userId);
    }

    @Override
    public Long deleteByPrimaryKey(Long userId) {
        return sysUserDao.deleteByPrimaryKey(userId);
    }

    @Override
    public Long insert(SysUserPo sysUser) {
        return sysUserDao.insert(sysUser);
    }

    @Override
    public Long insertSelective(SysUserPo sysUser) {
        return sysUserDao.insertSelective(sysUser);
    }

    @Override
    public Long insertSelectiveIgnore(SysUserPo sysUser) {
        return sysUserDao.insertSelectiveIgnore(sysUser);
    }

    @Override
    public Long updateByPrimaryKeySelective(SysUserPo sysUser) {
        return sysUserDao.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Long updateByPrimaryKey(SysUserPo sysUser) {
        return sysUserDao.updateByPrimaryKey(sysUser);
    }

    @Override
    public Long batchInsert(List<SysUserPo> list) {
        return sysUserDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<SysUserPo> list) {
        return sysUserDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Long upsert(SysUserPo sysUser) {
        return sysUserDao.upsert(sysUser);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Long upsertSelective(SysUserPo sysUser) {
        return sysUserDao.upsertSelective(sysUser);
    }

    @Override
    public List<SysUserPo> query(SysUserPo sysUser) {
        return sysUserDao.query(sysUser);
    }

    @Override
    public Long queryTotal() {
        return sysUserDao.queryTotal();
    }

    @Override
    public Long deleteBatch(List<Long> list) {
        return sysUserDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
