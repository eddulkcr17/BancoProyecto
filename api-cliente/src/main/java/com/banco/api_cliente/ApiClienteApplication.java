package com.banco.api_cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class ApiClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClienteApplication.class, args);
	}

}
