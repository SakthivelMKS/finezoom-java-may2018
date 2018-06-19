package com.finezoom.basics.array;

import java.util.Scanner;

public class ReverseTheArray {
	//Main method
	public static void main(String[] args) {
		//variable array declarations
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int  number = scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		String[] numbers = new String[number];
		// Logic for length of array finding
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter" + i + " number");
			numbers[i] = scan.next();

		}
		//reverse logic array
		for (int i = numbers.length - 1; i >= 0; i--) {
			String letter = numbers[i];
			System.out.println(letter);
		}
		scan.close();

	}

}
