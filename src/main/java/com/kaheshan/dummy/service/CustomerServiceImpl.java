package com.kaheshan.dummy.service;


import com.kaheshan.dummy.dao.CustomerDAO;
import com.kaheshan.dummy.model.Customer;
import com.kaheshan.dummy.model.CustomerDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// need to inject the session factory
	@Autowired
	private CustomerDAO customerDAO;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session

		return customerDAO.getCustomers();

	}

	@Override
	public Long saveCustomer(CustomerDTO theCustomer) {

		Customer customer =  modelMapper.map(theCustomer,Customer.class);

		return customerDAO.saveCustomer(customer);
	}

	@Override
	public Customer getCustomer(int theId) {

		// get the current hibernate session

		
		return customerDAO.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) throws SQLException {

		customerDAO.deleteCustomer(theId);
	}

	@Override
	public List<Customer> findAll() {
		return customerDAO.getCustomers();
	}

	@Override
	public void update(int id, Customer resource) {
		customerDAO.update(id, resource);
	}

}











