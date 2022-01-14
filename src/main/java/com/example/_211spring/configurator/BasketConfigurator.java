package com.example._211spring.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BasketConfigurator {
    @Scope("prototype")
    @Bean
    public Basket basket() {
        return new Basket();
    }
}
