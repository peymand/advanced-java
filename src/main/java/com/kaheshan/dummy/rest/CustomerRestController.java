package com.kaheshan.dummy.rest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/customer")
@AllArgsConstructor
public class CustomerRestController {

    CustomerService customerService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public Customer getCustomer(@PathVariable int id) {
        Customer customer = customerService.getCustomer(id);
        return customer;
    }

    //ResponseEntity
    //Exception Handling
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String saveCustomer(@RequestBody Customer customer){

        customerService.saveCustomer(customer);
        return "Saved!!!";
    }



}
