package com.cblog.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户登录日志表
 * </p>
 *
 * @author echo
 * @since 2022-12-13
 */
@Getter
@Setter
@TableName("ums_admin_log")
@ApiModel(value = "UmsAdminLog对象", description = "用户登录日志表")
public class UmsAdminLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户ID")
    private Long adminId;

    @ApiModelProperty("用户IP")
    private String operateIp;

    @ApiModelProperty("用户IP地址")
    private String ipAddress;

    @ApiModelProperty("请求方法")
    private String requestMethod;

    @ApiModelProperty("请求方式")
    private String requestType;

    @ApiModelProperty("用户请求参数")
    private String requestArgs;

    @ApiModelProperty("用户响应参数")
    private String responceArgs;

    @ApiModelProperty("请求状态")
    private String requestStatus;

    @ApiModelProperty("浏览器登录类型")
    private String adminBrowser;

    @ApiModelProperty("创建时间")
    private Date createTime;


}
