package com.htre.admin.service;

import com.htre.admin.param.AdminUserParam;
import com.htre.admin.pojo.AdminUser;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:58
 * Description:
 */
public interface AdminUserService {

    /**
     * 登录业务方法
     * @param adminUserParam
     * @return
     */
    AdminUser login(AdminUserParam adminUserParam);
}
