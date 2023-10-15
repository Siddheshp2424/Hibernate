package jointtableinheritance;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import Onetomanybi.DBUtil;

public class Executor {
	
	public static void main(String[] args) {
		Animal a1=new Animal(101,"pet","herbicious","-----");
		Animal a2=new Animal(102,"wild","carnivous","----");
	
	   PetAnimal p1=new PetAnimal(103,"pet","carnivals","Barking",(byte)7,"Brown");
	   
	   WildAnimal w1=new WildAnimal(104,"Wild","Carnival","Roaring",143,"Group");
	   
	   
	   EntityManager em=DBUtil.getEm();
	   em.getTransaction().begin();
	   em.persist(a1);
	   em.persist(a2);
	   em.persist(p1);
	   em.persist(w1);
	   em.getTransaction().commit();
	
	}

}
