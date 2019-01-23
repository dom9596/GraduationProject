package com.cuishizhou.onlineLearning.login.service.impl;


import com.cuishizhou.onlineLearning.login.service.IRegisterService;
import com.cuishizhou.onlineLearning.mdm.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    public SysUserDao sysUserDao;

    @Override
    public Long registerUser() {
        return sysUserDao.queryTotal();
    }
}
