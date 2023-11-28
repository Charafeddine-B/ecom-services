package org.sid.orderservice;

import org.sid.orderservice.entities.ProductItem;
import org.sid.orderservice.model.Customer;
import org.sid.orderservice.model.Product;
import org.sid.orderservice.repository.OrderRepository;
import org.sid.orderservice.services.CustomerRestClientService;
import org.sid.orderservice.services.InventoryRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Collection;

@EnableFeignClients
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	CommandLineRunner start(OrderRepository orderRepository,
							ProductItem productItem,
							CustomerRestClientService customerRestClientService,
							InventoryRestClientService inventoryRestClientService){
		return args -> {
			Collection<Customer> customers = customerRestClientService.findAllCustomers().getContent();
			Collection<Product> productItems = inventoryRestClientService.findAllProducts().getContent();
			Long customerId = 1L;
			Customer customer = 
		};
	}

}
