package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/")
	public String root() {
		return "Welcome to the Spring Boot application deployed on Azure!DEV";
	}
	
	@GetMapping("/message")
	public String message(){
		return "Congrats ! your application deployed successfully in Azure Platform.DEV !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
