package com.pramit.spring.dba.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private int id;
	private String employeeName;
	private String departmentID;
	private int salary;
	private String managerName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", departmentID=" + departmentID + ", salary="
				+ salary + ", managerName=" + managerName + "]";
	}

	public Employee(int id, String employeeName, String departmentID, int salary, String managerName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.departmentID = departmentID;
		this.salary = salary;
		this.managerName = managerName;
	}

	public Employee() {
	}
}
