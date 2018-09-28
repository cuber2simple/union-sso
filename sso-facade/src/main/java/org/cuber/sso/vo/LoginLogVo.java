package org.cuber.sso.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.cuber.stub.json.JacksonHolder;
import org.cuber.stub.sso.LoginType;
import org.cuber.stub.vo.StubBizVO;

import java.time.LocalDateTime;


@ApiModel("登陆日志")
public class LoginLogVo extends StubBizVO {

    private static final long serialVersionUID = 1709613080115180379L;

    @ApiModelProperty("轨迹ID")
    private String traceId;

    @ApiModelProperty("登陆类型 password/phone/email/wechat/ding")
    private LoginType loginType;

    @ApiModelProperty("登陆唯一标识")
    private String identifier;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("用户设备")
    private String device;

    @ApiModelProperty("登陆的IP")
    private String loginIp;

    @ApiModelProperty("登陆的userAgent")
    private String userAgent;

    @ApiModelProperty("登陆结果")
    private LoginResult loginResult;

    @ApiModelProperty("失败原因")
    private String failReason;

    @ApiModelProperty("登出时间")
    private LocalDateTime logoutDatetime;

    @ApiModelProperty("登陆时间")
    private LocalDateTime loginDatetime;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public LoginResult getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
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

    @Override
    public String toString() {
        return JacksonHolder.toJackson(this);
    }
}
