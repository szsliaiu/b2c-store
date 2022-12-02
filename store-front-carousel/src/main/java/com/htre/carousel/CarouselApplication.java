package com.htre.carousel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 0:09
 * Description: 轮播图的启动类
 */

@SpringBootApplication
@MapperScan(basePackages = "com.htre.carousel.mapper")
@EnableCaching
public class CarouselApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarouselApplication.class,args);
    }
}