package com.finezoom.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDuplicateNumberCount {

	public static void main(String[] args) {

		int i, count = 0, arraySize;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array");
		arraySize = sc.nextInt();

		List<Integer> arrayList = new ArrayList<Integer>();

		System.out.println("Enter elements in array");

		for (i = 0; i < arraySize; i++) {
			arrayList.add(sc.nextInt());
			sc.close();
		}
		System.out.println("Sorting Array" + arrayList);
		System.out.println("Enter the Number for searching");
		int number = sc.nextInt();
		for (int j = 0; j < arrayList.size(); j++) {

			if (number == arrayList.get( j)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("The Number " +number+ " occurring "+ count +" times in the Array");
		} else {
			System.out.println("The Number is not contain the array");
		}
	}
}
