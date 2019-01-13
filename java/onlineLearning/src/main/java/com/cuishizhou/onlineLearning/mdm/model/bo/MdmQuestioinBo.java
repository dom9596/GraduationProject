package com.cuishizhou.onlineLearning.mdm.model.bo;

import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
public class MdmQuestioinBo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Integer questioinId;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 教师id
     */
    private Integer userId;
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
