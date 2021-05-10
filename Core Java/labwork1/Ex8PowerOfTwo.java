package com.capg.labwork1;
import java.util.Scanner;

public class Ex8PowerOfTwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		boolean number;
		 number=checkNumber(n);
		System.out.println(number);
          }
	public static boolean checkNumber (int n ){
		
			boolean abc= true;
		 while(n!=1) {
			if(n%2!=0) 
			    abc=false;
			n=n/2;
		       }
		if(n==0) {
			abc=false;
		}
		return abc;
		
		
	}

}
