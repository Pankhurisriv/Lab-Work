package com.capg.labwork1;

import java.util.Scanner;




public class Ex6Difference {

	public static void main(String[] args) {
		int diff;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		diff=calculateDifference(n);
		System.out.println(diff);

	}
	public static int calculateDifference (int n) 
	{
		int a=0,b=0,sum;
		for(int i=1;i<=n;i++) {
			a=a+(i*i);
			}
		for(int j=1;j<=n;j++) {
			b=b+j;
			}
		sum=a-(b*b);
		
	
	return sum;}

}
