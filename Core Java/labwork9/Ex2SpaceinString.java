package com.capg.labwork9;
import java.util.function.Consumer;

public class Ex2SpaceinString {


	public static void main(String[] args) {
	Consumer<String> fun=str->System.out.println(str.replace("", " ").trim());
		fun.accept("Pankhuri");
			 
	
}
}
