package com.gexingw.order.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/21
 * @time: 20:50
 */
@DubboService
public class OrderServiceImpl implements OrderService {
    @Override
    public String sayHello(String name){
        return "Hello, " + name + "！";
    }
}
