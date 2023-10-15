package Onetomanybi;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

 

public class ExecutorOneToMany {
	public static void main(String[] args) {
		Department deptObj=new Department();
		 
		deptObj.setName("Account");
		
		
		Employee empOne=new Employee();
	 
		empOne.setName("Siddhesh");
		empOne.setDept(deptObj);
		
		Employee empTwo=new Employee();
		 
		empTwo.setName("Rahul");
		empTwo.setDept(deptObj);
		
		Set<Employee> emps=new HashSet<Employee>();
		emps.add(empOne);
		emps.add(empTwo);
		deptObj.setEmployees(emps);
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(deptObj);
		em.persist(empOne);
		em.persist(empTwo);
        em.getTransaction().commit();
		
		
	}

}
