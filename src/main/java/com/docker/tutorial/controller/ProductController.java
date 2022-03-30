package com.docker.tutorial.controller;

import com.docker.tutorial.entity.Product;
import com.docker.tutorial.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public String wellcomeMessage() {
       return "Hello visitor";
    }

    @GetMapping(path = "/admin")
    public List<Product> getAll() {
        return service.getAll();
    }

}