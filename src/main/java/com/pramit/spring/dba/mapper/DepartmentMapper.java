package com.pramit.spring.dba.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pramit.spring.dba.model.Department;

public class DepartmentMapper implements RowMapper<Department> {

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dept = new Department();
		dept.setId(rs.getString("DEPARTMENT_ID"));
		dept.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
		return dept;
	}

}
