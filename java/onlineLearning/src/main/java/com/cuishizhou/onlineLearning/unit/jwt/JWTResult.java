package com.cuishizhou.onlineLearning.unit.jwt;

/**
 * @author cuishizhou
 * @date 2019/1/24 22:03
 * @Description
 */
public class JWTResult {
    private boolean status;
    private String uid;
    private String msg;
    private Long code;

    public JWTResult() {
        super();
    }

    public JWTResult(boolean status, String uid, String msg, Long code) {
        super();
        this.status = status;
        this.uid = uid;
        this.msg = msg;
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "JWTResult{" +
                "status=" + status +
                ", uid='" + uid + '\'' +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
