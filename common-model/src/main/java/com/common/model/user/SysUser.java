package com.common.model.user;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台登录用户表
 * </p>
 *
 * @author author
 * @since 2020-07-02
 */

@Data
@EqualsAndHashCode(callSuper = false)
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
