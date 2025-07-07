package com.example.springcore_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"util", "com.example.springcore_demo"} // Specify the package to scan for components
//)

@SpringBootApplication // This annotation marks the main class of a Spring Boot application
public class SpringcoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreDemoApplication.class, args);
	}

}
