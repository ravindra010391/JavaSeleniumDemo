package com.bitwise.demo.javabasics;

public class JavaStringsAndArrays {

	/*
	 * Nonpreemptive data types: String and string functions
	 * https://www.tutorialspoint.com/java/java_strings.htm
	 * 
	 * Array declaration creating array initializing array parsing array array
	 * methods https://www.tutorialspoint.com/java/java_arrays.htm
	 */

	public static void main(String[] args) {

		String s1 = "This is Test String";
		String s2 = "This is Test String";
		
		
		String[] splitedString = s1.split(" ");

		for(String eachValue: splitedString){
		
			System.out.println(eachValue);
		}

		// Arrays

		// dataType[] arrayName;

		int[] intArray;
		intArray = new int[10];

		intArray[0] = 10;
		// intArray[20] = 20;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 10;
		}
		System.out.println("Printing array values");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

		}

	}
}
