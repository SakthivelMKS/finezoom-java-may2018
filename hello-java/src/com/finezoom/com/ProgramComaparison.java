package com.finezoom.com;

import java.util.Scanner;

public class ProgramComaparison {
	// main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// variable initialization
		Double firstvalue, secondValue;
		System.out.println("Enter the 1st and 2nd Value");
		// variable getting the values
		firstvalue = scan.nextDouble();
		secondValue = scan.nextDouble();
		// The Values are Comparing
		if (firstvalue > secondValue) {
			System.out.println("The first Value is greater the Second value:" + firstvalue);

		} else {
			System.out.println("The Second Value is greater the first value:" + secondValue);
		}
	}

}
