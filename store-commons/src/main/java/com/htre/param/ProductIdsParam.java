package com.htre.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2022/11/27 18:24
 * Description: 类别商品展示
 */
@Data
public class ProductIdsParam  extends PageParam{

    @NotNull
    private List<Integer> categoryID;
}