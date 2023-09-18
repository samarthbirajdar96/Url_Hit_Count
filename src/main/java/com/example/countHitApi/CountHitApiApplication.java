package com.example.countHitApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")

public class CountHitApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountHitApiApplication.class, args);
	}

}
