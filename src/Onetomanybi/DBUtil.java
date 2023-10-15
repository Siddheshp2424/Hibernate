package Onetomanybi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	static EntityManager em;
	static
	{
		EntityManagerFactory factory;
		factory=Persistence.createEntityManagerFactory("PU");
		em=factory.createEntityManager();
	}
	public static EntityManager getEm()
	{
		return em;
	}

}