package com.cg.ui;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.cg.entity.Author;
import com.cg.util.JPAutil;



public class App3 {

	public static void main(String[] args) {
		// program to delete data from author table
		
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
        EntityManager em=factory.createEntityManager();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter author id");
        int author_Id=scan.nextInt();
        
        Author author=em.find(Author.class,author_Id);
        if(author!=null) {
        	EntityTransaction txn=em.getTransaction();
        	txn.begin();
        	em.remove(author);
        	txn.commit();
        	System.out.println("Author "+ author_Id	+"is removed");
        	}else {
        	System.out.println("Author "+ author_Id	+"is not found");
        	}
        scan.close();
        JPAutil.shutdown();
    }

}



