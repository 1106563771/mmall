package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

import java.util.Map;

public interface IShippingService {

    /**
     * 新建收货地址
     * @param userId
     * @param shipping
     * @return
     */
    ServerResponse<Map> add(Integer userId, Shipping shipping);

    /**
     * 删除收货地址
     * @param userId
     * @param shippingId
     * @return
     */
    ServerResponse<String> del(Integer userId, Integer shippingId);

    /**
     * 更新收获地址
     * @param userId
     * @param shipping
     * @return
     */
    ServerResponse<Map> update(Integer userId, Shipping shipping);

    /**
     * 查询特定地址
     * @param userId
     * @param shippingId
     * @return
     */
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    /**
     * 用户的地址列表
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> list(Integer userId, Integer pageNum, Integer pageSize);
}
