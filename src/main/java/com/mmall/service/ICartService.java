package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVO;

public interface ICartService {

    /**
     * 添加购物车
     * @param userId
     * @param productId
     * @param count
     * @return
     */
    ServerResponse<CartVO> add(Integer userId, Integer productId, Integer count);

    /**
     * 更新购物车的商品数量
     * @param userId
     * @param count
     * @param productId
     * @return
     */
    ServerResponse<CartVO> update(Integer userId, Integer count, Integer productId);

    /**
     * 在购物车中删除商品
     * @param userId
     * @param productIds
     * @return
     */
    ServerResponse<CartVO> deleteProduct(Integer userId, String productIds);

    /**
     * list
     * @param userId
     * @return
     */
    ServerResponse<CartVO> list(Integer userId);

    /**
     * 选择
     * @param userId
     * @param productId
     * @param checked
     * @return
     */
    ServerResponse<CartVO> checkedOrchecked(Integer userId, Integer productId, Integer checked);

    /**
     * 查询某个用户的所有产品数
     * @param userId
     * @return
     */
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
