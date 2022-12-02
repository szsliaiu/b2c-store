package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 1:01
 * Description: 类别热门商品参数接收
 */

@Data
public class ProductPromoParam {

    @NotBlank
    private String categoryName;
}