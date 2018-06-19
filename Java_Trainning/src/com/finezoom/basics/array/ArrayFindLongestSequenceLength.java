package com.finezoom.basics.array;


import java.util.Scanner;

public class ArrayFindLongestSequenceLength {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int position = 0, arraySize = scan.nextInt();

		int arraylist[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			arraylist[i] = scan.nextInt();
		}
	    
		scan.close();
	    int length=IntegerUtils.longest_sequence(arraylist);
	    System.out.println(length);
	
	}
	}


