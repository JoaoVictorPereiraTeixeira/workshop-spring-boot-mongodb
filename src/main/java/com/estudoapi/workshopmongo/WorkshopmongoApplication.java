package com.estudoapi.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkshopmongoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(WorkshopmongoApplication.class, args);
	}

}
