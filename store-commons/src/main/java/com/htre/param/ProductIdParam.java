package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 19:08
 * Description: 商品id参数接收
 */
@Data
public class ProductIdParam {
    @NotNull
    private Integer productID;
}