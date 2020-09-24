package com.kaheshan.dummy.service;


import com.kaheshan.dummy.dao.CustomerDAO;
import com.kaheshan.dummy.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// need to inject the session factory
	@Autowired
	private CustomerDAO customerDAO;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session

		return customerDAO.getCustomers();

	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {

		// get the current hibernate session

		
		return customerDAO.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) {

		customerDAO.deleteCustomer(theId);
	}

}











