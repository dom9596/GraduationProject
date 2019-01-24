package com.cuishizhou.onlineLearning.mdm.model;

import java.io.Serializable;

/**
 * 返回基类
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-13 05:54:25
 * @since jdk 1.8
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 2120267584344923858L;

    private Long status = 0L;

    private String message = null;

    private T data = null;

    public Result() {

    }

    public Result(Long status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
