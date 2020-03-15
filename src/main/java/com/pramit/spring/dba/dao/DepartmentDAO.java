package com.pramit.spring.dba.dao;

import java.util.List;

import com.pramit.spring.dba.model.Department;

public interface DepartmentDAO {
	
	List<Department> getAllDepartment();
	Department getDepartmentById(String id);

}
