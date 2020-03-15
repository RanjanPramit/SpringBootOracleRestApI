package com.pramit.spring.dba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pramit.spring.dba.dao.CombinedObjectDAO;
import com.pramit.spring.dba.mapper.CombinedObjectMapper;
import com.pramit.spring.dba.model.CombinedObject;
@Service
public class CombinedObjectDAOImpl implements CombinedObjectDAO {

	private final String FETCH_ALL = "Select t.employee_id,t.employee_name,d.department_id,d.DEPARTMENT_NAME,t.manager_name,t.salary from employee_table t,department_table d where t.department_id = d.department_id ";

	private final String FETCH_BY_SALARY_STRUCTURE = "Select t.employee_id,t.employee_name,d.department_id,d.DEPARTMENT_NAME,t.manager_name,t.salary from employee_table t,department_table d where t.department_id = d.department_id  and t.salary > ";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<CombinedObject> getAllCombination() {
		return jdbcTemplate.query(FETCH_ALL, new CombinedObjectMapper());
	}

	@Override
	public List<CombinedObject> getAllCombinationBasedOnSalary(int salary) {
		String sql = FETCH_BY_SALARY_STRUCTURE + salary;
		return jdbcTemplate.query(sql, new CombinedObjectMapper());
	}

}
