package com.cuishizhou.onlineLearning.mdm.model.resp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2019-01-23 15:32:09
 * @since jdk1.8
 */
@Setter
@Getter
public class SysRoleResp implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    private Long roleId;
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
