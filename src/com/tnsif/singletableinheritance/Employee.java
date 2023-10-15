package com.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeMaster")
@DiscriminatorValue(value = "E")
public class Employee extends Person {
	
	private int salary;
	private String deptname;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", deptname=" + deptname + "]";
	}
	
	

}
