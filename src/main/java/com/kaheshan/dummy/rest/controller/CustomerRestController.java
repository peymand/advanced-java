package com.kaheshan.dummy.rest.controller;

import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.model.CustomerDTO;
import com.kaheshan.dummy.model.Message;
import com.kaheshan.dummy.rest.exeption.MyResourceNotFoundException;
import com.kaheshan.dummy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.sql.SQLException;
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
    public ResponseEntity<Message> create(@Valid @RequestBody  CustomerDTO resource, BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<Message>(new Message("input validation Faild"),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Message(String.format("Object Created with id = %d ",service.saveCustomer(resource))),HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}",consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Customer resource) {
//        Preconditions.checkNotNull(resource);
//        RestPreconditions.checkNotNull(service.getCustomer(id.intValue()));
//        resource.setId(id.intValue());
        service.update(id.intValue(), resource);
        System.out.println("");
    }

    @DeleteMapping(value = "/{id}")//,produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Message> delete(@PathVariable("id") Long id) throws SQLException {
        service.deleteCustomer(id.intValue());
        return new ResponseEntity<>(new Message(String.format("Customer with id : %d deleted",id)),HttpStatus.OK);
    }

//    @ExceptionHandler({ Exception.class, SQLException.class })
//    public ResponseEntity<Message> handleException(SQLException exc) {
//        return new ResponseEntity<>(new Message("ID does not exists"),HttpStatus.EXPECTATION_FAILED);
////        return new ResponseStatusException(HttpStatus.NOT_MODIFIED, "ID does not exists", exc);
//
//    }

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