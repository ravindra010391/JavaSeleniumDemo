package com.bitwise.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {

	/*
	 * Java collection: List Set Map
	 * https://www.tutorialspoint.com/java/java_collections.htm diagram
	 * :https://www.geeksforgeeks.org/collections-in-java-2/
	 */

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();

		// Adding elements to the list
		l1.add("Java");
		l1.add("Selenium");
		l1.add("A");

		System.out.println("Array list = " + l1);

		l1.set(1, "MR");
		System.out.println("Array list = " + l1);
		
		System.out.println("Is emplty L1? = " + l1.isEmpty());

		// l1.remove(2);
		// System.out.println("Array list = " +l1);
		// l1.remove("Java");
		// System.out.println("Array list = " +l1);
		
		
		List<String> ll1 = new LinkedList<String>();
		ll1.add("str1");
		ll1.add("str2");
		
		System.out.println(ll1);
		
		
		//SETs
		
		Set<String> hs1 = new HashSet<String>();
		
		hs1.add("addddd");
		hs1.add("ddd");
		System.out.println("Hash set = " + hs1);
		
//		
//		// MAP 
//		It allows duplicate values 
//		It allows null values
//		It do not allows duplicate keys 
//		It allow null as a key or a value
		
		Map<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(1, "A");
		hmap1.put(2, "B");
		hmap1.put(3, "C");
		hmap1.put(4, "C");

		
		
		System.out.println("Hash Map = "+hmap1);
		
		
		

	}
}
