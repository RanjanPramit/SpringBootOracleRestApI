package com.pramit.spring.dba.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Department {
	private String id;
	private String departmentName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(String id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}

	public Department() {
	}
}
