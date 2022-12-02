package com.htre.admin.service.impl;

import com.htre.admin.service.OrderService;
import com.htre.clients.OrderClient;
import com.htre.param.PageParam;
import com.htre.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author panjinsheng
 * @Create 2022/12/1 1:47
 * Description: 订单业务实现类
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderClient orderClient;
    /**
     * 查询订单数据
     *
     * @param pageParam
     * @return
     */
    @Override
    public R list(PageParam pageParam) {

        R r = orderClient.list(pageParam);
        log.info("OrderServiceImpl.list业务结束，结果:{}",r);
        return r;
    }
}