package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmClassStudentDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassStudentPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassStudentService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 班级学生表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:31
 * @since jdk 1.8
 */
@Service("mdmClassStudentService")
public class MdmClassStudentServiceImpl implements MdmClassStudentService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmClassStudentDao mdmClassStudentDao;


    @Override
    public Page<MdmClassStudentPo> selectPaged(RowBounds rowBounds) {
        return mdmClassStudentDao.selectPaged(rowBounds);
    }

    @Override
    public MdmClassStudentPo selectByPrimaryKey(Long classStudentId) {
        return mdmClassStudentDao.selectByPrimaryKey(classStudentId);
    }

    @Override
    public Long deleteByPrimaryKey(Long classStudentId) {
        return mdmClassStudentDao.deleteByPrimaryKey(classStudentId);
    }

    @Override
    public Long insert(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insert(mdmClassStudent);
    }

    @Override
    public Long insertSelective(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insertSelective(mdmClassStudent);
    }

    @Override
    public Long insertSelectiveIgnore(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insertSelectiveIgnore(mdmClassStudent);
    }

    @Override
    public Long updateByPrimaryKeySelective(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.updateByPrimaryKeySelective(mdmClassStudent);
    }

    @Override
    public Long updateByPrimaryKey(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.updateByPrimaryKey(mdmClassStudent);
    }

    @Override
    public Long batchInsert(List<MdmClassStudentPo> list) {
        return mdmClassStudentDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<MdmClassStudentPo> list) {
        return mdmClassStudentDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Long upsert(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.upsert(mdmClassStudent);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Long upsertSelective(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.upsertSelective(mdmClassStudent);
    }

    @Override
    public List<MdmClassStudentPo> query(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.query(mdmClassStudent);
    }

    @Override
    public Long queryTotal() {
        return mdmClassStudentDao.queryTotal();
    }

    @Override
    public Long deleteBatch(List<Long> list) {
        return mdmClassStudentDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
