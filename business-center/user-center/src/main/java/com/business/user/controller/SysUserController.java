package com.business.user.controller;

import com.business.user.service.ISysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台登录用户表 前端控制器
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

 @Autowired
 private ISysUserService sysUserService ;

}
