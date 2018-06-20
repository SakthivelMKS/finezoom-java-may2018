package com.finezoom.basics;

import java.util.Scanner;

public class PrimeNumber {
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		// variable are initialization
		boolean isPrime = true;
		int number, temp;
		number = sc.nextInt();
		// Logic apply for checking prime number
		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("The Number " + number + "is a Prime ");
		} else {
			System.out.println("The Number " + number + "is not a Prime");

		}
		sc.close();
	}
}
