package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import com.cg.entity.Book;
import com.cg.util.JPAutil;

public class App1 {

	public static void main(String[] args) {
		// program to insert data in book table
		
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
		EntityManager em=factory.createEntityManager();
		Book a1 = new Book("DBMS",200);
		Book a2 = new Book("Cloud Comp",600);
		Book a3 = new Book("Soft Eng",900);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		txn.commit();
		JPAutil.shutdown();
		
		
		
		

	}

}
