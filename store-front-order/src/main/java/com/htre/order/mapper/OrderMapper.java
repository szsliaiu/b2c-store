package com.htre.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.htre.pojo.Order;
import com.htre.vo.AdminOrderVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 22:16
 * Description: order的数据库进行接口
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 查询后台管理的数据方法
     * @param offset
     * @param pageSize
     * @return
     */
    List<AdminOrderVo> selectAdminOrder(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
