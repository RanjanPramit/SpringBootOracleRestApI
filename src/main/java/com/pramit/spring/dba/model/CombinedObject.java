package com.pramit.spring.dba.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CombinedObject {
	private int empId;
	private String departId;
	private String employeeName;
	private String departName;
	private String managerName;
	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public CombinedObject(int empId, String departId, String employeeName, String departName, String managerName,
			int salary) {
		super();
		this.empId = empId;
		this.departId = departId;
		this.employeeName = employeeName;
		this.departName = departName;
		this.managerName = managerName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CombinedObject [empId=" + empId + ", departId=" + departId + ", employeeName=" + employeeName
				+ ", departName=" + departName + ", managerName=" + managerName + ", salary=" + salary + "]";
	}

	public CombinedObject() {
	}

}
