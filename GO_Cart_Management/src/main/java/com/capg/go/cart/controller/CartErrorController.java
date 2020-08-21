package com.capg.go.cart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.go.cart.exception.CartEmptyException;
import com.capg.go.cart.exception.ProductAlreadyExistException;
import com.capg.go.cart.exception.ProductNotFoundException;

/*******************************************************************************************************************************
-Author                   :     V.Ashritha
-Created/Modified Date    :     15-08-2020
-Description              :     CartErrorController Class for handling Cart Management System Exceptions
*******************************************************************************************************************************/


@ControllerAdvice
@RestController
public class CartErrorController {
	
	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Product not foud")
	public void handleProductNotFoundException() {
		
	}
	
	@ExceptionHandler(ProductAlreadyExistException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Product with this id already exists")
	public void handleProductAlreadyExistException() {
		
	}
	
	@ExceptionHandler(CartEmptyException.class)
	@ResponseStatus(code = HttpStatus.NO_CONTENT, reason = "Your cart is Empty")
	public void handleCartisEmptyException() {
		
	}

}
