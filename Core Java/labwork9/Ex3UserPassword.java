package com.capg.labwork9;
import java.util.function.BiPredicate;
public class Ex3UserPassword {

	public static void main(String[] args) {
		BiPredicate<String, String> fun=(str1, str2)->{
			if(str1.equals("Pankhuri") && str2.equals("123"))
					 return true;
			else
				return false;
			
		};
		boolean a=fun.test("Pankhuri", "123");
		boolean b=fun.test("pankhuri", "345");
		boolean c=fun.test("Pankhuri", "123");
		boolean d=fun.test("pAnkhuri", "789");
		System.out.println(a+" "+b+" "+c+" "+d);


	}

}
