package com.capg.labwork1;
import java.util.Scanner;
public class Ex5Sum {
	public static  int calculateSum(int a)
	
	{
       int sum=0;
		for(int i=0; i<=a;i++) 
		{
		if(i%3==0 && i%5==0) 
		{
		sum=sum+i;
		
		}
			
		
		}
		return sum;	
		
	}
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number");
			int n=scan.nextInt();
			calculateSum(n);
			}
			}
