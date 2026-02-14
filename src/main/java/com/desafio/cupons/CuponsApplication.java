package com.desafio.cupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CuponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuponsApplication.class, args);
	}

}
