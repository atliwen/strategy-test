package com.example.strategy.service.order.type;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author 李文
 * @create 2019-05-22 9:59
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HanderType
{
    String value();
}
