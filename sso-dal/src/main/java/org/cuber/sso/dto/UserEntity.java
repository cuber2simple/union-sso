package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_user
 * remark      用户表
 */
public class UserEntity extends StubConfDTO {


    /**
     * column_name    user_name
     * remark         用户名
     */
    private String userName;


    /**
     * column_name    nick_name
     * remark         用户昵称
     */
    private String nickName;


    /**
     * column_name    password
     * remark         用户密码
     */
    private String password;


    /**
     * column_name    email
     * remark         用户邮箱
     */
    private String email;


    /**
     * column_name    mobile
     * remark         用户手机
     */
    private String mobile;


    /**
     * column_name    sex
     * remark         用户性别
     */
    private String sex;


    /**
     * column_name    avatar
     * remark         用户头像
     */
    private String avatar;


    /**
     * column_name    wx_open_id
     * remark         微信公开ID
     */
    private String wxOpenId;


    /**
     * column_name    ding_open_id
     * remark         ding的用户号
     */
    private String dingOpenId;


    /**
     * column_name    domain
     * remark         所属domain
     */
    private String domain;


    /**
     * column_name    is_sys
     * remark         系统内置
     */
    private String isSys;


    /**
     * column_name    last_login_id
     * remark         最后一次登录ID
     */
    private String lastLoginId;


    /**
     * column_name    expire_datetime
     * remark         过期时间
     */
    private LocalDateTime expireDatetime;


    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }


    public String getNickName() {
        return nickName;
    }


    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


    public String getAvatar() {
        return avatar;
    }


    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }


    public String getWxOpenId() {
        return wxOpenId;
    }


    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }


    public String getDingOpenId() {
        return dingOpenId;
    }


    public void setDingOpenId(String dingOpenId) {
        this.dingOpenId = dingOpenId == null ? null : dingOpenId.trim();
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


    public String getLastLoginId() {
        return lastLoginId;
    }


    public void setLastLoginId(String lastLoginId) {
        this.lastLoginId = lastLoginId == null ? null : lastLoginId.trim();
    }


    public LocalDateTime getExpireDatetime() {
        return expireDatetime;
    }


    public void setExpireDatetime(LocalDateTime expireDatetime) {
        this.expireDatetime = expireDatetime;
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}