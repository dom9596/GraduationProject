package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmClassDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 班级表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:28
 * @since jdk 1.8
 */
@Service("mdmClassService")
public class MdmClassServiceImpl implements MdmClassService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmClassDao mdmClassDao;


    @Override
    public Page<MdmClassPo> selectPaged(RowBounds rowBounds) {
        return mdmClassDao.selectPaged(rowBounds);
    }

    @Override
    public MdmClassPo selectByPrimaryKey(Integer classId) {
        return mdmClassDao.selectByPrimaryKey(classId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer classId) {
        return mdmClassDao.deleteByPrimaryKey(classId);
    }

    @Override
    public Integer insert(MdmClassPo mdmClass) {
        return mdmClassDao.insert(mdmClass);
    }

    @Override
    public Integer insertSelective(MdmClassPo mdmClass) {
        return mdmClassDao.insertSelective(mdmClass);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmClassPo mdmClass) {
        return mdmClassDao.insertSelectiveIgnore(mdmClass);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmClassPo mdmClass) {
        return mdmClassDao.updateByPrimaryKeySelective(mdmClass);
    }

    @Override
    public Integer updateByPrimaryKey(MdmClassPo mdmClass) {
        return mdmClassDao.updateByPrimaryKey(mdmClass);
    }

    @Override
    public Integer batchInsert(List<MdmClassPo> list) {
        return mdmClassDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmClassPo> list) {
        return mdmClassDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(MdmClassPo mdmClass) {
        return mdmClassDao.upsert(mdmClass);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(MdmClassPo mdmClass) {
        return mdmClassDao.upsertSelective(mdmClass);
    }

    @Override
    public List<MdmClassPo> query(MdmClassPo mdmClass) {
        return mdmClassDao.query(mdmClass);
    }

    @Override
    public Long queryTotal() {
        return mdmClassDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return mdmClassDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
