package com.tnsif.manytomany;
import java.util.*;

import javax.persistence.EntityManager;

import Onetomanybi.DBUtil;
public class Executor {
	
	public static void main(String[] args) {
		EntityManager em;
		
		/*OrderMaster o1=new OrderMaster();
		o1.setPurchaseDate(new Date());
		
		ProductMaster p1=new ProductMaster();
		p1.setName("Book");
		p1.setPrice(600);
		
		ProductMaster p2=new ProductMaster();
		p1.setName("Book1");
		p1.setPrice(6000);
		
		ProductMaster p3=new ProductMaster();
		p1.setName("Book3");
		p1.setPrice(60000);
		
		Set<Product>
		*/
		
		OrderMaster o1=new OrderMaster();
		o1.setPurchaseDate(new Date());
		
		OrderMaster o2=new OrderMaster();
		o2.setPurchaseDate(new Date());
		
		ProductMaster p1=new ProductMaster();
		p1.setName("Siddhesh");
		p1.setPrice(50000);
		
		ProductMaster p2=new ProductMaster();
		p1.setName("Sachin");
		p1.setPrice(10000);
		
		 
		
		em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(o1);
		em.persist(o2);
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		
		
		
	}

}
