package com.github.fgsantana.pdtcatalog.controller;

import com.github.fgsantana.pdtcatalog.model.Product;
import com.github.fgsantana.pdtcatalog.repository.ProductRepository;
import com.github.fgsantana.pdtcatalog.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    final ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping
    public Iterable<Product> getProducts() {

        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
       return service.getProductById(id);
    }
}
