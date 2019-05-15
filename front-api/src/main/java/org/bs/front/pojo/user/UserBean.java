package org.bs.front.pojo.user;

import java.io.Serializable;

public class UserBean implements Serializable {
    private static final long serialVersionUID = 2454822677199984181L;

    private Integer userId; //id

    private  String name;  //用户名

    private String userName; //账号

    private String password;  //密码

    private String headImg;  //头像

    private  Integer status;    //状态

    private String email;   //邮箱

    private String phone;   //手机

    private String createTime;  //创建时间

    private String updateTime;   // 修改时间

    private Integer roleId; //用户权限

    private String queAnsId;    //密保答案

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getQueAnsId() {
        return queAnsId;
    }

    public void setQueAnsId(String queAnsId) {
        this.queAnsId = queAnsId;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", headImg='" + headImg + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", roleId=" + roleId +
                ", queAnsId='" + queAnsId + '\'' +
                '}';
    }
}
