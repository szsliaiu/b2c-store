package com.htre.cart.service;

import com.htre.param.CartSaveParam;
import com.htre.pojo.Cart;
import com.htre.utils.R;

import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 16:41
 * Description:
 */
public interface CartService {

    /**
     * 购物车数据添加方法
     * @param cartSaveParam
     * @return 001 成功 002 已经存在 003  没有库存
     */
    R save(CartSaveParam cartSaveParam);

    /**
     * 返回购物车数据
     * @param userId
     * @return 确保要返回一个数组
     */
    R list(Integer userId);

    /**
     * 更新购物车业务
     * @param cart
     * @return
     */
    R update(Cart cart);

    /**
     * 删除购物车数据
     * @param cart
     * @return
     */
    R remove(Cart cart);

    /**
     * 清空对应id的购物车项
     * @param cartIds
     */
    void clearIds(List<Integer> cartIds);

    /**
     * 查询购物车项
     * @param productId
     * @return
     */
    R check(Integer productId);
}
