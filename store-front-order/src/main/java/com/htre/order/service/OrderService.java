package com.htre.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.htre.param.OrderParam;
import com.htre.param.PageParam;
import com.htre.pojo.Order;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 22:15
 * Description:
 */
public interface OrderService extends IService<Order> {
    /**
     * 进行订单数据保存业务
     * @param orderParam
     * @return
     */
    R save(OrderParam orderParam);

    /**
     * 分组查询订单数据
     * @param userId
     * @return
     */
    R list(Integer userId);

    /**
     * 检查订单中是否有商品引用
     * @param productId
     * @return
     */
    R check(Integer productId);

    /**
     * 后台管理查询订单数据
     * @param pageParam
     * @return
     */
    R adminList(PageParam pageParam);
}
