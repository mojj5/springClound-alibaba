package com.business.user.entity;

import java.io.Serializable;

/**
 * <p>
 * 后台登录用户表
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */

public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号主键
     */

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 角色列表
     */
    private String roleIds;

    /**
     * 账户是否锁定
     */
    private Boolean locked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "SysUser{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", salt=" + salt +
            ", roleIds=" + roleIds +
            ", locked=" + locked +
        "}";
    }
}
