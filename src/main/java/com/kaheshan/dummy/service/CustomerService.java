package com.kaheshan.dummy.service;


import com.kaheshan.dummy.model.Customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

    Long saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

    List<Customer> findAll();

	void update(Customer resource);
}
