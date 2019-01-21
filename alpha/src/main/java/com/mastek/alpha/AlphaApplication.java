package com.mastek.alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlphaApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(AlphaApplication.class, args);
		
	}

}

