package com.gexingw.port.service.impl;

import com.gexingw.order.service.OrderService;
import com.gexingw.port.service.PortService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/12/1
 * @time: 11:05
 */
@Service
public class PortServiceImpl implements PortService {

    @DubboReference
    OrderService orderService;

    @Override
    public Object getOrderById(Long orderId){
        return orderService.getById(orderId);
    }
}
