package com.cuishizhou.onlineLearning.mdm.model.resp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 答案表
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2019-01-13 05:54:25
 * @since jdk1.8
 */
@Setter
@Getter
public class MdmAnswerResp implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Integer answerId;
    /**
     * 题目id
     */
    private Integer questioinId;
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
}
