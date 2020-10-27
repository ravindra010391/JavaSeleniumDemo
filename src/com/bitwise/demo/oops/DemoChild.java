package com.bitwise.demo.oops;

public class DemoChild extends DemoParent 
{
	
	public void childMethod(){
		System.out.println("inside child class method");
	}

	
	
	public void methodToBeOverrriden(int a, int b){
		System.out.println("child class method: "+ (a*b));
	}

}
