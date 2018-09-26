package org.cuber.sso.dto;

import org.cuber.stub.repo.StubBizDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_login_log
 * remark      登陆日志表
 */
public class LoginLog extends StubBizDTO {


    /**
     * column_name    trace_id
     * remark         轨迹ID
     */
    private String traceId;


    /**
     * column_name    login_type
     * remark         登陆类型 password/phone/email/wechat/ding
     */
    private String loginType;


    /**
     * column_name    user_name
     * remark
     */
    private String userName;


    /**
     * column_name    user_id
     * remark         用户ID
     */
    private String userId;


    /**
     * column_name    device
     * remark         设备类型
     */
    private String device;


    /**
     * column_name    login_ip
     * remark         登陆IP
     */
    private String loginIp;


    /**
     * column_name    user_agent
     * remark         用户的agent
     */
    private String userAgent;


    /**
     * column_name    login_result
     * remark         登陆结果 1/2/9/r  成功/失败/异常/风控拦截
     */
    private String loginResult;


    /**
     * column_name    fail_reason
     * remark         错误原因
     */
    private String failReason;


    /**
     * column_name    logout_datetime
     * remark         登出时间
     */
    private LocalDateTime logoutDatetime;


    /**
     * column_name    login_datetime
     * remark         登陆时间
     */
    private LocalDateTime loginDatetime;


    public String getTraceId() {
        return traceId;
    }


    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }


    public String getLoginType() {
        return loginType;
    }


    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


    public String getDevice() {
        return device;
    }


    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }


    public String getLoginIp() {
        return loginIp;
    }


    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }


    public String getUserAgent() {
        return userAgent;
    }


    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }


    public String getLoginResult() {
        return loginResult;
    }


    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult == null ? null : loginResult.trim();
    }


    public String getFailReason() {
        return failReason;
    }


    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }


    public LocalDateTime getLogoutDatetime() {
        return logoutDatetime;
    }


    public void setLogoutDatetime(LocalDateTime logoutDatetime) {
        this.logoutDatetime = logoutDatetime;
    }


    public LocalDateTime getLoginDatetime() {
        return loginDatetime;
    }


    public void setLoginDatetime(LocalDateTime loginDatetime) {
        this.loginDatetime = loginDatetime;
    }


}