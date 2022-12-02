package com.htre.admin.service;

import com.htre.param.PageParam;
import com.htre.pojo.Category;
import com.htre.utils.R;

/**
 * @Author panjinsheng
 * @Create 2022/11/30 21:42
 * Description:
 */
public interface CategoryService {

    /**
     * 分页查询方法
     * @param pageParam
     * @return
     */
    R pageList(PageParam pageParam);

    /**
     * 进行分类数据添加
     * @param category
     * @return
     */
    R save(Category category);

    /**
     * 根据id删除类别数据
     * @param categoryId
     * @return
     */
    R remove(Integer categoryId);

    /**
     * 修改类别信息
     * @param category
     * @return
     */
    R update(Category category);
}
