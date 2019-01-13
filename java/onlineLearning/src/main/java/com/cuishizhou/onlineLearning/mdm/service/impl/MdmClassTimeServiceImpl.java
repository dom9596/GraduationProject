package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmClassTimeDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmClassTimePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmClassTimeService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 班级上课时间表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:32
 * @since jdk 1.8
 */
@Service("mdmClassTimeService")
public class MdmClassTimeServiceImpl implements MdmClassTimeService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmClassTimeDao mdmClassTimeDao;


    @Override
    public Page<MdmClassTimePo> selectPaged(RowBounds rowBounds) {
        return mdmClassTimeDao.selectPaged(rowBounds);
    }

    @Override
    public MdmClassTimePo selectByPrimaryKey(Integer classTimeId) {
        return mdmClassTimeDao.selectByPrimaryKey(classTimeId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer classTimeId) {
        return mdmClassTimeDao.deleteByPrimaryKey(classTimeId);
    }

    @Override
    public Integer insert(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.insert(mdmClassTime);
    }

    @Override
    public Integer insertSelective(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.insertSelective(mdmClassTime);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.insertSelectiveIgnore(mdmClassTime);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.updateByPrimaryKeySelective(mdmClassTime);
    }

    @Override
    public Integer updateByPrimaryKey(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.updateByPrimaryKey(mdmClassTime);
    }

    @Override
    public Integer batchInsert(List<MdmClassTimePo> list) {
        return mdmClassTimeDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmClassTimePo> list) {
        return mdmClassTimeDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.upsert(mdmClassTime);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.upsertSelective(mdmClassTime);
    }

    @Override
    public List<MdmClassTimePo> query(MdmClassTimePo mdmClassTime) {
        return mdmClassTimeDao.query(mdmClassTime);
    }

    @Override
    public Long queryTotal() {
        return mdmClassTimeDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return mdmClassTimeDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
