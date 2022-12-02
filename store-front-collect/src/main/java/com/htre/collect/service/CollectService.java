package com.htre.collect.service;

import com.htre.pojo.Collect;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 15:45
 * Description:
 */
public interface CollectService {

    /**
     * 收藏添加的方法
     * @param collect
     * @return 001 004
     */
    R save(Collect collect);

    /**
     * 根据用户id查询商品信息集合
     * @param userId
     * @return
     */
    R list(Integer userId);

    /**
     * 根据用户id和商品id删除收藏数据
     * @param collect userId productId
     * @return 001 003
     */
    R remove(Collect collect);

    /**
     * 删除根据商品id
     * @param productId
     * @return
     */
    R removeByPid(Integer productId);
}
