package com.github.fgsantana.shppngcart.service;

import com.github.fgsantana.shppngcart.model.Cart;
import com.github.fgsantana.shppngcart.model.Item;
import com.github.fgsantana.shppngcart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ShppngCartService {

    final CartRepository repo;


    public Cart insertItemOnCart(String id, Item item) {
        Optional<Cart> opCart = repo.findById(id);
        if(opCart.isEmpty()){
            Cart cart = Cart.builder().id(id).build();
            cart.getItems().add(item);
            repo.save(cart);
            return repo.save(cart);
        }
        else{

            opCart.get().getItems().add(item);
            return repo.save(opCart.get());
        }
    }

    public Cart getCartById(String id) {
        Optional<Cart> opCart = repo.findById(id);
        return opCart.isEmpty() ? new Cart() : opCart.get();
    }
}
