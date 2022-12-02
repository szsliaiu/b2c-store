package com.htre.admin.controller;

import com.htre.admin.param.AdminUserParam;
import com.htre.admin.pojo.AdminUser;
import com.htre.admin.service.AdminUserService;
import com.htre.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:52
 * Description: 后台管理用户处理controller
 */
@Api(tags = "后台管理用户处理控制器")
@RestController
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @ApiOperation("管理用户登录功能")
    @PostMapping("/user/login")
    public R login(@Validated @ApiParam("JSON格式的adminUserParam对象接收登录信息") AdminUserParam adminUserParam, BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return R.fail("核心参数为null,登录失败!");
        }

        //验证码校验
        String captcha = (String) session.getAttribute("captcha");
        if (!adminUserParam.getVerCode().equalsIgnoreCase(captcha)){
            return R.fail("验证码错误!");
        }
        AdminUser user = adminUserService.login(adminUserParam);
        if (user == null){
            return R.fail("登录失败!账号或者密码错误!");
        }
        session.setAttribute("userInfo",user);

        return R.ok("登录成功!");
    }
    @ApiOperation("管理用户退出登录功能")
    @GetMapping("user/logout")
    public R logout(HttpSession session){
        //清空session即可
        session.invalidate();
        return R.ok("退出登录成功!");
    }

}