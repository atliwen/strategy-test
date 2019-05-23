package com.example.strategy.service.impl;

import com.example.strategy.dto.OrderDTO;
import com.example.strategy.service.IOrderService;

/**
 * @author 李文
 * @create 2019-05-22 9:53
 **/
public class OrderServiceImpl implements IOrderService
{
    @Override
    public String handle(OrderDTO dto) {
        String type=dto.getType();
        switch (type)
        {
            case "1":return "普通订单";
            case "2":return "团购订单";
            case "3":return "促销订单";
            default:return null;
        }
    }
}
