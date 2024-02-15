package com.reto02.microservicios.gerente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosGerenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosGerenteApplication.class, args);
	}

}
