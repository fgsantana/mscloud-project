package com.github.fgsantana.shppngcart.controller;

import com.github.fgsantana.shppngcart.model.Cart;
import com.github.fgsantana.shppngcart.model.Item;
import com.github.fgsantana.shppngcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class ShppngCartController {
    @Autowired
    CartRepository repo;

    @PostMapping("/{id}")
    public Cart insertItemOnCart(@PathVariable("id") String id, @RequestBody Item item){
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

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable("id") String id){
        Optional<Cart> cart = repo.findById(id);
//
        return cart.isEmpty() ? new Cart() : cart.get();
    }
}
