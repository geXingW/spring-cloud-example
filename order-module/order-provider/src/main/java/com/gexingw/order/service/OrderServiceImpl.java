package com.gexingw.order.service;

import com.gexingw.product.service.ProductService;
import org.apache.dubbo.config.annotation.DubboReference;
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

    @DubboReference
    ProductService productService;

    @Override
    public String sayHello(String name){
        return "Hello, " + name + "！";
    }

    @Override
    public String getById(Long id){
        return "Order-" + id + "!";
    }

    @Override
    public String getOrderProductByOrderId(Long id){
        return "Order product - " + id;
    }
}
