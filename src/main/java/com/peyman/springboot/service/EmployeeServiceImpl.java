package com.peyman.springboot.service;

import com.peyman.springboot.entities.Employee;
import com.peyman.springboot.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repository;


	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;

	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Employee> findAll(Pageable pageable) {
		Employee employee =  repository.findEmployeeByFirstNameIsAndEmailLike("ali","a");
		return repository.findAll(pageable).toList();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return repository.findById(theId).get();
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {

		repository.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		repository.deleteById(theId);
	}

}






