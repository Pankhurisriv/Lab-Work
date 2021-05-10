package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.cg.entity.Author;
import com.cg.util.JPAutil;



public class App2 {
  public static void main(String[] args) {
	  
		//program to retrieve the data from author table
	  
		EntityManagerFactory factory=JPAutil.getEntityManagerFactory();
		EntityManager em=factory.createEntityManager();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter author id");
		int author_Id=scan.nextInt();
		
		Author author=em.find(Author.class,author_Id);
		if(author!=null) {
			System.out.println(author);
			}else {
			System.out.println("Author "+ author_Id	+"is not Found");
			}
		scan.close();
		JPAutil.shutdown();
		

	}

}



