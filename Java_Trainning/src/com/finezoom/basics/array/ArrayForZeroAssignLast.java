package com.finezoom.basics.array;

import java.util.Scanner;

public class ArrayForZeroAssignLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int  arraySize = scan.nextInt();
	
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			
			//System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
		}
		scan.close();
		int []arr=IntegerUtils.sortBasedOnZero(array,array.length);
		System.out.println(arr.toString());
		for(int ar:arr) {
			System.out.print(ar);
		}
	}

}
