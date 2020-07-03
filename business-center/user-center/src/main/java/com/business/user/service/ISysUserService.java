package com.business.user.service;


import com.business.user.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 后台登录用户表 服务类
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
public interface ISysUserService {

    List<SysUser> list();
}
