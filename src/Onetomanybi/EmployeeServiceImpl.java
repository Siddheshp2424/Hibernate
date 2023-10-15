package Onetomanybi;

import javax.persistence.EntityManager;

 

public class EmployeeServiceImpl implements EmployeeService {
	EntityManager em;
	
	public EmployeeServiceImpl()
	{
		em=DBUtil.getEm();
	}
	
	public void insert(Employee employee)
	{
		em.getTransaction().begin();
		em.persist(employee);
        em.getTransaction().commit();		
	}
	
	public void update(Employee employee)
	{
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		
	}
	
	public void delete(Employee employee)
	{
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
	}
	
	public Employee getEmployee(int id)
	{
		return em.find(Employee.class, id);
	}

}
