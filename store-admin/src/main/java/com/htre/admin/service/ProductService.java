package com.htre.admin.service;

import com.htre.param.ProductSaveParam;
import com.htre.param.ProductSearchParam;
import com.htre.pojo.Product;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/11/30 23:53
 * Description:
 */
public interface ProductService {

    /**
     * 全部商品查询和搜索查询的方法
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 进行商品数据保存
     * @param productSaveParam
     * @return
     */
    R save(ProductSaveParam productSaveParam);

    /**
     * 更新商品数据
     * @param product
     * @return
     */
    R update(Product product);

    /**
     * 商品移除功能
     * @param productId
     * @return
     */
    R remove(Integer productId);
}
