package com.pramit.spring.dba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pramit.spring.dba.dao.DepartmentDAO;
import com.pramit.spring.dba.mapper.DepartmentMapper;
import com.pramit.spring.dba.model.Department;

@Service
public class DepartmentDAOImpl implements DepartmentDAO {

	private final String FETCH_ALL = "Select DEPARTMENT_ID,DEPARTMENT_NAME from DEPARTMENT_TABLE";
	private final String FETCH_BY_ID = "Select DEPARTMENT_ID,DEPARTMENT_NAME from DEPARTMENT_TABLE where DEPARTMENT_ID = '";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Department> getAllDepartment() {
		return jdbcTemplate.query(FETCH_ALL, new DepartmentMapper());
	}

	@Override
	public Department getDepartmentById(String id) {
		String sql = FETCH_BY_ID + id + "'";
		return jdbcTemplate.queryForObject(sql, new DepartmentMapper());
	}

}
