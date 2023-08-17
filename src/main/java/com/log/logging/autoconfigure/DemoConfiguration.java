package com.log.logging.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
class DemoConfiguration {

    @Bean
    DemoListener demoListener() {
        return new DemoListener();
    }
}
