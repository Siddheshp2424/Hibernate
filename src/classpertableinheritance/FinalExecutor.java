package classpertableinheritance;

import javax.persistence.EntityManager;

import Onetomanybi.DBUtil;

public class FinalExecutor {
	
	
	public static void main(String[] args) {
	
		
		Vehicle v1=new Vehicle(40000,"hack-a");
		Vehicle v2=new Vehicle(40000,"hack-a");
		
		
		Car c1=new Car(550000,"MUV","Black","Rudba");
		Car c2=new Car(650000,"MUV","Golden","Systumm..");
		 
		
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(v1);
		em.persist(v2);
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		
		
	}
	 
	
		

}
