package com.cblog.common.config.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/*
 * @Author Echo
 * @Description 动态权限相关业务类
 * @Date 21:00 2022/12/13
 **/
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
