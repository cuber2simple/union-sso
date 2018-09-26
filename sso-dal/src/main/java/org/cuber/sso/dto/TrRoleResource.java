package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   tr_role_resource
 * remark      用户和用户组关联表
 */
public class TrRoleResource extends StubConfDTO {


    /**
     * column_name    role_id
     * remark         角色ID
     */
    private String roleId;


    /**
     * column_name    resource_id
     * remark         资源ID
     */
    private String resourceId;


    /**
     * column_name    connect_datetime
     * remark         关联时间
     */
    private LocalDateTime connectDatetime;


    public String getRoleId() {
        return roleId;
    }


    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }


    public String getResourceId() {
        return resourceId;
    }


    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }


    public LocalDateTime getConnectDatetime() {
        return connectDatetime;
    }


    public void setConnectDatetime(LocalDateTime connectDatetime) {
        this.connectDatetime = connectDatetime;
    }


}