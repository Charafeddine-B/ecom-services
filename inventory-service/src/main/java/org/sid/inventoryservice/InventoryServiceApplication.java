package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient

public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Product.class);
			productRepository.saveAll(
					List.of(
							Product.builder().name("Computer").price(1000).quantity(12).build(),
							Product.builder().name("Printer").price(200).quantity(120).build(),
							Product.builder().name("Smartphone").price(500).quantity(120).build(),
							Product.builder().name("Tablet").price(400).quantity(120).build()
					)
			);
			productRepository.findAll().forEach(p->{
				System.out.println(p.toString());
			});
		};
	}
}
