package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 17:38
 * Description: 热门商品参数接收对象
 */
@Data
public class ProductHotParam {

    @NotEmpty
    private List<String> categoryName;
}