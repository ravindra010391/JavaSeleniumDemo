package com.bitwise.demo.oops;

public class DemoRunner {

	/*
	 * Class and objects
	 * 
	 * Inheritance: https://www.tutorialspoint.com/java/java_inheritance.htm
	 * 
	 * Polymorphism: Overloading and overriding
	 * https://www.tutorialspoint.com/java/java_polymorphism.htm
	 * Overloading : https://www.javatpoint.com/method-overloading-in-java
	 * Overriding; https://www.javatpoint.com/method-overriding-in-java
	 * 
	 * Exception handling in java
	 * Abtract class
	 * Access specifiers
	 */

public static void main(String[] args) {
	DemoChild dc = new DemoChild();
  
	dc.add(1.2f, 1.5f);
	dc.add(1.2f, 5);
	dc.add(1, 1.2f);
	dc.add(1, 1.2f, 3);
	
	
	//Overrriden methods
	dc.methodToBeOverrriden(1, 5);
	
	int a = 5;
	int b = 0;
	float c;
	
	
	try {
		 c = a/b;
		
	}
	
	finally{
		
		System.out.println("Inside Finally");
	}

	
}
		


	

	
}
