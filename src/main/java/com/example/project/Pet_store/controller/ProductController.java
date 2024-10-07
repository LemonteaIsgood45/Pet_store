package com.example.project.Pet_store.controller;

import com.example.project.Pet_store.model.Product;
import com.example.project.Pet_store.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    private void init() {
        productRepository.save(new Product(1, "bla", "bla", "bla", "bla" ,"bla", 198.9, 90));
    }

    @GetMapping(value = "/all")
    List<Product> findAll() {
        return productRepository.findAll();
    }

}
