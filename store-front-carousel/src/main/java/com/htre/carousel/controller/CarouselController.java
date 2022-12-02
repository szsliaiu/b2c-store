package com.htre.carousel.controller;

import com.htre.carousel.service.CarouselService;
import com.htre.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 0:20
 * Description: 轮播图的控制类
 */

@RestController
@RequestMapping("carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    /**
     * 查询首页数据,查询优先级最高的四条
     *
     * @return
     */
    @PostMapping("list")
    public R list() {

        return carouselService.list();
    }
}