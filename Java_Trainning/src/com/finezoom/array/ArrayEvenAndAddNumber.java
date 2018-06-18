package com.finezoom.array;

import java.util.Scanner;

public class ArrayEvenAndAddNumber {
/**
 This program for finding Number of Add and Even number in array
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int even = 0, odd = 0, position = 0, arraySize = scan.nextInt();

		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
			scan.close();
		}
		for (int value : array) {
			if (value % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("The Array Contain" + odd + "odd Numbers");
		System.out.println("The Array Contain" + even + "even Numbers");
	}

}
