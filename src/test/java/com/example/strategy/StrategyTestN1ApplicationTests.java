package com.example.strategy;

import com.example.strategy.dto.OrderDTO;
import com.example.strategy.service.impl.OrderServiceV2Impl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTestN1ApplicationTests
{

    @Autowired
    OrderServiceV2Impl orderServiceV2;

    @Test
    public void contextLoads() {
        OrderDTO o=new OrderDTO();
        o.setType("1");
        System.out.println(orderServiceV2.handle(o));
    }

}
