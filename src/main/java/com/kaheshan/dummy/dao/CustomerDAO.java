package com.kaheshan.dummy.dao;


import com.kaheshan.dummy.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	Long saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId)throws SQLException;

	void update(Customer resource);
}
