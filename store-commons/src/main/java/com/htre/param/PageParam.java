package com.htre.param;

import lombok.Data;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 23:00
 * Description: 分页属性
 */
@Data
public class PageParam {

    private int currentPage = 1; //默认值1
    private int pageSize = 15; //默认值 15
}