package com.pramit.spring.dba.dao;

import java.util.List;

import com.pramit.spring.dba.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeByID(int id);

}
