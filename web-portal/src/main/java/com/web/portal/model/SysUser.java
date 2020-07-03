package com.web.portal.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class SysUser implements Serializable {


    private static final long serialVersionUID = 1L;

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


}
