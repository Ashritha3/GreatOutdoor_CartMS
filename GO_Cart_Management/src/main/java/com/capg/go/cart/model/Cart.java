package com.capg.go.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     Cart Bean Class

*******************************************************************************************************************************/


@Entity
@Table(name = "cart_info")
public class Cart{
	
	@Id
	private long productId;
	private int  productQuantity;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(long productId, int productQuantity) {
		super();
		this.productId = productId;
		this.productQuantity = productQuantity;
	}


	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", productQuantity=" + productQuantity + "]";
	}
	
}