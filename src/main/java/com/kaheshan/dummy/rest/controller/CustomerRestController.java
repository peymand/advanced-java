package com.kaheshan.dummy.rest.controller;

import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.model.Message;
import com.kaheshan.dummy.rest.exeption.MyResourceNotFoundException;
import com.kaheshan.dummy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/customer")
public class CustomerRestController {

    // need to inject our customer service
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkFound(service.getCustomer(id.intValue()));
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Message> create(@RequestBody Customer resource) {
//        Preconditions.checkNotNull(resource);
        return new ResponseEntity<>(new Message(String.format("Object Created with id = %d ",service.saveCustomer(resource))),HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Customer resource) {
//        Preconditions.checkNotNull(resource);
        RestPreconditions.checkNotNull(service.getCustomer(resource.getId()));
        service.update(resource);
    }

    @DeleteMapping(value = "/{id}")//,produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Message> delete(@PathVariable("id") Long id) {
        service.deleteCustomer(id.intValue());
        return new ResponseEntity<>(new Message(String.format("Customer with id : %d deleted",id)),HttpStatus.OK);
    }

}
class RestPreconditions {
    public static <T> T checkFound(T resource) {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
        return resource;
    }

    public static <T> T checkNotNull(T resource) {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
        return resource;
    }
}