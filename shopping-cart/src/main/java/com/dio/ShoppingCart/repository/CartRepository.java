package com.dio.ShoppingCart.repository;

import com.dio.ShoppingCart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
