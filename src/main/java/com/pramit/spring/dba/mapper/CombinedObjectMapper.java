package com.pramit.spring.dba.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pramit.spring.dba.model.CombinedObject;

public class CombinedObjectMapper implements RowMapper<CombinedObject> {

	@Override
	public CombinedObject mapRow(ResultSet rs, int rowNum) throws SQLException {
		CombinedObject obj = new CombinedObject();
		obj.setEmpId(rs.getInt("EMPLOYEE_ID"));
		obj.setDepartId(rs.getString("DEPARTMENT_ID"));
		obj.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
		obj.setDepartName(rs.getString("DEPARTMENT_NAME"));
		obj.setSalary(rs.getInt("SALARY"));
		obj.setManagerName(rs.getString("MANAGER_NAME"));
		return obj;
	}

}
