package com.htre.admin.controller;

import com.htre.admin.service.UserService;
import com.htre.param.CartListParam;
import com.htre.param.PageParam;
import com.htre.pojo.User;
import com.htre.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:20
 * Description: 用户模块调用的controller
 */
@Api(tags = "用户模块调用的控制器")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("用户数据展示")
    @GetMapping("list")
    public R userList(@ApiParam("分页属性")PageParam pageParam){
        return userService.userList(pageParam);
    }

    @ApiOperation("用户数据删除")
    @PostMapping("remove")
    public R userList(@ApiParam("购物车查询接收参数")CartListParam cartListParam){
        return userService.userRemove(cartListParam);
    }

    @ApiOperation("用户数据修改")
    @PostMapping("update")
    public R update(@ApiParam("用户的实体类")User user){
        return userService.userUpdate(user);
    }

    @ApiOperation("用户数据添加")
    @PostMapping("save")
    public R save(@ApiParam("用户的实体类")User user){
        return userService.save(user);
    }
}