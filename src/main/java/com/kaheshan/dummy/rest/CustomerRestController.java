package com.kaheshan.dummy.rest;


import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/customer")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Customer customer = customerService.getCustomer(id);
        return customer;
    }
}
