package com.cg.ui;

import java.time.LocalDate;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.cg.entity.Author;
import com.cg.util.JPAutil;


public class App4 {

	public static void main(String[] args) {
		 //program to update the data in author table
		
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
		EntityManager em=factory.createEntityManager();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter author id :");
		int author_Id=scan.nextInt();
		
		Author author=em.find(Author.class,author_Id);
		
		if(author!=null) {
			EntityTransaction txn=em.getTransaction();
			System.out.println("Enter new phone no :");
			String modifiedPhone = scan.next();
			author.setPhone_No(modifiedPhone);
			txn.begin();
			em.merge(author);
			txn.commit();
			System.out.println("author "+ author_Id	+"is updated");
			}else {
			System.out.println("author #"+ author_Id	+"is not found");
			}
		scan.close();
		JPAutil.shutdown(); 
		
		

	}

}

