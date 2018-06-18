package com.finezoom.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValueInArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int avg = 0, sum = 0, number = scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		int[] numbers = new int[number];
		// Logic for length of array finding
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter" + i + " number");
			numbers[i] = scan.nextInt();

		}
		  Set<Integer> uniquUsers = new HashSet<Integer>();

	        for (int i = 0; i < numbers.length; i++) {
	            if (!uniquUsers.add(numbers[i]))
	            	//numbers[i] = "Duplicate"; 
	            System.out.println("The value alrady contain this array:"+numbers[i] );
	        }

	}

}
