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
 * @author itar
 * @email wuhandzy@gmail.com
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
    public MdmQuestioinImagePo selectByPrimaryKey(Integer questioinImageId) {
        return mdmQuestioinImageDao.selectByPrimaryKey(questioinImageId);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer questioinImageId) {
        return mdmQuestioinImageDao.deleteByPrimaryKey(questioinImageId);
    }

    @Override
    public Integer insert(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insert(mdmQuestioinImage);
    }

    @Override
    public Integer insertSelective(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insertSelective(mdmQuestioinImage);
    }

    @Override
    public Integer insertSelectiveIgnore(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.insertSelectiveIgnore(mdmQuestioinImage);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.updateByPrimaryKeySelective(mdmQuestioinImage);
    }

    @Override
    public Integer updateByPrimaryKey(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.updateByPrimaryKey(mdmQuestioinImage);
    }

    @Override
    public Integer batchInsert(List<MdmQuestioinImagePo> list) {
        return mdmQuestioinImageDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<MdmQuestioinImagePo> list) {
        return mdmQuestioinImageDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(MdmQuestioinImagePo mdmQuestioinImage) {
        return mdmQuestioinImageDao.upsert(mdmQuestioinImage);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(MdmQuestioinImagePo mdmQuestioinImage) {
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
    public Integer deleteBatch(List<Integer> list) {
        return mdmQuestioinImageDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
