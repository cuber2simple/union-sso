package org.cuber.sso.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_resource
 * remark      资源表
 */
public class Resource extends StubConfDTO {


    /**
     * column_name    resource_name
     * remark         资源名
     */
    private String resourceName;


    /**
     * column_name    resource_desc
     * remark         资源描述
     */
    private String resourceDesc;


    /**
     * column_name    resource_type
     * remark         资源类型  menu/element 菜单/元素
     */
    private String resourceType;


    /**
     * column_name    parent_id
     * remark         父资源ID
     */
    private String parentId;


    /**
     * column_name    resource_url
     * remark         资源URL
     */
    private String resourceUrl;


    /**
     * column_name    resource_icon
     * remark         资源ICON
     */
    private String resourceIcon;


    /**
     * column_name    resource_zh_name
     * remark         资源中文名
     */
    private String resourceZhName;


    /**
     * column_name    i18n_key
     * remark         资源i18n_key
     */
    private String i18nKey;


    /**
     * column_name    tree_sort
     * remark         资源次序
     */
    private Short treeSort;


    /**
     * column_name    tree_leaf
     * remark         是否子资源 Y/N 是否子资源
     */
    private String treeLeaf;


    /**
     * column_name    tree_level
     * remark         资源层级
     */
    private Short treeLevel;


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


    public String getResourceName() {
        return resourceName;
    }


    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }


    public String getResourceDesc() {
        return resourceDesc;
    }


    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc == null ? null : resourceDesc.trim();
    }


    public String getResourceType() {
        return resourceType;
    }


    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }


    public String getParentId() {
        return parentId;
    }


    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }


    public String getResourceUrl() {
        return resourceUrl;
    }


    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }


    public String getResourceIcon() {
        return resourceIcon;
    }


    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon == null ? null : resourceIcon.trim();
    }


    public String getResourceZhName() {
        return resourceZhName;
    }


    public void setResourceZhName(String resourceZhName) {
        this.resourceZhName = resourceZhName == null ? null : resourceZhName.trim();
    }


    public String getI18nKey() {
        return i18nKey;
    }


    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey == null ? null : i18nKey.trim();
    }


    public Short getTreeSort() {
        return treeSort;
    }


    public void setTreeSort(Short treeSort) {
        this.treeSort = treeSort;
    }


    public String getTreeLeaf() {
        return treeLeaf;
    }


    public void setTreeLeaf(String treeLeaf) {
        this.treeLeaf = treeLeaf == null ? null : treeLeaf.trim();
    }


    public Short getTreeLevel() {
        return treeLevel;
    }


    public void setTreeLevel(Short treeLevel) {
        this.treeLevel = treeLevel;
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