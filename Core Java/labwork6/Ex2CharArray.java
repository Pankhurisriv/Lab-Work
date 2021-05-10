package com.capg.labwork6;
import java.io.*; 
import java.util.*; 
class Ex2CharArray { 
    static void countChars(char[] arr) 
    { 
         
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
            
  
        for (char c : arr) { 
            if (charCountMap.containsKey(c)) { 
            charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
   charCountMap.put(c, 1); 
            } 
        } 
  
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
  public static void main(String[] args) 
    { 
        String str = "abcabscvg"; 
        char[] arr = str.toCharArray();
       
        countChars(arr); 
    } 

}
