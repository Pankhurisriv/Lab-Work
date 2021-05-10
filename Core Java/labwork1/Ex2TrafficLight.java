package com.capg.labwork1;

import java.util.Scanner ;

public class Ex2TrafficLight {
	

	public static void main(String[] args) {
	
	String number= null;
		Scanner input=new Scanner(System.in);
  
   System.out.println("R-Red");
   System.out.println("Y-Yellow");  
   System.out.println("G-Green");
   System.out.println("Please select the light (R,Y,G) :");
   
   number=input.nextLine();
	
	switch(number) {
	case "R":
		System.out.println("STOP!!");
		break;
	case "Y":
		System.out.println("READY");
		break;
	case "G":
		System.out.println("GO");
		break;
    default:
			System.out.println("Invalid Input");
			}

}
}
