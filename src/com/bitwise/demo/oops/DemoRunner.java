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
		dc.childMethod();
		dc.parentMethod();
		
		
	}

	
}
