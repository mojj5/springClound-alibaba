package com.common.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 后台资源表-如菜单；权限字符串
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源类型
     */
    private String type;

    /**
     * 类型为菜单时的url
     */
    private String url;

    /**
     * 父编号
     */
    private Long parentId;

    /**
     * 父编号列表
     */
    private String parentIds;

    /**
     * 权限字符串
     */
    private String permission;

    /**
     * 是否可用
     */
    private Boolean available;

    /**
     * 导航图标
     */
    private String icon;


}
