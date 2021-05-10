package com.capg.labwork1;
 import java.util.Scanner ;
 
public class Ex1SumCubes {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		int sum=0, r;
		System.out.println("Enter the number: ");
		number = input.nextInt();
		while(number!=0) {
			r=number%10;
			sum=sum+(r*r*r);
			number=number/10;
		}
		System.out.println(sum);

	}

}
