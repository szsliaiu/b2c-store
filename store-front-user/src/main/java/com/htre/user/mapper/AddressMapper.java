package com.htre.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.htre.pojo.Address;
import org.springframework.stereotype.Repository;

/**
 * @Author panjinsheng
 * @Create 2022/11/26 21:50
 * Description: 地址数据库访问mapper接口
 */
@Repository
public interface AddressMapper extends BaseMapper<Address> {
}
