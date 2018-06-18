package com.finezoom.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySumof1And0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int avg = 0, sum = 0, count = 0, firstArraySize;
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
		for (int i = 0; i < firstArray.size(); i++) {
			for (int j = i+1; j < firstArray.size(); j++) {
				
				if(0==firstArray.get(i)+firstArray.get(j)) {
					System.out.println("The Value are " +firstArray.get(i)+ " and "+firstArray.get(j));
				}
			}
			
		}

	}

}
