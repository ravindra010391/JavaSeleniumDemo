package com.bitwise.demo.oops;

public class DemoParent {

	public void parentMethod() {
		System.out.println("Inside parent class method");
	}

	
	
	// Overloading

	/*
	 * 1. Based on number of parameters 
	 * 2. Based on type of parameters
	 * 3.sequence of parameters
	 *  ------> method cannot be overloaded based on return type
	 */


	public void add(int a, float b){
		System.out.println("add method with int and float");
	}
	
	
	public void add(float a, int b){
		System.out.println("Add method with float and int");
		
	}
	
	public void add (float a, float b){
		System.out.println("add method with float and float");
		
	}
	
	public void add (int a, float b, int c){
		
		System.out.println("add method with int, float and int ");
	}
	
	//Overridding 
	public void methodToBeOverrriden(int a, int b){
		System.out.println("parent class method: "+ (a+b));
		
	}
	


}
