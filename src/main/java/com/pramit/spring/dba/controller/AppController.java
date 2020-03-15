package com.pramit.spring.dba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramit.spring.dba.impl.CombinedObjectDAOImpl;
import com.pramit.spring.dba.impl.DepartmentDAOImpl;
import com.pramit.spring.dba.impl.EmployeeDaoImpl;
import com.pramit.spring.dba.model.CombinedObject;
import com.pramit.spring.dba.model.Department;
import com.pramit.spring.dba.model.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppController {

	@Autowired
	private DepartmentDAOImpl deptService;

	@Autowired
	private EmployeeDaoImpl empService;
	
	@Autowired
	private CombinedObjectDAOImpl comboService;

	@RequestMapping(value = "/getAllEmployees")
	@CrossOrigin(origins = "http://localhost:4200")
	private List<Employee> getAllEmployee() {
		return empService.getAllEmployees();
	}

	@RequestMapping(value = "/getAllEmployees/{empID}", produces = "application/json")
	private Employee getEmpByID(@PathVariable int empID) {
		return empService.getEmployeeByID(empID);
	}

	@RequestMapping(value = "/getAllDepartment")
	private List<Department> getAllDepart() {
		return deptService.getAllDepartment();
	}

	@RequestMapping(value = "/getAllDepartment/{deptID}", produces = "application/json")
	private Department getDeptByID(@PathVariable("deptID") String departID) {
		return deptService.getDepartmentById(departID);
	}
	
	@RequestMapping(value="/getCombo")
	private List<CombinedObject> getAllObject(){
		return comboService.getAllCombination();
	}
	
	@RequestMapping(value="/getCombo/{salary}")
	private List<CombinedObject> getObjectBasedOnSalary(@PathVariable("salary") int salary){
		return comboService.getAllCombinationBasedOnSalary(salary);
	}
}
