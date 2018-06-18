package com.finezoom.com;

import java.util.Scanner;

public class SumOfGivenDigits {

	public static void main(String[] args) {
		// variable declarations
		int digit, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in add:");
		// value assign to the variable ana array
		digit = s.nextInt();
		// value assined to the int array
		int array[] = new int[digit];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < digit; i++) {
			array[i] = s.nextInt();
			sum = sum + array[i];
		}
		System.out.println("Sum:" + sum);
	}

}
