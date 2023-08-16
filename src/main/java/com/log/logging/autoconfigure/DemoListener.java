package com.log.logging.autoconfigure;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class DemoListener {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("We are in onApplicationEvent");
    }
}
