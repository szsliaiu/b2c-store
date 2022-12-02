package com.htre.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.htre.pojo.Product;
import org.springframework.stereotype.Repository;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 1:26
 * Description: 商品的mapper接口
 */
@Repository
public interface ProductMapper extends BaseMapper<Product> {
}
