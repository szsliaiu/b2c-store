package com.htre.order.controller;

import com.htre.order.service.OrderService;
import com.htre.param.CartListParam;
import com.htre.param.OrderParam;
import com.htre.param.PageParam;
import com.htre.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 22:14
 * Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("save")
    public R save(@RequestBody OrderParam orderParam){
        return orderService.save(orderParam);
    }

    @PostMapping("list")
    public R list(@RequestBody @Validated CartListParam cartListParam, BindingResult result){
        if (result.hasErrors()) {
            return R.fail("参数异常,查询失败!");
        }
        return orderService.list(cartListParam.getUserId());
    }


    @PostMapping("remove/check")
    public R check(@RequestBody Integer productId)
    {
        return orderService.check(productId);
    }


    @PostMapping("admin/list")
    public R adminList(@RequestBody PageParam pageParam)
    {
        return orderService.adminList(pageParam);
    }
}