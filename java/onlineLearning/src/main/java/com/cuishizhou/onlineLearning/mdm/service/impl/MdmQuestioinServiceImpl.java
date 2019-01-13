package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmQuestioinDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmQuestioinService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 问题表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:36
 * @since jdk 1.8
 */
@Service("mdmQuestioinService")
public class MdmQuestioinServiceImpl implements MdmQuestioinService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmQuestioinDao mdmQuestioinDao;


    @Override
    public Page<MdmQuestioinPo> selectPaged(RowBounds rowBounds) {
        return mdmQuestioinDao.selectPaged(rowBounds);
    }

    @Override
    public MdmQuestioinPo selectByPrimaryKey(Integer questioinId) {
        return mdmQuestioinDao.selectByPrimaryKey(questioinId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer questioinId) {
        return mdmQuestioinDao.deleteByPrimaryKey(questioinId);
    }

    @Override
    public Integer insert(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.insert(mdmQuestioin);
    }

    @Override
    public Integer insertSelective(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.insertSelective(mdmQuestioin);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.insertSelectiveIgnore(mdmQuestioin);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.updateByPrimaryKeySelective(mdmQuestioin);
    }

    @Override
    public Integer updateByPrimaryKey(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.updateByPrimaryKey(mdmQuestioin);
    }

    @Override
    public Integer batchInsert(List<MdmQuestioinPo> list) {
        return mdmQuestioinDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmQuestioinPo> list) {
        return mdmQuestioinDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.upsert(mdmQuestioin);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.upsertSelective(mdmQuestioin);
    }

    @Override
    public List<MdmQuestioinPo> query(MdmQuestioinPo mdmQuestioin) {
        return mdmQuestioinDao.query(mdmQuestioin);
    }

    @Override
    public Long queryTotal() {
        return mdmQuestioinDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return mdmQuestioinDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
