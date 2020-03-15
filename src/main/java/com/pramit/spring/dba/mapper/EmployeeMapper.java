package com.pramit.spring.dba.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pramit.spring.dba.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("EMPLOYEE_ID"));
		emp.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
		emp.setDepartmentID(rs.getString("DEPARTMENT_ID"));
		emp.setSalary(rs.getInt("SALARY"));
		emp.setManagerName(rs.getString("MANAGER_NAME"));
		return emp;
	}

}
