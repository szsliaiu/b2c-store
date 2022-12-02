package com.htre.search.service;

import com.htre.param.ProductSearchParam;
import com.htre.pojo.Product;
import com.htre.utils.R;

import java.io.IOException;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 23:18
 * Description:
 */
public interface SearchService {

    /**
     * 根据关键字和分页进行数据库数据查询
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 商品同步 : 插入和更新
     * @param product
     * @return
     */
    R save(Product product) throws IOException;

    /**
     * 进行es库的商品删除
     * @param productId
     * @return
     */
    R remove(Integer productId) throws IOException;
}
