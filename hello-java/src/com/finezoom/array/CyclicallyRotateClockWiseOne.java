package com.finezoom.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CyclicallyRotateClockWiseOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0, firstArraySize;
		System.out.println("Enter the first Array size");
		firstArraySize = scan.nextInt();

		// System.out.println("Enter the Element " + number + " of an Array");
		List<Integer> firstArray = new ArrayList<Integer>();
		List<Integer> rotaionalArray = new ArrayList<Integer>();
		// Logic for length of array finding
		for (int i = 0; i < firstArraySize; i++) {
			count++;
			System.out.println("Please enter first array" + count + " number");
			firstArray.add(scan.nextInt());

		}
		StringBuilder buider = new StringBuilder();
		for (Integer integer : firstArray) {
			buider.append(integer);
		}
		System.out.println("BeforeRoation" + buider);
		int x = firstArray.get(firstArray.size() - 1);

		for (int i = 0; i < firstArray.size() - 1; i++) {
			rotaionalArray.add(firstArray.get(i));
		}
		rotaionalArray.add(0, x);
		System.out.println(rotaionalArray.toString());
		StringBuilder buider1 = new StringBuilder();

		for (Integer integer : rotaionalArray) {
			buider1.append(integer);
		}
		System.out.print("AfterRoation;" + buider1);

	}

}
