package com.gexingw.product.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/11/30
 * @time: 20:05
 */
@DubboService
public class ProductServiceImpl implements ProductService {

    @Override
    public String getById(Long id) {
        return "Product-" + id;
    }
}
