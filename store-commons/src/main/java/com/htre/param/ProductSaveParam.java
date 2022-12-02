package com.htre.param;

import com.htre.pojo.Product;
import lombok.Data;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 16:04
 * Description: 商品数据保存param
 */
@Data
public class ProductSaveParam extends Product {

    /**
     * 保存商品详情的图片地址! 图片之间使用 + 拼接
     */
    private String pictures;
}