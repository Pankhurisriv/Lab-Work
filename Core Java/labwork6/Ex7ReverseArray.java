package com.capg.labwork6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 
public class Ex7ReverseArray {

	
		  static int [] getSorted(int array[]) 
		    { 
			  ArrayList<Integer> ls =new ArrayList<Integer>();
			  for(int i : array) {
				  ls.add(i);
			  }
		        Collections.reverse(ls); 
		        System.out.println("Reversed Array:" + ls); 
		        Arrays.sort(array);
		        return array;
		    } 
		 
		     public static void main(String[] args) 
		    { 
		        Scanner sc= new Scanner(System.in);
		     
		     
		        System.out.println("Enter  the size of Array:");
		        int n=sc.nextInt();
		        int array[]=new int[n];
		        System.out.println("Enter the elements of array:");
		        for(int i=0;i<n;i++) {
		        	array[i]=sc.nextInt();
		        }
		        sc.close();
		        int [] sortedArray = getSorted( array) ;
		        System.out.println("sorted array is :");
		        for(int i : sortedArray) {
		    	   System.out.println(i);
		       }
		        sc.close();
		    } 
		    
		
		

	}


