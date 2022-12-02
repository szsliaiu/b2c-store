package com.htre.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.htre.pojo.Order;
import lombok.Data;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 11:51
 * Description: 订单返回的数据实体
 */
//查询订单需要返回结果
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class OrderVo extends Order {

    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_picture")
    private String productPicture;

}