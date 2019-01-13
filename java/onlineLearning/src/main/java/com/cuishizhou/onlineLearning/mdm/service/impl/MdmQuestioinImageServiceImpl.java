package com.cuishizhou.onlineLearning.mdm.service.impl;

import com.cuishizhou.onlineLearning.mdm.dao.MdmQuestioinImageDao;
import com.cuishizhou.onlineLearning.mdm.model.po.MdmQuestioinImagePo;
import com.cuishizhou.onlineLearning.mdm.service.MdmQuestioinImageService;
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
 * @date 2019-01-13 05:54:38
 * @since jdk 1.8
 */
@Service("mdmQuestioinImageService")
public class MdmQuestioinImageServiceImpl implements MdmQuestioinImageService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public MdmQuestioinImageDao mdmQuestioinImageDao;


    @Override
    public Page<MdmQuestioinImagePo> selectPaged(RowBounds rowBounds) {
        return mdmQuestioinImageDao.selectPaged(rowBounds);
    }

    @Override
    public MdmQuestioinImagePo selectByPrimaryKey(Long questioinImageId) {
        return mdmQuestioinImageDao.selectByPrimaryKey(questioinImageId);
    }

    @Override
    public Long deleteByPrimaryKey(Long questioinImageId) {
        return mdmQuestioinImageDao.deleteByPrimaryKey(questioinImageId);
    }

    @Override
    public Long insert(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insert(mdmQuestioinImage);
    }

    @Override
    public Long insertSelective(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insertSelective(mdmQuestioinImage);
    }

    @Override
    public Long insertSelectiveIgnore(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insertSelectiveIgnore(mdmQuestioinImage);
    }

    @Override
    public Long updateByPrimaryKeySelective(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.updateByPrimaryKeySelective(mdmQuestioinImage);
    }

    @Override
    public Long updateByPrimaryKey(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.updateByPrimaryKey(mdmQuestioinImage);
    }

    @Override
    public Long batchInsert(List<MdmQuestioinImagePo> list) {
        return mdmQuestioinImageDao.batchInsert(list);
    }

    @Override
    public Long batchUpdate(List<MdmQuestioinImagePo> list) {
        return mdmQuestioinImageDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Long upsert(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.upsert(mdmQuestioinImage);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Long upsertSelective(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.upsertSelective(mdmQuestioinImage);
    }

    @Override
    public List<MdmQuestioinImagePo> query(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.query(mdmQuestioinImage);
    }

    @Override
    public Long queryTotal() {
        return mdmQuestioinImageDao.queryTotal();
    }

    @Override
    public Long deleteBatch(List<Long> list) {
        return mdmQuestioinImageDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
