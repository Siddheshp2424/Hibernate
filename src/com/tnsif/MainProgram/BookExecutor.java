package com.tnsif.MainProgram;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class BookExecutor {

	
	public static void main(String[] args) {
		EntityManagerFactory fe=Persistence.createEntityManagerFactory("PU");
		EntityManager em=fe.createEntityManager();
		
		em.getTransaction().begin();
		Book b1=new Book(102,"The old story","Manish pandey",360);
		Book b2=new Book(103,"The New story","Sumit pandey",260);
		em.persist(b1);
		em.persist(b2);
		 
		em.getTransaction().commit();
	}
}
