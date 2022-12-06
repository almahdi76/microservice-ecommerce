package org.abc.facturation;

import org.abc.repo.FacturationRepo;
import org.abc.repo.ProductItemRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturationServiceApplication.class, args);
	}
	
	CommandLineRunner start(ProductItemRepo productItemRepo,FacturationRepo facturationRepo) {
		return args ->{
			
			
		};
	}

}
