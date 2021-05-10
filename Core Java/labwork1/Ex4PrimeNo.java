package com.capg.labwork1;
import java.util.Scanner ;
public class Ex4PrimeNo {

	public static void main(String[] args) {
		int number;
		int a;
		int i=2,j;
		System.out.println("Enter the Number");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		
	for(i=2;i<=number;i++) {
		a=0;
		for(j=1;j<=i;j++) {
			if(i%j==0)
			{
				a++;
			}
		}
		if(a==2) {
			System.out.println(i+" ");
		}
		
		
		
	}

	}
}