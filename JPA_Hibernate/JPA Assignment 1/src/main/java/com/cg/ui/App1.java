package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.cg.entity.Author;
import com.cg.util.JPAutil;



public class App1 {
	public static void main(String[] args) {
		
		  // program to insert data in author table
		
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
		EntityManager em=factory.createEntityManager();
		Author a1 = new Author("soumya","p","singh","9876523458");
		Author a2 = new Author("Rahul","a","singh","8763256789");
		Author a3 = new Author("Sam","p","smith","9852985689");
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		txn.commit();
		JPAutil.shutdown();
		
		
	}

}


