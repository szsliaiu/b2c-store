package com.htre.clients;

import com.htre.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author panjinsheng
 * @Create 2022/11/30 23:27
 * Description: 购物车调用的feign客户端
 */
@FeignClient("cart-service")
public interface CartClient {
    @PostMapping("/cart/remove/check")
    R check(@RequestBody Integer productId);
}
