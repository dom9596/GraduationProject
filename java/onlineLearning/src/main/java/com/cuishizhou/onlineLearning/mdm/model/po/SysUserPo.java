package com.cuishizhou.onlineLearning.mdm.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2019-01-13 05:54:44
 * @since jdk1.8
 */
public class SysUserPo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Integer userId;
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
    private Integer createdBy;
    /**
     *
     */
    private Integer lastUpdatedBy;
    /**
     *
     */
    private Date lastUpdateDate;
    /**
     *
     */
    private Integer lastUpdateLogin;
    /**
     *
     */
    private Integer programApplicationId;
    /**
     *
     */
    private Integer programId;
    /**
     *
     */
    private Date programUpdateDate;
    /**
     *
     */
    private Integer requestId;
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

    /**
     * 表id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 表id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 用户编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 加密密码
     */
    public void setPasswordEncryption(String passwordEncryption) {
        this.passwordEncryption = passwordEncryption;
    }

    /**
     * 加密密码
     */
    public String getPasswordEncryption() {
        return passwordEncryption;
    }

    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 是否是第一次登陆
     */
    public void setFirstLogin(String firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * 是否是第一次登陆
     */
    public String getFirstLogin() {
        return firstLogin;
    }

    /**
     * 有效期从
     */
    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    /**
     * 有效期从
     */
    public Date getStartActiveDate() {
        return startActiveDate;
    }

    /**
     * 有兴趣至
     */
    public void setEndActiveData(Date endActiveData) {
        this.endActiveData = endActiveData;
    }

    /**
     * 有兴趣至
     */
    public Date getEndActiveData() {
        return endActiveData;
    }

    /**
     * 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 最后更新密码日期
     */
    public void setLastPasswordUpdateDate(Date lastPasswordUpdateDate) {
        this.lastPasswordUpdateDate = lastPasswordUpdateDate;
    }

    /**
     * 最后更新密码日期
     */
    public Date getLastPasswordUpdateDate() {
        return lastPasswordUpdateDate;
    }

    /**
     * 最后登陆日期
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 最后登陆日期
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     *
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     *
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     *
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     *
     */
    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     *
     */
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     *
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     *
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     *
     */
    public void setLastUpdateLogin(Integer lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    /**
     *
     */
    public Integer getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     *
     */
    public void setProgramApplicationId(Integer programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    /**
     *
     */
    public Integer getProgramApplicationId() {
        return programApplicationId;
    }

    /**
     *
     */
    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    /**
     *
     */
    public Integer getProgramId() {
        return programId;
    }

    /**
     *
     */
    public void setProgramUpdateDate(Date programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }

    /**
     *
     */
    public Date getProgramUpdateDate() {
        return programUpdateDate;
    }

    /**
     *
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     *
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     *
     */
    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    /**
     *
     */
    public String getAttributeCategory() {
        return attributeCategory;
    }

    /**
     *
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     *
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     *
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     *
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     *
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     *
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     *
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     *
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     *
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    /**
     *
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     *
     */
    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    /**
     *
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     *
     */
    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    /**
     *
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
     *
     */
    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    /**
     *
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
     *
     */
    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    /**
     *
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
     *
     */
    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    /**
     *
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
     *
     */
    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    /**
     *
     */
    public String getAttribute11() {
        return attribute11;
    }

    /**
     *
     */
    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    /**
     *
     */
    public String getAttribute12() {
        return attribute12;
    }

    /**
     *
     */
    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    /**
     *
     */
    public String getAttribute13() {
        return attribute13;
    }

    /**
     *
     */
    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    /**
     *
     */
    public String getAttribute14() {
        return attribute14;
    }

    /**
     *
     */
    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    /**
     *
     */
    public String getAttribute15() {
        return attribute15;
    }
}
