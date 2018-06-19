package com.finezoom.basics.array;

import java.util.Scanner;

public class SumOf10EqualTo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int sum = 0, position = 0, arraySize = scan.nextInt();

		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
		}
		for (int value : array) {
			if ((value == 10)) {
				sum += value;
			}

		}
		if(sum==30) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		scan.close();
	}

}
