package com.example.strategy.service.order.type.handler.impl;

import com.example.strategy.dto.OrderDTO;
import com.example.strategy.service.order.type.HanderType;
import com.example.strategy.service.order.type.handler.AbstractHandler;
import org.springframework.stereotype.Component;

/**
 * @author 李文
 * @create 2019-05-22 9:57
 **/
@Component
@HanderType("1")
public class NormalHandler implements AbstractHandler
{
    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
