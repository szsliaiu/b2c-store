package com.htre.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author panjinsheng
 * @Create 2022/11/26 21:42
 * <p>
 * Description: 地址实体类
 */
@ApiModel(value = "地址实体类")
@Data
@TableName("address")
public class Address implements Serializable {
    public static final Long serialVersionUID = 1L;

    @ApiModelProperty(value = "地址主键")
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "联系人")
    @NotBlank
    private String linkman;
    @ApiModelProperty(value = "手机号")
    @NotBlank
    private String phone;
    @ApiModelProperty(value = "详细地址")
    @NotBlank
    private String address;

    @ApiModelProperty(value = "用户主键")
    @TableField("user_id")
    private Integer userId;
}