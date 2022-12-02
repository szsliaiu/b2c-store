package com.htre.admin.controller;

import com.htre.admin.service.ProductService;
import com.htre.admin.utils.AliyunOSSUtils;
import com.htre.param.ProductSaveParam;
import com.htre.param.ProductSearchParam;
import com.htre.pojo.Product;
import com.htre.utils.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * @Author panjinsheng
 * @Create 2022/11/30 23:52
 * Description: 商品后台管理controller
 */
@Api(tags = "验证码对应控制器")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private AliyunOSSUtils aliyunOSSUtils;

    @GetMapping("list")
    public R adminList(ProductSearchParam productSearchParam) {
        return productService.search(productSearchParam);
    }

    @PostMapping("upload")
    public R adminUpload(@RequestParam("img") MultipartFile img) throws Exception {
        String filename = img.getOriginalFilename();
        filename = UUID.randomUUID().toString().replaceAll("-", "") + filename;
        String contentType = img.getContentType();
        byte[] content = img.getBytes();

        int hours = 1000;

        String url = aliyunOSSUtils.uploadImage(filename, content, contentType, hours);
        System.out.println("url = " + url);
        return R.ok("图片上传成功!", url);
    }


    @PostMapping("save")
    public R adminSave(ProductSaveParam productSaveParam){

        return productService.save(productSaveParam);
    }

    @PostMapping("update")
    public R adminUpdate(Product product){

        return productService.update(product);
    }

    @PostMapping("remove")
    public R adminRemove(Integer productId){

        return productService.remove(productId);
    }
}