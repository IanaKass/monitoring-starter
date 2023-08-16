package com.log.logging.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class DemoConfiguration {

    @Bean
    public DemoListener demoListener() {
        return new DemoListener();
    }
}
