package com.htre.admin.controller;

import com.htre.admin.service.OrderService;
import com.htre.param.PageParam;
import com.htre.utils.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author panjinsheng
 * @Create 2022/12/1 1:47
 * Description: order的controller
 */
@Api(tags = "订单控制器")
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public R list(PageParam pageParam){

        return orderService.list(pageParam);
    }
}