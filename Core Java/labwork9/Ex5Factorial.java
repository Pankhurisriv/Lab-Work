package com.capg.labwork9;

interface NewInterface {
	int myFunc(int n);

}
public class Ex5Factorial {

	    static int fact(NewInterface newInterface, int n) {
	        return newInterface.myFunc(n);
	    }

	    public static void main(String[] args) {
	        // static method referencing
	        int result = fact(IntOperations::factorial, 4);
	        System.out.println("Factorial = " + result);
	    }
	}
	 
class IntOperations {
	    static int factorial(int n) {
	        int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result = i * result;
	        }
	        return result;
	    }
	}

