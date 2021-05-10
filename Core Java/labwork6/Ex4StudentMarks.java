package com.capg.labwork6;
import java.util.Map;
import java.util.HashMap;
import java.io.*; 

public class Ex4StudentMarks {
	 public static void main(String[] args) {
		   HashMap<String, Integer> student = new HashMap<> ();
	        student.put("a101", 60);
	        student.put("b102", 70);
	        student.put("c103", 82);
	        student.put("d104",89);
	        student.put("e105",95);
	        
	     HashMap<String, String> val=getStudents(student);
	     for(Map.Entry<String, String> entry: val.entrySet())
	 {
		 System.out.println(entry.getKey() + " "+ entry.getValue());

       }
}
	 static HashMap<String, String> getStudents(HashMap< String, Integer> student)
	 {
		 HashMap<String, String> Scholarship=new HashMap<String, String>();
		 for(Map.Entry< String, Integer> entry : student.entrySet()) 
		 {
			 if(entry.getValue()>=90)
				 Scholarship.put(entry.getKey(), "Gold");
			 else if(entry.getValue()>=80 && entry.getValue()<90)
				 Scholarship.put(entry.getKey(), "Silver");
			 else if(entry.getValue()>=70 && entry.getValue()<80)
				 Scholarship.put(entry.getKey(), "Bronze");
			 else 
				 Scholarship.put(entry.getKey(), null);
		 }
		 return Scholarship;
	 }
}