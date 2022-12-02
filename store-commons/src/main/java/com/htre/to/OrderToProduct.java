package com.htre.to;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 22:12
 * Description: 订单发送商品服务的实体
 */

@Data
public class OrderToProduct implements Serializable {

    public static final Long serialVersionUID = 1L;

    private Integer productId;
    private Integer num;

}