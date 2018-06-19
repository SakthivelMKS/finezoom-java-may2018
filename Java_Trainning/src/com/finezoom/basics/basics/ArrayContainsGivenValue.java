package com.finezoom.basics.basics;

import java.util.Scanner;

public class ArrayContainsGivenValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int count=0, arraySize = scan.nextInt();
		String searchValue;
		String array[] = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			
			//System.out.println("Please enter the " + position + " String");
			array[i] = scan.next();
		}
		System.out.println("Enter the String For Search in this array");
		searchValue = scan.next();
		String[] matchValue = null;
		for (String value : array) {
			if (searchValue.equals(value)) {
				count++;
				System.out.println("The Value is Avilable int the Array"+value);
				matchValue=new String[] {value};
			} 

		}
		for(String value:matchValue) {
			System.out.println("The Value Occur "+count+"time in the Array"+value);
		}
		scan.close();
	}

}
