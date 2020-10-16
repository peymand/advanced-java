package com.kaheshan.dummy.service;


import com.kaheshan.dummy.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

    Long saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId) throws SQLException;

    List<Customer> findAll();

	void update(Customer resource);
}
