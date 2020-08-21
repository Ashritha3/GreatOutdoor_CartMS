package com.capg.go.cart.exception;


/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     14-08-2020
-Description              :     ProductNotFoundException class with constructor
*******************************************************************************************************************************/

public class ProductNotFoundException extends RuntimeException{
	
	public ProductNotFoundException(String message) {
		super(message);
	}

}
