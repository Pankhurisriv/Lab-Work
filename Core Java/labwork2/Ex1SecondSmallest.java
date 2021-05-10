package com.capg.labwork2;
import java.util.Scanner;

public class Ex1SecondSmallest {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int[]array=new int[n];
		System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
	       }
	System.out.println( getSecondSmallest(array, n));
	}
	
	
	public static int  getSecondSmallest (int [] array, int n) {
             for(int i=0;i<n;i++)
            {
            	  for(int j=i+1;j<n;j++)
            	  {
            		  int tmp=0;
            		  if(array[i]>array[j]) 
            		  {
            			  tmp=array[i];
            			  array[i]=array[j];
            			  array[j]=tmp;
            		  }
              }
     
            }
        return(array[1]); 

}
}
