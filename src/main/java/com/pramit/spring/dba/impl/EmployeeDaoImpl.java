package com.pramit.spring.dba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pramit.spring.dba.dao.EmployeeDAO;
import com.pramit.spring.dba.mapper.EmployeeMapper;
import com.pramit.spring.dba.model.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDAO {

	private final String FETCH_ALL = "Select EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_ID,SALARY,MANAGER_NAME from EMPLOYEE_TABLE";
	private final String FETCH_BY_ID = "Select EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_ID,SALARY,MANAGER_NAME from EMPLOYEE_TABLE where EMPLOYEE_ID = ";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(FETCH_ALL, new EmployeeMapper());
	}

	@Override
	public Employee getEmployeeByID(int id) {
		String sql = FETCH_BY_ID + id;
		return jdbcTemplate.queryForObject(sql, new EmployeeMapper());
	}

}
