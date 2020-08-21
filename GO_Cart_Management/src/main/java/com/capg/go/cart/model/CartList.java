package com.capg.go.cart.model;

import java.util.List;

/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     CartList Class with cartList Property
*******************************************************************************************************************************/


public class CartList {
	
	private List<Cart> cartList;

	public CartList(List<Cart> cartList) {
		super();
		this.cartList = cartList;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}


}
