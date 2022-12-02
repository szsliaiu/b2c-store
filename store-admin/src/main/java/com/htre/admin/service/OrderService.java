package com.htre.admin.service;

import com.htre.param.PageParam;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/12/1 1:47
 * Description:
 */
public interface OrderService {

    /**
     * 查询订单数据
     * @param pageParam
     * @return
     */
    R list(PageParam pageParam);
}
