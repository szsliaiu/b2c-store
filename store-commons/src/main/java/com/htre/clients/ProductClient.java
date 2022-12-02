package com.htre.clients;

import com.htre.param.ProductCollectParam;
import com.htre.param.ProductIdParam;
import com.htre.param.ProductSaveParam;
import com.htre.pojo.Product;
import com.htre.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 21:24
 * Description: 商品服务调用客户端
 */
@FeignClient(value = "product-service")
public interface ProductClient {
    /**
     * 搜索服务调用,进行全部数据查询!用于搜索数据库同步数据!
     *
     * @return
     */
    @GetMapping("/product/list")
    List<Product> allList();

    @PostMapping("/product/collect/list")
    R productIds(@RequestBody ProductCollectParam productCollectParam);

    @PostMapping("/product/cart/detail")
    Product productDetail(@RequestBody ProductIdParam productIdParam);

    @PostMapping("/product/cart/list")
    List<Product> cartList(@RequestBody ProductCollectParam productCollectParam);

    @PostMapping("/product/admin/count")
    Long adminCount(@RequestBody Integer categoryId);

    @PostMapping("/product/admin/save")
    R adminCount(@RequestBody ProductSaveParam productSaveParam);

    @PostMapping("/product/admin/update")
    R adminUpdate(@RequestBody Product product);

    @PostMapping("/product/admin/remove")
    R adminRemove(@RequestBody Integer productId);
}
