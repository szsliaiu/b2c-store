package com.htre.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 17:00
 * Description: 购物车查询接收参数
 */
@Data
public class CartListParam {
    @JsonProperty("user_id")
    @NotNull
    private Integer userId;
}