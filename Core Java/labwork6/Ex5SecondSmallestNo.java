package com.capg.labwork6;


import java.util.*;
import java.util.Iterator;

public class Ex5SecondSmallestNo {
	 public static void main(String[] args) {

	 Integer array[] = {1,5,8,3,10,20,31,9,12};
	 System.out.println("Second Smallest: "+ getSecondSmallest(array,9));  
	
}
	  
  
	 public static int getSecondSmallest(Integer[] array, int total){  
	 List<Integer> list=Arrays.asList(array);  
	 Collections.sort(list);  
	 int element=list.get(1);  
	 return element;  
	 }  
	 
}
	 