package com.capg.labwork6;

	  
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	import java.util.ArrayList;
	import java.util.*; 
	import java.io.*; 
	

	 

	public class Ex1HashMap {

	 

	    public static void main(String[] args) {
	        
	        HashMap<String,String> capitals = new HashMap<> ();
	        capitals.put("India", "New Delhi");
	        capitals.put("US", "Washington");
	        capitals.put("UK", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("France", "Paris");        
	        
	        List<String> list = getValues(capitals);
	        
	        Iterator<String> i = list.iterator();
	        
	        while(i.hasNext()) {
	            String values = i.next();
	            System.out.println(values);
	        }
	    }
	    
	    static List<String> getValues(HashMap<String,String> map) {        
	        
	       
	    	 Set<String> key = map.keySet(); 
	    	 ArrayList<String> Keys  = new ArrayList<String>(key); 
	    	 Set<String> value=map.keySet();
	         
	         ArrayList<String> values 
	             = new ArrayList<String>(value);
	       Collections.sort(values) ;
	        
	       
	        return values;
	        
	    }

	 

	}