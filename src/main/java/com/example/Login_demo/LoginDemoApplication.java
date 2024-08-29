package com.example.Login_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; 

@SpringBootApplication
@ComponentScan("com.example.Login_demo")
public class LoginDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginDemoApplication.class, args);
	}
}
