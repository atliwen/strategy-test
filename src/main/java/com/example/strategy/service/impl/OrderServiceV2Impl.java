package com.example.strategy.service.impl;

import com.example.strategy.dto.OrderDTO;
import com.example.strategy.service.IOrderService;
import com.example.strategy.service.order.type.HandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文
 * @create 2019-05-22 9:55
 **/
@Service
public class OrderServiceV2Impl implements IOrderService
{
    @Autowired
    private HandlerContext handlerContext;

    /**
     * 通过 Type  工厂上下文获取 处理类
     */
    @Override
    public String handle(OrderDTO dto) {
        return handlerContext.getInstance(dto.getType()).handle(dto);
    }
}
