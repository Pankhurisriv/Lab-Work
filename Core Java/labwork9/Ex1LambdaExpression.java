package com.capg.labwork9;
interface Power{
	int powerofnumber(int x, int y);
}

public class Ex1LambdaExpression {

	public static void main(String[] args) {
	 Power p=(x,y)->{
		 int pow=1;
		for(int i=0;i<y;i++) {
			pow*=x;
			
		}
		return pow;
	 };
	 System.out.println(p.powerofnumber(3,2));

	}

}
