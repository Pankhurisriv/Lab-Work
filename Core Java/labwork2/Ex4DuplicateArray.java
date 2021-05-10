package com.capg.labwork2;
import java.util.Scanner;

public class Ex4DuplicateArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of array");
	int n=sc.nextInt();
	int[] array=new int[n];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array");
	for(int i=0;i<n;i++) {
	 array[i]=s.nextInt();
		}
	System.out.println(modifyArray(array));
	}
	
	public static int[] modifyArray(int[] array) 
	     {
		    int temp[]=new int [n]; 
		    for(int i=0;i<n;i++) {
			temp[i]=array[i];
			  }
	}

}
