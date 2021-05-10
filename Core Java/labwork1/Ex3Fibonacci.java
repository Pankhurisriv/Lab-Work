package com.capg.labwork1;
import java.util.Scanner ;

public class Ex3Fibonacci {
	  
public static   void main(String[] args) {

int a=1 , b=1;
int c;
int number;


	Scanner input= new Scanner (System.in);
	System.out.println("Enter the Nth number");
    number=input.nextInt();
   System.out.println(fib(number));
    
    
    
    
	if(number==0)
	{
		System.out.println(a);
	}
	for(int i=2;i<number; i++) {
		c=a+b;
		a=b;
		b=c;
		}
		System.out.println(b);
	}
	   
public static int  fib(int number)
{
	
			if(number<=1) {
			return number;
			}
			return fib(number-1)+fib(number-2);
		
	}


	

}
  


