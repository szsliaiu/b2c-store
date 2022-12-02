package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author panjinsheng
 * @Create 2022/11/26 20:43
 * Description: 用户登陆参数实体
 */
@Data
public class UserLoginParam {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}