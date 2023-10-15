package Onetomanybi;

public interface EmployeeService {

	void insert(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee getEmployee(int id);
}
