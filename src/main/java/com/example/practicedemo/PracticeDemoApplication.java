package com.example.practicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PracticeDemoApplication.class, args);
		System.out.println("Hello world!");

		// UserManager u = new UserManager();

		// UserManager u = context.getBean(UserManager.class);
		// u.getUserName();

		MyAutoConfiguration m = context.getBean(MyAutoConfiguration.class);
		m.myManager();

	}

}
