package com.htre.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.htre.pojo.Address;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:05
 * Description: 地址接收值的param
 */
@Data
public class AddressParam {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId;

    private Address add;
}