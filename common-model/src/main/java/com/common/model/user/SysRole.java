package com.common.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 权限角色表
 * </p>
 *
 * @author author
 * @since 2020-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 授权的资源id
     */
    private String resourceIds;

    /**
     * 是否可用
     */
    private Boolean available;

    /**
     * 渠道ID
     */
    private String channelIds;


}
