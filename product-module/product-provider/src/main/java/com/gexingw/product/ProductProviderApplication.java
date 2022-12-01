package com.gexingw.product;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ProductProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductProviderApplication.class, args);
    }

}
