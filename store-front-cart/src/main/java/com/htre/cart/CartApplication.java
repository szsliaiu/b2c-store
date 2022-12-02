package com.htre.cart;

import com.htre.clients.ProductClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 16:38
 * Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.htre.cart.mapper")
@EnableFeignClients(clients = {ProductClient.class})
public class CartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class,args);
    }
}