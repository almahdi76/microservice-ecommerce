package org.abc.stock;

import java.util.List;

import org.abc.stock.entites.Product;
import org.abc.stock.repo.ProductRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(ProductRepo productRepo) {
		return args ->{
			productRepo.save(new Product("LG",25,25));
			productRepo.save(new Product("Samsung",7,999.7));
			productRepo.save(new Product("Xiaomi",3,404.8));
		
							
		};
	}
	


}
