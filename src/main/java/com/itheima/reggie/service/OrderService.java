package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {
    /**
     * 用户下单
     *
     * @param orders
     * @return
     */
    void saveWithOrder(Orders orders);
}