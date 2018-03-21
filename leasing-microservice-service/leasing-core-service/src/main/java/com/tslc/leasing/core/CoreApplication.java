package com.tslc.leasing.core;

import com.tslc.leasing.db.mybatis.MybatisConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@Import(MybatisConfiguration.class)
public class CoreApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreApplication.class).web(true).run(args);
    }
}
