package com.htre.carousel.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.htre.carousel.mapper.CarouselMapper;
import com.htre.carousel.service.CarouselService;
import com.htre.pojo.Carousel;
import com.htre.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 0:24
 * Description:
 */

@Slf4j
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    /**
     * 查询优先级最高的四条轮播图数据
     *   按照优先级查询数据库数据
     *   我们使用stream流,进行内存数据切割,保留6条数据!
     * @return
     */
    @Cacheable(value = "list.carousel",key = "#root.methodName",cacheManager = "cacheManagerDay")
    @Override
    public R list() {
//        //声明数量
//        int limit = 4 ; //至多查询四条
//
//        //查询数据库
//        IPage<Carousel> iPage = new Page<>(1,limit);
//        QueryWrapper<Carousel> carouselQueryWrapper = new QueryWrapper<>();
//        carouselQueryWrapper.orderByDesc("priority");
//        IPage<Carousel> page = carouselMapper.selectPage(iPage, carouselQueryWrapper);
//
//        List<Carousel> carouselList = page.getRecords();
//
//        return R.ok(carouselList);

        QueryWrapper<Carousel> carouselQueryWrapper = new QueryWrapper<>();
        carouselQueryWrapper.orderByDesc("priority");

        List<Carousel> list = carouselMapper.selectList(carouselQueryWrapper);
        //jdk 1.8 stream
        List<Carousel> collect = list.stream().limit(6).collect(Collectors.toList());

        R ok = R.ok(collect);

        log.info("CarouselServiceImpl.list业务结束，结果:{}",ok);
        return ok;
    }
}