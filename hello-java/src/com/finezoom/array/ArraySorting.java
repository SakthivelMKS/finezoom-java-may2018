package com.finezoom.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

		int i, arraySize;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array");

		arraySize = sc.nextInt();

		Integer array[] = new Integer[arraySize];

		System.out.println("Enter elements in array");

		for (i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();

		}
		Arrays.sort(array);
		for (int value : array) {
			System.out.println(value);

		}
		Arrays.sort(array, Collections.reverseOrder());
		for (int value : array)
			System.out.println("Greates integer is" + value);
	}

}
