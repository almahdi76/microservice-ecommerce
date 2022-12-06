package org.abc.customer;

import java.util.List;

import org.abc.customer.entities.Customer;
import org.abc.customer.repo.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner run(CustomerRepo customerRepo,RepositoryRestConfiguration config) {
		config.exposeIdsFor(Customer.class);
		return args ->{
			customerRepo.saveAll(
					List.of(
							new Customer("Noe","noe@gmail.com","0611111111"),
							new Customer("Jalal","jalala@gmail.com","0622222222"),
							new Customer("Frank","frank@gmail.com","0633333333")
							)
					);
		};
	}

}
