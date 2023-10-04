package com.tnsif.CrudOperation;

import javax.persistence.*;
public class DBUtil {
	
	static EntityManager em;
	
	static {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("PU");
		em=fact.createEntityManager();
	}
	
	public static EntityManager getEm()
	{
		return em;
	}
	

}
