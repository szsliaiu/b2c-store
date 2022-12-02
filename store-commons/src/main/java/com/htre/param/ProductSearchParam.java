package com.htre.param;

import lombok.Data;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 23:14
 * Description: 搜索关键字和分页参数集合
 */
@Data
public class ProductSearchParam extends PageParam{

    private String search;

}