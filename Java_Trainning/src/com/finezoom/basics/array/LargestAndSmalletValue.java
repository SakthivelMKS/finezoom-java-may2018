package com.finezoom.basics.array;

import java.util.Scanner;

public class LargestAndSmalletValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int  position = 0, arraySize = scan.nextInt();

		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			array[i] = scan.nextInt();
		}
		int min = array[0], max = array[0], diff;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
			if (array[i] > max)
				max = array[i];
		}
		diff = max - min;
		System.out.println("The Maximum value:"+max);
		System.out.println("The Minimum value:"+min);
		System.out.println("The difference of the lowest and the highest is " + diff);
		scan.close();
	}
	

}
