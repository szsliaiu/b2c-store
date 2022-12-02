package com.htre.admin.service;

import com.htre.param.CartListParam;
import com.htre.param.PageParam;
import com.htre.pojo.User;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/11/30 13:32
 * Description:
 */
public interface UserService {

    /**
     * 用户的展示业务方法
     * @param pageParam
     * @return
     */
    R userList(PageParam pageParam);

    /**
     * 删除用户数据
     * @param cartListParam
     * @return
     */
    R userRemove(CartListParam cartListParam);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    R userUpdate(User user);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    R save(User user);
}
