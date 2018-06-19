package com.finezoom.basics.basics;

import java.util.Scanner;

public class LongValueToString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Variable initialization
		Long longValue;
		String stringValue, stringValue1, stringValue2;
		System.out.println("Enter the Float value");
		// Value assign to the variable
		longValue = scan.nextLong();
		// Long value convert to String following way
		stringValue = String.valueOf(longValue);
		stringValue1 = longValue + "";
		stringValue2 = longValue.toString();
		System.out.println(stringValue);
		System.out.println(stringValue1);
		System.out.println(stringValue2);
	
scan.close();
	}

}
