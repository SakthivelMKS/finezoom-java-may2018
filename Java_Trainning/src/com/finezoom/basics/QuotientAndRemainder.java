package com.finezoom.basics;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter nuber add:");
		// value assined to the int array
		int digit, divder,quotient;
		digit = scan.nextInt();
		//int array[] = new int[digit];
		
			divder = digit/2;
			quotient=digit%2;
			System.out.println("Divder:" + divder);
			System.out.println("Quotient:" + quotient);
	
			scan.close();
	}

}
