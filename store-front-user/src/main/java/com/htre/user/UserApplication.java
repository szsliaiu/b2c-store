package com.htre.user;

/**
 * Package: com.htre
 * Description:
 *
 * @Author panjinsheng
 * @Create 2022/11/26 19:51
 * @Version 1.0
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * projectName: b2c_cloud_store
 *
 * description: 用户服务的启动类
 */
@MapperScan(basePackages = "com.htre.user.mapper")
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }

}
