package com.cuishizhou.onlineLearning.login.service.impl;

import com.cuishizhou.onlineLearning.login.service.ILoginService;
import com.cuishizhou.onlineLearning.mdm.dao.SysUserDao;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登陆
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-23 23:40:12
 * @since jdk 1.8
 */
@Service("LoginService")
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUserPo> questUser(SysUserPo sysUserPo) {
        List<SysUserPo> list = sysUserDao.queryByUserCode(sysUserPo);
        System.out.println(list.size()+"----");
        for (SysUserPo dto : list) {
            System.out.println(dto.toString());
        }
        return list;
    }
}
