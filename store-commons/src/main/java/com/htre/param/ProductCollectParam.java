package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/28 16:04
 * Description: 收藏调用商品传递的参数
 */
@Data
public class ProductCollectParam {

    @NotEmpty
    private List<Integer> productIds;
}