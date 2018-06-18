package com.finezoom.array;


import java.util.Scanner;

public class MissingNumberFromArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int count = 0, arraysize = scan.nextInt();
		int[] intArray = new int[arraysize];
		

		// values are added in the array
		for (int i = 0; i < arraysize; i++) {
			count++;
			System.out.println("Enter the" + count + "index value");

			intArray[i] = scan.nextInt();
		}
		int missingNumber = IntegerUtils.MissingNumber(intArray);
		System.out.println("The Missing Number"+intArray+" of the array"+missingNumber);
		scan.close();
	}

}
