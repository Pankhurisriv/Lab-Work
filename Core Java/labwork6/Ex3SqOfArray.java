package com.capg.labwork6;
import java.util.*;

public class Ex3SqOfArray {

		 public static HashMap getSquares(int[] array) {
			    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); //declare a hashmap
			 
			    for (int n: array) {
			      map.put( n, n*n);
			    }
			    return map;
			  }
			 
			  public static void main(String[] args) {
			    int array[] = new int[]{1,5,8,3,10,20,31,9,12};
			    HashMap<Integer, Integer> map = getSquares(array);
			 
			    Iterator<Integer> it = map.keySet().iterator();
			    while(it.hasNext()){
			    Integer key = it.next();
			      System.out.println(key + " : " + map.get(key));
			    }
			  }
			}

	


