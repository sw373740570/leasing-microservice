package com.tslc.leasing.core;

import com.tslc.leasing.db.mybatis.MybatisConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Import;

@SpringCloudApplication
@Import(MybatisConfiguration.class)
public class CoreApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreApplication.class).web(true).run(args);
    }
}
