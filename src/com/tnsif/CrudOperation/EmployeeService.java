package com.tnsif.CrudOperation;

public interface EmployeeService {

	void insert(Employee emp);
	void update(Employee emp);
	void delete(Employee emp);
	Employee getEmployee(int empId);
	
}
