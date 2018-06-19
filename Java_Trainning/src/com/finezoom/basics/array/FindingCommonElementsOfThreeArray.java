package com.finezoom.basics.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindingCommonElementsOfThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int count = 0, secondArraySize, firstArraySize, thirdArraySize;
		System.out.println("Enter the first Array size");
		firstArraySize = scan.nextInt();
		System.out.println("Enter the second Array size");
		secondArraySize = scan.nextInt();
		System.out.println("Enter the third Array size");
		thirdArraySize = scan.nextInt();

		// System.out.println("Enter the Element " + number + " of an Array");
		int[] firstArray = new int[firstArraySize];
		int[] secondArray = new int[secondArraySize];
		int[] thirdArray = new int[thirdArraySize];
		// Logic for length of array finding
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Please enter" + count + " number");
			firstArray[i] = scan.nextInt();

		}
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Please enter" + count + " number");
			secondArray[i] = scan.nextInt();

		}
		for (int i = 0; i < thirdArray.length; i++) {
			System.out.println("Please Enter the " + count + "number");
			thirdArray[i] = scan.nextInt();
		}

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		Arrays.sort(thirdArray);
		int[] common = IntegerUtils.commonElementArray(firstArray, secondArray, thirdArray);
		for (int commonValue : common) {
			System.out.println("commonValue of Three Array" + commonValue);

		}
		  scan.close();
	}

}
