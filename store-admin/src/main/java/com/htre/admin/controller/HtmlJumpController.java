package com.htre.admin.controller;

import com.htre.clients.CategoryClient;
import com.htre.pojo.Category;
import com.htre.utils.R;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/29 12:27
 * Description: 专门用于存储,页面跳转handler方法的controller
 */
@Api(tags = "专门用于存储,页面跳转handler方法的控制器")
@Slf4j
@Controller
@RequestMapping
public class HtmlJumpController {

    @Autowired
    private CategoryClient categoryClient;

    /**
     *  设计欢迎页面跳转controller
     * @return login 登录页面
     */
    @ApiOperation("设计欢迎登录页面")
    @GetMapping({"/","index.html","index"})
    public String  welcome(){
        log.info("HtmlJumpController.welcome 跳转登录页面!");
        return "login";
    }


    /**
     * 登录成功跳转到index页面!
     * @return
     */
    @ApiOperation("登录成功跳转到index页面")
    @GetMapping("/home")
    public String home(){
        log.info("HtmlJumpController.home登录成功,跳转程序首页!index页面!");
        return "index";
    }

    /**
     * 跳转用户管理页面
     */
    @ApiOperation("跳转用户管理页面")
    @GetMapping("/user")
    public String user(){
        log.info("HtmlJumpController.user,跳转用户管理!user页面!");
        return "user/user";
    }

    /**
     * 跳转商品管理页面
     */
    @ApiOperation("跳转商品管理页面")
    @GetMapping("/product")
    public String product(){
        log.info("HtmlJumpController.product,跳转商品管理!product页面!");
        return "product/product";
    }


    /**
     * 跳转类别管理页面
     */
    @ApiOperation("跳转类别管理页面")
    @GetMapping("/category")
    public String category(){
        log.info("HtmlJumpController.category,跳转用户管理!category页面!");
        return "category/category";
    }


    /**
     * 跳转订单管理页面
     */
    @ApiOperation("跳转订单管理页面")
    @GetMapping("/order")
    public String order(){
        log.info("HtmlJumpController.order,跳转用户管理!order页面!");
        return "order/order";
    }

    /**
     * 打开编辑用户页面
     */
    @ApiOperation("打开编辑用户页面")
    @GetMapping("/user/update/html")
    public String userUpdateHtml(){
        log.info("HtmlJumpController.userUpdateHtml业务结束，结果:{}");
        return "user/edit";
    }


    /**
     * 打开编辑用户页面
     */
    @ApiOperation("打开编辑用户页面")
    @GetMapping("/user/save/html")
    public String userSaveHtml(){
        log.info("HtmlJumpController.userSaveHtml业务结束，结果:{}");
        return "user/add";
    }




    /**
     * 打开编辑类别页面
     */
    @ApiOperation("打开编辑类别页面")
    @GetMapping("/category/update/html")
    public String categoryUpdateHtml(){
        log.info("HtmlJumpController.categoryUpdateHtml业务结束，结果:{}");
        return "category/edit";
    }
    @GetMapping("/category/save/html")
    public String categorySaveHtml(){
        log.info("HtmlJumpController.categorySaveHtml结束，结果:{}");
        return "category/add";
    }


    /**
     * 商品保存页面跳转
     * @return
     */
    @ApiOperation("商品保存页面跳转")
    @GetMapping("/product/save/html")
    public String productSaveHtml(Model model){
        log.info("HtmlJumpController.productSaveHtml业务结束，结果:{}");

        //查询类别列表,存入共享域
        R r = categoryClient.list();
        List<LinkedHashMap> data = (List<LinkedHashMap>) r.getData(); // [linkhashMap]


        List<Category> categoryList = new ArrayList<>();

        for (LinkedHashMap map : data) {
            Category category = new Category();
            category.setCategoryId((Integer) map.get("category_id"));
            category.setCategoryName((String) map.get("category_name"));
            categoryList.add(category);
        }


        model.addAttribute("clist",categoryList);
        return "product/add";
    }

    /**
     * 商品保存页面跳转
     * @return
     */
    @ApiOperation("商品保存页面跳转")
    @GetMapping("/product/update/html")
    public String productUpdateHtml(Model model){
        log.info("HtmlJumpController.productUpdateHtml业务结束，结果:{}");

        //查询类别列表,存入共享域
        R r = categoryClient.list();
        List<LinkedHashMap> data = (List<LinkedHashMap>) r.getData(); // [linkhashMap]


        List<Category> categoryList = new ArrayList<>();

        for (LinkedHashMap map : data) {
            Category category = new Category();
            category.setCategoryId((Integer) map.get("category_id"));
            category.setCategoryName((String) map.get("category_name"));
            categoryList.add(category);
        }

        model.addAttribute("clist",categoryList);
        return "product/edit";
    }
}