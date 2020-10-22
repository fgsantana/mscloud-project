package com.github.fgsantana.shppngcart.controller;

import com.github.fgsantana.shppngcart.model.Cart;
import com.github.fgsantana.shppngcart.model.Item;
import com.github.fgsantana.shppngcart.service.ShppngCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cart")
public class ShppngCartController {

    final ShppngCartService service;

    @PostMapping("/{id}")
    public Cart insertItemOnCart(@PathVariable("id") String id, @RequestBody Item item) {
        return service.insertItemOnCart(id, item);
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable("id") String id) {
        return service.getCartById(id);
    }


}
