package com.docker.tutorial.controller;

import com.docker.tutorial.entity.Product;
import com.docker.tutorial.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @GetMapping
    public String welcomeMessage() {
        return "Hello visitor";
    }

    @GetMapping(path = "/products")
    public List<Product> getAllProducts() {
        return service.getAll();
    }
}