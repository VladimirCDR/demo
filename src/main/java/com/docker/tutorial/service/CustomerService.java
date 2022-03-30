package com.docker.tutorial.service;

import com.docker.tutorial.dto.CustomerDto;
import com.docker.tutorial.entity.Customer;
import com.docker.tutorial.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer create(CustomerDto customerDto) {
        var customer = customerRepository.findById(customerDto.getId());
        if (customer.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }

        return customerRepository.save(toCustomer(customerDto));
    }


    public void delete(UUID id) {
        var customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            customerRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    private Customer toCustomer(CustomerDto customerDto) {
        var customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setEmail(customerDto.getEmail());

        return customer;
    }
}
