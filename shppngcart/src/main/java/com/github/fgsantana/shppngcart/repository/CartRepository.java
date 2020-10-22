package com.github.fgsantana.shppngcart.repository;

import com.github.fgsantana.shppngcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {
}
