package com.example.strategy.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 李文
 * @create 2019-05-22 9:51
 **/
@Data
public class OrderDTO
{
    private String code;
    private BigDecimal price;
    private String type;
}
