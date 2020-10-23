package com.github.fgsantana.pdtcatalog.service;

import com.github.fgsantana.pdtcatalog.model.Product;
import com.github.fgsantana.pdtcatalog.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {

    final ProductRepository repo;


    public Product createProduct(Product product) {
        return repo.save(product);
    }

    public Iterable<Product> getProducts() {
       return repo.findAll();
    }

    public Product getProductById(String id) {
        Optional<Product> opProduct = repo.findById(id);
        return opProduct.isEmpty() ? new Product() : opProduct.get();
    }
}
