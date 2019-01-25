package com.cuishizhou.onlineLearning.mdm.model;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * @author cuishizhou
 * @date 2019/1/25 10:42
 * @Description
 */

public class ResponseData {
//  @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    private String message;
    private List<?> rows;
    private boolean success;
    private Long total;
    private String token;


    public ResponseData() {
        this.success = true;
    }

    public ResponseData(boolean success) {
        this.success = true;
        this.setSuccess(success);
    }

    public ResponseData(List<?> list) {
        this(true);
        this.setRows(list);
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<?> getRows() {
        return this.rows;
    }

    public Long getTotal() {
        return this.total;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
        if (rows instanceof Page) {
            this.setTotal(((Page) rows).getTotal());
        } else {
            this.setTotal((long) rows.size());
        }

    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

