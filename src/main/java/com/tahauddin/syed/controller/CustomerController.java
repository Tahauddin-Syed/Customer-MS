package com.tahauddin.syed.controller;

import com.tahauddin.syed.domain.Customer;
import com.tahauddin.syed.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(Integer id){

        return ResponseEntity.ok(customerRepository.findById(id).orElse(Customer.builder().build()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return ResponseEntity.ok(customerRepository.findAll());
    }


}
