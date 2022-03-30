package com.docker.tutorial.controller;

import com.docker.tutorial.dto.CustomerDto;
import com.docker.tutorial.entity.Customer;
import com.docker.tutorial.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody CustomerDto customerDto) {
        return customerService.create(customerDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(UUID id) {
        customerService.delete(id);
    }
}
