package com.capg.go.cart.exception;


/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     14-08-2020
-Description              :     CartEmptyException class with constructor
*******************************************************************************************************************************/


public class CartEmptyException extends RuntimeException {
	
	public CartEmptyException(String message) {
		super(message);
	}

}
