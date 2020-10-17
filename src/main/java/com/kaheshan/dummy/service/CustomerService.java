package com.kaheshan.dummy.service;


import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.model.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

    Long saveCustomer(CustomerDTO theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId) throws SQLException;

    List<Customer> findAll();

	void update(Customer resource);
}
