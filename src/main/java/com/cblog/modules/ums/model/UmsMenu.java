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
 * 菜单表
 * </p>
 *
 * @author echo
 * @since 2022-12-13
 */
@Getter
@Setter
@TableName("ums_menu")
@ApiModel(value = "UmsMenu对象", description = "菜单表")
public class UmsMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("父级ID")
    private Long parentId;

    @ApiModelProperty("菜单名称")
    private String title;

    @ApiModelProperty("前端名称")
    private String name;

    @ApiModelProperty("菜单级数")
    private Integer level;

    @ApiModelProperty("前端图标")
    private String icon;

    @ApiModelProperty("菜单排序")
    private Integer sort;

    @ApiModelProperty("前端隐藏")
    private Integer hidden;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date modifyTime;


}
