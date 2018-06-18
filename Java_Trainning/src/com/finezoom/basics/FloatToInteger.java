package com.finezoom.com;

import java.util.Scanner;

public class FloatToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Variable initialization
		float floatValue;
		int intValue, intValue1;
		System.out.println("Enter the Float value");
		// Value assign to the variable
		floatValue = scan.nextFloat();
		// float value convert to integer for cast way
		intValue = (int) floatValue;
		// float value convert to integer for Math function round way
		intValue1 = Math.round(floatValue);
		System.out.println(intValue);
		System.out.println(intValue1);

	}

}
