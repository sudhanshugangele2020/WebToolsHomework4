package edu.neu.hw4Q6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.neu.hw4Q6.service.ShoppingService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public ShoppingService shoppingService() {
		return new ShoppingService();
	}

}
