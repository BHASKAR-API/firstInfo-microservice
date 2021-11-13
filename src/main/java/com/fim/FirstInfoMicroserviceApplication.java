package com.fim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstInfoMicroserviceApplication {

	public static void main(String[] args) {
		
		System.out.println("Application Started.......");
		
		SpringApplication.run(FirstInfoMicroserviceApplication.class, args);
		
		System.out.println("ru method...........!!!!!!!!!!");
	}

}
