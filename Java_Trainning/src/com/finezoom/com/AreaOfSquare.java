package com.finezoom.com;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Variable initialization
		int length, area;
		System.out.print("Enter the length: ");
		// Value assign to the variable
		length = in.nextInt();
		// Logic for area of the square
		area = length * length;
		System.out.println("The area of the square is:" + area);
	}

}
