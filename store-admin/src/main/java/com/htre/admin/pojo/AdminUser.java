package com.htre.admin.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:51
 * Description: 后台管理用户的实体类
 */
@ApiModel(value = "后台管理用户的实体类")
@Data
@TableName("admin_user")
public class AdminUser  implements Serializable {

    @TableId(type = IdType.AUTO)
    @TableField("user_id")
    @ApiModelProperty(value = "用户Id")
    private Integer userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "账号")
    private String userAccount;
    @ApiModelProperty(value = "密码")
    private String userPassword;
    private String userPhone;
    private Date createTime;
    private Integer userRole;

}