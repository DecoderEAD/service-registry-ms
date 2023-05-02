package com.ead.serviceregistryms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryMsApplication.class, args);
    }

}
