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
 * @author itar
 * @email wuhandzy@gmail.com
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
    public MdmClassStudentPo selectByPrimaryKey(Integer classStudentId) {
        return mdmClassStudentDao.selectByPrimaryKey(classStudentId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer classStudentId) {
        return mdmClassStudentDao.deleteByPrimaryKey(classStudentId);
    }

    @Override
    public Integer insert(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insert(mdmClassStudent);
    }

    @Override
    public Integer insertSelective(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insertSelective(mdmClassStudent);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.insertSelectiveIgnore(mdmClassStudent);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.updateByPrimaryKeySelective(mdmClassStudent);
    }

    @Override
    public Integer updateByPrimaryKey(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.updateByPrimaryKey(mdmClassStudent);
    }

    @Override
    public Integer batchInsert(List<MdmClassStudentPo> list) {
        return mdmClassStudentDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmClassStudentPo> list) {
        return mdmClassStudentDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(MdmClassStudentPo mdmClassStudent) {
        return mdmClassStudentDao.upsert(mdmClassStudent);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(MdmClassStudentPo mdmClassStudent) {
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
    public Integer deleteBatch(List<Integer> list) {
        return mdmClassStudentDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
