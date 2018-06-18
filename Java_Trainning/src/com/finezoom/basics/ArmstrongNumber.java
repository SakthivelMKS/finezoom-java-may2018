/**
 * 
 */
package com.finezoom.com;

import java.util.Scanner;

/**
 * @author SakthivelMadhesan
 *
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	// Main Method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number");
		int armstrongValue = 0, remainder, temp;
		int value = scan.nextInt();
		temp = value;
		// It is the number to check armstrong

		while (value > 0) {
			remainder = value % 10;
			value = value / 10;
			armstrongValue = armstrongValue + (remainder * remainder * remainder);
		}
		if (temp == armstrongValue)
			System.out.println("This number Armstrong number");
		else
			System.out.println("This number is Not a armstrong number");
	}

}
