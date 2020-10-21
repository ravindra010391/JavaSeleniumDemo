package com.bitwise.demo.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {

	/*
	 * Java collection: 
	 * List 
	 * Set
	 * Map
	 * https://www.tutorialspoint.com/java/java_collections.htm 
	 * diagram - https://www.geeksforgeeks.org/collections-in-java-2/
	 */

	
	public static void main(String[] args) {
		
		// List 
		//ArrayList<Integer> mathScore = new ArrayList<>();
		List<Integer> mathScore1 = new ArrayList<>();
		List<Integer> mathScore2 =  new LinkedList<>();
		
		
		mathScore1.add(1);
		mathScore1.add(2);
		mathScore1.add(3);
		mathScore1.add(null);
		mathScore1.add(null);		
		System.out.println(mathScore1);
		
			
		
		//Set
		
		Set<Integer> rollNum = new HashSet<>();
		rollNum.add(2);
		rollNum.add(3);
		rollNum.add(1);
		
		rollNum.add(4);
		rollNum.add(2);
		rollNum.add(null);
		rollNum.add(null);		
		
		System.out.println("Set = " + rollNum);
		 
		rollNum.remove(1);
		
		System.out.println("Set = " + rollNum);
		
		
		
	//MAP 
		// Map can have null keys 
		//Map can not have duplicate keys 
		//Map can duplicate values 
		//Map can have multiple null values 
		
		Map<String, Integer> studentPercentage = new HashMap<>();
		
		studentPercentage.put("A", null);
		studentPercentage.put("B", null);
		studentPercentage.put("C", 70);
		studentPercentage.put(null, 1000);
		studentPercentage.put(null, 2000);
		
		
		
		System.out.println("Map = "+ studentPercentage);
		
		Map<String, HashMap<String, Integer>> StudentDetails = new HashMap<>();
		
		System.out.println("Kayes = "+studentPercentage.keySet());
		
		
		
		
	}
	
}
