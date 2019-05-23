package com.example.strategy.service.order.type.handler;

import com.example.strategy.dto.OrderDTO;

/**
 * 接口
 */
public interface AbstractHandler
{
    String handle(OrderDTO dto);
}
