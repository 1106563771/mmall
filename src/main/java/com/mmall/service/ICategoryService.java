package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface ICategoryService {

    /**
     * 添加分类
     * @param categoryName
     * @param parentId
     * @return
     */
    public ServerResponse<String> addCategory(String categoryName, Integer parentId);

    /**
     * 更新分类
     * @param categoryId
     * @param categoryName
     * @return
     */
    public ServerResponse<String> updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 查出该分类下的子分类
     * @param parentId
     * @return
     */
    public ServerResponse<List<Category>> getChildrenParallelCategory(Integer parentId);

    /**
     * 查找本节点的id和孩子的id
     * @param categoryId
     * @return
     */
    public ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
