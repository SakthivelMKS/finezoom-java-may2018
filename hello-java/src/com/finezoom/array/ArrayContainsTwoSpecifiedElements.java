package com.finezoom.array;

import java.util.Scanner;

public class ArrayContainsTwoSpecifiedElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int sum = 0, position = 0, arraySize = scan.nextInt();

		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
		}
		for (int value : array) {
			if ((value == 65) || (value == 75)) {
				System.out.println("The array is contain 65 and 75 value");

			} else {
				System.out.println("\"The array is contain 65 and 75 value");
			}

		}
	}

}
