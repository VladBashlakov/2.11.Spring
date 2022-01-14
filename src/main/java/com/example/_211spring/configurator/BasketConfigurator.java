package com.example._211spring.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BasketConfigurator {
    @SessionScope
    @Bean
    public Basket basket() {
        return new Basket();
    }
}
