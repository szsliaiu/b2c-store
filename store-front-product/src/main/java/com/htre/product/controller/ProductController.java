package com.htre.product.controller;

import com.htre.param.*;
import com.htre.product.service.ProductService;
import com.htre.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 1:21
 * Description: 商品模块controller
 */
@Api(tags = "商品模块控制器")
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation("首页类别接口")
    @PostMapping("/promo")
    public R promo(@RequestBody @Validated @ApiParam("类别热门商品参数") ProductPromoParam productPromoParam , BindingResult result){
        if (result.hasErrors()) {
            return R.fail("数据查询失败");
        }
        return productService.promo(productPromoParam.getCategoryName());
    }

    @PostMapping("hots")
    public R hots(@RequestBody @Validated ProductHotParam productHotParam, BindingResult result){
        if (result.hasErrors()) {
            return R.fail("数据查询失败!");
        }
        return productService.hots(productHotParam);
    }

    @PostMapping("category/list")
    public R clist(){
        return productService.clist();
    }

    /**
     * 类别查询
     * @param productIdsParam
     * @return
     */
    @PostMapping("bycategory")
    public R byCategory(@RequestBody @Validated ProductIdsParam productIdsParam, BindingResult result){
        if (result.hasErrors()) {
            return R.fail("类别商品查询失败！");
        }
        return productService.byCategory(productIdsParam);
    }
    /**
     * 查询全部商品,可以复用业务!
     * @param productIdsParam
     * @return
     */
    @PostMapping("all")
    public R all(@RequestBody @Validated ProductIdsParam productIdsParam,BindingResult result){

        if (result.hasErrors()){
            return R.fail("类别商品查询失败!");
        }
        return productService.byCategory(productIdsParam);
    }

    @PostMapping("detail")
    public R detail(@RequestBody @Validated ProductIdParam productIdParam,BindingResult result){
        if (result.hasErrors()) {
            return R.fail("商品详情查询失败！");
        }
        return productService.detail(productIdParam.getProductID());
    }

    @PostMapping("pictures")
    public R pictures(@RequestBody @Validated ProductIdParam productIdParam,BindingResult result){
        if (result.hasErrors()) {
            return R.fail("商品图片详情查询失败！");
        }
        return productService.pictures(productIdParam.getProductID());
    }

    @PostMapping("search")
    public R search(@RequestBody ProductSearchParam productSearchParam){
        return productService.search(productSearchParam);
    }

}