package com.example.strategy.service.order.type;

import com.example.strategy.service.order.type.handler.AbstractHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * order type 上下文 工厂类    其实应该算是对 spring 上下文 获取bean 的增强。
 * @author 李文
 * @create 2019-05-22 10:06
 **/
@Component
public class HandlerContext
{
    private Map<String, AbstractHandler> handlerMap = new HashMap<>();

    /**
     * 通过 type 值 从上下文中 获取该类型的 实际实现对象。
     */
    public AbstractHandler getInstance(String type) {
        return handlerMap.get(type);
    }

    /**
     * spring boot  application 上下文  也就是 spring 上下文
     */
    @Autowired
    ConfigurableApplicationContext context;

    /**
     *  自身被 spring  bean 创建后触发。
     *  通过上下文找到 继承接口的所以实现类，
     *  通过实现类获取 类注解上的标识。
     *  存入到handlerMap Map映射中。
     */
    @PostConstruct
    public void afterPropertiesSet() {
        Map<String, AbstractHandler> map = context.getBeansOfType(AbstractHandler.class);
        for (AbstractHandler value : map.values()) {
            String type = value.getClass().getAnnotation(HanderType.class).value();
            handlerMap.put(type, value);
        }
    }
}
