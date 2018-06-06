package com.finezoom.array;

import java.util.Scanner;

public class FindingCommonElementInTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Array size");
		int avg = 0, sum = 0,secondArraySize, firstArraySize = scan.nextInt();
		System.out.println("Enter the second Array size");
		secondArraySize=scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		String[] firstArray = new String[firstArraySize];
		String[] secondArray = new String[firstArraySize];
		// Logic for length of array finding
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			firstArray[i] = scan.next();

		}
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			secondArray[i] = scan.next();

		}
	}

}
