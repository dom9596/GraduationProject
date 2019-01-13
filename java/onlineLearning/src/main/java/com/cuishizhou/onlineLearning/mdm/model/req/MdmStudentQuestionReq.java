package com.cuishizhou.onlineLearning.mdm.model.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 答题表
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:40
 * @since jdk1.8
 */
@Setter
@Getter
public class MdmStudentQuestionReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Long studentQuestionId;
    /**
     * 学生id
     */
    private Long userStuId;
    /**
     * 教师id
     */
    private Long userTchId;
    /**
     * 问题id
     */
    private Long questionId;
    /**
     * 得分
     */
    private Long score;
    /**
     * 备注
     */
    private String description;
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
}
