package com.bitwise.demo;

public class StringsAndArrays {

	public static void main(String[] args) {
		
		System.out.println("String in JAVA");
		
		String actual = "This is test string";
		String expected = "This is test STRING";
		
		if(actual.equalsIgnoreCase(expected)){
			System.out.println("Strings are matching!");
		}
		else{
			System.out.println("Strings are not matching");
		}
		
	//Arrays 
		
		int[] intarray = {1,2,3};
		int intarray1[];
		
		intarray1 = new int[5];
		String[] str_arr  = new String[5];
		str_arr[0] ="ff";
		str_arr[0] = "dd";
		
		intarray[1] = 5555;
		
		System.out.println(str_arr[0]);
				
		System.out.println(intarray.length);
		
		
	}
	
}
