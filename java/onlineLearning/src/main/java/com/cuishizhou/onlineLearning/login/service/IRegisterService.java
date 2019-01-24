package com.cuishizhou.onlineLearning.login.service;

import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;

/**
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 15:21:35
 * @since jdk 1.8
 */
public interface IRegisterService {

    public Long registerUser();

    public String  RegisterIn(SysUserPo sysUserPo);

}
