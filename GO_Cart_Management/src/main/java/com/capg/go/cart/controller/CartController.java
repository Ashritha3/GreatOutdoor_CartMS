package com.capg.go.cart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.go.cart.model.Cart;
import com.capg.go.cart.model.CartList;
import com.capg.go.cart.service.CartService;

/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     CartController Class for accessing Cart Management System services
*******************************************************************************************************************************/


@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CartController {

	 @Autowired
	 CartService cartService;
	
	 @GetMapping("/getall")
	 
	    public ResponseEntity<CartList> showAll()
	    {
	    	return new ResponseEntity<CartList>(cartService.showAll(), HttpStatus.OK);
	    }
	
	 
	 @PostMapping("/addproduct")
	 
		public ResponseEntity<Cart> addproduct(@RequestBody Cart cart) 
	    {
			return new ResponseEntity<Cart>(cartService.addtoCart(cart), HttpStatus.CREATED);
		}
	 
	 @DeleteMapping("/deleteproduct/{Productid}")
	 
		public boolean removetest(@PathVariable("Productid") long productId) 
	    {
			return cartService.deleteByProductId(productId);
		}
	 
}
