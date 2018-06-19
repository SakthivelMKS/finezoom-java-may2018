package com.finezoom.basics.array;

import java.util.Scanner;

public class RotationCount {

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
		IntegerUtils.rotate(arr,1);
		scan.close();
	}

}
