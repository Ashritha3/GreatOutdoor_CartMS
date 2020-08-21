package com.capg.go.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.go.cart.exception.ProductAlreadyExistException;
import com.capg.go.cart.exception.ProductNotFoundException;
import com.capg.go.cart.model.Cart;
import com.capg.go.cart.repository.CartRepo;
import com.capg.go.cart.service.CartService;

@SpringBootTest
class GoCartManagementApplicationTests {
	
	@Autowired
	CartRepo cRepo;
	
	@Autowired
	CartService iService;
	
	Cart cart1;
	Cart cart2;
	Cart cart3;
	
	@BeforeEach
	public void init() {
		
		cart1= new Cart(105, 3);
		cart2= new Cart(103, 5);
		cart3= new Cart(102,1);
	}

	@Test
	public void testaddProduct() {
		
		iService.addtoCart(cart1);
		assertEquals(true,cRepo.getOne(cart1.getProductId())!=null);
	}
	
	@Test
	public void testremoveProduct() {
		
		assertEquals(true,iService.deleteByProductId(cart2.getProductId())==true);
	}
	
	@Test
	public void testException() {
		
		Throwable exception = assertThrows( ProductNotFoundException.class, ()->{
			iService.deleteByProductId(cart3.getProductId());
		}
		);
		assertEquals("Product with id "+cart3.getProductId()+"is not Found", exception.getMessage());
	}
	
	@Test
	public void testException1() {
		
		Throwable exception = assertThrows( ProductAlreadyExistException.class, ()->{
			iService.addtoCart(cart3);
		}
		);
		assertEquals("Product with id "+cart3.getProductId()+" already exists", exception.getMessage());
	}
	

}
