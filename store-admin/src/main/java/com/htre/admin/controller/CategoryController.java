package com.htre.admin.controller;

import com.htre.admin.service.CategoryService;
import com.htre.param.PageParam;
import com.htre.pojo.Category;
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
 * @Create 2022/11/30 21:40
 * Description: 类别controller
 */
@Api(tags = "类别控制器")
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation("类别数据展示")
    @GetMapping("list")
    public R pageList(@ApiParam("分页属性")PageParam pageParam) {
        return categoryService.pageList(pageParam);
    }
    @ApiOperation("类别数据添加")
    @PostMapping("save")
    public R save(@ApiParam("类别信息")Category category){

        return categoryService.save(category);
    }
    @ApiOperation("类别数据删除")
    @PostMapping("remove")
    public R remove(@ApiParam("类别Id")Integer categoryId){

        return categoryService.remove(categoryId);
    }
    @ApiOperation("类别数据修改")
    @PostMapping("update")
    public R update(@ApiParam("类别信息")Category category){

        return categoryService.update(category);
    }
}