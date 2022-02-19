package com.docker.tutorial;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;


    public List<Product> getAll() {
        return (List<Product>) repository.findAll();
    }
}
