package com.cn;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CN
 * @date 2018年12月22日 23点26分
 */
@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class SpringCloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMonitorApplication.class, args);
    }

}

