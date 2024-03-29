package com.example.entity;

import java.io.Serializable;
/**
 * ClassName: Reserve
 * Package:com.example.entity
 * Description:
 *
 * @Author ZYN
 * @Create 2024-03-24 16:41
 */



/**
 * 服务预约
 */
public class Reserve implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 服务ID */
    private Integer serveId;
    /** 预约人ID */
    private Integer userId;
    /** 预约时间 */
    private String time;
    /** 审核状态 */
    private String status;
    /** 审核意见 */
    private String reason;

    private String userName;
    private String serveName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServeId() {
        return serveId;
    }

    public void setServeId(Integer serveId) {
        this.serveId = serveId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
