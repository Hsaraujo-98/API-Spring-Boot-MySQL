package br.com.supermercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SuperMercadoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SuperMercadoApplication.class, args);
		
		System.out.println("Spring Boot no ar!!!");
	}

}
