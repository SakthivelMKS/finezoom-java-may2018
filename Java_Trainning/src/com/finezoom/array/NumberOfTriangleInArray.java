package com.finezoom.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfTriangleInArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int count = 0, firstArraySize;
		System.out.println("Enter the first Array size");
		firstArraySize = scan.nextInt();

		// System.out.println("Enter the Element " + number + " of an Array");
		List<Integer> firstArray = new ArrayList<Integer>();

		// Logic for length of array finding
		for (int i = 0; i < firstArraySize; i++) {
			count++;
			System.out.println("Please enter first array" + count + " number");
			firstArray.add(scan.nextInt());
			
				
		}
		int triangle=IntegerUtils.getTriangle(firstArray);
		System.out.println("follwing number of triangle in Array"+triangle);
	}

}
