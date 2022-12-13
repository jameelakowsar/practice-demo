package com.example.practicedemo;

import org.springframework.stereotype.Component;

@Component
public class UserManager {
    public String getUserName() {
        System.out.println("Jameela");
        return "Jameela";
    }
}
