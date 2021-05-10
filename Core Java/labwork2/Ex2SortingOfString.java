package com.capg.labwork2;
import java.util.Scanner;


public class Ex2SortingOfString {

	public static void main(String[] args) 
	{
      
       Scanner ab=new Scanner(System.in);
       System.out.println("Enter the number of strings");
       int length=ab.nextInt();
      
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the String");
	   for(int j=0;j<length;j++) 
       {
	   String s =sc.next();
       System.out.println(s);
	   }
	}

	   
	         static void  sortStrings (String s, int length ) {
	        	 
	         String temp=null;
             
	          for(int i=0;i<length;i++)
           
           	  for(int j=i+1;j<length;j++)
           	      {
           		  if(s[i].compareTo(s[j])>0) 
           		  {
           	           temp=s[i];
           			  s[i]=s[j];
           			  s[j]=temp;
           		    }
                }
	}
	
	
}   