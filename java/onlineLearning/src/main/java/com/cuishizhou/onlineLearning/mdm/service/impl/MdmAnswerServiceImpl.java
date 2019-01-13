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
 * @author 崔世宙
 * @mail 1101133246@qq.com
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
    public MdmAnswerPo selectByPrimaryKey(Long answerId) {
        return mdmAnswerDao.selectByPrimaryKey(answerId);
    }

    @Override
    public Long deleteByPrimaryKey(Long answerId) {
        return mdmAnswerDao.deleteByPrimaryKey(answerId);
    }

    @Override
    public Long insert(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insert(mdmAnswer);
    }

    @Override
    public Long insertSelective(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insertSelective(mdmAnswer);
    }

    @Override
    public Long insertSelectiveIgnore(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.insertSelectiveIgnore(mdmAnswer);
    }

    @Override
    public Long updateByPrimaryKeySelective(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.updateByPrimaryKeySelective(mdmAnswer);
    }

    @Override
    public Long updateByPrimaryKey(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.updateByPrimaryKey(mdmAnswer);
    }

    @Override
    public Long batchInsert(List<MdmAnswerPo> list) {
        return mdmAnswerDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<MdmAnswerPo> list) {
        return mdmAnswerDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param
     * @return
     */
    @Override
    public Long upsert(MdmAnswerPo mdmAnswer) {
        return mdmAnswerDao.upsert(mdmAnswer);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param
     * @return
     */
    @Override
    public Long upsertSelective(MdmAnswerPo mdmAnswer) {
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
    public Long deleteBatch(List<Long> list) {
        return mdmAnswerDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
