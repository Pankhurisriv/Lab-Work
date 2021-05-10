package com.cg.ui;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.entity.Book;
import com.cg.entity.BookAuthor;

import com.cg.util.JPAutil;

public class App2 {

	public static void main(String[] args) {
		// program to insert data in bookauthor table
		
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
		EntityManager em=factory.createEntityManager();
		
		Book a1 = new Book("Data str",200);
		BookAuthor b1 = new BookAuthor("Rahul");
		BookAuthor b2 = new BookAuthor("riya");
		BookAuthor b3 = new BookAuthor("Aditi");
		
        Set<BookAuthor> bookauthor =new HashSet<>();
	    
	    
	    bookauthor.add(b1);
	    bookauthor.add(b2);
	    bookauthor.add(b3);
	    
	    a1.setBookauthor(bookauthor);
	    b1.setBook(a1);
	    b2.setBook(a1);
	    b3.setBook(a1);
		
		
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		
		txn.commit();
		JPAutil.shutdown();
		

	}

}

