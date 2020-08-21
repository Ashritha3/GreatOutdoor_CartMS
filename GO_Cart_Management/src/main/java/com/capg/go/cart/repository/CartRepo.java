package com.capg.go.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/*******************************************************************************************************************************
-Author                   :     V. Ashritha
-Created/Modified Date    :     13-08-2020
-Description              :     Cart Repository Interface with Cart as Type and Long as Key
*******************************************************************************************************************************/


import com.capg.go.cart.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

}
