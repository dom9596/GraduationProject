package com.cuishizhou.onlineLearning.login.service.impl;


import com.cuishizhou.onlineLearning.login.service.IRegisterService;
import com.cuishizhou.onlineLearning.mdm.dao.SysUserDao;
import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.cuishizhou.onlineLearning.unit.jwt.JWTUtils;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-23 23:40:12
 * @since jdk 1.8
 */
@Service("RegisterService")
public class RegisterServiceImpl implements IRegisterService {
    Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

    @Autowired
    public SysUserDao sysUserDao;

    @Override
    public Long registerUser() {
        return sysUserDao.queryTotal();
    }

    @Override
    /**
     * 注册
     */
    public String RegisterIn(SysUserPo sysUserPo) {
        //插入记录、生成Token
        sysUserPo.setUserName(sysUserPo.getUserCode());
        sysUserDao.insertSelective(sysUserPo);
        logger.debug(sysUserPo.toString());
        //生成Token
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userCode", sysUserPo.getUserCode());
        map.put("userType", sysUserPo.getUserType());
        String token = JWTUtils.createJWT(map);
        return token;
    }
}
