package com.finezoom.array;

import java.util.Scanner;

public class ArrayForZeroAssignLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int count=0,position = 0, arraySize = scan.nextInt();
	
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			//System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
		}
		int []arr=IntegerUtils.sortBasedOnZero(array,array.length);
		System.out.println(arr.toString());
		for(int ar:arr) {
			System.out.print(ar);
		}
	}

}
