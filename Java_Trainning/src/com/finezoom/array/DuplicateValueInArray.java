package com.finezoom.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int number = scan.nextInt();
		// System.out.println("Enter the Element " + number + " of an Array");
		String[] numbers = new String[number];
		// Logic for length of array finding
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter" + i + " number");
			numbers[i] = scan.next();

		}
		  Set<String> uniquUsers = new HashSet<String>();

	        for (int i = 0; i < numbers.length; i++) {
	            if (!uniquUsers.add(numbers[i]))
	            	//numbers[i] = "Duplicate"; 
	            System.out.println("The value alrady contain this array:"+numbers[i] );
	        }
	        scan.close();
	}

}
