package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class FirstInfoMicroserviceApplication {

	public static void main(String[] args) {
		System.out.println("Added");
		SpringApplication.run(FirstInfoMicroserviceApplication.class, args);
	}

}
