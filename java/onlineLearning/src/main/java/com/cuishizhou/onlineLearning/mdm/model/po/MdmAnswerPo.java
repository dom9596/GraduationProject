package com.cuishizhou.onlineLearning.mdm.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 答案表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 15:21:35
 * @since jdk1.8
 */
public class MdmAnswerPo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Long answerId;
    /**
     * 题目id
     */
    private Long questioinId;
    /**
     * 题目类型
     */
    private String questioinType;
    /**
     * 答案
     */
    private String answer;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 创建时间
     */
    private Date createDate;
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
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    /**
     * 表id
     */
    public Long getAnswerId() {
        return answerId;
    }

    /**
     * 题目id
     */
    public void setQuestioinId(Long questioinId) {
        this.questioinId = questioinId;
    }

    /**
     * 题目id
     */
    public Long getQuestioinId() {
        return questioinId;
    }

    /**
     * 题目类型
     */
    public void setQuestioinType(String questioinType) {
        this.questioinType = questioinType;
    }

    /**
     * 题目类型
     */
    public String getQuestioinType() {
        return questioinType;
    }

    /**
     * 答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 答案
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建时间
     */
    public Date getCreateDate() {
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
