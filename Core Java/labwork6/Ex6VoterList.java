package com.capg.labwork6;
import java.io.*;
import java.util.Map;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;

public class Ex6VoterList {

	public static void main(String[] args) {
		
	HashMap<Integer,String>list=new HashMap<>();
	list.put(1,"10-01-2000");
	list.put(2,"15-08-2003");
	list.put(3,"08-11-2011");
	list.put(4,"17-06-1998");
	list.put(5,"10-05-1990");
	ArrayList<Integer> valueList=votersList(list);
		
System.out.println(valueList);
	}
        public static ArrayList<Integer> votersList(HashMap<Integer, String> list) throws Exception
        {
		ArrayList<Integer> voteList=new ArrayList<Integer>();
		for(Map.Entry <Integer, String> entry : list.entrySet())
		{
			SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
			Date date=formatter.prase(entry.getValue());
			Instant instant =date.toInstant();
			ZonedDateTime zone =instant.atZone(ZoneId,.systemDefault());
			LocalDate givenDate=zone.toLocalDate();
			Period period =Period.between(givenDate, LocalDate.now());
			if(period.getYears()>=18)
			{
				voteList.add(entry.getKey());
			}
		}
			return voteList;
		}
	}

