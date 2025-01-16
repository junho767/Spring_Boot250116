package com.example.demo.domain.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config2 {

    @Bean
    public List<Integer> numList() {
        return List.of(1,2,3,4,5);
    }
}
