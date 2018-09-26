package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_user_group
 * remark      用户组
 */
public class UserGroupEntity extends StubConfDTO {


    /**
     * column_name    group_name
     * remark         组名
     */
    private String groupName;


    /**
     * column_name    group_desc
     * remark         组描述
     */
    private String groupDesc;


    /**
     * column_name    group_type
     * remark         组类型 role/report  角色组/报警组
     */
    private String groupType;


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


    public String getGroupName() {
        return groupName;
    }


    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }


    public String getGroupDesc() {
        return groupDesc;
    }


    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }


    public String getGroupType() {
        return groupType;
    }


    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
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