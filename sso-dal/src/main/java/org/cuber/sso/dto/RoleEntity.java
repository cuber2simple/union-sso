package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_role
 * remark      权限表
 */
public class RoleEntity extends StubConfDTO {


    /**
     * column_name    role_name
     * remark         权限名
     */
    private String roleName;


    /**
     * column_name    role_desc
     * remark         权限描述
     */
    private String roleDesc;


    /**
     * column_name    role_type
     * remark         权限类型 permission/workflow 权限角色/流程角色
     */
    private String roleType;


    /**
     * column_name    domain
     * remark         所属domain
     */
    private String domain;


    /**
     * column_name    is_sys
     * remark         是否系统内置
     */
    private String isSys;


    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }


    public String getRoleDesc() {
        return roleDesc;
    }


    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }


    public String getRoleType() {
        return roleType;
    }


    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }


    public String getDomain() {
        return domain;
    }


    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }


    public String getIsSys() {
        return isSys;
    }


    public void setIsSys(String isSys) {
        this.isSys = isSys == null ? null : isSys.trim();
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}