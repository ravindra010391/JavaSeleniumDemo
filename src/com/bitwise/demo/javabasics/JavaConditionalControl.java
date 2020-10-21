package com.bitwise.demo.javabasics;

public class JavaConditionalControl {

	/*
	 * if if - else nested if-else switch case
	 * https://www.tutorialspoint.com/java/java_decision_making.htm
	 */

	public static void main(String[] args) {

		int i = 4;

		if (i == 5) {
			System.out.println(" I is 5");
		}

		String browser = "C"; // c,f,i,s

		
		System.out.println("Switch case ");
		switch (browser.toLowerCase()) {
		case "c":
			System.out.println("chrome");
			break;
		case "f":
			System.out.println("FF");
			break;
		case "i":
			System.out.println("IE");
			break;
		case "s":
			System.out.println("Safari");
			break;

		default:
			System.out.println(" Input recieved was not from c,f,i,s. Please specify the correct browser");
			
		}

	}
}
