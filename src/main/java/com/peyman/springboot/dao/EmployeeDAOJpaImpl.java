package com.peyman.springboot.dao;

import com.peyman.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.awt.print.Book;
import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {

		// create a query
		Query theQuery =
				entityManager.createQuery("from Employee");
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return the results		
		return employees;
	}

	@Override
	public Employee findById(int theId) {

		// get employee
		Employee theEmployee = 
				entityManager.find(Employee.class, theId);
		
		// return employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {

		// save or update the employee
		Employee dbEmployee = entityManager.merge(theEmployee);
		
		// update with id from db ... so we can get generated id for save/insert
		theEmployee.setId(dbEmployee.getId());
		
	}

	@Override
	public void deleteById(int theId) {

		// delete object with primary key
		Query theQuery = entityManager.createQuery(
							"delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();
	}
	List<Employee> findBooksByAuthorNameAndTitle(String name, String family) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

		Root<Employee> employeeRoot = cq.from(Employee.class);
		Predicate authorNamePredicate = cb.equal(employeeRoot.get("firstName"), name);
		Predicate titlePredicate = cb.like(employeeRoot.get("family"), "%" + family + "%");
		cq.where(authorNamePredicate, titlePredicate);

		TypedQuery<Employee> query = entityManager.createQuery(cq);
		return query.getResultList();
	}

}










