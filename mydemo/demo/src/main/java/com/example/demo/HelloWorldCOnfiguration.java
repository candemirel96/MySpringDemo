package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldCOnfiguration {
    @Bean
    public String name(){
        return "Ranga";
    }

}
