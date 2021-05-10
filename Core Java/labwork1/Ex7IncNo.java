package com.capg.labwork1;
import java.util.Scanner;

public class Ex7IncNo{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		boolean increasingNumber=false;
		System.out.println("Enter the number");
		number= input.nextInt();
		increasingNumber=checkNumber(number);
		System.out.println(increasingNumber);
		}
	public static boolean checkNumber(int number) {
	       boolean inc=false;
		     while(number>0) {
			int n1=number%10;
			number/=10;
			int n2=number%10;
			if(n2<=n1) {
				 inc=true;
		                }
			else {
				inc=false;
				break;
			}
			
			
		}
		return inc;
		
	}

}
