package com.cuishizhou.onlineLearning.login.service;

import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;

import javax.xml.ws.Response;
import java.util.List;

/**
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 15:21:35
 * @since jdk 1.8
 */
public interface ILoginService {

    /**
     * 登录
     *
     * @param sysUserPo
     * @return
     */
    public List<SysUserPo> questUser(SysUserPo sysUserPo);
}
