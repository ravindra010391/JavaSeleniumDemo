package com.bitwise.demo.javabasics;

public class JavaMethods {

	/*
	 * Methods in Java 
	 *  definition 
	 *  calling methods 
	 *  passing parameters to methods 
	 *  constructors
	 * https://www.tutorialspoint.com/java/java_methods.htm
	 */
	
	public JavaMethods(){
		System.out.println("Insde contrctor");
	}
	
	
	
	public int add(int a, int b){
		System.out.println("Inside add method - addition p=  "+ (a+b));
		
		return (a+b);
	}
	
	
	
	
	public static void main(String[] args) {
		
		JavaMethods jm = new JavaMethods();
	
		System.out.println("Sum =  " +jm.add(10, 20));
		
		
		
		
	}

}
