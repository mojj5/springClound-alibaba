package com.business.user.mapper;


import com.business.user.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 后台登录用户表 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
public interface SysUserMapper{


    List<SysUser> selectList();
}
