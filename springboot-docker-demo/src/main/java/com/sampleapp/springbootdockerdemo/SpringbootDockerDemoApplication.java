package com.sampleapp.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	@Getmapping("/welcome")
	public String welcome(){
		return "Spring Boot Docker Demo"
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
