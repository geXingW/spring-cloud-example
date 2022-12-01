package com.gexingw.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayModuleApplication.class, args);
    }

}
