package com.finezoom.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
	// Array sum
	public static void main(String[] args) {
		//variable and array declaration
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int sum = 0, number = scan.nextInt();
		System.out.println("Enter the Element " + number + " of an Array");
		int[] numbers = new int[number];
		//Logic for length of array finding
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter" + i + " number");
			numbers[i] = scan.nextInt();

		}
		// sum of array index
		int arraySum = Arrays.stream(numbers).sum();
		System.out.println("Sum of the array" + arraySum);
		// sum of for loop
		for (int index = 0; index < numbers.length; index++) {
			sum += numbers[index];
		}
		System.out.println("for loop sum" + sum);
		// sum for each
		for (int value : numbers) {
			sum += value;
		}

		System.out.println("forEach sum" + sum);

	}

}
