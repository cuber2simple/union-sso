package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   tr_user_role
 * remark      用户和用户组关联表
 */
public class TrUserRole extends StubConfDTO {


    /**
     * column_name    role_id
     * remark         角色ID
     */
    private String roleId;


    /**
     * column_name    connect_type
     * remark         关联类型 user/group  用户关联/用户组关联
     */
    private String connectType;


    /**
     * column_name    sbj_user_id
     * remark         关联的subject id
     */
    private String sbjUserId;


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


    public String getConnectType() {
        return connectType;
    }


    public void setConnectType(String connectType) {
        this.connectType = connectType == null ? null : connectType.trim();
    }


    public String getSbjUserId() {
        return sbjUserId;
    }


    public void setSbjUserId(String sbjUserId) {
        this.sbjUserId = sbjUserId == null ? null : sbjUserId.trim();
    }


    public LocalDateTime getConnectDatetime() {
        return connectDatetime;
    }


    public void setConnectDatetime(LocalDateTime connectDatetime) {
        this.connectDatetime = connectDatetime;
    }


}