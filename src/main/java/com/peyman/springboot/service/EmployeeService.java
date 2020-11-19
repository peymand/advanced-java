package com.peyman.springboot.service;


import com.peyman.springboot.entities.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {

	public List<Employee> findAll();
	public List<Employee> findAll(Pageable pageable);

	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
