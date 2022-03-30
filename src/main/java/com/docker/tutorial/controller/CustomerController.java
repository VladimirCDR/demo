package com.docker.tutorial.controller;

import com.docker.tutorial.dto.CustomerDto;
import com.docker.tutorial.entity.Customer;
import com.docker.tutorial.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @RolesAllowed(value = "ADMIN")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }
}
