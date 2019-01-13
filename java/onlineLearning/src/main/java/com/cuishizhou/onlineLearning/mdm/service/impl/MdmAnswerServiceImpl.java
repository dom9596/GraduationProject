package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmAnswerDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmAnswerPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmAnswerService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 答案表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2019-01-13 05:54:25
 * @since jdk 1.8
 */
@Service("mdmAnswerService")
public class MdmAnswerServiceImpl implements MdmAnswerService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmAnswerDao mdmAnswerDao;


    @Override
    public Page<MdmAnswerPo> selectPaged(RowBounds rowBounds) {
        return mdmAnswerDao.selectPaged(rowBounds);
    }

    @Override
    public MdmAnswerPo selectByPrimaryKey(Integer answerId) {
        return mdmAnswerDao.selectByPrimaryKey(answerId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer answerId) {
        return mdmAnswerDao.deleteByPrimaryKey(answerId);
    }

    @Override
    public Integer insert(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insert(mdmAnswer);
    }

    @Override
    public Integer insertSelective(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insertSelective(mdmAnswer);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insertSelectiveIgnore(mdmAnswer);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.updateByPrimaryKeySelective(mdmAnswer);
    }

    @Override
    public Integer updateByPrimaryKey(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.updateByPrimaryKey(mdmAnswer);
    }

    @Override
    public Integer batchInsert(List<MdmAnswerPo> list) {
        return mdmAnswerDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmAnswerPo> list) {
        return mdmAnswerDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    @Override
    public Integer upsert(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.upsert(mdmAnswer);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    @Override
    public Integer upsertSelective(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.upsertSelective(mdmAnswer);
    }

    @Override
    public List<MdmAnswerPo> query(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.query(mdmAnswer);
    }

    @Override
    public Long queryTotal() {
        return mdmAnswerDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Integer> list) {
        return mdmAnswerDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
