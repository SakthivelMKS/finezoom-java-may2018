package com.finezoom.basics.array;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Array size");
		int  secondArraySize, firstArraySize = scan.nextInt();
		System.out.println("Enter the second Array size");
		secondArraySize = scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		int[] firstArray = new int[firstArraySize];
		int[] secondArray = new int[secondArraySize];
		// Logic for length of array finding
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			firstArray[i] = scan.nextInt();

		}
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Please enter" + i + " number");
			secondArray[i] = scan.nextInt();

		}
		// collectionsWay
		System.out.println("The Collection Way");
		Boolean equals = Arrays.equals(firstArray, secondArray);
		if (equals) {
			System.out.println("The Array equals");
		} else {
			System.out.println("The values are not equal");
		}
		// Manual Way
		System.out.println("The Manual Way");
		Boolean equal = IntegerUtils.equalityOfTwoArrays(firstArray, secondArray);
		if (equal) {
			System.out.println("The Array are equal");
		} else {
			System.out.println("The Array are !equal");
		}
		  scan.close();
	}

}
