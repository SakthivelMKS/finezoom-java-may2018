package com.finezoom.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GivenValueEqualToSumOf4Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Boolean key = false;
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
		System.out.println("Enter the value ");

		int value = scan.nextInt();
		for (int i = 0; i < firstArray.size() - 3; i++) {

			for (int j = i + 1; j < firstArray.size() - 2; j++) {

				for (int k = j + 1; k < firstArray.size() - 1; k++) {

					for (int l = k + 1; l < firstArray.size(); l++) {

						int total = firstArray.get(i) + firstArray.get(j) + firstArray.get(k) + firstArray.get(l);

						if (total == value) {
							key = true;

							System.out.println("The value are equal to " + firstArray.get(i) + " " + firstArray.get(j)
									+ " " + firstArray.get(k) + " " + firstArray.get(l));
						}
					}

				}

			}
		}
		if (!key) {
			System.out.println("The array does not contain given value");
		}
	}
}
