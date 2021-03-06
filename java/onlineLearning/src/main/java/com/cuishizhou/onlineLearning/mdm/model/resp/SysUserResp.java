package com.cuishizhou.onlineLearning.mdm.model.resp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2019-01-23 15:32:14
 * @since jdk1.8
 */
@Setter
@Getter
public class SysUserResp implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Long userId;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 名称
     */
    private String userName;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 加密密码
     */
    private String passwordEncryption;
    /**
     * 描述
     */
    private String description;
    /**
     * 学校
     */
    private String school;
    /**
     * 邮箱
     */
    private String email;
    /**
     * qq
     */
    private String qq;
    /**
     * 微信
     */
    private String wechat;
    /**
     * 手机
     */
    private String phone;
    /**
     * 状态
     */
    private String status;
    /**
     * 是否是第一次登陆
     */
    private String firstLogin;
    /**
     * 有效期从
     */
    private Date startActiveDate;
    /**
     * 有兴趣至
     */
    private Date endActiveData;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 最后更新密码日期
     */
    private Date lastPasswordUpdateDate;
    /**
     * 最后登陆日期
     */
    private Date lastLoginDate;
    /**
     *
     */
    private Date creationDate;
    /**
     *
     */
    private Long createdBy;
    /**
     *
     */
    private Long lastUpdatedBy;
    /**
     *
     */
    private Date lastUpdateDate;
    /**
     *
     */
    private Long lastUpdateLogin;
    /**
     *
     */
    private Long programApplicationId;
    /**
     *
     */
    private Long programId;
    /**
     *
     */
    private Date programUpdateDate;
    /**
     *
     */
    private Long requestId;
    /**
     *
     */
    private String attributeCategory;
    /**
     *
     */
    private String attribute1;
    /**
     *
     */
    private String attribute2;
    /**
     *
     */
    private String attribute3;
    /**
     *
     */
    private String attribute4;
    /**
     *
     */
    private String attribute5;
    /**
     *
     */
    private String attribute6;
    /**
     *
     */
    private String attribute7;
    /**
     *
     */
    private String attribute8;
    /**
     *
     */
    private String attribute9;
    /**
     *
     */
    private String attribute10;
    /**
     *
     */
    private String attribute11;
    /**
     *
     */
    private String attribute12;
    /**
     *
     */
    private String attribute13;
    /**
     *
     */
    private String attribute14;
    /**
     *
     */
    private String attribute15;
}
