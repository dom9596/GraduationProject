package com.cuishizhou.onlineLearning.mdm.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:34
 * @since jdk1.8
 */
public class MdmCoursePo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Integer courseId;
    /**
     * 课程编码
     */
    private String courseCode;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 教师id
     */
    private Integer userId;
    /**
     * 课程描述
     */
    private String courseDescription;
    /**
     * 开课时间
     */
    private Date courseStartDate;
    /**
     * 结课时间
     */
    private Date courseEndDate;
    /**
     * 学分
     */
    private Integer courseCredit;
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
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * 表id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * 课程编码
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * 课程编码
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * 课程名称
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 课程名称
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 教师id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 教师id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 课程描述
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * 课程描述
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * 开课时间
     */
    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    /**
     * 开课时间
     */
    public Date getCourseStartDate() {
        return courseStartDate;
    }

    /**
     * 结课时间
     */
    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    /**
     * 结课时间
     */
    public Date getCourseEndDate() {
        return courseEndDate;
    }

    /**
     * 学分
     */
    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    /**
     * 学分
     */
    public Integer getCourseCredit() {
        return courseCredit;
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
