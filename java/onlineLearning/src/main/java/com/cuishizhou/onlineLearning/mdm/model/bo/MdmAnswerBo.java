package com.cuishizhou.onlineLearning.mdm.model.bo;

import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
public class MdmAnswerBo implements Serializable {
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
}
