package com.tnsif.singletableinheritance;

import javax.persistence.EntityManager;

import Onetomanybi.DBUtil;

public class InheritanceExecutor {
	
	public static void main(String[] args) {
		
		Person p1=new Person();
     	p1.setCity("Nashik");
		p1.setName("Manish");
		
		Person p2=new Person();
		p2.setCity("Sambhajinagar");
		p2.setName("Siddhesh");
		
		
		
		Student s1=new Student();
		s1.setName("Siddhesh");
		s1.setCity("Sambhajinagar");
		s1.setCourse("BE");
		s1.setPercentage(100);
		
	 
		
		Employee e1=new Employee();
		e1.setName("Rahul");
		e1.setSalary(10000);
		e1.setDeptname("IT");
		e1.setCity("Nashik");
		
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(s1);
		em.persist(e1);
		
		em.getTransaction().commit();
		
	 
		
		 
	  
		
		
	}

}
