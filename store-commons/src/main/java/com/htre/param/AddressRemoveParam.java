package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author panjinsheng
 * @Create 2022/11/26 22:18
 * Description: 地址移除参数
 */

@Data
public class AddressRemoveParam {

    @NotNull
    private Integer id;
}