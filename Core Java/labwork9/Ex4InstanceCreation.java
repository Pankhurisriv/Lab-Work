package com.capg.labwork9;
import java.util.function.BiFunction;

 
interface Operation{
	public int sum(int a, int b);
}


public class Ex4InstanceCreation {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> fun=new Math()::Sum;
		Integer sum=fun.apply(5,6);
		System.out.println(sum);
	}
		
	}


class Math{
int a;
int b;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
 public int Sum(int a, int b) {
	 int c=a+b;
	 return c;
	 
 }
	
}


