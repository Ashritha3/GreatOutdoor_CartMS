package com.capg.go.cart.service;

import com.capg.go.cart.model.Cart;


/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     CartService Interface with services for Cart Management System
*******************************************************************************************************************************/
import com.capg.go.cart.model.CartList;

public interface CartService {
	
	public CartList showAll();
	
	public Cart addtoCart(Cart cart);
	
	public boolean deleteByProductId(long productId);


}