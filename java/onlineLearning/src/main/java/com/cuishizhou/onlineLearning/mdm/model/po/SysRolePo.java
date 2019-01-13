package com.cuishizhou.onlineLearning.mdm.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2019-01-13 05:54:42
 * @since jdk1.8
 */
public class SysRolePo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Integer roleId;
    /**
     * 编码(学号/工号)
     */
    private String roleCode;
    /**
     * 名称
     */
    private String roleName;
    /**
     * 描述
     */
    private String roleDescription;
    /**
     * 开始生效日期
     */
    private Date rstartActiveDate;
    /**
     * 截至生效日期
     */
    private Date endActivieDate;
    /**
     * 启用标志
     */
    private String enableFlag;
    /**
     * 更新时间
     */
    private String updateDate;
    /**
     * 创建时间
     */
    private String createDate;
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
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 表id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 编码(学号/工号)
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 编码(学号/工号)
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 描述
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    /**
     * 描述
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * 开始生效日期
     */
    public void setRstartActiveDate(Date rstartActiveDate) {
        this.rstartActiveDate = rstartActiveDate;
    }

    /**
     * 开始生效日期
     */
    public Date getRstartActiveDate() {
        return rstartActiveDate;
    }

    /**
     * 截至生效日期
     */
    public void setEndActivieDate(Date endActivieDate) {
        this.endActivieDate = endActivieDate;
    }

    /**
     * 截至生效日期
     */
    public Date getEndActivieDate() {
        return endActivieDate;
    }

    /**
     * 启用标志
     */
    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    /**
     * 启用标志
     */
    public String getEnableFlag() {
        return enableFlag;
    }

    /**
     * 更新时间
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新时间
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 创建时间
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建时间
     */
    public String getCreateDate() {
        return createDate;
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
