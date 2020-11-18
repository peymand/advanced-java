package com.peyman.springboot.repositories;


import com.peyman.springboot.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
    Employee findByFirstNameAndEmail(String name,String email);

    @Query("SELECT e FROM Employee e WHERE LOWER(e.firstName) = LOWER(:name)")
    Employee retrieveByName(@Param("name") String name);



}
