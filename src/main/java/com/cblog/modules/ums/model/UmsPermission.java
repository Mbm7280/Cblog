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
 * 用户权限表
 * </p>
 *
 * @author echo
 * @since 2022-12-13
 */
@Getter
@Setter
@TableName("ums_permission")
@ApiModel(value = "UmsPermission对象", description = "用户权限表")
public class UmsPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("父级权限id")
    private Long pid;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("权限值")
    private String value;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("权限类型:CATEGORY->目录；MENU->菜单；BUTTON->按钮(接口绑定权限)")
    private String type;

    @ApiModelProperty("前端资源路径")
    private String uri;

    @ApiModelProperty("启用状态；DISABLE->禁用；START->启用")
    private String status;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date modifyTime;


}