package com.capg.labwork2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex3ReverseArray {

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
	    getSorted(array, n);
	      }
	    
	    
	    
		public static void  getSorted (int[] array, int n) 
	    {
        int j=n;
	    int[] rev=new int[n];
	    for(int i=0; i<n;i++)
	    {
		rev[j-1]=array[i];
		j--;
		}
	    for(int k=0;k<n;k++) 
	      {
		System.out.print(rev[k]);
	      }
	    for(int a=0;a<n;a++)
        {
        	  for(int b=a+1;b<n;b++)
        	  {
        		  int tmp=0;
        		  if(rev[a]>rev[b]) 
        		  {
        			  tmp=rev[a];
        			  rev[a]=rev[b];
        			  rev[b]=tmp;
        		  }
          }
 
        }
	    for(int c=0;c<n;c++) 
	      {
		System.out.print(rev[c]);
	      }
	    
        }
}