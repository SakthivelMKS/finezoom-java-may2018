package com.finezoom.com;

public class ListofPrimeNumber {

	public static void main(String[] args) {
		int i = 0;
		int number = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (number = i; number >= 1; number--) {
				if (i % number == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
	}
}
