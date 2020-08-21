package com.capg.go.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.go.cart.controller.CartController;

@SpringBootApplication
public class GoCartManagementApplication {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(CartController.class);
		SpringApplication.run(GoCartManagementApplication.class, args);
		log.info("Cart Management started");
	}
	
}
