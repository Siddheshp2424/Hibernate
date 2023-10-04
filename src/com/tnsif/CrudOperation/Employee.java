package com.tnsif.CrudOperation;
import javax.persistence.*;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empname;
	private float salary;
	@Column(name="post" ,length=50)
	private String designation;
	public int getEmpid() {
		return empid;
	}
	public void setEmpId(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpName(String empname) {
		this.empname = empname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", designation="
				+ designation + "]";
	}

	
	
	
}
