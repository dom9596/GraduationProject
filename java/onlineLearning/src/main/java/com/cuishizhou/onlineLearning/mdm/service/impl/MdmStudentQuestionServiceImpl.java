package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmStudentQuestionDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmStudentQuestionPo;
import com.cuishizhou.onlineLearning.mdm.service.MdmStudentQuestionService;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 答题表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:40
 * @since jdk 1.8
 */
@Service("mdmStudentQuestionService")
public class MdmStudentQuestionServiceImpl implements MdmStudentQuestionService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmStudentQuestionDao mdmStudentQuestionDao;


    @Override
    public Page<MdmStudentQuestionPo> selectPaged(RowBounds rowBounds) {
        return mdmStudentQuestionDao.selectPaged(rowBounds);
    }

    @Override
    public MdmStudentQuestionPo selectByPrimaryKey(Long studentQuestionId) {
        return mdmStudentQuestionDao.selectByPrimaryKey(studentQuestionId);
    }

    @Override
    public Long deleteByPrimaryKey(Long studentQuestionId) {
        return mdmStudentQuestionDao.deleteByPrimaryKey(studentQuestionId);
    }

    @Override
    public Long insert(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.insert(mdmStudentQuestion);
    }

    @Override
    public Long insertSelective(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.insertSelective(mdmStudentQuestion);
    }

    @Override
    public Long insertSelectiveIgnore(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.insertSelectiveIgnore(mdmStudentQuestion);
    }

    @Override
    public Long updateByPrimaryKeySelective(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.updateByPrimaryKeySelective(mdmStudentQuestion);
    }

    @Override
    public Long updateByPrimaryKey(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.updateByPrimaryKey(mdmStudentQuestion);
    }

    @Override
    public Long batchInsert(List<MdmStudentQuestionPo> list) {
        return mdmStudentQuestionDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<MdmStudentQuestionPo> list) {
        return mdmStudentQuestionDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Long upsert(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.upsert(mdmStudentQuestion);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Long upsertSelective(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.upsertSelective(mdmStudentQuestion);
    }

    @Override
    public List<MdmStudentQuestionPo> query(MdmStudentQuestionPo mdmStudentQuestion) {
        return mdmStudentQuestionDao.query(mdmStudentQuestion);
    }

    @Override
    public Long queryTotal() {
        return mdmStudentQuestionDao.queryTotal();
    }

    @Override
    public Long deleteBatch(List<Long> list) {
        return mdmStudentQuestionDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
