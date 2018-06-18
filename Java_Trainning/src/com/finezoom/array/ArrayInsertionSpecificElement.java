package com.finezoom.array;

import java.util.Scanner;

public class ArrayInsertionSpecificElement {
	//Main method
	public static void main(String[] args) {
		//variable and array declaration
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		String value;
		int index, count = 0, arraysize = scan.nextInt();
		String stringArray[] = new String[arraysize];
		//values are added in the array
		for (int i = 0; i < stringArray.length; i++) {
			count++;
			System.out.println("Enter the" + count + "index value");
			stringArray[i] = scan.next();
		}
		//Logic for value adding a particular position
		System.out.println("Enter the position for insertion value");
		index = scan.nextInt();
		System.out.println("Enter the position for insertion value");
		value = scan.next();
		stringArray[index] = value;
		System.out.println("After Inserting The Array");
		for (String arr : stringArray) {
			System.out.print(arr);

		}
		scan.close();

	}

}
