package com.github.fgsantana.pdtcatalog.controller;

import com.github.fgsantana.pdtcatalog.model.Product;
import com.github.fgsantana.pdtcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {

        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") String id) throws Exception {
        return repo.findById(id).orElseThrow(Exception::new);
    }
}
