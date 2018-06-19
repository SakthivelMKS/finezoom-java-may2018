package com.finezoom.basics.array;

import java.util.Scanner;

public class ArrayRemove {

	public static void main(String[] args) {
		int size, i, count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Array Size : ");
		size = scan.nextInt();
		String del, arr[] = new String[size];
		System.out.print("Enter Array Elements : ");
		for (i = 0; i < size; i++)

		{
			arr[i] = scan.next();
		}

		System.out.print("Enter Element to be Delete : ");
		del = scan.next();
		for (i = 0; i < size; i++) {
			String value = arr[i];
			if (value.equals(del)) {
				for (int j = i; j < (size - 1); j++) {
					arr[j] = arr[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("Element Not Found..!!");
		} else {
			System.out.print("Element Deleted Successfully..!!");
			System.out.print("\nNow the New Array is :\n");
			for (i = 0; i < (size - 1); i++) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}
}
