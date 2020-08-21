package com.capg.go.cart.exception;


/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     14-08-2020
-Description              :     ProductAlreadyExistException class with constructor
*******************************************************************************************************************************/

public class ProductAlreadyExistException extends RuntimeException{
	
	public ProductAlreadyExistException(String message) {
		super(message);
	}

}
