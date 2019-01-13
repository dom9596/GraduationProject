package com.cuishizhou.onlineLearning.mdm.model.bo;

import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
public class SysRoleBo implements Serializable {
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
}
