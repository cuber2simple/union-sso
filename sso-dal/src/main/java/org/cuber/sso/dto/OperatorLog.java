package org.cuber.sso.dto;

import org.cuber.stub.repo.StubBizDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_operate_log
 * remark      操作日志表
 */
public class OperatorLog extends StubBizDTO {


    /**
     * column_name    login_id
     * remark         登录ID
     */
    private String loginId;


    /**
     * column_name    trace_id
     * remark         轨迹ID
     */
    private String traceId;


    /**
     * column_name    user_id
     * remark         用户ID
     */
    private String userId;


    /**
     * column_name    app
     * remark         项目名
     */
    private String app;


    /**
     * column_name    host_name
     * remark         主机名
     */
    private String hostName;


    /**
     * column_name    action
     * remark         动作名
     */
    private String action;


    /**
     * column_name    url
     * remark         操作的url
     */
    private String url;


    /**
     * column_name    content
     * remark         操作内容
     */
    private String content;


    /**
     * column_name    operate_result
     * remark         操作日志,success/fail/abnormal  成功/失败/异常
     */
    private String operateResult;

    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getLoginId() {
        return loginId;
    }


    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }


    public String getTraceId() {
        return traceId;
    }


    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


    public String getApp() {
        return app;
    }


    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }


    public String getHostName() {
        return hostName;
    }


    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }


    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


    public String getOperateResult() {
        return operateResult;
    }


    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult == null ? null : operateResult.trim();
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}