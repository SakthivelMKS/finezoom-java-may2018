package com.finezoom.basics.array;

import java.util.Scanner;

public class ArrayEqualtoSortedAndRotated {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[] = new int[scan.nextInt()];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			System.out.println("Enter the" + count + " element of array");
			arr[i] = scan.nextInt();

		}
		System.err.println("Enter the number:");
		int value = scan.nextInt();
		scan.close();
		Boolean succes = IntegerUtils.sum_pair(arr, arr.length, value);
		if (succes) {
            System.out.print("Array has a pair of elements with sum "+value);
		}
        else {
            System.out.print("Array has no pair with sum 42.");
    }
	}

}
