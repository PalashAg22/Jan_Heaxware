package com.hexaware.springrestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringrestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestJpaApplication.class, args);
	}

	@Bean // used to create resttemplate obj
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
