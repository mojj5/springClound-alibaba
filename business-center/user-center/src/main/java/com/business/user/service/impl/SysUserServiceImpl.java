package com.business.user.service.impl;

import com.business.user.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.business.user.mapper.SysUserMapper;
import com.business.user.service.ISysUserService;

import java.util.List;

/**
 * <p>
 * 后台登录用户表 服务实现类
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
@Service
public class SysUserServiceImpl  implements ISysUserService {


     @Autowired
     private SysUserMapper sysUserMapper;


     @Override
     public List<SysUser> list() {
          return sysUserMapper.selectList();
     }
}


