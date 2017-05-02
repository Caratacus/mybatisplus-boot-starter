package com.baomidou.mybatisplus.sample.entity;

import java.util.Date;

public class Account {

    /**
     * 登陆名(手机号)
     */
    private String loginName;
    /**
     * 密码
     */
    private String password;
    /**
     * 注册时间
     */
    private Date regTime;
    /**
     * 类型
     */
    private Integer userType;
    /**
     * 性别(保留字段)
     */
    private String sex;
    /**
     * 最后登陆IP
     */
    private String lastLoginIp;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系地址 保留字段
     */
    private String contactAddress;
    /**
     * 最后登陆时间
     */
    private Date lastLoginTime;
    /**
     * 注册IP
     */
    private String regIp;
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 姓名
     */
    private String name;
    /**
     * 头像地址
     */
    private String headPortrait;
    /**
     * 状态
     */
    private Integer status;
    /**
     * A:安卓,I:IOS,P:PC
     */
    private String sourceType;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

}


