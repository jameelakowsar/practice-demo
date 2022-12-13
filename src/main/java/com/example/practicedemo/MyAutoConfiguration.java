package com.example.practicedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyAutoConfiguration {
    public MyAutoConfiguration() {

    }

    @Bean
    public UserManager myManager() {
        System.out.println("user manager bean start to create");
        UserManager myManager = new UserManager();
        return myManager;
    }

}
