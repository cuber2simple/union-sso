package org.cuber.sso.vo;

import io.swagger.annotations.ApiModel;
import org.cuber.stub.vo.StubBizVO;

import java.time.LocalDateTime;


@ApiModel("登陆日志")
public class OperatorLogVo extends StubBizVO {
    private static final long serialVersionUID = 2300424734277289319L;

    private String loginId;

    private String traceId;

    private String userId;

    private String app;

    private String hostName;

    private String action;

    private String url;

    private String content;

    private String operateResult;

    private LocalDateTime updateDatetime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    @Override
    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    @Override
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}
