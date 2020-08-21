package com.capg.go.cart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.go.cart.exception.CartEmptyException;
import com.capg.go.cart.exception.ProductAlreadyExistException;
import com.capg.go.cart.exception.ProductNotFoundException;
import com.capg.go.cart.model.Cart;
import com.capg.go.cart.model.CartList;
import com.capg.go.cart.repository.CartRepo;


/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     CartServiceImpl Class implements services for Cart Management System
*******************************************************************************************************************************/


@Service
public class CartServiceImpl implements CartService{

	@Autowired(required = true)
	CartRepo repo;
	
	
	/*******************************************************************************************************************************
	-Function Name            :     showAll
	-Input Parameters         :     No Input
	-Return Type              :     CartList object
	-Throws                   :     CartEmptyException
	-Author                   :     V. Ashritha
	-Created/Modified Date    :     14-08-2020
	-Description              :     getting all products present in the Cart Database
	*******************************************************************************************************************************/
	
	@Override
	public CartList showAll() {
		
		if(repo.findAll().isEmpty()) 
		{
			throw new CartEmptyException("Your cart is empty");
		}
		
		return new CartList(repo.findAll());
	}
	
	
	/*******************************************************************************************************************************
	-Function Name            :     addtoCart
	-Input Parameters         :     Cart Object
	-Return Type              :     added Cart object
	-Throws                   :     ProductAlreadyExistException
	-Author                   :     V. Ashritha
	-Created/Modified Date    :     14-08-2020
	-Description              :     adding product to the Cart Database Table using Spring Data
	*******************************************************************************************************************************/
	
	@Override
	public Cart addtoCart(Cart cart) {
		
		if(repo.existsById(cart.getProductId()))
		{
			throw new ProductAlreadyExistException("Product with id "+cart.getProductId()+" already exists");
		}
    	
		return repo.save(cart);
	}

	
	/*******************************************************************************************************************************
	-Function Name            :     deleteByProductId
	-Input Parameters         :     ProductId
	-Return Type              :     boolean
	-Throws                   :     ProductNotFoundException
	-Author                   :     V. Ashritha
	-Created/Modified Date    :     14-08-2020
	-Description              :     removing Specific product from Cart DataBase Table.
	*******************************************************************************************************************************/
	
	@Override
	public boolean deleteByProductId(long productId) {
		
		if(!repo.existsById(productId)){
			throw new ProductNotFoundException("Product with id "+productId+"is not Found"); 
		}
		
		repo.deleteById(productId);
	    
	    return !repo.existsById(productId);
	}

	

}
