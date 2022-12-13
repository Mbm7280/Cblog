package com.cblog.modules.ums.mapper;

import com.cblog.modules.ums.model.UmsPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户权限表 Mapper 接口
 * </p>
 *
 * @author echo
 * @since 2022-12-13
 */
public interface UmsPermissionMapper extends BaseMapper<UmsPermission> {

    /**
     * 获取用户所有可访问资源
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取资源
     */
    List<UmsPermission> getPermissionListByRoleId(@Param("roleId") Long roleId);

}
