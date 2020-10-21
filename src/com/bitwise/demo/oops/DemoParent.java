package com.bitwise.demo.oops;

public class DemoParent {

	public void parentMethod() {
		System.out.println("Inside parent class method");
	}

	// Overloading

	/*
	 * 1. Based on number of parameters 2. Based on type of parameters
	 * 3.sequence of parameters
	 *  ------> method cannot be overloaded based on return type
	 */

public void add (int a, float b){
	
}

public void add(float a, int b){
	
}

public void add(int a, float b, int c){
	
}


}
