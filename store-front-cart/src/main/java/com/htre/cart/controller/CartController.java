package com.htre.cart.controller;

import com.htre.cart.service.CartService;
import com.htre.param.CartListParam;
import com.htre.param.CartSaveParam;
import com.htre.pojo.Cart;
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
 * @Create 2022/11/28 16:40
 * Description: 购物车控制controller
 */
@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("save")
    public R save(@RequestBody @Validated CartSaveParam cartSaveParam, BindingResult result) {
        if (result.hasErrors()) {
            return R.fail("核心参数为null,添加失败!");
        }
        return cartService.save(cartSaveParam);
    }

    @PostMapping("list")
    public R list(@RequestBody @Validated CartListParam cartListParam, BindingResult result) {
        if (result.hasErrors()) {
            return R.fail("购物车数据查询失败!");
        }
        return cartService.list(cartListParam.getUserId());
    }

    @PostMapping("update")
    public R update(@RequestBody Cart cart){
        return cartService.update(cart);
    }

    @PostMapping("remove")
    public R remove(@RequestBody Cart cart){
        return cartService.remove(cart);
    }

    @PostMapping("remove/check")
    public R removeCheck(@RequestBody Integer productId){
        return cartService.check(productId);
    }
}