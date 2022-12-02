package com.htre.collect.controller;

import com.htre.collect.service.CollectService;
import com.htre.pojo.Collect;
import com.htre.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 15:45
 * Description: 收藏controller
 */
@RestController
@RequestMapping("collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @PostMapping("save")
    public R save(@RequestBody Collect collect){
        return collectService.save(collect);
    }

    @PostMapping("list")
    public R list(@RequestBody Collect collect){
        return collectService.list(collect.getUserId());
    }

    @PostMapping("remove")
    public R remove(@RequestBody Collect collect){
        return collectService.remove(collect);
    }

    @PostMapping("remove/product")
    public R removeByPid(@RequestBody Integer productId){
        return collectService.removeByPid(productId);
    }

}