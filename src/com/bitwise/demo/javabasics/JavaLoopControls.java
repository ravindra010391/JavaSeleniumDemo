package com.bitwise.demo.javabasics;

public class JavaLoopControls {
	/*
	 * while do-while for f or each
	 * https://www.tutorialspoint.com/java/java_loop_control.htm
	 */

	public static void main(String[] args) {
		
		
		int i = 0;
		while (i < 5) {
		System.out.println(i);
		i++;
		}
		
		System.out.println("For loop");
		for(int j =0; j< 5; j++){
			System.out.println(j);
		}
		
		
		int k =0;
		do {
			System.out.println("I am inside do-while loop: " +k);
			k++;
		} while (k<0);
		
		
		System.out.println("------------------");
		
		int[] arr = {1,2,3,4,5};
		
		for(int a = 0; a < arr.length; a++){
			System.out.println(arr[a]);
			
		}
		System.out.println("--------------");

		for(int each: arr){
			System.out.println(each);
		}
		

	}
}
