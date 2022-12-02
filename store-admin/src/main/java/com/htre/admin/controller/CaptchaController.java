package com.htre.admin.controller;

import com.wf.captcha.utils.CaptchaUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:47
 * Description: 验证码对应的controller
 */
@Api(tags = "验证码对应控制器")
@Controller
@RequestMapping
public class CaptchaController {

    @ApiOperation("自动生成验证码图片")
    @GetMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {

        /**
         * 自动生成验证码图片 写回!
         * 并且:将验证码图片存储到session,  key = captcha 默认:4个字母
         */
        CaptchaUtil.out(request,response);
    }
}