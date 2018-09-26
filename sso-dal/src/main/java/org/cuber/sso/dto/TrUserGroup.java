package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   tr_user_group
 * remark      用户和用户组关联表
 */
public class TrUserGroup extends StubConfDTO {


    /**
     * column_name    group_id
     * remark         组ID
     */
    private String groupId;


    /**
     * column_name    user_id
     * remark         用户ID
     */
    private String userId;


    /**
     * column_name    connect_datetime
     * remark         关联时间
     */
    private LocalDateTime connectDatetime;


    public String getGroupId() {
        return groupId;
    }


    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


    public LocalDateTime getConnectDatetime() {
        return connectDatetime;
    }


    public void setConnectDatetime(LocalDateTime connectDatetime) {
        this.connectDatetime = connectDatetime;
    }


}