package com.cuishizhou.onlineLearning.mdm.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:36
 * @since jdk1.8
 */
public class MdmQuestioinPo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Long questioinId;
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 教师id
     */
    private Long userId;
    /**
     * 问题编码
     */
    private String questioinCode;
    /**
     * 题干
     */
    private String questionStem;
    /**
     * 是否共享y/n
     */
    private String questioinIsshare;
    /**
     * 问题描述
     */
    private String questioinDescription;
    /**
     * 问题类型(单选/多选/填空/简答)
     */
    private String questionType;
    /**
     * 选项1
     */
    private String option1;
    /**
     * 选项2
     */
    private String option2;
    /**
     * 选项3
     */
    private String option3;
    /**
     * 选项4
     */
    private String option4;
    /**
     * 选项5
     */
    private String option5;
    /**
     * 选项6
     */
    private String option6;
    /**
     * 选项7
     */
    private String option7;
    /**
     * 选项8
     */
    private String option8;
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

    /**
     * 表id
     */
    public void setQuestioinId(Long questioinId) {
        this.questioinId = questioinId;
    }

    /**
     * 表id
     */
    public Long getQuestioinId() {
        return questioinId;
    }

    /**
     * 课程id
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 课程id
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * 教师id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 教师id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 问题编码
     */
    public void setQuestioinCode(String questioinCode) {
        this.questioinCode = questioinCode;
    }

    /**
     * 问题编码
     */
    public String getQuestioinCode() {
        return questioinCode;
    }

    /**
     * 题干
     */
    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    /**
     * 题干
     */
    public String getQuestionStem() {
        return questionStem;
    }

    /**
     * 是否共享y/n
     */
    public void setQuestioinIsshare(String questioinIsshare) {
        this.questioinIsshare = questioinIsshare;
    }

    /**
     * 是否共享y/n
     */
    public String getQuestioinIsshare() {
        return questioinIsshare;
    }

    /**
     * 问题描述
     */
    public void setQuestioinDescription(String questioinDescription) {
        this.questioinDescription = questioinDescription;
    }

    /**
     * 问题描述
     */
    public String getQuestioinDescription() {
        return questioinDescription;
    }

    /**
     * 问题类型(单选/多选/填空/简答)
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * 问题类型(单选/多选/填空/简答)
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * 选项1
     */
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    /**
     * 选项1
     */
    public String getOption1() {
        return option1;
    }

    /**
     * 选项2
     */
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    /**
     * 选项2
     */
    public String getOption2() {
        return option2;
    }

    /**
     * 选项3
     */
    public void setOption3(String option3) {
        this.option3 = option3;
    }

    /**
     * 选项3
     */
    public String getOption3() {
        return option3;
    }

    /**
     * 选项4
     */
    public void setOption4(String option4) {
        this.option4 = option4;
    }

    /**
     * 选项4
     */
    public String getOption4() {
        return option4;
    }

    /**
     * 选项5
     */
    public void setOption5(String option5) {
        this.option5 = option5;
    }

    /**
     * 选项5
     */
    public String getOption5() {
        return option5;
    }

    /**
     * 选项6
     */
    public void setOption6(String option6) {
        this.option6 = option6;
    }

    /**
     * 选项6
     */
    public String getOption6() {
        return option6;
    }

    /**
     * 选项7
     */
    public void setOption7(String option7) {
        this.option7 = option7;
    }

    /**
     * 选项7
     */
    public String getOption7() {
        return option7;
    }

    /**
     * 选项8
     */
    public void setOption8(String option8) {
        this.option8 = option8;
    }

    /**
     * 选项8
     */
    public String getOption8() {
        return option8;
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
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     *
     */
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     *
     */
    public Long getLastUpdatedBy() {
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
    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    /**
     *
     */
    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     *
     */
    public void setProgramApplicationId(Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    /**
     *
     */
    public Long getProgramApplicationId() {
        return programApplicationId;
    }

    /**
     *
     */
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    /**
     *
     */
    public Long getProgramId() {
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
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    /**
     *
     */
    public Long getRequestId() {
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
