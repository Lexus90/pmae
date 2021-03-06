package com.cw.authoritymng.dao.model;

import java.util.Date;

public class AmUi {
    private Integer id;

    private Integer appId;

    private String uiCode;

    private String parentCode;

    private String uiName;

    private String uiKey;

    private Integer uiType;

    private Integer weight;

    private String uiDesc;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getUiCode() {
        return uiCode;
    }

    public void setUiCode(String uiCode) {
        this.uiCode = uiCode == null ? null : uiCode.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getUiName() {
        return uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName == null ? null : uiName.trim();
    }

    public String getUiKey() {
        return uiKey;
    }

    public void setUiKey(String uiKey) {
        this.uiKey = uiKey == null ? null : uiKey.trim();
    }

    public Integer getUiType() {
        return uiType;
    }

    public void setUiType(Integer uiType) {
        this.uiType = uiType;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getUiDesc() {
        return uiDesc;
    }

    public void setUiDesc(String uiDesc) {
        this.uiDesc = uiDesc == null ? null : uiDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}